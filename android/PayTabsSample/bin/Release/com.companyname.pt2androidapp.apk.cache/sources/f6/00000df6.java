package com.payment.paymentsdk.sharedclasses.model.response;

import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPaymentSdkTransactionDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorResponseBodyKt {
    public static final PaymentSdkTransactionDetails toPaymentSdkTransactionDetails(ErrorResponseBody errorResponseBody) {
        Intrinsics.checkNotNullParameter(errorResponseBody, "<this>");
        return new PaymentSdkTransactionDetails(null, null, null, null, null, null, null, null, null, null, errorResponseBody.getCode(), errorResponseBody.getMsg(), null, null, null, Boolean.FALSE, null, null, null, null, 1012735, null);
    }
}