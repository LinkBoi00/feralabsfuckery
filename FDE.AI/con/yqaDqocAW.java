package con;
/* loaded from: classes.dex */
public final class yqaDqocAW {
    public static final JhpbRXxsg J4Ux7ym32 = new JhpbRXxsg(0);
    public static final long tGV7Q6urW = iOdo7IZgc.q3BipwRCk(0.0f, 0.0f);
    public final long q3BipwRCk;

    public /* synthetic */ yqaDqocAW(long j) {
        this.q3BipwRCk = j;
    }

    public static final float J4Ux7ym32(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long dIocxURUo(long j, long j2) {
        return iOdo7IZgc.q3BipwRCk(J4Ux7ym32(j) - J4Ux7ym32(j2), tGV7Q6urW(j) - tGV7Q6urW(j2));
    }

    public static final long kCA6Zs9sL(long j, long j2) {
        return iOdo7IZgc.q3BipwRCk(J4Ux7ym32(j2) + J4Ux7ym32(j), tGV7Q6urW(j2) + tGV7Q6urW(j));
    }

    public static long q3BipwRCk(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = J4Ux7ym32(j);
        }
        if ((i & 2) != 0) {
            f2 = tGV7Q6urW(j);
        }
        return iOdo7IZgc.q3BipwRCk(f, f2);
    }

    public static final float tGV7Q6urW(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof yqaDqocAW) && j == ((yqaDqocAW) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        long j = this.q3BipwRCk;
        return '(' + J4Ux7ym32(j) + ", " + tGV7Q6urW(j) + ") px/sec";
    }
}
