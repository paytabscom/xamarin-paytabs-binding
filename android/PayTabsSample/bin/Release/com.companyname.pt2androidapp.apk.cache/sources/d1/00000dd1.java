package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.a;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "", "ip", "nameOnCard", "Lv0/a;", "customerDetails", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkBillingDetailsKt {
    public static final a customerDetails(PaymentSdkBillingDetails paymentSdkBillingDetails, String str, String str2) {
        Intrinsics.checkNotNullParameter(paymentSdkBillingDetails, "<this>");
        return new a(paymentSdkBillingDetails.getCity(), paymentSdkBillingDetails.getCountryCode(), paymentSdkBillingDetails.getEmail(), str, str2, paymentSdkBillingDetails.getPhone(), paymentSdkBillingDetails.getState(), paymentSdkBillingDetails.getAddressLine(), paymentSdkBillingDetails.getZip());
    }

    public static /* synthetic */ a customerDetails$default(PaymentSdkBillingDetails paymentSdkBillingDetails, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = paymentSdkBillingDetails.getName();
        }
        return customerDetails(paymentSdkBillingDetails, str, str2);
    }
}