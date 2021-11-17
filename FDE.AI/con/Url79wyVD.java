package con;
/* loaded from: classes.dex */
public final class Url79wyVD {
    public final long J4Ux7ym32;
    public final long q3BipwRCk;
    public static final uEb6wTQlg tGV7Q6urW = new uEb6wTQlg(0);
    public static final Url79wyVD dIocxURUo = new Url79wyVD(0, 0, 3);

    public /* synthetic */ Url79wyVD(long j, long j2, int i) {
        this((i & 1) != 0 ? BBVaGLNaU.sk5s77z6Q(0) : j, (i & 2) != 0 ? BBVaGLNaU.sk5s77z6Q(0) : j2, (dnBSj5uJN) null);
    }

    public Url79wyVD(long j, long j2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Url79wyVD)) {
            return false;
        }
        Url79wyVD url79wyVD = (Url79wyVD) obj;
        return QnjhYJNrZ.q3BipwRCk(this.q3BipwRCk, url79wyVD.q3BipwRCk) && QnjhYJNrZ.q3BipwRCk(this.J4Ux7ym32, url79wyVD.J4Ux7ym32);
    }

    public int hashCode() {
        long j = this.q3BipwRCk;
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        return (Long.hashCode(j) * 31) + Long.hashCode(this.J4Ux7ym32);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextIndent(firstLine=");
        q3BipwRCk.append((Object) QnjhYJNrZ.dIocxURUo(this.q3BipwRCk));
        q3BipwRCk.append(", restLine=");
        q3BipwRCk.append((Object) QnjhYJNrZ.dIocxURUo(this.J4Ux7ym32));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
