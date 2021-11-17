package con;
/* loaded from: classes.dex */
public final class YpmnfVAf4 extends xhlMoiaQ8 {
    public final boolean GPLPRo6go;
    public final float Puu3Rhg4F;
    public final float dIocxURUo;
    public final boolean iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;
    public final float yWvV4ePLl;

    public YpmnfVAf4(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof YpmnfVAf4)) {
            return false;
        }
        YpmnfVAf4 ypmnfVAf4 = (YpmnfVAf4) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(ypmnfVAf4.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(ypmnfVAf4.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(ypmnfVAf4.kCA6Zs9sL)) && this.iiGwOFFnr == ypmnfVAf4.iiGwOFFnr && this.GPLPRo6go == ypmnfVAf4.GPLPRo6go && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.Puu3Rhg4F), Float.valueOf(ypmnfVAf4.Puu3Rhg4F)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.yWvV4ePLl), Float.valueOf(ypmnfVAf4.yWvV4ePLl));
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
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeArcTo(horizontalEllipseRadius=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", verticalEllipseRadius=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", theta=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", isMoreThanHalf=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", isPositiveArc=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", arcStartDx=");
        q3BipwRCk.append(this.Puu3Rhg4F);
        q3BipwRCk.append(", arcStartDy=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.yWvV4ePLl, ')');
    }
}
