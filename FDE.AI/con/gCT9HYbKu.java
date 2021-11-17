package con;
/* loaded from: classes.dex */
public final class gCT9HYbKu {
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 5);
    public final int q3BipwRCk;

    public /* synthetic */ gCT9HYbKu(int i) {
        this.q3BipwRCk = i;
    }

    public boolean equals(Object obj) {
        int i = this.q3BipwRCk;
        if ((obj instanceof gCT9HYbKu) && i == ((gCT9HYbKu) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return this.q3BipwRCk == 0 ? "FabPosition.Center" : "FabPosition.End";
    }
}
