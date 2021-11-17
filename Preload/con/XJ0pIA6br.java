package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class XJ0pIA6br extends dJZmIm0Ve {
    public final float[] GPLPRo6go;
    public final mVycGceov iiGwOFFnr;
    public final mVycGceov kCA6Zs9sL;

    public XJ0pIA6br(mVycGceov mvycgceov, mVycGceov mvycgceov2, int i, dnBSj5uJN dnbsj5ujn) {
        super(mvycgceov, mvycgceov2, mvycgceov, mvycgceov2, i, null, null);
        float[] fArr;
        this.kCA6Zs9sL = mvycgceov;
        this.iiGwOFFnr = mvycgceov2;
        if (xpuSUT7Gh.CpG0imbht(mvycgceov.dIocxURUo, mvycgceov2.dIocxURUo)) {
            fArr = xpuSUT7Gh.n4UIOvAko(mvycgceov2.oon79WMrY, mvycgceov.yWvV4ePLl);
        } else {
            float[] fArr2 = mvycgceov.yWvV4ePLl;
            float[] fArr3 = mvycgceov2.oon79WMrY;
            float[] q3BipwRCk = mvycgceov.dIocxURUo.q3BipwRCk();
            float[] q3BipwRCk2 = mvycgceov2.dIocxURUo.q3BipwRCk();
            oeZPZXh5R oezpzxh5r = mvycgceov.dIocxURUo;
            oeZPZXh5R oezpzxh5r2 = Q5TZwEC4N.J4Ux7ym32;
            if (!xpuSUT7Gh.CpG0imbht(oezpzxh5r, oezpzxh5r2)) {
                oWhsE8IPp owhse8ipp = TSFe8IL8E.J4Ux7ym32;
                oWhsE8IPp owhse8ipp2 = TSFe8IL8E.J4Ux7ym32;
                float[] fArr4 = TSFe8IL8E.tGV7Q6urW.q3BipwRCk;
                float[] fArr5 = Q5TZwEC4N.kCA6Zs9sL;
                fArr2 = xpuSUT7Gh.n4UIOvAko(xpuSUT7Gh.IytU16YUK(fArr4, q3BipwRCk, Arrays.copyOf(fArr5, fArr5.length)), mvycgceov.yWvV4ePLl);
            }
            if (!xpuSUT7Gh.CpG0imbht(mvycgceov2.dIocxURUo, oezpzxh5r2)) {
                oWhsE8IPp owhse8ipp3 = TSFe8IL8E.J4Ux7ym32;
                oWhsE8IPp owhse8ipp4 = TSFe8IL8E.J4Ux7ym32;
                float[] fArr6 = TSFe8IL8E.tGV7Q6urW.q3BipwRCk;
                float[] fArr7 = Q5TZwEC4N.kCA6Zs9sL;
                fArr3 = xpuSUT7Gh.QSbMsHU5X(xpuSUT7Gh.n4UIOvAko(xpuSUT7Gh.IytU16YUK(fArr6, q3BipwRCk2, Arrays.copyOf(fArr7, fArr7.length)), mvycgceov2.yWvV4ePLl));
            }
            fArr = xpuSUT7Gh.n4UIOvAko(fArr3, i == 3 ? xpuSUT7Gh.OpLJtmvFM(new float[]{q3BipwRCk[0] / q3BipwRCk2[0], q3BipwRCk[1] / q3BipwRCk2[1], q3BipwRCk[2] / q3BipwRCk2[2]}, fArr2) : fArr2);
        }
        this.GPLPRo6go = fArr;
    }

    @Override // con.dJZmIm0Ve
    public float[] q3BipwRCk(float[] fArr) {
        fArr[0] = (float) ((Number) this.kCA6Zs9sL.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.kCA6Zs9sL.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.kCA6Zs9sL.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[2]))).doubleValue();
        xpuSUT7Gh.BL4OzhZBd(this.GPLPRo6go, fArr);
        fArr[0] = (float) ((Number) this.iiGwOFFnr.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.iiGwOFFnr.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.iiGwOFFnr.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[2]))).doubleValue();
        return fArr;
    }
}
