package v0;

import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lv0/a;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "a", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final PaymentSdkBillingDetails a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new PaymentSdkBillingDetails(aVar.a(), aVar.b(), aVar.c(), aVar.d(), aVar.e(), aVar.f(), aVar.g(), aVar.h());
    }
}