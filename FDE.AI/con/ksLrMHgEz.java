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
    public boolean Puu3Rhg4F(float[] r8, con.oeZPZXh5R r9, con.PmanMZxiM r10, con.PmanMZxiM r11, float r12, float r13, int r14) {
        /*
            r7 = this;
            r0 = 1
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            con.FVP3dB50k r14 = con.FVP3dB50k.q3BipwRCk
            float[] r14 = con.FVP3dB50k.J4Ux7ym32
            r1 = 0
            if (r8 != r14) goto L_0x000c
            goto L_0x0035
        L_0x000c:
            int r2 = r8.length
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0035
            r3 = r1
        L_0x0012:
            int r4 = r3 + 1
            r5 = r8[r3]
            r6 = r14[r3]
            int r5 = java.lang.Float.compare(r5, r6)
            if (r5 == 0) goto L_0x0030
            r5 = r8[r3]
            r3 = r14[r3]
            float r5 = r5 - r3
            float r3 = java.lang.Math.abs(r5)
            r5 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0030
            r8 = r1
            goto L_0x0036
        L_0x0030:
            if (r4 <= r2) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r3 = r4
            goto L_0x0012
        L_0x0035:
            r8 = r0
        L_0x0036:
            if (r8 != 0) goto L_0x0039
            return r1
        L_0x0039:
            con.oeZPZXh5R r8 = con.Q5TZwEC4N.dIocxURUo
            boolean r8 = con.xpuSUT7Gh.CpG0imbht(r9, r8)
            if (r8 != 0) goto L_0x0042
            return r1
        L_0x0042:
            r8 = 0
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0049
            r8 = r0
            goto L_0x004a
        L_0x0049:
            r8 = r1
        L_0x004a:
            if (r8 != 0) goto L_0x004d
            return r1
        L_0x004d:
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0055
            r8 = r0
            goto L_0x0056
        L_0x0055:
            r8 = r1
        L_0x0056:
            if (r8 != 0) goto L_0x0059
            return r1
        L_0x0059:
            con.FVP3dB50k r8 = con.FVP3dB50k.q3BipwRCk
            con.mVycGceov r8 = con.FVP3dB50k.dIocxURUo
            r12 = 0
        L_0x005f:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x007e
            con.PmanMZxiM r9 = r8.vPSbyrYWX
            boolean r9 = r7.tGV7Q6urW(r12, r10, r9)
            if (r9 != 0) goto L_0x006e
            return r1
        L_0x006e:
            con.PmanMZxiM r9 = r8.kmSgne1rO
            boolean r9 = r7.tGV7Q6urW(r12, r11, r9)
            if (r9 != 0) goto L_0x0077
            return r1
        L_0x0077:
            r2 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r12 = r12 + r2
            goto L_0x005f
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.ksLrMHgEz.Puu3Rhg4F(float[], con.oeZPZXh5R, con.PmanMZxiM, con.PmanMZxiM, float, float, int):boolean");
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
