package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractChannel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0086@"}, d2 = {"receiveOrClosed", "", "E", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/channels/ValueOrClosed;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {631}, m = "receiveOrClosed-WVj179g", n = {}, s = {})
/* loaded from: classes.dex */
public final class AbstractChannel$receiveOrClosed$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractChannel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveOrClosed$1(AbstractChannel abstractChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = abstractChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo1406receiveOrClosedWVj179g = this.this$0.mo1406receiveOrClosedWVj179g(this);
        return mo1406receiveOrClosedWVj179g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo1406receiveOrClosedWVj179g : ValueOrClosed.m1408boximpl(mo1406receiveOrClosedWVj179g);
    }
}