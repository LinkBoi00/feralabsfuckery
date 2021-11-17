package con;
/* loaded from: classes.dex */
public final class BM5bZVvAe {
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 14);
    public final int q3BipwRCk;

    public /* synthetic */ BM5bZVvAe(int i) {
        this.q3BipwRCk = i;
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof BM5bZVvAe) && i == ((BM5bZVvAe) obj).q3BipwRCk) {
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
            return "NonZero";
        }
        return q3BipwRCk(i, 1) ? "EvenOdd" : "Unknown";
    }
}
