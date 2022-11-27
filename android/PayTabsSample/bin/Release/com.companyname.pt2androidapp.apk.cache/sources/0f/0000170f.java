package n0;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0004\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\n¨\u0006\u000f"}, d2 = {"Ln0/a;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "Ll0/a;", "a", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "config", "transactionDetails", "", "savedCard", "", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends AndroidViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final Application f358a;

    /* renamed from: b  reason: collision with root package name */
    private final k0.a f359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.f358a = app;
        this.f359b = new k0.a(app);
    }

    private final l0.a a(PaymentSdkTransactionDetails paymentSdkTransactionDetails) {
        if (paymentSdkTransactionDetails != null && Intrinsics.areEqual(paymentSdkTransactionDetails.isSuccess(), Boolean.TRUE)) {
            String token = paymentSdkTransactionDetails.getToken();
            String transactionReference = paymentSdkTransactionDetails.getTransactionReference();
            PaymentSdkPaymentInfo paymentInfo = paymentSdkTransactionDetails.getPaymentInfo();
            String cardScheme = paymentInfo != null ? paymentInfo.getCardScheme() : null;
            PaymentSdkPaymentInfo paymentInfo2 = paymentSdkTransactionDetails.getPaymentInfo();
            String cardType = paymentInfo2 != null ? paymentInfo2.getCardType() : null;
            PaymentSdkPaymentInfo paymentInfo3 = paymentSdkTransactionDetails.getPaymentInfo();
            String paymentDescription = paymentInfo3 != null ? paymentInfo3.getPaymentDescription() : null;
            if (token == null || transactionReference == null || cardScheme == null || cardType == null || paymentDescription == null) {
                return null;
            }
            return new l0.a(token, transactionReference, cardScheme, cardType, paymentDescription);
        }
        return null;
    }

    public final List<l0.a> a() {
        return this.f359b.a();
    }

    public final void a(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, PaymentSdkTransactionDetails paymentSdkTransactionDetails) {
        l0.a a2;
        boolean z2 = true;
        if (!((paymentSdkConfigurationDetails == null || !paymentSdkConfigurationDetails.getShowSaveCardsUI$paymentsdk_release()) ? false : false) || (a2 = a(paymentSdkTransactionDetails)) == null || this.f359b.a().contains(a2)) {
            return;
        }
        this.f359b.a(a2);
    }

    public final void a(l0.a savedCard) {
        Intrinsics.checkNotNullParameter(savedCard, "savedCard");
        this.f359b.b(savedCard);
    }
}