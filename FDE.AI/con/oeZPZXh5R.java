package con;
/* loaded from: classes.dex */
public final class oeZPZXh5R {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public oeZPZXh5R(float f, float f2) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeZPZXh5R)) {
            return false;
        }
        oeZPZXh5R oezpzxh5r = (oeZPZXh5R) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(oezpzxh5r.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(oezpzxh5r.J4Ux7ym32));
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    public final float[] q3BipwRCk() {
        float f = this.q3BipwRCk;
        float f2 = this.J4Ux7ym32;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("WhitePoint(x=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", y=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
