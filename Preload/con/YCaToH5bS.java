package con;
/* loaded from: classes.dex */
public final class YCaToH5bS {
    public long J4Ux7ym32;
    public final IxbokG044 q3BipwRCk;

    public YCaToH5bS(IxbokG044 ixbokG044, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = ixbokG044;
        this.J4Ux7ym32 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YCaToH5bS)) {
            return false;
        }
        YCaToH5bS yCaToH5bS = (YCaToH5bS) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, yCaToH5bS.q3BipwRCk) && YWiUMZOtw.q3BipwRCk(this.J4Ux7ym32, yCaToH5bS.J4Ux7ym32);
    }

    public int hashCode() {
        return (this.q3BipwRCk.hashCode() * 31) + Long.hashCode(this.J4Ux7ym32);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AnimData(anim=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", startSize=");
        q3BipwRCk.append((Object) YWiUMZOtw.dIocxURUo(this.J4Ux7ym32));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
