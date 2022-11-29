package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public SortedList(Class<T> cls, Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(Class<T> cls, Callback<T> callback, int i2) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        this.mCallback = callback;
        this.mSize = 0;
    }

    public int size() {
        return this.mSize;
    }

    public int add(T t2) {
        throwIfInMutationOperation();
        return add(t2, true);
    }

    public void addAll(T[] tArr, boolean z2) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z2) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void addAll(T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    public void replaceAll(T[] tArr, boolean z2) {
        throwIfInMutationOperation();
        if (z2) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public void replaceAll(T... tArr) {
        replaceAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int sortAndDedup = sortAndDedup(tArr);
        if (this.mSize == 0) {
            this.mData = tArr;
            this.mSize = sortAndDedup;
            this.mCallback.onInserted(0, sortAndDedup);
            return;
        }
        merge(tArr, sortAndDedup);
    }

    private void replaceAllInternal(T[] tArr) {
        boolean z2 = !(this.mCallback instanceof BatchedCallback);
        if (z2) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, sortAndDedup));
        while (true) {
            int i2 = this.mNewDataStart;
            if (i2 >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i3 = this.mOldDataStart;
            int i4 = this.mOldDataSize;
            if (i3 >= i4) {
                int i5 = sortAndDedup - i2;
                System.arraycopy(tArr, i2, this.mData, i2, i5);
                this.mNewDataStart += i5;
                this.mSize += i5;
                this.mCallback.onInserted(i2, i5);
                break;
            } else if (i2 >= sortAndDedup) {
                int i6 = i4 - i3;
                this.mSize -= i6;
                this.mCallback.onRemoved(i2, i6);
                break;
            } else {
                T t2 = this.mOldData[i3];
                T t3 = tArr[i2];
                int compare = this.mCallback.compare(t2, t3);
                if (compare < 0) {
                    replaceAllRemove();
                } else if (compare > 0) {
                    replaceAllInsert(t3);
                } else if (!this.mCallback.areItemsTheSame(t2, t3)) {
                    replaceAllRemove();
                    replaceAllInsert(t3);
                } else {
                    T[] tArr2 = this.mData;
                    int i7 = this.mNewDataStart;
                    tArr2[i7] = t3;
                    this.mOldDataStart++;
                    this.mNewDataStart = i7 + 1;
                    if (!this.mCallback.areContentsTheSame(t2, t3)) {
                        Callback callback = this.mCallback;
                        callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t2, t3));
                    }
                }
            }
        }
        this.mOldData = null;
        if (z2) {
            endBatchedUpdates();
        }
    }

    private void replaceAllInsert(T t2) {
        T[] tArr = this.mData;
        int i2 = this.mNewDataStart;
        tArr[i2] = t2;
        int i3 = i2 + 1;
        this.mNewDataStart = i3;
        this.mSize++;
        this.mCallback.onInserted(i3 - 1, 1);
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 1; i4 < tArr.length; i4++) {
            T t2 = tArr[i4];
            if (this.mCallback.compare(tArr[i2], t2) == 0) {
                int findSameItem = findSameItem(t2, tArr, i2, i3);
                if (findSameItem != -1) {
                    tArr[findSameItem] = t2;
                } else {
                    if (i3 != i4) {
                        tArr[i3] = t2;
                    }
                    i3++;
                }
            } else {
                if (i3 != i4) {
                    tArr[i3] = t2;
                }
                i2 = i3;
                i3++;
            }
        }
        return i3;
    }

    private int findSameItem(T t2, T[] tArr, int i2, int i3) {
        while (i2 < i3) {
            if (this.mCallback.areItemsTheSame(tArr[i2], t2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private void merge(T[] tArr, int i2) {
        boolean z2 = !(this.mCallback instanceof BatchedCallback);
        if (z2) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i3 = 0;
        this.mOldDataStart = 0;
        int i4 = this.mSize;
        this.mOldDataSize = i4;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i4 + i2 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i5 = this.mOldDataStart;
            int i6 = this.mOldDataSize;
            if (i5 >= i6 && i3 >= i2) {
                break;
            } else if (i5 == i6) {
                int i7 = i2 - i3;
                System.arraycopy(tArr, i3, this.mData, this.mNewDataStart, i7);
                int i8 = this.mNewDataStart + i7;
                this.mNewDataStart = i8;
                this.mSize += i7;
                this.mCallback.onInserted(i8 - i7, i7);
                break;
            } else if (i3 == i2) {
                int i9 = i6 - i5;
                System.arraycopy(this.mOldData, i5, this.mData, this.mNewDataStart, i9);
                this.mNewDataStart += i9;
                break;
            } else {
                T t2 = this.mOldData[i5];
                T t3 = tArr[i3];
                int compare = this.mCallback.compare(t2, t3);
                if (compare > 0) {
                    T[] tArr2 = this.mData;
                    int i10 = this.mNewDataStart;
                    int i11 = i10 + 1;
                    this.mNewDataStart = i11;
                    tArr2[i10] = t3;
                    this.mSize++;
                    i3++;
                    this.mCallback.onInserted(i11 - 1, 1);
                } else if (compare == 0 && this.mCallback.areItemsTheSame(t2, t3)) {
                    T[] tArr3 = this.mData;
                    int i12 = this.mNewDataStart;
                    this.mNewDataStart = i12 + 1;
                    tArr3[i12] = t3;
                    i3++;
                    this.mOldDataStart++;
                    if (!this.mCallback.areContentsTheSame(t2, t3)) {
                        Callback callback = this.mCallback;
                        callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t2, t3));
                    }
                } else {
                    T[] tArr4 = this.mData;
                    int i13 = this.mNewDataStart;
                    this.mNewDataStart = i13 + 1;
                    tArr4[i13] = t2;
                    this.mOldDataStart++;
                }
            }
        }
        this.mOldData = null;
        if (z2) {
            endBatchedUpdates();
        }
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    private int add(T t2, boolean z2) {
        int findIndexOf = findIndexOf(t2, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t3 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t3, t2)) {
                if (this.mCallback.areContentsTheSame(t3, t2)) {
                    this.mData[findIndexOf] = t2;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t2;
                Callback callback = this.mCallback;
                callback.onChanged(findIndexOf, 1, callback.getChangePayload(t3, t2));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t2);
        if (z2) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    public boolean remove(T t2) {
        throwIfInMutationOperation();
        return remove(t2, true);
    }

    public T removeItemAt(int i2) {
        throwIfInMutationOperation();
        T t2 = get(i2);
        removeItemAtIndex(i2, true);
        return t2;
    }

    private boolean remove(T t2, boolean z2) {
        int findIndexOf = findIndexOf(t2, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z2);
        return true;
    }

    private void removeItemAtIndex(int i2, boolean z2) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i2 + 1, tArr, i2, (this.mSize - i2) - 1);
        int i3 = this.mSize - 1;
        this.mSize = i3;
        this.mData[i3] = null;
        if (z2) {
            this.mCallback.onRemoved(i2, 1);
        }
    }

    public void updateItemAt(int i2, T t2) {
        throwIfInMutationOperation();
        T t3 = get(i2);
        boolean z2 = t3 == t2 || !this.mCallback.areContentsTheSame(t3, t2);
        if (t3 != t2 && this.mCallback.compare(t3, t2) == 0) {
            this.mData[i2] = t2;
            if (z2) {
                Callback callback = this.mCallback;
                callback.onChanged(i2, 1, callback.getChangePayload(t3, t2));
                return;
            }
            return;
        }
        if (z2) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i2, 1, callback2.getChangePayload(t3, t2));
        }
        removeItemAtIndex(i2, false);
        int add = add(t2, false);
        if (i2 != add) {
            this.mCallback.onMoved(i2, add);
        }
    }

    public void recalculatePositionOfItemAt(int i2) {
        throwIfInMutationOperation();
        T t2 = get(i2);
        removeItemAtIndex(i2, false);
        int add = add(t2, false);
        if (i2 != add) {
            this.mCallback.onMoved(i2, add);
        }
    }

    public T get(int i2) throws IndexOutOfBoundsException {
        int i3;
        if (i2 >= this.mSize || i2 < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i2 + " but size is " + this.mSize);
        }
        T[] tArr = this.mOldData;
        if (tArr != null && i2 >= (i3 = this.mNewDataStart)) {
            return tArr[(i2 - i3) + this.mOldDataStart];
        }
        return this.mData[i2];
    }

    public int indexOf(T t2) {
        if (this.mOldData != null) {
            int findIndexOf = findIndexOf(t2, this.mData, 0, this.mNewDataStart, 4);
            if (findIndexOf != -1) {
                return findIndexOf;
            }
            int findIndexOf2 = findIndexOf(t2, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
            if (findIndexOf2 != -1) {
                return (findIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
            }
            return -1;
        }
        return findIndexOf(t2, this.mData, 0, this.mSize, 4);
    }

    private int findIndexOf(T t2, T[] tArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int i5 = (i2 + i3) / 2;
            T t3 = tArr[i5];
            int compare = this.mCallback.compare(t3, t2);
            if (compare < 0) {
                i2 = i5 + 1;
            } else if (compare == 0) {
                if (this.mCallback.areItemsTheSame(t3, t2)) {
                    return i5;
                }
                int linearEqualitySearch = linearEqualitySearch(t2, i5, i2, i3);
                return (i4 == 1 && linearEqualitySearch == -1) ? i5 : linearEqualitySearch;
            } else {
                i3 = i5;
            }
        }
        if (i4 == 1) {
            return i2;
        }
        return -1;
    }

    private int linearEqualitySearch(T t2, int i2, int i3, int i4) {
        T t3;
        for (int i5 = i2 - 1; i5 >= i3; i5--) {
            T t4 = this.mData[i5];
            if (this.mCallback.compare(t4, t2) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(t4, t2)) {
                return i5;
            }
        }
        do {
            i2++;
            if (i2 >= i4) {
                return -1;
            }
            t3 = this.mData[i2];
            if (this.mCallback.compare(t3, t2) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t3, t2));
        return i2;
    }

    private void addToData(int i2, T t2) {
        int i3 = this.mSize;
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("cannot add item to " + i2 + " because size is " + this.mSize);
        }
        T[] tArr = this.mData;
        if (i3 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i2);
            tArr2[i2] = t2;
            System.arraycopy(this.mData, i2, tArr2, i2 + 1, this.mSize - i2);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i3 - i2);
            this.mData[i2] = t2;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i2 = this.mSize;
        if (i2 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i2, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i2);
    }

    /* loaded from: classes.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i2, int i3);

        public void onChanged(int i2, int i3, Object obj) {
            onChanged(i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.mWrappedCallback.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i2, int i3) {
            this.mBatchingListUpdateCallback.onInserted(i2, i3);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i2, int i3) {
            this.mBatchingListUpdateCallback.onRemoved(i2, i3);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i2, int i3) {
            this.mBatchingListUpdateCallback.onMoved(i2, i3);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i2, int i3) {
            this.mBatchingListUpdateCallback.onChanged(i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i2, int i3, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i2, i3, obj);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areContentsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areItemsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.mWrappedCallback.getChangePayload(t2, t22);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }
    }
}