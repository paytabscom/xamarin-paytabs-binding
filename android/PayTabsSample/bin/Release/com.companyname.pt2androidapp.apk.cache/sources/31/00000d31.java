package com.google.android.material.transition;

/* loaded from: classes.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FitModeResult(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.startScale = f2;
        this.endScale = f3;
        this.currentStartWidth = f4;
        this.currentStartHeight = f5;
        this.currentEndWidth = f6;
        this.currentEndHeight = f7;
    }
}