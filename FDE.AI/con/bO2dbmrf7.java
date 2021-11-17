package con;
/* loaded from: classes.dex */
public final class bO2dbmrf7 {
    public final long q3BipwRCk;
    public static final JhpbRXxsg J4Ux7ym32 = new JhpbRXxsg(0);
    public static final long tGV7Q6urW = xpuSUT7Gh.dIocxURUo(4278190080L);
    public static final long dIocxURUo = xpuSUT7Gh.dIocxURUo(4294967295L);
    public static final long kCA6Zs9sL = xpuSUT7Gh.dIocxURUo(4294901760L);
    public static final long iiGwOFFnr = xpuSUT7Gh.dIocxURUo(4278190335L);
    public static final long GPLPRo6go = xpuSUT7Gh.tGV7Q6urW(0);
    public static final long Puu3Rhg4F = xpuSUT7Gh.J4Ux7ym32(0.0f, 0.0f, 0.0f, 0.0f, FVP3dB50k.dXrmkklc8);

    static {
        xpuSUT7Gh.dIocxURUo(4282664004L);
        xpuSUT7Gh.dIocxURUo(4287137928L);
        xpuSUT7Gh.dIocxURUo(4291611852L);
        xpuSUT7Gh.dIocxURUo(4278255360L);
        xpuSUT7Gh.dIocxURUo(4294967040L);
        xpuSUT7Gh.dIocxURUo(4278255615L);
        xpuSUT7Gh.dIocxURUo(4294902015L);
        FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
    }

    public /* synthetic */ bO2dbmrf7(long j) {
        this.q3BipwRCk = j;
    }

    public static final float GPLPRo6go(long j) {
        if ((63 & j) == 0) {
            return ((float) D3DEikrvb.dfpT1j18n((j >>> 40) & 255)) / 255.0f;
        }
        JhpbRXxsg jhpbRXxsg = dBsFbrhJp.CBQ5d1kRq;
        return dBsFbrhJp.J4Ux7ym32((short) ((int) ((j >>> 32) & 65535)));
    }

    public static long J4Ux7ym32(long j, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = dIocxURUo(j);
        }
        if ((i & 2) != 0) {
            f2 = Puu3Rhg4F(j);
        }
        if ((i & 4) != 0) {
            f3 = GPLPRo6go(j);
        }
        if ((i & 8) != 0) {
            f4 = kCA6Zs9sL(j);
        }
        return xpuSUT7Gh.J4Ux7ym32(f2, f3, f4, f, iiGwOFFnr(j));
    }

    public static final float Puu3Rhg4F(long j) {
        int i = ((63 & j) > 0 ? 1 : ((63 & j) == 0 ? 0 : -1));
        long j2 = j >>> 48;
        if (i == 0) {
            return ((float) D3DEikrvb.dfpT1j18n(j2 & 255)) / 255.0f;
        }
        JhpbRXxsg jhpbRXxsg = dBsFbrhJp.CBQ5d1kRq;
        return dBsFbrhJp.J4Ux7ym32((short) ((int) (j2 & 65535)));
    }

    public static final float dIocxURUo(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f2 = (float) D3DEikrvb.dfpT1j18n((j >>> 56) & 255);
            f = 255.0f;
        } else {
            f2 = (float) D3DEikrvb.dfpT1j18n((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return f2 / f;
    }

    public static final J8UIfudgU iiGwOFFnr(long j) {
        FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
        return FVP3dB50k.ixWaw2akD[(int) (j & 63)];
    }

    public static final float kCA6Zs9sL(long j) {
        if ((63 & j) == 0) {
            return ((float) D3DEikrvb.dfpT1j18n((j >>> 32) & 255)) / 255.0f;
        }
        JhpbRXxsg jhpbRXxsg = dBsFbrhJp.CBQ5d1kRq;
        return dBsFbrhJp.J4Ux7ym32((short) ((int) ((j >>> 16) & 65535)));
    }

    public static String oon79WMrY(long j) {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Color(");
        q3BipwRCk.append(Puu3Rhg4F(j));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(GPLPRo6go(j));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(kCA6Zs9sL(j));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(dIocxURUo(j));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(iiGwOFFnr(j).q3BipwRCk);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public static final long q3BipwRCk(long j, J8UIfudgU j8UIfudgU) {
        if (anXlDk6fV.tGV7Q6urW(j8UIfudgU, iiGwOFFnr(j))) {
            return j;
        }
        dJZmIm0Ve mUqPm6GBh = xpuSUT7Gh.mUqPm6GBh(iiGwOFFnr(j), j8UIfudgU, 0, 2);
        float[] EBQXiIPmm = xpuSUT7Gh.EBQXiIPmm(j);
        mUqPm6GBh.q3BipwRCk(EBQXiIPmm);
        return xpuSUT7Gh.J4Ux7ym32(EBQXiIPmm[0], EBQXiIPmm[1], EBQXiIPmm[2], EBQXiIPmm[3], j8UIfudgU);
    }

    public static final boolean tGV7Q6urW(long j, long j2) {
        return j == j2;
    }

    public static int yWvV4ePLl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof bO2dbmrf7) && j == ((bO2dbmrf7) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return yWvV4ePLl(this.q3BipwRCk);
    }

    public String toString() {
        return oon79WMrY(this.q3BipwRCk);
    }
}
