package con;
/* loaded from: classes.dex */
public final class yld3fM8k6 {
    public final double GPLPRo6go;
    public final double J4Ux7ym32;
    public final double dIocxURUo;
    public final double iiGwOFFnr;
    public final double kCA6Zs9sL;
    public final double q3BipwRCk;
    public final double tGV7Q6urW;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        if ((r17 == 0.0d) == false) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
        if ((r17 == r7) != false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public yld3fM8k6(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i) {
        double d8;
        double d9 = (i & 32) != 0 ? 0.0d : d6;
        double d10 = (i & 64) != 0 ? 0.0d : d7;
        this.q3BipwRCk = d;
        this.J4Ux7ym32 = d2;
        this.tGV7Q6urW = d3;
        this.dIocxURUo = d4;
        this.kCA6Zs9sL = d5;
        this.iiGwOFFnr = d9;
        this.GPLPRo6go = d10;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        } else if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Parameter d must be in the range [0..1], was ", Double.valueOf(d5)));
        } else {
            boolean z = true;
            if (d5 == 0.0d) {
                if (!(d2 == 0.0d)) {
                }
                throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
            }
            if (d5 >= 1.0d) {
                d8 = 0.0d;
                if (d4 == 0.0d) {
                    throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
                }
            } else {
                d8 = 0.0d;
            }
            int i2 = (d2 > d8 ? 1 : (d2 == d8 ? 0 : -1));
            if (!(i2 == 0)) {
            }
            if (d4 != d8 ? false : z) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
            if (d4 < d8) {
                throw new IllegalArgumentException("The transfer function must be increasing");
            } else if (i2 < 0 || d < d8) {
                throw new IllegalArgumentException("The transfer function must be positive or increasing");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yld3fM8k6)) {
            return false;
        }
        yld3fM8k6 yld3fm8k6 = (yld3fM8k6) obj;
        return anXlDk6fV.tGV7Q6urW(Double.valueOf(this.q3BipwRCk), Double.valueOf(yld3fm8k6.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.J4Ux7ym32), Double.valueOf(yld3fm8k6.J4Ux7ym32)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.tGV7Q6urW), Double.valueOf(yld3fm8k6.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.dIocxURUo), Double.valueOf(yld3fm8k6.dIocxURUo)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.kCA6Zs9sL), Double.valueOf(yld3fm8k6.kCA6Zs9sL)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.iiGwOFFnr), Double.valueOf(yld3fm8k6.iiGwOFFnr)) && anXlDk6fV.tGV7Q6urW(Double.valueOf(this.GPLPRo6go), Double.valueOf(yld3fm8k6.GPLPRo6go));
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.J4Ux7ym32);
        int hashCode2 = Double.hashCode(this.tGV7Q6urW);
        int hashCode3 = Double.hashCode(this.dIocxURUo);
        int hashCode4 = Double.hashCode(this.kCA6Zs9sL);
        int hashCode5 = Double.hashCode(this.iiGwOFFnr);
        return Double.hashCode(this.GPLPRo6go) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.q3BipwRCk) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TransferParameters(gamma=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", a=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", b=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", c=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", d=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", e=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", f=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
