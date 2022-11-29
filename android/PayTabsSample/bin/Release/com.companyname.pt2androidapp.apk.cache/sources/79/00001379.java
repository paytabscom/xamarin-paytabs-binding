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
    private List<l.a> f134a;

    /* renamed from: b  reason: collision with root package name */
    private CardEditText f135b;

    /* renamed from: c  reason: collision with root package name */
    private ExpirationDateEditText f136c;

    /* renamed from: d  reason: collision with root package name */
    private CvvEditText f137d;

    /* renamed from: e  reason: collision with root package name */
    private CardholderNameEditText f138e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f139f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f140g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f141h;

    /* renamed from: i  reason: collision with root package name */
    private int f142i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f143j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144k;

    /* renamed from: l  reason: collision with root package name */
    private c f145l;

    /* renamed from: m  reason: collision with root package name */
    private b f146m;

    /* renamed from: n  reason: collision with root package name */
    private j.a f147n;

    /* renamed from: o  reason: collision with root package name */
    private CardEditText.a f148o;

    public CardForm(Context context) {
        super(context);
        this.f142i = 0;
        this.f143j = false;
        this.f144k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142i = 0;
        this.f143j = false;
        this.f144k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f142i = 0;
        this.f143j = false;
        this.f144k = false;
        a();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f142i = 0;
        this.f143j = false;
        this.f144k = false;
        a();
    }

    private void a() {
        setVisibility(8);
        setOrientation(1);
        LinearLayout.inflate(getContext(), R.layout.payment_sdk_card_form_fields, this);
        this.f135b = (CardEditText) findViewById(R.id.bt_card_form_card_number);
        this.f136c = (ExpirationDateEditText) findViewById(R.id.bt_card_form_expiration);
        this.f137d = (CvvEditText) findViewById(R.id.bt_card_form_cvv);
        this.f138e = (CardholderNameEditText) findViewById(R.id.bt_card_form_cardholder_name);
        this.f134a = new ArrayList();
        setListeners(this.f138e);
        setListeners(this.f135b);
        setListeners(this.f136c);
        setListeners(this.f137d);
        this.f135b.setOnCardTypeChangedListener(this);
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
            this.f134a.add(aVar);
        } else {
            this.f134a.remove(aVar);
        }
    }

    private void c() {
        if (this.f138e.isFocused()) {
            a(R.id.bt_card_form_cardholder_error, (String) null);
        }
        if (this.f135b.isFocused()) {
            a(R.id.bt_card_form_card_number_error, (String) null);
        }
        if (this.f136c.isFocused()) {
            a(R.id.bt_card_form_expiration_error, (String) null);
        }
        if (this.f137d.isFocused()) {
            a(R.id.bt_card_form_cvv_error, (String) null);
        }
    }

    private void setListeners(EditText editText) {
        editText.addTextChangedListener(this);
    }

    public CardForm a(int i2) {
        this.f142i = i2;
        return this;
    }

    public CardForm a(boolean z2) {
        this.f139f = z2;
        return this;
    }

    @Override // com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.a
    public void a(k.b bVar) {
        this.f137d.setCardType(bVar);
        CardEditText.a aVar = this.f148o;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        c();
    }

    public CardForm b(boolean z2) {
        this.f141h = z2;
        return this;
    }

    public boolean b() {
        boolean z2;
        int i2;
        String str = null;
        boolean z3 = true;
        if (this.f142i == 2) {
            z2 = this.f138e.d();
            if (this.f138e.d()) {
                a(R.id.bt_card_form_cardholder_error, (String) null);
            } else {
                a(R.id.bt_card_form_cardholder_error, this.f138e.getErrorMessage());
            }
        } else {
            z2 = true;
        }
        if (this.f139f) {
            z2 = z2 && this.f135b.d();
            if (this.f135b.d()) {
                a(R.id.bt_card_form_card_number_error, (String) null);
            } else {
                a(R.id.bt_card_form_card_number_error, this.f135b.getErrorMessage());
            }
        }
        if (this.f140g) {
            z2 = z2 && this.f136c.d();
            if (this.f136c.d()) {
                a(R.id.bt_card_form_expiration_error, (String) null);
            } else {
                a(R.id.bt_card_form_expiration_error, this.f136c.getErrorMessage());
            }
        }
        if (this.f141h) {
            if (!z2 || !this.f137d.d()) {
                z3 = false;
            }
            if (this.f137d.d()) {
                i2 = R.id.bt_card_form_cvv_error;
            } else {
                i2 = R.id.bt_card_form_cvv_error;
                str = this.f137d.getErrorMessage();
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
        this.f140g = z2;
        return this;
    }

    public CardForm d(boolean z2) {
        this.f135b.setHideScanDrawable(z2);
        return this;
    }

    public CardEditText getCardEditText() {
        return this.f135b;
    }

    public String getCardNumber() {
        return this.f135b.getText().toString();
    }

    public String getCardholderName() {
        return this.f138e.getText().toString();
    }

    public CardholderNameEditText getCardholderNameEditText() {
        return this.f138e;
    }

    public String getCvv() {
        return this.f137d.getText().toString();
    }

    public CvvEditText getCvvEditText() {
        return this.f137d;
    }

    public ExpirationDateEditText getExpirationDateEditText() {
        return this.f136c;
    }

    public String getExpirationMonth() {
        return this.f136c.getMonth();
    }

    public String getExpirationYear() {
        return this.f136c.getYear();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j.a aVar = this.f147n;
        if (aVar != null) {
            aVar.a(view);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        b bVar;
        if (i2 != 2 || (bVar = this.f146m) == null) {
            return false;
        }
        bVar.a();
        return true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        j.a aVar;
        if (!z2 || (aVar = this.f147n) == null) {
            return;
        }
        aVar.a(view);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void setCardNumberError(String str) {
        if (this.f139f) {
            this.f135b.setError(str);
            a(this.f135b);
        }
    }

    public void setCardholderNameError(String str) {
        if (this.f142i == 2) {
            this.f138e.setError(str);
            if (this.f135b.isFocused() || this.f136c.isFocused() || this.f137d.isFocused()) {
                return;
            }
            a(this.f138e);
        }
    }

    public void setCvvError(String str) {
        if (this.f141h) {
            this.f137d.setError(str);
            if (this.f135b.isFocused() || this.f136c.isFocused()) {
                return;
            }
            a(this.f137d);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        this.f138e.setEnabled(z2);
        this.f135b.setEnabled(z2);
        this.f136c.setEnabled(z2);
        this.f137d.setEnabled(z2);
    }

    public void setExpirationError(String str) {
        if (this.f140g) {
            this.f136c.setError(str);
            if (this.f135b.isFocused()) {
                return;
            }
            a(this.f136c);
        }
    }

    public void setOnCardFormSubmitListener(b bVar) {
        this.f146m = bVar;
    }

    public void setOnCardFormValidListener(c cVar) {
        this.f145l = cVar;
    }

    public void setOnCardTypeChangedListener(CardEditText.a aVar) {
        this.f148o = aVar;
    }

    public void setOnFormFieldFocusedListener(j.a aVar) {
        this.f147n = aVar;
    }

    public void setup(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().setFlags(8192, 8192);
        boolean z2 = this.f142i != 0;
        e.a(fragmentActivity);
        a((l.a) this.f138e, z2);
        a((l.a) this.f135b, this.f139f);
        a((l.a) this.f136c, this.f140g);
        a((l.a) this.f137d, this.f141h);
        for (int i2 = 0; i2 < this.f134a.size(); i2++) {
            l.a aVar = this.f134a.get(i2);
            if (i2 == this.f134a.size() - 1) {
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