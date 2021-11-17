package con;
/* loaded from: classes.dex */
public final class lbpNajNmL extends jOCYbBWA4 {
    public float J4Ux7ym32;
    public float dIocxURUo;
    public float q3BipwRCk;
    public float tGV7Q6urW;

    public lbpNajNmL(float f, float f2, float f3, float f4) {
        super(null);
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
    }

    @Override // con.jOCYbBWA4
    public int J4Ux7ym32() {
        return 4;
    }

    @Override // con.jOCYbBWA4
    public void dIocxURUo() {
        this.q3BipwRCk = 0.0f;
        this.J4Ux7ym32 = 0.0f;
        this.tGV7Q6urW = 0.0f;
        this.dIocxURUo = 0.0f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lbpNajNmL) {
            lbpNajNmL lbpnajnml = (lbpNajNmL) obj;
            if (lbpnajnml.q3BipwRCk == this.q3BipwRCk) {
                if (lbpnajnml.J4Ux7ym32 == this.J4Ux7ym32) {
                    if (lbpnajnml.tGV7Q6urW == this.tGV7Q6urW) {
                        if (lbpnajnml.dIocxURUo == this.dIocxURUo) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + gXNsYvZus.q3BipwRCk(this.tGV7Q6urW, gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31), 31);
    }

    @Override // con.jOCYbBWA4
    public void kCA6Zs9sL(int i, float f) {
        if (i == 0) {
            this.q3BipwRCk = f;
        } else if (i == 1) {
            this.J4Ux7ym32 = f;
        } else if (i == 2) {
            this.tGV7Q6urW = f;
        } else if (i == 3) {
            this.dIocxURUo = f;
        }
    }

    @Override // con.jOCYbBWA4
    public float q3BipwRCk(int i) {
        if (i == 0) {
            return this.q3BipwRCk;
        }
        if (i == 1) {
            return this.J4Ux7ym32;
        }
        if (i == 2) {
            return this.tGV7Q6urW;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.dIocxURUo;
    }

    @Override // con.jOCYbBWA4
    public jOCYbBWA4 tGV7Q6urW() {
        return new lbpNajNmL(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AnimationVector4D: v1 = ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", v2 = ");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", v3 = ");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", v4 = ");
        q3BipwRCk.append(this.dIocxURUo);
        return q3BipwRCk.toString();
    }
}
