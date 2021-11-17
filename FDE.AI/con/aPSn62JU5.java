package con;

import androidx.compose.ui.platform.AndroidComposeView;
/* loaded from: classes.dex */
public final class aPSn62JU5 extends WfopS3efW {
    public aPSn62JU5(pLYbCSTk0 plybcstk0) {
        super(plybcstk0);
    }

    @Override // con.GX14exZ1F
    public /* bridge */ /* synthetic */ void J4Ux7ym32(int i, Object obj) {
        pLYbCSTk0 plybcstk0 = (pLYbCSTk0) obj;
    }

    @Override // con.GX14exZ1F
    public void dIocxURUo(int i, int i2, int i3) {
        ((pLYbCSTk0) this.tGV7Q6urW).WaUP0CF08(i, i2, i3);
    }

    @Override // con.WfopS3efW
    public void iiGwOFFnr() {
        pLYbCSTk0 plybcstk0 = (pLYbCSTk0) this.q3BipwRCk;
        boolean z = plybcstk0.qVUwofr5s != null;
        int i = plybcstk0.Bhmn1KIah.Bhmn1KIah - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                pLYbCSTk0 plybcstk02 = (pLYbCSTk0) plybcstk0.Bhmn1KIah.CBQ5d1kRq[i];
                if (z) {
                    plybcstk02.iiGwOFFnr();
                }
                plybcstk02.ilHKhw3Yw = null;
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        plybcstk0.Bhmn1KIah.kCA6Zs9sL();
        plybcstk0.dfpT1j18n();
        plybcstk0.kmSgne1rO = 0;
        plybcstk0.qVUwofr5s();
    }

    @Override // con.GX14exZ1F
    public void kCA6Zs9sL(int i, int i2) {
        ((pLYbCSTk0) this.tGV7Q6urW).IytU16YUK(i, i2);
    }

    @Override // con.GX14exZ1F
    public void q3BipwRCk(int i, Object obj) {
        ((pLYbCSTk0) this.tGV7Q6urW).PSTqBLTET(i, (pLYbCSTk0) obj);
    }

    @Override // con.WfopS3efW, con.GX14exZ1F
    public void tGV7Q6urW() {
        jRWr6Yc4S jrwr6yc4s = ((pLYbCSTk0) this.q3BipwRCk).qVUwofr5s;
        AndroidComposeView androidComposeView = jrwr6yc4s instanceof AndroidComposeView ? (AndroidComposeView) jrwr6yc4s : null;
        if (androidComposeView != null) {
            androidComposeView.J4Ux7ym32();
        }
    }
}
