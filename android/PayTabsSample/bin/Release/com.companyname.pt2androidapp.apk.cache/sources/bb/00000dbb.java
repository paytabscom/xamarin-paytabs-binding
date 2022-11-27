package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import androidx.core.widget.TextViewCompat;
import com.payment.paymentsdk.R;
import k.b;
import l.c;

/* loaded from: classes.dex */
public class CardEditText extends l.a implements TextWatcher {

    /* renamed from: d  reason: collision with root package name */
    private boolean f116d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f117e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f118f;

    /* renamed from: g  reason: collision with root package name */
    private b f119g;

    /* renamed from: h  reason: collision with root package name */
    private a f120h;

    /* renamed from: i  reason: collision with root package name */
    private TransformationMethod f121i;

    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);
    }

    public CardEditText(Context context) {
        super(context);
        this.f116d = true;
        this.f117e = false;
        this.f118f = false;
        b();
    }

    public CardEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f116d = true;
        this.f117e = false;
        this.f118f = false;
        b();
    }

    public CardEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f116d = true;
        this.f117e = false;
        this.f118f = false;
        b();
    }

    private void a(Editable editable, int[] iArr) {
        int length = editable.length();
        for (int i2 : iArr) {
            if (i2 <= length) {
                editable.setSpan(new c(), i2 - 1, i2, 33);
            }
        }
    }

    private void b() {
        setInputType(2);
        setCardIcon(R.drawable.payment_sdk_ic_unknown);
        addTextChangedListener(this);
        h();
        this.f121i = getTransformationMethod();
    }

    private void f() {
        if (getTransformationMethod() instanceof k.a) {
            return;
        }
        this.f121i = getTransformationMethod();
        setTransformationMethod(new k.a());
    }

    private void g() {
        TransformationMethod transformationMethod = getTransformationMethod();
        TransformationMethod transformationMethod2 = this.f121i;
        if (transformationMethod != transformationMethod2) {
            setTransformationMethod(transformationMethod2);
        }
    }

    private void h() {
        b a2 = b.a(getText().toString());
        if (this.f119g != a2) {
            this.f119g = a2;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f119g.b())});
            invalidate();
            a aVar = this.f120h;
            if (aVar != null) {
                aVar.a(this.f119g);
            }
        }
    }

    private void setCardIcon(int i2) {
        int i3 = this.f118f ? 0 : R.drawable.payment_sdk_scan_card;
        if (!this.f116d || getText().length() == 0) {
            i2 = R.drawable.payment_sdk_ic_unknown;
        }
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(this, i2, 0, i3, 0);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        for (Object obj : editable.getSpans(0, editable.length(), c.class)) {
            editable.removeSpan(obj);
        }
        h();
        setCardIcon(this.f119g.a());
        a(editable, this.f119g.g());
        if (this.f119g.b() != getSelectionStart()) {
            if (hasFocus() || !this.f117e) {
                return;
            }
            f();
            return;
        }
        e();
        if (d()) {
            a();
        } else {
            g();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // l.a
    public boolean d() {
        return c() || this.f119g.e(getText().toString());
    }

    public b getCardType() {
        return this.f119g;
    }

    @Override // l.a
    public String getErrorMessage() {
        Context context;
        int i2;
        if (TextUtils.isEmpty(getText())) {
            context = getContext();
            i2 = R.string.payment_sdk_card_error_empty_card_number;
        } else {
            context = getContext();
            i2 = R.string.payment_sdk_card_error_invalid_card_number;
        }
        return context.getString(i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (z2) {
            g();
            if (getText().toString().length() > 0) {
                setSelection(getText().toString().length());
            }
        } else if (this.f117e && d()) {
            f();
        }
    }

    public void setHideScanDrawable(boolean z2) {
        this.f118f = z2;
        setCardIcon(R.drawable.payment_sdk_ic_unknown);
    }

    public void setIcon(String str) {
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(this, b.valueOf(str.toUpperCase()).a(), 0, 0, 0);
    }

    public void setMask(boolean z2) {
        this.f117e = z2;
    }

    public void setOnCardTypeChangedListener(a aVar) {
        this.f120h = aVar;
    }
}