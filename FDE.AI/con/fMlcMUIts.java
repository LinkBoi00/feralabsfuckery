package con;
/* loaded from: classes.dex */
public final class fMlcMUIts {
    public static final fMlcMUIts vPSbyrYWX;
    public final float[] GPLPRo6go;
    public final float J4Ux7ym32;
    public final float Puu3Rhg4F;
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float oon79WMrY;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;
    public final float yWvV4ePLl;

    static {
        float[] fArr = kvUEpi7f7.tGV7Q6urW;
        float tGV7Q6urW = (float) ((((double) kvUEpi7f7.tGV7Q6urW(50.0f)) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = kvUEpi7f7.q3BipwRCk;
        float f = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f2 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f3 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f4 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-tGV7Q6urW) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f) * exp) + 1.0f) - exp, (((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp};
        float f5 = 1.0f / ((5.0f * tGV7Q6urW) + 1.0f);
        float f6 = f5 * f5 * f5 * f5;
        float f7 = 1.0f - f6;
        float cbrt = (0.1f * f7 * f7 * ((float) Math.cbrt(((double) tGV7Q6urW) * 5.0d))) + (f6 * tGV7Q6urW);
        float tGV7Q6urW2 = kvUEpi7f7.tGV7Q6urW(50.0f) / fArr[1];
        double d2 = (double) tGV7Q6urW2;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f2)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f3)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        vPSbyrYWX = new fMlcMUIts(tGV7Q6urW2, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f4, 1.0f, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), ((float) Math.sqrt(d2)) + 1.48f);
    }

    public fMlcMUIts(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.iiGwOFFnr = f;
        this.q3BipwRCk = f2;
        this.J4Ux7ym32 = f3;
        this.tGV7Q6urW = f4;
        this.dIocxURUo = f5;
        this.kCA6Zs9sL = f6;
        this.GPLPRo6go = fArr;
        this.Puu3Rhg4F = f7;
        this.yWvV4ePLl = f8;
        this.oon79WMrY = f9;
    }
}
