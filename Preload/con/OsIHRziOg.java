package con;

import java.util.AbstractCollection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OsIHRziOg extends AbstractCollection implements p84zpwafz {
    public final z2UXUXueK CBQ5d1kRq;

    public OsIHRziOg(z2UXUXueK z2uxuxuek) {
        this.CBQ5d1kRq = z2uxuxuek;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.CBQ5d1kRq.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.CBQ5d1kRq.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Evklyz0dO(this.CBQ5d1kRq);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.CBQ5d1kRq.ilHKhw3Yw;
    }
}
