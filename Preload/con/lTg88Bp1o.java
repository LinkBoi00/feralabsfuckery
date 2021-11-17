package con;
/* loaded from: classes.dex */
public final class lTg88Bp1o {
    public final PmanMZxiM J4Ux7ym32;
    public final boolean dIocxURUo;
    public final B01AuRyT3 q3BipwRCk;
    public final B82vleiqp tGV7Q6urW;

    public lTg88Bp1o(B01AuRyT3 b01AuRyT3, PmanMZxiM pmanMZxiM, B82vleiqp b82vleiqp, boolean z) {
        this.q3BipwRCk = b01AuRyT3;
        this.J4Ux7ym32 = pmanMZxiM;
        this.tGV7Q6urW = b82vleiqp;
        this.dIocxURUo = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lTg88Bp1o)) {
            return false;
        }
        lTg88Bp1o ltg88bp1o = (lTg88Bp1o) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, ltg88bp1o.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, ltg88bp1o.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, ltg88bp1o.tGV7Q6urW) && this.dIocxURUo == ltg88bp1o.dIocxURUo;
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        int hashCode2 = (this.tGV7Q6urW.hashCode() + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31)) * 31;
        boolean z = this.dIocxURUo;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ChangeSize(alignment=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", size=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", animationSpec=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", clip=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
