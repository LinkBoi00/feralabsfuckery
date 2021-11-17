package con;

import android.view.WindowInsets;
/* loaded from: classes.dex */
public class TWeXN7eAR extends FYfEv1QIw {
    public BWdUDHRcA kmSgne1rO = null;

    public TWeXN7eAR(o8nscdGif o8nscdgif, WindowInsets windowInsets) {
        super(o8nscdgif, windowInsets);
    }

    @Override // con.rH0APD7hz
    public void Bhmn1KIah(BWdUDHRcA bWdUDHRcA) {
        this.kmSgne1rO = bWdUDHRcA;
    }

    @Override // con.rH0APD7hz
    public final BWdUDHRcA GPLPRo6go() {
        if (this.kmSgne1rO == null) {
            this.kmSgne1rO = BWdUDHRcA.q3BipwRCk(this.tGV7Q6urW.getStableInsetLeft(), this.tGV7Q6urW.getStableInsetTop(), this.tGV7Q6urW.getStableInsetRight(), this.tGV7Q6urW.getStableInsetBottom());
        }
        return this.kmSgne1rO;
    }

    @Override // con.rH0APD7hz
    public o8nscdGif J4Ux7ym32() {
        return o8nscdGif.Puu3Rhg4F(this.tGV7Q6urW.consumeStableInsets());
    }

    @Override // con.rH0APD7hz
    public boolean oon79WMrY() {
        return this.tGV7Q6urW.isConsumed();
    }

    @Override // con.rH0APD7hz
    public o8nscdGif tGV7Q6urW() {
        return o8nscdGif.Puu3Rhg4F(this.tGV7Q6urW.consumeSystemWindowInsets());
    }
}
