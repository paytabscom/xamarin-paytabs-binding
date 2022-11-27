package c1;

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

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lc1/a;", "Ly/a;", "Lt0/d;", "body", "", "a", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "paymentSucceedWithout3dsLD", "Landroidx/lifecycle/MutableLiveData;", "g", "()Landroidx/lifecycle/MutableLiveData;", "paymentSucceed3dsLD", "f", "La1/a;", "repo", "<init>", "(La1/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends y.a {

    /* renamed from: j  reason: collision with root package name */
    private final a1.a f52j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableLiveData<TransactionResponseBody> f53k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableLiveData<TransactionResponseBody> f54l;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.payment.paymentsdk.tokenizationpayment.viewmodel.TokenizationPaymentViewModel$doTransaction$1", f = "TokenizationPaymentViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: c1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0007a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f57c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0007a(d dVar, Continuation<? super C0007a> continuation) {
            super(2, continuation);
            this.f57c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0007a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0007a(this.f57c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b0.a<Boolean> e2;
            MutableLiveData<TransactionResponseBody> f2;
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f55a;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.a().setValue(Boxing.boxBoolean(true));
                a1.a aVar = a.this.f52j;
                d dVar = this.f57c;
                this.f55a = 1;
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
                f2 = a.this.g();
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
                f2 = a.this.f();
                a2 = ((a.d) aVar2).a();
            }
            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody");
            f2.setValue((TransactionResponseBody) a2);
            return Unit.INSTANCE;
        }
    }

    public a(a1.a repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f52j = repo;
        this.f53k = new MutableLiveData<>();
        this.f54l = new MutableLiveData<>();
    }

    public final d a(PaymentSdkConfigurationDetails ptConfigData) {
        Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
        return new z0.a(ptConfigData).a(ptConfigData.getToken()).a(b()).b(ptConfigData.getTokenFormat()).c(ptConfigData.getTransactionReference()).a();
    }

    public final void a(d body) {
        Intrinsics.checkNotNullParameter(body, "body");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0007a(body, null), 3, null);
    }

    public final MutableLiveData<TransactionResponseBody> f() {
        return this.f54l;
    }

    public final MutableLiveData<TransactionResponseBody> g() {
        return this.f53k;
    }
}