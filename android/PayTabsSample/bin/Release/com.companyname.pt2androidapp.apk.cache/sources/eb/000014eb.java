package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedFlow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001bB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020'H\u0002J\u001f\u0010.\u001a\u00020'2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u00020\u0003H\u0014J\u001d\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u00106\u001a\u00020\bH\u0014¢\u0006\u0002\u00107J\b\u00108\u001a\u00020'H\u0002J\u0019\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0019\u0010<\u001a\u00020'2\u0006\u0010:\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0012\u0010=\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010@0\u000e2\u0014\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010@0\u000eH\u0002¢\u0006\u0002\u0010BJ&\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010H\u001a\u0004\u0018\u00010\u000f2\u0006\u0010I\u001a\u00020\u0012H\u0002J7\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0002¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020'H\u0016J\u0015\u0010P\u001a\u00020Q2\u0006\u0010:\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010RJ\u0015\u0010S\u001a\u00020Q2\u0006\u0010:\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010RJ\u0015\u0010T\u001a\u00020Q2\u0006\u0010:\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010RJ\u0010\u0010U\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0012\u0010V\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u0003H\u0002J(\u0010W\u001a\u00020'2\u0006\u0010X\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u0012H\u0002J%\u0010\\\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010@0\u000e2\u0006\u0010]\u001a\u00020\u0012H\u0000¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u0012H\u0000¢\u0006\u0002\baR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
        }
    }

    public SharedFlowImpl(int i2, int i3, BufferOverflow bufferOverflow) {
        this.replay = i2;
        this.bufferCapacity = i3;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:14:0x003c, B:35:0x00a3, B:38:0x00ad, B:39:0x00b0, B:42:0x00c1, B:19:0x005a, B:22:0x006c, B:33:0x0093), top: B:49:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.flow.SharedFlowSlot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.flow.SharedFlowImpl] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:15:0x003f). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t2) {
        int i2;
        boolean z2;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t2)) {
                continuationArr = findSlotsToResumeLocked(continuationArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m21constructorimpl(unit));
            }
        }
        return z2;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        if (tryEmit(t2)) {
            return Unit.INSTANCE;
        }
        Object emitSuspend = emitSuspend(t2, continuation);
        return emitSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t2) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t2);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        enqueueLocked(t2);
        int i3 = this.bufferSize + 1;
        this.bufferSize = i3;
        if (i3 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t2) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getNCollectors() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t2);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getHead() == head)) {
                throw new AssertionError();
            }
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long j2) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j2) {
                        sharedFlowSlot.index = j2;
                    }
                }
            }
        }
        this.minCollectorIndex = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(null, 0, 2);
        } else if (totalSize >= objArr.length) {
            objArr = growBuffer(objArr, totalSize, objArr.length * 2);
        }
        SharedFlowKt.setBufferAt(objArr, getHead() + totalSize, obj);
    }

    private final Object[] growBuffer(Object[] objArr, int i2, int i3) {
        Object bufferAt;
        if (!(i3 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.buffer = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = i4 + head;
            bufferAt = SharedFlowKt.getBufferAt(objArr, j2);
            SharedFlowKt.setBufferAt(objArr2, j2, bufferAt);
        }
        return objArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j2 = this.replayIndex;
        if (j2 < this.minCollectorIndex) {
            this.minCollectorIndex = j2;
        }
        return j2;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j2) {
        int i2;
        long j3;
        Object bufferAt;
        Object bufferAt2;
        long j4;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(j2 >= this.minCollectorIndex)) {
                throw new AssertionError();
            }
        }
        if (j2 > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j5 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j5++;
        }
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j5) {
                        j5 = sharedFlowSlot.index;
                    }
                }
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(j5 >= this.minCollectorIndex)) {
                throw new AssertionError();
            }
        }
        if (j5 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        if (getNCollectors() > 0) {
            i2 = Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j5)));
        } else {
            i2 = this.queueSize;
        }
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j6 = this.queueSize + bufferEndIndex;
        if (i2 > 0) {
            continuationArr = new Continuation[i2];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            long j7 = bufferEndIndex;
            int i3 = 0;
            while (true) {
                if (bufferEndIndex >= j6) {
                    j3 = j5;
                    break;
                }
                bufferAt2 = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                if (bufferAt2 != SharedFlowKt.NO_VALUE) {
                    Objects.requireNonNull(bufferAt2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt2;
                    int i4 = i3 + 1;
                    j3 = j5;
                    continuationArr[i3] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, SharedFlowKt.NO_VALUE);
                    SharedFlowKt.setBufferAt(objArr, j7, emitter.value);
                    j4 = 1;
                    j7++;
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j3 = j5;
                    j4 = 1;
                }
                bufferEndIndex += j4;
                j5 = j3;
            }
            bufferEndIndex = j7;
        } else {
            j3 = j5;
        }
        int i5 = (int) (bufferEndIndex - head);
        long j8 = getNCollectors() == 0 ? bufferEndIndex : j3;
        long max = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i5));
        if (this.bufferCapacity == 0 && max < j6) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            bufferAt = SharedFlowKt.getBufferAt(objArr2, max);
            if (Intrinsics.areEqual(bufferAt, SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                max++;
            }
        }
        updateBufferLocked(max, j8, bufferEndIndex, j6);
        cleanupTailLocked();
        return true ^ (continuationArr.length == 0) ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    private final void updateBufferLocked(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(min >= getHead())) {
                throw new AssertionError();
            }
        }
        for (long head = getHead(); head < min; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j2;
        this.minCollectorIndex = j3;
        this.bufferSize = (int) (j4 - min);
        this.queueSize = (int) (j5 - j4);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.bufferSize >= 0)) {
                throw new AssertionError();
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.queueSize >= 0)) {
                throw new AssertionError();
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.replayIndex <= getHead() + ((long) this.bufferSize))) {
                throw new AssertionError();
            }
        }
    }

    private final void cleanupTailLocked() {
        Object bufferAt;
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0) {
                bufferAt = SharedFlowKt.getBufferAt(objArr, (getHead() + getTotalSize()) - 1);
                if (bufferAt != SharedFlowKt.NO_VALUE) {
                    return;
                }
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long tryPeekLocked = tryPeekLocked(sharedFlowSlot);
            if (tryPeekLocked < 0) {
                obj = SharedFlowKt.NO_VALUE;
            } else {
                long j2 = sharedFlowSlot.index;
                Object peekedValueLockedAt = getPeekedValueLockedAt(tryPeekLocked);
                sharedFlowSlot.index = tryPeekLocked + 1;
                continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j2);
                obj = peekedValueLockedAt;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m21constructorimpl(unit));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j2 = sharedFlowSlot.index;
        if (j2 < getBufferEndIndex()) {
            return j2;
        }
        if (this.bufferCapacity <= 0 && j2 <= getHead() && this.queueSize != 0) {
            return j2;
        }
        return -1L;
    }

    private final Object getPeekedValueLockedAt(long j2) {
        Object bufferAt;
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        bufferAt = SharedFlowKt.getBufferAt(objArr, j2);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i2 = 0;
            continuationArr = continuationArr;
            while (i2 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i2];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        continuationArr = (Continuation[]) copyOf;
                    }
                    continuationArr[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i2) {
        return new SharedFlowSlot[i2];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i2, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Emitter implements DisposableHandle {
        public final Continuation<Unit> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j2, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j2;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        Object bufferAt;
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i2 = 0; i2 < replaySize; i2++) {
                bufferAt = SharedFlowKt.getBufferAt(objArr, this.replayIndex + i2);
                arrayList.add(bufferAt);
            }
            return arrayList;
        }
    }

    final /* synthetic */ Object emitSuspend(T t2, Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArr;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Continuation<Unit>[] continuationArr2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t2)) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m21constructorimpl(unit));
                continuationArr = findSlotsToResumeLocked(continuationArr2);
                emitter = null;
            } else {
                Emitter emitter2 = new Emitter(this, getTotalSize() + getHead(), t2, cancellableContinuationImpl2);
                enqueueLocked(emitter2);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArr2 = findSlotsToResumeLocked(continuationArr2);
                }
                continuationArr = continuationArr2;
                emitter = emitter2;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, emitter);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Unit unit2 = Unit.INSTANCE;
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m21constructorimpl(unit2));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        Object bufferAt;
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            bufferAt = SharedFlowKt.getBufferAt(objArr, emitter.index);
            if (bufferAt != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    final /* synthetic */ Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (tryPeekLocked(sharedFlowSlot) < 0) {
                sharedFlowSlot.cont = cancellableContinuationImpl2;
                sharedFlowSlot.cont = cancellableContinuationImpl2;
            } else {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m21constructorimpl(unit));
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            Unit unit = Unit.INSTANCE;
        }
    }
}