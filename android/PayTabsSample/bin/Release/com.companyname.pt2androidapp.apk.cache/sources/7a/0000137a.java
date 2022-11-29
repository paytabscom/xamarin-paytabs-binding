package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.payment.paymentsdk.R;
import i.b;

/* loaded from: classes.dex */
public class CardholderNameEditText extends l.a {

    /* renamed from: d  reason: collision with root package name */
    int f149d;

    public CardholderNameEditText(Context context) {
        super(context);
        this.f149d = R.string.payment_sdk_card_error_invalid_name_on_card;
        b();
    }

    public CardholderNameEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149d = R.string.payment_sdk_card_error_invalid_name_on_card;
        b();
    }

    public CardholderNameEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f149d = R.string.payment_sdk_card_error_invalid_name_on_card;
        b();
    }

    private void b() {
        setInputType(1);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
    }

    @Override // l.a
    public boolean d() {
        int i2;
        if (c()) {
            return true;
        }
        boolean z2 = !getText().toString().trim().isEmpty();
        boolean a2 = b.a(getText().toString());
        if (z2) {
            if (!a2) {
                i2 = R.string.payment_sdk_card_error_invalid_name_on_card;
            }
            return !z2 && a2;
        }
        i2 = R.string.payment_sdk_card_error_empty_name_on_card;
        this.f149d = i2;
        if (z2) {
        }
    }

    @Override // l.a
    public String getErrorMessage() {
        return getContext().getString(this.f149d);
    }
}