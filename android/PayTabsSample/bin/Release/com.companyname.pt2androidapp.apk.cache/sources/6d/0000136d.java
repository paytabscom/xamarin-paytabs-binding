package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$withIndex$1", f = "Channels.common.kt", i = {0, 0, 1, 1}, l = {1662, 1663}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes.dex */
public final class ChannelsKt__Channels_commonKt$withIndex$1 extends SuspendLambda implements Function2<ProducerScope<? super IndexedValue<? extends E>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__Channels_commonKt$withIndex$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.$this_withIndex = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__Channels_commonKt$withIndex$1 channelsKt__Channels_commonKt$withIndex$1 = new ChannelsKt__Channels_commonKt$withIndex$1(this.$this_withIndex, continuation);
        channelsKt__Channels_commonKt$withIndex$1.L$0 = obj;
        return channelsKt__Channels_commonKt$withIndex$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__Channels_commonKt$withIndex$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:12:0x0043). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            goto L42
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = r10
            goto L56
        L34:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel r4 = r10.$this_withIndex
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L42:
            r5 = r10
        L43:
            r5.L$0 = r11
            r5.L$1 = r4
            r5.I$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.hasNext(r5)
            if (r6 != r0) goto L52
            return r0
        L52:
            r9 = r5
            r5 = r11
            r11 = r6
            r6 = r9
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7c
            java.lang.Object r11 = r4.next()
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
            int r8 = r1 + 1
            r7.<init>(r1, r11)
            r6.L$0 = r5
            r6.L$1 = r4
            r6.I$0 = r8
            r6.label = r2
            java.lang.Object r11 = r5.send(r7, r6)
            if (r11 != r0) goto L78
            return r0
        L78:
            r11 = r5
            r5 = r6
            r1 = r8
            goto L43
        L7c:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}