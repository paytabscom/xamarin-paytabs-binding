package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createPaymentSdkTransactionType", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionType;", "name", "", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkTransactionTypeKt {
    public static final PaymentSdkTransactionType createPaymentSdkTransactionType(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, "auth") ? PaymentSdkTransactionType.AUTH : PaymentSdkTransactionType.SALE;
    }
}