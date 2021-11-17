package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class mVycGceov extends J8UIfudgU {
    public static final ksLrMHgEz MzoOEjc4X = new ksLrMHgEz(null, 18);
    public final PmanMZxiM Bhmn1KIah;
    public final PmanMZxiM CBQ5d1kRq;
    public final yld3fM8k6 GPLPRo6go;
    public final boolean PSTqBLTET;
    public final float[] Puu3Rhg4F;
    public final oeZPZXh5R dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final PmanMZxiM kmSgne1rO;
    public final float[] oon79WMrY;
    public final PmanMZxiM vPSbyrYWX;
    public final float[] yWvV4ePLl;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public mVycGceov(String str, float[] fArr, oeZPZXh5R oezpzxh5r, double d, float f, float f2, int i) {
        this(str, fArr, oezpzxh5r, null, r0 == 0 ? AdUPdUuqH.i8XZMQc6Z : new MOClL0I5V(d, 0), r0 == 0 ? AdUPdUuqH.i8XZMQc6Z : new MOClL0I5V(d, 1), f, f2, new yld3fM8k6(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96), i);
        int i2 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public mVycGceov(String str, float[] fArr, oeZPZXh5R oezpzxh5r, yld3fM8k6 yld3fm8k6, int i) {
        this(str, fArr, oezpzxh5r, null, r5, r0, 0.0f, 1.0f, yld3fm8k6, i);
        Ko9ttZdSI ko9ttZdSI;
        Ko9ttZdSI ko9ttZdSI2;
        int i2 = (yld3fm8k6.iiGwOFFnr > 0.0d ? 1 : (yld3fm8k6.iiGwOFFnr == 0.0d ? 0 : -1));
        boolean z = true;
        if (i2 == 0) {
            if (yld3fm8k6.GPLPRo6go == 0.0d) {
                ko9ttZdSI = new Ko9ttZdSI(yld3fm8k6, 0);
                if (i2 != 0) {
                    if (yld3fm8k6.GPLPRo6go != 0.0d ? false : z) {
                        ko9ttZdSI2 = new Ko9ttZdSI(yld3fm8k6, 2);
                    }
                }
                ko9ttZdSI2 = new Ko9ttZdSI(yld3fm8k6, 3);
            }
        }
        ko9ttZdSI = new Ko9ttZdSI(yld3fm8k6, 1);
        if (i2 != 0) {
        }
        ko9ttZdSI2 = new Ko9ttZdSI(yld3fm8k6, 3);
    }

    @Override // con.J8UIfudgU
    public float J4Ux7ym32(int i) {
        return this.iiGwOFFnr;
    }

    @Override // con.J8UIfudgU
    public boolean dIocxURUo() {
        return this.PSTqBLTET;
    }

    @Override // con.J8UIfudgU
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !anXlDk6fV.tGV7Q6urW(YGTdT21e3.q3BipwRCk(mVycGceov.class), YGTdT21e3.q3BipwRCk(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        mVycGceov mvycgceov = (mVycGceov) obj;
        if (Float.compare(mvycgceov.kCA6Zs9sL, this.kCA6Zs9sL) != 0 || Float.compare(mvycgceov.iiGwOFFnr, this.iiGwOFFnr) != 0 || !anXlDk6fV.tGV7Q6urW(this.dIocxURUo, mvycgceov.dIocxURUo) || !Arrays.equals(this.Puu3Rhg4F, mvycgceov.Puu3Rhg4F)) {
            return false;
        }
        yld3fM8k6 yld3fm8k6 = this.GPLPRo6go;
        if (yld3fm8k6 != null) {
            return anXlDk6fV.tGV7Q6urW(yld3fm8k6, mvycgceov.GPLPRo6go);
        }
        if (mvycgceov.GPLPRo6go == null) {
            return true;
        }
        if (!anXlDk6fV.tGV7Q6urW(this.vPSbyrYWX, mvycgceov.vPSbyrYWX)) {
            return false;
        }
        return anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, mvycgceov.kmSgne1rO);
    }

    @Override // con.J8UIfudgU
    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.Puu3Rhg4F) + ((this.dIocxURUo.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.kCA6Zs9sL;
        boolean z = true;
        int i = 0;
        int floatToIntBits = (hashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.iiGwOFFnr;
        if (f2 != 0.0f) {
            z = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z ? Float.floatToIntBits(f2) : 0)) * 31;
        yld3fM8k6 yld3fm8k6 = this.GPLPRo6go;
        if (yld3fm8k6 != null) {
            i = yld3fm8k6.hashCode();
        }
        int i2 = floatToIntBits2 + i;
        if (this.GPLPRo6go != null) {
            return i2;
        }
        return this.kmSgne1rO.hashCode() + ((this.vPSbyrYWX.hashCode() + (i2 * 31)) * 31);
    }

    @Override // con.J8UIfudgU
    public float[] kCA6Zs9sL(float[] fArr) {
        fArr[0] = (float) ((Number) this.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.Bhmn1KIah.IytU16YUK(Double.valueOf((double) fArr[2]))).doubleValue();
        xpuSUT7Gh.BL4OzhZBd(this.yWvV4ePLl, fArr);
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float[] q3BipwRCk(float[] fArr) {
        xpuSUT7Gh.BL4OzhZBd(this.oon79WMrY, fArr);
        fArr[0] = (float) ((Number) this.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.CBQ5d1kRq.IytU16YUK(Double.valueOf((double) fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // con.J8UIfudgU
    public float tGV7Q6urW(int i) {
        return this.kCA6Zs9sL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mVycGceov(String str, float[] fArr, oeZPZXh5R oezpzxh5r, float[] fArr2, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, float f, float f2, yld3fM8k6 yld3fm8k6, int i) {
        super(str, eAsjC32WK.J4Ux7ym32, i, null);
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
        this.dIocxURUo = oezpzxh5r;
        this.kCA6Zs9sL = f;
        this.iiGwOFFnr = f2;
        this.GPLPRo6go = yld3fm8k6;
        this.vPSbyrYWX = pmanMZxiM;
        this.CBQ5d1kRq = new lFXdwV0uA(this, 1);
        this.kmSgne1rO = pmanMZxiM2;
        this.Bhmn1KIah = new lFXdwV0uA(this, 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f < f2) {
            ksLrMHgEz kslrmhgez = MzoOEjc4X;
            float[] oon79WMrY = kslrmhgez.oon79WMrY(fArr);
            this.Puu3Rhg4F = oon79WMrY;
            if (fArr2 == null) {
                this.yWvV4ePLl = kslrmhgez.dIocxURUo(oon79WMrY, oezpzxh5r);
            } else if (fArr2.length == 9) {
                this.yWvV4ePLl = fArr2;
            } else {
                throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Transform must have 9 entries! Has ", Integer.valueOf(fArr2.length)));
            }
            this.oon79WMrY = xpuSUT7Gh.QSbMsHU5X(this.yWvV4ePLl);
            kslrmhgez.yWvV4ePLl(oon79WMrY, f, f2);
            this.PSTqBLTET = kslrmhgez.Puu3Rhg4F(oon79WMrY, oezpzxh5r, pmanMZxiM, pmanMZxiM2, f, f2, i);
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
    }
}
