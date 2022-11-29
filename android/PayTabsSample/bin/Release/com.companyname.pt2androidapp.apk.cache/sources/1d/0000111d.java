package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[0], 0);
        EMPTY_LIST = booleanArrayList;
        booleanArrayList.makeImmutable();
    }

    public static BooleanArrayList emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanArrayList() {
        this(new boolean[10], 0);
    }

    private BooleanArrayList(boolean[] other, int size) {
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        ensureIsMutable();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.array;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof BooleanArrayList)) {
            return super.equals(o2);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) o2;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.array[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            i2 = (i2 * 31) + Internal.hashBoolean(this.array[i3]);
        }
        return i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity < this.size) {
            throw new IllegalArgumentException();
        }
        return new BooleanArrayList(Arrays.copyOf(this.array, capacity), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int index) {
        return Boolean.valueOf(getBoolean(index));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public boolean getBoolean(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (element instanceof Boolean) {
            boolean booleanValue = ((Boolean) element).booleanValue();
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[i2] == booleanValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public boolean setBoolean(int index, boolean element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z2 = zArr[index];
        zArr[index] = element;
        return z2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Boolean element) {
        addBoolean(index, element.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public void addBoolean(boolean element) {
        ensureIsMutable();
        int i2 = this.size;
        boolean[] zArr = this.array;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        zArr3[i3] = element;
    }

    private void addBoolean(int index, boolean element) {
        int i2;
        ensureIsMutable();
        if (index < 0 || index > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
        boolean[] zArr = this.array;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, index, zArr, index + 1, i2 - index);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, index);
            System.arraycopy(this.array, index, zArr2, index + 1, this.size - index);
            this.array = zArr2;
        }
        this.array[index] = element;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.array;
        if (i4 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i4;
        this.modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int index) {
        int i2;
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z2 = zArr[index];
        if (index < this.size - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (i2 - index) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }
}