package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;

/* compiled from: Channels.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u001a/\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcastIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 4, 2}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super Unit> continuation) {
        Object emitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, receiveChannel, true, continuation);
        return emitAllImpl$FlowKt__ChannelsKt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0084 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:65:0x0037, B:79:0x007e, B:81:0x0084, B:87:0x0092, B:88:0x0093, B:70:0x0055), top: B:102:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0093 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:65:0x0037, B:79:0x007e, B:81:0x0084, B:87:0x0092, B:88:0x0093, B:70:0x0055), top: B:102:0x0023 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00a5 -> B:66:0x003a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5f
        L3a:
            r10 = r8
            r8 = r9
            r9 = r7
            r7 = r2
            goto L67
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5f
            kotlinx.coroutines.channels.ValueOrClosed r10 = (kotlinx.coroutines.channels.ValueOrClosed) r10     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r10.m1418unboximpl()     // Catch: java.lang.Throwable -> L5f
            goto L7e
        L5f:
            r8 = move-exception
            goto Lad
        L61:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 0
            java.lang.Throwable r10 = (java.lang.Throwable) r10
        L67:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La8
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La8
            r0.L$2 = r10     // Catch: java.lang.Throwable -> La8
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> La8
            r0.label = r4     // Catch: java.lang.Throwable -> La8
            java.lang.Object r2 = r8.mo1406receiveOrClosedWVj179g(r0)     // Catch: java.lang.Throwable -> La8
            if (r2 != r1) goto L78
            return r1
        L78:
            r6 = r2
            r2 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L7e:
            boolean r5 = kotlinx.coroutines.channels.ValueOrClosed.m1416isClosedimpl(r10)     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L93
            java.lang.Throwable r10 = kotlinx.coroutines.channels.ValueOrClosed.m1412getCloseCauseimpl(r10)     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L92
            if (r7 == 0) goto L8f
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
        L8f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L92:
            throw r10     // Catch: java.lang.Throwable -> L5f
        L93:
            java.lang.Object r10 = kotlinx.coroutines.channels.ValueOrClosed.m1413getValueimpl(r10)     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L5f
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L5f
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L5f
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L5f
            r0.label = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L5f
            if (r10 != r1) goto L3a
            return r1
        La8:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        Lad:
            throw r8     // Catch: java.lang.Throwable -> Lae
        Lae:
            r10 = move-exception
            if (r7 == 0) goto Lb4
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
        Lb4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, true, null, 0, null, 28, null);
    }

    public static /* synthetic */ BroadcastChannel broadcastIn$default(Flow flow, CoroutineScope coroutineScope, CoroutineStart coroutineStart, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return FlowKt.broadcastIn(flow, coroutineScope, coroutineStart);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use shareIn operator and the resulting SharedFlow as a replacement for BroadcastChannel", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, SharingStarted.Lazily, 0)", imports = {}))
    public static final <T> BroadcastChannel<T> broadcastIn(Flow<? extends T> flow, CoroutineScope coroutineScope, CoroutineStart coroutineStart) {
        return ChannelFlowKt.asChannelFlow(flow).broadcastImpl(coroutineScope, coroutineStart);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return ChannelFlowKt.asChannelFlow(flow).produceImpl(coroutineScope);
    }

    public static final <T> Flow<T> asFlow(final BroadcastChannel<T> broadcastChannel) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object emitAll = FlowKt.emitAll(flowCollector, BroadcastChannel.this.openSubscription(), continuation);
                return emitAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : Unit.INSTANCE;
            }
        };
    }
}