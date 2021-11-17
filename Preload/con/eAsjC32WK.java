package con;
/* loaded from: classes.dex */
public abstract class eAsjC32WK {
    public static final long J4Ux7ym32;
    public static final long dIocxURUo;
    public static final long kCA6Zs9sL;
    public static final JhpbRXxsg q3BipwRCk = new JhpbRXxsg(0);
    public static final long tGV7Q6urW;

    static {
        long j = (long) 3;
        long j2 = j << 32;
        J4Ux7ym32 = (((long) 0) & 4294967295L) | j2;
        tGV7Q6urW = (((long) 1) & 4294967295L) | j2;
        dIocxURUo = j2 | (((long) 2) & 4294967295L);
        kCA6Zs9sL = (((long) 4) << 32) | (j & 4294967295L);
    }

    public static String J4Ux7ym32(long j) {
        return q3BipwRCk(j, J4Ux7ym32) ? "Rgb" : q3BipwRCk(j, tGV7Q6urW) ? "Xyz" : q3BipwRCk(j, dIocxURUo) ? "Lab" : q3BipwRCk(j, kCA6Zs9sL) ? "Cmyk" : "Unknown";
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }
}
