package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class lXExmygLE extends FSq6CQ0dR {
    public static final boolean NyWTwPF6V(List list, PmanMZxiM pmanMZxiM) {
        int i;
        boolean z = false;
        if (list instanceof RandomAccess) {
            int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(list);
            if (CBQ5d1kRq >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    Object obj = list.get(i2);
                    if (!((Boolean) pmanMZxiM.IytU16YUK(obj)).booleanValue()) {
                        if (i != i2) {
                            list.set(i, obj);
                        }
                        i++;
                    }
                    if (i2 == CBQ5d1kRq) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i < list.size()) {
                int CBQ5d1kRq2 = idpM54xlp.CBQ5d1kRq(list);
                if (CBQ5d1kRq2 < i) {
                    return true;
                }
                while (true) {
                    list.remove(CBQ5d1kRq2);
                    if (CBQ5d1kRq2 == i) {
                        return true;
                    }
                    CBQ5d1kRq2--;
                }
            }
        } else if (!(list instanceof f7VKpcPHS) || (list instanceof p84zpwafz)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) pmanMZxiM.IytU16YUK(it.next())).booleanValue()) {
                    it.remove();
                    z = true;
                }
            }
        } else {
            cOutqbkMD.kmSgne1rO(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        return z;
    }

    public static final boolean mUqPm6GBh(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object obj : iterable) {
            if (collection.add(obj)) {
                z = true;
            }
        }
        return z;
    }

    public static final Object vNtjxmzUM(List list) {
        if (!list.isEmpty()) {
            return list.remove(idpM54xlp.CBQ5d1kRq(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
