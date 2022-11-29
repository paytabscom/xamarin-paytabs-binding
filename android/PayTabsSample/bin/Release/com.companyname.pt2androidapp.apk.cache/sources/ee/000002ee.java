package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    ArrayMap<K, V>.EntrySet mEntrySet;
    ArrayMap<K, V>.KeySet mKeySet;
    ArrayMap<K, V>.ValueCollection mValues;

    public ArrayMap() {
    }

    public ArrayMap(int i2) {
        super(i2);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        int i2 = this.mSize;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.mSize;
    }

    public boolean retainAll(Collection<?> collection) {
        int i2 = this.mSize;
        for (int i3 = this.mSize - 1; i3 >= 0; i3--) {
            if (!collection.contains(keyAt(i3))) {
                removeAt(i3);
            }
        }
        return i2 != this.mSize;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet == null) {
            ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
            this.mEntrySet = entrySet2;
            return entrySet2;
        }
        return entrySet;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet == null) {
            ArrayMap<K, V>.KeySet keySet2 = new KeySet();
            this.mKeySet = keySet2;
            return keySet2;
        }
        return keySet;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection == null) {
            ArrayMap<K, V>.ValueCollection valueCollection2 = new ValueCollection();
            this.mValues = valueCollection2;
            return valueCollection2;
        }
        return valueCollection;
    }

    /* loaded from: classes.dex */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.mSize;
        }
    }

    /* loaded from: classes.dex */
    final class KeySet implements Set<K> {
        KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int indexOfKey = ArrayMap.this.indexOfKey(obj);
            if (indexOfKey >= 0) {
                ArrayMap.this.removeAt(indexOfKey);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ArrayMap.this.mSize;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i2 = ArrayMap.this.mSize;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = ArrayMap.this.keyAt(i3);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ArrayMap.this.toArrayHelper(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int i3 = ArrayMap.this.mSize - 1; i3 >= 0; i3--) {
                K keyAt = ArrayMap.this.keyAt(i3);
                i2 += keyAt == null ? 0 : keyAt.hashCode();
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    final class ValueCollection implements Collection<V> {
        ValueCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int indexOfValue = ArrayMap.this.indexOfValue(obj);
            if (indexOfValue >= 0) {
                ArrayMap.this.removeAt(indexOfValue);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i2 = ArrayMap.this.mSize;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (collection.contains(ArrayMap.this.valueAt(i3))) {
                    ArrayMap.this.removeAt(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i2 = ArrayMap.this.mSize;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (!collection.contains(ArrayMap.this.valueAt(i3))) {
                    ArrayMap.this.removeAt(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return ArrayMap.this.mSize;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i2 = ArrayMap.this.mSize;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = ArrayMap.this.valueAt(i3);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ArrayMap.this.toArrayHelper(tArr, 1);
        }
    }

    /* loaded from: classes.dex */
    final class KeyIterator extends IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(ArrayMap.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int i2) {
            return ArrayMap.this.keyAt(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i2) {
            ArrayMap.this.removeAt(i2);
        }
    }

    /* loaded from: classes.dex */
    final class ValueIterator extends IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(ArrayMap.this.mSize);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int i2) {
            return ArrayMap.this.valueAt(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i2) {
            ArrayMap.this.removeAt(i2);
        }
    }

    /* loaded from: classes.dex */
    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex = -1;

        MapIterator() {
            this.mEnd = ArrayMap.this.mSize - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mEntryValid) {
                throw new IllegalStateException();
            }
            ArrayMap.this.removeAt(this.mIndex);
            this.mIndex--;
            this.mEnd--;
            this.mEntryValid = false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.keyAt(this.mIndex);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.valueAt(this.mIndex);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.setValueAt(this.mIndex, v2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return ContainerHelpers.equal(entry.getKey(), ArrayMap.this.keyAt(this.mIndex)) && ContainerHelpers.equal(entry.getValue(), ArrayMap.this.valueAt(this.mIndex));
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K keyAt = ArrayMap.this.keyAt(this.mIndex);
            V valueAt = ArrayMap.this.valueAt(this.mIndex);
            return (keyAt == null ? 0 : keyAt.hashCode()) ^ (valueAt != null ? valueAt.hashCode() : 0);
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T[] toArrayHelper(T[] tArr, int i2) {
        int i3 = this.mSize;
        if (tArr.length < i3) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
        }
        for (int i4 = 0; i4 < i3; i4++) {
            tArr[i4] = this.mArray[(i4 << 1) + i2];
        }
        if (tArr.length > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}