package i0;

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

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0005\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, d2 = {"Li0/a;", "Ly/a;", "", "samsungPayToken", "", "a", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "Lt0/d;", "Landroidx/lifecycle/MutableLiveData;", "", "invalidConfigDataLD", "Landroidx/lifecycle/MutableLiveData;", "f", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "paymentSucceedWithout3dsLD", "h", "paymentSucceed3dsLD", "g", "Lg0/a;", "repo", "<init>", "(Lg0/a;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends y.a {

    /* renamed from: j  reason: collision with root package name */
    private final g0.a f244j;

    /* renamed from: k  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f245k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableLiveData<Boolean> f246l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableLiveData<TransactionResponseBody> f247m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableLiveData<TransactionResponseBody> f248n;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.payment.paymentsdk.samsungpay.viewmodel.SamsungPayViewModel$doTransaction$1", f = "SamsungPayViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: i0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0015a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f249a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0015a(d dVar, Continuation<? super C0015a> continuation) {
            super(2, continuation);
            this.f251c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0015a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0015a(this.f251c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b0.a<Boolean> e2;
            MutableLiveData<TransactionResponseBody> g2;
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f249a;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.a().setValue(Boxing.boxBoolean(true));
                g0.a aVar = a.this.f244j;
                d dVar = this.f251c;
                this.f249a = 1;
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
                g2 = a.this.h();
                a2 = ((a.e) aVar2).a();
            } else if (!(aVar2 instanceof a.d)) {
                if (aVar2 instanceof a.C0028a) {
                    a.this.c().setValue(((a.C0028a) aVar2).a());
                } else {
                    if (Intrinsics.areEqual(aVar2, a.b.f389a)) {
                        e2 = a.this.d();
                    } else if (Intrinsics.areEqual(aVar2, a.c.f390a)) {
                        e2 = a.this.e();
                    }
                    e2.setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            } else {
                g2 = a.this.g();
                a2 = ((a.d) aVar2).a();
            }
            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody");
            g2.setValue((TransactionResponseBody) a2);
            return Unit.INSTANCE;
        }
    }

    public a(g0.a repo, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f244j = repo;
        this.f245k = paymentSdkConfigurationDetails;
        this.f246l = new MutableLiveData<>();
        this.f247m = new MutableLiveData<>();
        this.f248n = new MutableLiveData<>();
    }

    public final d a(String str, PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        return new f0.a(ptConfigData).a(str).a(b()).a();
    }

    public final void a(String str) {
        PaymentSdkConfigurationDetails paymentSdkConfigurationDetails = this.f245k;
        Intrinsics.checkNotNull(paymentSdkConfigurationDetails);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0015a(a(str, paymentSdkConfigurationDetails), null), 3, null);
    }

    public final MutableLiveData<Boolean> f() {
        return this.f246l;
    }

    public final MutableLiveData<TransactionResponseBody> g() {
        return this.f248n;
    }

    public final MutableLiveData<TransactionResponseBody> h() {
        return this.f247m;
    }
}