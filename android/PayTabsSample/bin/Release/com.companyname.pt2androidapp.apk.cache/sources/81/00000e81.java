package f0;

import com.google.gson.Gson;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetailsKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetailsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.b;
import t0.d;
import u0.c;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0004\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lf0/a;", "", "", "samPayToken", "a", "Lt0/b;", "deviceInfo", "Lt0/d;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "<init>", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f190a;

    /* renamed from: b  reason: collision with root package name */
    private b f191b;

    /* renamed from: c  reason: collision with root package name */
    private c f192c;

    public a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        this.f190a = ptConfigData;
    }

    public final a a(String str) {
        this.f192c = (c) new Gson().fromJson(str, c.class);
        return this;
    }

    public final a a(b bVar) {
        this.f191b = bVar;
        return this;
    }

    public final d a() {
        PaymentSdkBillingDetails billingDetails = this.f190a.getBillingDetails();
        v0.a customerDetails$default = billingDetails != null ? PaymentSdkBillingDetailsKt.customerDetails$default(billingDetails, this.f190a.getCustomerIp(), null, 2, null) : null;
        PaymentSdkShippingDetails shippingDetails = this.f190a.getShippingDetails();
        v0.c shippingDetails2 = shippingDetails != null ? PaymentSdkShippingDetailsKt.toShippingDetails(shippingDetails) : null;
        Double amount = this.f190a.getAmount();
        String currencyCode = this.f190a.getCurrencyCode();
        String cartId = this.f190a.getCartId();
        String cartDescription = this.f190a.getCartDescription();
        String transactionClass = this.f190a.getTransactionClass();
        String transactionType = this.f190a.getTransactionType();
        return new d(this.f190a.getCallback(), null, null, amount, currencyCode, cartDescription, cartId, customerDetails$default, String.valueOf(this.f190a.getLocale()), this.f190a.getProfileId(), null, shippingDetails2, transactionClass, transactionType, this.f192c, null, null, null, this.f191b, 230404, null);
    }
}