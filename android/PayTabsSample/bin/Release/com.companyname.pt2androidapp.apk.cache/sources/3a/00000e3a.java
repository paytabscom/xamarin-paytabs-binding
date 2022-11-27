package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import cards.pay.paycardsrecognizer.sdk.R;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;

/* loaded from: classes.dex */
public final class CameraPreviewLayout extends FrameLayout {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "CameraPreviewLayout";
    private final CardRectCoordsMapper mCardFrame;
    private CardDetectionStateView mDetectionStateOverlay;
    private SurfaceView mSurfaceView;
    private final Rect mTmp;
    private final Rect mTmpCard;
    private OnWindowFocusChangedListener mWindowFocusChangedListener;

    private static int resolveGravity(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= GravityCompat.START;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CameraPreviewLayout(Context context) {
        this(context, null);
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mTmpCard = new Rect();
        this.mTmp = new Rect();
        this.mCardFrame = new CardRectCoordsMapper();
    }

    public SurfaceView getSurfaceView() {
        return this.mSurfaceView;
    }

    public CardDetectionStateView getDetectionStateOverlay() {
        return this.mDetectionStateOverlay;
    }

    public void setOnWindowFocusChangedListener(OnWindowFocusChangedListener onWindowFocusChangedListener) {
        this.mWindowFocusChangedListener = onWindowFocusChangedListener;
    }

    public void setCameraParameters(int i2, int i3, int i4, Rect rect) {
        if (DBG) {
            Log.d(TAG, "setCameraParameters() called with: previewSizeWidth = [" + i2 + "], previewSizeHeight = [" + i3 + "], rotation = [" + i4 + "], cardFrame = [" + rect + "]");
        }
        this.mDetectionStateOverlay.setCameraParameters(i2, i3, i4, rect);
        if (!this.mCardFrame.setCameraParameters(i2, i3, i4, rect) || ViewCompat.isInLayout(this)) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (!this.mCardFrame.setViewSize(i2, i3) || ViewCompat.isInLayout(this)) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mSurfaceView = (SurfaceView) getChildAt(0);
        this.mDetectionStateOverlay = (CardDetectionStateView) getChildAt(1);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (DBG) {
            Log.d(TAG, "onWindowFocusChanged() called with: hasWindowFocus = [" + z2 + "]");
        }
        OnWindowFocusChangedListener onWindowFocusChangedListener = this.mWindowFocusChangedListener;
        if (onWindowFocusChangedListener != null) {
            onWindowFocusChangedListener.onWindowFocusChanged(this, z2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int childCount = getChildCount();
        Rect cardRect = this.mCardFrame.getCardRect();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 && layoutParams.cardGravity != -1) {
                int layoutDirection = ViewCompat.getLayoutDirection(this);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                getChildRect(layoutDirection, cardRect, this.mTmp, layoutParams, measuredWidth, measuredHeight);
                constrainChildRect(layoutParams, this.mTmp, measuredWidth, measuredHeight);
                childAt.layout(this.mTmp.left, this.mTmp.top, this.mTmp.right, this.mTmp.bottom);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getChildRect(int r3, android.graphics.Rect r4, android.graphics.Rect r5, com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout.LayoutParams r6, int r7, int r8) {
        /*
            r2 = this;
            int r0 = r6.cardGravity
            int r0 = resolveGravity(r0)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r3)
            r0 = r3 & 7
            r3 = r3 & 112(0x70, float:1.57E-43)
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 5
            if (r0 == r1) goto L1a
            int r0 = r4.left
            int r1 = r6.leftMargin
            int r0 = r0 + r1
            goto L32
        L1a:
            int r0 = r4.right
            int r0 = r0 - r7
            int r1 = r6.rightMargin
            goto L31
        L20:
            int r0 = r4.left
            int r1 = r4.width()
            int r1 = r1 / 2
            int r0 = r0 + r1
            int r1 = r7 / 2
            int r0 = r0 - r1
            int r1 = r6.leftMargin
            int r0 = r0 + r1
            int r1 = r6.rightMargin
        L31:
            int r0 = r0 - r1
        L32:
            r1 = 16
            if (r3 == r1) goto L46
            r1 = 80
            if (r3 == r1) goto L40
            int r3 = r4.top
            int r3 = r3 - r8
            int r4 = r6.bottomMargin
            goto L57
        L40:
            int r3 = r4.bottom
            int r4 = r6.topMargin
            int r3 = r3 + r4
            goto L58
        L46:
            int r3 = r4.top
            int r4 = r4.height()
            int r4 = r4 / 2
            int r3 = r3 + r4
            int r4 = r8 / 2
            int r3 = r3 - r4
            int r4 = r6.topMargin
            int r3 = r3 + r4
            int r4 = r6.bottomMargin
        L57:
            int r3 = r3 - r4
        L58:
            int r7 = r7 + r0
            int r8 = r8 + r3
            r5.set(r0, r3, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout.getChildRect(int, android.graphics.Rect, android.graphics.Rect, com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout$LayoutParams, int, int):void");
    }

    private void constrainChildRect(LayoutParams layoutParams, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + layoutParams.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - layoutParams.rightMargin));
        int max2 = Math.max(getPaddingTop() + layoutParams.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - layoutParams.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int UNSPECIFIED_CARD_GRAVITY = -1;
        public int cardGravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.cardGravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.wocr_CameraPreviewLayout_Layout);
            if (obtainStyledAttributes.hasValue(R.styleable.wocr_CameraPreviewLayout_Layout_wocr_layout_cardAlignGravity)) {
                this.cardGravity = obtainStyledAttributes.getInt(R.styleable.wocr_CameraPreviewLayout_Layout_wocr_layout_cardAlignGravity, 17);
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.cardGravity = -1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.cardGravity = -1;
        }
    }
}