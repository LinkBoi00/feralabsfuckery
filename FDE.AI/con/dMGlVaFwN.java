package con;
/* loaded from: classes.dex */
public final class dMGlVaFwN {
    public static final dMGlVaFwN tGV7Q6urW = new dMGlVaFwN(1.0f, 0.0f);
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public dMGlVaFwN(float f, float f2) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dMGlVaFwN)) {
            return false;
        }
        dMGlVaFwN dmglvafwn = (dMGlVaFwN) obj;
        if (!(this.q3BipwRCk == dmglvafwn.q3BipwRCk)) {
            return false;
        }
        return (this.J4Ux7ym32 > dmglvafwn.J4Ux7ym32 ? 1 : (this.J4Ux7ym32 == dmglvafwn.J4Ux7ym32 ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextGeometricTransform(scaleX=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", skewX=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
