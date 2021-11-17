package con;
/* loaded from: classes.dex */
public final class Z7oCchjRS {
    public static final oWhsE8IPp J4Ux7ym32 = new oWhsE8IPp(null, 28);
    public final int q3BipwRCk;

    public /* synthetic */ Z7oCchjRS(int i) {
        this.q3BipwRCk = i;
    }

    public static String J4Ux7ym32(int i) {
        return q3BipwRCk(i, 0) ? "None" : q3BipwRCk(i, 1) ? "All" : q3BipwRCk(i, 2) ? "Weight" : q3BipwRCk(i, 3) ? "Style" : "Invalid";
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof Z7oCchjRS) && i == ((Z7oCchjRS) obj).q3BipwRCk) {
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
