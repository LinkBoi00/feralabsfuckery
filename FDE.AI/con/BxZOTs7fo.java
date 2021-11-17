package con;
/* loaded from: classes.dex */
public final class BxZOTs7fo extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float tGV7Q6urW;

    public BxZOTs7fo(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
        this.kCA6Zs9sL = f3;
        this.iiGwOFFnr = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BxZOTs7fo)) {
            return false;
        }
        BxZOTs7fo bxZOTs7fo = (BxZOTs7fo) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(bxZOTs7fo.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(bxZOTs7fo.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.kCA6Zs9sL), Float.valueOf(bxZOTs7fo.kCA6Zs9sL)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.iiGwOFFnr), Float.valueOf(bxZOTs7fo.iiGwOFFnr));
    }

    public int hashCode() {
        return Float.hashCode(this.iiGwOFFnr) + gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, Float.hashCode(this.tGV7Q6urW) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeReflectiveCurveTo(dx1=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", dy1=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", dx2=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", dy2=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.iiGwOFFnr, ')');
    }
}
