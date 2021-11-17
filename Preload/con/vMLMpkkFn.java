package con;
/* loaded from: classes.dex */
public final class vMLMpkkFn extends jOCYbBWA4 {
    public float J4Ux7ym32;
    public float q3BipwRCk;

    public vMLMpkkFn(float f, float f2) {
        super(null);
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    @Override // con.jOCYbBWA4
    public int J4Ux7ym32() {
        return 2;
    }

    @Override // con.jOCYbBWA4
    public void dIocxURUo() {
        this.q3BipwRCk = 0.0f;
        this.J4Ux7ym32 = 0.0f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof vMLMpkkFn) {
            vMLMpkkFn vmlmpkkfn = (vMLMpkkFn) obj;
            if (vmlmpkkfn.q3BipwRCk == this.q3BipwRCk) {
                if (vmlmpkkfn.J4Ux7ym32 == this.J4Ux7ym32) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    @Override // con.jOCYbBWA4
    public void kCA6Zs9sL(int i, float f) {
        if (i == 0) {
            this.q3BipwRCk = f;
        } else if (i == 1) {
            this.J4Ux7ym32 = f;
        }
    }

    @Override // con.jOCYbBWA4
    public float q3BipwRCk(int i) {
        if (i == 0) {
            return this.q3BipwRCk;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.J4Ux7ym32;
    }

    @Override // con.jOCYbBWA4
    public jOCYbBWA4 tGV7Q6urW() {
        return new vMLMpkkFn(0.0f, 0.0f);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AnimationVector2D: v1 = ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", v2 = ");
        q3BipwRCk.append(this.J4Ux7ym32);
        return q3BipwRCk.toString();
    }
}
