package con;
/* loaded from: classes.dex */
public final class zECAWzpPF implements e61xwX1kt {
    public final float J4Ux7ym32;
    public final BE0Hz4svm dIocxURUo;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    public zECAWzpPF(float f, float f2, float f3) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        BE0Hz4svm bE0Hz4svm = new BE0Hz4svm(1.0f);
        if (f >= 0.0f) {
            bE0Hz4svm.GPLPRo6go = f;
            bE0Hz4svm.tGV7Q6urW = false;
            double d = bE0Hz4svm.J4Ux7ym32;
            if (((float) (d * d)) > 0.0f) {
                bE0Hz4svm.J4Ux7ym32 = Math.sqrt((double) f2);
                bE0Hz4svm.tGV7Q6urW = false;
                this.dIocxURUo = bE0Hz4svm;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // con.e61xwX1kt
    public float J4Ux7ym32(long j, float f, float f2, float f3) {
        BE0Hz4svm bE0Hz4svm = this.dIocxURUo;
        bE0Hz4svm.q3BipwRCk = f2;
        return Float.intBitsToFloat((int) (bE0Hz4svm.q3BipwRCk(f, f3, j / 1000000) >> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0271, code lost:
        if (r20 > 0.0d) goto L_0x0280;
     */
    @Override // con.e61xwX1kt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long dIocxURUo(float f, float f2, float f3) {
        long j;
        double d;
        double d2;
        double d3;
        DWyFuMabp dWyFuMabp;
        int i;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        BE0Hz4svm bE0Hz4svm = this.dIocxURUo;
        double d9 = bE0Hz4svm.J4Ux7ym32;
        float f4 = bE0Hz4svm.GPLPRo6go;
        float f5 = this.tGV7Q6urW;
        double d10 = (double) ((float) (d9 * d9));
        double d11 = (double) f4;
        double d12 = (double) (f3 / f5);
        double d13 = (double) ((f - f2) / f5);
        double d14 = (double) 1.0f;
        double sqrt = Math.sqrt(d10) * 2.0d * d11;
        double d15 = -sqrt;
        double d16 = (sqrt * sqrt) - (d10 * 4.0d);
        a3LohBeuw q3BipwRCk = BTxNLnjYc.q3BipwRCk(d16);
        double d17 = q3BipwRCk.q3BipwRCk + d15;
        q3BipwRCk.q3BipwRCk = d17;
        q3BipwRCk.q3BipwRCk = d17 / 2.0d;
        q3BipwRCk.J4Ux7ym32 /= 2.0d;
        a3LohBeuw q3BipwRCk2 = BTxNLnjYc.q3BipwRCk(d16);
        double d18 = (double) -1;
        double d19 = q3BipwRCk2.q3BipwRCk * d18;
        q3BipwRCk2.q3BipwRCk = d19;
        double d20 = q3BipwRCk2.J4Ux7ym32 * d18;
        q3BipwRCk2.J4Ux7ym32 = d20;
        double d21 = d19 + d15;
        q3BipwRCk2.q3BipwRCk = d21;
        q3BipwRCk2.q3BipwRCk = d21 / 2.0d;
        q3BipwRCk2.J4Ux7ym32 = d20 / 2.0d;
        int i2 = (d13 > 0.0d ? 1 : (d13 == 0.0d ? 0 : -1));
        int i3 = 1;
        if (i2 == 0) {
            if (d12 == 0.0d) {
                j = 0;
                return j * 1000000;
            }
        }
        if (i2 < 0) {
            d12 = -d12;
        }
        double abs = Math.abs(d13);
        if (d11 > 1.0d) {
            double d22 = q3BipwRCk.q3BipwRCk;
            double d23 = q3BipwRCk2.q3BipwRCk;
            double d24 = d22 - d23;
            double d25 = ((d22 * abs) - d12) / d24;
            double d26 = abs - d25;
            double log = Math.log(Math.abs(d14 / d26)) / d22;
            double log2 = Math.log(Math.abs(d14 / d25)) / d23;
            if (!(!Double.isInfinite(log) && !Double.isNaN(log))) {
                log = log2;
            } else if (!(!(!Double.isInfinite(log2) && !Double.isNaN(log2)))) {
                log = Math.max(log, log2);
            }
            double d27 = d26 * d22;
            double log3 = Math.log(d27 / ((-d25) * d23)) / (d23 - d22);
            if (Double.isNaN(log3) || log3 <= 0.0d) {
                d7 = -d14;
                d = log;
            } else {
                if (log3 > 0.0d) {
                    if ((-((Math.exp(log3 * d23) * d25) + bvtn34BMO.q3BipwRCk(d22, log3, d26))) < d14) {
                        if (d25 <= 0.0d || d26 >= 0.0d) {
                            d = log;
                            d8 = d14;
                        } else {
                            d8 = d14;
                            d = 0.0d;
                        }
                        d7 = -d8;
                    }
                }
                d = Math.log((-((d25 * d23) * d23)) / (d27 * d22)) / d24;
                d7 = d14;
            }
            DWyFuMabp dWyFuMabp2 = new DWyFuMabp(d26, d22, d25, d23, 1);
            double doubleValue = Double.valueOf(d).doubleValue();
            if (Math.abs(Double.valueOf((Math.exp(doubleValue * d23) * d25) + bvtn34BMO.q3BipwRCk(d22, doubleValue, d26) + d7).doubleValue()) >= 1.0E-4d) {
                int i4 = 0;
                double d28 = Double.MAX_VALUE;
                while (d28 > 0.001d && i4 < 100) {
                    i4++;
                    double doubleValue2 = Double.valueOf(d).doubleValue();
                    double doubleValue3 = d - (Double.valueOf(((Math.exp(doubleValue2 * d23) * d25) + bvtn34BMO.q3BipwRCk(d22, doubleValue2, d26)) + d7).doubleValue() / ((Number) dWyFuMabp2.IytU16YUK(Double.valueOf(d))).doubleValue());
                    d28 = Math.abs(d - doubleValue3);
                    d = doubleValue3;
                }
            }
        } else if (d11 < 1.0d) {
            double d29 = q3BipwRCk.q3BipwRCk;
            double d30 = (d12 - (d29 * abs)) / q3BipwRCk.J4Ux7ym32;
            d = Math.log(d14 / Math.sqrt((d30 * d30) + (abs * abs))) / d29;
        } else {
            double d31 = q3BipwRCk.q3BipwRCk;
            double d32 = d31 * abs;
            double d33 = d12 - d32;
            double log4 = Math.log(Math.abs(d14 / abs)) / d31;
            double log5 = Math.log(Math.abs(d14 / d33));
            int i5 = 0;
            double d34 = log5;
            while (true) {
                i5 += i3;
                d34 = log5 - Math.log(Math.abs(d34 / d31));
                if (i5 > 5) {
                    break;
                }
                i3 = 1;
            }
            double d35 = d34 / d31;
            if (!(!Double.isInfinite(log4) && !Double.isNaN(log4))) {
                log4 = d35;
            } else if (!(!(!Double.isInfinite(d35) && !Double.isNaN(d35)))) {
                log4 = Math.max(log4, d35);
            }
            double d36 = (-(d32 + d33)) / (d31 * d33);
            if (!Double.isNaN(d36) && d36 > 0.0d) {
                if (d36 > 0.0d) {
                    double d37 = d31 * d36;
                    if ((-((Math.exp(d37) * d36 * d33) + (Math.exp(d37) * abs))) < d14) {
                        d6 = 0.0d;
                        if (d33 < 0.0d) {
                        }
                    }
                }
                d3 = (-(2.0d / d31)) - (abs / d33);
                d2 = d14;
                dWyFuMabp = new DWyFuMabp(abs, d33, d31, d2, 0);
                i = 0;
                d5 = Double.MAX_VALUE;
                for (d4 = 0.001d; d5 > d4 && i < 100; d4 = 0.001d) {
                    i++;
                    double doubleValue4 = ((Number) dWyFuMabp.IytU16YUK(Double.valueOf(d3))).doubleValue();
                    double doubleValue5 = Double.valueOf(d3).doubleValue() * d31;
                    double doubleValue6 = d3 - (doubleValue4 / Double.valueOf(Math.exp(doubleValue5) * (((((double) 1) + doubleValue5) * d33) + d32)).doubleValue());
                    d5 = Math.abs(d3 - doubleValue6);
                    d3 = doubleValue6;
                    d31 = d31;
                }
                d = d3;
            }
            d6 = log4;
            d2 = -d14;
            d3 = d6;
            dWyFuMabp = new DWyFuMabp(abs, d33, d31, d2, 0);
            i = 0;
            d5 = Double.MAX_VALUE;
            while (d5 > d4) {
                i++;
                double doubleValue42 = ((Number) dWyFuMabp.IytU16YUK(Double.valueOf(d3))).doubleValue();
                double doubleValue52 = Double.valueOf(d3).doubleValue() * d31;
                double doubleValue62 = d3 - (doubleValue42 / Double.valueOf(Math.exp(doubleValue52) * (((((double) 1) + doubleValue52) * d33) + d32)).doubleValue());
                d5 = Math.abs(d3 - doubleValue62);
                d3 = doubleValue62;
                d31 = d31;
            }
            d = d3;
        }
        j = (long) (d * 1000.0d);
        return j * 1000000;
    }

    @Override // con.e61xwX1kt
    public float kCA6Zs9sL(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new unvqWbaGj(this);
    }

    @Override // con.e61xwX1kt
    public float tGV7Q6urW(long j, float f, float f2, float f3) {
        BE0Hz4svm bE0Hz4svm = this.dIocxURUo;
        bE0Hz4svm.q3BipwRCk = f2;
        return Float.intBitsToFloat((int) (bE0Hz4svm.q3BipwRCk(f, f3, j / 1000000) & 4294967295L));
    }
}
