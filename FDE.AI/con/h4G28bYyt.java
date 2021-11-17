package con;
/* loaded from: classes.dex */
public final class h4G28bYyt {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public h4G28bYyt(float f, float f2) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4G28bYyt)) {
            return false;
        }
        h4G28bYyt h4g28byyt = (h4G28bYyt) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(h4g28byyt.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(h4g28byyt.J4Ux7ym32));
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FlingResult(distanceCoefficient=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", velocityCoefficient=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
