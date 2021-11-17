package con;

import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import androidx.savedstate.mhl5lIdbQ;
/* loaded from: classes.dex */
public class hZyIatWA3 implements XHpudBVT5, LiMUeynem {
    public final emw2Oo1fE CBQ5d1kRq;
    public N0a4Shkkl kmSgne1rO = null;
    public mhl5lIdbQ Bhmn1KIah = null;

    public hZyIatWA3(UxHHqhbTP uxHHqhbTP, emw2Oo1fE emw2oo1fe) {
        this.CBQ5d1kRq = emw2oo1fe;
    }

    @Override // con.BgHiMFrEI
    public androidx.lifecycle.mhl5lIdbQ GPLPRo6go() {
        tGV7Q6urW();
        return this.kmSgne1rO;
    }

    public void J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        N0a4Shkkl n0a4Shkkl = this.kmSgne1rO;
        n0a4Shkkl.dIocxURUo("handleLifecycleEvent");
        n0a4Shkkl.GPLPRo6go(rG2GI7LDp.q3BipwRCk());
    }

    @Override // con.LiMUeynem
    public emw2Oo1fE kCA6Zs9sL() {
        tGV7Q6urW();
        return this.CBQ5d1kRq;
    }

    @Override // con.XHpudBVT5
    public RG2GI7LDp q3BipwRCk() {
        tGV7Q6urW();
        return this.Bhmn1KIah.J4Ux7ym32;
    }

    public void tGV7Q6urW() {
        if (this.kmSgne1rO == null) {
            this.kmSgne1rO = new N0a4Shkkl(this);
            this.Bhmn1KIah = new androidx.savedstate.mhl5lIdbQ(this);
        }
    }
}
