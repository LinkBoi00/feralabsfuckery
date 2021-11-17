package con;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class nurIPexGP extends tJsmargbo {
    public nurIPexGP(PDQrIJkOY pDQrIJkOY) {
        super(pDQrIJkOY);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        Object obj2 = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Object obj = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.CBQ5d1kRq.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!this.CBQ5d1kRq.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        PDQrIJkOY pDQrIJkOY = this.CBQ5d1kRq;
        return new ZlWJGA6Lp(pDQrIJkOY, ((iui7vINQ4) ((eAq6YOFAV) pDQrIJkOY.GPLPRo6go().tGV7Q6urW).entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.CBQ5d1kRq.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z = false;
        while (true) {
            for (Object obj : collection) {
                if (this.CBQ5d1kRq.remove(obj) != null || z) {
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
        Set n4UIOvAko = wkFJfVmcv.n4UIOvAko(collection);
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
            for (Map.Entry entry : pDQrIJkOY.kmSgne1rO) {
                if (!n4UIOvAko.contains(entry.getKey())) {
                    z2uxuxuek.remove(entry.getKey());
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
