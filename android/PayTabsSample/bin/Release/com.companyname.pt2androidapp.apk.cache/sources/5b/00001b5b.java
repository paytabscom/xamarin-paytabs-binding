package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes2.dex */
public class c extends ReplacementSpan {
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        canvas.drawText(((Object) charSequence.subSequence(i2, i3)) + " ", f2, i5, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (paint.measureText(" ", 0, 1) + paint.measureText(charSequence, i2, i3));
    }
}