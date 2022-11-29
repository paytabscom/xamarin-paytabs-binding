package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* loaded from: classes.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float lerp = TransitionUtils.lerp(f5, f7, f3, f4, f2, true);
            float f9 = lerp / f5;
            float f10 = lerp / f7;
            return new FitModeResult(f9, f10, lerp, f6 * f9, lerp, f8 * f10);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f2, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f2;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float lerp = TransitionUtils.lerp(f6, f8, f3, f4, f2, true);
            float f9 = lerp / f6;
            float f10 = lerp / f8;
            return new FitModeResult(f9, f10, f5 * f9, lerp, f7 * f10, lerp);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f2, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f2;
            rectF.left += abs;
            rectF.right -= abs;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FitModeEvaluator get(int i2, boolean z2, RectF rectF, RectF rectF2) {
        if (i2 == 0) {
            return shouldAutoFitToWidth(z2, rectF, rectF2) ? WIDTH : HEIGHT;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return HEIGHT;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i2);
        } else {
            return WIDTH;
        }
    }

    private static boolean shouldAutoFitToWidth(boolean z2, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f2 = (height2 * width) / width2;
        float f3 = (width2 * height) / width;
        if (z2) {
            if (f2 >= height) {
                return true;
            }
        } else if (f3 >= height2) {
            return true;
        }
        return false;
    }

    private FitModeEvaluators() {
    }
}