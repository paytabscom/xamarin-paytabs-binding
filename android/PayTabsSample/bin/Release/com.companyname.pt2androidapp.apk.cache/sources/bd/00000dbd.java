package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText;
import j.b;
import j.c;
import java.util.ArrayList;
import java.util.List;
import k.e;

/* loaded from: classes.dex */
public class CardForm extends LinearLayout implements CardEditText.a, View.OnFocusChangeListener, View.OnClickListener, TextView.OnEditorActionListener, TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private List<l.a> f122a;

    /* renamed from: b  reason: collision with root package name */
    private CardEditText f123b;

    /* renamed from: c  reason: collision with root package name */
    private ExpirationDateEditText f124c;

    /* renamed from: d  reason: collision with root package name */
    private CvvEditText f125d;

    /* renamed from: e  reason: collision with root package name */
    private CardholderNameEditText f126e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f127f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f128g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f129h;

    /* renamed from: i  reason: collision with root package name */
    private int f130i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f131j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f132k;

    /* renamed from: l  reason: collision with root package name */
    private c f133l;

    /* renamed from: m  reason: collision with root package name */
    private b f134m;

    /* renamed from: n  reason: collision with root package name */
    private j.a f135n;

    /* renamed from: o  reason: collision with root package name */
    private CardEditText.a f136o;

    public CardForm(Context context) {
        super(context);
        this.f130i = 0;
        this.f131j = false;
        this.f132k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f130i = 0;
        this.f131j = false;
        this.f132k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f130i = 0;
        this.f131j = false;
        this.f132k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f130i = 0;
        this.f131j = false;
        this.f132k = false;
        a();
    }

    private void a() {
        setVisibility(8);
        setOrientation(1);
        LinearLayout.inflate(getContext(), R.layout.payment_sdk_card_form_fields, this);
        this.f123b = (CardEditText) findViewById(R.id.bt_card_form_card_number);
        this.f124c = (ExpirationDateEditText) findViewById(R.id.bt_card_form_expiration);
        this.f125d = (CvvEditText) findViewById(R.id.bt_card_form_cvv);
        this.f126e = (CardholderNameEditText) findViewById(R.id.bt_card_form_cardholder_name);
        this.f122a = new ArrayList();
        setListeners(this.f126e);
        setListeners(this.f123b);
        setListeners(this.f124c);
        setListeners(this.f125d);
        this.f123b.setOnCardTypeChangedListener(this);
    }

    private void a(int i2, String str) {
        TextView textView = (TextView) findViewById(i2);
        if (str == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    private void a(View view, boolean z2) {
        view.setVisibility(z2 ? 0 : 8);
    }

    private void a(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }

    private void a(l.a aVar, boolean z2) {
        a((View) aVar, z2);
        if (aVar.getTextInputLayoutParent() != null) {
            a(aVar.getTextInputLayoutParent(), z2);
        }
        if (z2) {
            this.f122a.add(aVar);
        } else {
            this.f122a.remove(aVar);
        }
    }

    private void c() {
        if (this.f126e.isFocused()) {
            a(R.id.bt_card_form_cardholder_error, (String) null);
        }
        if (this.f123b.isFocused()) {
            a(R.id.bt_card_form_card_number_error, (String) null);
        }
        if (this.f124c.isFocused()) {
            a(R.id.bt_card_form_expiration_error, (String) null);
        }
        if (this.f125d.isFocused()) {
            a(R.id.bt_card_form_cvv_error, (String) null);
        }
    }

    private void setListeners(EditText editText) {
        editText.addTextChangedListener(this);
    }

    public CardForm a(int i2) {
        this.f130i = i2;
        return this;
    }

    public CardForm a(boolean z2) {
        this.f127f = z2;
        return this;
    }

    @Override // com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.a
    public void a(k.b bVar) {
        this.f125d.setCardType(bVar);
        CardEditText.a aVar = this.f136o;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        c();
    }

    public CardForm b(boolean z2) {
        this.f129h = z2;
        return this;
    }

    public boolean b() {
        boolean z2;
        int i2;
        String str = null;
        boolean z3 = true;
        if (this.f130i == 2) {
            z2 = this.f126e.d();
            if (this.f126e.d()) {
                a(R.id.bt_card_form_cardholder_error, (String) null);
            } else {
                a(R.id.bt_card_form_cardholder_error, this.f126e.getErrorMessage());
            }
        } else {
            z2 = true;
        }
        if (this.f127f) {
            z2 = z2 && this.f123b.d();
            if (this.f123b.d()) {
                a(R.id.bt_card_form_card_number_error, (String) null);
            } else {
                a(R.id.bt_card_form_card_number_error, this.f123b.getErrorMessage());
            }
        }
        if (this.f128g) {
            z2 = z2 && this.f124c.d();
            if (this.f124c.d()) {
                a(R.id.bt_card_form_expiration_error, (String) null);
            } else {
                a(R.id.bt_card_form_expiration_error, this.f124c.getErrorMessage());
            }
        }
        if (this.f129h) {
            z3 = (z2 && this.f125d.d()) ? false : false;
            if (this.f125d.d()) {
                i2 = R.id.bt_card_form_cvv_error;
            } else {
                i2 = R.id.bt_card_form_cvv_error;
                str = this.f125d.getErrorMessage();
            }
            a(i2, str);
            return z3;
        }
        return z2;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public CardForm c(boolean z2) {
        this.f128g = z2;
        return this;
    }

    public CardForm d(boolean z2) {
        this.f123b.setHideScanDrawable(z2);
        return this;
    }

    public CardEditText getCardEditText() {
        return this.f123b;
    }

    public String getCardNumber() {
        return this.f123b.getText().toString();
    }

    public String getCardholderName() {
        return this.f126e.getText().toString();
    }

    public CardholderNameEditText getCardholderNameEditText() {
        return this.f126e;
    }

    public String getCvv() {
        return this.f125d.getText().toString();
    }

    public CvvEditText getCvvEditText() {
        return this.f125d;
    }

    public ExpirationDateEditText getExpirationDateEditText() {
        return this.f124c;
    }

    public String getExpirationMonth() {
        return this.f124c.getMonth();
    }

    public String getExpirationYear() {
        return this.f124c.getYear();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j.a aVar = this.f135n;
        if (aVar != null) {
            aVar.a(view);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        b bVar;
        if (i2 != 2 || (bVar = this.f134m) == null) {
            return false;
        }
        bVar.a();
        return true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        j.a aVar;
        if (!z2 || (aVar = this.f135n) == null) {
            return;
        }
        aVar.a(view);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void setCardNumberError(String str) {
        if (this.f127f) {
            this.f123b.setError(str);
            a(this.f123b);
        }
    }

    public void setCardholderNameError(String str) {
        if (this.f130i == 2) {
            this.f126e.setError(str);
            if (this.f123b.isFocused() || this.f124c.isFocused() || this.f125d.isFocused()) {
                return;
            }
            a(this.f126e);
        }
    }

    public void setCvvError(String str) {
        if (this.f129h) {
            this.f125d.setError(str);
            if (this.f123b.isFocused() || this.f124c.isFocused()) {
                return;
            }
            a(this.f125d);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        this.f126e.setEnabled(z2);
        this.f123b.setEnabled(z2);
        this.f124c.setEnabled(z2);
        this.f125d.setEnabled(z2);
    }

    public void setExpirationError(String str) {
        if (this.f128g) {
            this.f124c.setError(str);
            if (this.f123b.isFocused()) {
                return;
            }
            a(this.f124c);
        }
    }

    public void setOnCardFormSubmitListener(b bVar) {
        this.f134m = bVar;
    }

    public void setOnCardFormValidListener(c cVar) {
        this.f133l = cVar;
    }

    public void setOnCardTypeChangedListener(CardEditText.a aVar) {
        this.f136o = aVar;
    }

    public void setOnFormFieldFocusedListener(j.a aVar) {
        this.f135n = aVar;
    }

    public void setup(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().setFlags(8192, 8192);
        boolean z2 = this.f130i != 0;
        e.a(fragmentActivity);
        a((l.a) this.f126e, z2);
        a((l.a) this.f123b, this.f127f);
        a((l.a) this.f124c, this.f128g);
        a((l.a) this.f125d, this.f129h);
        for (int i2 = 0; i2 < this.f122a.size(); i2++) {
            l.a aVar = this.f122a.get(i2);
            if (i2 == this.f122a.size() - 1) {
                aVar.setImeOptions(2);
                aVar.setOnEditorActionListener(this);
            } else {
                aVar.setImeOptions(5);
                aVar.setImeActionLabel(null, 1);
                aVar.setOnEditorActionListener(null);
            }
        }
        setVisibility(0);
    }
}