package con;
/* loaded from: classes.dex */
public final class wA9iW3D4I extends jOCYbBWA4 {
    public float q3BipwRCk;

    public wA9iW3D4I(float f) {
        super(null);
        this.q3BipwRCk = f;
    }

    @Override // con.jOCYbBWA4
    public int J4Ux7ym32() {
        return 1;
    }

    @Override // con.jOCYbBWA4
    public void dIocxURUo() {
        this.q3BipwRCk = 0.0f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wA9iW3D4I) {
            if (((wA9iW3D4I) obj).q3BipwRCk == this.q3BipwRCk) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.q3BipwRCk);
    }

    @Override // con.jOCYbBWA4
    public void kCA6Zs9sL(int i, float f) {
        if (i == 0) {
            this.q3BipwRCk = f;
        }
    }

    @Override // con.jOCYbBWA4
    public float q3BipwRCk(int i) {
        if (i == 0) {
            return this.q3BipwRCk;
        }
        return 0.0f;
    }

    @Override // con.jOCYbBWA4
    public jOCYbBWA4 tGV7Q6urW() {
        return new wA9iW3D4I(0.0f);
    }

    public String toString() {
        return anXlDk6fV.iMyQMM6Qj("AnimationVector1D: value = ", Float.valueOf(this.q3BipwRCk));
    }
}
