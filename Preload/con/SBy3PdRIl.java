package con;
/* loaded from: classes.dex */
public final class SBy3PdRIl {
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 10);
    public final int q3BipwRCk;

    public /* synthetic */ SBy3PdRIl(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof SBy3PdRIl) && i == ((SBy3PdRIl) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        int i = this.q3BipwRCk;
        if (q3BipwRCk(i, 1)) {
            return "Next";
        }
        if (q3BipwRCk(i, 2)) {
            return "Previous";
        }
        if (q3BipwRCk(i, 3)) {
            return "Left";
        }
        if (q3BipwRCk(i, 4)) {
            return "Right";
        }
        if (q3BipwRCk(i, 5)) {
            return "Up";
        }
        if (q3BipwRCk(i, 6)) {
            return "Down";
        }
        if (q3BipwRCk(i, 7)) {
            return "In";
        }
        return q3BipwRCk(i, 8) ? "Out" : "Invalid FocusDirection";
    }
}
