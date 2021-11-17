package con;
/* loaded from: classes.dex */
public final class gsUpNChDr {
    public final B82vleiqp J4Ux7ym32;
    public final float q3BipwRCk;

    public gsUpNChDr(float f, B82vleiqp b82vleiqp) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = b82vleiqp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsUpNChDr)) {
            return false;
        }
        gsUpNChDr gsupnchdr = (gsUpNChDr) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(gsupnchdr.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, gsupnchdr.J4Ux7ym32);
    }

    public int hashCode() {
        return this.J4Ux7ym32.hashCode() + (Float.hashCode(this.q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Fade(alpha=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", animationSpec=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
