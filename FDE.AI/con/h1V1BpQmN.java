package con;
/* loaded from: classes.dex */
public final class h1V1BpQmN extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ xfhRvlNGe Bhmn1KIah;
    public final /* synthetic */ long PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1V1BpQmN(xfhRvlNGe xfhrvlnge, long j, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = xfhrvlnge;
            this.PSTqBLTET = j;
            return;
        }
        this.Bhmn1KIah = xfhrvlnge;
        this.PSTqBLTET = j;
        super(1);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        long j;
        int ordinal;
        ZtJSMDYDl ztJSMDYDl;
        long j2;
        long j3;
        switch (this.kmSgne1rO) {
            case 0:
                AwUV2q7WY awUV2q7WY = (AwUV2q7WY) obj;
                xfhRvlNGe xfhrvlnge = this.Bhmn1KIah;
                long j4 = this.PSTqBLTET;
                lTg88Bp1o ltg88bp1o = (lTg88Bp1o) xfhrvlnge.Bhmn1KIah.getValue();
                if (ltg88bp1o == null) {
                    j2 = j4;
                } else {
                    j2 = ((YWiUMZOtw) ltg88bp1o.J4Ux7ym32.IytU16YUK(new YWiUMZOtw(j4))).q3BipwRCk;
                }
                lTg88Bp1o ltg88bp1o2 = (lTg88Bp1o) xfhrvlnge.PSTqBLTET.getValue();
                if (ltg88bp1o2 == null) {
                    j3 = j4;
                } else {
                    j3 = ((YWiUMZOtw) ltg88bp1o2.J4Ux7ym32.IytU16YUK(new YWiUMZOtw(j4))).q3BipwRCk;
                }
                int ordinal2 = awUV2q7WY.ordinal();
                if (ordinal2 == 0) {
                    j4 = j2;
                } else if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        j4 = j3;
                    } else {
                        throw new dnCerKhAM();
                    }
                }
                return new YWiUMZOtw(j4);
            default:
                AwUV2q7WY awUV2q7WY2 = (AwUV2q7WY) obj;
                xfhRvlNGe xfhrvlnge2 = this.Bhmn1KIah;
                long j5 = this.PSTqBLTET;
                if (!(xfhrvlnge2.ilHKhw3Yw == null || xfhrvlnge2.MzoOEjc4X.getValue() == null || anXlDk6fV.tGV7Q6urW(xfhrvlnge2.ilHKhw3Yw, xfhrvlnge2.MzoOEjc4X.getValue()) || (ordinal = awUV2q7WY2.ordinal()) == 0 || ordinal == 1)) {
                    if (ordinal == 2) {
                        lTg88Bp1o ltg88bp1o3 = (lTg88Bp1o) xfhrvlnge2.PSTqBLTET.getValue();
                        if (ltg88bp1o3 == null) {
                            ztJSMDYDl = null;
                        } else {
                            long j6 = ((YWiUMZOtw) ltg88bp1o3.J4Ux7ym32.IytU16YUK(new YWiUMZOtw(j5))).q3BipwRCk;
                            BFRsKhrQv bFRsKhrQv = BFRsKhrQv.Ltr;
                            long q3BipwRCk = ((VQRdAcBsL) ((B01AuRyT3) xfhrvlnge2.MzoOEjc4X.getValue())).q3BipwRCk(j5, j6, bFRsKhrQv);
                            long q3BipwRCk2 = ((VQRdAcBsL) xfhrvlnge2.ilHKhw3Yw).q3BipwRCk(j5, j6, bFRsKhrQv);
                            ztJSMDYDl = new ZtJSMDYDl(dnBSj5uJN.tGV7Q6urW(ZtJSMDYDl.q3BipwRCk(q3BipwRCk) - ZtJSMDYDl.q3BipwRCk(q3BipwRCk2), ZtJSMDYDl.J4Ux7ym32(q3BipwRCk) - ZtJSMDYDl.J4Ux7ym32(q3BipwRCk2)));
                        }
                        if (ztJSMDYDl != null) {
                            j = ztJSMDYDl.q3BipwRCk;
                            return new ZtJSMDYDl(j);
                        }
                    } else {
                        throw new dnCerKhAM();
                    }
                }
                joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
                j = ZtJSMDYDl.tGV7Q6urW;
                return new ZtJSMDYDl(j);
        }
    }
}
