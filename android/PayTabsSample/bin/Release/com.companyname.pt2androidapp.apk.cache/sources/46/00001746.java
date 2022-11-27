package s0;

import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Ls0/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Ls0/a$a;", "Ls0/a$b;", "Ls0/a$c;", "Ls0/a$d;", "Ls0/a$e;", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ls0/a$a;", "Ls0/a;", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "errorResponseBody", "Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "a", "()Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "<init>", "(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0028a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final ErrorResponseBody f388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0028a(ErrorResponseBody errorResponseBody) {
            super(null);
            Intrinsics.checkNotNullParameter(errorResponseBody, "errorResponseBody");
            this.f388a = errorResponseBody;
        }

        public final ErrorResponseBody a() {
            return this.f388a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls0/a$b;", "Ls0/a;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f389a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls0/a$c;", "Ls0/a;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f390a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ls0/a$d;", "T", "Ls0/a;", "data", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private final T f391a;

        public d(T t2) {
            super(null);
            this.f391a = t2;
        }

        public final T a() {
            return this.f391a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ls0/a$e;", "T", "Ls0/a;", "data", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private final T f392a;

        public e(T t2) {
            super(null);
            this.f392a = t2;
        }

        public final T a() {
            return this.f392a;
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}