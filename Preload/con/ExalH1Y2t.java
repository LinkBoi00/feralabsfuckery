package con;
/* loaded from: classes.dex */
public final class ExalH1Y2t {
    public static final oWhsE8IPp J4Ux7ym32 = new oWhsE8IPp(null, 25);
    public final int q3BipwRCk;

    public /* synthetic */ ExalH1Y2t(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof ExalH1Y2t) && i == ((ExalH1Y2t) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        int i = this.q3BipwRCk;
        if (q3BipwRCk(i, 0)) {
            return "Polite";
        }
        return q3BipwRCk(i, 1) ? "Assertive" : "Unknown";
    }
}
