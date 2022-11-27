package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.payment.paymentsdk.R;
import k.d;

/* loaded from: classes.dex */
public class a extends TextInputEditText {

    /* renamed from: a  reason: collision with root package name */
    private Animation f294a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f295b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f296c;

    public a(Context context) {
        super(context);
        b();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    private void b() {
        this.f294a = AnimationUtils.loadAnimation(getContext(), R.anim.payment_sdk_error_animation);
        this.f295b = false;
    }

    private TextView getErrorTextView() {
        View view = (View) getParent().getParent();
        TextView textView = (TextView) view.findViewById(R.id.bt_card_form_cardholder_error);
        TextView textView2 = (TextView) view.findViewById(R.id.bt_card_form_card_number_error);
        TextView textView3 = (TextView) view.findViewById(R.id.bt_card_form_cvv_error);
        return textView != null ? textView : textView2 != null ? textView2 : textView3 != null ? textView3 : (TextView) view.findViewById(R.id.bt_card_form_expiration_error);
    }

    public View a() {
        View focusSearch;
        if (getImeActionId() == 2) {
            return null;
        }
        try {
            focusSearch = focusSearch(2);
        } catch (IllegalArgumentException unused) {
            focusSearch = focusSearch(130);
        }
        if (focusSearch == null || !focusSearch.requestFocus()) {
            return null;
        }
        return focusSearch;
    }

    public boolean c() {
        return this.f296c;
    }

    public boolean d() {
        return true;
    }

    public void e() {
        setError((d() || c()) ? null : getErrorMessage());
    }

    public String getErrorMessage() {
        return null;
    }

    public TextInputLayout getTextInputLayoutParent() {
        if (getParent() == null || !(getParent().getParent() instanceof TextInputLayout)) {
            return null;
        }
        return (TextInputLayout) getParent().getParent();
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (i3 != i4) {
            setError((String) null);
        }
    }

    public void setError(String str) {
        this.f295b = !TextUtils.isEmpty(str);
        TextInputLayout textInputLayoutParent = getTextInputLayoutParent();
        if (textInputLayoutParent != null) {
            textInputLayoutParent.setErrorEnabled(!TextUtils.isEmpty(str));
            textInputLayoutParent.setError(str);
        }
        TextView errorTextView = getErrorTextView();
        if (errorTextView != null) {
            if (str == null) {
                errorTextView.setVisibility(8);
            } else {
                errorTextView.setVisibility(0);
                errorTextView.setText(str);
            }
        }
        Animation animation = this.f294a;
        if (animation == null || !this.f295b) {
            return;
        }
        startAnimation(animation);
        d.a(getContext(), 10);
    }

    public void setFieldHint(int i2) {
        setFieldHint(getContext().getString(i2));
    }

    public void setFieldHint(String str) {
        if (getTextInputLayoutParent() != null) {
            getTextInputLayoutParent().setHint(str);
        } else {
            setHint(str);
        }
    }

    public void setOptional(boolean z2) {
        this.f296c = z2;
    }
}