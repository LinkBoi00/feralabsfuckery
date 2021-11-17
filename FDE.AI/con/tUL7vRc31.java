package con;
/* loaded from: classes.dex */
public final class tUL7vRc31 extends qfB4n80je {
    public final Throwable q3BipwRCk;

    public tUL7vRc31(Throwable th) {
        this.q3BipwRCk = th;
    }

    public boolean equals(Object obj) {
        return (obj instanceof tUL7vRc31) && anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, ((tUL7vRc31) obj).q3BipwRCk);
    }

    public int hashCode() {
        Throwable th = this.q3BipwRCk;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // con.qfB4n80je
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Closed(");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
