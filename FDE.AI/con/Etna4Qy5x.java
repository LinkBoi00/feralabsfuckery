package con;
/* loaded from: classes.dex */
public final class Etna4Qy5x extends xhlMoiaQ8 {
    public final float GPLPRo6go;
    public final float Puu3Rhg4F;
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;

    public Etna4Qy5x(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof Etna4Qy5x)) {
            return false;
        }
        Etna4Qy5x etna4Qy5x = (Etna4Qy5x) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(etna4Qy5x.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(etna4Qy5x.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(etna4Qy5x.kCA6Zs9sL)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.iiGwOFFnr), Float.valueOf(etna4Qy5x.iiGwOFFnr)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.GPLPRo6go), Float.valueOf(etna4Qy5x.GPLPRo6go)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.Puu3Rhg4F), Float.valueOf(etna4Qy5x.Puu3Rhg4F));
    }

    public int hashCode() {
        return Float.hashCode(this.Puu3Rhg4F) + gXNsYvZus.q3BipwRCk(this.GPLPRo6go, gXNsYvZus.q3BipwRCk(this.iiGwOFFnr, gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, Float.hashCode(this.tGV7Q6urW) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeCurveTo(dx1=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", dy1=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", dx2=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", dy2=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", dx3=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", dy3=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.Puu3Rhg4F, ')');
    }
}
