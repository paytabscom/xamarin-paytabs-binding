package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;

/* loaded from: classes.dex */
public final class OrientationHelper {
    private static final boolean DBG = BuildConfig.DEBUG;
    private static final String TAG = "OrientationHelper";

    private OrientationHelper() {
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

    public static int getDisplayRotationDegrees(Display display) {
        return getDisplayRotationDegrees(display.getRotation());
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

    public static Rect rotateRect(Rect rect, int i2, int i3, int i4, Rect rect2) {
        if (rect2 == null) {
            rect2 = new Rect();
        }
        int i5 = i4 >= 0 ? i4 : 360 - i4;
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = i2 - rect.right;
        int i9 = i3 - rect.bottom;
        if (i5 == 0) {
            rect2.set(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i5 == 90) {
            rect2.set(i7, i8, rect.height() + i7, rect.width() + i8);
        } else if (i5 == 180) {
            rect2.set(i8, i9, rect.width() + i8, rect.height() + i9);
        } else if (i5 == 270) {
            rect2.set(i9, i6, rect.height() + i9, rect.width() + i6);
        }
        if (DBG) {
            Log.v(TAG, "rotateRect() degrees: " + i4 + "src: " + rect.toString() + "; res: " + rect2.toString());
        }
        return rect2;
    }
}