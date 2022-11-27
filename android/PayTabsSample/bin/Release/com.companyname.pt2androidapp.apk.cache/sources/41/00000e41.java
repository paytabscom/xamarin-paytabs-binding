package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;

/* loaded from: classes.dex */
final class DisplayHelper {
    private static final boolean DBG = BuildConfig.DEBUG;
    private static final String TAG = "DisplayHelper";

    private DisplayHelper() {
    }

    public static int getCameraRotationToNatural(int i2, int i3, boolean z2) {
        if (DBG) {
            Log.d(TAG, "getCameraRotationToNatural() called with: displayRotation = [" + i2 + "], cameraOrientation = [" + i3 + "], compensateMirror = [" + z2 + "]");
        }
        if (z2) {
            return (360 - ((i3 + i2) % 360)) % 360;
        }
        return ((i3 - i2) + 360) % 360;
    }

    public static int getDisplayRotationDegrees(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException();
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static int getDisplayRotationDegrees(Display display) {
        return getDisplayRotationDegrees(display.getRotation());
    }

    public static boolean naturalOrientationIsLandscape(Display display) {
        int rotation = display.getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return (rotation == 0 || rotation == 2) ? displayMetrics.widthPixels > displayMetrics.heightPixels : displayMetrics.heightPixels > displayMetrics.widthPixels;
    }
}