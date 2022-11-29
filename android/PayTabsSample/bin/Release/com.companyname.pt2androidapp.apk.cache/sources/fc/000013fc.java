package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.util.Log;
import android.view.Display;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;

/* loaded from: classes.dex */
public class DisplayConfigurationImpl implements DisplayConfiguration {
    private static final boolean DBG = BuildConfig.DEBUG;
    private static final int LANDSCAPE_ORIENTATION_CORRECTION = -90;
    private static final String TAG = "DisplayConfigImpl";
    private int mDisplayRotation;
    private boolean mNaturalOrientationIsLandscape;
    private int mCameraSensorRotation = 0;
    private int mPreprocessFrameRotation = 0;

    private boolean sanityCheckPreprocessFrameRotation(int i2, int i3, int i4) {
        boolean z2 = i3 >= i2;
        boolean z3 = i4 == 90 || i4 == 270;
        return !(z2 && z3) && (z2 || z3);
    }

    public void setDisplayParameters(Display display) {
        setDisplayParameters(DisplayHelper.getDisplayRotationDegrees(display), DisplayHelper.naturalOrientationIsLandscape(display));
    }

    void setDisplayParameters(int i2, boolean z2) {
        this.mDisplayRotation = i2;
        this.mNaturalOrientationIsLandscape = z2;
        if (DBG) {
            StringBuilder sb = new StringBuilder();
            sb.append("setDisplayParameters() called with: rotation: ");
            sb.append(this.mDisplayRotation);
            sb.append("; natural orientation: ");
            sb.append(this.mNaturalOrientationIsLandscape ? "landscape" : "portait (or square)");
            Log.d(TAG, sb.toString());
        }
        refreshPreprocessFrameRotation();
    }

    void setDisplayRotation(int i2) {
        this.mDisplayRotation = i2;
        refreshPreprocessFrameRotation();
    }

    public void setCameraParameters(int i2) {
        if (DBG) {
            Log.d(TAG, "setCameraParameters() called with: sensorRotation = [" + i2 + "]");
        }
        this.mCameraSensorRotation = i2;
        refreshPreprocessFrameRotation();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.DisplayConfiguration
    public int getNativeDisplayRotation() {
        int i2 = this.mDisplayRotation;
        if (this.mNaturalOrientationIsLandscape) {
            i2 = ((i2 + 360) + LANDSCAPE_ORIENTATION_CORRECTION) % 360;
        }
        if (i2 != 0) {
            if (i2 != 90) {
                if (i2 != 180) {
                    if (i2 == 270) {
                        return 4;
                    }
                    throw new IllegalStateException();
                }
                return 2;
            }
            return 3;
        }
        return 1;
    }

    private void refreshPreprocessFrameRotation() {
        int cameraRotationToNatural = DisplayHelper.getCameraRotationToNatural(this.mDisplayRotation, this.mCameraSensorRotation, false);
        int nativeDisplayRotation = getNativeDisplayRotation();
        if (nativeDisplayRotation == 3 || nativeDisplayRotation == 4) {
            cameraRotationToNatural = ((cameraRotationToNatural + 360) + LANDSCAPE_ORIENTATION_CORRECTION) % 360;
        }
        this.mPreprocessFrameRotation = cameraRotationToNatural;
        if (DBG) {
            Log.v(TAG, "refreshPreprocessFrameRotation() rotation result: " + this.mPreprocessFrameRotation);
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.DisplayConfiguration
    public int getPreprocessFrameRotation(int i2, int i3) {
        if (!sanityCheckPreprocessFrameRotation(i2, i3, this.mPreprocessFrameRotation)) {
            if (DBG) {
                Log.v(TAG, "Skipping frame due to orientation inconsistency. Frame size: " + i2 + "x" + i3 + "; " + toString());
                return -1;
            }
            return -1;
        }
        return this.mPreprocessFrameRotation;
    }

    public String toString() {
        return "DisplayConfigurationImpl{mCameraSensorRotation=" + this.mCameraSensorRotation + ", mDisplayRotation=" + this.mDisplayRotation + ", mNaturalOrientationIsLandscape=" + this.mNaturalOrientationIsLandscape + ", mPreprocessFrameRotation=" + this.mPreprocessFrameRotation + '}';
    }
}