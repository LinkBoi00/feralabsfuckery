package con;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class dmnvfTTyg implements Map, Serializable, f7VKpcPHS {
    public static final dmnvfTTyg CBQ5d1kRq = new dmnvfTTyg();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            Void r3 = (Void) obj;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return bSc306J1d.CBQ5d1kRq;
    }

    @Override // java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return bSc306J1d.CBQ5d1kRq;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return Dqz1pJHWH.CBQ5d1kRq;
    }
}
