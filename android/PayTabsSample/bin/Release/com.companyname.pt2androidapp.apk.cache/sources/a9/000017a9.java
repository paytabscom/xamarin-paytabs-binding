package z0;

import com.payment.paymentsdk.PaymentSdkParams;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionClass;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.b;
import t0.d;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0004\u001a\u00020\u000b¨\u0006\u0010"}, d2 = {"Lz0/a;", "", "", PaymentSdkParams.TOKEN, "a", "Lt0/b;", "deviceInfo", "tokenFormat", "b", "transRef", "c", "Lt0/d;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "<init>", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f567a;

    /* renamed from: b  reason: collision with root package name */
    private b f568b;

    /* renamed from: c  reason: collision with root package name */
    private String f569c;

    /* renamed from: d  reason: collision with root package name */
    private String f570d;

    /* renamed from: e  reason: collision with root package name */
    private String f571e;

    public a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        this.f567a = ptConfigData;
    }

    public final d a() {
        Double amount = this.f567a.getAmount();
        String currencyCode = this.f567a.getCurrencyCode();
        String cartId = this.f567a.getCartId();
        String cartDescription = this.f567a.getCartDescription();
        String name = PaymentSdkTransactionClass.RECURRING.name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String transactionType = this.f567a.getTransactionType();
        String valueOf = String.valueOf(this.f567a.getLocale());
        String profileId = this.f567a.getProfileId();
        String str = this.f569c;
        return new d(this.f567a.getCallback(), null, null, amount, currencyCode, cartDescription, cartId, null, valueOf, profileId, null, null, lowerCase, transactionType, null, this.f570d, str, this.f571e, this.f568b, 19588, null);
    }

    public final a a(String str) {
        this.f569c = str;
        return this;
    }

    public final a a(b bVar) {
        this.f568b = bVar;
        return this;
    }

    public final a b(String str) {
        this.f570d = str;
        return this;
    }

    public final a c(String str) {
        this.f571e = str;
        return this;
    }
}