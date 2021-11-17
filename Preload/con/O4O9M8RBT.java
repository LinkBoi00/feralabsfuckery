package con;
/* loaded from: classes.dex */
public final class O4O9M8RBT {
    public final int q3BipwRCk;

    public /* synthetic */ O4O9M8RBT(int i) {
        this.q3BipwRCk = i;
    }

    public static String J4Ux7ym32(int i) {
        return q3BipwRCk(i, 0) ? "Miter" : q3BipwRCk(i, 1) ? "Round" : q3BipwRCk(i, 2) ? "Bevel" : "Unknown";
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof O4O9M8RBT) && i == ((O4O9M8RBT) obj).q3BipwRCk) {
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
