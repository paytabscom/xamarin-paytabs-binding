package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.view.WindowManager;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.CameraUtils;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CameraManager {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "RenderNCamThreadCamera";
    private final Context mAppContext;
    private AutoFocusManager mAutoFocusManager;
    private Camera mCamera;
    private AutoFocusManager.FocusMoveCallback mFocusCallbacks;
    private boolean mIsProcessFramesActive;
    private boolean mIsResumed;
    private ProcessFrameThread.Callbacks mProcessFrameCallbacks;
    private volatile ProcessFrameThread mProcessThread;
    private final RecognitionCore mRecognitionCore;
    private volatile Camera.PreviewCallback mSnapNextFrameCallback;
    private TorchManager mTorchManager;

    public CameraManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mRecognitionCore = RecognitionCore.getInstance(applicationContext);
        this.mIsResumed = true;
        this.mIsProcessFramesActive = true;
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public synchronized boolean isOpen() {
        return this.mCamera != null;
    }

    public Camera.Size getCurrentPreviewSize() {
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getParameters().getPreviewSize();
    }

    public int getSensorOrientation() {
        return CameraUtils.getBackCameraSensorOrientation();
    }

    public int calculateDataRotation() {
        return CameraUtils.getBackCameraDataRotation(((WindowManager) this.mAppContext.getSystemService("window")).getDefaultDisplay());
    }

    public synchronized void openCamera() throws Exception {
        if (this.mCamera != null) {
            releaseCamera();
        }
        openCameraInternal();
        this.mAutoFocusManager = new AutoFocusManager(this.mCamera, this.mFocusCallbacks);
        syncAutofocusManager();
        this.mTorchManager = new TorchManager(this.mRecognitionCore, this.mCamera);
        syncTorchManager();
        syncProcessThread(true);
    }

    public synchronized void releaseCamera() {
        if (DBG) {
            Log.d(TAG, "releaseCamera()");
        }
        stopProcessThread();
        AutoFocusManager autoFocusManager = this.mAutoFocusManager;
        if (autoFocusManager != null) {
            autoFocusManager.stop();
            this.mAutoFocusManager = null;
        }
        TorchManager torchManager = this.mTorchManager;
        if (torchManager != null) {
            torchManager.destroy();
            this.mTorchManager = null;
        }
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
            this.mCamera.stopPreview();
            this.mCamera.release();
            this.mCamera = null;
        }
    }

    public void setAutoFocusCallbacks(AutoFocusManager.FocusMoveCallback focusMoveCallback) {
        this.mFocusCallbacks = focusMoveCallback;
    }

    public void setProcessFrameCallbacks(ProcessFrameThread.Callbacks callbacks) {
        this.mProcessFrameCallbacks = callbacks;
    }

    public void toggleFlash() {
        if (DBG) {
            Log.d(TAG, "toggleFlash()");
        }
        TorchManager torchManager = this.mTorchManager;
        if (torchManager == null) {
            return;
        }
        torchManager.toggleTorch();
    }

    public void requestFocus() {
        if (DBG) {
            Log.d(TAG, "requestFocus()");
        }
        AutoFocusManager autoFocusManager = this.mAutoFocusManager;
        if (autoFocusManager != null) {
            autoFocusManager.requestFocus();
        }
    }

    public synchronized void pause() {
        if (DBG) {
            Log.d(TAG, "pause()");
        }
        if (this.mIsResumed) {
            this.mIsResumed = false;
            syncAutofocusManager();
            syncTorchManager();
            syncProcessThread(false);
        }
    }

    public synchronized void resume() {
        if (DBG) {
            Log.d(TAG, "resume(); is resumed already: " + this.mIsResumed);
        }
        if (this.mIsResumed) {
            return;
        }
        this.mIsResumed = true;
        syncAutofocusManager();
        syncTorchManager();
        syncProcessThread(false);
    }

    public synchronized void resumeProcessFrames() {
        if (DBG) {
            Log.d(TAG, "resumeProcessFrames(); frames processed already: " + this.mIsProcessFramesActive);
        }
        if (this.mIsProcessFramesActive) {
            return;
        }
        this.mIsProcessFramesActive = true;
        syncAutofocusManager();
        syncTorchManager();
        syncProcessThread(false);
    }

    public synchronized void pauseProcessFrames() {
        if (this.mIsProcessFramesActive) {
            this.mIsProcessFramesActive = false;
            syncAutofocusManager();
            syncTorchManager();
            syncProcessThread(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startPreview(SurfaceTexture surfaceTexture) throws IOException, RuntimeException {
        boolean z2 = DBG;
        if (z2) {
            Log.d(TAG, "startPreview() called with: texture = [" + surfaceTexture + "]");
        }
        try {
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.setPreviewTexture(surfaceTexture);
                this.mCamera.startPreview();
            } else if (z2) {
                Log.e(TAG, "Camera is not opened. Skip startPreview()");
            }
        } catch (IOException | RuntimeException e2) {
            releaseCamera();
            throw e2;
        }
    }

    private void openCameraInternal() throws Exception {
        if (this.mCamera != null) {
            releaseCamera();
        }
        try {
            Camera open = Camera.open();
            this.mCamera = open;
            Camera.Parameters parameters = open.getParameters();
            CameraUtils.NativeSupportedSize findBestCameraSupportedSize = CameraUtils.findBestCameraSupportedSize(parameters.getSupportedPreviewSizes());
            if (findBestCameraSupportedSize == CameraUtils.NativeSupportedSize.RESOLUTION_NO_CAMERA) {
                throw new RecognitionUnavailableException(3);
            }
            parameters.setPreviewSize(findBestCameraSupportedSize.size.width, findBestCameraSupportedSize.size.height);
            parameters.setPreviewFormat(842094169);
            CameraConfigurationUtils.setBestExposure(parameters, false);
            CameraConfigurationUtils.initWhiteBalance(parameters);
            CameraConfigurationUtils.initAutoFocus(parameters);
            CameraConfigurationUtils.setMetering(parameters);
            this.mCamera.setParameters(parameters);
        } catch (Exception e2) {
            if (DBG) {
                Log.e(TAG, "startCamera() error: ", e2);
            }
            releaseCamera();
            throw e2;
        }
    }

    private synchronized boolean isTorchManagerShouldBeActive() {
        boolean z2;
        if (this.mCamera != null && this.mIsResumed) {
            z2 = this.mIsProcessFramesActive;
        }
        return z2;
    }

    private boolean isAutofocusShouldBeActive() {
        return this.mCamera != null && this.mIsResumed;
    }

    private synchronized void syncTorchManager() {
        if (this.mTorchManager != null) {
            if (isTorchManagerShouldBeActive()) {
                this.mTorchManager.resume();
            } else {
                this.mTorchManager.pause();
            }
        }
    }

    private synchronized void syncAutofocusManager() {
        if (this.mAutoFocusManager != null) {
            if (isAutofocusShouldBeActive()) {
                this.mAutoFocusManager.start();
            } else {
                this.mAutoFocusManager.stop();
            }
        }
    }

    private synchronized void syncProcessThread(boolean z2) {
        if (this.mIsResumed && this.mIsProcessFramesActive && this.mCamera != null) {
            if (z2 || this.mProcessThread == null) {
                startProcessThread();
            }
        } else if (this.mProcessThread != null) {
            stopProcessThread();
        }
    }

    private synchronized void startProcessThread() {
        if (this.mCamera == null) {
            if (DBG) {
                Log.e(TAG, "Camera is not opened. Skip startProcessThread()");
            }
            return;
        }
        stopProcessThread();
        this.mProcessThread = new ProcessFrameThread(this.mAppContext, this.mCamera, new ProcessFrameThread.Callbacks() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.CameraManager.1
            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread.Callbacks
            public void onFrameProcessed(int i2) {
                if (CameraManager.this.mProcessFrameCallbacks != null) {
                    CameraManager.this.mProcessFrameCallbacks.onFrameProcessed(i2);
                }
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread.Callbacks
            public void onFpsReport(String str) {
                if (CameraManager.this.mProcessFrameCallbacks != null) {
                    CameraManager.this.mProcessFrameCallbacks.onFpsReport(str);
                }
            }
        });
        this.mProcessThread.start();
        final ProcessFrameThread processFrameThread = this.mProcessThread;
        this.mCamera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.CameraManager.2
            Camera.PreviewCallback singleFrameCallback;

            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (CameraManager.this.mCamera == null) {
                    return;
                }
                if (CameraManager.DBG) {
                    this.singleFrameCallback = CameraManager.this.mSnapNextFrameCallback;
                    CameraManager.this.mSnapNextFrameCallback = null;
                    Camera.PreviewCallback previewCallback = this.singleFrameCallback;
                    if (previewCallback != null) {
                        previewCallback.onPreviewFrame(bArr, camera);
                    }
                }
                processFrameThread.processFrame(bArr);
            }
        });
        Camera.Size previewSize = this.mCamera.getParameters().getPreviewSize();
        for (int i2 = 0; i2 < 3; i2++) {
            this.mCamera.addCallbackBuffer(new byte[((previewSize.width * previewSize.height) * 3) / 2]);
        }
    }

    private synchronized void stopProcessThread() {
        if (DBG) {
            Log.d(TAG, "stopProcessThread()");
        }
        if (this.mProcessThread != null) {
            this.mProcessThread.setActive(false);
            this.mProcessThread = null;
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.setPreviewCallbackWithBuffer(null);
            }
        }
    }
}