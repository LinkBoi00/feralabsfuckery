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
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.size()
            java.util.Map r7 = (java.util.Map) r7
            int r3 = r7.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            java.util.Set r7 = r7.entrySet()
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0026
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0026
            goto L_0x0060
        L_0x0026:
            java.util.Iterator r7 = r7.iterator()
        L_0x002a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r3 = r1 instanceof java.util.Map.Entry
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r1 = r2
            goto L_0x005d
        L_0x003c:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4 = r6
            con.OFzjsdJSX r4 = (con.OFzjsdJSX) r4
            java.lang.Object r5 = r4.get(r3)
            boolean r1 = con.anXlDk6fV.tGV7Q6urW(r1, r5)
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0053
            goto L_0x003a
        L_0x0053:
            if (r5 != 0) goto L_0x005c
            boolean r1 = r4.containsKey(r3)
            if (r1 != 0) goto L_0x005c
            goto L_0x003a
        L_0x005c:
            r1 = r0
        L_0x005d:
            if (r1 != 0) goto L_0x002a
            r0 = r2
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.eAq6YOFAV.equals(java.lang.Object):boolean");
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
