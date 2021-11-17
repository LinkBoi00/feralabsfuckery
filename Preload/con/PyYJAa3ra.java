package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class PyYJAa3ra extends tJsmargbo {
    public PyYJAa3ra(PDQrIJkOY pDQrIJkOY) {
        super(pDQrIJkOY);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Object obj = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof f7VKpcPHS) || (obj instanceof TLKhhgzsb)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        PDQrIJkOY pDQrIJkOY = this.CBQ5d1kRq;
        return new T3P8xswqq(pDQrIJkOY, ((iui7vINQ4) ((eAq6YOFAV) pDQrIJkOY.GPLPRo6go().tGV7Q6urW).entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return ((obj instanceof Map.Entry) && (!(obj instanceof f7VKpcPHS) || (obj instanceof TLKhhgzsb))) && this.CBQ5d1kRq.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            while (it.hasNext()) {
                if (this.CBQ5d1kRq.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        vf6drsTF1 vf6drstf1;
        int i;
        boolean z;
        s05BzCoHq Puu3Rhg4F;
        int WaUP0CF08 = anXlDk6fV.WaUP0CF08(CjvsxH2Me.nlGCs0NZs(collection, 10));
        if (WaUP0CF08 < 16) {
            WaUP0CF08 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(WaUP0CF08);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        PDQrIJkOY pDQrIJkOY = this.CBQ5d1kRq;
        boolean z2 = false;
        do {
            Object obj = G5eK0AZDb.q3BipwRCk;
            synchronized (G5eK0AZDb.q3BipwRCk) {
                tkrvIuaRR tkrviuarr = (tkrvIuaRR) UvOuyIFuT.GPLPRo6go((tkrvIuaRR) pDQrIJkOY.CBQ5d1kRq, UvOuyIFuT.Puu3Rhg4F());
                vf6drstf1 = tkrviuarr.tGV7Q6urW;
                i = tkrviuarr.dIocxURUo;
            }
            z2UXUXueK z2uxuxuek = new z2UXUXueK((OFzjsdJSX) vf6drstf1);
            z = true;
            for (Map.Entry entry2 : pDQrIJkOY.kmSgne1rO) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !anXlDk6fV.tGV7Q6urW(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    z2uxuxuek.remove(entry2.getKey());
                    z2 = true;
                }
            }
            OFzjsdJSX J4Ux7ym32 = z2uxuxuek.J4Ux7ym32();
            if (anXlDk6fV.tGV7Q6urW(J4Ux7ym32, vf6drstf1)) {
                break;
            }
            Object obj2 = G5eK0AZDb.q3BipwRCk;
            synchronized (G5eK0AZDb.q3BipwRCk) {
                tkrvIuaRR tkrviuarr2 = (tkrvIuaRR) pDQrIJkOY.CBQ5d1kRq;
                PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                synchronized (UvOuyIFuT.J4Ux7ym32) {
                    Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
                    tkrvIuaRR tkrviuarr3 = (tkrvIuaRR) UvOuyIFuT.MzoOEjc4X(tkrviuarr2, pDQrIJkOY, Puu3Rhg4F);
                    int i2 = tkrviuarr3.dIocxURUo;
                    if (i2 == i) {
                        tkrviuarr3.tGV7Q6urW = J4Ux7ym32;
                        tkrviuarr3.dIocxURUo = i2 + 1;
                    } else {
                        z = false;
                    }
                }
                UvOuyIFuT.oon79WMrY(Puu3Rhg4F, pDQrIJkOY);
            }
        } while (!z);
        return z2;
    }
}
