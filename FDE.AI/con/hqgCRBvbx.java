package con;
/* loaded from: classes.dex */
public final class hqgCRBvbx extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqgCRBvbx(EuSwp7OG7 euSwp7OG7, int i) {
        super(3);
        this.Bhmn1KIah = euSwp7OG7;
        this.PSTqBLTET = i;
    }

    public final void q3BipwRCk(GX14exZ1F gX14exZ1F, ZVqfObOve zVqfObOve, gl0eeduiq gl0eeduiq) {
        rESgwfV20 resgwfv20;
        qg6veklqT qg6veklqt;
        Object obj = null;
        switch (this.kmSgne1rO) {
            case 0:
                Object obj2 = this.Bhmn1KIah;
                if (obj2 instanceof knaaJ6t3r) {
                    gl0eeduiq.dIocxURUo((knaaJ6t3r) obj2);
                }
                int i = this.PSTqBLTET;
                Object obj3 = this.Bhmn1KIah;
                int CpG0imbht = zVqfObOve.CpG0imbht(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(zVqfObOve.qVUwofr5s));
                int i2 = CpG0imbht + i;
                if (i2 >= CpG0imbht && i2 < zVqfObOve.Puu3Rhg4F(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(zVqfObOve.qVUwofr5s + 1))) {
                    int yWvV4ePLl = zVqfObOve.yWvV4ePLl(i2);
                    Object[] objArr = zVqfObOve.tGV7Q6urW;
                    Object obj4 = objArr[yWvV4ePLl];
                    objArr[yWvV4ePLl] = obj3;
                    if (obj4 instanceof knaaJ6t3r) {
                        gl0eeduiq.tGV7Q6urW((knaaJ6t3r) obj4);
                        return;
                    } else if ((obj4 instanceof rESgwfV20) && (qg6veklqt = (resgwfv20 = (rESgwfV20) obj4).q3BipwRCk) != null) {
                        resgwfv20.q3BipwRCk = null;
                        qg6veklqt.sk5s77z6Q = true;
                        return;
                    } else {
                        return;
                    }
                } else {
                    G7WvUK4mQ.tGV7Q6urW(("Write to an invalid slot index " + i + " for group " + zVqfObOve.qVUwofr5s).toString());
                    throw null;
                }
            default:
                int tGV7Q6urW = zVqfObOve.tGV7Q6urW((EuSwp7OG7) this.Bhmn1KIah);
                if (tGV7Q6urW >= zVqfObOve.kCA6Zs9sL) {
                    tGV7Q6urW += zVqfObOve.iiGwOFFnr;
                }
                if (xpuSUT7Gh.PSTqBLTET(zVqfObOve.J4Ux7ym32, tGV7Q6urW)) {
                    obj = zVqfObOve.tGV7Q6urW[zVqfObOve.yWvV4ePLl(zVqfObOve.Puu3Rhg4F(zVqfObOve.J4Ux7ym32, tGV7Q6urW))];
                }
                ((WfopS3efW) gX14exZ1F).GPLPRo6go();
                gX14exZ1F.q3BipwRCk(this.PSTqBLTET, obj);
                return;
        }
    }

    @Override // con.NzvP5Rex8
    public /* bridge */ /* synthetic */ Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((GX14exZ1F) obj, (ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((GX14exZ1F) obj, (ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqgCRBvbx(Object obj, int i) {
        super(3);
        this.Bhmn1KIah = obj;
        this.PSTqBLTET = i;
    }
}
