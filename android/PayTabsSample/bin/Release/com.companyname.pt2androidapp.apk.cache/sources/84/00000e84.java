package g0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p0.c;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg0/a;", "Lp0/c;", "Lx0/a;", "encryptor", "<init>", "(Lx0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private final x0.a f201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x0.a encryptor) {
        super(encryptor);
        Intrinsics.checkNotNullParameter(encryptor, "encryptor");
        this.f201c = encryptor;
    }
}