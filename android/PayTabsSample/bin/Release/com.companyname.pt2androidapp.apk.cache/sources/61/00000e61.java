package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import cards.pay.paycardsrecognizer.sdk.R;

/* loaded from: classes.dex */
public class TabletCardRecognitionHolderLinearLayout extends LinearLayout {
    private View mSurfaceView;

    public TabletCardRecognitionHolderLinearLayout(Context context) {
        super(context);
    }

    public TabletCardRecognitionHolderLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TabletCardRecognitionHolderLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mSurfaceView = findViewById(R.id.wocr_card_recognition_view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = this.mSurfaceView.getMeasuredWidth();
        int measuredHeight = this.mSurfaceView.getMeasuredHeight();
        if (2 == getResources().getConfiguration().orientation) {
            measuredWidth = (int) (measuredHeight * 1.3f);
        } else {
            measuredHeight = (int) (measuredWidth * 1.1f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(measuredHeight, BasicMeasure.EXACTLY));
    }
}