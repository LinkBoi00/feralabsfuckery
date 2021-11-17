package con;
/* loaded from: classes.dex */
public final class firEXFF1n extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ long PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public firEXFF1n(long j, gdEmqfwpT gdemqfwpt) {
        super(1);
        this.PSTqBLTET = j;
        this.Bhmn1KIah = gdemqfwpt;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        ZtJSMDYDl ztJSMDYDl;
        long j;
        long j2;
        switch (this.kmSgne1rO) {
            case 0:
                AwUV2q7WY awUV2q7WY = (AwUV2q7WY) obj;
                nSRxIV6Cx nsrxiv6cx = (nSRxIV6Cx) this.Bhmn1KIah;
                long j3 = this.PSTqBLTET;
                BaMMm5shD baMMm5shD = (BaMMm5shD) nsrxiv6cx.kmSgne1rO.getValue();
                ZtJSMDYDl ztJSMDYDl2 = null;
                if (baMMm5shD == null) {
                    ztJSMDYDl = null;
                } else {
                    ztJSMDYDl = (ZtJSMDYDl) baMMm5shD.q3BipwRCk.IytU16YUK(new YWiUMZOtw(j3));
                }
                if (ztJSMDYDl == null) {
                    joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
                    j = ZtJSMDYDl.tGV7Q6urW;
                } else {
                    j = ztJSMDYDl.q3BipwRCk;
                }
                BaMMm5shD baMMm5shD2 = (BaMMm5shD) nsrxiv6cx.Bhmn1KIah.getValue();
                if (baMMm5shD2 != null) {
                    ztJSMDYDl2 = (ZtJSMDYDl) baMMm5shD2.q3BipwRCk.IytU16YUK(new YWiUMZOtw(j3));
                }
                if (ztJSMDYDl2 == null) {
                    joOFKdxvJ joofkdxvj2 = ZtJSMDYDl.J4Ux7ym32;
                    j2 = ZtJSMDYDl.tGV7Q6urW;
                } else {
                    j2 = ztJSMDYDl2.q3BipwRCk;
                }
                int ordinal = awUV2q7WY.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        joOFKdxvJ joofkdxvj3 = ZtJSMDYDl.J4Ux7ym32;
                        j = ZtJSMDYDl.tGV7Q6urW;
                    } else if (ordinal == 2) {
                        j = j2;
                    } else {
                        throw new dnCerKhAM();
                    }
                }
                return new ZtJSMDYDl(j);
            default:
                YFPaMFEQT.GPLPRo6go((wvIIkk6mx) obj, this.PSTqBLTET, 0, 0, ((Number) ((gdEmqfwpT) this.Bhmn1KIah).GPLPRo6go()).floatValue(), null, null, 0, 118, null);
                return qih4lW99W.q3BipwRCk;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public firEXFF1n(nSRxIV6Cx nsrxiv6cx, long j) {
        super(1);
        this.Bhmn1KIah = nsrxiv6cx;
        this.PSTqBLTET = j;
    }
}
