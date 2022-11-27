package com.payment.paymentsdk.creditcard.view.cardform.view;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f141a;

    /* renamed from: b  reason: collision with root package name */
    private Pattern f142b = Pattern.compile("[0-9]");

    private a(StringBuilder sb) {
        this.f141a = sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(int i2) {
        return a(new StringBuilder(i2));
    }

    static a a(StringBuilder sb) {
        return new a(sb);
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int i6 = 0;
        this.f141a.setLength(0);
        int length = charSequence.length();
        while (i6 < length) {
            int i7 = i6 + 1;
            CharSequence subSequence = charSequence.subSequence(i6, i7);
            if (this.f142b.matcher(subSequence).matches()) {
                this.f141a.append(subSequence);
            }
            i6 = i7;
        }
        return this.f141a.toString();
    }
}