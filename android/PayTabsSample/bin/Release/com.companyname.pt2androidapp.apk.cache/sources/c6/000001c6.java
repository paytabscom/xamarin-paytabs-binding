package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private int mMinimumHeight;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        this.mMinimumHeight = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonBarLayout);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z2) {
        if (this.mAllowStacking != z2) {
            this.mAllowStacking = z2;
            if (!z2 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (isStacked() || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.mAllowStacking && !isStacked()) {
            if ((getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    paddingTop += getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            } else {
                i5 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i5) {
            setMinimumHeight(i5);
        }
    }

    private int getNextVisibleChildIndex(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.mMinimumHeight, super.getMinimumHeight());
    }

    private void setStacked(boolean z2) {
        setOrientation(z2 ? 1 : 0);
        setGravity(z2 ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private boolean isStacked() {
        return getOrientation() == 1;
    }
}