package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final AccessibilityManager accessibilityManager;
    private final ListPopupWindow modalListPopup;
    private final Rect tempRect;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, 0), attributeSet, i2);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i2, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_android_inputType) && obtainStyledAttributes.getInt(R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.modalListPopup = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                MaterialAutoCompleteTextView.this.updateText(i3 < 0 ? MaterialAutoCompleteTextView.this.modalListPopup.getSelectedItem() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i3));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i3 < 0) {
                        view = MaterialAutoCompleteTextView.this.modalListPopup.getSelectedView();
                        i3 = MaterialAutoCompleteTextView.this.modalListPopup.getSelectedItemPosition();
                        j2 = MaterialAutoCompleteTextView.this.modalListPopup.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.getListView(), view, i3, j2);
                }
                MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
            }
        });
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.modalListPopup.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint()) {
            return findTextInputLayoutAncestor.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i2 = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.modalListPopup.getSelectedItemPosition()) + 15);
        View view = null;
        int i3 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        Drawable background = this.modalListPopup.getBackground();
        if (background != null) {
            background.getPadding(this.tempRect);
            i3 += this.tempRect.left + this.tempRect.right;
        }
        return i3 + findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth();
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }
}