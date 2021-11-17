package con;
/* loaded from: classes.dex */
public final class BE0Hz4svm {
    public double dIocxURUo;
    public double iiGwOFFnr;
    public double kCA6Zs9sL;
    public float q3BipwRCk;
    public boolean tGV7Q6urW;
    public double J4Ux7ym32 = Math.sqrt(50.0d);
    public float GPLPRo6go = 1.0f;

    public BE0Hz4svm(float f) {
        this.q3BipwRCk = f;
    }

    public final long q3BipwRCk(float f, float f2, long j) {
        double d;
        double d2;
        boolean z = false;
        if (!this.tGV7Q6urW) {
            if (!(this.q3BipwRCk == Float.MAX_VALUE)) {
                float f3 = this.GPLPRo6go;
                double d3 = (double) f3;
                double d4 = d3 * d3;
                if (f3 > 1.0f) {
                    double d5 = this.J4Ux7ym32;
                    double d6 = d4 - ((double) 1);
                    this.dIocxURUo = (Math.sqrt(d6) * d5) + (((double) (-f3)) * d5);
                    double d7 = this.J4Ux7ym32;
                    this.kCA6Zs9sL = (((double) (-this.GPLPRo6go)) * d7) - (Math.sqrt(d6) * d7);
                } else if (f3 >= 0.0f && f3 < 1.0f) {
                    this.iiGwOFFnr = Math.sqrt(((double) 1) - d4) * this.J4Ux7ym32;
                }
                this.tGV7Q6urW = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f4 = f - this.q3BipwRCk;
        double d8 = ((double) j) / 1000.0d;
        float f5 = this.GPLPRo6go;
        if (f5 > 1.0f) {
            double d9 = (double) f4;
            double d10 = this.kCA6Zs9sL;
            double d11 = (double) f2;
            double d12 = this.dIocxURUo;
            double d13 = d9 - (((d10 * d9) - d11) / (d10 - d12));
            double d14 = ((d9 * d10) - d11) / (d10 - d12);
            d = bvtn34BMO.q3BipwRCk(d10, d8, d13) + (Math.exp(this.dIocxURUo * d8) * d14);
            double d15 = this.kCA6Zs9sL;
            double q3BipwRCk = bvtn34BMO.q3BipwRCk(d15, d8, d13 * d15);
            double d16 = this.dIocxURUo;
            d2 = (Math.exp(d16 * d8) * d14 * d16) + q3BipwRCk;
        } else {
            if (f5 == 1.0f) {
                z = true;
            }
            if (z) {
                double d17 = this.J4Ux7ym32;
                double d18 = (double) f4;
                double d19 = ((double) f2) + (d17 * d18);
                double d20 = d18 + (d19 * d8);
                d = bvtn34BMO.q3BipwRCk(-d17, d8, d20);
                double q3BipwRCk2 = bvtn34BMO.q3BipwRCk(-this.J4Ux7ym32, d8, d20);
                double d21 = this.J4Ux7ym32;
                d2 = (Math.exp((-d21) * d8) * d19) + (q3BipwRCk2 * (-d21));
            } else {
                double d22 = ((double) 1) / this.iiGwOFFnr;
                double d23 = this.J4Ux7ym32;
                double d24 = (double) f4;
                double d25 = ((((double) f5) * d23 * d24) + ((double) f2)) * d22;
                double exp = Math.exp(((double) (-f5)) * d23 * d8) * ((Math.sin(this.iiGwOFFnr * d8) * d25) + (Math.cos(this.iiGwOFFnr * d8) * d24));
                double d26 = this.J4Ux7ym32;
                float f6 = this.GPLPRo6go;
                double d27 = (-d26) * exp * ((double) f6);
                double exp2 = Math.exp(((double) (-f6)) * d26 * d8);
                double d28 = this.iiGwOFFnr;
                double d29 = this.iiGwOFFnr;
                d2 = (((Math.cos(d29 * d8) * d25 * d29) + (Math.sin(d28 * d8) * (-d28) * d24)) * exp2) + d27;
                d = exp;
            }
        }
        return (((long) Float.floatToIntBits((float) d2)) & 4294967295L) | (((long) Float.floatToIntBits((float) (d + ((double) this.q3BipwRCk)))) << 32);
    }
}
