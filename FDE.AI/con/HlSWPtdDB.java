package con;
/* loaded from: classes.dex */
public final class HlSWPtdDB extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ long kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HlSWPtdDB(long j) {
        super(1);
        this.kmSgne1rO = j;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        float f;
        HXRw132ar hXRw132ar = (HXRw132ar) obj;
        float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(this.kmSgne1rO);
        if (kCA6Zs9sL > 0.0f) {
            float f2 = npdpixm9c.q3BipwRCk;
            float MzoOEjc4X = hXRw132ar.MzoOEjc4X(npdpixm9c.q3BipwRCk);
            float f3 = o1knaFTwA.q3BipwRCk;
            float MzoOEjc4X2 = hXRw132ar.MzoOEjc4X(o1knaFTwA.tGV7Q6urW) - MzoOEjc4X;
            float f4 = (float) 2;
            float f5 = (MzoOEjc4X * f4) + kCA6Zs9sL + MzoOEjc4X2;
            int ordinal = hXRw132ar.getLayoutDirection().ordinal();
            if (ordinal == 0) {
                f = MzoOEjc4X2;
            } else if (ordinal == 1) {
                f = tbzY8QG6X.kCA6Zs9sL(hXRw132ar.q3BipwRCk()) - f5;
            } else {
                throw new dnCerKhAM();
            }
            int ordinal2 = hXRw132ar.getLayoutDirection().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    f5 = tbzY8QG6X.kCA6Zs9sL(hXRw132ar.q3BipwRCk()) - MzoOEjc4X2;
                } else {
                    throw new dnCerKhAM();
                }
            }
            float tGV7Q6urW = tbzY8QG6X.tGV7Q6urW(this.kmSgne1rO);
            float f6 = tGV7Q6urW / f4;
            oWhsE8IPp owhse8ipp = c8C9YlOpy.q3BipwRCk;
            oWhsE8IPp owhse8ipp2 = c8C9YlOpy.q3BipwRCk;
            OpkJLRxhD ixWaw2akD = hXRw132ar.ixWaw2akD();
            long J4Ux7ym32 = ixWaw2akD.J4Ux7ym32();
            ixWaw2akD.q3BipwRCk().GPLPRo6go();
            ixWaw2akD.q3BipwRCk.q3BipwRCk(f, (-tGV7Q6urW) / f4, f5, f6, 0);
            hXRw132ar.J4Ux7ym32();
            ixWaw2akD.q3BipwRCk().J4Ux7ym32();
            ixWaw2akD.tGV7Q6urW(J4Ux7ym32);
        } else {
            hXRw132ar.J4Ux7ym32();
        }
        return qih4lW99W.q3BipwRCk;
    }
}
