package com.payment.paymentsdk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.payment.paymentsdk.integrationmodels.PaymentSdkApms;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkLanguageCode;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTokenFormat;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTokenise;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionClass;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionType;
import e0.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u00109\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020\b\u0012\u0006\u0010=\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020\b¢\u0006\u0004\bi\u0010jJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\bJ\u0010\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\bJ\u0018\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\rJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\rJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\rJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\rJ\u0014\u00101\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.J\u001c\u00104\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\bH\u0007J\u0006\u00106\u001a\u000205R\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00108R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00108R\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00108R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00108R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00108R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010ER\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010ER\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010ER\u0018\u0010Y\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00108R\u0018\u00102\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00108R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00108R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00108R\u0018\u0010b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00108R\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020/0c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00108¨\u0006k"}, d2 = {"Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "shippingData", "setShippingData", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "billingData", "setBillingData", "", "cartId", "setCartId", "cartDescription", "setCartDescription", "", "hideCardScanner", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionType;", "transactionType", "setTransactionType", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;", "transactionClass", "setTransactionClass", "screenTitle", "setScreenTitle", "ip", "setServerIp", "merchantCountyCode", "setMerchantCountryCode", "Landroid/graphics/drawable/Drawable;", "logo", "setMerchantIcon", "url", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "locale", "setLanguageCode", "setCallback", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "tokeniseType", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "tokenFormat", "setTokenise", "showBillingInfo", "linkBillingNameWithCardHolderName", "linkBillingNameWithCard", "showShippingInfo", "forceShippingDataValidation", "forceShippingInfo", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkApms;", "apms", "setAlternativePaymentMethods", PaymentSdkParams.TOKEN, "transactionReference", "setTokenisationData", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "build", "a", "Ljava/lang/String;", "profileId", "b", "serverKey", "c", "clientKey", "", "d", "D", "amount", "e", "currencyCode", "f", "Z", "g", "h", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "i", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "j", "k", "l", "m", "n", "o", "p", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "q", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "r", "s", "t", "u", "tokenFormatValue", "v", "w", "Landroid/graphics/Bitmap;", "x", "Landroid/graphics/Bitmap;", "y", "logoUrl", "z", "merchantCountry", "", "A", "Ljava/util/List;", "alternativePaymentMethods", "B", "callbackUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkConfigBuilder {
    private List<PaymentSdkApms> A;
    private String B;

    /* renamed from: a  reason: collision with root package name */
    private final String f66a;

    /* renamed from: b  reason: collision with root package name */
    private final String f67b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68c;

    /* renamed from: d  reason: collision with root package name */
    private final double f69d;

    /* renamed from: e  reason: collision with root package name */
    private final String f70e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f72g;

    /* renamed from: h  reason: collision with root package name */
    private PaymentSdkBillingDetails f73h;

    /* renamed from: i  reason: collision with root package name */
    private PaymentSdkShippingDetails f74i;

    /* renamed from: j  reason: collision with root package name */
    private String f75j;

    /* renamed from: k  reason: collision with root package name */
    private String f76k;

    /* renamed from: l  reason: collision with root package name */
    private String f77l;

    /* renamed from: m  reason: collision with root package name */
    private String f78m;

    /* renamed from: n  reason: collision with root package name */
    private String f79n;

    /* renamed from: o  reason: collision with root package name */
    private String f80o;

    /* renamed from: p  reason: collision with root package name */
    private PaymentSdkLanguageCode f81p;

    /* renamed from: q  reason: collision with root package name */
    private PaymentSdkTokenise f82q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f83r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f84s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f85t;

    /* renamed from: u  reason: collision with root package name */
    private String f86u;

    /* renamed from: v  reason: collision with root package name */
    private String f87v;

    /* renamed from: w  reason: collision with root package name */
    private String f88w;

    /* renamed from: x  reason: collision with root package name */
    private Bitmap f89x;

    /* renamed from: y  reason: collision with root package name */
    private String f90y;

    /* renamed from: z  reason: collision with root package name */
    private String f91z;

    public PaymentSdkConfigBuilder(String profileId, String serverKey, String clientKey, double d2, String currencyCode) {
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(serverKey, "serverKey");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f66a = profileId;
        this.f67b = serverKey;
        this.f68c = clientKey;
        this.f69d = d2;
        this.f70e = currencyCode;
        this.f72g = true;
        String name = PaymentSdkTransactionType.SALE.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f77l = lowerCase;
        String lowerCase2 = PaymentSdkTransactionClass.ECOM.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f78m = lowerCase2;
        this.f80o = "255.255.255.255";
        this.f82q = PaymentSdkTokenise.NONE;
        this.f84s = true;
        this.A = new ArrayList();
    }

    public static /* synthetic */ PaymentSdkConfigBuilder setTokenise$default(PaymentSdkConfigBuilder paymentSdkConfigBuilder, PaymentSdkTokenise paymentSdkTokenise, PaymentSdkTokenFormat paymentSdkTokenFormat, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paymentSdkTokenFormat = new PaymentSdkTokenFormat.Hex32Format();
        }
        return paymentSdkConfigBuilder.setTokenise(paymentSdkTokenise, paymentSdkTokenFormat);
    }

    public final PaymentSdkConfigurationDetails build() {
        String str = this.f66a;
        String str2 = this.f67b;
        String str3 = this.f68c;
        PaymentSdkBillingDetails paymentSdkBillingDetails = this.f73h;
        return new PaymentSdkConfigurationDetails(str, str2, str3, paymentSdkBillingDetails == null ? new PaymentSdkBillingDetails(null, null, null, null, null, null, null, null, 255, null) : paymentSdkBillingDetails, this.f74i, this.f81p, this.f75j, this.f70e, this.f76k, this.f77l, this.f78m, Double.valueOf(this.f69d), this.f79n, this.f80o, this.f82q, this.f86u, this.f87v, this.f88w, this.f89x, this.f90y, Boolean.valueOf(this.f83r), Boolean.valueOf(this.f85t), Boolean.valueOf(this.f72g), this.f91z, this.f71f, this.A, Boolean.valueOf(this.f84s), this.B, false, false, null, 1879048192, null);
    }

    public final PaymentSdkConfigBuilder forceShippingInfo(boolean z2) {
        this.f72g = z2;
        return this;
    }

    public final PaymentSdkConfigBuilder hideCardScanner(boolean z2) {
        this.f71f = z2;
        return this;
    }

    public final PaymentSdkConfigBuilder linkBillingNameWithCard(boolean z2) {
        this.f84s = z2;
        return this;
    }

    public final PaymentSdkConfigBuilder setAlternativePaymentMethods(List<? extends PaymentSdkApms> apms) {
        Intrinsics.checkNotNullParameter(apms, "apms");
        this.A.clear();
        this.A.addAll(apms);
        return this;
    }

    public final PaymentSdkConfigBuilder setBillingData(PaymentSdkBillingDetails paymentSdkBillingDetails) {
        if (paymentSdkBillingDetails == null) {
            paymentSdkBillingDetails = new PaymentSdkBillingDetails(null, null, null, null, null, null, null, null, 255, null);
        }
        this.f73h = paymentSdkBillingDetails;
        return this;
    }

    public final PaymentSdkConfigBuilder setCallback(String str) {
        this.B = str;
        return this;
    }

    public final PaymentSdkConfigBuilder setCartDescription(String str) {
        this.f76k = str;
        return this;
    }

    public final PaymentSdkConfigBuilder setCartId(String str) {
        this.f75j = str;
        return this;
    }

    public final PaymentSdkConfigBuilder setLanguageCode(PaymentSdkLanguageCode paymentSdkLanguageCode) {
        this.f81p = paymentSdkLanguageCode;
        return this;
    }

    public final PaymentSdkConfigBuilder setMerchantCountryCode(String merchantCountyCode) {
        Intrinsics.checkNotNullParameter(merchantCountyCode, "merchantCountyCode");
        this.f91z = merchantCountyCode;
        return this;
    }

    public final PaymentSdkConfigBuilder setMerchantIcon(Drawable drawable) {
        this.f89x = e.a(drawable);
        return this;
    }

    public final PaymentSdkConfigBuilder setMerchantIcon(String str) {
        this.f90y = str;
        return this;
    }

    public final PaymentSdkConfigBuilder setScreenTitle(String str) {
        this.f79n = str;
        return this;
    }

    public final PaymentSdkConfigBuilder setServerIp(String ip) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.f80o = ip;
        return this;
    }

    public final PaymentSdkConfigBuilder setShippingData(PaymentSdkShippingDetails paymentSdkShippingDetails) {
        this.f74i = paymentSdkShippingDetails;
        return this;
    }

    @Deprecated(message = "Will be removed in the near future", replaceWith = @ReplaceWith(expression = "PaymentSdkActivity.startRecurringCardPayment()", imports = {}))
    public final PaymentSdkConfigBuilder setTokenisationData(String str, String str2) {
        this.f87v = str;
        this.f88w = str2;
        return this;
    }

    public final PaymentSdkConfigBuilder setTokenise(PaymentSdkTokenise tokeniseType, PaymentSdkTokenFormat tokenFormat) {
        Intrinsics.checkNotNullParameter(tokeniseType, "tokeniseType");
        Intrinsics.checkNotNullParameter(tokenFormat, "tokenFormat");
        this.f82q = tokeniseType;
        this.f86u = tokenFormat.getValue();
        if (this.f82q == PaymentSdkTokenise.NONE) {
            this.f86u = null;
        }
        return this;
    }

    public final PaymentSdkConfigBuilder setTransactionClass(PaymentSdkTransactionClass transactionClass) {
        Intrinsics.checkNotNullParameter(transactionClass, "transactionClass");
        String lowerCase = transactionClass.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f78m = lowerCase;
        return this;
    }

    public final PaymentSdkConfigBuilder setTransactionType(PaymentSdkTransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        String lowerCase = transactionType.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f77l = lowerCase;
        return this;
    }

    public final PaymentSdkConfigBuilder showBillingInfo(boolean z2) {
        this.f83r = z2;
        return this;
    }

    public final PaymentSdkConfigBuilder showShippingInfo(boolean z2) {
        this.f85t = z2;
        return this;
    }
}