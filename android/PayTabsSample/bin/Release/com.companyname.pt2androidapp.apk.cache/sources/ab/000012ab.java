package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: JobSupport.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/ChildJob;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super ChildJob>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, continuation);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super ChildJob> sequenceScope, Continuation<? super Unit> continuation) {
        return ((JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:27:0x0086). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:27:0x0086). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r4 = r8.L$1
            kotlinx.coroutines.internal.LockFreeLinkedListHead r4 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r4
            java.lang.Object r5 = r8.L$0
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L86
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8b
        L2b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlinx.coroutines.JobSupport r1 = r8.this$0
            java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
            boolean r4 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L49
            kotlinx.coroutines.ChildHandleNode r1 = (kotlinx.coroutines.ChildHandleNode) r1
            kotlinx.coroutines.ChildJob r1 = r1.childJob
            r8.label = r3
            java.lang.Object r9 = r9.yield(r1, r8)
            if (r9 != r0) goto L8b
            return r0
        L49:
            boolean r4 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r4 == 0) goto L8b
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            kotlinx.coroutines.NodeList r1 = r1.getList()
            if (r1 == 0) goto L8b
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r1
            java.lang.Object r4 = r1.getNext()
        */
        //  java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            java.util.Objects.requireNonNull(r4, r5)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r5 = r9
            r9 = r8
            r7 = r4
            r4 = r1
            r1 = r7
        L67:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r6 = r6 ^ r3
            if (r6 == 0) goto L8b
            boolean r6 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r6 == 0) goto L86
            r6 = r1
            kotlinx.coroutines.ChildHandleNode r6 = (kotlinx.coroutines.ChildHandleNode) r6
            kotlinx.coroutines.ChildJob r6 = r6.childJob
            r9.L$0 = r5
            r9.L$1 = r4
            r9.L$2 = r1
            r9.label = r2
            java.lang.Object r6 = r5.yield(r6, r9)
            if (r6 != r0) goto L86
            return r0
        L86:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L67
        L8b:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}