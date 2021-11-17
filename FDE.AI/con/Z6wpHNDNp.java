package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/* loaded from: classes.dex */
public final class Z6wpHNDNp implements Collection, f7VKpcPHS {
    public final List CBQ5d1kRq;
    public final int kmSgne1rO;

    public Z6wpHNDNp(List list) {
        this.CBQ5d1kRq = list;
        this.kmSgne1rO = list.size();
    }

    public final ZabSbAsoV J4Ux7ym32(int i) {
        return (ZabSbAsoV) this.CBQ5d1kRq.get(i);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        ZabSbAsoV zabSbAsoV = (ZabSbAsoV) obj;
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
    public final boolean contains(Object obj) {
        if (!(obj instanceof ZabSbAsoV)) {
            return false;
        }
        return this.CBQ5d1kRq.contains((ZabSbAsoV) obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.CBQ5d1kRq.containsAll(collection);
    }

    @Override // java.util.Collection, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z6wpHNDNp) && anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, ((Z6wpHNDNp) obj).CBQ5d1kRq);
    }

    @Override // java.util.Collection, java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.CBQ5d1kRq.iterator();
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
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.kmSgne1rO;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ZUB9SUm0g.q3BipwRCk(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("LocaleList(localeList=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
