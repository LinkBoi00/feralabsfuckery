package con;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class wwj2VvJy1 implements ListIterator, f7VKpcPHS {
    public int CBQ5d1kRq;
    public int kmSgne1rO;

    public wwj2VvJy1(int i, int i2) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = i2;
    }

    public final void J4Ux7ym32() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.CBQ5d1kRq < this.kmSgne1rO;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.CBQ5d1kRq > 0;
    }

    public final void kCA6Zs9sL() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.CBQ5d1kRq - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
