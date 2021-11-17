package con;
/* loaded from: classes.dex */
public final class Y6so0y3he extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public Y6so0y3he(float f, float f2) {
        super(false, true, 1);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y6so0y3he)) {
            return false;
        }
        Y6so0y3he y6so0y3he = (Y6so0y3he) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(y6so0y3he.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(y6so0y3he.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + (Float.hashCode(this.tGV7Q6urW) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeReflectiveQuadTo(dx=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", dy=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
