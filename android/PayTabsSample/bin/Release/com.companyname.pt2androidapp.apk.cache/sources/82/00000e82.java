package g;

import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetailsKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetailsKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionClass;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t0.d;
import v0.c;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\f\u001a\u00020\u0011¨\u0006\u0016"}, d2 = {"Lg/a;", "", "", "holderName", "e", "cvv", "b", "expYear", "d", "expMonth", "c", "cardNumber", "a", "Lt0/b;", "deviceInfo", "", "shouldTokenise", "Lt0/d;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "<init>", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f193a;

    /* renamed from: b  reason: collision with root package name */
    private t0.b f194b;

    /* renamed from: c  reason: collision with root package name */
    private String f195c;

    /* renamed from: d  reason: collision with root package name */
    private String f196d;

    /* renamed from: e  reason: collision with root package name */
    private String f197e;

    /* renamed from: f  reason: collision with root package name */
    private String f198f;

    /* renamed from: g  reason: collision with root package name */
    private String f199g;

    /* renamed from: h  reason: collision with root package name */
    private String f200h;

    public a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        this.f193a = ptConfigData;
        this.f195c = "";
        this.f196d = "";
        this.f197e = "";
        this.f198f = "";
        this.f199g = "";
    }

    public final a a(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f195c = cardNumber;
        return this;
    }

    public final a a(t0.b bVar) {
        this.f194b = bVar;
        return this;
    }

    public final a a(boolean z2) {
        this.f200h = z2 ? this.f193a.getTokenFormat() : null;
        return this;
    }

    public final d a() {
        Integer intOrNull;
        String transactionClass;
        String str = this.f198f;
        Integer intOrNull2 = StringsKt.toIntOrNull(this.f197e);
        if (StringsKt.isBlank(this.f196d)) {
            intOrNull = null;
        } else {
            intOrNull = StringsKt.toIntOrNull("20" + this.f196d);
        }
        PaymentSDKSavedCardInfo savedCardInfo$paymentsdk_release = this.f193a.getSavedCardInfo$paymentsdk_release();
        String str2 = (savedCardInfo$paymentsdk_release != null ? savedCardInfo$paymentsdk_release.getMaskedCard() : null) != null ? null : this.f195c;
        PaymentSDKSavedCardInfo savedCardInfo$paymentsdk_release2 = this.f193a.getSavedCardInfo$paymentsdk_release();
        t0.a aVar = new t0.a(str, intOrNull2, intOrNull, str2, savedCardInfo$paymentsdk_release2 != null ? savedCardInfo$paymentsdk_release2.getMaskedCard() : null);
        String str3 = this.f199g;
        if (Intrinsics.areEqual(this.f193a.getLinkBillingNameWithCardHolderName(), Boolean.FALSE)) {
            PaymentSdkBillingDetails billingDetails = this.f193a.getBillingDetails();
            if ((billingDetails != null ? billingDetails.getName() : null) != null) {
                String name = this.f193a.getBillingDetails().getName();
                if (!(name == null || name.length() == 0)) {
                    str3 = this.f193a.getBillingDetails().getName();
                    Intrinsics.checkNotNull(str3);
                }
            }
        }
        String token = this.f193a.getToken();
        PaymentSdkBillingDetails billingDetails2 = this.f193a.getBillingDetails();
        v0.a customerDetails = billingDetails2 != null ? PaymentSdkBillingDetailsKt.customerDetails(billingDetails2, this.f193a.getCustomerIp(), str3) : null;
        PaymentSdkShippingDetails shippingDetails = this.f193a.getShippingDetails();
        c shippingDetails2 = shippingDetails != null ? PaymentSdkShippingDetailsKt.toShippingDetails(shippingDetails) : null;
        Double amount = this.f193a.getAmount();
        String currencyCode = this.f193a.getCurrencyCode();
        String cartId = this.f193a.getCartId();
        String cartDescription = this.f193a.getCartDescription();
        if (this.f193a.getRequest3DS$paymentsdk_release()) {
            transactionClass = PaymentSdkTransactionClass.ECOM.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(transactionClass, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            transactionClass = this.f193a.getTransactionClass();
        }
        return new d(this.f193a.getCallback(), aVar, null, amount, currencyCode, cartDescription, cartId, customerDetails, String.valueOf(this.f193a.getLocale()), this.f193a.getProfileId(), null, shippingDetails2, transactionClass, this.f193a.getTransactionType(), null, this.f200h, token, null, this.f194b, 132100, null);
    }

    public final a b(String cvv) {
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f198f = cvv;
        return this;
    }

    public final a c(String expMonth) {
        Intrinsics.checkNotNullParameter(expMonth, "expMonth");
        this.f197e = expMonth;
        return this;
    }

    public final a d(String expYear) {
        Intrinsics.checkNotNullParameter(expYear, "expYear");
        this.f196d = expYear;
        return this;
    }

    public final a e(String holderName) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        this.f199g = holderName;
        return this;
    }
}