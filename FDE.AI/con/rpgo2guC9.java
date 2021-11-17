package con;
/* loaded from: classes.dex */
public final class rpgo2guC9 {
    public BFRsKhrQv J4Ux7ym32;
    public long dIocxURUo;
    public AU29aHa4X q3BipwRCk;
    public SI0VpKubr tGV7Q6urW;

    public rpgo2guC9(AU29aHa4X aU29aHa4X, BFRsKhrQv bFRsKhrQv, SI0VpKubr sI0VpKubr, long j, int i) {
        jRmR17KQf jrmr17kqf = null;
        AU29aHa4X aU29aHa4X2 = (i & 1) != 0 ? JAmDSZMgM.q3BipwRCk : null;
        BFRsKhrQv bFRsKhrQv2 = (i & 2) != 0 ? BFRsKhrQv.Ltr : null;
        jrmr17kqf = (i & 4) != 0 ? new jRmR17KQf() : jrmr17kqf;
        if ((i & 8) != 0) {
            ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
            j = tbzY8QG6X.tGV7Q6urW;
        }
        this.q3BipwRCk = aU29aHa4X2;
        this.J4Ux7ym32 = bFRsKhrQv2;
        this.tGV7Q6urW = jrmr17kqf;
        this.dIocxURUo = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpgo2guC9)) {
            return false;
        }
        rpgo2guC9 rpgo2guc9 = (rpgo2guC9) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, rpgo2guc9.q3BipwRCk) && this.J4Ux7ym32 == rpgo2guc9.J4Ux7ym32 && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, rpgo2guc9.tGV7Q6urW) && tbzY8QG6X.J4Ux7ym32(this.dIocxURUo, rpgo2guc9.dIocxURUo);
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        int hashCode2 = this.tGV7Q6urW.hashCode();
        long j = this.dIocxURUo;
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
        return ((hashCode2 + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31)) * 31) + Long.hashCode(j);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DrawParams(density=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", layoutDirection=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", canvas=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", size=");
        q3BipwRCk.append((Object) tbzY8QG6X.iiGwOFFnr(this.dIocxURUo));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
