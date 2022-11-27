package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private WindowCompat() {
    }

    public static <T extends View> T requireViewById(Window window, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(i2);
        }
        T t2 = (T) window.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.setDecorFitsSystemWindows(window, z2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            Impl16.setDecorFitsSystemWindows(window, z2);
        }
    }

    public static WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Impl30.getInsetsController(window);
        }
        return new WindowInsetsControllerCompat(window, view);
    }

    /* loaded from: classes.dex */
    private static class Impl16 {
        private Impl16() {
        }

        static void setDecorFitsSystemWindows(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Impl30 {
        private Impl30() {
        }

        static void setDecorFitsSystemWindows(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }

        static WindowInsetsControllerCompat getInsetsController(Window window) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(insetsController);
            }
            return null;
        }
    }
}