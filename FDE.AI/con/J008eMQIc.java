package con;
/* loaded from: classes.dex */
public final class J008eMQIc {
    public final int q3BipwRCk;

    public /* synthetic */ J008eMQIc(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof J008eMQIc) && i == ((J008eMQIc) obj).q3BipwRCk) {
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
            return "Touch";
        }
        return q3BipwRCk(i, 2) ? "Keyboard" : "Error";
    }
}
