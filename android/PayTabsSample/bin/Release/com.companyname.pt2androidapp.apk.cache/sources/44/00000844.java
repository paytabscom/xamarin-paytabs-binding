package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList<UpdateOp> mPendingUpdates;
    final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i2);

        void markViewHoldersUpdated(int i2, int i3, Object obj);

        void offsetPositionsForAdd(int i2, int i3);

        void offsetPositionsForMove(int i2, int i3);

        void offsetPositionsForRemovingInvisible(int i2, int i3);

        void offsetPositionsForRemovingLaidOutOrNewView(int i2, int i3);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdapterHelper(Callback callback) {
        this(callback, false);
    }

    AdapterHelper(Callback callback, boolean z2) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z2;
        this.mOpReorderer = new OpReorderer(this);
    }

    AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i2);
            int i3 = updateOp.cmd;
            if (i3 == 1) {
                applyAdd(updateOp);
            } else if (i3 == 2) {
                applyRemove(updateOp);
            } else if (i3 == 4) {
                applyUpdate(updateOp);
            } else if (i3 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i2));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        boolean z2;
        char c2;
        int i2 = updateOp.positionStart;
        int i3 = updateOp.positionStart + updateOp.itemCount;
        int i4 = updateOp.positionStart;
        char c3 = 65535;
        int i5 = 0;
        while (i4 < i3) {
            if (this.mCallback.findViewHolder(i4) != null || canFindInPreLayout(i4)) {
                if (c3 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 0;
            }
            if (z2) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i2, i5, null);
        }
        if (c3 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i2 = updateOp.positionStart;
        int i3 = updateOp.positionStart + updateOp.itemCount;
        char c2 = 65535;
        int i4 = 0;
        for (int i5 = updateOp.positionStart; i5 < i3; i5++) {
            if (this.mCallback.findViewHolder(i5) != null || canFindInPreLayout(i5)) {
                if (c2 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i2, i4, updateOp.payload));
                    i2 = i5;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i2, i4, updateOp.payload));
                    i2 = i5;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
        }
        if (i4 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i2, i4, obj);
        }
        if (c2 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i2;
        if (updateOp.cmd == 1 || updateOp.cmd == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int updatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, updateOp.cmd);
        int i3 = updateOp.positionStart;
        int i4 = updateOp.cmd;
        if (i4 == 2) {
            i2 = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + updateOp);
        } else {
            i2 = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < updateOp.itemCount; i6++) {
            int updatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i2 * i6), updateOp.cmd);
            int i7 = updateOp.cmd;
            if (i7 == 2 ? updatePositionWithPostponed2 == updatePositionWithPostponed : i7 == 4 && updatePositionWithPostponed2 == updatePositionWithPostponed + 1) {
                i5++;
            } else {
                UpdateOp obtainUpdateOp = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i5, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, i3);
                recycleUpdateOp(obtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i3 += i5;
                }
                updatePositionWithPostponed = updatePositionWithPostponed2;
                i5 = 1;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i5 > 0) {
            UpdateOp obtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i5, obj);
            dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, i3);
            recycleUpdateOp(obtainUpdateOp2);
        }
    }

    void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i2) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i3 = updateOp.cmd;
        if (i3 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i2, updateOp.itemCount);
        } else if (i3 == 4) {
            this.mCallback.markViewHoldersUpdated(i2, updateOp.itemCount, updateOp.payload);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int updatePositionWithPostponed(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            if (updateOp.cmd == 8) {
                if (updateOp.positionStart < updateOp.itemCount) {
                    i4 = updateOp.positionStart;
                    i5 = updateOp.itemCount;
                } else {
                    i4 = updateOp.itemCount;
                    i5 = updateOp.positionStart;
                }
                if (i2 >= i4 && i2 <= i5) {
                    if (i4 == updateOp.positionStart) {
                        if (i3 == 1) {
                            updateOp.itemCount++;
                        } else if (i3 == 2) {
                            updateOp.itemCount--;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            updateOp.positionStart++;
                        } else if (i3 == 2) {
                            updateOp.positionStart--;
                        }
                        i2--;
                    }
                } else if (i2 < updateOp.positionStart) {
                    if (i3 == 1) {
                        updateOp.positionStart++;
                        updateOp.itemCount++;
                    } else if (i3 == 2) {
                        updateOp.positionStart--;
                        updateOp.itemCount--;
                    }
                }
            } else if (updateOp.positionStart <= i2) {
                if (updateOp.cmd == 1) {
                    i2 -= updateOp.itemCount;
                } else if (updateOp.cmd == 2) {
                    i2 += updateOp.itemCount;
                }
            } else if (i3 == 1) {
                updateOp.positionStart++;
            } else if (i3 == 2) {
                updateOp.positionStart--;
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                if (updateOp2.itemCount == updateOp2.positionStart || updateOp2.itemCount < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i2;
    }

    private boolean canFindInPreLayout(int i2) {
        int size = this.mPostponedList.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = this.mPostponedList.get(i3);
            if (updateOp.cmd == 8) {
                if (findPositionOffset(updateOp.itemCount, i3 + 1) == i2) {
                    return true;
                }
            } else if (updateOp.cmd == 1) {
                int i4 = updateOp.positionStart + updateOp.itemCount;
                for (int i5 = updateOp.positionStart; i5 < i4; i5++) {
                    if (findPositionOffset(i5, i3 + 1) == i2) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i2 = updateOp.cmd;
        if (i2 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
        } else if (i2 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
        } else if (i2 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else if (i2 == 8) {
            this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasAnyUpdateTypes(int i2) {
        return (i2 & this.mExistingUpdateTypes) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int findPositionOffset(int i2) {
        return findPositionOffset(i2, 0);
    }

    int findPositionOffset(int i2, int i3) {
        int size = this.mPostponedList.size();
        while (i3 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i3);
            if (updateOp.cmd == 8) {
                if (updateOp.positionStart == i2) {
                    i2 = updateOp.itemCount;
                } else {
                    if (updateOp.positionStart < i2) {
                        i2--;
                    }
                    if (updateOp.itemCount <= i2) {
                        i2++;
                    }
                }
            } else if (updateOp.positionStart > i2) {
                continue;
            } else if (updateOp.cmd == 2) {
                if (i2 < updateOp.positionStart + updateOp.itemCount) {
                    return -1;
                }
                i2 -= updateOp.itemCount;
            } else if (updateOp.cmd == 1) {
                i2 += updateOp.itemCount;
            }
            i3++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onItemRangeChanged(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i2, i3, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onItemRangeInserted(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i2, i3, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onItemRangeRemoved(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i2, i3, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onItemRangeMoved(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i2, i3, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i2);
            int i3 = updateOp.cmd;
            if (i3 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i3 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i3 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i3 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public int applyPendingUpdatesToPosition(int i2) {
        int size = this.mPendingUpdates.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i3);
            int i4 = updateOp.cmd;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        if (updateOp.positionStart == i2) {
                            i2 = updateOp.itemCount;
                        } else {
                            if (updateOp.positionStart < i2) {
                                i2--;
                            }
                            if (updateOp.itemCount <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (updateOp.positionStart > i2) {
                    continue;
                } else if (updateOp.positionStart + updateOp.itemCount > i2) {
                    return -1;
                } else {
                    i2 -= updateOp.itemCount;
                }
            } else if (updateOp.positionStart <= i2) {
                i2 += updateOp.itemCount;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        UpdateOp(int i2, int i3, int i4, Object obj) {
            this.cmd = i2;
            this.positionStart = i3;
            this.itemCount = i4;
            this.payload = obj;
        }

        String cmdToString() {
            int i2 = this.cmd;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UpdateOp) {
                UpdateOp updateOp = (UpdateOp) obj;
                int i2 = this.cmd;
                if (i2 != updateOp.cmd) {
                    return false;
                }
                if (i2 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                    return true;
                }
                if (this.itemCount == updateOp.itemCount && this.positionStart == updateOp.positionStart) {
                    Object obj2 = this.payload;
                    if (obj2 != null) {
                        if (!obj2.equals(updateOp.payload)) {
                            return false;
                        }
                    } else if (updateOp.payload != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i2, int i3, int i4, Object obj) {
        UpdateOp acquire = this.mUpdateOpPool.acquire();
        if (acquire == null) {
            return new UpdateOp(i2, i3, i4, obj);
        }
        acquire.cmd = i2;
        acquire.positionStart = i3;
        acquire.itemCount = i4;
        acquire.payload = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.release(updateOp);
    }

    void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            recycleUpdateOp(list.get(i2));
        }
        list.clear();
    }
}