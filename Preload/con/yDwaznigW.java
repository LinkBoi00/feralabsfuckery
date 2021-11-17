package con;
/* loaded from: classes.dex */
public abstract class yDwaznigW {
    public static final JhpbRXxsg q3BipwRCk = new JhpbRXxsg(0);
    public static final long J4Ux7ym32 = ODug2UCW1.J4Ux7ym32(0.0f, 0.0f, 2);

    public static final float J4Ux7ym32(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String dIocxURUo(long j) {
        float f;
        StringBuilder sb;
        if (J4Ux7ym32(j) == tGV7Q6urW(j)) {
            sb = abGBwSu8x.q3BipwRCk("CornerRadius.circular(");
            f = J4Ux7ym32(j);
        } else {
            sb = abGBwSu8x.q3BipwRCk("CornerRadius.elliptical(");
            sb.append(xpuSUT7Gh.IG30YE5GU(J4Ux7ym32(j), 1));
            sb.append(", ");
            f = tGV7Q6urW(j);
        }
        sb.append(xpuSUT7Gh.IG30YE5GU(f, 1));
        sb.append(')');
        return sb.toString();
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }

    public static final float tGV7Q6urW(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
