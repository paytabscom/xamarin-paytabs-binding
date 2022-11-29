package androidx.core.view;

import android.os.Build;
import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z2) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z2);
    }

    public static void setQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector, boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            Api19Impl.setQuickScaleEnabled(scaleGestureDetector, z2);
        }
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    public static boolean isQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.isQuickScaleEnabled(scaleGestureDetector);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        static void setQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector, boolean z2) {
            scaleGestureDetector.setQuickScaleEnabled(z2);
        }

        static boolean isQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
    }
}