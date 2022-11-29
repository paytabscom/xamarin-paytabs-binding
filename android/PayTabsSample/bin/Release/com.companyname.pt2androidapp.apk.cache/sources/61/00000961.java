package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i2 = rect.left + ((int) ((rect2.left - rect.left) * f2));
        int i3 = rect.top + ((int) ((rect2.top - rect.top) * f2));
        int i4 = rect.right + ((int) ((rect2.right - rect.right) * f2));
        int i5 = rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f2));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        rect3.set(i2, i3, i4, i5);
        return this.mRect;
    }
}