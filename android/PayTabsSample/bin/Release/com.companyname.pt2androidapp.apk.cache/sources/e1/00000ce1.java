package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        int findViewAppearanceResourceId;
        Context context2 = getContext();
        if (canApplyTextAppearanceLineHeight(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (viewAttrsHasLineHeight(context2, theme, attributeSet, i2, i3) || (findViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, findViewAppearanceResourceId);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i2);
        }
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, R.styleable.MaterialTextAppearance);
        int readFirstAvailableDimension = readFirstAvailableDimension(getContext(), obtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (readFirstAvailableDimension >= 0) {
            setLineHeight(readFirstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int readFirstAvailableDimension(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            i2 = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i3], -1);
        }
        return i2;
    }

    private static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i2, i3);
        int readFirstAvailableDimension = readFirstAvailableDimension(context, obtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return readFirstAvailableDimension != -1;
    }

    private static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}