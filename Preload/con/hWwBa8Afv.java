package con;
/* loaded from: classes.dex */
public final class hWwBa8Afv {
    public final int q3BipwRCk;

    public /* synthetic */ hWwBa8Afv(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof hWwBa8Afv) && i == ((hWwBa8Afv) obj).q3BipwRCk) {
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
            return "Ltr";
        }
        if (q3BipwRCk(i, 2)) {
            return "Rtl";
        }
        if (q3BipwRCk(i, 3)) {
            return "Content";
        }
        if (q3BipwRCk(i, 4)) {
            return "ContentOrLtr";
        }
        return q3BipwRCk(i, 5) ? "ContentOrRtl" : "Invalid";
    }
}
