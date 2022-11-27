package a;

import com.payment.paymentsdk.integrationmodels.PaymentSdkApms;
import com.payment.paymentsdk.integrationmodels.PaymentSdkApmsKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetailsKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetailsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t0.b;
import t0.d;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0004\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0006\u0010\u0004\u001a\u00020\b¨\u0006\r"}, d2 = {"La/a;", "", "Lt0/b;", "deviceInfo", "a", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkApms;", "apms", "Lt0/d;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "<init>", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f3a;

    /* renamed from: b  reason: collision with root package name */
    private b f4b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f5c;

    public a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        this.f3a = ptConfigData;
        this.f5c = CollectionsKt.emptyList();
    }

    public final a a(List<? extends PaymentSdkApms> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (PaymentSdkApms paymentSdkApms : list) {
                arrayList.add(PaymentSdkApmsKt.getName(paymentSdkApms));
            }
        } else {
            arrayList = null;
        }
        this.f5c = arrayList;
        return this;
    }

    public final a a(b bVar) {
        this.f4b = bVar;
        return this;
    }

    public final d a() {
        Double amount = this.f3a.getAmount();
        String currencyCode = this.f3a.getCurrencyCode();
        String cartId = this.f3a.getCartId();
        String cartDescription = this.f3a.getCartDescription();
        String transactionClass = this.f3a.getTransactionClass();
        String transactionType = this.f3a.getTransactionType();
        String valueOf = String.valueOf(this.f3a.getLocale());
        String profileId = this.f3a.getProfileId();
        b bVar = this.f4b;
        List<String> list = this.f5c;
        String callback = this.f3a.getCallback();
        PaymentSdkBillingDetails billingDetails = this.f3a.getBillingDetails();
        v0.a customerDetails$default = billingDetails != null ? PaymentSdkBillingDetailsKt.customerDetails$default(billingDetails, "255.255.255.255", null, 2, null) : null;
        PaymentSdkShippingDetails shippingDetails = this.f3a.getShippingDetails();
        return new d(callback, null, list, amount, currencyCode, cartDescription, cartId, customerDetails$default, valueOf, profileId, null, shippingDetails != null ? PaymentSdkShippingDetailsKt.toShippingDetails(shippingDetails) : null, transactionClass, transactionType, null, null, null, null, bVar, 246784, null);
    }
}