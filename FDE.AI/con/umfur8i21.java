package con;
/* loaded from: classes.dex */
public final class umfur8i21 {
    public float J4Ux7ym32;
    public float q3BipwRCk;

    public umfur8i21(float f, float f2, int i) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 2) != 0 ? 0.0f : f2;
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umfur8i21)) {
            return false;
        }
        umfur8i21 umfur8i21 = (umfur8i21) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(umfur8i21.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(umfur8i21.J4Ux7ym32));
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    public final void q3BipwRCk() {
        this.q3BipwRCk = 0.0f;
        this.J4Ux7ym32 = 0.0f;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PathPoint(x=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", y=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
