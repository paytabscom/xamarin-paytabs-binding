package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexed$1", f = "Channels.common.kt", i = {0, 0, 1, 1, 2, 2}, l = {1427, 1428, 1428}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes.dex */
public final class ChannelsKt__Channels_commonKt$mapIndexed$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel $this_mapIndexed;
    final /* synthetic */ Function3 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__Channels_commonKt$mapIndexed$1(ReceiveChannel receiveChannel, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__Channels_commonKt$mapIndexed$1 channelsKt__Channels_commonKt$mapIndexed$1 = new ChannelsKt__Channels_commonKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, continuation);
        channelsKt__Channels_commonKt$mapIndexed$1.L$0 = obj;
        return channelsKt__Channels_commonKt$mapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__Channels_commonKt$mapIndexed$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a6 -> B:14:0x0059). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r6
            goto L58
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r11
            goto L94
        L3b:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.throwOnFailure(r12)
            r7 = r11
            goto L6c
        L4a:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel r5 = r11.$this_mapIndexed
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
        L58:
            r6 = r11
        L59:
            r6.L$0 = r12
            r6.L$1 = r5
            r6.I$0 = r1
            r6.label = r4
            java.lang.Object r7 = r5.hasNext(r6)
            if (r7 != r0) goto L68
            return r0
        L68:
            r10 = r6
            r6 = r12
            r12 = r7
            r7 = r10
        L6c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Laa
            java.lang.Object r12 = r5.next()
            kotlin.jvm.functions.Function3 r8 = r7.$transform
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            int r1 = r1 + r4
            r7.L$0 = r6
            r7.L$1 = r5
            r7.L$2 = r6
            r7.I$0 = r1
            r7.label = r3
            java.lang.Object r12 = r8.invoke(r9, r12, r7)
            if (r12 != r0) goto L90
            return r0
        L90:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r7
        L94:
            r8.L$0 = r7
            r8.L$1 = r6
            r9 = 0
            r8.L$2 = r9
            r8.I$0 = r1
            r8.label = r2
            java.lang.Object r12 = r5.send(r12, r8)
            if (r12 != r0) goto La6
            return r0
        La6:
            r5 = r6
            r12 = r7
            r6 = r8
            goto L59
        Laa:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}