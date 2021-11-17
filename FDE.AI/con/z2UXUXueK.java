package con;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class z2UXUXueK extends AbstractMap implements f7VKpcPHS {
    public yUfRSVKGd Bhmn1KIah;
    public OFzjsdJSX CBQ5d1kRq;
    public int MzoOEjc4X;
    public Object PSTqBLTET;
    public int ilHKhw3Yw;
    public uEb6wTQlg kmSgne1rO = new uEb6wTQlg(8);

    public z2UXUXueK(OFzjsdJSX oFzjsdJSX) {
        this.CBQ5d1kRq = oFzjsdJSX;
        this.Bhmn1KIah = oFzjsdJSX.CBQ5d1kRq;
        this.ilHKhw3Yw = oFzjsdJSX.size();
    }

    public OFzjsdJSX J4Ux7ym32() {
        yUfRSVKGd yufrsvkgd = this.Bhmn1KIah;
        OFzjsdJSX oFzjsdJSX = this.CBQ5d1kRq;
        if (yufrsvkgd != oFzjsdJSX.CBQ5d1kRq) {
            this.kmSgne1rO = new uEb6wTQlg(8);
            oFzjsdJSX = new OFzjsdJSX(this.Bhmn1KIah, this.ilHKhw3Yw);
        }
        this.CBQ5d1kRq = oFzjsdJSX;
        return oFzjsdJSX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        ksLrMHgEz kslrmhgez = yUfRSVKGd.kCA6Zs9sL;
        ksLrMHgEz kslrmhgez2 = yUfRSVKGd.kCA6Zs9sL;
        this.Bhmn1KIah = yUfRSVKGd.iiGwOFFnr;
        kCA6Zs9sL(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.Bhmn1KIah.kCA6Zs9sL(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ukjd43Q6T(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.Bhmn1KIah.yWvV4ePLl(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public void kCA6Zs9sL(int i) {
        this.ilHKhw3Yw = i;
        this.MzoOEjc4X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new ukjd43Q6T(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.PSTqBLTET = null;
        this.Bhmn1KIah = this.Bhmn1KIah.Bhmn1KIah(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.PSTqBLTET;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        OFzjsdJSX oFzjsdJSX = null;
        OFzjsdJSX oFzjsdJSX2 = map instanceof OFzjsdJSX ? (OFzjsdJSX) map : null;
        if (oFzjsdJSX2 == null) {
            z2UXUXueK z2uxuxuek = map instanceof z2UXUXueK ? (z2UXUXueK) map : null;
            if (z2uxuxuek != null) {
                oFzjsdJSX = z2uxuxuek.J4Ux7ym32();
            }
        } else {
            oFzjsdJSX = oFzjsdJSX2;
        }
        if (oFzjsdJSX != null) {
            NHGqjEvTn nHGqjEvTn = new NHGqjEvTn(0, 1);
            int i = this.ilHKhw3Yw;
            this.Bhmn1KIah = this.Bhmn1KIah.PSTqBLTET(oFzjsdJSX.CBQ5d1kRq, 0, nHGqjEvTn, this);
            int size = (oFzjsdJSX.size() + i) - nHGqjEvTn.q3BipwRCk;
            if (i != size) {
                kCA6Zs9sL(size);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.PSTqBLTET = null;
        yUfRSVKGd MzoOEjc4X = this.Bhmn1KIah.MzoOEjc4X(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (MzoOEjc4X == null) {
            ksLrMHgEz kslrmhgez = yUfRSVKGd.kCA6Zs9sL;
            ksLrMHgEz kslrmhgez2 = yUfRSVKGd.kCA6Zs9sL;
            MzoOEjc4X = yUfRSVKGd.iiGwOFFnr;
        }
        this.Bhmn1KIah = MzoOEjc4X;
        return this.PSTqBLTET;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.ilHKhw3Yw;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new OsIHRziOg(this);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.ilHKhw3Yw;
        yUfRSVKGd ilHKhw3Yw = this.Bhmn1KIah.ilHKhw3Yw(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (ilHKhw3Yw == null) {
            ksLrMHgEz kslrmhgez = yUfRSVKGd.kCA6Zs9sL;
            ksLrMHgEz kslrmhgez2 = yUfRSVKGd.kCA6Zs9sL;
            ilHKhw3Yw = yUfRSVKGd.iiGwOFFnr;
        }
        this.Bhmn1KIah = ilHKhw3Yw;
        if (i != this.ilHKhw3Yw) {
            return true;
        }
        return false;
    }
}
