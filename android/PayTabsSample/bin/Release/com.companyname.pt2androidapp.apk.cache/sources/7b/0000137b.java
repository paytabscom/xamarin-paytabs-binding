package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import com.payment.paymentsdk.R;
import k.b;

/* loaded from: classes.dex */
public class CvvEditText extends l.a implements TextWatcher {

    /* renamed from: d  reason: collision with root package name */
    private b f150d;

    public CvvEditText(Context context) {
        super(context);
        b();
    }

    public CvvEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public CvvEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    private void b() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        addTextChangedListener(this);
    }

    private int getSecurityCodeLength() {
        b bVar = this.f150d;
        if (bVar == null) {
            return 3;
        }
        return bVar.e();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        b bVar = this.f150d;
        if (bVar != null && bVar.e() == editable.length() && getSelectionStart() == editable.length()) {
            e();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // l.a
    public boolean d() {
        return c() || getText().toString().length() == getSecurityCodeLength();
    }

    @Override // l.a
    public String getErrorMessage() {
        Context context;
        int f2;
        if (this.f150d == null) {
            context = getContext();
            f2 = R.string.payment_sdk_card_cvv;
        } else {
            context = getContext();
            f2 = this.f150d.f();
        }
        String string = context.getString(f2);
        return TextUtils.isEmpty(getText()) ? getContext().getString(R.string.payment_sdk_card_error_empty_cvv, string) : getContext().getString(R.string.payment_sdk_card_cvv_invalid, string);
    }

    public void setCardType(b bVar) {
        this.f150d = bVar;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(bVar.e())});
        setContentDescription(getContext().getString(bVar.f()));
        setFieldHint(bVar.f());
        invalidate();
    }

    public void setMask(boolean z2) {
        setTransformationMethod(z2 ? PasswordTransformationMethod.getInstance() : SingleLineTransformationMethod.getInstance());
    }
}