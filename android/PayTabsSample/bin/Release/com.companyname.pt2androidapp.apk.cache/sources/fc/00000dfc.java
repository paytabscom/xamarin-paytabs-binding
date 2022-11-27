package com.payment.paymentsdk.sharedclasses.model.response;

import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo;
import com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentResult;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.a;
import v0.b;
import v0.c;
import v0.d;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPaymentSdkTransactionDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionResponseBodyKt {
    public static final PaymentSdkTransactionDetails toPaymentSdkTransactionDetails(TransactionResponseBody transactionResponseBody) {
        int hashCode;
        Intrinsics.checkNotNullParameter(transactionResponseBody, "<this>");
        PaymentResult paymentResult = transactionResponseBody.getPaymentResult();
        boolean areEqual = Intrinsics.areEqual(paymentResult != null ? paymentResult.getResponseStatus() : null, "A");
        PaymentResult paymentResult2 = transactionResponseBody.getPaymentResult();
        boolean areEqual2 = Intrinsics.areEqual(paymentResult2 != null ? paymentResult2.getResponseStatus() : null, "P");
        PaymentResult paymentResult3 = transactionResponseBody.getPaymentResult();
        boolean areEqual3 = Intrinsics.areEqual(paymentResult3 != null ? paymentResult3.getResponseStatus() : null, "H");
        boolean z2 = true;
        boolean z3 = transactionResponseBody.getPaymentResult() != null;
        PaymentResult paymentResult4 = transactionResponseBody.getPaymentResult();
        String responseStatus = paymentResult4 != null ? paymentResult4.getResponseStatus() : null;
        if (responseStatus == null || ((hashCode = responseStatus.hashCode()) == 65 ? !responseStatus.equals("A") : !(hashCode == 72 ? responseStatus.equals("H") : hashCode == 80 && responseStatus.equals("P")))) {
            z2 = false;
        }
        String tranRef = transactionResponseBody.getTranRef();
        String tranType = transactionResponseBody.getTranType();
        String cartId = transactionResponseBody.getCartId();
        String cartDescription = transactionResponseBody.getCartDescription();
        String cartCurrency = transactionResponseBody.getCartCurrency();
        String cartAmount = transactionResponseBody.getCartAmount();
        PaymentResult paymentResult5 = transactionResponseBody.getPaymentResult();
        String responseMessage = paymentResult5 != null ? paymentResult5.getResponseMessage() : null;
        PaymentResult paymentResult6 = transactionResponseBody.getPaymentResult();
        PaymentSdkPaymentResult paymentSdkPaymentResult = paymentResult6 != null ? PaymentResultKt.toPaymentSdkPaymentResult(paymentResult6) : null;
        PaymentInfo paymentInfo = transactionResponseBody.getPaymentInfo();
        PaymentSdkPaymentInfo paymentSdkPaymentInfo = paymentInfo != null ? PaymentInfoKt.toPaymentSdkPaymentInfo(paymentInfo) : null;
        String redirectUrl = transactionResponseBody.getRedirectUrl();
        String code = transactionResponseBody.getCode();
        String message = transactionResponseBody.getMessage();
        String token = transactionResponseBody.getToken();
        a customerDetails = transactionResponseBody.getCustomerDetails();
        PaymentSdkBillingDetails a2 = customerDetails != null ? b.a(customerDetails) : null;
        c shippingDetails = transactionResponseBody.getShippingDetails();
        return new PaymentSdkTransactionDetails(tranRef, tranType, cartId, cartDescription, cartCurrency, cartAmount, responseMessage, paymentSdkPaymentResult, paymentSdkPaymentInfo, redirectUrl, code, message, token, a2, shippingDetails != null ? d.a(shippingDetails) : null, Boolean.valueOf(z2), Boolean.valueOf(areEqual), Boolean.valueOf(areEqual2), Boolean.valueOf(areEqual3), Boolean.valueOf(z3));
    }
}