package con;
/* loaded from: classes.dex */
public abstract class p20sE4qqm {
    public static final long J4Ux7ym32(float[] fArr, long j) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
        float f = (fArr[7] * dIocxURUo) + (fArr[3] * tGV7Q6urW) + fArr[15];
        float f2 = 0.0f;
        if (!(f == 0.0f)) {
            f2 = 1.0f / f;
        }
        return ODug2UCW1.dIocxURUo(((fArr[4] * dIocxURUo) + (fArr[0] * tGV7Q6urW) + fArr[12]) * f2, ((fArr[5] * dIocxURUo) + (fArr[1] * tGV7Q6urW) + fArr[13]) * f2);
    }

    public static final void dIocxURUo(float[] fArr) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                fArr[(i3 * 4) + i] = i == i3 ? 1.0f : 0.0f;
                if (i4 > 3) {
                    break;
                }
                i3 = i4;
            }
            if (i2 <= 3) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public static void kCA6Zs9sL(float[] fArr, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        float f4 = (fArr[8] * f3) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f5 = (fArr[9] * f3) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f6 = (fArr[10] * f3) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f7 = fArr[3] * f;
        float f8 = fArr[11] * f3;
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f8 + (fArr[7] * f2) + f7 + fArr[15];
    }

    public static float[] q3BipwRCk(float[] fArr, int i) {
        if ((i & 1) != 0) {
            return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return null;
    }

    public static final void tGV7Q6urW(float[] fArr, iPoCEXeoL ipocexeol) {
        long J4Ux7ym32 = J4Ux7ym32(fArr, ODug2UCW1.dIocxURUo(ipocexeol.q3BipwRCk, ipocexeol.J4Ux7ym32));
        long J4Ux7ym322 = J4Ux7ym32(fArr, ODug2UCW1.dIocxURUo(ipocexeol.q3BipwRCk, ipocexeol.dIocxURUo));
        long J4Ux7ym323 = J4Ux7ym32(fArr, ODug2UCW1.dIocxURUo(ipocexeol.tGV7Q6urW, ipocexeol.J4Ux7ym32));
        long J4Ux7ym324 = J4Ux7ym32(fArr, ODug2UCW1.dIocxURUo(ipocexeol.tGV7Q6urW, ipocexeol.dIocxURUo));
        ipocexeol.q3BipwRCk = Math.min(Math.min(bRgfgYIQX.tGV7Q6urW(J4Ux7ym32), bRgfgYIQX.tGV7Q6urW(J4Ux7ym322)), Math.min(bRgfgYIQX.tGV7Q6urW(J4Ux7ym323), bRgfgYIQX.tGV7Q6urW(J4Ux7ym324)));
        ipocexeol.J4Ux7ym32 = Math.min(Math.min(bRgfgYIQX.dIocxURUo(J4Ux7ym32), bRgfgYIQX.dIocxURUo(J4Ux7ym322)), Math.min(bRgfgYIQX.dIocxURUo(J4Ux7ym323), bRgfgYIQX.dIocxURUo(J4Ux7ym324)));
        ipocexeol.tGV7Q6urW = Math.max(Math.max(bRgfgYIQX.tGV7Q6urW(J4Ux7ym32), bRgfgYIQX.tGV7Q6urW(J4Ux7ym322)), Math.max(bRgfgYIQX.tGV7Q6urW(J4Ux7ym323), bRgfgYIQX.tGV7Q6urW(J4Ux7ym324)));
        ipocexeol.dIocxURUo = Math.max(Math.max(bRgfgYIQX.dIocxURUo(J4Ux7ym32), bRgfgYIQX.dIocxURUo(J4Ux7ym322)), Math.max(bRgfgYIQX.dIocxURUo(J4Ux7ym323), bRgfgYIQX.dIocxURUo(J4Ux7ym324)));
    }
}
