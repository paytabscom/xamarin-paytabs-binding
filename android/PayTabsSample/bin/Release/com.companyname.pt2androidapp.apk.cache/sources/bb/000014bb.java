package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: Zip.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u008a@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1(Continuation continuation, FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1) {
        super(3, continuation);
        this.this$0 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
    }

    public final Continuation<Unit> create(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1(continuation, this.this$0);
        flowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1.L$0 = flowCollector;
        flowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object[] objArr, Continuation<? super Unit> continuation) {
        return ((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1) create((FlowCollector) obj, objArr, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Function3 function3 = this.this$0.$transform$inlined;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.L$0 = flowCollector;
            this.label = 1;
            InlineMarker.mark(6);
            obj = function3.invoke(obj2, obj3, this);
            InlineMarker.mark(7);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}