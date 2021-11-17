package con;
/* loaded from: classes.dex */
public final class bRgfgYIQX {
    public final long q3BipwRCk;
    public static final JhpbRXxsg J4Ux7ym32 = new JhpbRXxsg(0);
    public static final long tGV7Q6urW = ODug2UCW1.dIocxURUo(0.0f, 0.0f);
    public static final long dIocxURUo = ODug2UCW1.dIocxURUo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long kCA6Zs9sL = ODug2UCW1.dIocxURUo(Float.NaN, Float.NaN);

    public /* synthetic */ bRgfgYIQX(long j) {
        this.q3BipwRCk = j;
    }

    public static String GPLPRo6go(long j) {
        if (!(j != kCA6Zs9sL)) {
            return "Offset.Unspecified";
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Offset(");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(tGV7Q6urW(j), 1));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(dIocxURUo(j), 1));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public static final float J4Ux7ym32(long j) {
        return (float) Math.sqrt((double) ((dIocxURUo(j) * dIocxURUo(j)) + (tGV7Q6urW(j) * tGV7Q6urW(j))));
    }

    public static final float dIocxURUo(long j) {
        if (j != kCA6Zs9sL) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final long iiGwOFFnr(long j, long j2) {
        return ODug2UCW1.dIocxURUo(tGV7Q6urW(j2) + tGV7Q6urW(j), dIocxURUo(j2) + dIocxURUo(j));
    }

    public static final long kCA6Zs9sL(long j, long j2) {
        return ODug2UCW1.dIocxURUo(tGV7Q6urW(j) - tGV7Q6urW(j2), dIocxURUo(j) - dIocxURUo(j2));
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }

    public static final float tGV7Q6urW(long j) {
        if (j != kCA6Zs9sL) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof bRgfgYIQX) && j == ((bRgfgYIQX) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return GPLPRo6go(this.q3BipwRCk);
    }
}
