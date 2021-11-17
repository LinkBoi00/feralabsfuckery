package con;
/* loaded from: classes.dex */
public final class iPxyBBmfH {
    public boolean J4Ux7ym32;
    public float q3BipwRCk;
    public pennnCA24 tGV7Q6urW;

    public iPxyBBmfH(float f, boolean z, pennnCA24 pennnca24, int i) {
        f = (i & 1) != 0 ? 0.0f : f;
        z = (i & 2) != 0 ? true : z;
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = z;
        this.tGV7Q6urW = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iPxyBBmfH)) {
            return false;
        }
        iPxyBBmfH ipxybbmfh = (iPxyBBmfH) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(ipxybbmfh.q3BipwRCk)) && this.J4Ux7ym32 == ipxybbmfh.J4Ux7ym32 && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, ipxybbmfh.tGV7Q6urW);
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.q3BipwRCk) * 31;
        boolean z = this.J4Ux7ym32;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode + i) * 31;
        pennnCA24 pennnca24 = this.tGV7Q6urW;
        return i4 + (pennnca24 == null ? 0 : pennnca24.hashCode());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RowColumnParentData(weight=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", fill=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", crossAxisAlignment=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
