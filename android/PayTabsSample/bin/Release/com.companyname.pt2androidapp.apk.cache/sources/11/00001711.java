package o0;

import com.payment.paymentsdk.integrationmodels.PaymentSdkRegion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\"\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;", "selectedRegion", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;)V", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static PaymentSdkRegion f363a = PaymentSdkRegion.GLOBAL;

    public static final PaymentSdkRegion a() {
        return f363a;
    }

    public static final void a(PaymentSdkRegion paymentSdkRegion) {
        Intrinsics.checkNotNullParameter(paymentSdkRegion, "<set-?>");
        f363a = paymentSdkRegion;
    }
}