package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.CircularProgressIndicator, i2, i3, new int[0]);
        this.indicatorSize = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = obtainStyledAttributes.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        obtainStyledAttributes.recycle();
        validateSpec();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        if (this.indicatorSize >= this.trackThickness * 2) {
            return;
        }
        throw new IllegalArgumentException("The indicatorSize (" + this.indicatorSize + " px) cannot be less than twice of the trackThickness (" + this.trackThickness + " px).");
    }
}