package con;
/* loaded from: classes.dex */
public final class iTgvVSs9V implements e61xwX1kt {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;
    public final lOtvezK70 tGV7Q6urW;

    public iTgvVSs9V(int i, int i2, lOtvezK70 lotvezk70) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = lotvezk70;
    }

    @Override // con.e61xwX1kt
    public float J4Ux7ym32(long j, float f, float f2, float f3) {
        long iiGwOFFnr = cT9gik1zL.iiGwOFFnr((j / 1000000) - ((long) this.J4Ux7ym32), 0, (long) this.q3BipwRCk);
        int i = this.q3BipwRCk;
        float q3BipwRCk = this.tGV7Q6urW.q3BipwRCk(cT9gik1zL.dIocxURUo(i == 0 ? 1.0f : ((float) iiGwOFFnr) / ((float) i), 0.0f, 1.0f));
        aVKpYNINy avkpyniny = NvSSsPAuJ.q3BipwRCk;
        return (f2 * q3BipwRCk) + ((((float) 1) - q3BipwRCk) * f);
    }

    @Override // con.e61xwX1kt
    public long dIocxURUo(float f, float f2, float f3) {
        return ((long) (this.J4Ux7ym32 + this.q3BipwRCk)) * 1000000;
    }

    @Override // con.e61xwX1kt
    public float kCA6Zs9sL(float f, float f2, float f3) {
        return tGV7Q6urW(dIocxURUo(f, f2, f3), f, f2, f3);
    }

    @Override // con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new unvqWbaGj(this);
    }

    @Override // con.e61xwX1kt
    public float tGV7Q6urW(long j, float f, float f2, float f3) {
        long iiGwOFFnr = cT9gik1zL.iiGwOFFnr((j / 1000000) - ((long) this.J4Ux7ym32), 0, (long) this.q3BipwRCk);
        int i = (iiGwOFFnr > 0 ? 1 : (iiGwOFFnr == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (J4Ux7ym32(iiGwOFFnr * 1000000, f, f2, f3) - J4Ux7ym32((iiGwOFFnr - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }
}
