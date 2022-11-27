package y;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.b;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR*\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ly/a;", "Landroidx/lifecycle/ViewModel;", "Lt0/b;", "d", "", "a", "b", "Landroidx/lifecycle/MutableLiveData;", "", "dataLoading", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "Lb0/a;", "showNoNetworkScreenEvent", "Lb0/a;", "()Lb0/a;", "showServerIssueEvent", "e", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "errorMessageEvent", "c", "setErrorMessageEvent", "(Lb0/a;)V", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final MutableLiveData<Boolean> f547a = new MutableLiveData<>();

    /* renamed from: b  reason: collision with root package name */
    private final b0.a<Boolean> f548b = new b0.a<>();

    /* renamed from: c  reason: collision with root package name */
    private final b0.a<Boolean> f549c = new b0.a<>();

    /* renamed from: d  reason: collision with root package name */
    private final b0.a<Boolean> f550d = new b0.a<>();

    /* renamed from: e  reason: collision with root package name */
    private b0.a<ErrorResponseBody> f551e = new b0.a<>();

    /* renamed from: f  reason: collision with root package name */
    private b0.a<Integer> f552f = new b0.a<>();

    /* renamed from: g  reason: collision with root package name */
    private b0.a<String> f553g = new b0.a<>();

    /* renamed from: h  reason: collision with root package name */
    private Executor f554h;

    /* renamed from: i  reason: collision with root package name */
    private b f555i;

    public a() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(5)");
        this.f554h = newFixedThreadPool;
    }

    public final MutableLiveData<Boolean> a() {
        return this.f547a;
    }

    public final void a(b bVar) {
        this.f555i = bVar;
    }

    public final b b() {
        return this.f555i;
    }

    public final b0.a<ErrorResponseBody> c() {
        return this.f551e;
    }

    public final b0.a<Boolean> d() {
        return this.f548b;
    }

    public final b0.a<Boolean> e() {
        return this.f549c;
    }
}