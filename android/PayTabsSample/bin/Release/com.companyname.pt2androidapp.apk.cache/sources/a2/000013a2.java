package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createPaymentSdkTokenise", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "name", "", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkTokeniseKt {
    public static final PaymentSdkTokenise createPaymentSdkTokenise(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int hashCode = name.hashCode();
        if (hashCode != -1904770831) {
            if (hashCode != -846946229) {
                if (hashCode == 3387192) {
                    name.equals("none");
                } else if (hashCode == 1571091022 && name.equals("userMandatory")) {
                    return PaymentSdkTokenise.USER_MANDATORY;
                }
            } else if (name.equals("userOptional")) {
                return PaymentSdkTokenise.USER_OPTIONAL;
            }
        } else if (name.equals("merchantMandatory")) {
            return PaymentSdkTokenise.MERCHANT_MANDATORY;
        }
        return PaymentSdkTokenise.NONE;
    }
}