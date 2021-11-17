package con;
/* loaded from: classes.dex */
public final class m0AevvDOv implements Comparable {
    public static final m0AevvDOv Bhmn1KIah;
    public static final m0AevvDOv Eeka1udhb;
    public static final m0AevvDOv MzoOEjc4X;
    public static final m0AevvDOv PSTqBLTET;
    public static final m0AevvDOv dXrmkklc8;
    public static final m0AevvDOv ilHKhw3Yw;
    public static final JhpbRXxsg kmSgne1rO = new JhpbRXxsg(0);
    public static final m0AevvDOv qVUwofr5s;
    public final int CBQ5d1kRq;

    static {
        m0AevvDOv m0aevvdov = new m0AevvDOv(100);
        m0AevvDOv m0aevvdov2 = new m0AevvDOv(200);
        m0AevvDOv m0aevvdov3 = new m0AevvDOv(300);
        m0AevvDOv m0aevvdov4 = new m0AevvDOv(400);
        Bhmn1KIah = m0aevvdov4;
        m0AevvDOv m0aevvdov5 = new m0AevvDOv(500);
        PSTqBLTET = m0aevvdov5;
        m0AevvDOv m0aevvdov6 = new m0AevvDOv(600);
        MzoOEjc4X = m0aevvdov6;
        m0AevvDOv m0aevvdov7 = new m0AevvDOv(700);
        m0AevvDOv m0aevvdov8 = new m0AevvDOv(800);
        m0AevvDOv m0aevvdov9 = new m0AevvDOv(900);
        ilHKhw3Yw = m0aevvdov3;
        qVUwofr5s = m0aevvdov4;
        Eeka1udhb = m0aevvdov5;
        dXrmkklc8 = m0aevvdov7;
        idpM54xlp.ixWaw2akD(m0aevvdov, m0aevvdov2, m0aevvdov3, m0aevvdov4, m0aevvdov5, m0aevvdov6, m0aevvdov7, m0aevvdov8, m0aevvdov9);
    }

    public m0AevvDOv(int i) {
        this.CBQ5d1kRq = i;
        boolean z = false;
        if (1 <= i && i <= 1000) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Font weight can be in range [1, 1000]. Current value: ", Integer.valueOf(i)).toString());
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0AevvDOv) && this.CBQ5d1kRq == ((m0AevvDOv) obj).CBQ5d1kRq;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq;
    }

    /* renamed from: q3BipwRCk */
    public int compareTo(m0AevvDOv m0aevvdov) {
        return anXlDk6fV.oon79WMrY(this.CBQ5d1kRq, m0aevvdov.CBQ5d1kRq);
    }

    @Override // java.lang.Object
    public String toString() {
        return dbCvJyBoB.q3BipwRCk(abGBwSu8x.q3BipwRCk("FontWeight(weight="), this.CBQ5d1kRq, ')');
    }
}
