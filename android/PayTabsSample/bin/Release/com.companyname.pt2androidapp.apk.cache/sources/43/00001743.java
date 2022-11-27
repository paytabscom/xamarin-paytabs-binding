package r0;

import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lr0/a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "result", "", "returnPaymentFinishedToTheCaller", "returnCancelToTheCaller", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "returnErrorToTheCaller", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface a {
    void returnCancelToTheCaller();

    void returnErrorToTheCaller(PaymentSdkError paymentSdkError);

    void returnPaymentFinishedToTheCaller(PaymentSdkTransactionDetails paymentSdkTransactionDetails);
}