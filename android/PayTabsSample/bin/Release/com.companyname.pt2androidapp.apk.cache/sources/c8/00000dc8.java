package com.payment.paymentsdk.creditcard.view.customs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.payment.paymentsdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z.c;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b\u001d\u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0010\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/payment/paymentsdk/creditcard/view/customs/PaytabsEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "a", "", "inputType", "setInputType", "(Ljava/lang/Integer;)V", "", "errorString", "setError", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "tvError", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaytabsEditText extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    private ConstraintLayout f158a;

    /* renamed from: b  reason: collision with root package name */
    public EditText f159b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaytabsEditText(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaytabsEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaytabsEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, attributeSet);
    }

    private final void a() {
        getEditText().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(getContext(), R.drawable.payment_sdk_ic_arrow_down), (Drawable) null);
        getEditText().setFocusable(false);
        getEditText().setFocusableInTouchMode(false);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.payment_sdk_custom_input_field, (ViewGroup) this, true);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f158a = constraintLayout;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
            constraintLayout = null;
        }
        setEditText((EditText) c.a((View) constraintLayout, R.id.payment_sdk_tiet_input_field));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PaytabsEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…           0, 0\n        )");
        try {
            ConstraintLayout constraintLayout3 = this.f158a;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
                constraintLayout3 = null;
            }
            TextView textView = (TextView) c.a((View) constraintLayout3, R.id.payment_sdk_tv_input_field_label);
            ConstraintLayout constraintLayout4 = this.f158a;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
            } else {
                constraintLayout2 = constraintLayout4;
            }
            this.f160c = (TextView) c.a((View) constraintLayout2, R.id.payment_sdk_tv_input_field_error);
            textView.setText(obtainStyledAttributes.getString(R.styleable.PaytabsEditText_pet_label));
            getEditText().setHint(obtainStyledAttributes.getString(R.styleable.PaytabsEditText_pet_hint));
            getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(obtainStyledAttributes.getInteger(R.styleable.PaytabsEditText_pet_maxLength, 50))});
            setInputType(Integer.valueOf(obtainStyledAttributes.getInteger(R.styleable.PaytabsEditText_pet_inputType, -1)));
            if (obtainStyledAttributes.getBoolean(R.styleable.PaytabsEditText_pet_isDropDown, false)) {
                a();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setInputType(Integer num) {
        EditText editText;
        int i2 = 1;
        if (num != null && num.intValue() == 1) {
            editText = getEditText();
            i2 = 2;
        } else if (num == null || num.intValue() != 0) {
            return;
        } else {
            editText = getEditText();
        }
        editText.setInputType(i2);
    }

    public final EditText getEditText() {
        EditText editText = this.f159b;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editText");
        return null;
    }

    public final void setEditText(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.f159b = editText;
    }

    public final void setError(String str) {
        TextView textView = null;
        if (str == null || str.length() == 0) {
            TextView textView2 = this.f160c;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvError");
            } else {
                textView = textView2;
            }
            c.a(textView);
            return;
        }
        TextView textView3 = this.f160c;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvError");
            textView3 = null;
        }
        c.c(textView3);
        TextView textView4 = this.f160c;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvError");
        } else {
            textView = textView4;
        }
        textView.setText(str);
    }
}