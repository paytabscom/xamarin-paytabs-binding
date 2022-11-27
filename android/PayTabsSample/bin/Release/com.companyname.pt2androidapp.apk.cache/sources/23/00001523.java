package kotlinx.coroutines.flow.internal;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Combine.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector $this_unsafeFlow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CombineKt$zipImpl$$inlined$unsafeFlow$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1(FlowCollector flowCollector, Continuation continuation, CombineKt$zipImpl$$inlined$unsafeFlow$1 combineKt$zipImpl$$inlined$unsafeFlow$1) {
        super(2, continuation);
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = combineKt$zipImpl$$inlined$unsafeFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 combineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 = new CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1(this.$this_unsafeFlow, continuation, this.this$0);
        combineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.L$0 = obj;
        return combineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$second$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Object> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                this.label = 1;
                if (CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this.this$0.$flow2$inlined.collect(new FlowCollector<T2>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$.inlined.unsafeFlow.1.lambda.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(Object obj2, Continuation continuation) {
                        SendChannel channel = ProducerScope.this.getChannel();
                        if (obj2 == null) {
                            obj2 = NullSurrogateKt.NULL;
                        }
                        Object send = channel.send(obj2, continuation);
                        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompletableJob Job$default;
        ReceiveChannel receiveChannel;
        CoroutineContext coroutineContext;
        Object threadContextElements;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ReceiveChannel receiveChannel2 = this.label;
        try {
            if (receiveChannel2 != 0) {
                if (receiveChannel2 == 1) {
                    receiveChannel = (ReceiveChannel) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        receiveChannel2 = receiveChannel;
                    } catch (AbortFlowException e2) {
                        e = e2;
                    }
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannel2, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ReceiveChannel produce$default = ProduceKt.produce$default(coroutineScope, null, 0, new AnonymousClass1(null), 3, null);
            Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Objects.requireNonNull(produce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            ((SendChannel) produce$default).invokeOnClose(new AnonymousClass2(Job$default));
            try {
                coroutineContext = coroutineScope.getCoroutineContext();
                threadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                this.L$0 = produce$default;
                this.label = 1;
            } catch (AbortFlowException e3) {
                e = e3;
                receiveChannel = produce$default;
            } catch (Throwable th) {
                th = th;
                receiveChannel2 = produce$default;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannel2, (CancellationException) null, 1, (Object) null);
                throw th;
            }
            if (ChannelFlowKt.withContextUndispatched$default(coroutineScope.getCoroutineContext().plus(Job$default), Unit.INSTANCE, null, new AnonymousClass3(coroutineContext, threadContextElements, produce$default, null), this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel2 = produce$default;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannel2, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
            FlowExceptions_commonKt.checkOwnership(e, this.$this_unsafeFlow);
            receiveChannel2 = receiveChannel;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannel2, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "", "invoke", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$1"}, k = 3, mv = {1, 4, 2})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CompletableJob $collectJob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CompletableJob completableJob) {
            super(1);
            this.$collectJob = completableJob;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.$collectJob.isActive()) {
                this.$collectJob.cancel((CancellationException) new AbortFlowException(CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this.$this_unsafeFlow));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ ReceiveChannel $second;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CoroutineContext coroutineContext, Object obj, ReceiveChannel receiveChannel, Continuation continuation) {
            super(2, continuation);
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$scopeContext, this.$cnt, this.$second, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this.this$0.$flow$inlined.collect(new FlowCollector<T1>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$.inlined.unsafeFlow.1.lambda.1.3.1

                    /* compiled from: Combine.kt */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1", "kotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$invokeSuspend$$inlined$collect$1$lambda$1"}, k = 3, mv = {1, 4, 2})
                    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 145, 145}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes.dex */
                    static final class C00181 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Object $value;
                        Object L$0;
                        int label;
                        final /* synthetic */ AnonymousClass1 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00181(Object obj, Continuation continuation, AnonymousClass1 anonymousClass1) {
                            super(2, continuation);
                            this.$value = obj;
                            this.this$0 = anonymousClass1;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00181(this.$value, continuation, this.this$0);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                            return ((C00181) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[RETURN] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                            /*
                                r8 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r8.label
                                r2 = 0
                                r3 = 3
                                r4 = 2
                                r5 = 1
                                if (r1 == 0) goto L2a
                                if (r1 == r5) goto L26
                                if (r1 == r4) goto L1e
                                if (r1 != r3) goto L16
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L7b
                            L16:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r0)
                                throw r9
                            L1e:
                                java.lang.Object r1 = r8.L$0
                                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L70
                            L26:
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L3c
                            L2a:
                                kotlin.ResultKt.throwOnFailure(r9)
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3$1 r9 = r8.this$0
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3 r9 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.AnonymousClass3.this
                                kotlinx.coroutines.channels.ReceiveChannel r9 = r9.$second
                                r8.label = r5
                                java.lang.Object r9 = kotlinx.coroutines.channels.ChannelsKt.receiveOrNull(r9, r8)
                                if (r9 != r0) goto L3c
                                return r0
                            L3c:
                                if (r9 == 0) goto L7e
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3$1 r1 = r8.this$0
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3 r1 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.AnonymousClass3.this
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 r1 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this
                                kotlinx.coroutines.flow.FlowCollector r1 = r1.$this_unsafeFlow
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3$1 r5 = r8.this$0
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3 r5 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.AnonymousClass3.this
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 r5 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1 r5 = r5.this$0
                                kotlin.jvm.functions.Function3 r5 = r5.$transform$inlined
                                java.lang.Object r6 = r8.$value
                                kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                                if (r9 != r7) goto L57
                                r9 = r2
                            L57:
                                r8.L$0 = r1
                                r8.label = r4
                                r4 = 6
                                kotlin.jvm.internal.InlineMarker.mark(r4)
                                kotlin.jvm.internal.InlineMarker.mark(r4)
                                java.lang.Object r9 = r5.invoke(r6, r9, r8)
                                r4 = 7
                                kotlin.jvm.internal.InlineMarker.mark(r4)
                                kotlin.jvm.internal.InlineMarker.mark(r4)
                                if (r9 != r0) goto L70
                                return r0
                            L70:
                                r8.L$0 = r2
                                r8.label = r3
                                java.lang.Object r9 = r1.emit(r9, r8)
                                if (r9 != r0) goto L7b
                                return r0
                            L7b:
                                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                                return r9
                            L7e:
                                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3$1 r0 = r8.this$0
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$3 r0 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.AnonymousClass3.this
                                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 r0 = kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.this
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.$this_unsafeFlow
                                r9.<init>(r0)
                                java.lang.Throwable r9 = (java.lang.Throwable) r9
                                throw r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1.AnonymousClass3.AnonymousClass1.C00181.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(Object obj2, Continuation continuation) {
                        Object withContextUndispatched = ChannelFlowKt.withContextUndispatched(AnonymousClass3.this.$scopeContext, Unit.INSTANCE, AnonymousClass3.this.$cnt, new C00181(obj2, null, this), continuation);
                        return withContextUndispatched == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContextUndispatched : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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
}