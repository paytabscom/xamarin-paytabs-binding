package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.userSetVisibility = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        internalSetVisibility(i2, true);
    }

    public final void internalSetVisibility(int i2, boolean z2) {
        super.setVisibility(i2);
        if (z2) {
            this.userSetVisibility = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }
}