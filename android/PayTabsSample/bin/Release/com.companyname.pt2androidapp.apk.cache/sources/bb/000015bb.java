package kotlinx.coroutines.sync;

import com.payment.paymentsdk.PaymentSdkParams;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;

/* compiled from: Mutex.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00018V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00018@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR$\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class MutexImpl implements Mutex, SelectClause2<Object, Mutex> {
    static final /* synthetic */ AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    public MutexImpl(boolean z2) {
        this._state = z2 ? MutexKt.EMPTY_LOCKED : MutexKt.EMPTY_UNLOCKED;
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
        Object obj = this._state;
        return (obj instanceof LockedQueue) && ((LockedQueue) obj).isEmpty();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        Object lockSuspend;
        return (!tryLock(obj) && (lockSuspend = lockSuspend(obj, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? lockSuspend : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(SelectInstance<? super R> selectInstance, Object obj, Function2<? super Mutex, ? super Continuation<? super R>, ? extends Object> function2) {
        Symbol symbol;
        Symbol symbol2;
        while (!selectInstance.isSelected()) {
            final Object obj2 = this._state;
            if (obj2 instanceof Empty) {
                Empty empty = (Empty) obj2;
                Object obj3 = empty.locked;
                symbol = MutexKt.UNLOCKED;
                if (obj3 != symbol) {
                    _state$FU.compareAndSet(this, obj2, new LockedQueue(empty.locked));
                } else {
                    Object performAtomicTrySelect = selectInstance.performAtomicTrySelect(new TryLockDesc(this, obj));
                    if (performAtomicTrySelect == null) {
                        UndispatchedKt.startCoroutineUnintercepted(function2, this, selectInstance.getCompletion());
                        return;
                    } else if (performAtomicTrySelect == SelectKt.getALREADY_SELECTED()) {
                        return;
                    } else {
                        symbol2 = MutexKt.LOCK_FAIL;
                        if (performAtomicTrySelect != symbol2 && performAtomicTrySelect != AtomicKt.RETRY_ATOMIC) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + performAtomicTrySelect).toString());
                        }
                    }
                }
            } else if (obj2 instanceof LockedQueue) {
                LockedQueue lockedQueue = (LockedQueue) obj2;
                boolean z2 = false;
                if (!(lockedQueue.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                LockSelect lockSelect = new LockSelect(obj, selectInstance, function2);
                LockedQueue lockedQueue2 = lockedQueue;
                final LockSelect lockSelect2 = lockSelect;
                LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(lockSelect2) { // from class: kotlinx.coroutines.sync.MutexImpl$registerSelectClause2$$inlined$addLastIf$1
                    @Override // kotlinx.coroutines.internal.AtomicOp
                    public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
                        if (this._state == obj2) {
                            return null;
                        }
                        return LockFreeLinkedListKt.getCONDITION_FALSE();
                    }
                };
                while (true) {
                    int tryCondAddNext = lockedQueue2.getPrevNode().tryCondAddNext(lockSelect2, lockedQueue2, condAddOp);
                    if (tryCondAddNext == 1) {
                        z2 = true;
                        break;
                    } else if (tryCondAddNext == 2) {
                        break;
                    }
                }
                if (z2) {
                    selectInstance.disposeOnSelect(lockSelect);
                    return;
                }
            } else if (!(obj2 instanceof OpDescriptor)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((OpDescriptor) obj2).perform(this);
            }
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    private static final class TryLockDesc extends AtomicDesc {
        public final MutexImpl mutex;
        public final Object owner;

        public TryLockDesc(MutexImpl mutexImpl, Object obj) {
            this.mutex = mutexImpl;
            this.owner = obj;
        }

        /* compiled from: Mutex.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
        /* loaded from: classes.dex */
        private final class PrepareOp extends OpDescriptor {
            private final AtomicOp<?> atomicOp;

            public PrepareOp(AtomicOp<?> atomicOp) {
                this.atomicOp = atomicOp;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public AtomicOp<?> getAtomicOp() {
                return this.atomicOp;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public Object perform(Object obj) {
                Object atomicOp = getAtomicOp().isDecided() ? MutexKt.EMPTY_UNLOCKED : getAtomicOp();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                MutexImpl._state$FU.compareAndSet((MutexImpl) obj, this, atomicOp);
                return null;
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public Object prepare(AtomicOp<?> atomicOp) {
            Empty empty;
            Symbol symbol;
            PrepareOp prepareOp = new PrepareOp(atomicOp);
            MutexImpl mutexImpl = this.mutex;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl._state$FU;
            empty = MutexKt.EMPTY_UNLOCKED;
            if (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl, empty, prepareOp)) {
                symbol = MutexKt.LOCK_FAIL;
                return symbol;
            }
            return prepareOp.perform(this.mutex);
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(AtomicOp<?> atomicOp, Object obj) {
            Empty empty;
            if (obj != null) {
                empty = MutexKt.EMPTY_UNLOCKED;
            } else {
                Object obj2 = this.owner;
                empty = obj2 == null ? MutexKt.EMPTY_LOCKED : new Empty(obj2);
            }
            MutexImpl._state$FU.compareAndSet(this.mutex, atomicOp, empty);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof Empty) {
            if (((Empty) obj2).locked == obj) {
                return true;
            }
        } else if ((obj2 instanceof LockedQueue) && ((LockedQueue) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class LockedQueue extends LockFreeLinkedListHead {
        public Object owner;

        public LockedQueue(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&J\u0006\u0010\t\u001a\u00020\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H&R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "completeResumeLockWaiter", "", PaymentSdkParams.TOKEN, "dispose", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public abstract class LockWaiter extends LockFreeLinkedListNode implements DisposableHandle {
        public final Object owner;

        public abstract void completeResumeLockWaiter(Object obj);

        public abstract Object tryResumeLockWaiter();

        public LockWaiter(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", PaymentSdkParams.TOKEN, "toString", "", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final class LockCont extends LockWaiter {
        public final CancellableContinuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public LockCont(Object obj, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(obj);
            this.cont = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public Object tryResumeLockWaiter() {
            return this.cont.tryResume(Unit.INSTANCE, null, new MutexImpl$LockCont$tryResumeLockWaiter$1(this));
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "LockCont[" + this.owner + ", " + this.cont + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BD\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R1\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", PaymentSdkParams.TOKEN, "toString", "", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final class LockSelect<R> extends LockWaiter {
        public final Function2<Mutex, Continuation<? super R>, Object> block;
        public final SelectInstance<R> select;

        /* JADX WARN: Multi-variable type inference failed */
        public LockSelect(Object obj, SelectInstance<? super R> selectInstance, Function2<? super Mutex, ? super Continuation<? super R>, ? extends Object> function2) {
            super(obj);
            this.select = selectInstance;
            this.block = function2;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public Object tryResumeLockWaiter() {
            Symbol symbol;
            if (this.select.trySelect()) {
                symbol = MutexKt.SELECT_SUCCESS;
                return symbol;
            }
            return null;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter(Object obj) {
            Symbol symbol;
            if (DebugKt.getASSERTIONS_ENABLED()) {
                symbol = MutexKt.SELECT_SUCCESS;
                if (!(obj == symbol)) {
                    throw new AssertionError();
                }
            }
            CancellableKt.startCoroutineCancellable(this.block, MutexImpl.this, this.select.getCompletion(), new MutexImpl$LockSelect$completeResumeLockWaiter$2(this));
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "LockSelect[" + this.owner + ", " + this.select + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "complete", "", "affected", "failure", "", "prepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UnlockOp extends AtomicOp<MutexImpl> {
        public final LockedQueue queue;

        public UnlockOp(LockedQueue lockedQueue) {
            this.queue = lockedQueue;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public Object prepare(MutexImpl mutexImpl) {
            Symbol symbol;
            if (this.queue.isEmpty()) {
                return null;
            }
            symbol = MutexKt.UNLOCK_FAIL;
            return symbol;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(MutexImpl mutexImpl, Object obj) {
            MutexImpl._state$FU.compareAndSet(mutexImpl, this, obj == null ? MutexKt.EMPTY_UNLOCKED : this.queue);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        Symbol symbol;
        while (true) {
            Object obj = this._state;
            if (obj instanceof Empty) {
                Object obj2 = ((Empty) obj).locked;
                symbol = MutexKt.UNLOCKED;
                return obj2 != symbol;
            } else if (obj instanceof LockedQueue) {
                return true;
            } else {
                if (!(obj instanceof OpDescriptor)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((OpDescriptor) obj).perform(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        Symbol symbol;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof Empty) {
                Object obj3 = ((Empty) obj2).locked;
                symbol = MutexKt.UNLOCKED;
                if (obj3 != symbol) {
                    return false;
                }
                if (_state$FU.compareAndSet(this, obj2, obj == null ? MutexKt.EMPTY_LOCKED : new Empty(obj))) {
                    return true;
                }
            } else if (obj2 instanceof LockedQueue) {
                if (((LockedQueue) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof OpDescriptor)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((OpDescriptor) obj2).perform(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        r0 = r10.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object lockSuspend(final java.lang.Object r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.lockSuspend(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        Empty empty;
        Symbol symbol;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof Empty) {
                if (obj == null) {
                    Object obj3 = ((Empty) obj2).locked;
                    symbol = MutexKt.UNLOCKED;
                    if (!(obj3 != symbol)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    Empty empty2 = (Empty) obj2;
                    if (!(empty2.locked == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + empty2.locked + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
                empty = MutexKt.EMPTY_UNLOCKED;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, empty)) {
                    return;
                }
            } else if (obj2 instanceof OpDescriptor) {
                ((OpDescriptor) obj2).perform(this);
            } else if (obj2 instanceof LockedQueue) {
                if (obj != null) {
                    LockedQueue lockedQueue = (LockedQueue) obj2;
                    if (!(lockedQueue.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + lockedQueue.owner + " but expected " + obj).toString());
                    }
                }
                LockedQueue lockedQueue2 = (LockedQueue) obj2;
                LockFreeLinkedListNode removeFirstOrNull = lockedQueue2.removeFirstOrNull();
                if (removeFirstOrNull == null) {
                    UnlockOp unlockOp = new UnlockOp(lockedQueue2);
                    if (_state$FU.compareAndSet(this, obj2, unlockOp) && unlockOp.perform(this) == null) {
                        return;
                    }
                } else {
                    LockWaiter lockWaiter = (LockWaiter) removeFirstOrNull;
                    Object tryResumeLockWaiter = lockWaiter.tryResumeLockWaiter();
                    if (tryResumeLockWaiter != null) {
                        Object obj4 = lockWaiter.owner;
                        if (obj4 == null) {
                            obj4 = MutexKt.LOCKED;
                        }
                        lockedQueue2.owner = obj4;
                        lockWaiter.completeResumeLockWaiter(tryResumeLockWaiter);
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof Empty) {
                return "Mutex[" + ((Empty) obj).locked + ']';
            } else if (!(obj instanceof OpDescriptor)) {
                if (!(obj instanceof LockedQueue)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((LockedQueue) obj).owner + ']';
            } else {
                ((OpDescriptor) obj).perform(this);
            }
        }
    }
}