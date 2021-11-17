package con;
/* loaded from: classes.dex */
public final class Ko9ttZdSI extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ yld3fM8k6 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ko9ttZdSI(yld3fM8k6 yld3fm8k6, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = yld3fm8k6;
            super(1);
        } else if (i == 2) {
            this.Bhmn1KIah = yld3fm8k6;
            super(1);
        } else if (i != 3) {
            this.Bhmn1KIah = yld3fm8k6;
        } else {
            this.Bhmn1KIah = yld3fm8k6;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk(((Number) obj).doubleValue());
            case 1:
                return q3BipwRCk(((Number) obj).doubleValue());
            case 2:
                return q3BipwRCk(((Number) obj).doubleValue());
            default:
                return q3BipwRCk(((Number) obj).doubleValue());
        }
    }

    public final Double q3BipwRCk(double d) {
        switch (this.kmSgne1rO) {
            case 0:
                yld3fM8k6 yld3fm8k6 = this.Bhmn1KIah;
                return Double.valueOf(xpuSUT7Gh.XYT7vJqNO(d, yld3fm8k6.J4Ux7ym32, yld3fm8k6.tGV7Q6urW, yld3fm8k6.dIocxURUo, yld3fm8k6.kCA6Zs9sL, yld3fm8k6.q3BipwRCk));
            case 1:
                yld3fM8k6 yld3fm8k62 = this.Bhmn1KIah;
                double d2 = yld3fm8k62.J4Ux7ym32;
                double d3 = yld3fm8k62.tGV7Q6urW;
                double d4 = yld3fm8k62.dIocxURUo;
                return Double.valueOf(d >= yld3fm8k62.kCA6Zs9sL * d4 ? (Math.pow(d - yld3fm8k62.iiGwOFFnr, 1.0d / yld3fm8k62.q3BipwRCk) - d3) / d2 : (d - yld3fm8k62.GPLPRo6go) / d4);
            case 2:
                yld3fM8k6 yld3fm8k63 = this.Bhmn1KIah;
                return Double.valueOf(d >= yld3fm8k63.kCA6Zs9sL ? Math.pow((yld3fm8k63.J4Ux7ym32 * d) + yld3fm8k63.tGV7Q6urW, yld3fm8k63.q3BipwRCk) : d * yld3fm8k63.dIocxURUo);
            default:
                yld3fM8k6 yld3fm8k64 = this.Bhmn1KIah;
                double d5 = yld3fm8k64.J4Ux7ym32;
                double d6 = yld3fm8k64.tGV7Q6urW;
                double d7 = yld3fm8k64.dIocxURUo;
                return Double.valueOf(d >= yld3fm8k64.kCA6Zs9sL ? Math.pow((d5 * d) + d6, yld3fm8k64.q3BipwRCk) + yld3fm8k64.iiGwOFFnr : (d7 * d) + yld3fm8k64.GPLPRo6go);
        }
    }
}
