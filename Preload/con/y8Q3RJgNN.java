package con;
/* loaded from: classes.dex */
public abstract class y8Q3RJgNN {
    public static final long J4Ux7ym32;
    public static final Q4TFMtvSV q3BipwRCk = new Q4TFMtvSV(0);
    public static final long tGV7Q6urW = D3DEikrvb.tGV7Q6urW(Float.NaN, Float.NaN);

    static {
        float f = (float) 0;
        J4Ux7ym32 = D3DEikrvb.tGV7Q6urW(f, f);
    }

    public static final float J4Ux7ym32(long j) {
        if (j != tGV7Q6urW) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float q3BipwRCk(long j) {
        if (j != tGV7Q6urW) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
}
