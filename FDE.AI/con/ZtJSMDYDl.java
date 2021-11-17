package con;
/* loaded from: classes.dex */
public final class ZtJSMDYDl {
    public static final joOFKdxvJ J4Ux7ym32 = new joOFKdxvJ(0);
    public static final long tGV7Q6urW = dnBSj5uJN.tGV7Q6urW(0, 0);
    public final long q3BipwRCk;

    public /* synthetic */ ZtJSMDYDl(long j) {
        this.q3BipwRCk = j;
    }

    public static final int J4Ux7ym32(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int q3BipwRCk(long j) {
        return (int) (j >> 32);
    }

    public static String tGV7Q6urW(long j) {
        return '(' + q3BipwRCk(j) + ", " + J4Ux7ym32(j) + ')';
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof ZtJSMDYDl) && j == ((ZtJSMDYDl) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return tGV7Q6urW(this.q3BipwRCk);
    }
}
