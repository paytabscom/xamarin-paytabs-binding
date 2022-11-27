package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {354, 358}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_debounceInternal;
    final /* synthetic */ Function1 $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Flow flow, Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.$this_debounceInternal = flow;
        this.$timeoutMillisSelector = function1;
    }

    public final Continuation<Unit> create(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$this_debounceInternal, this.$timeoutMillisSelector, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Object obj, Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1) create(coroutineScope, (FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(5:11|(1:13)|14|(1:16)(1:30)|(2:28|29)(2:18|(5:20|(1:22)|23|(1:25)|27)))|31|32|(4:34|(1:43)(1:38)|39|(2:41|42))|44|45|46|(6:60|61|62|63|64|65)(1:48)|49|50|51|(1:53)|(1:55)(4:56|6|7|(2:75|76)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:60|61|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
        r7 = r10;
        r16 = r11;
        r17 = r12;
        r4 = r13;
        r19 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
        r7.handleBuilderException(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0198 -> B:74:0x019f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}