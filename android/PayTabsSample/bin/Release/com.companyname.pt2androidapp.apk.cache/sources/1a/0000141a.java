package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes.dex */
public class ButtonWithTopBorder extends AppCompatButton {
    private Paint mTopLinePaint;

    public ButtonWithTopBorder(Context context) {
        super(context);
        init();
    }

    public ButtonWithTopBorder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ButtonWithTopBorder(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mTopLinePaint = paint;
        paint.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.mTopLinePaint.setStyle(Paint.Style.STROKE);
        this.mTopLinePaint.setColor(1644167167);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.mTopLinePaint);
    }
}