package con;
/* loaded from: classes.dex */
public final class qDffvYFss {
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 29);
    public final int q3BipwRCk;

    public /* synthetic */ qDffvYFss(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof qDffvYFss) && i == ((qDffvYFss) obj).q3BipwRCk) {
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
            return "Button";
        }
        if (q3BipwRCk(i, 1)) {
            return "Checkbox";
        }
        if (q3BipwRCk(i, 2)) {
            return "Switch";
        }
        if (q3BipwRCk(i, 3)) {
            return "RadioButton";
        }
        if (q3BipwRCk(i, 4)) {
            return "Tab";
        }
        return q3BipwRCk(i, 5) ? "Image" : "Unknown";
    }
}
