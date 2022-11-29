package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArraySet";
    private static Object[] sBaseCache;
    private static int sBaseCacheSize;
    private static Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    Object[] mArray;
    private int[] mHashes;
    int mSize;
    private static final Object sBaseCacheLock = new Object();
    private static final Object sTwiceBaseCacheLock = new Object();

    private int binarySearch(int i2) {
        try {
            return ContainerHelpers.binarySearch(this.mHashes, this.mSize, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private int indexOf(Object obj, int i2) {
        int i3 = this.mSize;
        if (i3 == 0) {
            return -1;
        }
        int binarySearch = binarySearch(i2);
        if (binarySearch >= 0 && !obj.equals(this.mArray[binarySearch])) {
            int i4 = binarySearch + 1;
            while (i4 < i3 && this.mHashes[i4] == i2) {
                if (obj.equals(this.mArray[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = binarySearch - 1; i5 >= 0 && this.mHashes[i5] == i2; i5--) {
                if (obj.equals(this.mArray[i5])) {
                    return i5;
                }
            }
            return ~i4;
        }
        return binarySearch;
    }

    private int indexOfNull() {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = binarySearch(0);
        if (binarySearch >= 0 && this.mArray[binarySearch] != null) {
            int i3 = binarySearch + 1;
            while (i3 < i2 && this.mHashes[i3] == 0) {
                if (this.mArray[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = binarySearch - 1; i4 >= 0 && this.mHashes[i4] == 0; i4--) {
                if (this.mArray[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        }
        return binarySearch;
    }

    private void allocArrays(int i2) {
        if (i2 == 8) {
            synchronized (sTwiceBaseCacheLock) {
                Object[] objArr = sTwiceBaseCache;
                if (objArr != null) {
                    try {
                        this.mArray = objArr;
                        sTwiceBaseCache = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.mHashes = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            sTwiceBaseCacheSize--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    sTwiceBaseCache = null;
                    sTwiceBaseCacheSize = 0;
                }
            }
        } else if (i2 == 4) {
            synchronized (sBaseCacheLock) {
                Object[] objArr2 = sBaseCache;
                if (objArr2 != null) {
                    try {
                        this.mArray = objArr2;
                        sBaseCache = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.mHashes = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            sBaseCacheSize--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    sBaseCache = null;
                    sBaseCacheSize = 0;
                }
            }
        }
        this.mHashes = new int[i2];
        this.mArray = new Object[i2];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (sTwiceBaseCacheLock) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (sBaseCacheLock) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }

    public ArraySet() {
        this(0);
    }

    public ArraySet(int i2) {
        if (i2 == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i2);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((ArraySet) arraySet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    public ArraySet(E[] eArr) {
        this();
        if (eArr != null) {
            for (E e2 : eArr) {
                add(e2);
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.mSize;
        if (i2 != 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i2);
        }
        if (this.mSize != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int i2) {
        int i3 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i2) {
            Object[] objArr = this.mArray;
            allocArrays(i2);
            int i4 = this.mSize;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i4);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        if (this.mSize != i3) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int indexOf(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public E valueAt(int i2) {
        return (E) this.mArray[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int indexOf;
        int i3 = this.mSize;
        if (e2 == null) {
            indexOf = indexOfNull();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            indexOf = indexOf(e2, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i4 = ~indexOf;
        int[] iArr = this.mHashes;
        if (i3 >= iArr.length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.mArray;
            allocArrays(i5);
            if (i3 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, i3);
        }
        if (i4 < i3) {
            int[] iArr3 = this.mHashes;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.mSize;
        if (i3 == i8) {
            int[] iArr4 = this.mHashes;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.mArray[i4] = e2;
                this.mSize = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void addAll(ArraySet<? extends E> arraySet) {
        int i2 = arraySet.mSize;
        ensureCapacity(this.mSize + i2);
        if (this.mSize != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                add(arraySet.valueAt(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i2);
            System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i2);
            if (this.mSize != 0) {
                throw new ConcurrentModificationException();
            }
            this.mSize = i2;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public E removeAt(int i2) {
        int i3 = this.mSize;
        Object[] objArr = this.mArray;
        E e2 = (E) objArr[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                allocArrays(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                    System.arraycopy(objArr, 0, this.mArray, 0, i2);
                }
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    int i6 = i4 - i2;
                    System.arraycopy(iArr, i5, this.mHashes, i2, i6);
                    System.arraycopy(objArr, i5, this.mArray, i2, i6);
                }
            } else {
                if (i2 < i4) {
                    int i7 = i2 + 1;
                    int i8 = i4 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i7, objArr2, i2, i8);
                }
                this.mArray[i4] = null;
            }
            if (i3 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            this.mSize = i4;
        }
        return e2;
    }

    public boolean removeAll(ArraySet<? extends E> arraySet) {
        int i2 = arraySet.mSize;
        int i3 = this.mSize;
        for (int i4 = 0; i4 < i2; i4++) {
            remove(arraySet.valueAt(i4));
        }
        return i3 != this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.mSize;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.mArray, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mSize));
        }
        System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i2 = this.mSize;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.mSize; i2++) {
                try {
                    if (!set.contains(valueAt(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.mHashes;
        int i2 = this.mSize;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    /* loaded from: classes.dex */
    private class ElementIterator extends IndexBasedArrayIterator<E> {
        ElementIterator() {
            super(ArraySet.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i2) {
            return (E) ArraySet.this.valueAt(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i2) {
            ArraySet.this.removeAt(i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ensureCapacity(this.mSize + collection.size());
        boolean z2 = false;
        for (E e2 : collection) {
            z2 |= add(e2);
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.mSize - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.mArray[i2])) {
                removeAt(i2);
                z2 = true;
            }
        }
        return z2;
    }
}