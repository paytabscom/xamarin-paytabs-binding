package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1", f = "Channels.common.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {2208, 1404, 1404}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "cause$iv$iv", "$this$produce", "$this$consume$iv$iv", "cause$iv$iv", "$this$produce", "$this$consume$iv$iv", "cause$iv$iv"}, s = {"L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3"})
/* loaded from: classes.dex */
public final class ChannelsKt__Channels_commonKt$map$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel $this_map;
    final /* synthetic */ Function2 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__Channels_commonKt$map$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_map = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__Channels_commonKt$map$1 channelsKt__Channels_commonKt$map$1 = new ChannelsKt__Channels_commonKt$map$1(this.$this_map, this.$transform, continuation);
        channelsKt__Channels_commonKt$map$1.L$0 = obj;
        return channelsKt__Channels_commonKt$map$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__Channels_commonKt$map$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:8:0x0026, B:22:0x0084, B:26:0x009b, B:28:0x00a3, B:36:0x00e9, B:18:0x006a, B:21:0x007b), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9 A[Catch: all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:8:0x0026, B:22:0x0084, B:26:0x009b, B:28:0x00a3, B:36:0x00e9, B:18:0x006a, B:21:0x007b), top: B:44:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e2 -> B:22:0x0084). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}