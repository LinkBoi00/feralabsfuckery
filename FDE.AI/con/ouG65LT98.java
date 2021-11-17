package con;

import android.graphics.Color;
/* loaded from: classes.dex */
public class ouG65LT98 {
    public final float J4Ux7ym32;
    public final float dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    public ouG65LT98(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f7;
        this.kCA6Zs9sL = f8;
        this.iiGwOFFnr = f9;
    }

    public static ouG65LT98 J4Ux7ym32(float f, float f2, float f3) {
        fMlcMUIts fmlcmuits = fMlcMUIts.vPSbyrYWX;
        double d = ((double) f) / 100.0d;
        float sqrt = (fmlcmuits.q3BipwRCk + 4.0f) * (4.0f / fmlcmuits.dIocxURUo) * ((float) Math.sqrt(d));
        float f4 = fmlcmuits.yWvV4ePLl;
        float f5 = sqrt * f4;
        float f6 = f2 * f4;
        float sqrt2 = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * fmlcmuits.dIocxURUo) / (fmlcmuits.q3BipwRCk + 4.0f)))) * 50.0f;
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f3) / 180.0f);
        return new ouG65LT98(f3, f2, f, f5, f6, sqrt2, f7, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static ouG65LT98 q3BipwRCk(int i) {
        fMlcMUIts fmlcmuits = fMlcMUIts.vPSbyrYWX;
        float J4Ux7ym32 = kvUEpi7f7.J4Ux7ym32(Color.red(i));
        float J4Ux7ym322 = kvUEpi7f7.J4Ux7ym32(Color.green(i));
        float J4Ux7ym323 = kvUEpi7f7.J4Ux7ym32(Color.blue(i));
        float[][] fArr = kvUEpi7f7.dIocxURUo;
        float[] fArr2 = {(fArr[0][2] * J4Ux7ym323) + (fArr[0][1] * J4Ux7ym322) + (fArr[0][0] * J4Ux7ym32), (fArr[1][2] * J4Ux7ym323) + (fArr[1][1] * J4Ux7ym322) + (fArr[1][0] * J4Ux7ym32), (J4Ux7ym323 * fArr[2][2]) + (J4Ux7ym322 * fArr[2][1]) + (J4Ux7ym32 * fArr[2][0])};
        float[][] fArr3 = kvUEpi7f7.q3BipwRCk;
        float f = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f2 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f3 = fArr2[0] * fArr3[2][0];
        float f4 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = fmlcmuits.GPLPRo6go;
        float f5 = fArr4[0] * f;
        float f6 = fArr4[1] * f2;
        float f7 = fArr4[2] * (f4 + (fArr2[1] * fArr3[2][1]) + f3);
        float pow = (float) Math.pow(((double) (Math.abs(f5) * fmlcmuits.Puu3Rhg4F)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f6) * fmlcmuits.Puu3Rhg4F)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f7) * fmlcmuits.Puu3Rhg4F)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f8 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d)) / 11.0f;
        float f9 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = ((21.0f * signum3) + ((signum * 20.0f) + f10)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f9, (double) f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * fmlcmuits.J4Ux7ym32) / fmlcmuits.q3BipwRCk), (double) (fmlcmuits.dIocxURUo * fmlcmuits.oon79WMrY))) * 100.0f;
        float sqrt = (fmlcmuits.q3BipwRCk + 4.0f) * (4.0f / fmlcmuits.dIocxURUo) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * fmlcmuits.yWvV4ePLl;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) fmlcmuits.iiGwOFFnr), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * fmlcmuits.kCA6Zs9sL) * fmlcmuits.tGV7Q6urW) * ((float) Math.sqrt((double) ((f9 * f9) + (f8 * f8))))) / (f11 + 0.305f)), 0.9d));
        float sqrt2 = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f14 = sqrt2 * fmlcmuits.yWvV4ePLl;
        float sqrt3 = ((float) Math.sqrt((double) ((pow5 * fmlcmuits.dIocxURUo) / (fmlcmuits.q3BipwRCk + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * f14) + 1.0f))) * 43.85965f;
        double d2 = (double) f13;
        return new ouG65LT98(atan2, sqrt2, pow4, sqrt, f14, sqrt3, f15, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public int tGV7Q6urW(fMlcMUIts fmlcmuits) {
        float f;
        float f2 = this.J4Ux7ym32;
        if (((double) f2) != 0.0d) {
            double d = (double) this.tGV7Q6urW;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) fmlcmuits.iiGwOFFnr), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.q3BipwRCk * 3.1415927f) / 180.0f);
                float pow2 = fmlcmuits.q3BipwRCk * ((float) Math.pow(((double) this.tGV7Q6urW) / 100.0d, (1.0d / ((double) fmlcmuits.dIocxURUo)) / ((double) fmlcmuits.oon79WMrY)));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * fmlcmuits.kCA6Zs9sL * fmlcmuits.tGV7Q6urW;
                float f3 = pow2 / fmlcmuits.J4Ux7ym32;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f4 = 11.0f * pow * cos2;
                float f5 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f4 + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f3 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
                float signum = (100.0f / fmlcmuits.Puu3Rhg4F) * Math.signum(f9) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / fmlcmuits.Puu3Rhg4F) * Math.signum(f10) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
                float signum3 = Math.signum(f11);
                float[] fArr = fmlcmuits.GPLPRo6go;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float pow3 = (((100.0f / fmlcmuits.Puu3Rhg4F) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = kvUEpi7f7.J4Ux7ym32;
                float f14 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f13) + (fArr2[0][0] * f12);
                float f15 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f13) + (fArr2[1][0] * f12);
                float f16 = f12 * fArr2[2][0];
                return R33DQrZIb.q3BipwRCk((double) f14, (double) f15, (double) ((pow3 * fArr2[2][2]) + (f13 * fArr2[2][1]) + f16));
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) fmlcmuits.iiGwOFFnr), 0.73d), 1.1111111111111112d);
        double d22 = (double) ((this.q3BipwRCk * 3.1415927f) / 180.0f);
        float pow22 = fmlcmuits.q3BipwRCk * ((float) Math.pow(((double) this.tGV7Q6urW) / 100.0d, (1.0d / ((double) fmlcmuits.dIocxURUo)) / ((double) fmlcmuits.oon79WMrY)));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * fmlcmuits.kCA6Zs9sL * fmlcmuits.tGV7Q6urW;
        float f32 = pow22 / fmlcmuits.J4Ux7ym32;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f42 = 11.0f * pow4 * cos22;
        float f52 = (((0.305f + f32) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f42 + (cos3 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f32 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f92)) * 27.13d) / (400.0d - ((double) Math.abs(f92))));
        float signum4 = (100.0f / fmlcmuits.Puu3Rhg4F) * Math.signum(f92) * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = (100.0f / fmlcmuits.Puu3Rhg4F) * Math.signum(f102) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f102)) * 27.13d) / (400.0d - ((double) Math.abs(f102))))), 2.380952380952381d));
        float signum32 = Math.signum(f112);
        float[] fArr3 = fmlcmuits.GPLPRo6go;
        float f122 = signum4 / fArr3[0];
        float f132 = signum22 / fArr3[1];
        float pow32 = (((100.0f / fmlcmuits.Puu3Rhg4F) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = kvUEpi7f7.J4Ux7ym32;
        float f142 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f132) + (fArr22[0][0] * f122);
        float f152 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f132) + (fArr22[1][0] * f122);
        float f162 = f122 * fArr22[2][0];
        return R33DQrZIb.q3BipwRCk((double) f142, (double) f152, (double) ((pow32 * fArr22[2][2]) + (f132 * fArr22[2][1]) + f162));
    }
}
