package con;
/* loaded from: classes.dex */
public final class MOClL0I5V extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ double Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MOClL0I5V(double d, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = d;
            return;
        }
        this.Bhmn1KIah = d;
        super(1);
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk(((Number) obj).doubleValue());
            default:
                return q3BipwRCk(((Number) obj).doubleValue());
        }
    }

    public final Double q3BipwRCk(double d) {
        switch (this.kmSgne1rO) {
            case 0:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Double.valueOf(Math.pow(d, 1.0d / this.Bhmn1KIah));
            default:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Double.valueOf(Math.pow(d, this.Bhmn1KIah));
        }
    }
}
