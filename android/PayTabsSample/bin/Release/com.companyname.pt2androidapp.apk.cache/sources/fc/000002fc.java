package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class IndexBasedArrayIterator<T> implements Iterator<T> {
    private boolean mCanRemove;
    private int mIndex;
    private int mSize;

    protected abstract T elementAt(int i2);

    protected abstract void removeAt(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexBasedArrayIterator(int i2) {
        this.mSize = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.mIndex < this.mSize;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T elementAt = elementAt(this.mIndex);
        this.mIndex++;
        this.mCanRemove = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.mCanRemove) {
            throw new IllegalStateException();
        }
        int i2 = this.mIndex - 1;
        this.mIndex = i2;
        removeAt(i2);
        this.mSize--;
        this.mCanRemove = false;
    }
}