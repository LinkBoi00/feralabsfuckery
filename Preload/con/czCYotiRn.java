package con;
/* loaded from: classes.dex */
public final class czCYotiRn {
    public static final JhpbRXxsg J4Ux7ym32 = new JhpbRXxsg(0);
    public static final long tGV7Q6urW = ODug2UCW1.iiGwOFFnr(0, 0);
    public final long q3BipwRCk;

    public /* synthetic */ czCYotiRn(long j) {
        this.q3BipwRCk = j;
    }

    public static final int GPLPRo6go(long j) {
        return yWvV4ePLl(j) > dIocxURUo(j) ? dIocxURUo(j) : yWvV4ePLl(j);
    }

    public static final boolean J4Ux7ym32(long j, long j2) {
        return j == j2;
    }

    public static final boolean Puu3Rhg4F(long j) {
        return yWvV4ePLl(j) > dIocxURUo(j);
    }

    public static final int dIocxURUo(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int iiGwOFFnr(long j) {
        return yWvV4ePLl(j) > dIocxURUo(j) ? yWvV4ePLl(j) : dIocxURUo(j);
    }

    public static final int kCA6Zs9sL(long j) {
        return iiGwOFFnr(j) - GPLPRo6go(j);
    }

    public static String oon79WMrY(long j) {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextRange(");
        q3BipwRCk.append(yWvV4ePLl(j));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(dIocxURUo(j));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return GPLPRo6go(j) <= GPLPRo6go(j2) && iiGwOFFnr(j2) <= iiGwOFFnr(j);
    }

    public static final boolean tGV7Q6urW(long j) {
        return yWvV4ePLl(j) == dIocxURUo(j);
    }

    public static final int yWvV4ePLl(long j) {
        return (int) (j >> 32);
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof czCYotiRn) && j == ((czCYotiRn) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return oon79WMrY(this.q3BipwRCk);
    }
}
