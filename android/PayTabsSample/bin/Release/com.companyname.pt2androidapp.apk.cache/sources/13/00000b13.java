package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ChipGroup;
    private int checkedId;
    private final CheckedStateTracker checkedStateTracker;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private OnCheckedChangeListener onCheckedChangeListener;
    private PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* loaded from: classes.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i2);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$CheckedStateTracker r8 = new com.google.android.material.chip.ChipGroup$CheckedStateTracker
            r0 = 0
            r8.<init>()
            r7.checkedStateTracker = r8
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = new com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener
            r8.<init>()
            r7.passThroughListener = r8
            r8 = -1
            r7.checkedId = r8
            r6 = 0
            r7.protectFromCheckedChange = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.checkedId = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = r7.passThroughListener
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), isSingleLine() ? getChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.checkedId;
        if (i2 != -1) {
            setCheckedStateForView(i2, true);
            setCheckedId(this.checkedId);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.checkedId;
                if (i3 != -1 && this.singleSelection) {
                    setCheckedStateForView(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void check(int i2) {
        int i3 = this.checkedId;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1 && this.singleSelection) {
            setCheckedStateForView(i3, false);
        }
        if (i2 != -1) {
            setCheckedStateForView(i2, true);
        }
        setCheckedId(i2);
    }

    public int getCheckedChipId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.singleSelection) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public void clearCheck() {
        this.protectFromCheckedChange = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.protectFromCheckedChange = false;
        setCheckedId(-1);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        setCheckedId(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2, boolean z2) {
        this.checkedId = i2;
        OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
        if (onCheckedChangeListener != null && this.singleSelection && z2) {
            onCheckedChangeListener.onCheckedChanged(this, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedStateForView(int i2, boolean z2) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.protectFromCheckedChange = true;
            ((Chip) findViewById).setChecked(z2);
            this.protectFromCheckedChange = false;
        }
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getIndexOfChip(View view) {
        if (view instanceof Chip) {
            int i2 = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) instanceof Chip) {
                    if (((Chip) getChildAt(i3)) == view) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        }
        return -1;
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.chipSpacingHorizontal != i2) {
            this.chipSpacingHorizontal = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public void setChipSpacingVertical(int i2) {
        if (this.chipSpacingVertical != i2) {
            this.chipSpacingVertical = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z2) {
        if (this.singleSelection != z2) {
            this.singleSelection = z2;
            clearCheck();
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSelectionRequired(boolean z2) {
        this.selectionRequired = z2;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    /* loaded from: classes.dex */
    private class CheckedStateTracker implements CompoundButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (ChipGroup.this.protectFromCheckedChange) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.selectionRequired) {
                ChipGroup.this.setCheckedStateForView(compoundButton.getId(), true);
                ChipGroup.this.setCheckedId(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (z2) {
                if (ChipGroup.this.checkedId != -1 && ChipGroup.this.checkedId != id && ChipGroup.this.singleSelection) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.setCheckedStateForView(chipGroup.checkedId, false);
                }
                ChipGroup.this.setCheckedId(id);
            } else if (ChipGroup.this.checkedId == id) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    /* loaded from: classes.dex */
    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).check(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.checkedStateTracker);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }
}