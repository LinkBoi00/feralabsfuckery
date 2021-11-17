package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class x5Xme9UIF extends DcopFwD8Z implements ZoDp2hPgc {
    public static final x5Xme9UIF MzoOEjc4X;
    public static final oWhsE8IPp PSTqBLTET = new oWhsE8IPp(null, 8);
    public final OFzjsdJSX Bhmn1KIah;
    public final Object CBQ5d1kRq;
    public final Object kmSgne1rO;

    static {
        L5RKcDF9F l5RKcDF9F = L5RKcDF9F.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg = OFzjsdJSX.Bhmn1KIah;
        MzoOEjc4X = new x5Xme9UIF(l5RKcDF9F, l5RKcDF9F, OFzjsdJSX.PSTqBLTET);
    }

    public x5Xme9UIF(Object obj, Object obj2, OFzjsdJSX oFzjsdJSX) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = obj2;
        this.Bhmn1KIah = oFzjsdJSX;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.Bhmn1KIah.size();
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.Bhmn1KIah.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new gQLYYUI6F(this.CBQ5d1kRq, this.Bhmn1KIah);
    }
}
