package u;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
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
import r.a;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lu/a;", "Ly/a;", "", "transReference", "profileId", "", "a", "Landroidx/lifecycle/MutableLiveData;", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "paymentSucceed", "Landroidx/lifecycle/MutableLiveData;", "f", "()Landroidx/lifecycle/MutableLiveData;", "Lq/a;", "repo", "<init>", "(Lq/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends y.a {

    /* renamed from: j  reason: collision with root package name */
    private final q.a f455j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableLiveData<TransactionResponseBody> f456k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.payment.paymentsdk.d3s.viewmodel.D3sViewModel$queryTransaction$1", f = "D3sViewModel.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0030a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f457a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f460d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0030a(String str, String str2, Continuation<? super C0030a> continuation) {
            super(2, continuation);
            this.f459c = str;
            this.f460d = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0030a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0030a(this.f459c, this.f460d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b0.a<Boolean> e2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f457a;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.a().setValue(Boxing.boxBoolean(true));
                q.a aVar = a.this.f455j;
                String str = this.f459c;
                String str2 = this.f460d;
                this.f457a = 1;
                obj = aVar.a(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            r.a aVar2 = (r.a) obj;
            a.this.a().setValue(Boxing.boxBoolean(false));
            if (aVar2 instanceof a.d) {
                MutableLiveData<TransactionResponseBody> f2 = a.this.f();
                Object a2 = ((a.d) aVar2).a();
                Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody");
                f2.setValue((TransactionResponseBody) a2);
            } else if (aVar2 instanceof a.C0027a) {
                a.this.c().setValue(((a.C0027a) aVar2).a());
            } else {
                if (Intrinsics.areEqual(aVar2, a.b.f382a)) {
                    e2 = a.this.d();
                } else if (Intrinsics.areEqual(aVar2, a.c.f383a)) {
                    e2 = a.this.e();
                }
                e2.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    public a(q.a repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f455j = repo;
        this.f456k = new MutableLiveData<>();
    }

    public final void a(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0030a(str, str2, null), 3, null);
    }

    public final MutableLiveData<TransactionResponseBody> f() {
        return this.f456k;
    }
}