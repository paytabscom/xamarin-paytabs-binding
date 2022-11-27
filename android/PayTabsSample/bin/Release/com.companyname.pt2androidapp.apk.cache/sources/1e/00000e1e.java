package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.Drawable2d;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.EglCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.GlUtil;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.Sprite2d;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.Texture2dProgram;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.WindowSurface;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class RenderThread extends Thread {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "RenderNCameraThread";
    private final Context mAppContext;
    private CameraManager mCameraManager;
    private int mCameraRotation;
    private SurfaceTexture mCameraTexture;
    private EglCore mEglCore;
    private volatile RenderHandler mHandler;
    private ScanManagerHandler mMainHandler;
    private volatile boolean mOnFreeze;
    private float mPosX;
    private float mPosY;
    private Texture2dProgram mTexProgram;
    private WindowSurface mWindowSurface;
    private int mWindowSurfaceHeight;
    private int mWindowSurfaceWidth;
    private final Object mStartLock = new Object();
    private boolean mReady = false;
    private final Sprite2d mRect = new Sprite2d(new Drawable2d());
    private float[] mDisplayProjectionMatrix = new float[16];
    private int mCameraPreviewWidth = 1280;
    private int mCameraPreviewHeight = 720;

    public RenderThread(Context context, ScanManagerHandler scanManagerHandler) {
        this.mMainHandler = scanManagerHandler;
        this.mAppContext = context.getApplicationContext();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        boolean z2 = DBG;
        if (z2) {
            Log.d(TAG, "Thread started. TID: " + Thread.currentThread().getId());
        }
        this.mHandler = new RenderHandler(this);
        synchronized (this.mStartLock) {
            this.mReady = true;
            this.mStartLock.notify();
        }
        try {
            this.mEglCore = new EglCore(null, 0);
            CameraManager cameraManager = new CameraManager(this.mAppContext);
            this.mCameraManager = cameraManager;
            cameraManager.openCamera();
            this.mCameraManager.setProcessFrameCallbacks(new ProcessFrameThread.Callbacks() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RenderThread.1
                @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread.Callbacks
                public void onFrameProcessed(int i2) {
                    RenderThread.this.mMainHandler.sendFrameProcessed(i2);
                }

                @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ProcessFrameThread.Callbacks
                public void onFpsReport(String str) {
                    RenderThread.this.mMainHandler.sendFpsResport(str);
                }
            });
            this.mCameraManager.setAutoFocusCallbacks(new AutoFocusManager.FocusMoveCallback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RenderThread.2
                @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusMoveCallback
                public void onAutoFocusMoving(boolean z3, Camera camera) {
                    RenderThread.this.mMainHandler.sendAutoFocusMoving(z3, camera.getParameters().getFocusMode());
                }

                @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusMoveCallback
                public void onAutoFocusComplete(boolean z3, Camera camera) {
                    RenderThread.this.mMainHandler.sendAutoFocusComplete(z3, camera.getParameters().getFocusMode());
                }
            });
            Camera.Size currentPreviewSize = this.mCameraManager.getCurrentPreviewSize();
            this.mCameraPreviewWidth = currentPreviewSize.width;
            this.mCameraPreviewHeight = currentPreviewSize.height;
            this.mCameraRotation = this.mCameraManager.calculateDataRotation();
            this.mMainHandler.sendCameraOpened(this.mCameraManager.getCamera().getParameters());
            try {
                Looper.loop();
                if (z2) {
                    Log.d(TAG, "looper quit");
                }
                this.mCameraManager.releaseCamera();
                releaseGl();
                this.mEglCore.release();
                if (z2) {
                    Log.d(TAG, "Thread finished. TID: " + Thread.currentThread().getId());
                }
                synchronized (this.mStartLock) {
                    this.mReady = false;
                }
            } catch (Throwable th) {
                try {
                    this.mMainHandler.sendRenderThreadError(th);
                    if (DBG) {
                        Log.d(TAG, "looper quit");
                    }
                    this.mCameraManager.releaseCamera();
                    releaseGl();
                    this.mEglCore.release();
                    if (DBG) {
                        Log.d(TAG, "Thread finished. TID: " + Thread.currentThread().getId());
                    }
                    synchronized (this.mStartLock) {
                        this.mReady = false;
                    }
                } catch (Throwable th2) {
                    boolean z3 = DBG;
                    if (z3) {
                        Log.d(TAG, "looper quit");
                    }
                    this.mCameraManager.releaseCamera();
                    releaseGl();
                    this.mEglCore.release();
                    if (z3) {
                        Log.d(TAG, "Thread finished. TID: " + Thread.currentThread().getId());
                    }
                    synchronized (this.mStartLock) {
                        this.mReady = false;
                        throw th2;
                    }
                }
            }
        } catch (Exception e2) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
            EglCore eglCore = this.mEglCore;
            if (eglCore != null) {
                eglCore.release();
            }
            this.mMainHandler.sendOpenCameraError(e2);
            if (DBG) {
                Log.d(TAG, "Thread finished. TID: " + Thread.currentThread().getId());
            }
            synchronized (this.mStartLock) {
                this.mReady = false;
                this.mStartLock.notify();
            }
        }
    }

    public void waitUntilReady() {
        synchronized (this.mStartLock) {
            while (!this.mReady) {
                try {
                    this.mStartLock.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        if (DBG) {
            Log.d(TAG, "shutdown()");
        }
        this.mCameraManager.releaseCamera();
        Looper.myLooper().quit();
    }

    public RenderHandler getHandler() {
        return this.mHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceAvailable(SurfaceHolder surfaceHolder, boolean z2) {
        if (DBG) {
            Log.d(TAG, "surfaceAvailable() called with: holder = [" + surfaceHolder + "], newSurface = [" + z2 + "]");
        }
        WindowSurface windowSurface = new WindowSurface(this.mEglCore, surfaceHolder, false);
        this.mWindowSurface = windowSurface;
        windowSurface.makeCurrent();
        Texture2dProgram texture2dProgram = new Texture2dProgram();
        this.mTexProgram = texture2dProgram;
        int createTextureObject = texture2dProgram.createTextureObject();
        this.mCameraTexture = new SurfaceTexture(createTextureObject);
        this.mRect.setTexture(createTextureObject);
        if (!z2) {
            this.mWindowSurfaceWidth = this.mWindowSurface.getWidth();
            this.mWindowSurfaceHeight = this.mWindowSurface.getHeight();
            finishSurfaceSetup();
        }
        this.mCameraTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RenderThread.3
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                RenderThread.this.mHandler.sendFrameAvailable();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void frameAvailable() {
        this.mCameraTexture.updateTexImage();
        draw();
    }

    private void releaseGl() {
        GlUtil.checkGlError("releaseGl start");
        WindowSurface windowSurface = this.mWindowSurface;
        if (windowSurface != null) {
            windowSurface.release();
            this.mWindowSurface = null;
        }
        Texture2dProgram texture2dProgram = this.mTexProgram;
        if (texture2dProgram != null) {
            texture2dProgram.release();
            this.mTexProgram = null;
        }
        GlUtil.checkGlError("releaseGl done");
        this.mEglCore.makeNothingCurrent();
    }

    void surfaceChanged(int i2, int i3) {
        if (DBG) {
            Log.d(TAG, "RenderThread surfaceChanged " + i2 + "x" + i3);
        }
        this.mWindowSurfaceWidth = i2;
        this.mWindowSurfaceHeight = i3;
        finishSurfaceSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orientationChanged(int i2) {
        if (DBG) {
            Log.d(TAG, "orientationChanged() called with: rotation = [" + i2 + "]");
        }
        this.mCameraRotation = i2;
        updateGeometry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freeze() {
        if (DBG) {
            Log.d(TAG, "freeze()");
        }
        this.mOnFreeze = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unfreeze() {
        if (DBG) {
            Log.d(TAG, "unfreeze()");
        }
        this.mOnFreeze = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceDestroyed() {
        if (DBG) {
            Log.d(TAG, "surfaceDestroyed()");
        }
        releaseGl();
    }

    private void finishSurfaceSetup() {
        int i2 = this.mWindowSurfaceWidth;
        int i3 = this.mWindowSurfaceHeight;
        boolean z2 = DBG;
        if (z2) {
            Log.d(TAG, "finishSurfaceSetup size=" + i2 + "x" + i3 + " camera=" + this.mCameraPreviewWidth + "x" + this.mCameraPreviewHeight);
        }
        GLES20.glViewport(0, 0, i2, i3);
        float f2 = i2;
        float f3 = i3;
        Matrix.orthoM(this.mDisplayProjectionMatrix, 0, 0.0f, f2, 0.0f, f3, -1.0f, 1.0f);
        this.mPosX = f2 / 2.0f;
        this.mPosY = f3 / 2.0f;
        updateGeometry();
        if (z2) {
            Log.d(TAG, "starting camera preview");
        }
        try {
            this.mCameraManager.startPreview(this.mCameraTexture);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void updateGeometry() {
        int i2;
        int i3;
        int i4 = this.mCameraPreviewWidth;
        int i5 = this.mCameraPreviewHeight;
        if (this.mCameraRotation % 180 == 0) {
            i2 = this.mWindowSurfaceWidth;
            i3 = this.mWindowSurfaceHeight;
        } else {
            i2 = this.mWindowSurfaceHeight;
            i3 = this.mWindowSurfaceWidth;
        }
        int i6 = i4 * i3;
        int i7 = i5 * i2;
        if (i6 > i7) {
            i2 = (int) ((i6 / i5) + 0.5f);
        } else {
            i3 = (int) ((i7 / i4) + 0.5f);
        }
        this.mRect.setScale(i2, i3);
        this.mRect.setPosition(this.mPosX, this.mPosY);
        this.mRect.setRotation((360 - this.mCameraRotation) % 360);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draw() {
        if (this.mOnFreeze) {
            return;
        }
        GlUtil.checkGlError("draw start");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        this.mRect.draw(this.mTexProgram, this.mDisplayProjectionMatrix);
        this.mWindowSurface.swapBuffers();
        GlUtil.checkGlError("draw done");
    }

    /* loaded from: classes.dex */
    static class RenderHandler extends Handler {
        private static final int MSG_FRAME_AVAILABLE = 4;
        private static final int MSG_FREEZE = 17;
        private static final int MSG_ORIENTATION_CHANGED = 5;
        private static final int MSG_PAUSE_CAMERA = 10;
        private static final int MSG_PAUSE_PROCESS_FRAMES = 12;
        private static final int MSG_REDRAW = 9;
        private static final int MSG_REQUEST_FOCUS = 16;
        private static final int MSG_RESUME_CAMERA = 11;
        private static final int MSG_RESUME_PROCESS_FRAMES = 14;
        private static final int MSG_SHUTDOWN = 3;
        private static final int MSG_SURFACE_AVAILABLE = 0;
        private static final int MSG_SURFACE_CHANGED = 1;
        private static final int MSG_SURFACE_DESTROYED = 2;
        private static final int MSG_TOGGLE_FLASH = 15;
        private static final int MSG_UNFREEZE = 18;
        private WeakReference<RenderThread> mWeakRenderThread;

        public RenderHandler(RenderThread renderThread) {
            this.mWeakRenderThread = new WeakReference<>(renderThread);
        }

        public void sendSurfaceAvailable(SurfaceHolder surfaceHolder, boolean z2) {
            sendMessage(obtainMessage(0, z2 ? 1 : 0, 0, surfaceHolder));
        }

        public void sendSurfaceChanged(int i2, int i3, int i4) {
            sendMessage(obtainMessage(1, i3, i4));
        }

        public void sendSurfaceDestroyed() {
            sendMessage(obtainMessage(2));
        }

        public void sendShutdown() {
            sendMessage(obtainMessage(3));
        }

        public void sendFrameAvailable() {
            sendMessage(obtainMessage(4));
        }

        public void sendOrientationChanged(int i2) {
            sendMessage(obtainMessage(5, i2, 0));
        }

        public void sendUnfreeze() {
            sendMessage(obtainMessage(18));
        }

        public void sendFreeze() {
            sendMessage(obtainMessage(17));
        }

        public void sendRequestFocus() {
            sendMessage(obtainMessage(16));
        }

        public void sendPauseCamera() {
            sendMessage(obtainMessage(10));
        }

        public void sendResumeCamera() {
            sendMessage(obtainMessage(11));
        }

        public void sendPauseProcessFrames() {
            sendMessage(obtainMessage(12));
        }

        public void sendResumeProcessFrames() {
            sendMessage(obtainMessage(14));
        }

        public void sendRedraw() {
            sendMessage(obtainMessage(9));
        }

        public void sendToggleFlash() {
            sendMessage(obtainMessage(15));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            RenderThread renderThread = this.mWeakRenderThread.get();
            if (renderThread == null) {
                if (RenderThread.DBG) {
                    Log.w(RenderThread.TAG, "RenderHandler.handleMessage: weak ref is null");
                    return;
                }
                return;
            }
            switch (i2) {
                case 0:
                    renderThread.surfaceAvailable((SurfaceHolder) message.obj, message.arg1 != 0);
                    return;
                case 1:
                    renderThread.surfaceChanged(message.arg1, message.arg2);
                    return;
                case 2:
                    renderThread.surfaceDestroyed();
                    return;
                case 3:
                    renderThread.shutdown();
                    return;
                case 4:
                    renderThread.frameAvailable();
                    return;
                case 5:
                    renderThread.orientationChanged(message.arg1);
                    return;
                case 6:
                case 7:
                case 8:
                case 13:
                default:
                    throw new RuntimeException("unknown message " + i2);
                case 9:
                    renderThread.draw();
                    return;
                case 10:
                    renderThread.mCameraManager.pause();
                    return;
                case 11:
                    renderThread.mCameraManager.resume();
                    return;
                case 12:
                    renderThread.mCameraManager.pauseProcessFrames();
                    return;
                case 14:
                    renderThread.mCameraManager.resumeProcessFrames();
                    return;
                case 15:
                    renderThread.mCameraManager.toggleFlash();
                    return;
                case 16:
                    renderThread.mCameraManager.requestFocus();
                    return;
                case 17:
                    renderThread.freeze();
                    return;
                case 18:
                    renderThread.unfreeze();
                    return;
            }
        }
    }
}