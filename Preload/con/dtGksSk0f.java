package con;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class dtGksSk0f implements Iterable {
    public VbWI3BZ7c CBQ5d1kRq;
    public VbWI3BZ7c kmSgne1rO;
    public WeakHashMap Bhmn1KIah = new WeakHashMap();
    public int PSTqBLTET = 0;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Iterator, Tnctn6sSk {
        public VbWI3BZ7c CBQ5d1kRq;
        public boolean kmSgne1rO = true;

        public RG2GI7LDp() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.kmSgne1rO) {
                return dtGksSk0f.this.CBQ5d1kRq != null;
            }
            VbWI3BZ7c vbWI3BZ7c = this.CBQ5d1kRq;
            return (vbWI3BZ7c == null || vbWI3BZ7c.Bhmn1KIah == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            VbWI3BZ7c vbWI3BZ7c;
            if (this.kmSgne1rO) {
                this.kmSgne1rO = false;
                vbWI3BZ7c = dtGksSk0f.this.CBQ5d1kRq;
            } else {
                VbWI3BZ7c vbWI3BZ7c2 = this.CBQ5d1kRq;
                vbWI3BZ7c = vbWI3BZ7c2 != null ? vbWI3BZ7c2.Bhmn1KIah : null;
            }
            this.CBQ5d1kRq = vbWI3BZ7c;
            return vbWI3BZ7c;
        }

        @Override // con.Tnctn6sSk
        public void q3BipwRCk(VbWI3BZ7c vbWI3BZ7c) {
            VbWI3BZ7c vbWI3BZ7c2 = this.CBQ5d1kRq;
            if (vbWI3BZ7c == vbWI3BZ7c2) {
                VbWI3BZ7c vbWI3BZ7c3 = vbWI3BZ7c2.PSTqBLTET;
                this.CBQ5d1kRq = vbWI3BZ7c3;
                this.kmSgne1rO = vbWI3BZ7c3 == null;
            }
        }
    }

    public Object GPLPRo6go(Object obj, Object obj2) {
        VbWI3BZ7c J4Ux7ym32 = J4Ux7ym32(obj);
        if (J4Ux7ym32 != null) {
            return J4Ux7ym32.kmSgne1rO;
        }
        iiGwOFFnr(obj, obj2);
        return null;
    }

    public VbWI3BZ7c J4Ux7ym32(Object obj) {
        VbWI3BZ7c vbWI3BZ7c = this.CBQ5d1kRq;
        while (vbWI3BZ7c != null && !vbWI3BZ7c.CBQ5d1kRq.equals(obj)) {
            vbWI3BZ7c = vbWI3BZ7c.Bhmn1KIah;
        }
        return vbWI3BZ7c;
    }

    public Object Puu3Rhg4F(Object obj) {
        VbWI3BZ7c J4Ux7ym32 = J4Ux7ym32(obj);
        if (J4Ux7ym32 == null) {
            return null;
        }
        this.PSTqBLTET--;
        if (!this.Bhmn1KIah.isEmpty()) {
            for (Tnctn6sSk tnctn6sSk : this.Bhmn1KIah.keySet()) {
                tnctn6sSk.q3BipwRCk(J4Ux7ym32);
            }
        }
        VbWI3BZ7c vbWI3BZ7c = J4Ux7ym32.PSTqBLTET;
        VbWI3BZ7c vbWI3BZ7c2 = J4Ux7ym32.Bhmn1KIah;
        if (vbWI3BZ7c != null) {
            vbWI3BZ7c.Bhmn1KIah = vbWI3BZ7c2;
        } else {
            this.CBQ5d1kRq = vbWI3BZ7c2;
        }
        VbWI3BZ7c vbWI3BZ7c3 = J4Ux7ym32.Bhmn1KIah;
        if (vbWI3BZ7c3 != null) {
            vbWI3BZ7c3.PSTqBLTET = vbWI3BZ7c;
        } else {
            this.kmSgne1rO = vbWI3BZ7c;
        }
        J4Ux7ym32.Bhmn1KIah = null;
        J4Ux7ym32.PSTqBLTET = null;
        return J4Ux7ym32.kmSgne1rO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((con.HD3guX1ay) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dtGksSk0f)) {
            return false;
        }
        dtGksSk0f dtgkssk0f = (dtGksSk0f) obj;
        if (this.PSTqBLTET != dtgkssk0f.PSTqBLTET) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = dtgkssk0f.iterator();
        while (true) {
            HD3guX1ay hD3guX1ay = (HD3guX1ay) it;
            if (!hD3guX1ay.hasNext()) {
                break;
            }
            HD3guX1ay hD3guX1ay2 = (HD3guX1ay) it2;
            if (!hD3guX1ay2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) hD3guX1ay.next();
            Object next = hD3guX1ay2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            HD3guX1ay hD3guX1ay = (HD3guX1ay) it;
            if (!hD3guX1ay.hasNext()) {
                return i;
            }
            i += ((Map.Entry) hD3guX1ay.next()).hashCode();
        }
    }

    public VbWI3BZ7c iiGwOFFnr(Object obj, Object obj2) {
        VbWI3BZ7c vbWI3BZ7c = new VbWI3BZ7c(obj, obj2);
        this.PSTqBLTET++;
        VbWI3BZ7c vbWI3BZ7c2 = this.kmSgne1rO;
        if (vbWI3BZ7c2 == null) {
            this.CBQ5d1kRq = vbWI3BZ7c;
        } else {
            vbWI3BZ7c2.Bhmn1KIah = vbWI3BZ7c;
            vbWI3BZ7c.PSTqBLTET = vbWI3BZ7c2;
        }
        this.kmSgne1rO = vbWI3BZ7c;
        return vbWI3BZ7c;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        oWYIQvvK9 owyiqvvk9 = new oWYIQvvK9(this.CBQ5d1kRq, this.kmSgne1rO);
        this.Bhmn1KIah.put(owyiqvvk9, Boolean.FALSE);
        return owyiqvvk9;
    }

    public RG2GI7LDp kCA6Zs9sL() {
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
        this.Bhmn1KIah.put(rG2GI7LDp, Boolean.FALSE);
        return rG2GI7LDp;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("[");
        Iterator it = iterator();
        while (true) {
            HD3guX1ay hD3guX1ay = (HD3guX1ay) it;
            if (hD3guX1ay.hasNext()) {
                q3BipwRCk.append(((Map.Entry) hD3guX1ay.next()).toString());
                if (hD3guX1ay.hasNext()) {
                    q3BipwRCk.append(", ");
                }
            } else {
                q3BipwRCk.append("]");
                return q3BipwRCk.toString();
            }
        }
    }
}
