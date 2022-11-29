package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
public final class AutoFocusManager {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "AutoFocusManager";
    private final FocusMoveCallback mCallback;
    private final Camera mCamera;
    private FocusManager mFocusManager;
    private Handler mHandler = new Handler(Looper.myLooper());

    /* loaded from: classes.dex */
    private interface FocusManager {
        void requestFocus();

        void start();

        void stop();
    }

    /* loaded from: classes.dex */
    public interface FocusMoveCallback {
        void onAutoFocusComplete(boolean z2, Camera camera);

        void onAutoFocusMoving(boolean z2, Camera camera);
    }

    public AutoFocusManager(Camera camera, FocusMoveCallback focusMoveCallback) {
        this.mCamera = camera;
        this.mCallback = focusMoveCallback;
    }

    public void start() {
        FocusManager focusManager = this.mFocusManager;
        if (focusManager != null) {
            focusManager.stop();
            this.mFocusManager = null;
        }
        if (isCameraFocusContinuous()) {
            AutoFocusManagerImpl autoFocusManagerImpl = new AutoFocusManagerImpl(this.mCamera, this.mCallback, this.mHandler);
            this.mFocusManager = autoFocusManagerImpl;
            autoFocusManagerImpl.start();
            if (DBG) {
                Log.d(TAG, "start(): camera continuous focus");
            }
        } else if (isCameraFocusManual()) {
            ManualFocusManagerImpl manualFocusManagerImpl = new ManualFocusManagerImpl(this.mCamera, this.mCallback, this.mHandler);
            this.mFocusManager = manualFocusManagerImpl;
            manualFocusManagerImpl.start();
            if (DBG) {
                Log.d(TAG, "start(): focus with manual reset");
            }
        }
    }

    public void stop() {
        FocusManager focusManager = this.mFocusManager;
        if (focusManager != null) {
            focusManager.stop();
            this.mFocusManager = null;
        }
    }

    public boolean isStarted() {
        return this.mFocusManager != null;
    }

    public void requestFocus() {
        FocusManager focusManager = this.mFocusManager;
        if (focusManager != null) {
            focusManager.requestFocus();
        }
    }

    private boolean isCameraFocusContinuous() {
        String focusMode = this.mCamera.getParameters().getFocusMode();
        return "continuous-picture".equals(focusMode) || "continuous-video".equals(focusMode) || "edof".equals(focusMode);
    }

    private boolean isCameraFocusFixed() {
        String focusMode = this.mCamera.getParameters().getFocusMode();
        return "infinity".equals(focusMode) || "fixed".equals(focusMode);
    }

    private boolean isCameraFocusManual() {
        String focusMode = this.mCamera.getParameters().getFocusMode();
        return DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(focusMode) || "macro".equals(focusMode);
    }

    /* loaded from: classes.dex */
    private static class ManualFocusManagerImpl implements FocusManager {
        private static final int FOCUS_DELAY_FAST = 500;
        private static final int FOCUS_DELAY_SLOW = 3000;
        private static boolean sFocusCompleteWorking;
        private final FocusMoveCallback mCallback;
        private final Camera mCamera;
        private final Handler mHandler;
        private boolean mIsFocusMoving;
        private final Runnable mRequestFocusRunnable = new Runnable() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.ManualFocusManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ManualFocusManagerImpl.this.mCamera.autoFocus(ManualFocusManagerImpl.this.mAutoFocusCallback);
                    ManualFocusManagerImpl.this.mIsFocusMoving = true;
                    if (ManualFocusManagerImpl.this.mCallback != null) {
                        ManualFocusManagerImpl.this.mCallback.onAutoFocusMoving(true, ManualFocusManagerImpl.this.mCamera);
                    }
                } catch (Exception unused) {
                    ManualFocusManagerImpl.this.mIsFocusMoving = false;
                    if (ManualFocusManagerImpl.this.mCallback != null) {
                        ManualFocusManagerImpl.this.mCallback.onAutoFocusMoving(false, ManualFocusManagerImpl.this.mCamera);
                    }
                }
            }
        };
        private final Camera.AutoFocusCallback mAutoFocusCallback = new Camera.AutoFocusCallback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.ManualFocusManagerImpl.3
            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z2, Camera camera) {
                if (ManualFocusManagerImpl.this.mCallback != null) {
                    ManualFocusManagerImpl.this.mCallback.onAutoFocusComplete(z2, camera);
                }
                ManualFocusManagerImpl.this.mIsFocusMoving = false;
                if (!ManualFocusManagerImpl.sFocusCompleteWorking) {
                    boolean unused = ManualFocusManagerImpl.sFocusCompleteWorking = true;
                    if (AutoFocusManager.DBG) {
                        Log.d(AutoFocusManager.TAG, "onAutoFocus() onAutoFocus callback looks like working");
                    }
                }
                ManualFocusManagerImpl.this.restartCounter(z2 ? 3000 : ManualFocusManagerImpl.FOCUS_DELAY_FAST);
            }
        };

        public ManualFocusManagerImpl(Camera camera, FocusMoveCallback focusMoveCallback, Handler handler) {
            this.mCamera = camera;
            this.mCallback = focusMoveCallback;
            this.mHandler = handler;
            if (Build.VERSION.SDK_INT < 16 || focusMoveCallback == null) {
                return;
            }
            camera.setAutoFocusMoveCallback(new Camera.AutoFocusMoveCallback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.ManualFocusManagerImpl.1
                @Override // android.hardware.Camera.AutoFocusMoveCallback
                public void onAutoFocusMoving(boolean z2, Camera camera2) {
                    ManualFocusManagerImpl.this.mCallback.onAutoFocusMoving(z2, camera2);
                }
            });
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void start() {
            cancelAutoFocusSafe();
            restartCounter(FOCUS_DELAY_FAST);
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void stop() {
            this.mHandler.removeCallbacks(this.mRequestFocusRunnable);
            cancelAutoFocusSafe();
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void requestFocus() {
            if (this.mIsFocusMoving && sFocusCompleteWorking) {
                return;
            }
            cancelAutoFocusSafe();
            restartCounter(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void restartCounter(int i2) {
            this.mHandler.removeCallbacks(this.mRequestFocusRunnable);
            if (i2 == 0) {
                this.mHandler.post(this.mRequestFocusRunnable);
            } else {
                this.mHandler.postDelayed(this.mRequestFocusRunnable, i2);
            }
        }

        private void cancelAutoFocusSafe() {
            try {
                this.mCamera.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class AutoFocusManagerImpl implements FocusManager {
        private static final int FOCUS_RESET_DELAY = 1000;
        private final FocusMoveCallback mCallback;
        private final Camera mCamera;
        private boolean mCameraMoving;
        private final Handler mHandler;
        private final Runnable mResetFocusRunnable = new Runnable() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.AutoFocusManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AutoFocusManagerImpl.this.resumeAutoFocus();
                    AutoFocusManagerImpl.this.restartCounter(1000);
                } catch (Exception unused) {
                }
            }
        };

        public AutoFocusManagerImpl(Camera camera, FocusMoveCallback focusMoveCallback, Handler handler) {
            this.mCamera = camera;
            this.mCallback = focusMoveCallback;
            this.mHandler = handler;
            if (Build.VERSION.SDK_INT < 16 || focusMoveCallback == null) {
                return;
            }
            camera.setAutoFocusMoveCallback(new Camera.AutoFocusMoveCallback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.AutoFocusManagerImpl.1
                @Override // android.hardware.Camera.AutoFocusMoveCallback
                public void onAutoFocusMoving(boolean z2, Camera camera2) {
                    AutoFocusManagerImpl.this.mCallback.onAutoFocusMoving(z2, camera2);
                    AutoFocusManagerImpl.this.mCameraMoving = z2;
                }
            });
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void start() {
            resumeAutoFocus();
            restartCounter(1000);
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void stop() {
            this.mHandler.removeCallbacks(this.mResetFocusRunnable);
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusManager
        public void requestFocus() {
            if (this.mCameraMoving) {
                if (AutoFocusManager.DBG) {
                    Log.d(AutoFocusManager.TAG, "requestFocus(): ignore since camera is moving");
                    return;
                }
                return;
            }
            cancelAutoFocusSafe();
            restartCounter(1000);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resumeAutoFocus() {
            cancelAutoFocusSafe();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void restartCounter(int i2) {
            this.mHandler.removeCallbacks(this.mResetFocusRunnable);
            if (i2 == 0) {
                this.mHandler.post(this.mResetFocusRunnable);
            } else {
                this.mHandler.postDelayed(this.mResetFocusRunnable, i2);
            }
        }

        private void cancelAutoFocusSafe() {
            try {
                this.mCamera.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}