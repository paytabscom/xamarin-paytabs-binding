package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* compiled from: Collect.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StartedLazily$command$1$invokeSuspend$$inlined$collect$1 implements FlowCollector<Integer> {
    final /* synthetic */ Ref.BooleanRef $started$inlined;
    final /* synthetic */ FlowCollector $this_flow$inlined;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u0007"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1", f = "SharingStarted.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StartedLazily$command$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public StartedLazily$command$1$invokeSuspend$$inlined$collect$1(FlowCollector flowCollector, Ref.BooleanRef booleanRef) {
        this.$this_flow$inlined = flowCollector;
        this.$started$inlined = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object emit(java.lang.Integer r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r0
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L57
            kotlin.jvm.internal.Ref$BooleanRef r5 = r4.$started$inlined
            boolean r5 = r5.element
            if (r5 != 0) goto L57
            kotlin.jvm.internal.Ref$BooleanRef r5 = r4.$started$inlined
            r5.element = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.$this_flow$inlined
            kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
            r0.label = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}