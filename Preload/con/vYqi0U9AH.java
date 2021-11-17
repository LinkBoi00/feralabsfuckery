package con;

import android.view.View;
/* loaded from: classes.dex */
public class vYqi0U9AH implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Jg0aTLb6g kmSgne1rO;

    public vYqi0U9AH(Jg0aTLb6g jg0aTLb6g, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = jg0aTLb6g;
        } else {
            this.kmSgne1rO = jg0aTLb6g;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
                if ((jg0aTLb6g.XYT7vJqNO & 1) != 0) {
                    jg0aTLb6g.sk5s77z6Q(0);
                }
                Jg0aTLb6g jg0aTLb6g2 = this.kmSgne1rO;
                if ((jg0aTLb6g2.XYT7vJqNO & 4096) != 0) {
                    jg0aTLb6g2.sk5s77z6Q(108);
                }
                Jg0aTLb6g jg0aTLb6g3 = this.kmSgne1rO;
                jg0aTLb6g3.DuuXfa7LE = false;
                jg0aTLb6g3.XYT7vJqNO = 0;
                return;
            default:
                Jg0aTLb6g jg0aTLb6g4 = this.kmSgne1rO;
                jg0aTLb6g4.iMyQMM6Qj.showAtLocation(jg0aTLb6g4.dfpT1j18n, 55, 0, 0);
                this.kmSgne1rO.WaUP0CF08();
                if (this.kmSgne1rO.i0Zug1mVk()) {
                    this.kmSgne1rO.dfpT1j18n.setAlpha(0.0f);
                    Jg0aTLb6g jg0aTLb6g5 = this.kmSgne1rO;
                    Roohga8FY J4Ux7ym32 = IuQbWntsc.J4Ux7ym32(jg0aTLb6g5.dfpT1j18n);
                    J4Ux7ym32.q3BipwRCk(1.0f);
                    jg0aTLb6g5.IytU16YUK = J4Ux7ym32;
                    Roohga8FY roohga8FY = this.kmSgne1rO.IytU16YUK;
                    KtH1IMBtd ktH1IMBtd = new KtH1IMBtd(this);
                    View view = (View) roohga8FY.q3BipwRCk.get();
                    if (view != null) {
                        roohga8FY.kCA6Zs9sL(view, ktH1IMBtd);
                        return;
                    }
                    return;
                }
                this.kmSgne1rO.dfpT1j18n.setAlpha(1.0f);
                this.kmSgne1rO.dfpT1j18n.setVisibility(0);
                return;
        }
    }
}
