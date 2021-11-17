package con;
/* loaded from: classes.dex */
public final class r5d1xUf9k {
    public static final r5d1xUf9k iiGwOFFnr;
    public static final ksLrMHgEz kCA6Zs9sL = new ksLrMHgEz(null, 22);
    public final float J4Ux7ym32;
    public final long dIocxURUo;
    public final long q3BipwRCk;
    public final long tGV7Q6urW;

    static {
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        long j = bRgfgYIQX.tGV7Q6urW;
        iiGwOFFnr = new r5d1xUf9k(j, 1.0f, 0, j, null);
    }

    public r5d1xUf9k(long j, float f, long j2, long j3, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = j2;
        this.dIocxURUo = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5d1xUf9k)) {
            return false;
        }
        r5d1xUf9k r5d1xuf9k = (r5d1xUf9k) obj;
        return bRgfgYIQX.q3BipwRCk(this.q3BipwRCk, r5d1xuf9k.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(r5d1xuf9k.J4Ux7ym32)) && this.tGV7Q6urW == r5d1xuf9k.tGV7Q6urW && bRgfgYIQX.q3BipwRCk(this.dIocxURUo, r5d1xuf9k.dIocxURUo);
    }

    public int hashCode() {
        long j = this.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Long.hashCode(j) * 31, 31);
        return Long.hashCode(this.dIocxURUo) + ((Long.hashCode(this.tGV7Q6urW) + q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("VelocityEstimate(pixelsPerSecond=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.q3BipwRCk));
        q3BipwRCk.append(", confidence=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", durationMillis=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", offset=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.dIocxURUo));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
