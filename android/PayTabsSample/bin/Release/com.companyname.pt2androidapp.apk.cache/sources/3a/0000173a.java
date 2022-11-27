package q;

import com.payment.paymentsdk.sharedclasses.remote.TransactionWebService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lq/a;", "", "", "transactionReference", "profileId", "Lr/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lx0/a;", "encryptor", "<init>", "(Lx0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final x0.a f372a;

    /* renamed from: b  reason: collision with root package name */
    private final TransactionWebService f373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.payment.paymentsdk.d3s.model.repo.D3sRepo", f = "D3sRepo.kt", i = {}, l = {25}, m = "queryTransaction", n = {}, s = {})
    /* renamed from: q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0025a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f374a;

        /* renamed from: c  reason: collision with root package name */
        int f376c;

        C0025a(Continuation<? super C0025a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f374a = obj;
            this.f376c |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    public a(x0.a encryptor) {
        Intrinsics.checkNotNullParameter(encryptor, "encryptor");
        this.f372a = encryptor;
        this.f373b = (TransactionWebService) q0.a.f377a.b().create(TransactionWebService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super r.a> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof q.a.C0025a
            if (r0 == 0) goto L13
            r0 = r7
            q.a$a r0 = (q.a.C0025a) r0
            int r1 = r0.f376c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f376c = r1
            goto L18
        L13:
            q.a$a r0 = new q.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f374a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f376c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            t0.c r7 = new t0.c     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            x0.a r5 = r4.f372a     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            java.lang.String r6 = z.b.a(r7)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            okhttp3.RequestBody r5 = r5.a(r6)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            com.payment.paymentsdk.sharedclasses.remote.TransactionWebService r6 = r4.f373b     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            r0.f376c = r3     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            java.lang.Object r7 = r6.queryTransaction(r5, r0)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody r7 = (com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody) r7     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            r.a$d r5 = new r.a$d     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            r5.<init>(r7)     // Catch: java.lang.Exception -> L56 java.io.IOException -> L59 retrofit2.HttpException -> L5c
            goto L79
        L56:
            r.a$c r5 = r.a.c.f383a
            goto L79
        L59:
            r.a$b r5 = r.a.b.f382a
            goto L79
        L5c:
            r5 = move-exception
            java.lang.String r5 = d0.a.a(r5)
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L56
            r6.<init>()     // Catch: java.lang.Exception -> L56
            java.lang.Class<com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody> r7 = com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody.class
            java.lang.Object r5 = r6.fromJson(r5, r7)     // Catch: java.lang.Exception -> L56
            com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody r5 = (com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody) r5     // Catch: java.lang.Exception -> L56
            r.a$a r6 = new r.a$a     // Catch: java.lang.Exception -> L56
            java.lang.String r7 = "errorModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch: java.lang.Exception -> L56
            r6.<init>(r5)     // Catch: java.lang.Exception -> L56
            r5 = r6
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}