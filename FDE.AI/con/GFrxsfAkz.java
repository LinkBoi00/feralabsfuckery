package con;
/* loaded from: classes.dex */
public final class GFrxsfAkz extends xhlMoiaQ8 {
    public final boolean GPLPRo6go;
    public final float Puu3Rhg4F;
    public final float dIocxURUo;
    public final boolean iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;
    public final float yWvV4ePLl;

    public GFrxsfAkz(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
        this.kCA6Zs9sL = f3;
        this.iiGwOFFnr = z;
        this.GPLPRo6go = z2;
        this.Puu3Rhg4F = f4;
        this.yWvV4ePLl = f5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GFrxsfAkz)) {
            return false;
        }
        GFrxsfAkz gFrxsfAkz = (GFrxsfAkz) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(gFrxsfAkz.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(gFrxsfAkz.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(gFrxsfAkz.kCA6Zs9sL)) && this.iiGwOFFnr == gFrxsfAkz.iiGwOFFnr && this.GPLPRo6go == gFrxsfAkz.GPLPRo6go && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.Puu3Rhg4F), Float.valueOf(gFrxsfAkz.Puu3Rhg4F)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.yWvV4ePLl), Float.valueOf(gFrxsfAkz.yWvV4ePLl));
    }

    public int hashCode() {
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, Float.hashCode(this.tGV7Q6urW) * 31, 31), 31);
        boolean z = this.iiGwOFFnr;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (q3BipwRCk + i2) * 31;
        boolean z2 = this.GPLPRo6go;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return Float.hashCode(this.yWvV4ePLl) + gXNsYvZus.q3BipwRCk(this.Puu3Rhg4F, (i5 + i) * 31, 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ArcTo(horizontalEllipseRadius=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", verticalEllipseRadius=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", theta=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", isMoreThanHalf=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", isPositiveArc=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", arcStartX=");
        q3BipwRCk.append(this.Puu3Rhg4F);
        q3BipwRCk.append(", arcStartY=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.yWvV4ePLl, ')');
    }
}
