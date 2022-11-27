package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.payment.paymentsdk.R;
import k.c;
import l.b;

/* loaded from: classes.dex */
public class ExpirationDateEditText extends l.a implements TextWatcher, View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    private boolean f139d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f140e;

    public ExpirationDateEditText(Context context) {
        super(context);
        b();
    }

    public ExpirationDateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ExpirationDateEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    private void a(Editable editable) {
        if (2 <= editable.length()) {
            editable.setSpan(new b(), 1, 2, 33);
        }
    }

    private void b() {
        setInputType(2);
        f();
        addTextChangedListener(this);
        super.setOnClickListener(this);
    }

    private void b(Editable editable) {
        editable.replace(0, 1, "0").append(editable.charAt(0));
    }

    private void f() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(4), a.a(4)});
    }

    private String getString() {
        Editable text = getText();
        return text != null ? text.toString() : "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f139d && editable.length() == 1 && Character.getNumericValue(editable.charAt(0)) >= 2) {
            b(editable);
        }
        for (Object obj : editable.getSpans(0, editable.length(), b.class)) {
            editable.removeSpan(obj);
        }
        a(editable);
        if (((getSelectionStart() != 4 || editable.toString().endsWith("20")) && getSelectionStart() != 4) || !d()) {
            return;
        }
        a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // l.a
    public boolean d() {
        return c() || c.a(getMonth(), getYear());
    }

    @Override // l.a
    public String getErrorMessage() {
        Context context;
        int i2;
        if (TextUtils.isEmpty(getText())) {
            context = getContext();
            i2 = R.string.payment_sdk_card_error_empty_expiry_date;
        } else {
            context = getContext();
            i2 = R.string.payment_sdk_card_error_invalid_expiry_date;
        }
        return context.getString(i2);
    }

    public String getMonth() {
        return getString().length() < 2 ? "" : getString().substring(0, 2);
    }

    public String getYear() {
        String string = getString();
        return (string.length() == 4 || string.length() == 6) ? getString().substring(2) : "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f140e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // l.a, android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        this.f139d = i4 > i3;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f140e = onClickListener;
    }
}