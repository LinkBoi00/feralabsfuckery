package con;

import android.view.Display;
import android.view.View;
/* loaded from: classes.dex */
public final class ksLrMHgEz {
    public final /* synthetic */ int q3BipwRCk;

    public ksLrMHgEz(dnBSj5uJN dnbsj5ujn, int i) {
        this.q3BipwRCk = i;
        switch (i) {
            case 1:
                this.q3BipwRCk = 1;
                return;
            case 2:
                this.q3BipwRCk = 2;
                return;
            case 3:
                this.q3BipwRCk = 3;
                return;
            case 4:
                this.q3BipwRCk = 4;
                return;
            case 5:
                this.q3BipwRCk = 5;
                return;
            case 6:
                this.q3BipwRCk = 6;
                return;
            case 7:
                this.q3BipwRCk = 7;
                return;
            case 8:
                this.q3BipwRCk = 8;
                return;
            case 9:
                this.q3BipwRCk = 9;
                return;
            case 10:
                this.q3BipwRCk = 10;
                return;
            case 11:
                this.q3BipwRCk = 11;
                return;
            case 12:
                this.q3BipwRCk = 12;
                return;
            case 13:
                this.q3BipwRCk = 13;
                return;
            case 14:
                this.q3BipwRCk = 14;
                return;
            case 15:
                this.q3BipwRCk = 15;
                return;
            case 16:
                this.q3BipwRCk = 16;
                return;
            case 17:
                this.q3BipwRCk = 17;
                return;
            case 18:
                this.q3BipwRCk = 18;
                return;
            case 19:
                this.q3BipwRCk = 19;
                return;
            case 20:
                this.q3BipwRCk = 20;
                return;
            case 21:
                this.q3BipwRCk = 21;
                return;
            case 22:
                this.q3BipwRCk = 22;
                return;
            case 23:
                this.q3BipwRCk = 23;
                return;
            case 24:
                this.q3BipwRCk = 24;
                return;
            case 25:
                this.q3BipwRCk = 25;
                return;
            case 26:
                this.q3BipwRCk = 26;
                return;
            case 27:
                this.q3BipwRCk = 27;
                return;
            case 28:
                this.q3BipwRCk = 28;
                return;
            case 29:
                this.q3BipwRCk = 29;
                return;
            default:
                this.q3BipwRCk = 0;
                return;
        }
    }

    public B6IRYLW14 GPLPRo6go() {
        switch (this.q3BipwRCk) {
            case 2:
                return cnnoFa4Tx.PSTqBLTET;
            case 3:
            default:
                return dFPeeJFLA.kCA6Zs9sL;
            case 4:
                return K0KMmkEKu.GPLPRo6go;
        }
    }

    public void J4Ux7ym32(View view) {
        if (WTGSMK63e.dfpT1j18n == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            WTGSMK63e.dfpT1j18n = (long) (((float) 1000000000) / f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean Puu3Rhg4F(float[] fArr, oeZPZXh5R oezpzxh5r, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, float f, float f2, int i) {
        boolean z;
        int length;
        if (i == 0) {
            return true;
        }
        FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
        float[] fArr2 = FVP3dB50k.J4Ux7ym32;
        if (fArr != fArr2 && fArr.length - 1 >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                    z = false;
                    break;
                } else if (i3 > length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
            if (z || !xpuSUT7Gh.CpG0imbht(oezpzxh5r, Q5TZwEC4N.dIocxURUo)) {
                return false;
            }
            if (f != 0.0f) {
                return false;
            }
            if (!(f2 == 1.0f)) {
                return false;
            }
            FVP3dB50k fVP3dB50k2 = FVP3dB50k.q3BipwRCk;
            mVycGceov mvycgceov = FVP3dB50k.dIocxURUo;
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!(tGV7Q6urW(d, pmanMZxiM, mvycgceov.vPSbyrYWX) && tGV7Q6urW(d, pmanMZxiM2, mvycgceov.kmSgne1rO))) {
                    return false;
                }
            }
            return true;
        }
        z = true;
        if (z) {
            return false;
        }
        if (f != 0.0f) {
        }
    }

    public float[] dIocxURUo(float[] fArr, oeZPZXh5R oezpzxh5r) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = oezpzxh5r.q3BipwRCk;
        float f8 = oezpzxh5r.J4Ux7ym32;
        float f9 = (float) 1;
        float f10 = (f9 - f) / f2;
        float f11 = f / f2;
        float f12 = (f3 / f4) - f11;
        float f13 = (f7 / f8) - f11;
        float f14 = ((f9 - f3) / f4) - f10;
        float f15 = (f5 / f6) - f11;
        float f16 = (((((f9 - f7) / f8) - f10) * f12) - (f13 * f14)) / (((((f9 - f5) / f6) - f10) * f12) - (f14 * f15));
        float f17 = (f13 - (f15 * f16)) / f12;
        float f18 = (1.0f - f17) - f16;
        float f19 = f18 / f2;
        float f20 = f17 / f4;
        float f21 = f16 / f6;
        return new float[]{f19 * f, f18, ((1.0f - f) - f2) * f19, f20 * f3, f17, ((1.0f - f3) - f4) * f20, f21 * f5, f16, ((1.0f - f5) - f6) * f21};
    }

    public float iiGwOFFnr(float f, float f2, float f3, float f4) {
        return (f * f4) - (f2 * f3);
    }

    public boolean kCA6Zs9sL(float[] fArr, float[] fArr2) {
        float[] fArr3 = {fArr[0] - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
        return iiGwOFFnr(fArr3[0], fArr3[1], fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f && iiGwOFFnr(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && iiGwOFFnr(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && iiGwOFFnr(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && iiGwOFFnr(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && iiGwOFFnr(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
    }

    public float[] oon79WMrY(float[] fArr) {
        float[] fArr2 = new float[6];
        if (fArr.length == 9) {
            float f = fArr[0] + fArr[1] + fArr[2];
            fArr2[0] = fArr[0] / f;
            fArr2[1] = fArr[1] / f;
            float f2 = fArr[3] + fArr[4] + fArr[5];
            fArr2[2] = fArr[3] / f2;
            fArr2[3] = fArr[4] / f2;
            float f3 = fArr[6] + fArr[7] + fArr[8];
            fArr2[4] = fArr[6] / f3;
            fArr2[5] = fArr[7] / f3;
        } else {
            System.arraycopy(fArr, 0, fArr2, 0, 6);
        }
        return fArr2;
    }

    public float q3BipwRCk(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public boolean tGV7Q6urW(double d, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2) {
        return Math.abs(((Number) pmanMZxiM.IytU16YUK(Double.valueOf(d))).doubleValue() - ((Number) pmanMZxiM2.IytU16YUK(Double.valueOf(d))).doubleValue()) <= 0.001d;
    }

    public boolean yWvV4ePLl(float[] fArr, float f, float f2) {
        float q3BipwRCk = q3BipwRCk(fArr);
        FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
        return (q3BipwRCk / q3BipwRCk(FVP3dB50k.tGV7Q6urW) > 0.9f && kCA6Zs9sL(fArr, FVP3dB50k.J4Ux7ym32)) || (f < 0.0f && f2 > 1.0f);
    }
}
