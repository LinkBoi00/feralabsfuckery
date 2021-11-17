package con;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* loaded from: classes.dex */
public final class ugecCdPSw implements List, f7VKpcPHS {
    public int PSTqBLTET;
    public Object[] CBQ5d1kRq = new Object[16];
    public float[] kmSgne1rO = new float[16];
    public int Bhmn1KIah = -1;

    /* loaded from: classes.dex */
    public final class RG2GI7LDp implements ListIterator, f7VKpcPHS {
        public final int Bhmn1KIah;
        public int CBQ5d1kRq;
        public final int kmSgne1rO;

        public RG2GI7LDp(int i, int i2, int i3) {
            this.CBQ5d1kRq = i;
            this.kmSgne1rO = i2;
            this.Bhmn1KIah = i3;
        }

        public RG2GI7LDp(int i, int i2, int i3, int i4) {
            i = (i4 & 1) != 0 ? 0 : i;
            i2 = (i4 & 2) != 0 ? 0 : i2;
            i3 = (i4 & 4) != 0 ? ugecCdPSw.this.PSTqBLTET : i3;
            ugecCdPSw.this = ugecCdPSw.this;
            this.CBQ5d1kRq = i;
            this.kmSgne1rO = i2;
            this.Bhmn1KIah = i3;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.CBQ5d1kRq < this.Bhmn1KIah;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.CBQ5d1kRq > this.kmSgne1rO;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            Object[] objArr = ugecCdPSw.this.CBQ5d1kRq;
            int i = this.CBQ5d1kRq;
            this.CBQ5d1kRq = i + 1;
            return objArr[i];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.CBQ5d1kRq - this.kmSgne1rO;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            Object[] objArr = ugecCdPSw.this.CBQ5d1kRq;
            int i = this.CBQ5d1kRq - 1;
            this.CBQ5d1kRq = i;
            return objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.CBQ5d1kRq - this.kmSgne1rO) - 1;
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

    /* loaded from: classes.dex */
    public final class mhl5lIdbQ implements List, f7VKpcPHS {
        public final int CBQ5d1kRq;
        public final int kmSgne1rO;

        public mhl5lIdbQ(int i, int i2) {
            this.CBQ5d1kRq = i;
            this.kmSgne1rO = i2;
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            return ugecCdPSw.this.CBQ5d1kRq[i + this.CBQ5d1kRq];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.CBQ5d1kRq;
            int i2 = this.kmSgne1rO;
            if (i > i2) {
                return -1;
            }
            while (true) {
                int i3 = i + 1;
                if (anXlDk6fV.tGV7Q6urW(ugecCdPSw.this.CBQ5d1kRq[i], obj)) {
                    return i - this.CBQ5d1kRq;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            ugecCdPSw ugeccdpsw = ugecCdPSw.this;
            int i = this.CBQ5d1kRq;
            return new RG2GI7LDp(i, i, this.kmSgne1rO);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.kmSgne1rO;
            int i2 = this.CBQ5d1kRq;
            if (i2 > i) {
                return -1;
            }
            while (true) {
                int i3 = i - 1;
                if (anXlDk6fV.tGV7Q6urW(ugecCdPSw.this.CBQ5d1kRq[i], obj)) {
                    return i - this.CBQ5d1kRq;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            ugecCdPSw ugeccdpsw = ugecCdPSw.this;
            int i = this.CBQ5d1kRq;
            return new RG2GI7LDp(i, i, this.kmSgne1rO);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            ugecCdPSw ugeccdpsw = ugecCdPSw.this;
            int i2 = this.CBQ5d1kRq;
            return new RG2GI7LDp(i + i2, i2, this.kmSgne1rO);
        }

        @Override // java.util.List
        public Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.kmSgne1rO - this.CBQ5d1kRq;
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            ugecCdPSw ugeccdpsw = ugecCdPSw.this;
            int i3 = this.CBQ5d1kRq;
            return new mhl5lIdbQ(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ZUB9SUm0g.q3BipwRCk(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ZUB9SUm0g.J4Ux7ym32(this, objArr);
        }
    }

    public final float J4Ux7ym32() {
        int i = this.Bhmn1KIah + 1;
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(this);
        float f = Float.POSITIVE_INFINITY;
        if (i <= CBQ5d1kRq) {
            while (true) {
                i++;
                f = Math.min(this.kmSgne1rO[i], f);
                if (f < 0.0f) {
                    return f;
                }
                if (i == CBQ5d1kRq) {
                    break;
                }
            }
        }
        return f;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.Bhmn1KIah = -1;
        iiGwOFFnr();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.CBQ5d1kRq[i];
    }

    public final void iiGwOFFnr() {
        int i = this.Bhmn1KIah + 1;
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(this);
        if (i <= CBQ5d1kRq) {
            while (true) {
                i++;
                this.CBQ5d1kRq[i] = null;
                if (i == CBQ5d1kRq) {
                    break;
                }
            }
        }
        this.PSTqBLTET = this.Bhmn1KIah + 1;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(this);
        if (CBQ5d1kRq < 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            i++;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq[i], obj)) {
                return i;
            }
            if (i == CBQ5d1kRq) {
                return -1;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.PSTqBLTET == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new RG2GI7LDp(0, 0, 0, 7);
    }

    public final void kCA6Zs9sL(Object obj, float f, gdEmqfwpT gdemqfwpt) {
        int i = this.Bhmn1KIah + 1;
        this.Bhmn1KIah = i;
        Object[] objArr = this.CBQ5d1kRq;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            this.CBQ5d1kRq = Arrays.copyOf(objArr, length);
            this.kmSgne1rO = Arrays.copyOf(this.kmSgne1rO, length);
        }
        Object[] objArr2 = this.CBQ5d1kRq;
        int i2 = this.Bhmn1KIah;
        objArr2[i2] = obj;
        this.kmSgne1rO[i2] = f;
        iiGwOFFnr();
        gdemqfwpt.GPLPRo6go();
        this.Bhmn1KIah--;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(this);
        if (CBQ5d1kRq < 0) {
            return -1;
        }
        while (true) {
            int i = CBQ5d1kRq - 1;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq[CBQ5d1kRq], obj)) {
                return CBQ5d1kRq;
            }
            if (i < 0) {
                return -1;
            }
            CBQ5d1kRq = i;
        }
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new RG2GI7LDp(0, 0, 0, 7);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new RG2GI7LDp(i, 0, 0, 6);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.PSTqBLTET;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new mhl5lIdbQ(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ZUB9SUm0g.q3BipwRCk(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }
}
