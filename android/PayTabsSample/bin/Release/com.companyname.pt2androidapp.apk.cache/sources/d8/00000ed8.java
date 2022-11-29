package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f3, f4, f2));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f4, f2), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f4, f2), TransitionUtils.lerp(0, 255, f3, f4, f2));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4) {
            float f5 = ((f4 - f3) * 0.35f) + f3;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f5, f2), TransitionUtils.lerp(0, 255, f5, f4, f2));
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeEvaluator get(int i2, boolean z2) {
        if (i2 == 0) {
            return z2 ? IN : OUT;
        } else if (i2 == 1) {
            return z2 ? OUT : IN;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return THROUGH;
            }
            throw new IllegalArgumentException("Invalid fade mode: " + i2);
        } else {
            return CROSS;
        }
    }

    private FadeModeEvaluators() {
    }
}