package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class kVmRinNH6 extends Og6dYSoy7 implements List {

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Iterator, f7VKpcPHS {
        public int CBQ5d1kRq;

        public RG2GI7LDp() {
            kVmRinNH6.this = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.CBQ5d1kRq < kVmRinNH6.this.J4Ux7ym32();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                kVmRinNH6 kvmrinnh6 = kVmRinNH6.this;
                int i = this.CBQ5d1kRq;
                this.CBQ5d1kRq = i + 1;
                return kvmrinnh6.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends RG2GI7LDp implements ListIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(int i) {
            super();
            kVmRinNH6.this = r4;
            int J4Ux7ym32 = r4.J4Ux7ym32();
            if (i < 0 || i > J4Ux7ym32) {
                throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", J4Ux7ym32));
            }
            this.CBQ5d1kRq = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.CBQ5d1kRq > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.CBQ5d1kRq;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (hasPrevious()) {
                kVmRinNH6 kvmrinnh6 = kVmRinNH6.this;
                int i = this.CBQ5d1kRq - 1;
                this.CBQ5d1kRq = i;
                return kvmrinnh6.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.CBQ5d1kRq - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, con.HrqgPICFj
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object obj2 : this) {
            if (!anXlDk6fV.tGV7Q6urW(obj2, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public abstract Object get(int i);

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        for (Object obj2 : this) {
            if (anXlDk6fV.tGV7Q6urW(obj2, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new RG2GI7LDp();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (anXlDk6fV.tGV7Q6urW(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new mhl5lIdbQ(0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new mhl5lIdbQ(i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, con.HrqgPICFj
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new kvFwRYSUX(this, i, i2);
    }
}
