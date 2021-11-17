package con;
/* loaded from: classes.dex */
public final class YV2C4UVux extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YV2C4UVux(EuSwp7OG7 euSwp7OG7) {
        super(3);
        this.Bhmn1KIah = euSwp7OG7;
    }

    public final void q3BipwRCk(GX14exZ1F gX14exZ1F, ZVqfObOve zVqfObOve, gl0eeduiq gl0eeduiq) {
        switch (this.kmSgne1rO) {
            case 0:
                gl0eeduiq.dIocxURUo.add((gdEmqfwpT) this.Bhmn1KIah);
                return;
            case 1:
                int length = ((Object[]) this.Bhmn1KIah).length - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object obj = ((Object[]) this.Bhmn1KIah)[i];
                        WfopS3efW wfopS3efW = (WfopS3efW) gX14exZ1F;
                        wfopS3efW.J4Ux7ym32.add(wfopS3efW.tGV7Q6urW);
                        wfopS3efW.tGV7Q6urW = obj;
                        if (i2 <= length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                zVqfObOve.kmSgne1rO(zVqfObOve.tGV7Q6urW((EuSwp7OG7) this.Bhmn1KIah));
                return;
        }
    }

    @Override // con.NzvP5Rex8
    public /* bridge */ /* synthetic */ Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((GX14exZ1F) obj, (ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
            case 1:
                q3BipwRCk((GX14exZ1F) obj, (ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((GX14exZ1F) obj, (ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YV2C4UVux(gdEmqfwpT gdemqfwpt) {
        super(3);
        this.Bhmn1KIah = gdemqfwpt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YV2C4UVux(Object[] objArr) {
        super(3);
        this.Bhmn1KIah = objArr;
    }
}
