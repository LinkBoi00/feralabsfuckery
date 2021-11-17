package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public abstract class mERTFaPTS extends kVmRinNH6 implements HrqgPICFj {
    @Override // con.Og6dYSoy7, java.util.Collection, java.util.List, con.HrqgPICFj
    public HrqgPICFj addAll(Collection collection) {
        bYMPHjVnt bymphjvnt = (bYMPHjVnt) dIocxURUo();
        bymphjvnt.addAll(collection);
        return bymphjvnt.iiGwOFFnr();
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // con.Og6dYSoy7, java.util.Collection
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

    @Override // con.kVmRinNH6, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // con.kVmRinNH6, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // con.kVmRinNH6, java.util.List
    public List subList(int i, int i2) {
        return new D32LxzbZS(this, i, i2);
    }
}
