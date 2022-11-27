package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RenderThread;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CardDetectionStateView;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.DisplayConfigurationImpl;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ScanManager {
    private static final boolean DBG = Constants.DEBUG;
    private static final int DEFAULT_RECOGNITION_MODE = 15;
    private static final String TAG = "ScanManager";
    private static SurfaceHolder sSurfaceHolder;
    private final Context mAppContext;
    private final Callbacks mCallbacks;
    private final DisplayConfigurationImpl mDisplayConfiguration;
    private ScanManagerHandler mHandler;
    private CameraPreviewLayout mPreviewLayout;
    private RecognitionCore mRecognitionCore;
    private final int mRecognitionMode;
    private final RecognitionStatusListener mRecognitionStatusListener;
    private RenderThread mRenderThread;
    private final SensorEventListener mShakeEventListener;
    private final WindowRotationListener mWindowRotationListener;

    /* loaded from: classes.dex */
    public interface Callbacks {
        void onAutoFocusComplete(boolean z2, String str);

        void onAutoFocusMoving(boolean z2, String str);

        void onCameraOpened(Camera.Parameters parameters);

        void onCardImageReceived(Bitmap bitmap);

        void onFpsReport(String str);

        void onOpenCameraError(Exception exc);

        void onRecognitionComplete(RecognitionResult recognitionResult);
    }

    public ScanManager(Context context, CameraPreviewLayout cameraPreviewLayout, Callbacks callbacks) {
        this(15, context, cameraPreviewLayout, callbacks);
    }

    public ScanManager(int i2, Context context, CameraPreviewLayout cameraPreviewLayout, Callbacks callbacks) throws RuntimeException {
        this.mRecognitionStatusListener = new RecognitionStatusListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.4
            private long mRecognitionCompleteTs;

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener
            public void onRecognitionComplete(RecognitionResult recognitionResult) {
                ScanManager.this.getCardDetectionStateView().setRecognitionResult(recognitionResult);
                if (recognitionResult.isFirst()) {
                    if (ScanManager.this.mRenderThread != null) {
                        ScanManager.this.mRenderThread.getHandler().sendPauseProcessFrames();
                    }
                    ScanManager.this.getCardDetectionStateView().setDetectionState(15);
                    if (ScanManager.DBG) {
                        this.mRecognitionCompleteTs = System.nanoTime();
                    }
                }
                if (recognitionResult.isFinal()) {
                    long nanoTime = System.nanoTime();
                    if (ScanManager.DBG) {
                        Log.v(ScanManager.TAG, String.format(Locale.US, "Final result received after %.3f ms", Float.valueOf(((float) (nanoTime - this.mRecognitionCompleteTs)) / 1000000.0f)));
                    }
                }
                ScanManager.this.mCallbacks.onRecognitionComplete(recognitionResult);
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener
            public void onCardImageReceived(Bitmap bitmap) {
                if (ScanManager.DBG) {
                    Log.v(ScanManager.TAG, String.format(Locale.US, "Card image received after %.3f ms", Float.valueOf(((float) (System.nanoTime() - this.mRecognitionCompleteTs)) / 1000000.0f)));
                }
                ScanManager.this.mCallbacks.onCardImageReceived(bitmap);
            }
        };
        this.mShakeEventListener = new SensorEventListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.5
            private static final double SHAKE_THRESHOLD = 3.3d;
            public double[] gravity = new double[3];
            long lastUpdate;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i3) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                long currentTimeMillis = System.currentTimeMillis();
                if (500 < currentTimeMillis - this.lastUpdate) {
                    this.lastUpdate = currentTimeMillis;
                    double[] dArr = this.gravity;
                    dArr[0] = (dArr[0] * 0.800000011920929d) + (sensorEvent.values[0] * 0.19999999f);
                    double[] dArr2 = this.gravity;
                    dArr2[1] = (dArr2[1] * 0.800000011920929d) + (sensorEvent.values[1] * 0.19999999f);
                    double[] dArr3 = this.gravity;
                    dArr3[2] = (dArr3[2] * 0.800000011920929d) + (sensorEvent.values[2] * 0.19999999f);
                    double d2 = sensorEvent.values[0] - this.gravity[0];
                    double d3 = sensorEvent.values[1] - this.gravity[1];
                    double d4 = sensorEvent.values[2] - this.gravity[2];
                    if (SHAKE_THRESHOLD >= Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4)) || ScanManager.this.mRenderThread == null) {
                        return;
                    }
                    if (ScanManager.DBG) {
                        Log.d(ScanManager.TAG, "shake focus request");
                    }
                    ScanManager.this.mRenderThread.getHandler().sendRequestFocus();
                }
            }
        };
        this.mRecognitionMode = i2 == 0 ? 15 : i2;
        Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mCallbacks = callbacks;
        this.mPreviewLayout = cameraPreviewLayout;
        this.mRecognitionCore = RecognitionCore.getInstance(applicationContext);
        this.mHandler = new ScanManagerHandler(this);
        Display display = getDisplay();
        DisplayConfigurationImpl displayConfigurationImpl = new DisplayConfigurationImpl();
        this.mDisplayConfiguration = displayConfigurationImpl;
        displayConfigurationImpl.setCameraParameters(CameraUtils.getBackCameraSensorOrientation());
        displayConfigurationImpl.setDisplayParameters(display);
        this.mRecognitionCore.setDisplayConfiguration(displayConfigurationImpl);
        getSurfaceView().getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (ScanManager.DBG) {
                    Log.d(ScanManager.TAG, "SurfaceView  surfaceCreated holder=" + surfaceHolder + " (static=" + ScanManager.sSurfaceHolder + ")");
                }
                if (ScanManager.sSurfaceHolder == null) {
                    SurfaceHolder unused = ScanManager.sSurfaceHolder = surfaceHolder;
                    if (ScanManager.this.mRenderThread == null) {
                        if (ScanManager.DBG) {
                            Log.d(ScanManager.TAG, "render thread not running");
                            return;
                        }
                        return;
                    }
                    ScanManager.this.mRenderThread.getHandler().sendSurfaceAvailable(surfaceHolder, true);
                    return;
                }
                throw new RuntimeException("sSurfaceHolder is already set");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                if (ScanManager.DBG) {
                    Log.d(ScanManager.TAG, "SurfaceView surfaceChanged fmt=" + i3 + " size=" + i4 + "x" + i5 + " holder=" + surfaceHolder);
                }
                if (ScanManager.this.mRenderThread == null) {
                    if (ScanManager.DBG) {
                        Log.d(ScanManager.TAG, "Ignoring surfaceChanged");
                        return;
                    }
                    return;
                }
                ScanManager.this.mRenderThread.getHandler().sendSurfaceChanged(i3, i4, i5);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (ScanManager.this.mRenderThread != null) {
                    ScanManager.this.mRenderThread.getHandler().sendSurfaceDestroyed();
                }
                if (ScanManager.DBG) {
                    Log.d(ScanManager.TAG, "SurfaceView surfaceDestroyed holder=" + surfaceHolder);
                }
                SurfaceHolder unused = ScanManager.sSurfaceHolder = null;
            }
        });
        this.mWindowRotationListener = new WindowRotationListener();
    }

    public void onResume() {
        boolean z2 = DBG;
        if (z2) {
            Log.d(TAG, "onResume()");
        }
        RenderThread renderThread = new RenderThread(this.mAppContext, this.mHandler);
        this.mRenderThread = renderThread;
        renderThread.setName("Camera thread");
        this.mRenderThread.start();
        this.mRenderThread.waitUntilReady();
        RenderThread.RenderHandler handler = this.mRenderThread.getHandler();
        if (sSurfaceHolder != null) {
            if (z2) {
                Log.d(TAG, "Sending previous surface");
            }
            handler.sendSurfaceAvailable(sSurfaceHolder, false);
        } else if (z2) {
            Log.d(TAG, "No previous surface");
        }
        this.mDisplayConfiguration.setCameraParameters(CameraUtils.getBackCameraSensorOrientation());
        this.mRecognitionCore.setRecognitionMode(this.mRecognitionMode);
        this.mRecognitionCore.setStatusListener(this.mRecognitionStatusListener);
        this.mRecognitionCore.resetResult();
        RenderThread.RenderHandler handler2 = this.mRenderThread.getHandler();
        handler2.sendOrientationChanged(CameraUtils.getBackCameraDataRotation(getDisplay()));
        handler2.sendUnfreeze();
        this.mPreviewLayout.setOnWindowFocusChangedListener(new OnWindowFocusChangedListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.2
            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener
            public void onWindowFocusChanged(View view, boolean z3) {
                if (z3) {
                    ScanManager.this.setRecognitionCoreIdle(false);
                } else {
                    ScanManager.this.setRecognitionCoreIdle(true);
                }
            }
        });
        startShakeDetector();
        this.mWindowRotationListener.register(this.mAppContext, getDisplay(), new WindowRotationListener.RotationListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.3
            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.RotationListener
            public void onWindowRotationChanged() {
                ScanManager.this.refreshDisplayOrientation();
            }
        });
        getCardDetectionStateView().setRecognitionResult(RecognitionResult.empty());
        setRecognitionCoreIdle(false);
    }

    public void onPause() {
        if (DBG) {
            Log.d(TAG, "onPause()");
        }
        setRecognitionCoreIdle(true);
        stopShakeDetector();
        this.mPreviewLayout.setOnWindowFocusChangedListener(null);
        this.mRecognitionCore.setStatusListener(null);
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            renderThread.getHandler().sendShutdown();
            try {
                this.mRenderThread.join();
            } catch (InterruptedException e2) {
                Callbacks callbacks = this.mCallbacks;
                if (callbacks != null) {
                    callbacks.onOpenCameraError(e2);
                }
            }
            this.mRenderThread = null;
        }
        this.mWindowRotationListener.unregister();
    }

    public void resumeScan() {
        setRecognitionCoreIdle(false);
    }

    public void toggleFlash() {
        RenderThread renderThread = this.mRenderThread;
        if (renderThread == null) {
            return;
        }
        renderThread.getHandler().sendToggleFlash();
    }

    private SurfaceView getSurfaceView() {
        return this.mPreviewLayout.getSurfaceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CardDetectionStateView getCardDetectionStateView() {
        return this.mPreviewLayout.getDetectionStateOverlay();
    }

    private Display getDisplay() {
        return ((WindowManager) this.mAppContext.getSystemService("window")).getDefaultDisplay();
    }

    public void resetResult() {
        if (DBG) {
            Log.d(TAG, "resetResult()");
        }
        this.mRecognitionCore.resetResult();
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            renderThread.getHandler().sendResumeProcessFrames();
        }
        unfreezeCameraPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshDisplayOrientation() {
        if (DBG) {
            Log.d(TAG, "refreshDisplayOrientation()");
        }
        Display display = getDisplay();
        this.mDisplayConfiguration.setDisplayParameters(display);
        this.mRecognitionCore.setDisplayConfiguration(this.mDisplayConfiguration);
        if (this.mRenderThread != null) {
            this.mRenderThread.getHandler().sendOrientationChanged(CameraUtils.getBackCameraDataRotation(display));
        }
    }

    public void setRecognitionCoreIdle(boolean z2) {
        if (DBG) {
            Log.d(TAG, "setRecognitionCoreIdle() called with: idle = [" + z2 + "]");
        }
        this.mRecognitionCore.setIdle(z2);
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            if (z2) {
                renderThread.getHandler().sendPauseCamera();
            } else {
                renderThread.getHandler().sendResumeCamera();
            }
        }
    }

    private void setupCardDetectionCameraParameters(int i2, int i3) {
        this.mPreviewLayout.setCameraParameters(i2, i3, CameraUtils.getBackCameraDataRotation(getDisplay()), OrientationHelper.rotateRect(this.mRecognitionCore.getCardFrameRect(), CameraUtils.CAMERA_RESOLUTION.size.height, CameraUtils.CAMERA_RESOLUTION.size.width, 90, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onCameraOpened(Camera.Parameters parameters) {
        Camera.Size previewSize = parameters.getPreviewSize();
        setupCardDetectionCameraParameters(previewSize.width, previewSize.height);
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onCameraOpened(parameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onOpenCameraError(Exception exc) {
        if (DBG) {
            Log.d(TAG, "onOpenCameraError() called with: e = [" + exc + "]");
        }
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onOpenCameraError(exc);
        }
        this.mRenderThread = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onRenderThreadError(Throwable th) {
        if (DBG) {
            Log.d(TAG, "onRenderThreadError() called with: e = [" + th + "]");
        }
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onOpenCameraError((Exception) th);
        }
        this.mRenderThread = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFrameProcessed(int i2) {
        if (this.mCallbacks != null) {
            this.mPreviewLayout.getDetectionStateOverlay().setDetectionState(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFpsReport(String str) {
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onFpsReport(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAutoFocusMoving(boolean z2, String str) {
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onAutoFocusMoving(z2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAutoFocusComplete(boolean z2, String str) {
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.onAutoFocusComplete(z2, str);
        }
    }

    public void freezeCameraPreview() {
        if (DBG) {
            Log.d(TAG, "freezeCameraPreview() called with: ");
        }
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            renderThread.getHandler().sendFreeze();
        }
    }

    public void unfreezeCameraPreview() {
        if (DBG) {
            Log.d(TAG, "unfreezeCameraPreview() called with: ");
        }
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            renderThread.getHandler().sendUnfreeze();
        }
    }

    private void startShakeDetector() {
        SensorManager sensorManager = (SensorManager) this.mAppContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            sensorManager.registerListener(this.mShakeEventListener, defaultSensor, 1);
        }
    }

    private void stopShakeDetector() {
        ((SensorManager) this.mAppContext.getSystemService("sensor")).unregisterListener(this.mShakeEventListener);
    }
}