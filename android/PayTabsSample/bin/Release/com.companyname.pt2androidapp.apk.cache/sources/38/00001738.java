package p0;

import com.payment.paymentsdk.sharedclasses.remote.TransactionWebService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import t0.d;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lp0/c;", "", "Lt0/d;", "requestBody", "Ls0/a;", "a", "(Lt0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lx0/a;", "encryptor", "<init>", "(Lx0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final x0.a f367a;

    /* renamed from: b  reason: collision with root package name */
    private final TransactionWebService f368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.payment.paymentsdk.sharedclasses.base.BaseTransactionRepo", f = "BaseTransactionRepo.kt", i = {}, l = {26}, m = "doTransaction$suspendImpl", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f369a;

        /* renamed from: c  reason: collision with root package name */
        int f371c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f369a = obj;
            this.f371c |= Integer.MIN_VALUE;
            return c.a(c.this, null, this);
        }
    }

    public c(x0.a encryptor) {
        Intrinsics.checkNotNullParameter(encryptor, "encryptor");
        this.f367a = encryptor;
        this.f368b = (TransactionWebService) q0.a.f377a.b().create(TransactionWebService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: Exception -> 0x005f, IOException -> 0x007b, HttpException -> 0x0097, TryCatch #3 {IOException -> 0x007b, Exception -> 0x005f, HttpException -> 0x0097, blocks: (B:11:0x0027, B:19:0x004b, B:21:0x0053, B:22:0x0059, B:16:0x0036), top: B:38:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: Exception -> 0x005f, IOException -> 0x007b, HttpException -> 0x0097, TRY_LEAVE, TryCatch #3 {IOException -> 0x007b, Exception -> 0x005f, HttpException -> 0x0097, blocks: (B:11:0x0027, B:19:0x004b, B:21:0x0053, B:22:0x0059, B:16:0x0036), top: B:38:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object a(p0.c r5, t0.d r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof p0.c.a
            if (r0 == 0) goto L13
            r0 = r7
            p0.c$a r0 = (p0.c.a) r0
            int r1 = r0.f371c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f371c = r1
            goto L18
        L13:
            p0.c$a r0 = new p0.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f369a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f371c
            r3 = 1
            java.lang.String r4 = "payment_sdk_Logs : "
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            x0.a r7 = r5.f367a     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            java.lang.String r6 = z.b.a(r6)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            okhttp3.RequestBody r6 = r7.a(r6)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            com.payment.paymentsdk.sharedclasses.remote.TransactionWebService r5 = r5.f368b     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            r0.f371c = r3     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            java.lang.Object r7 = r5.doTransaction(r6, r0)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody r7 = (com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody) r7     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            java.lang.String r5 = r7.getRedirectUrl()     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            if (r5 != 0) goto L59
            s0.a$e r5 = new s0.a$e     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            r5.<init>(r7)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            goto Lbc
        L59:
            s0.a$d r5 = new s0.a$d     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            r5.<init>(r7)     // Catch: java.lang.Exception -> L5f java.io.IOException -> L7b retrofit2.HttpException -> L97
            goto Lbc
        L5f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L65:
            r6.append(r4)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.io.PrintStream r6 = java.lang.System.out
            r6.println(r5)
            s0.a$c r5 = s0.a.c.f390a
            goto Lbc
        L7b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.io.PrintStream r6 = java.lang.System.out
            r6.println(r5)
            s0.a$b r5 = s0.a.b.f389a
            goto Lbc
        L97:
            r5 = move-exception
            java.lang.String r5 = d0.a.a(r5)
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Lb5
            r6.<init>()     // Catch: java.lang.Exception -> Lb5
            java.lang.Class<com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody> r7 = com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody.class
            java.lang.Object r5 = r6.fromJson(r5, r7)     // Catch: java.lang.Exception -> Lb5
            com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody r5 = (com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody) r5     // Catch: java.lang.Exception -> Lb5
            s0.a$a r6 = new s0.a$a     // Catch: java.lang.Exception -> Lb5
            java.lang.String r7 = "errorModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch: java.lang.Exception -> Lb5
            r6.<init>(r5)     // Catch: java.lang.Exception -> Lb5
            r5 = r6
            goto Lbc
        Lb5:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L65
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.a(p0.c, t0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object a(d dVar, Continuation<? super s0.a> continuation) {
        return a(this, dVar, continuation);
    }
}