package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transformWhile;
    final /* synthetic */ Function3 $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1(Flow flow, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$this_transformWhile = flow;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, continuation);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((FlowKt__LimitKt$transformWhile$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_transformWhile;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this, (FlowCollector) this.L$0);
            try {
                this.L$0 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.label = 1;
                if (flow.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                return Unit.INSTANCE;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}