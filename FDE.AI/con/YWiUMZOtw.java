package con;
/* loaded from: classes.dex */
public final class YWiUMZOtw {
    public final long q3BipwRCk;

    public /* synthetic */ YWiUMZOtw(long j) {
        this.q3BipwRCk = j;
    }

    public static final int J4Ux7ym32(long j) {
        return (int) (j & 4294967295L);
    }

    public static String dIocxURUo(long j) {
        return tGV7Q6urW(j) + " x " + J4Ux7ym32(j);
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }

    public static final int tGV7Q6urW(long j) {
        return (int) (j >> 32);
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof YWiUMZOtw) && j == ((YWiUMZOtw) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return dIocxURUo(this.q3BipwRCk);
    }
}
