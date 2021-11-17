package con;
/* loaded from: classes.dex */
public final class iPoCEXeoL {
    public float J4Ux7ym32;
    public float dIocxURUo;
    public float q3BipwRCk;
    public float tGV7Q6urW;

    public iPoCEXeoL(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
    }

    public final boolean J4Ux7ym32() {
        return this.q3BipwRCk >= this.tGV7Q6urW || this.J4Ux7ym32 >= this.dIocxURUo;
    }

    public final void q3BipwRCk(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = Math.max(f, this.q3BipwRCk);
        this.J4Ux7ym32 = Math.max(f2, this.J4Ux7ym32);
        this.tGV7Q6urW = Math.min(f3, this.tGV7Q6urW);
        this.dIocxURUo = Math.min(f4, this.dIocxURUo);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("MutableRect(");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(this.q3BipwRCk, 1));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(this.J4Ux7ym32, 1));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(this.tGV7Q6urW, 1));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(this.dIocxURUo, 1));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
