package con;
/* loaded from: classes.dex */
public final class lFXdwV0uA extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ mVycGceov Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lFXdwV0uA(mVycGceov mvycgceov, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = mvycgceov;
            return;
        }
        this.Bhmn1KIah = mvycgceov;
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
                mVycGceov mvycgceov = this.Bhmn1KIah;
                return (Double) mvycgceov.kmSgne1rO.IytU16YUK(Double.valueOf(cT9gik1zL.tGV7Q6urW(d, (double) mvycgceov.kCA6Zs9sL, (double) mvycgceov.iiGwOFFnr)));
            default:
                double doubleValue = ((Number) this.Bhmn1KIah.vPSbyrYWX.IytU16YUK(Double.valueOf(d))).doubleValue();
                mVycGceov mvycgceov2 = this.Bhmn1KIah;
                return Double.valueOf(cT9gik1zL.tGV7Q6urW(doubleValue, (double) mvycgceov2.kCA6Zs9sL, (double) mvycgceov2.iiGwOFFnr));
        }
    }
}
