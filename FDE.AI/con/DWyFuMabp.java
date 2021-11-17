package con;
/* loaded from: classes.dex */
public final class DWyFuMabp extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ double Bhmn1KIah;
    public final /* synthetic */ double MzoOEjc4X;
    public final /* synthetic */ double PSTqBLTET;
    public final /* synthetic */ double ilHKhw3Yw;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWyFuMabp(double d, double d2, double d3, double d4, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = d;
            this.PSTqBLTET = d2;
            this.MzoOEjc4X = d3;
            this.ilHKhw3Yw = d4;
            return;
        }
        this.Bhmn1KIah = d;
        this.PSTqBLTET = d2;
        this.MzoOEjc4X = d3;
        this.ilHKhw3Yw = d4;
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
                return Double.valueOf((Math.exp(this.MzoOEjc4X * d) * ((this.PSTqBLTET * d) + this.Bhmn1KIah)) + this.ilHKhw3Yw);
            default:
                double d2 = this.Bhmn1KIah;
                double d3 = this.PSTqBLTET;
                double exp = Math.exp(d3 * d) * d2 * d3;
                double d4 = this.MzoOEjc4X;
                double d5 = this.ilHKhw3Yw;
                return Double.valueOf((Math.exp(d5 * d) * d4 * d5) + exp);
        }
    }
}
