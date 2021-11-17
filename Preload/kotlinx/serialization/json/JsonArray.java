package kotlinx.serialization.json;

import con.I5x3F2d16;
import con.TIYMCd0MU;
import con.ZUB9SUm0g;
import con.anXlDk6fV;
import con.dnBSj5uJN;
import con.f7VKpcPHS;
import con.wjjWl3mHt;
import con.wkFJfVmcv;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
@TIYMCd0MU(with = I5x3F2d16.class)
/* loaded from: classes.dex */
public final class JsonArray extends JsonElement implements List, f7VKpcPHS {
    public static final Companion Companion = new Companion(null);
    public final List CBQ5d1kRq;

    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion(dnBSj5uJN dnbsj5ujn) {
        }

        public final wjjWl3mHt serializer() {
            return I5x3F2d16.q3BipwRCk;
        }
    }

    public JsonArray(List list) {
        super(null);
        this.CBQ5d1kRq = list;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
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
    public final boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return this.CBQ5d1kRq.contains((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.CBQ5d1kRq.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Object
    public boolean equals(Object obj) {
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        return (JsonElement) this.CBQ5d1kRq.get(i);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.CBQ5d1kRq.indexOf((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.CBQ5d1kRq.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.CBQ5d1kRq.lastIndexOf((JsonElement) obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.CBQ5d1kRq.listIterator();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return this.CBQ5d1kRq.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
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
        JsonElement jsonElement = (JsonElement) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CBQ5d1kRq.size();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.CBQ5d1kRq.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ZUB9SUm0g.q3BipwRCk(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }

    @Override // java.lang.Object
    public String toString() {
        return wkFJfVmcv.EBQXiIPmm(this.CBQ5d1kRq, ",", "[", "]", 0, null, null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
