package h;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p0.c;
import t0.d;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lh/a;", "Lp0/c;", "Lt0/d;", "requestBody", "Ls0/a;", "a", "(Lt0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lx0/a;", "encryptor", "<init>", "(Lx0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private final x0.a f202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x0.a encryptor) {
        super(encryptor);
        Intrinsics.checkNotNullParameter(encryptor, "encryptor");
        this.f202c = encryptor;
    }

    @Override // p0.c
    public Object a(d dVar, Continuation<? super s0.a> continuation) {
        return super.a(dVar, continuation);
    }
}