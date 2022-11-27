package y0;

import com.payment.paymentsdk.PaymentSdkParams;
import com.payment.paymentsdk.integrationmodels.PaymentSdkApms;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import w0.a;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\n\u0010\rJ\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0002J*\u0010\n\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\"\u0010\n\u001a\u00020\u001f2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u0010\u0010\n\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u0004¨\u0006%"}, d2 = {"Ly0/a;", "", "", "merchantCountry", "", "f", "customerIp", "e", "isSamsungPay", "b", "a", "", "amount", "(Ljava/lang/Double;)Z", "currencyCode", "cartDescription", "cartId", "c", "serverKey", "h", "clientKey", "d", "profileId", "g", "Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;", "savedCardInfo", "requestCVV", "showSavedCardsUI", "hasSavedCards", PaymentSdkParams.TOKEN, "isApms", "", "Lw0/a;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "configData", "<init>", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f556a;

    /* renamed from: b  reason: collision with root package name */
    private w0.a f557b;

    /* renamed from: c  reason: collision with root package name */
    private final b f558c;

    /* renamed from: d  reason: collision with root package name */
    private final b f559d;

    public a(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        this.f556a = paymentSdkConfigurationDetails;
        this.f558c = new b(paymentSdkConfigurationDetails != null ? paymentSdkConfigurationDetails.getBillingDetails() : null, false);
        this.f559d = new b(paymentSdkConfigurationDetails != null ? paymentSdkConfigurationDetails.getShippingDetails() : null, true);
    }

    public static /* synthetic */ void a(a aVar, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        aVar.a(z2, z3, z4);
    }

    private final boolean a() {
        return !b.a(this.f559d, null, false, 3, null) && b();
    }

    private final boolean a(PaymentSDKSavedCardInfo paymentSDKSavedCardInfo, boolean z2, boolean z3, boolean z4) {
        return !z3 && z2 && paymentSDKSavedCardInfo == null;
    }

    private final boolean a(Double d2) {
        return Intrinsics.areEqual(d2, 0.0d);
    }

    private final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return str != null && str.length() == 3;
        }
        return false;
    }

    private final boolean a(String str, boolean z2, boolean z3, boolean z4) {
        return !z3 && z2 && str == null;
    }

    private final boolean b() {
        PaymentSdkConfigurationDetails paymentSdkConfigurationDetails = this.f556a;
        String token = paymentSdkConfigurationDetails != null ? paymentSdkConfigurationDetails.getToken() : null;
        return token == null || token.length() == 0;
    }

    private final boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean b(boolean z2) {
        return !b.a(this.f558c, null, z2, 1, null) && b();
    }

    private final boolean c(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean d(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean e(String str) {
        return Intrinsics.areEqual(str != null ? Boolean.valueOf(new Regex("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$").matches(str)) : null, Boolean.FALSE);
    }

    private final boolean f(String str) {
        return !e0.b.b(str);
    }

    private final boolean g(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean h(String str) {
        return str == null || str.length() == 0;
    }

    public final w0.a a(boolean z2) {
        if (this.f557b == null) {
            a(this, false, false, z2, 3, null);
        }
        return this.f557b;
    }

    public final void a(boolean z2, boolean z3, boolean z4) {
        w0.a aVar;
        b bVar;
        PaymentSdkConfigurationDetails paymentSdkConfigurationDetails = this.f556a;
        if (paymentSdkConfigurationDetails == null) {
            aVar = a.s.f525a;
        } else if (g(paymentSdkConfigurationDetails.getProfileId())) {
            aVar = a.t.f526a;
        } else if (h(this.f556a.getServerKey())) {
            aVar = a.w.f529a;
        } else if (d(this.f556a.getClientKey())) {
            aVar = a.p.f522a;
        } else if (c(this.f556a.getCartId())) {
            aVar = a.o.f521a;
        } else if (b(this.f556a.getCartDescription())) {
            aVar = a.n.f520a;
        } else {
            boolean z5 = false;
            if (a(this.f556a.getCurrencyCode())) {
                String currencyCode = this.f556a.getCurrencyCode();
                aVar = new a.m((currencyCode == null || currencyCode.length() == 0) ? true : true);
            } else if (a(this.f556a.getAmount())) {
                aVar = a.l.f518a;
            } else if (e(this.f556a.getCustomerIp())) {
                aVar = a.q.f523a;
            } else if (f(this.f556a.getMerchantCountry())) {
                String merchantCountry = this.f556a.getMerchantCountry();
                aVar = new a.r((merchantCountry == null || merchantCountry.length() == 0) ? true : true);
            } else {
                if (b(z2) && Intrinsics.areEqual(this.f556a.getShowBillingInfo(), Boolean.FALSE)) {
                    bVar = this.f558c;
                } else if (a() && Intrinsics.areEqual(this.f556a.getShowShippingInfo(), Boolean.FALSE) && Intrinsics.areEqual(this.f556a.getForceShippingInfoValidation(), Boolean.TRUE)) {
                    bVar = this.f559d;
                } else {
                    if (z3) {
                        List<PaymentSdkApms> alternativePaymentMethods = this.f556a.getAlternativePaymentMethods();
                        if ((alternativePaymentMethods == null || alternativePaymentMethods.isEmpty()) ? true : true) {
                            aVar = a.C0031a.f501a;
                        }
                    }
                    aVar = a(this.f556a.getSavedCardInfo$paymentsdk_release(), this.f556a.getRequest3DS$paymentsdk_release(), this.f556a.getShowSaveCardsUI$paymentsdk_release(), z4) ? a.u.f527a : a(this.f556a.getToken(), this.f556a.getRequest3DS$paymentsdk_release(), this.f556a.getShowSaveCardsUI$paymentsdk_release(), z4) ? a.v.f528a : a.b.f503a;
                }
                aVar = bVar.a();
            }
        }
        this.f557b = aVar;
    }
}