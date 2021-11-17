package con;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class eAq6YOFAV implements Map, f7VKpcPHS {
    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (anXlDk6fV.tGV7Q6urW(entry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new LXZ4IeUXr((OFzjsdJSX) this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[SYNTHETIC] */
    @Override // java.util.Map, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry instanceof Map.Entry) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                OFzjsdJSX oFzjsdJSX = (OFzjsdJSX) this;
                Object obj2 = oFzjsdJSX.get(key);
                if (!(!anXlDk6fV.tGV7Q6urW(value, obj2)) && (obj2 != null || oFzjsdJSX.containsKey(key))) {
                    z = true;
                    continue;
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            continue;
            if (!z) {
            }
        }
        return true;
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new LXZ4IeUXr((OFzjsdJSX) this, 1);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
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
    public final int size() {
        return ((OFzjsdJSX) this).kmSgne1rO;
    }

    @Override // java.lang.Object
    public String toString() {
        return wkFJfVmcv.EBQXiIPmm(entrySet(), ", ", "{", "}", 0, null, new nVhenZUxZ(this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new nyuuWV7kC((OFzjsdJSX) this);
    }
}
