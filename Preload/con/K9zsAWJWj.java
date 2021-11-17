package con;
/* loaded from: classes.dex */
public final class K9zsAWJWj extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public K9zsAWJWj(float f, float f2) {
        super(false, false, 3);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K9zsAWJWj)) {
            return false;
        }
        K9zsAWJWj k9zsAWJWj = (K9zsAWJWj) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(k9zsAWJWj.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(k9zsAWJWj.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + (Float.hashCode(this.tGV7Q6urW) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeLineTo(dx=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", dy=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
