package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class T6gjqeZLe implements List, p84zpwafz {
    public final pnuAOe8oh CBQ5d1kRq;

    public T6gjqeZLe(pnuAOe8oh pnuaoe8oh) {
        this.CBQ5d1kRq = pnuaoe8oh;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.CBQ5d1kRq.q3BipwRCk(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        this.CBQ5d1kRq.J4Ux7ym32(obj);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return this.CBQ5d1kRq.dIocxURUo(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        pnuAOe8oh pnuaoe8oh = this.CBQ5d1kRq;
        return pnuaoe8oh.dIocxURUo(pnuaoe8oh.Bhmn1KIah, collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.CBQ5d1kRq.kCA6Zs9sL();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.CBQ5d1kRq.iiGwOFFnr(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        pnuAOe8oh pnuaoe8oh = this.CBQ5d1kRq;
        Objects.requireNonNull(pnuaoe8oh);
        for (Object obj : collection) {
            if (!pnuaoe8oh.iiGwOFFnr(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.CBQ5d1kRq.CBQ5d1kRq[i];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.CBQ5d1kRq.Puu3Rhg4F(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq.yWvV4ePLl();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new B1wmCLZSG(this, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        pnuAOe8oh pnuaoe8oh = this.CBQ5d1kRq;
        int i = pnuaoe8oh.Bhmn1KIah;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
        while (!anXlDk6fV.tGV7Q6urW(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
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
        return this.CBQ5d1kRq.CBQ5d1kRq(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.CBQ5d1kRq.vPSbyrYWX(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        pnuAOe8oh pnuaoe8oh = this.CBQ5d1kRq;
        Objects.requireNonNull(pnuaoe8oh);
        if (collection.isEmpty()) {
            return false;
        }
        int i = pnuaoe8oh.Bhmn1KIah;
        for (Object obj : collection) {
            pnuaoe8oh.vPSbyrYWX(obj);
        }
        return i != pnuaoe8oh.Bhmn1KIah;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        pnuAOe8oh pnuaoe8oh = this.CBQ5d1kRq;
        int i = pnuaoe8oh.Bhmn1KIah;
        int i2 = i - 1;
        if (i2 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                if (!collection.contains(pnuaoe8oh.CBQ5d1kRq[i2])) {
                    pnuaoe8oh.CBQ5d1kRq(i2);
                }
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        return i != pnuaoe8oh.Bhmn1KIah;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Object[] objArr = this.CBQ5d1kRq.CBQ5d1kRq;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CBQ5d1kRq.Bhmn1KIah;
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
