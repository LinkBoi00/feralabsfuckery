package con;
/* loaded from: classes.dex */
public final class yERf2uF3w extends z1uHoUq2L implements TLKhhgzsb {
    public final uMFWEtKlP Bhmn1KIah;
    public Object PSTqBLTET;

    public yERf2uF3w(uMFWEtKlP umfwetklp, Object obj, Object obj2) {
        super(obj, obj2);
        this.Bhmn1KIah = umfwetklp;
        this.PSTqBLTET = obj2;
    }

    @Override // con.z1uHoUq2L, java.util.Map.Entry
    public Object getValue() {
        return this.PSTqBLTET;
    }

    @Override // con.z1uHoUq2L, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object obj2 = this.PSTqBLTET;
        this.PSTqBLTET = obj;
        uMFWEtKlP umfwetklp = this.Bhmn1KIah;
        Object obj3 = this.CBQ5d1kRq;
        G1uNrjfG6 g1uNrjfG6 = umfwetklp.CBQ5d1kRq;
        if (g1uNrjfG6.PSTqBLTET.containsKey(obj3)) {
            if (g1uNrjfG6.Bhmn1KIah) {
                Object J4Ux7ym32 = g1uNrjfG6.J4Ux7ym32();
                g1uNrjfG6.PSTqBLTET.put(obj3, obj);
                g1uNrjfG6.GPLPRo6go(J4Ux7ym32 != null ? J4Ux7ym32.hashCode() : 0, g1uNrjfG6.PSTqBLTET.Bhmn1KIah, J4Ux7ym32, 0);
            } else {
                g1uNrjfG6.PSTqBLTET.put(obj3, obj);
            }
            g1uNrjfG6.qVUwofr5s = g1uNrjfG6.PSTqBLTET.MzoOEjc4X;
        }
        return obj2;
    }
}
