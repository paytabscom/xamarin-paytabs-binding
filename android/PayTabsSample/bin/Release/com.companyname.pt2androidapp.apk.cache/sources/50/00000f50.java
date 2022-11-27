package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ArrayDeque.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private static final int maxArraySize = 2147483639;
    private Object[] elementData;
    private int head;
    private int size;
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public ArrayDeque(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = emptyElementData;
        } else if (i2 > 0) {
            objArr = new Object[i2];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i2);
        }
        this.elementData = objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void ensureCapacity(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i2, 10)];
        } else {
            copyElements(Companion.newCapacity$kotlin_stdlib(objArr.length, i2));
        }
    }

    private final void copyElements(int i2) {
        Object[] objArr = new Object[i2];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i3 = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i3, 0, i3);
        this.head = 0;
        this.elementData = objArr;
    }

    private final E internalGet(int i2) {
        return (E) this.elementData[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int positiveMod(int i2) {
        Object[] objArr = this.elementData;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int negativeMod(int i2) {
        return i2 < 0 ? i2 + this.elementData.length : i2;
    }

    private final int internalIndex(int i2) {
        return positiveMod(this.head + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int incremented(int i2) {
        if (i2 == ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i2 + 1;
    }

    private final int decremented(int i2) {
        return i2 == 0 ? ArraysKt.getLastIndex(this.elementData) : i2 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E e2) {
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = e2;
        this.size = size() + 1;
    }

    public final void addLast(E e2) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = e2;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        E e2 = (E) this.elementData[this.head];
        Object[] objArr = this.elementData;
        int i2 = this.head;
        objArr[i2] = null;
        this.head = incremented(i2);
        this.size = size() - 1;
        return e2;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int positiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        E e2 = (E) this.elementData[positiveMod];
        this.elementData[positiveMod] = null;
        this.size = size() - 1;
        return e2;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, size());
        if (i2 == size()) {
            addLast(e2);
        } else if (i2 == 0) {
            addFirst(e2);
        } else {
            ensureCapacity(size() + 1);
            int positiveMod = positiveMod(this.head + i2);
            if (i2 < ((size() + 1) >> 1)) {
                int decremented = decremented(positiveMod);
                int decremented2 = decremented(this.head);
                int i3 = this.head;
                if (decremented >= i3) {
                    Object[] objArr = this.elementData;
                    objArr[decremented2] = objArr[i3];
                    ArraysKt.copyInto(objArr, objArr, i3, i3 + 1, decremented + 1);
                } else {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                    Object[] objArr3 = this.elementData;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
                }
                this.elementData[decremented] = e2;
                this.head = decremented2;
            } else {
                int positiveMod2 = positiveMod(this.head + size());
                if (positiveMod < positiveMod2) {
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, positiveMod + 1, positiveMod, positiveMod2);
                } else {
                    Object[] objArr5 = this.elementData;
                    ArraysKt.copyInto(objArr5, objArr5, 1, 0, positiveMod2);
                    Object[] objArr6 = this.elementData;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt.copyInto(objArr6, objArr6, positiveMod + 1, positiveMod, objArr6.length - 1);
                }
                this.elementData[positiveMod] = e2;
            }
            this.size = size() + 1;
        }
    }

    private final void copyCollectionElements(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i2 < length && it.hasNext()) {
            this.elementData[i2] = it.next();
            i2++;
        }
        int i3 = this.head;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.elementData[i4] = it.next();
        }
        this.size = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int positiveMod = positiveMod(this.head + size());
        int positiveMod2 = positiveMod(this.head + i2);
        int size = elements.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.head;
            int i4 = i3 - size;
            if (positiveMod2 < i3) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i4, i3, objArr.length);
                if (size >= positiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, positiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, positiveMod2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, i4, i3, positiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                i4 += objArr6.length;
                int i5 = positiveMod2 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    ArraysKt.copyInto(objArr6, objArr6, i4, i3, positiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i4;
            copyCollectionElements(negativeMod(positiveMod2 - size), elements);
        } else {
            int i6 = positiveMod2 + size;
            if (positiveMod2 < positiveMod) {
                int i7 = size + positiveMod;
                Object[] objArr8 = this.elementData;
                if (i7 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i6, positiveMod2, positiveMod);
                } else if (i6 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i6 - objArr8.length, positiveMod2, positiveMod);
                } else {
                    int length2 = positiveMod - (i7 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length2, positiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i6, positiveMod2, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, positiveMod);
                Object[] objArr11 = this.elementData;
                if (i6 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i6 - objArr11.length, positiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i6, positiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(positiveMod2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        return (E) this.elementData[positiveMod(this.head + i2)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        int positiveMod = positiveMod(this.head + i2);
        E e3 = (E) this.elementData[positiveMod];
        this.elementData[positiveMod] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i2;
        int positiveMod = positiveMod(this.head + size());
        int i3 = this.head;
        if (i3 < positiveMod) {
            while (i3 < positiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                    i2 = this.head;
                } else {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < positiveMod) {
            return -1;
        } else {
            int length = this.elementData.length;
            while (true) {
                if (i3 >= length) {
                    for (int i4 = 0; i4 < positiveMod; i4++) {
                        if (Intrinsics.areEqual(obj, this.elementData[i4])) {
                            i3 = i4 + this.elementData.length;
                            i2 = this.head;
                        }
                    }
                    return -1;
                } else if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                    i2 = this.head;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i2;
        int positiveMod = positiveMod(this.head + size());
        int i3 = this.head;
        if (i3 < positiveMod) {
            lastIndex = positiveMod - 1;
            if (lastIndex < i3) {
                return -1;
            }
            while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                if (lastIndex == i3) {
                    return -1;
                }
                lastIndex--;
            }
            i2 = this.head;
        } else if (i3 <= positiveMod) {
            return -1;
        } else {
            int i4 = positiveMod - 1;
            while (true) {
                if (i4 >= 0) {
                    if (Intrinsics.areEqual(obj, this.elementData[i4])) {
                        lastIndex = i4 + this.elementData.length;
                        i2 = this.head;
                        break;
                    }
                    i4--;
                } else {
                    lastIndex = ArraysKt.getLastIndex(this.elementData);
                    int i5 = this.head;
                    if (lastIndex < i5) {
                        return -1;
                    }
                    while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                        if (lastIndex == i5) {
                            return -1;
                        }
                        lastIndex--;
                    }
                    i2 = this.head;
                }
            }
        }
        return lastIndex - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        if (i2 == CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i2 != 0) {
            int positiveMod = positiveMod(this.head + i2);
            E e2 = (E) this.elementData[positiveMod];
            if (i2 < (size() >> 1)) {
                int i3 = this.head;
                if (positiveMod >= i3) {
                    Object[] objArr = this.elementData;
                    ArraysKt.copyInto(objArr, objArr, i3 + 1, i3, positiveMod);
                } else {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, 1, 0, positiveMod);
                    Object[] objArr3 = this.elementData;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i4 = this.head;
                    ArraysKt.copyInto(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
                }
                Object[] objArr4 = this.elementData;
                int i5 = this.head;
                objArr4[i5] = null;
                this.head = incremented(i5);
            } else {
                int positiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(this));
                if (positiveMod <= positiveMod2) {
                    Object[] objArr5 = this.elementData;
                    ArraysKt.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
                } else {
                    Object[] objArr6 = this.elementData;
                    ArraysKt.copyInto(objArr6, objArr6, positiveMod, positiveMod + 1, objArr6.length);
                    Object[] objArr7 = this.elementData;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    ArraysKt.copyInto(objArr7, objArr7, 0, 1, positiveMod2 + 1);
                }
                this.elementData[positiveMod2] = null;
            }
            this.size = size() - 1;
            return e2;
        }
        return removeFirst();
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod = positiveMod(this.head + size());
                int i2 = this.head;
                if (this.head < positiveMod) {
                    for (int i3 = this.head; i3 < positiveMod; i3++) {
                        Object obj = this.elementData[i3];
                        if (function1.invoke(obj).booleanValue()) {
                            this.elementData[i2] = obj;
                            i2++;
                        } else {
                            z2 = true;
                        }
                    }
                    ArraysKt.fill(this.elementData, (Object) null, i2, positiveMod);
                } else {
                    int length = this.elementData.length;
                    boolean z3 = false;
                    for (int i4 = this.head; i4 < length; i4++) {
                        Object obj2 = this.elementData[i4];
                        this.elementData[i4] = null;
                        if (function1.invoke(obj2).booleanValue()) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                    }
                    i2 = positiveMod(i2);
                    for (int i5 = 0; i5 < positiveMod; i5++) {
                        Object obj3 = this.elementData[i5];
                        this.elementData[i5] = null;
                        if (function1.invoke(obj3).booleanValue()) {
                            this.elementData[i2] = obj3;
                            i2 = incremented(i2);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.size = negativeMod(i2 - this.head);
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int positiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < positiveMod) {
            ArraysKt.fill(this.elementData, (Object) null, i2, positiveMod);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.fill(objArr, (Object) null, this.head, objArr.length);
            ArraysKt.fill(this.elementData, (Object) null, 0, positiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt.arrayOfNulls(array, size());
        }
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int positiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < positiveMod) {
            ArraysKt.copyInto$default(this.elementData, array, 0, i2, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, positiveMod);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    /* compiled from: ArrayDeque.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "maxArraySize", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final int newCapacity$kotlin_stdlib(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - ArrayDeque.maxArraySize > 0) {
                if (i3 > ArrayDeque.maxArraySize) {
                    return Integer.MAX_VALUE;
                }
                return ArrayDeque.maxArraySize;
            }
            return i4;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        int i2;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i2 = this.head) < positiveMod(this.head + size())) ? this.head : i2 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod = positiveMod(this.head + size());
                int i2 = this.head;
                if (this.head < positiveMod) {
                    for (int i3 = this.head; i3 < positiveMod; i3++) {
                        Object obj = this.elementData[i3];
                        if (!elements.contains(obj)) {
                            this.elementData[i2] = obj;
                            i2++;
                        } else {
                            z2 = true;
                        }
                    }
                    ArraysKt.fill(this.elementData, (Object) null, i2, positiveMod);
                } else {
                    int length = this.elementData.length;
                    boolean z3 = false;
                    for (int i4 = this.head; i4 < length; i4++) {
                        Object obj2 = this.elementData[i4];
                        this.elementData[i4] = null;
                        if (!elements.contains(obj2)) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                    }
                    i2 = positiveMod(i2);
                    for (int i5 = 0; i5 < positiveMod; i5++) {
                        Object obj3 = this.elementData[i5];
                        this.elementData[i5] = null;
                        if (!elements.contains(obj3)) {
                            this.elementData[i2] = obj3;
                            i2 = incremented(i2);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.size = negativeMod(i2 - this.head);
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod = positiveMod(this.head + size());
                int i2 = this.head;
                if (this.head < positiveMod) {
                    for (int i3 = this.head; i3 < positiveMod; i3++) {
                        Object obj = this.elementData[i3];
                        if (elements.contains(obj)) {
                            this.elementData[i2] = obj;
                            i2++;
                        } else {
                            z2 = true;
                        }
                    }
                    ArraysKt.fill(this.elementData, (Object) null, i2, positiveMod);
                } else {
                    int length = this.elementData.length;
                    boolean z3 = false;
                    for (int i4 = this.head; i4 < length; i4++) {
                        Object obj2 = this.elementData[i4];
                        this.elementData[i4] = null;
                        if (elements.contains(obj2)) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                    }
                    i2 = positiveMod(i2);
                    for (int i5 = 0; i5 < positiveMod; i5++) {
                        Object obj3 = this.elementData[i5];
                        this.elementData[i5] = null;
                        if (elements.contains(obj3)) {
                            this.elementData[i2] = obj3;
                            i2 = incremented(i2);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.size = negativeMod(i2 - this.head);
                }
            }
        }
        return z2;
    }
}