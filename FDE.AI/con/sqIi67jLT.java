package con;
/* loaded from: classes.dex */
public final class sqIi67jLT {
    public static final float[] J4Ux7ym32;
    public static final sqIi67jLT q3BipwRCk = new sqIi67jLT();

    static {
        float q3BipwRCk2;
        float f;
        float f2;
        float f3;
        float f4;
        float q3BipwRCk3;
        float f5;
        float f6;
        float f7;
        float[] fArr = new float[101];
        J4Ux7ym32 = fArr;
        float[] fArr2 = new float[101];
        float f8 = 0.0f;
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            int i2 = i + 1;
            float f10 = ((float) i) / ((float) 100);
            float f11 = 1.0f;
            float f12 = 1.0f;
            while (true) {
                q3BipwRCk2 = ML8zUvnYf.q3BipwRCk(f11, f8, 2.0f, f8);
                f = 3.0f;
                f2 = f12 - q3BipwRCk2;
                f3 = q3BipwRCk2 * 3.0f * f2;
                f4 = q3BipwRCk2 * q3BipwRCk2 * q3BipwRCk2;
                float f13 = (((q3BipwRCk2 * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                if (((double) Math.abs(f13 - f10)) < 1.0E-5d) {
                    break;
                }
                f12 = 1.0f;
                if (f13 > f10) {
                    f11 = q3BipwRCk2;
                } else {
                    f8 = q3BipwRCk2;
                }
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + q3BipwRCk2) * f3) + f4;
            float f15 = 1.0f;
            float f16 = 2.0f;
            while (true) {
                q3BipwRCk3 = ML8zUvnYf.q3BipwRCk(f15, f9, f16, f9);
                f5 = 1.0f - q3BipwRCk3;
                f6 = f * q3BipwRCk3 * f5;
                f7 = q3BipwRCk3 * q3BipwRCk3 * q3BipwRCk3;
                float f17 = (((f14 * f5) + q3BipwRCk3) * f6) + f7;
                if (((double) Math.abs(f17 - f10)) < 1.0E-5d) {
                    break;
                }
                if (f17 > f10) {
                    f15 = q3BipwRCk3;
                } else {
                    f9 = q3BipwRCk3;
                }
                f14 = 0.5f;
                f16 = 2.0f;
                f = 3.0f;
            }
            fArr2[i] = (((q3BipwRCk3 * 0.35000002f) + (f5 * 0.175f)) * f6) + f7;
            if (i2 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = fArr2[100];
                return;
            }
            i = i2;
        }
    }

    public final h4G28bYyt q3BipwRCk(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = J4Ux7ym32;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = tEHkY2u2i.q3BipwRCk(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new h4G28bYyt(f2, f3);
    }
}
