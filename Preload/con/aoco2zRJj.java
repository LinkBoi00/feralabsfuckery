package con;
/* loaded from: classes.dex */
public final class aoco2zRJj {
    public final long J4Ux7ym32;
    public final long q3BipwRCk;

    public aoco2zRJj(long j, long j2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoco2zRJj)) {
            return false;
        }
        aoco2zRJj aoco2zrjj = (aoco2zRJj) obj;
        return bRgfgYIQX.q3BipwRCk(this.q3BipwRCk, aoco2zrjj.q3BipwRCk) && this.J4Ux7ym32 == aoco2zrjj.J4Ux7ym32;
    }

    public int hashCode() {
        long j = this.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return Long.hashCode(this.J4Ux7ym32) + (Long.hashCode(j) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PointAtTime(point=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.q3BipwRCk));
        q3BipwRCk.append(", time=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
