package con;
/* loaded from: classes.dex */
public final class exvFNe8oO {
    public final int q3BipwRCk;

    public /* synthetic */ exvFNe8oO(int i) {
        this.q3BipwRCk = i;
    }

    public static String J4Ux7ym32(int i) {
        return q3BipwRCk(i, 0) ? "None" : q3BipwRCk(i, 1) ? "Default" : q3BipwRCk(i, 2) ? "Go" : q3BipwRCk(i, 3) ? "Search" : q3BipwRCk(i, 4) ? "Send" : q3BipwRCk(i, 5) ? "Previous" : q3BipwRCk(i, 6) ? "Next" : q3BipwRCk(i, 7) ? "Done" : "Invalid";
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof exvFNe8oO) && i == ((exvFNe8oO) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return J4Ux7ym32(this.q3BipwRCk);
    }
}
