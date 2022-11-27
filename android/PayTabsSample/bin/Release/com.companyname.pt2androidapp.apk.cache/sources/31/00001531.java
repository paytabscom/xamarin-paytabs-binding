package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FlowCoroutine.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/FlowCoroutineKt$scopedFlow$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector $this_unsafeFlow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1(FlowCollector flowCollector, Continuation continuation, FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1) {
        super(2, continuation);
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 = new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1(this.$this_unsafeFlow, continuation, this.this$0);
        flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Function3 function3 = this.this$0.$block$inlined;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            this.label = 1;
            InlineMarker.mark(6);
            Object invoke = function3.invoke((CoroutineScope) this.L$0, flowCollector, this);
            InlineMarker.mark(7);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}