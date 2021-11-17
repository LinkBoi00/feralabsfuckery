package con;
/* loaded from: classes.dex */
public abstract class J8UIfudgU {
    public final long J4Ux7ym32;
    public final String q3BipwRCk;
    public final int tGV7Q6urW;

    public J8UIfudgU(String str, long j, int i, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = j;
        this.tGV7Q6urW = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float J4Ux7ym32(int i);

    public boolean dIocxURUo() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !anXlDk6fV.tGV7Q6urW(YGTdT21e3.q3BipwRCk(getClass()), YGTdT21e3.q3BipwRCk(obj.getClass()))) {
            return false;
        }
        J8UIfudgU j8UIfudgU = (J8UIfudgU) obj;
        if (this.tGV7Q6urW == j8UIfudgU.tGV7Q6urW && anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, j8UIfudgU.q3BipwRCk)) {
            return eAsjC32WK.q3BipwRCk(this.J4Ux7ym32, j8UIfudgU.J4Ux7ym32);
        }
        return false;
    }

    public int hashCode() {
        long j = this.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        return (((this.q3BipwRCk.hashCode() * 31) + Long.hashCode(j)) * 31) + this.tGV7Q6urW;
    }

    public abstract float[] kCA6Zs9sL(float[] fArr);

    public abstract float[] q3BipwRCk(float[] fArr);

    public abstract float tGV7Q6urW(int i);

    public String toString() {
        return this.q3BipwRCk + " (id=" + this.tGV7Q6urW + ", model=" + ((Object) eAsjC32WK.J4Ux7ym32(this.J4Ux7ym32)) + ')';
    }
}
