package n;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import s0.a;
import t0.d;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bJ@\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Ln/a;", "Ly/a;", "", "cardNumber", "expYear", "expMonth", "holderName", "cvv", "", "shouldTokenise", "", "a", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "Lt0/d;", "Lb0/a;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "paymentSucceedWithout3dsLD", "Lb0/a;", "g", "()Lb0/a;", "paymentSucceed3dsLD", "f", "Lh/a;", "repo", "<init>", "(Lh/a;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends y.a {

    /* renamed from: j  reason: collision with root package name */
    private final h.a f351j;

    /* renamed from: k  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f352k;

    /* renamed from: l  reason: collision with root package name */
    private final b0.a<TransactionResponseBody> f353l;

    /* renamed from: m  reason: collision with root package name */
    private final b0.a<TransactionResponseBody> f354m;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.payment.paymentsdk.creditcard.viewmodel.CreditCardViewModel$doTransaction$1", f = "CreditCardViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0023a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f355a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0023a(d dVar, Continuation<? super C0023a> continuation) {
            super(2, continuation);
            this.f357c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0023a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0023a(this.f357c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b0.a<Boolean> e2;
            MutableLiveData c2;
            Object a2;
            Object a3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f355a;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.a().setValue(Boxing.boxBoolean(true));
                h.a aVar = a.this.f351j;
                d dVar = this.f357c;
                this.f355a = 1;
                obj = aVar.a(dVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            s0.a aVar2 = (s0.a) obj;
            a.this.a().setValue(Boxing.boxBoolean(false));
            if (aVar2 instanceof a.e) {
                c2 = a.this.g();
                a3 = ((a.e) aVar2).a();
            } else if (!(aVar2 instanceof a.d)) {
                if (aVar2 instanceof a.C0028a) {
                    c2 = a.this.c();
                    a2 = ((a.C0028a) aVar2).a();
                    c2.setValue(a2);
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(aVar2, a.b.f389a)) {
                    if (Intrinsics.areEqual(aVar2, a.c.f390a)) {
                        e2 = a.this.e();
                    }
                    return Unit.INSTANCE;
                }
                e2 = a.this.d();
                e2.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            } else {
                c2 = a.this.f();
                a3 = ((a.d) aVar2).a();
            }
            Intrinsics.checkNotNull(a3, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody");
            a2 = (TransactionResponseBody) a3;
            c2.setValue(a2);
            return Unit.INSTANCE;
        }
    }

    public a(h.a repo, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f351j = repo;
        this.f352k = paymentSdkConfigurationDetails;
        this.f353l = new b0.a<>();
        this.f354m = new b0.a<>();
    }

    public final d a(String cardNumber, String expYear, String expMonth, String holderName, String cvv, PaymentSdkConfigurationDetails ptConfigData, boolean z2) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expYear, "expYear");
        Intrinsics.checkNotNullParameter(expMonth, "expMonth");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        return new g.a(ptConfigData).a(cardNumber).b(cvv).a(b()).c(expMonth).d(expYear).e(holderName).a(z2).a();
    }

    public final void a(String cardNumber, String expYear, String expMonth, String holderName, String cvv, boolean z2) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expYear, "expYear");
        Intrinsics.checkNotNullParameter(expMonth, "expMonth");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        PaymentSdkConfigurationDetails paymentSdkConfigurationDetails = this.f352k;
        Intrinsics.checkNotNull(paymentSdkConfigurationDetails);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0023a(a(cardNumber, expYear, expMonth, holderName, cvv, paymentSdkConfigurationDetails, z2), null), 3, null);
    }

    public final b0.a<TransactionResponseBody> f() {
        return this.f354m;
    }

    public final b0.a<TransactionResponseBody> g() {
        return this.f353l;
    }
}