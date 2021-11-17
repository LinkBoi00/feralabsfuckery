package con;
/* loaded from: classes.dex */
public final class WLosHMQ8L {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public WLosHMQ8L(float f, float f2) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
    }

    public Comparable J4Ux7ym32() {
        return Float.valueOf(this.q3BipwRCk);
    }

    public boolean dIocxURUo(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof WLosHMQ8L) {
            if (!tGV7Q6urW() || !((WLosHMQ8L) obj).tGV7Q6urW()) {
                WLosHMQ8L wLosHMQ8L = (WLosHMQ8L) obj;
                if (!(this.q3BipwRCk == wLosHMQ8L.q3BipwRCk && this.J4Ux7ym32 == wLosHMQ8L.J4Ux7ym32)) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (tGV7Q6urW()) {
            return -1;
        }
        return (Float.valueOf(this.q3BipwRCk).hashCode() * 31) + Float.valueOf(this.J4Ux7ym32).hashCode();
    }

    public Comparable q3BipwRCk() {
        return Float.valueOf(this.J4Ux7ym32);
    }

    public boolean tGV7Q6urW() {
        return this.q3BipwRCk > this.J4Ux7ym32;
    }

    public String toString() {
        return this.q3BipwRCk + ".." + this.J4Ux7ym32;
    }
}
