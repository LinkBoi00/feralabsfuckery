package con;
/* loaded from: classes.dex */
public final class MN7MTroUy implements lOtvezK70 {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public MN7MTroUy(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f3;
    }

    public final float J4Ux7ym32(float f, float f2, float f3) {
        float f4 = (float) 3;
        float f5 = ((float) 1) - f3;
        return (f3 * f3 * f3) + (f4 * f2 * f5 * f3 * f3) + (f * f4 * f5 * f5 * f3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MN7MTroUy) {
            MN7MTroUy mN7MTroUy = (MN7MTroUy) obj;
            if (this.q3BipwRCk == mN7MTroUy.q3BipwRCk) {
                if (this.J4Ux7ym32 == mN7MTroUy.J4Ux7ym32) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(1.0f) + gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, gXNsYvZus.q3BipwRCk(0.0f, Float.hashCode(this.q3BipwRCk) * 31, 31), 31);
    }

    @Override // con.lOtvezK70
    public float q3BipwRCk(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        while (true) {
            float f4 = (f2 + f3) / ((float) 2);
            float J4Ux7ym32 = J4Ux7ym32(this.q3BipwRCk, this.J4Ux7ym32, f4);
            if (Math.abs(f - J4Ux7ym32) < 0.001f) {
                return J4Ux7ym32(0.0f, 1.0f, f4);
            }
            if (J4Ux7ym32 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }
}
