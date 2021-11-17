package con;
/* loaded from: classes.dex */
public final class N0eDBYyvD extends J8UIfudgU {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0eDBYyvD(String str, int i) {
        super(str, eAsjC32WK.dIocxURUo, i, null);
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
    }

    @Override // con.J8UIfudgU
    public float J4Ux7ym32(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // con.J8UIfudgU
    public float[] kCA6Zs9sL(float[] fArr) {
        fArr[0] = cT9gik1zL.dIocxURUo(fArr[0], 0.0f, 100.0f);
        fArr[1] = cT9gik1zL.dIocxURUo(fArr[1], -128.0f, 128.0f);
        fArr[2] = cT9gik1zL.dIocxURUo(fArr[2], -128.0f, 128.0f);
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (fArr[2] * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = Q5TZwEC4N.kCA6Zs9sL;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float[] q3BipwRCk(float[] fArr) {
        float f = fArr[0];
        float[] fArr2 = Q5TZwEC4N.kCA6Zs9sL;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow((double) f2, (double) 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow((double) f3, (double) 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow((double) f4, (double) 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr[0] = cT9gik1zL.dIocxURUo((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = cT9gik1zL.dIocxURUo((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = cT9gik1zL.dIocxURUo((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float tGV7Q6urW(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }
}
