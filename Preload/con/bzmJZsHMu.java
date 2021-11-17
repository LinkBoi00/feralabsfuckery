package con;
/* loaded from: classes.dex */
public final class bzmJZsHMu {
    public final float J4Ux7ym32;
    public final float dIocxURUo;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;
    public static final ksLrMHgEz kCA6Zs9sL = new ksLrMHgEz(null, 11);
    public static final bzmJZsHMu iiGwOFFnr = new bzmJZsHMu(0.0f, 0.0f, 0.0f, 0.0f);

    public bzmJZsHMu(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
    }

    public final bzmJZsHMu GPLPRo6go(long j) {
        return new bzmJZsHMu(bRgfgYIQX.tGV7Q6urW(j) + this.q3BipwRCk, bRgfgYIQX.dIocxURUo(j) + this.J4Ux7ym32, bRgfgYIQX.tGV7Q6urW(j) + this.tGV7Q6urW, bRgfgYIQX.dIocxURUo(j) + this.dIocxURUo);
    }

    public final float J4Ux7ym32() {
        return this.dIocxURUo - this.J4Ux7ym32;
    }

    public final long dIocxURUo() {
        return ODug2UCW1.dIocxURUo(this.q3BipwRCk, this.J4Ux7ym32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzmJZsHMu)) {
            return false;
        }
        bzmJZsHMu bzmjzshmu = (bzmJZsHMu) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(bzmjzshmu.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(bzmjzshmu.J4Ux7ym32)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(bzmjzshmu.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(bzmjzshmu.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + gXNsYvZus.q3BipwRCk(this.tGV7Q6urW, gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31), 31);
    }

    public final bzmJZsHMu iiGwOFFnr(float f, float f2) {
        return new bzmJZsHMu(this.q3BipwRCk + f, this.J4Ux7ym32 + f2, this.tGV7Q6urW + f, this.dIocxURUo + f2);
    }

    public final float kCA6Zs9sL() {
        return this.tGV7Q6urW - this.q3BipwRCk;
    }

    public final long q3BipwRCk() {
        return ODug2UCW1.dIocxURUo((kCA6Zs9sL() / 2.0f) + this.q3BipwRCk, (J4Ux7ym32() / 2.0f) + this.J4Ux7ym32);
    }

    public final long tGV7Q6urW() {
        return gThLCaTO1.J4Ux7ym32(kCA6Zs9sL(), J4Ux7ym32());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Rect.fromLTRB(");
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
