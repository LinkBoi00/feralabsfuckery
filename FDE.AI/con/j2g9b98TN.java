package con;
/* loaded from: classes.dex */
public final class j2g9b98TN extends xhlMoiaQ8 {
    public final float GPLPRo6go;
    public final float Puu3Rhg4F;
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;

    public j2g9b98TN(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
        this.kCA6Zs9sL = f3;
        this.iiGwOFFnr = f4;
        this.GPLPRo6go = f5;
        this.Puu3Rhg4F = f6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2g9b98TN)) {
            return false;
        }
        j2g9b98TN j2g9b98tn = (j2g9b98TN) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(j2g9b98tn.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(j2g9b98tn.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(j2g9b98tn.kCA6Zs9sL)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.iiGwOFFnr), Float.valueOf(j2g9b98tn.iiGwOFFnr)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.GPLPRo6go), Float.valueOf(j2g9b98tn.GPLPRo6go)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.Puu3Rhg4F), Float.valueOf(j2g9b98tn.Puu3Rhg4F));
    }

    public int hashCode() {
        return Float.hashCode(this.Puu3Rhg4F) + gXNsYvZus.q3BipwRCk(this.GPLPRo6go, gXNsYvZus.q3BipwRCk(this.iiGwOFFnr, gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, Float.hashCode(this.tGV7Q6urW) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CurveTo(x1=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", y1=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", x2=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", y2=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", x3=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", y3=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.Puu3Rhg4F, ')');
    }
}
