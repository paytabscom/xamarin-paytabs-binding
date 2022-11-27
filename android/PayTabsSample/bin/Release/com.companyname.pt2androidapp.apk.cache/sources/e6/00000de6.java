package com.payment.paymentsdk.integrationmodels;

import com.payment.paymentsdk.integrationmodels.PaymentSdkTokenFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createPaymentSdkTokenFormat", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "name", "", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkTokenFormatKt {
    public static final PaymentSdkTokenFormat createPaymentSdkTokenFormat(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        switch (name.hashCode()) {
            case 49:
                if (name.equals("1")) {
                    return new PaymentSdkTokenFormat.NoneFormat();
                }
                break;
            case 50:
                if (name.equals("2")) {
                    return new PaymentSdkTokenFormat.Hex32Format();
                }
                break;
            case 51:
                if (name.equals("3")) {
                    return new PaymentSdkTokenFormat.AlphaNum20Format();
                }
                break;
            case 52:
                if (name.equals("4")) {
                    return new PaymentSdkTokenFormat.Digit22Format();
                }
                break;
            case 53:
                if (name.equals("5")) {
                    return new PaymentSdkTokenFormat.Digit16Format();
                }
                break;
            case 54:
                if (name.equals("6")) {
                    return new PaymentSdkTokenFormat.AlphaNum32Format();
                }
                break;
        }
        return new PaymentSdkTokenFormat.Hex32Format();
    }
}