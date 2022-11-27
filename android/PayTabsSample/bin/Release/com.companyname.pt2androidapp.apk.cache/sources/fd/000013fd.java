package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ Flow $this_sample;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(Flow flow, long j2, Continuation continuation) {
        super(3, continuation);
        this.$this_sample = flow;
        this.$periodMillis = j2;
    }

    public final Continuation<Unit> create(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$this_sample, this.$periodMillis, continuation);
        flowKt__DelayKt$sample$2.L$0 = coroutineScope;
        flowKt__DelayKt$sample$2.L$1 = flowCollector;
        return flowKt__DelayKt$sample$2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Object obj, Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$sample$2) create(coroutineScope, (FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(1:9)|10|11|12|13|14|(1:16)|(1:18)|5|6|(2:26|27)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
        r1.handleBuilderException(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:26:0x00d6). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}