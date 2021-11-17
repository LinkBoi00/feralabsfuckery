package con;
/* loaded from: classes.dex */
public final class vZSd4byf0 {
    public final int q3BipwRCk;

    public /* synthetic */ vZSd4byf0(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof vZSd4byf0) && i == ((vZSd4byf0) obj).q3BipwRCk) {
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
            return "Left";
        }
        if (q3BipwRCk(i, 2)) {
            return "Right";
        }
        if (q3BipwRCk(i, 3)) {
            return "Center";
        }
        if (q3BipwRCk(i, 4)) {
            return "Justify";
        }
        if (q3BipwRCk(i, 5)) {
            return "Start";
        }
        return q3BipwRCk(i, 6) ? "End" : "Invalid";
    }
}
