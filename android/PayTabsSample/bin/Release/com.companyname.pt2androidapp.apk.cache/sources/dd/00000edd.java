package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult startOnTop(int i2, int i3) {
        return new FadeModeResult(i2, i3, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult endOnTop(int i2, int i3) {
        return new FadeModeResult(i2, i3, true);
    }

    private FadeModeResult(int i2, int i3, boolean z2) {
        this.startAlpha = i2;
        this.endAlpha = i3;
        this.endOnTop = z2;
    }
}