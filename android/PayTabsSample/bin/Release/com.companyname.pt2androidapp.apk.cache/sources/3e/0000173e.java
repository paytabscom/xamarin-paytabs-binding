package r;

import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lr/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lr/a$a;", "Lr/a$b;", "Lr/a$c;", "Lr/a$d;", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lr/a$a;", "Lr/a;", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "errorResponseBody", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "a", "()Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "<init>", "(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0027a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final ErrorResponseBody f381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0027a(ErrorResponseBody errorResponseBody) {
            super(null);
            Intrinsics.checkNotNullParameter(errorResponseBody, "errorResponseBody");
            this.f381a = errorResponseBody;
        }

        public final ErrorResponseBody a() {
            return this.f381a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr/a$b;", "Lr/a;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f382a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr/a$c;", "Lr/a;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f383a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lr/a$d;", "T", "Lr/a;", "data", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private final T f384a;

        public d(T t2) {
            super(null);
            this.f384a = t2;
        }

        public final T a() {
            return this.f384a;
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}