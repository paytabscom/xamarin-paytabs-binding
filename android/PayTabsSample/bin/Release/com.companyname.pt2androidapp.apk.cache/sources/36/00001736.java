package p0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBodyKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lp0/b;", "Landroidx/fragment/app/Fragment;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "response", "", "a", "c", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "errorResp", "", "validationMsg", "Le0/c;", "deviceInfoProvider$delegate", "Lkotlin/Lazy;", "b", "()Le0/c;", "deviceInfoProvider", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f365a = LazyKt.lazy(new a());

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le0/c;", "a", "()Le0/c;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends Lambda implements Function0<e0.c> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final e0.c invoke() {
            FragmentActivity requireActivity = b.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            return new e0.c(requireActivity);
        }
    }

    public final void a(ErrorResponseBody errorResponseBody) {
        String code;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.interfaces.ActivityReturnResult");
        ((r0.a) requireActivity).returnErrorToTheCaller(new PaymentSdkError((errorResponseBody == null || (code = errorResponseBody.getCode()) == null) ? null : StringsKt.toIntOrNull(code), errorResponseBody != null ? errorResponseBody.getMsg() : null));
    }

    public final void a(TransactionResponseBody response) {
        Intrinsics.checkNotNullParameter(response, "response");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.interfaces.ActivityReturnResult");
        ((r0.a) requireActivity).returnPaymentFinishedToTheCaller(TransactionResponseBodyKt.toPaymentSdkTransactionDetails(response));
    }

    public final void a(String validationMsg) {
        Intrinsics.checkNotNullParameter(validationMsg, "validationMsg");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.interfaces.ActivityReturnResult");
        ((r0.a) requireActivity).returnErrorToTheCaller(new PaymentSdkError(-1, validationMsg));
    }

    public final e0.c b() {
        return (e0.c) this.f365a.getValue();
    }

    public final void c() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.interfaces.ActivityReturnResult");
        ((r0.a) requireActivity).returnCancelToTheCaller();
    }
}