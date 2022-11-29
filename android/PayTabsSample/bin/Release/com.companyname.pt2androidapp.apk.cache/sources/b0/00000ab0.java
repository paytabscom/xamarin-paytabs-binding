package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        layoutChild(coordinatorLayout, v2, i2);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new ViewOffsetHelper(v2);
        }
        this.viewOffsetHelper.onViewLayout();
        this.viewOffsetHelper.applyOffsets();
        int i3 = this.tempTopBottomOffset;
        if (i3 != 0) {
            this.viewOffsetHelper.setTopAndBottomOffset(i3);
            this.tempTopBottomOffset = 0;
        }
        int i4 = this.tempLeftRightOffset;
        if (i4 != 0) {
            this.viewOffsetHelper.setLeftAndRightOffset(i4);
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        coordinatorLayout.onLayoutChild(v2, i2);
    }

    public boolean setTopAndBottomOffset(int i2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setTopAndBottomOffset(i2);
        }
        this.tempTopBottomOffset = i2;
        return false;
    }

    public boolean setLeftAndRightOffset(int i2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setLeftAndRightOffset(i2);
        }
        this.tempLeftRightOffset = i2;
        return false;
    }

    public int getTopAndBottomOffset() {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getTopAndBottomOffset();
        }
        return 0;
    }

    public int getLeftAndRightOffset() {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getLeftAndRightOffset();
        }
        return 0;
    }

    public void setVerticalOffsetEnabled(boolean z2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setVerticalOffsetEnabled(z2);
        }
    }

    public boolean isVerticalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        return viewOffsetHelper != null && viewOffsetHelper.isVerticalOffsetEnabled();
    }

    public void setHorizontalOffsetEnabled(boolean z2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setHorizontalOffsetEnabled(z2);
        }
    }

    public boolean isHorizontalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        return viewOffsetHelper != null && viewOffsetHelper.isHorizontalOffsetEnabled();
    }
}