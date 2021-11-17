package con;
/* loaded from: classes.dex */
public final class NOGO0aGs4 implements Comparable {
    public static int MzoOEjc4X = 1;
    public final bzmJZsHMu Bhmn1KIah;
    public final pLYbCSTk0 CBQ5d1kRq;
    public final BFRsKhrQv PSTqBLTET;
    public final pLYbCSTk0 kmSgne1rO;

    public NOGO0aGs4(pLYbCSTk0 plybcstk0, pLYbCSTk0 plybcstk02) {
        this.CBQ5d1kRq = plybcstk0;
        this.kmSgne1rO = plybcstk02;
        this.PSTqBLTET = plybcstk0.IytU16YUK;
        qhaZGYFO8 qhazgyfo8 = plybcstk0.o4LF8RkoQ;
        qhaZGYFO8 dXrmkklc8 = ODug2UCW1.dXrmkklc8(plybcstk02);
        bzmJZsHMu bzmjzshmu = null;
        if (qhazgyfo8.oesmsHQJU() && dXrmkklc8.oesmsHQJU()) {
            bzmjzshmu = gThLCaTO1.ilHKhw3Yw(qhazgyfo8, dXrmkklc8, false, 2, null);
        }
        this.Bhmn1KIah = bzmjzshmu;
    }

    /* renamed from: q3BipwRCk */
    public int compareTo(NOGO0aGs4 nOGO0aGs4) {
        bzmJZsHMu bzmjzshmu = this.Bhmn1KIah;
        if (bzmjzshmu == null) {
            return 1;
        }
        bzmJZsHMu bzmjzshmu2 = nOGO0aGs4.Bhmn1KIah;
        if (bzmjzshmu2 == null) {
            return -1;
        }
        if (MzoOEjc4X == 1) {
            if (bzmjzshmu.dIocxURUo - bzmjzshmu2.J4Ux7ym32 <= 0.0f) {
                return -1;
            }
            if (bzmjzshmu.J4Ux7ym32 - bzmjzshmu2.dIocxURUo >= 0.0f) {
                return 1;
            }
        }
        if (this.PSTqBLTET == BFRsKhrQv.Ltr) {
            int i = ((bzmjzshmu.q3BipwRCk - bzmjzshmu2.q3BipwRCk) > 0.0f ? 1 : ((bzmjzshmu.q3BipwRCk - bzmjzshmu2.q3BipwRCk) == 0.0f ? 0 : -1));
            if (!(i == 0)) {
                return i < 0 ? -1 : 1;
            }
        } else {
            int i2 = ((bzmjzshmu.tGV7Q6urW - bzmjzshmu2.tGV7Q6urW) > 0.0f ? 1 : ((bzmjzshmu.tGV7Q6urW - bzmjzshmu2.tGV7Q6urW) == 0.0f ? 0 : -1));
            if (!(i2 == 0)) {
                return i2 < 0 ? 1 : -1;
            }
        }
        int i3 = ((bzmjzshmu.J4Ux7ym32 - bzmjzshmu2.J4Ux7ym32) > 0.0f ? 1 : ((bzmjzshmu.J4Ux7ym32 - bzmjzshmu2.J4Ux7ym32) == 0.0f ? 0 : -1));
        if (!(i3 == 0)) {
            return i3 < 0 ? -1 : 1;
        }
        int i4 = ((bzmjzshmu.J4Ux7ym32() - nOGO0aGs4.Bhmn1KIah.J4Ux7ym32()) > 0.0f ? 1 : ((bzmjzshmu.J4Ux7ym32() - nOGO0aGs4.Bhmn1KIah.J4Ux7ym32()) == 0.0f ? 0 : -1));
        if (!(i4 == 0)) {
            return i4 < 0 ? 1 : -1;
        }
        int i5 = ((this.Bhmn1KIah.kCA6Zs9sL() - nOGO0aGs4.Bhmn1KIah.kCA6Zs9sL()) > 0.0f ? 1 : ((this.Bhmn1KIah.kCA6Zs9sL() - nOGO0aGs4.Bhmn1KIah.kCA6Zs9sL()) == 0.0f ? 0 : -1));
        if (!(i5 == 0)) {
            return i5 < 0 ? 1 : -1;
        }
        bzmJZsHMu ilHKhw3Yw = p62TZmTyO.ilHKhw3Yw(ODug2UCW1.dXrmkklc8(this.kmSgne1rO));
        bzmJZsHMu ilHKhw3Yw2 = p62TZmTyO.ilHKhw3Yw(ODug2UCW1.dXrmkklc8(nOGO0aGs4.kmSgne1rO));
        pLYbCSTk0 qVUwofr5s = ODug2UCW1.qVUwofr5s(this.kmSgne1rO, new EsXy4toVo(ilHKhw3Yw, 0));
        pLYbCSTk0 qVUwofr5s2 = ODug2UCW1.qVUwofr5s(nOGO0aGs4.kmSgne1rO, new EsXy4toVo(ilHKhw3Yw2, 1));
        if (qVUwofr5s == null || qVUwofr5s2 == null) {
            return qVUwofr5s != null ? 1 : -1;
        }
        return new NOGO0aGs4(this.CBQ5d1kRq, qVUwofr5s).compareTo(new NOGO0aGs4(nOGO0aGs4.CBQ5d1kRq, qVUwofr5s2));
    }
}
