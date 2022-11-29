package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.hardware.Camera;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
public final class TorchManager {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "TorchManager";
    private final Camera mCamera;
    private boolean mPaused;
    private final RecognitionCore mRecognitionCore;
    private final TorchStatusListener mRecognitionCoreTorchStatusListener = new TorchStatusListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.TorchManager.1
        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener
        public void onTorchStatusChanged(boolean z2) {
            if (TorchManager.this.mCamera == null) {
                return;
            }
            if (TorchManager.DBG) {
                Log.d(TorchManager.TAG, "onTorchStatusChanged() called with: turnTorchOn = [" + z2 + "]");
            }
            if (z2) {
                TorchManager.this.mTorchTurnedOn = true;
                if (TorchManager.this.mPaused) {
                    return;
                }
                CameraConfigurationUtils.setFlashLight(TorchManager.this.mCamera, true);
                return;
            }
            TorchManager.this.mTorchTurnedOn = false;
            CameraConfigurationUtils.setFlashLight(TorchManager.this.mCamera, false);
        }
    };
    private boolean mTorchTurnedOn;

    public TorchManager(RecognitionCore recognitionCore, Camera camera) {
        this.mCamera = camera;
        this.mRecognitionCore = recognitionCore;
    }

    public void pause() {
        if (DBG) {
            Log.d(TAG, "pause()");
        }
        CameraConfigurationUtils.setFlashLight(this.mCamera, false);
        this.mPaused = true;
        this.mRecognitionCore.setTorchListener(null);
    }

    public void resume() {
        if (DBG) {
            Log.d(TAG, "resume()");
        }
        this.mPaused = false;
        this.mRecognitionCore.setTorchListener(this.mRecognitionCoreTorchStatusListener);
        if (this.mTorchTurnedOn) {
            this.mRecognitionCore.setTorchStatus(true);
        } else {
            this.mRecognitionCore.setTorchStatus(false);
        }
    }

    public void destroy() {
        this.mRecognitionCore.setTorchListener(null);
    }

    private boolean isTorchTurnedOn() {
        String flashMode = this.mCamera.getParameters().getFlashMode();
        return "torch".equals(flashMode) || DebugKt.DEBUG_PROPERTY_VALUE_ON.equals(flashMode);
    }

    public void toggleTorch() {
        if (this.mPaused) {
            return;
        }
        boolean z2 = !isTorchTurnedOn();
        if (DBG) {
            Log.d(TAG, "toggleTorch() called with newStatus: " + z2);
        }
        this.mRecognitionCore.setTorchStatus(z2);
        CameraConfigurationUtils.setFlashLight(this.mCamera, z2);
    }
}