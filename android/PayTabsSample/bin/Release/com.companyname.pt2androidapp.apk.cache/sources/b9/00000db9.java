package com.payment.paymentsdk;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.payment.paymentsdk.integrationmodels.PaymentSdkApms;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkRegion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x.a;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\b\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J'\u0010\b\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0014J\u000e\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006J3\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b\u001b\u0010$R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002070 8\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$¨\u0006?"}, d2 = {"Lcom/payment/paymentsdk/b;", "Ly/a;", "", "appendToString", "", "appendedChar", "", "maxAppendedNumber", "a", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "", "b", "", "d", "c", "samsungPayToken", "isSamsungPayEnabled", "isApms", "hasSavedCards", "(Ljava/lang/Boolean;ZZ)V", "clientKey", "TransformedLength", "samsungPayEnabled", "apmsEnabled", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/app/Application;", "j", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Landroidx/lifecycle/MutableLiveData;", "m", "Landroidx/lifecycle/MutableLiveData;", "h", "()Landroidx/lifecycle/MutableLiveData;", "navigateToCreditCardLD", "n", "i", "navigateToSamPayLD", "o", "navigateToTokenizationLD", "p", "g", "navigateToApmsLD", "q", "f", "invalidSamPayTokenLD", "r", "getInvalidTokenLD", "invalidTokenLD", "s", "getInvalidTransactionReferenceLD", "invalidTransactionReferenceLD", "Lw0/a;", "t", "k", "ptConfigDataValidatorLD", "Ly0/a;", "configDataValidator", "<init>", "(Landroid/app/Application;Ly0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends y.a {

    /* renamed from: j  reason: collision with root package name */
    private final Application f103j;

    /* renamed from: k  reason: collision with root package name */
    private final y0.a f104k;

    /* renamed from: l  reason: collision with root package name */
    private final k0.a f105l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableLiveData<Boolean> f106m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableLiveData<String> f107n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableLiveData<Boolean> f108o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableLiveData<Boolean> f109p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableLiveData<Boolean> f110q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableLiveData<Boolean> f111r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableLiveData<Boolean> f112s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableLiveData<w0.a> f113t;

    public b(Application app, y0.a configDataValidator) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(configDataValidator, "configDataValidator");
        this.f103j = app;
        this.f104k = configDataValidator;
        this.f105l = new k0.a(app);
        this.f106m = new MutableLiveData<>();
        this.f107n = new MutableLiveData<>();
        this.f108o = new MutableLiveData<>();
        this.f109p = new MutableLiveData<>();
        this.f110q = new MutableLiveData<>();
        this.f111r = new MutableLiveData<>();
        this.f112s = new MutableLiveData<>();
        this.f113t = new MutableLiveData<>();
    }

    private final String a(String str, char c2, int i2) {
        while (i2 > 0) {
            str = str + '#';
            i2--;
        }
        return str;
    }

    private final boolean a(String str) {
        try {
            new Gson().fromJson(str, u0.c.class);
            if (!(str == null || str.length() == 0)) {
                return true;
            }
        } catch (Exception unused) {
        }
        this.f110q.setValue(Boolean.TRUE);
        return false;
    }

    private final void b(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        String str;
        PaymentSdkRegion paymentSdkRegion;
        String merchantCountry = paymentSdkConfigurationDetails.getMerchantCountry();
        if (merchantCountry != null) {
            str = merchantCountry.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2084) {
                if (hashCode != 2210) {
                    if (hashCode != 2344) {
                        if (hashCode != 2373) {
                            if (hashCode != 2526) {
                                if (hashCode == 2638 && str.equals("SA")) {
                                    paymentSdkRegion = PaymentSdkRegion.KSA;
                                }
                            } else if (str.equals("OM")) {
                                paymentSdkRegion = PaymentSdkRegion.OMAN;
                            }
                        } else if (str.equals("JO")) {
                            paymentSdkRegion = PaymentSdkRegion.JORDAN;
                        }
                    } else if (str.equals("IQ")) {
                        paymentSdkRegion = PaymentSdkRegion.IRAQ;
                    }
                } else if (str.equals("EG")) {
                    paymentSdkRegion = PaymentSdkRegion.EGYPT;
                }
            } else if (str.equals("AE")) {
                paymentSdkRegion = PaymentSdkRegion.UAE;
            }
            o0.a.a(paymentSdkRegion);
        }
        paymentSdkRegion = PaymentSdkRegion.GLOBAL;
        o0.a.a(paymentSdkRegion);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean c(com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getToken()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r0 = r0.length()
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != r2) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L2f
            java.lang.String r0 = r5.getTransactionReference()
            if (r0 == 0) goto L2b
            int r0 = r0.length()
            if (r0 <= 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != r2) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r2 = 0
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r0 <= r3) goto L45
            boolean r5 = r5.getShowSaveCardsUI$paymentsdk_release()
            if (r5 == 0) goto L45
            k0.a r5 = r4.f105l
            boolean r5 = r5.d()
            if (r5 == 0) goto L45
            return r1
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payment.paymentsdk.b.c(com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails):boolean");
    }

    private final boolean d(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        if (paymentSdkConfigurationDetails.getRequest3DS$paymentsdk_release()) {
            String token = paymentSdkConfigurationDetails.getToken();
            return (token != null && (StringsKt.isBlank(token) ^ true)) && paymentSdkConfigurationDetails.getSavedCardInfo$paymentsdk_release() != null;
        }
        return false;
    }

    public final String a(String clientKey, int i2) {
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        if (clientKey.length() <= i2) {
            return clientKey.length() < i2 ? a(clientKey, '#', i2 - clientKey.length()) : clientKey;
        }
        String substring = clientKey.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        a.C0033a c0033a = x.a.f543a;
        String serverKey = ptConfigData.getServerKey();
        Intrinsics.checkNotNull(serverKey);
        c0033a.b(serverKey);
        String clientKey = ptConfigData.getClientKey();
        Intrinsics.checkNotNull(clientKey);
        c0033a.a(a(clientKey, 32));
        if (ptConfigData.getMerchantCountry() != null) {
            b(ptConfigData);
        }
    }

    public final void a(PaymentSdkConfigurationDetails ptConfigData, String str, Boolean bool, Boolean bool2) {
        MutableLiveData<Boolean> mutableLiveData;
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool3) && a(str)) {
            MutableLiveData<String> mutableLiveData2 = this.f107n;
            Intrinsics.checkNotNull(str);
            mutableLiveData2.setValue(str);
            return;
        }
        if (!d(ptConfigData)) {
            if (c(ptConfigData)) {
                mutableLiveData = this.f108o;
            } else if (Intrinsics.areEqual(bool2, bool3)) {
                List<PaymentSdkApms> alternativePaymentMethods = ptConfigData.getAlternativePaymentMethods();
                boolean z2 = true;
                if ((alternativePaymentMethods == null || !(alternativePaymentMethods.isEmpty() ^ true)) ? false : false) {
                    mutableLiveData = this.f109p;
                }
            }
            mutableLiveData.setValue(bool3);
        }
        mutableLiveData = this.f106m;
        mutableLiveData.setValue(bool3);
    }

    public final void a(Boolean bool, boolean z2, boolean z3) {
        this.f104k.a(bool != null ? bool.booleanValue() : false, z2, z3);
        this.f113t.setValue(this.f104k.a(z3));
    }

    public final MutableLiveData<Boolean> f() {
        return this.f110q;
    }

    public final MutableLiveData<Boolean> g() {
        return this.f109p;
    }

    public final MutableLiveData<Boolean> h() {
        return this.f106m;
    }

    public final MutableLiveData<String> i() {
        return this.f107n;
    }

    public final MutableLiveData<Boolean> j() {
        return this.f108o;
    }

    public final MutableLiveData<w0.a> k() {
        return this.f113t;
    }
}