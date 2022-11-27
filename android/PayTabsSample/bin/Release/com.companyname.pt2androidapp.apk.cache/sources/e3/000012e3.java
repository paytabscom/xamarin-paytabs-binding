package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BeforeResumeCancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ValueOrClosed;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.LockFreeLinkedList_commonKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;

/* compiled from: AbstractChannel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007XYZ[\\]^B'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0016\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u001c\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fJ\u0017\u0010 \u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0002\b!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0004J\u0016\u0010$\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0002J\u0016\u0010'\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0014JR\u0010(\u001a\u00020\n\"\u0004\b\u0001\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2$\u0010,\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0002\u00102J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0086\u0002J\u0010\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\nH\u0014J/\u00107\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\u0006H\u0014J\b\u0010@\u001a\u00020\u0006H\u0014J\r\u0010A\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010BJ\n\u0010C\u001a\u0004\u0018\u00010.H\u0014J\u0016\u0010D\u001a\u0004\u0018\u00010.2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+H\u0014J\u0011\u0010%\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010EJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bG\u0010EJ\u0013\u0010H\u001a\u0004\u0018\u00018\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0002\u0010KJ\u001f\u0010L\u001a\u0002H)\"\u0004\b\u0001\u0010)2\u0006\u00100\u001a\u000201H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010MJR\u0010N\u001a\u00020\u0006\"\u0004\b\u0001\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2\u0006\u00100\u001a\u0002012$\u0010,\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-H\u0002ø\u0001\u0000¢\u0006\u0002\u0010OJ \u0010P\u001a\u00020\u00062\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030R2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0002J\u0010\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010TH\u0014JX\u0010U\u001a\u00020\u0006\"\u0004\b\u0001\u0010)* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2\u0006\u00100\u001a\u0002012\b\u0010V\u001a\u0004\u0018\u00010.H\u0002ø\u0001\u0000¢\u0006\u0002\u0010WR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrClosed", "Lkotlinx/coroutines/channels/ValueOrClosed;", "getOnReceiveOrClosed", "onReceiveOrNull", "getOnReceiveOrNull", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "poll", "()Ljava/lang/Object;", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrClosed", "receiveOrClosed-WVj179g", "receiveOrNull", "receiveOrNullResult", "result", "(Ljava/lang/Object;)Ljava/lang/Object;", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class AbstractChannel<E> extends AbstractSendChannel<E> implements Channel<E> {
    protected abstract boolean isBufferAlwaysEmpty();

    public abstract boolean isBufferEmpty();

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    public static final /* synthetic */ void access$registerSelectReceiveMode(AbstractChannel abstractChannel, SelectInstance selectInstance, int i2, Function2 function2) {
        abstractChannel.registerSelectReceiveMode(selectInstance, i2, function2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public AbstractChannel(Function1<? super E, Unit> function1) {
        super(function1);
    }

    protected Object pollInternal() {
        while (true) {
            Send takeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
            if (takeFirstSendOrPeekClosed == null) {
                return AbstractChannelKt.POLL_FAILED;
            }
            Symbol tryResumeSend = takeFirstSendOrPeekClosed.tryResumeSend(null);
            if (tryResumeSend != null) {
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(tryResumeSend == CancellableContinuationImplKt.RESUME_TOKEN)) {
                        throw new AssertionError();
                    }
                }
                takeFirstSendOrPeekClosed.completeResumeSend();
                return takeFirstSendOrPeekClosed.getPollResult();
            }
            takeFirstSendOrPeekClosed.undeliveredElement();
        }
    }

    protected Object pollSelectInternal(SelectInstance<?> selectInstance) {
        TryPollDesc<E> describeTryPoll = describeTryPoll();
        Object performAtomicTrySelect = selectInstance.performAtomicTrySelect(describeTryPoll);
        if (performAtomicTrySelect != null) {
            return performAtomicTrySelect;
        }
        describeTryPoll.getResult().completeResumeSend();
        return describeTryPoll.getResult().getPollResult();
    }

    public final boolean getHasReceiveOrClosed() {
        return getQueue().getNextNode() instanceof ReceiveOrClosed;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return getClosedForReceive() != null && isBufferEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return isEmptyImpl();
    }

    public final boolean isEmptyImpl() {
        return !(getQueue().getNextNode() instanceof Send) && isBufferEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receive(Continuation<? super E> continuation) {
        Object pollInternal = pollInternal();
        return (pollInternal == AbstractChannelKt.POLL_FAILED || (pollInternal instanceof Closed)) ? receiveSuspend(0, continuation) : pollInternal;
    }

    public boolean enqueueReceiveInternal(Receive<? super E> receive) {
        int tryCondAddNext;
        LockFreeLinkedListNode prevNode;
        if (isBufferAlwaysEmpty()) {
            LockFreeLinkedListHead queue = getQueue();
            do {
                prevNode = queue.getPrevNode();
                if (!(!(prevNode instanceof Send))) {
                    return false;
                }
            } while (!prevNode.addNext(receive, queue));
        } else {
            LockFreeLinkedListHead queue2 = getQueue();
            final Receive<? super E> receive2 = receive;
            LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(receive2) { // from class: kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1
                @Override // kotlinx.coroutines.internal.AtomicOp
                public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
                    if (this.isBufferEmpty()) {
                        return null;
                    }
                    return LockFreeLinkedListKt.getCONDITION_FALSE();
                }
            };
            do {
                LockFreeLinkedListNode prevNode2 = queue2.getPrevNode();
                if (!(!(prevNode2 instanceof Send))) {
                    return false;
                }
                tryCondAddNext = prevNode2.tryCondAddNext(receive2, queue2, condAddOp);
                if (tryCondAddNext != 1) {
                }
            } while (tryCondAddNext != 2);
            return false;
        }
        return true;
    }

    public final boolean enqueueReceive(Receive<? super E> receive) {
        boolean enqueueReceiveInternal = enqueueReceiveInternal(receive);
        if (enqueueReceiveInternal) {
            onReceiveEnqueued();
        }
        return enqueueReceiveInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receiveOrNull(Continuation<? super E> continuation) {
        Object pollInternal = pollInternal();
        return (pollInternal == AbstractChannelKt.POLL_FAILED || (pollInternal instanceof Closed)) ? receiveSuspend(1, continuation) : pollInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final E receiveOrNullResult(Object obj) {
        if (obj instanceof Closed) {
            Closed closed = (Closed) obj;
            if (closed.closeCause == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closed.closeCause);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0032  */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveOrClosed-WVj179g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1406receiveOrClosedWVj179g(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ValueOrClosed<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveOrClosed$1
            if (r0 == 0) goto L14
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveOrClosed$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveOrClosed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            kotlinx.coroutines.channels.AbstractChannel$receiveOrClosed$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveOrClosed$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L62
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.pollInternal()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r5 == r2) goto L58
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L51
            kotlinx.coroutines.channels.ValueOrClosed$Companion r0 = kotlinx.coroutines.channels.ValueOrClosed.Companion
            kotlinx.coroutines.channels.Closed r5 = (kotlinx.coroutines.channels.Closed) r5
            java.lang.Throwable r5 = r5.closeCause
            kotlinx.coroutines.channels.ValueOrClosed$Closed r0 = new kotlinx.coroutines.channels.ValueOrClosed$Closed
            r0.<init>(r5)
            java.lang.Object r5 = kotlinx.coroutines.channels.ValueOrClosed.m1409constructorimpl(r0)
            goto L57
        L51:
            kotlinx.coroutines.channels.ValueOrClosed$Companion r0 = kotlinx.coroutines.channels.ValueOrClosed.Companion
            java.lang.Object r5 = kotlinx.coroutines.channels.ValueOrClosed.m1409constructorimpl(r5)
        L57:
            return r5
        L58:
            r5 = 2
            r0.label = r3
            java.lang.Object r5 = r4.receiveSuspend(r5, r0)
            if (r5 != r1) goto L62
            return r1
        L62:
            kotlinx.coroutines.channels.ValueOrClosed r5 = (kotlinx.coroutines.channels.ValueOrClosed) r5
            java.lang.Object r5 = r5.m1418unboximpl()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.mo1406receiveOrClosedWVj179g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final E poll() {
        Object pollInternal = pollInternal();
        if (pollInternal == AbstractChannelKt.POLL_FAILED) {
            return null;
        }
        return receiveOrNullResult(pollInternal);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        if (isClosedForReceive()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(DebugStringsKt.getClassSimpleName(this) + " was cancelled");
        }
        cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: cancelInternal$kotlinx_coroutines_core */
    public final boolean cancel(Throwable th) {
        boolean close = close(th);
        onCancelIdempotent(close);
        return close;
    }

    public void onCancelIdempotent(boolean z2) {
        Closed<?> closedForSend = getClosedForSend();
        if (closedForSend == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object m1432constructorimpl$default = InlineList.m1432constructorimpl$default(null, 1, null);
        while (true) {
            LockFreeLinkedListNode prevNode = closedForSend.getPrevNode();
            if (!(prevNode instanceof LockFreeLinkedListHead)) {
                if (DebugKt.getASSERTIONS_ENABLED() && !(prevNode instanceof Send)) {
                    throw new AssertionError();
                }
                if (!prevNode.remove()) {
                    prevNode.helpRemove();
                } else {
                    Objects.requireNonNull(prevNode, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                    m1432constructorimpl$default = InlineList.m1437plusFjFbRPM(m1432constructorimpl$default, (Send) prevNode);
                }
            } else {
                mo1405onCancelIdempotentListww6eGU(m1432constructorimpl$default, closedForSend);
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator<E> iterator() {
        return new Itr(this);
    }

    public final TryPollDesc<E> describeTryPoll() {
        return new TryPollDesc<>(getQueue());
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "onRemoved", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class TryPollDesc<E> extends LockFreeLinkedListNode.RemoveFirstDesc<Send> {
        public TryPollDesc(LockFreeLinkedListHead lockFreeLinkedListHead) {
            super(lockFreeLinkedListHead);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected Object failure(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof Closed) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof Send) {
                return null;
            }
            return AbstractChannelKt.POLL_FAILED;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public Object onPrepare(LockFreeLinkedListNode.PrepareOp prepareOp) {
            LockFreeLinkedListNode lockFreeLinkedListNode = prepareOp.affected;
            Objects.requireNonNull(lockFreeLinkedListNode, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
            Symbol tryResumeSend = ((Send) lockFreeLinkedListNode).tryResumeSend(prepareOp);
            if (tryResumeSend == null) {
                return LockFreeLinkedList_commonKt.REMOVE_PREPARED;
            }
            if (tryResumeSend == AtomicKt.RETRY_ATOMIC) {
                return AtomicKt.RETRY_ATOMIC;
            }
            if (DebugKt.getASSERTIONS_ENABLED()) {
                if (tryResumeSend == CancellableContinuationImplKt.RESUME_TOKEN) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void onRemoved(LockFreeLinkedListNode lockFreeLinkedListNode) {
            Objects.requireNonNull(lockFreeLinkedListNode, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
            ((Send) lockFreeLinkedListNode).undeliveredElement();
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1<E> getOnReceive() {
        return new SelectClause1<E>() { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceive$1
            @Override // kotlinx.coroutines.selects.SelectClause1
            public <R> void registerSelectClause1(SelectInstance<? super R> selectInstance, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
                AbstractChannel abstractChannel = AbstractChannel.this;
                Objects.requireNonNull(function2, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                AbstractChannel.access$registerSelectReceiveMode(abstractChannel, selectInstance, 0, function2);
            }
        };
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1<E> getOnReceiveOrNull() {
        return new SelectClause1<E>() { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceiveOrNull$1
            @Override // kotlinx.coroutines.selects.SelectClause1
            public <R> void registerSelectClause1(SelectInstance<? super R> selectInstance, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
                AbstractChannel abstractChannel = AbstractChannel.this;
                Objects.requireNonNull(function2, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                AbstractChannel.access$registerSelectReceiveMode(abstractChannel, selectInstance, 1, function2);
            }
        };
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1<ValueOrClosed<E>> getOnReceiveOrClosed() {
        return (SelectClause1) ((SelectClause1<ValueOrClosed<? extends E>>) new SelectClause1<ValueOrClosed<? extends E>>() { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceiveOrClosed$1
            @Override // kotlinx.coroutines.selects.SelectClause1
            public <R> void registerSelectClause1(SelectInstance<? super R> selectInstance, Function2<? super ValueOrClosed<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
                AbstractChannel abstractChannel = AbstractChannel.this;
                Objects.requireNonNull(function2, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                AbstractChannel.access$registerSelectReceiveMode(abstractChannel, selectInstance, 2, function2);
            }
        });
    }

    public final <R> void registerSelectReceiveMode(SelectInstance<? super R> selectInstance, int i2, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!selectInstance.isSelected()) {
            if (isEmptyImpl()) {
                if (enqueueReceiveSelect(selectInstance, function2, i2)) {
                    return;
                }
            } else {
                Object pollSelectInternal = pollSelectInternal(selectInstance);
                if (pollSelectInternal == SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (pollSelectInternal != AbstractChannelKt.POLL_FAILED && pollSelectInternal != AtomicKt.RETRY_ATOMIC) {
                    tryStartBlockUnintercepted(function2, selectInstance, i2, pollSelectInternal);
                }
            }
        }
    }

    private final <R> void tryStartBlockUnintercepted(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, SelectInstance<? super R> selectInstance, int i2, Object obj) {
        Object m1409constructorimpl;
        boolean z2 = obj instanceof Closed;
        if (!z2) {
            if (i2 != 2) {
                UndispatchedKt.startCoroutineUnintercepted(function2, obj, selectInstance.getCompletion());
                return;
            }
            ValueOrClosed.Companion companion = ValueOrClosed.Companion;
            if (z2) {
                m1409constructorimpl = ValueOrClosed.m1409constructorimpl(new ValueOrClosed.Closed(((Closed) obj).closeCause));
            } else {
                m1409constructorimpl = ValueOrClosed.m1409constructorimpl(obj);
            }
            UndispatchedKt.startCoroutineUnintercepted(function2, ValueOrClosed.m1408boximpl(m1409constructorimpl), selectInstance.getCompletion());
        } else if (i2 == 0) {
            throw StackTraceRecoveryKt.recoverStackTrace(((Closed) obj).getReceiveException());
        } else {
            if (i2 != 1) {
                if (i2 == 2 && selectInstance.trySelect()) {
                    ValueOrClosed.Companion companion2 = ValueOrClosed.Companion;
                    UndispatchedKt.startCoroutineUnintercepted(function2, ValueOrClosed.m1408boximpl(ValueOrClosed.m1409constructorimpl(new ValueOrClosed.Closed(((Closed) obj).closeCause))), selectInstance.getCompletion());
                    return;
                }
                return;
            }
            Closed closed = (Closed) obj;
            if (closed.closeCause == null) {
                if (selectInstance.trySelect()) {
                    UndispatchedKt.startCoroutineUnintercepted(function2, null, selectInstance.getCompletion());
                    return;
                }
                return;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closed.getReceiveException());
        }
    }

    private final <R> boolean enqueueReceiveSelect(SelectInstance<? super R> selectInstance, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
        ReceiveSelect receiveSelect = new ReceiveSelect(this, selectInstance, function2, i2);
        boolean enqueueReceive = enqueueReceive(receiveSelect);
        if (enqueueReceive) {
            selectInstance.disposeOnSelect(receiveSelect);
        }
        return enqueueReceive;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
        ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed = super.takeFirstReceiveOrPeekClosed();
        if (takeFirstReceiveOrPeekClosed != null && !(takeFirstReceiveOrPeekClosed instanceof Closed)) {
            onReceiveDequeued();
        }
        return takeFirstReceiveOrPeekClosed;
    }

    public final void removeReceiveOnCancel(CancellableContinuation<?> cancellableContinuation, Receive<?> receive) {
        cancellableContinuation.invokeOnCancellation(new RemoveReceiveOnCancel(receive));
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final class RemoveReceiveOnCancel extends BeforeResumeCancelHandler {
        private final Receive<?> receive;

        public RemoveReceiveOnCancel(Receive<?> receive) {
            AbstractChannel.this = r1;
            this.receive = receive;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: invoke */
        public void invoke2(Throwable th) {
            if (this.receive.remove()) {
                AbstractChannel.this.onReceiveDequeued();
            }
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.receive + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Itr<E> implements ChannelIterator<E> {
        public final AbstractChannel<E> channel;
        private Object result = AbstractChannelKt.POLL_FAILED;

        public Itr(AbstractChannel<E> abstractChannel) {
            this.channel = abstractChannel;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object next(Continuation<? super E> continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) {
            if (this.result != AbstractChannelKt.POLL_FAILED) {
                return Boxing.boxBoolean(hasNextResult(this.result));
            }
            Object pollInternal = this.channel.pollInternal();
            this.result = pollInternal;
            return pollInternal != AbstractChannelKt.POLL_FAILED ? Boxing.boxBoolean(hasNextResult(this.result)) : hasNextSuspend(continuation);
        }

        private final boolean hasNextResult(Object obj) {
            if (obj instanceof Closed) {
                Closed closed = (Closed) obj;
                if (closed.closeCause == null) {
                    return false;
                }
                throw StackTraceRecoveryKt.recoverStackTrace(closed.getReceiveException());
            }
            return true;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            E e2 = (E) this.result;
            if (e2 instanceof Closed) {
                throw StackTraceRecoveryKt.recoverStackTrace(((Closed) e2).getReceiveException());
            }
            if (e2 != AbstractChannelKt.POLL_FAILED) {
                this.result = AbstractChannelKt.POLL_FAILED;
                return e2;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }

        final /* synthetic */ Object hasNextSuspend(Continuation<? super Boolean> continuation) {
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation;
            ReceiveHasNext receiveHasNext = new ReceiveHasNext(this, cancellableContinuationImpl);
            while (true) {
                ReceiveHasNext receiveHasNext2 = receiveHasNext;
                if (this.channel.enqueueReceive(receiveHasNext2)) {
                    this.channel.removeReceiveOnCancel(cancellableContinuationImpl, receiveHasNext2);
                    break;
                }
                Object pollInternal = this.channel.pollInternal();
                setResult(pollInternal);
                if (pollInternal instanceof Closed) {
                    Closed closed = (Closed) pollInternal;
                    if (closed.closeCause == null) {
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(Result.m21constructorimpl(boxBoolean));
                    } else {
                        Throwable receiveException = closed.getReceiveException();
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuationImpl.resumeWith(Result.m21constructorimpl(ResultKt.createFailure(receiveException)));
                    }
                } else if (pollInternal != AbstractChannelKt.POLL_FAILED) {
                    Boolean boxBoolean2 = Boxing.boxBoolean(true);
                    Function1<E, Unit> function1 = this.channel.onUndeliveredElement;
                    cancellableContinuationImpl.resume(boxBoolean2, function1 != null ? OnUndeliveredElementKt.bindCancellationFun(function1, pollInternal, cancellableContinuationImpl.getContext()) : null);
                }
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static class ReceiveElement<E> extends Receive<E> {
        public final CancellableContinuation<Object> cont;
        public final int receiveMode;

        public ReceiveElement(CancellableContinuation<Object> cancellableContinuation, int i2) {
            this.cont = cancellableContinuation;
            this.receiveMode = i2;
        }

        public final Object resumeValue(E e2) {
            if (this.receiveMode != 2) {
                return e2;
            }
            ValueOrClosed.Companion companion = ValueOrClosed.Companion;
            return ValueOrClosed.m1408boximpl(ValueOrClosed.m1409constructorimpl(e2));
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public Symbol tryResumeReceive(E e2, LockFreeLinkedListNode.PrepareOp prepareOp) {
            Object tryResume = this.cont.tryResume(resumeValue(e2), prepareOp != null ? prepareOp.desc : null, resumeOnCancellationFun(e2));
            if (tryResume != null) {
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(tryResume == CancellableContinuationImplKt.RESUME_TOKEN)) {
                        throw new AssertionError();
                    }
                }
                if (prepareOp != null) {
                    prepareOp.finishPrepare();
                }
                return CancellableContinuationImplKt.RESUME_TOKEN;
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E e2) {
            this.cont.completeResume(CancellableContinuationImplKt.RESUME_TOKEN);
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(Closed<?> closed) {
            if (this.receiveMode == 1 && closed.closeCause == null) {
                Result.Companion companion = Result.Companion;
                this.cont.resumeWith(Result.m21constructorimpl(null));
            } else if (this.receiveMode != 2) {
                Throwable receiveException = closed.getReceiveException();
                Result.Companion companion2 = Result.Companion;
                this.cont.resumeWith(Result.m21constructorimpl(ResultKt.createFailure(receiveException)));
            } else {
                ValueOrClosed.Companion companion3 = ValueOrClosed.Companion;
                ValueOrClosed m1408boximpl = ValueOrClosed.m1408boximpl(ValueOrClosed.m1409constructorimpl(new ValueOrClosed.Closed(closed.closeCause)));
                Result.Companion companion4 = Result.Companion;
                this.cont.resumeWith(Result.m21constructorimpl(m1408boximpl));
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveElement@" + DebugStringsKt.getHexAddress(this) + "[receiveMode=" + this.receiveMode + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ReceiveElementWithUndeliveredHandler<E> extends ReceiveElement<E> {
        public final Function1<E, Unit> onUndeliveredElement;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveElementWithUndeliveredHandler(CancellableContinuation<Object> cancellableContinuation, int i2, Function1<? super E, Unit> function1) {
            super(cancellableContinuation, i2);
            this.onUndeliveredElement = function1;
        }

        @Override // kotlinx.coroutines.channels.Receive
        public Function1<Throwable, Unit> resumeOnCancellationFun(E e2) {
            return OnUndeliveredElementKt.bindCancellationFun(this.onUndeliveredElement, e2, this.cont.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static class ReceiveHasNext<E> extends Receive<E> {
        public final CancellableContinuation<Boolean> cont;
        public final Itr<E> iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveHasNext(Itr<E> itr, CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.iterator = itr;
            this.cont = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public Symbol tryResumeReceive(E e2, LockFreeLinkedListNode.PrepareOp prepareOp) {
            Object tryResume = this.cont.tryResume(true, prepareOp != null ? prepareOp.desc : null, resumeOnCancellationFun(e2));
            if (tryResume != null) {
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(tryResume == CancellableContinuationImplKt.RESUME_TOKEN)) {
                        throw new AssertionError();
                    }
                }
                if (prepareOp != null) {
                    prepareOp.finishPrepare();
                }
                return CancellableContinuationImplKt.RESUME_TOKEN;
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E e2) {
            this.iterator.setResult(e2);
            this.cont.completeResume(CancellableContinuationImplKt.RESUME_TOKEN);
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(Closed<?> closed) {
            Object tryResumeWithException;
            if (closed.closeCause == null) {
                tryResumeWithException = CancellableContinuation.DefaultImpls.tryResume$default(this.cont, false, null, 2, null);
            } else {
                tryResumeWithException = this.cont.tryResumeWithException(closed.getReceiveException());
            }
            if (tryResumeWithException != null) {
                this.iterator.setResult(closed);
                this.cont.completeResume(tryResumeWithException);
            }
        }

        @Override // kotlinx.coroutines.channels.Receive
        public Function1<Throwable, Unit> resumeOnCancellationFun(E e2) {
            Function1<E, Unit> function1 = this.iterator.channel.onUndeliveredElement;
            if (function1 != null) {
                return OnUndeliveredElementKt.bindCancellationFun(function1, e2, this.cont.getContext());
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveHasNext@" + DebugStringsKt.getHexAddress(this);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ReceiveSelect<R, E> extends Receive<E> implements DisposableHandle {
        public final Function2<Object, Continuation<? super R>, Object> block;
        public final AbstractChannel<E> channel;
        public final int receiveMode;
        public final SelectInstance<R> select;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveSelect(AbstractChannel<E> abstractChannel, SelectInstance<? super R> selectInstance, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
            this.channel = abstractChannel;
            this.select = selectInstance;
            this.block = function2;
            this.receiveMode = i2;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public Symbol tryResumeReceive(E e2, LockFreeLinkedListNode.PrepareOp prepareOp) {
            return (Symbol) this.select.trySelectOther(prepareOp);
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E e2) {
            Object obj;
            Function2<Object, Continuation<? super R>, Object> function2 = this.block;
            if (this.receiveMode == 2) {
                ValueOrClosed.Companion companion = ValueOrClosed.Companion;
                obj = ValueOrClosed.m1408boximpl(ValueOrClosed.m1409constructorimpl(e2));
            } else {
                obj = e2;
            }
            CancellableKt.startCoroutineCancellable(function2, obj, this.select.getCompletion(), resumeOnCancellationFun(e2));
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(Closed<?> closed) {
            if (this.select.trySelect()) {
                int i2 = this.receiveMode;
                if (i2 == 0) {
                    this.select.resumeSelectWithException(closed.getReceiveException());
                } else if (i2 == 1) {
                    if (closed.closeCause == null) {
                        CancellableKt.startCoroutineCancellable$default(this.block, null, this.select.getCompletion(), null, 4, null);
                    } else {
                        this.select.resumeSelectWithException(closed.getReceiveException());
                    }
                } else if (i2 != 2) {
                } else {
                    Function2<Object, Continuation<? super R>, Object> function2 = this.block;
                    ValueOrClosed.Companion companion = ValueOrClosed.Companion;
                    CancellableKt.startCoroutineCancellable$default(function2, ValueOrClosed.m1408boximpl(ValueOrClosed.m1409constructorimpl(new ValueOrClosed.Closed(closed.closeCause))), this.select.getCompletion(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            if (remove()) {
                this.channel.onReceiveDequeued();
            }
        }

        @Override // kotlinx.coroutines.channels.Receive
        public Function1<Throwable, Unit> resumeOnCancellationFun(E e2) {
            Function1<E, Unit> function1 = this.channel.onUndeliveredElement;
            if (function1 != null) {
                return OnUndeliveredElementKt.bindCancellationFun(function1, e2, this.select.getCompletion().getContext());
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveSelect@" + DebugStringsKt.getHexAddress(this) + '[' + this.select + ",receiveMode=" + this.receiveMode + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.channels.AbstractChannel$ReceiveElement] */
    final /* synthetic */ <R> Object receiveSuspend(int i2, Continuation<? super R> continuation) {
        ReceiveElementWithUndeliveredHandler receiveElementWithUndeliveredHandler;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation;
        if (this.onUndeliveredElement == null) {
            Objects.requireNonNull(cancellableContinuationImpl, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
            receiveElementWithUndeliveredHandler = new ReceiveElement(cancellableContinuationImpl, i2);
        } else {
            Objects.requireNonNull(cancellableContinuationImpl, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
            receiveElementWithUndeliveredHandler = new ReceiveElementWithUndeliveredHandler(cancellableContinuationImpl, i2, this.onUndeliveredElement);
        }
        while (true) {
            ReceiveElementWithUndeliveredHandler receiveElementWithUndeliveredHandler2 = receiveElementWithUndeliveredHandler;
            if (enqueueReceive(receiveElementWithUndeliveredHandler2)) {
                removeReceiveOnCancel(cancellableContinuationImpl, receiveElementWithUndeliveredHandler2);
                break;
            }
            Object pollInternal = pollInternal();
            if (pollInternal instanceof Closed) {
                receiveElementWithUndeliveredHandler.resumeReceiveClosed((Closed) pollInternal);
                break;
            } else if (pollInternal != AbstractChannelKt.POLL_FAILED) {
                cancellableContinuationImpl.resume(receiveElementWithUndeliveredHandler.resumeValue(pollInternal), receiveElementWithUndeliveredHandler.resumeOnCancellationFun(pollInternal));
                break;
            }
        }
        Object result = orCreateCancellableContinuation.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: onCancelIdempotentList-w-w6eGU */
    protected void mo1405onCancelIdempotentListww6eGU(Object obj, Closed<?> closed) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((Send) obj).resumeSendClosed(closed);
            return;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Send) arrayList.get(size)).resumeSendClosed(closed);
        }
    }
}