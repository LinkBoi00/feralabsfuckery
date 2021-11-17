package con;
/* loaded from: classes.dex */
public final class tbzY8QG6X {
    public final long q3BipwRCk;
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 12);
    public static final long tGV7Q6urW = gThLCaTO1.J4Ux7ym32(0.0f, 0.0f);
    public static final long dIocxURUo = gThLCaTO1.J4Ux7ym32(Float.NaN, Float.NaN);

    public /* synthetic */ tbzY8QG6X(long j) {
        this.q3BipwRCk = j;
    }

    public static final boolean J4Ux7ym32(long j, long j2) {
        return j == j2;
    }

    public static final float dIocxURUo(long j) {
        return Math.min(Math.abs(kCA6Zs9sL(j)), Math.abs(tGV7Q6urW(j)));
    }

    public static String iiGwOFFnr(long j) {
        if (!(j != dIocxURUo)) {
            return "Size.Unspecified";
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Size(");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(kCA6Zs9sL(j), 1));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(xpuSUT7Gh.IG30YE5GU(tGV7Q6urW(j), 1));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public static final float kCA6Zs9sL(long j) {
        if (j != dIocxURUo) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static boolean q3BipwRCk(long j, Object obj) {
        return (obj instanceof tbzY8QG6X) && j == ((tbzY8QG6X) obj).q3BipwRCk;
    }

    public static final float tGV7Q6urW(long j) {
        if (j != dIocxURUo) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public boolean equals(Object obj) {
        return q3BipwRCk(this.q3BipwRCk, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return iiGwOFFnr(this.q3BipwRCk);
    }
}
