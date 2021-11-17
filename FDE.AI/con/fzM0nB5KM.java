package con;
/* loaded from: classes.dex */
public final class fzM0nB5KM {
    public final long q3BipwRCk;

    public /* synthetic */ fzM0nB5KM(long j) {
        this.q3BipwRCk = j;
    }

    public static String J4Ux7ym32(long j) {
        return q3BipwRCk(j, 0) ? "Unspecified" : q3BipwRCk(j, 4294967296L) ? "Sp" : q3BipwRCk(j, 8589934592L) ? "Em" : "Invalid";
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof fzM0nB5KM) && j == ((fzM0nB5KM) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return J4Ux7ym32(this.q3BipwRCk);
    }
}
