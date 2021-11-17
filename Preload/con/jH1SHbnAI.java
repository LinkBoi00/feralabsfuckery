package con;
/* loaded from: classes.dex */
public final class jH1SHbnAI extends J8UIfudgU {
    public static final float[] GPLPRo6go;
    public static final float[] dIocxURUo;
    public static final float[] iiGwOFFnr;
    public static final float[] kCA6Zs9sL;

    static {
        oWhsE8IPp owhse8ipp = TSFe8IL8E.J4Ux7ym32;
        oWhsE8IPp owhse8ipp2 = TSFe8IL8E.J4Ux7ym32;
        float[] n4UIOvAko = xpuSUT7Gh.n4UIOvAko(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, xpuSUT7Gh.IytU16YUK(TSFe8IL8E.dIocxURUo.q3BipwRCk, new float[]{0.34567f / 0.3585f, 1.0f, ((1.0f - 0.34567f) - 0.3585f) / 0.3585f}, new float[]{0.31271f / 0.32902f, 1.0f, ((1.0f - 0.31271f) - 0.32902f) / 0.32902f}));
        dIocxURUo = n4UIOvAko;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        kCA6Zs9sL = fArr;
        iiGwOFFnr = xpuSUT7Gh.QSbMsHU5X(n4UIOvAko);
        GPLPRo6go = xpuSUT7Gh.QSbMsHU5X(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jH1SHbnAI(String str, int i) {
        super(str, eAsjC32WK.dIocxURUo, i, null);
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
    }

    @Override // con.J8UIfudgU
    public float J4Ux7ym32(int i) {
        return i == 0 ? 1.0f : 2.0f;
    }

    @Override // con.J8UIfudgU
    public float[] kCA6Zs9sL(float[] fArr) {
        fArr[0] = cT9gik1zL.dIocxURUo(fArr[0], 0.0f, 1.0f);
        fArr[1] = cT9gik1zL.dIocxURUo(fArr[1], -2.0f, 2.0f);
        fArr[2] = cT9gik1zL.dIocxURUo(fArr[2], -2.0f, 2.0f);
        xpuSUT7Gh.BL4OzhZBd(GPLPRo6go, fArr);
        double d = (double) 3.0f;
        fArr[0] = (float) Math.pow((double) fArr[0], d);
        fArr[1] = (float) Math.pow((double) fArr[1], d);
        fArr[2] = (float) Math.pow((double) fArr[2], d);
        xpuSUT7Gh.BL4OzhZBd(iiGwOFFnr, fArr);
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float[] q3BipwRCk(float[] fArr) {
        xpuSUT7Gh.BL4OzhZBd(dIocxURUo, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = (float) Math.pow((double) fArr[0], d);
        fArr[1] = (float) Math.pow((double) fArr[1], d);
        fArr[2] = (float) Math.pow((double) fArr[2], d);
        xpuSUT7Gh.BL4OzhZBd(kCA6Zs9sL, fArr);
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float tGV7Q6urW(int i) {
        return i == 0 ? 0.0f : -2.0f;
    }
}
