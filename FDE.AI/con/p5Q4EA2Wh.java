package con;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class p5Q4EA2Wh implements Collection, f7VKpcPHS {
    public final Object[] CBQ5d1kRq;
    public final boolean kmSgne1rO;

    public p5Q4EA2Wh(Object[] objArr, boolean z) {
        this.CBQ5d1kRq = objArr;
        this.kmSgne1rO = z;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return Jefa2ExbR.mUqPm6GBh(this.CBQ5d1kRq, obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new lP4K00fUB(this.CBQ5d1kRq);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.CBQ5d1kRq.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.CBQ5d1kRq;
        return (!this.kmSgne1rO || !anXlDk6fV.tGV7Q6urW(objArr.getClass(), Object[].class)) ? Arrays.copyOf(objArr, objArr.length, Object[].class) : objArr;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }
}
