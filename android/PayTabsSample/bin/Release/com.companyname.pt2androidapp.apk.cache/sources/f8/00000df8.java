package com.payment.paymentsdk.sharedclasses.model.response;

import com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPaymentSdkPaymentInfo", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentInfoKt {
    public static final PaymentSdkPaymentInfo toPaymentSdkPaymentInfo(PaymentInfo paymentInfo) {
        Intrinsics.checkNotNullParameter(paymentInfo, "<this>");
        return new PaymentSdkPaymentInfo(paymentInfo.getCardScheme(), paymentInfo.getCardType(), paymentInfo.getPaymentDescription());
    }
}