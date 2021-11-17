package con;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.ContentFrameLayout;
import con.HelDswbLq;
/* loaded from: classes.dex */
public class EV4wl6Jg6 implements N1zulf8pH, dKJ1o9mQ7, ContentFrameLayout.RG2GI7LDp, HelDswbLq.RG2GI7LDp {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Jg0aTLb6g kmSgne1rO;

    public EV4wl6Jg6(Jg0aTLb6g jg0aTLb6g, int i) {
        this.CBQ5d1kRq = i;
        if (i == 1) {
            this.kmSgne1rO = jg0aTLb6g;
        } else if (i == 2) {
            this.kmSgne1rO = jg0aTLb6g;
        } else if (i == 3) {
            this.kmSgne1rO = jg0aTLb6g;
        } else if (i != 4) {
            this.kmSgne1rO = jg0aTLb6g;
        } else {
            this.kmSgne1rO = jg0aTLb6g;
        }
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public boolean Bhmn1KIah(RG2GI7LDp rG2GI7LDp) {
        Window.Callback CpG0imbht;
        switch (this.CBQ5d1kRq) {
            case 3:
                Window.Callback CpG0imbht2 = this.kmSgne1rO.CpG0imbht();
                if (CpG0imbht2 != null) {
                    CpG0imbht2.onMenuOpened(108, rG2GI7LDp);
                }
                return true;
            default:
                if (rG2GI7LDp == rG2GI7LDp.vPSbyrYWX()) {
                    Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
                    if (jg0aTLb6g.vNtjxmzUM && (CpG0imbht = jg0aTLb6g.CpG0imbht()) != null && !this.kmSgne1rO.zHl31GGXU) {
                        CpG0imbht.onMenuOpened(108, rG2GI7LDp);
                    }
                }
                return true;
        }
    }

    @Override // con.N1zulf8pH
    public o8nscdGif J4Ux7ym32(View view, o8nscdGif o8nscdgif) {
        int dIocxURUo = o8nscdgif.dIocxURUo();
        int V9LQMKGJe = this.kmSgne1rO.V9LQMKGJe(o8nscdgif, null);
        if (dIocxURUo != V9LQMKGJe) {
            int J4Ux7ym32 = o8nscdgif.J4Ux7ym32();
            int tGV7Q6urW = o8nscdgif.tGV7Q6urW();
            int q3BipwRCk = o8nscdgif.q3BipwRCk();
            int i = Build.VERSION.SDK_INT;
            fPr2OzCjq qprz6rQ4P = i >= 30 ? new Qprz6rQ4P(o8nscdgif) : i >= 29 ? new TLfAYfc8I(o8nscdgif) : new Vo8lDzQhu(o8nscdgif);
            qprz6rQ4P.dIocxURUo(BWdUDHRcA.q3BipwRCk(J4Ux7ym32, V9LQMKGJe, tGV7Q6urW, q3BipwRCk));
            o8nscdgif = qprz6rQ4P.J4Ux7ym32();
        }
        return IuQbWntsc.vPSbyrYWX(view, o8nscdgif);
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        switch (this.CBQ5d1kRq) {
            case 3:
                this.kmSgne1rO.Eeka1udhb(rG2GI7LDp);
                return;
            default:
                RG2GI7LDp vPSbyrYWX = rG2GI7LDp.vPSbyrYWX();
                boolean z2 = vPSbyrYWX != rG2GI7LDp;
                Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
                if (z2) {
                    rG2GI7LDp = vPSbyrYWX;
                }
                sF46ToYwT iMyQMM6Qj = jg0aTLb6g.iMyQMM6Qj(rG2GI7LDp);
                if (iMyQMM6Qj == null) {
                    return;
                }
                if (z2) {
                    this.kmSgne1rO.qVUwofr5s(iMyQMM6Qj.q3BipwRCk, iMyQMM6Qj, vPSbyrYWX);
                    this.kmSgne1rO.dXrmkklc8(iMyQMM6Qj, true);
                    return;
                }
                this.kmSgne1rO.dXrmkklc8(iMyQMM6Qj, z);
                return;
        }
    }
}
