package con;

import android.view.WindowInsets;
/* loaded from: classes.dex */
public class TLfAYfc8I extends fPr2OzCjq {
    public final WindowInsets.Builder J4Ux7ym32;

    public TLfAYfc8I() {
        this.J4Ux7ym32 = new WindowInsets.Builder();
    }

    public TLfAYfc8I(o8nscdGif o8nscdgif) {
        super(o8nscdgif);
        WindowInsets GPLPRo6go = o8nscdgif.GPLPRo6go();
        this.J4Ux7ym32 = GPLPRo6go != null ? new WindowInsets.Builder(GPLPRo6go) : new WindowInsets.Builder();
    }

    @Override // con.fPr2OzCjq
    public o8nscdGif J4Ux7ym32() {
        q3BipwRCk();
        o8nscdGif Puu3Rhg4F = o8nscdGif.Puu3Rhg4F(this.J4Ux7ym32.build());
        Puu3Rhg4F.q3BipwRCk.CBQ5d1kRq(null);
        return Puu3Rhg4F;
    }

    @Override // con.fPr2OzCjq
    public void dIocxURUo(BWdUDHRcA bWdUDHRcA) {
        this.J4Ux7ym32.setSystemWindowInsets(bWdUDHRcA.tGV7Q6urW());
    }

    @Override // con.fPr2OzCjq
    public void tGV7Q6urW(BWdUDHRcA bWdUDHRcA) {
        this.J4Ux7ym32.setStableInsets(bWdUDHRcA.tGV7Q6urW());
    }
}
