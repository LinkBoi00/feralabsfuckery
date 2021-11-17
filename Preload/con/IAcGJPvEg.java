package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class IAcGJPvEg implements List, p84zpwafz {
    public int Bhmn1KIah;
    public final List CBQ5d1kRq;
    public final int kmSgne1rO;

    public IAcGJPvEg(List list, int i, int i2) {
        this.CBQ5d1kRq = list;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = i2;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.CBQ5d1kRq.add(i + this.kmSgne1rO, obj);
        this.Bhmn1KIah++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        List list = this.CBQ5d1kRq;
        int i = this.Bhmn1KIah;
        this.Bhmn1KIah = i + 1;
        list.add(i, obj);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        this.CBQ5d1kRq.addAll(i + this.kmSgne1rO, collection);
        this.Bhmn1KIah = collection.size() + this.Bhmn1KIah;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        this.CBQ5d1kRq.addAll(this.Bhmn1KIah, collection);
        this.Bhmn1KIah = collection.size() + this.Bhmn1KIah;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i = this.Bhmn1KIah - 1;
        int i2 = this.kmSgne1rO;
        if (i2 <= i) {
            while (true) {
                i--;
                this.CBQ5d1kRq.remove(i);
                if (i == i2) {
                    break;
                }
            }
        }
        this.Bhmn1KIah = this.kmSgne1rO;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.kmSgne1rO;
        int i2 = this.Bhmn1KIah;
        if (i >= i2) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.get(i), obj)) {
                return true;
            }
            if (i3 >= i2) {
                return false;
            }
            i = i3;
        }
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
        return this.CBQ5d1kRq.get(i + this.kmSgne1rO);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = this.kmSgne1rO;
        int i2 = this.Bhmn1KIah;
        if (i >= i2) {
            return -1;
        }
        while (true) {
            int i3 = i + 1;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.get(i), obj)) {
                return i - this.kmSgne1rO;
            }
            if (i3 >= i2) {
                return -1;
            }
            i = i3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.Bhmn1KIah == this.kmSgne1rO;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new B1wmCLZSG(this, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.Bhmn1KIah - 1;
        int i2 = this.kmSgne1rO;
        if (i2 > i) {
            return -1;
        }
        while (true) {
            i--;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.get(i), obj)) {
                return i - this.kmSgne1rO;
            }
            if (i == i2) {
                return -1;
            }
        }
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new B1wmCLZSG(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new B1wmCLZSG(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        this.Bhmn1KIah--;
        return this.CBQ5d1kRq.remove(i + this.kmSgne1rO);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.kmSgne1rO;
        int i2 = this.Bhmn1KIah;
        if (i >= i2) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.get(i), obj)) {
                this.CBQ5d1kRq.remove(i);
                this.Bhmn1KIah--;
                return true;
            } else if (i3 >= i2) {
                return false;
            } else {
                i = i3;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.Bhmn1KIah;
        for (Object obj : collection) {
            remove(obj);
        }
        return i != this.Bhmn1KIah;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.Bhmn1KIah;
        int i2 = i - 1;
        int i3 = this.kmSgne1rO;
        if (i3 <= i2) {
            while (true) {
                i2--;
                if (!collection.contains(this.CBQ5d1kRq.get(i2))) {
                    this.CBQ5d1kRq.remove(i2);
                    this.Bhmn1KIah--;
                }
                if (i2 == i3) {
                    break;
                }
            }
        }
        return i != this.Bhmn1KIah;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.CBQ5d1kRq.set(i + this.kmSgne1rO, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.Bhmn1KIah - this.kmSgne1rO;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new IAcGJPvEg(this, i, i2);
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
