package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "Lv0/c;", "toShippingDetails", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkShippingDetailsKt {
    public static final c toShippingDetails(PaymentSdkShippingDetails paymentSdkShippingDetails) {
        Intrinsics.checkNotNullParameter(paymentSdkShippingDetails, "<this>");
        return new c(paymentSdkShippingDetails.getCity(), paymentSdkShippingDetails.getCountryCode(), paymentSdkShippingDetails.getEmail(), "", paymentSdkShippingDetails.getName(), paymentSdkShippingDetails.getPhone(), paymentSdkShippingDetails.getState(), paymentSdkShippingDetails.getAddressLine(), paymentSdkShippingDetails.getZip());
    }
}