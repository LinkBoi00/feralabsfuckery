package con;
/* loaded from: classes.dex */
public final class JI2JIz7iN {
    public final int q3BipwRCk;

    public /* synthetic */ JI2JIz7iN(int i) {
        this.q3BipwRCk = i;
    }

    public static String J4Ux7ym32(int i) {
        return q3BipwRCk(i, 0) ? "Normal" : q3BipwRCk(i, 1) ? "Italic" : "Invalid";
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof JI2JIz7iN) && i == ((JI2JIz7iN) obj).q3BipwRCk) {
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
