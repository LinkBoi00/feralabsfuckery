package con;

import android.os.Handler;
import androidx.lifecycle.mhl5lIdbQ;
/* loaded from: classes.dex */
public class K3JGdRcke implements BgHiMFrEI {
    public static final K3JGdRcke dXrmkklc8 = new K3JGdRcke();
    public Handler MzoOEjc4X;
    public int CBQ5d1kRq = 0;
    public int kmSgne1rO = 0;
    public boolean Bhmn1KIah = true;
    public boolean PSTqBLTET = true;
    public final N0a4Shkkl ilHKhw3Yw = new N0a4Shkkl(this);
    public Runnable qVUwofr5s = new go0qReAcx(this);
    public iFKnyAZAM Eeka1udhb = new iFKnyAZAM(this);

    @Override // con.BgHiMFrEI
    public mhl5lIdbQ GPLPRo6go() {
        return this.ilHKhw3Yw;
    }

    public void J4Ux7ym32() {
        int i = this.kmSgne1rO + 1;
        this.kmSgne1rO = i;
        if (i != 1) {
            return;
        }
        if (this.Bhmn1KIah) {
            this.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_RESUME);
            this.Bhmn1KIah = false;
            return;
        }
        this.MzoOEjc4X.removeCallbacks(this.qVUwofr5s);
    }

    public void tGV7Q6urW() {
        int i = this.CBQ5d1kRq + 1;
        this.CBQ5d1kRq = i;
        if (i == 1 && this.PSTqBLTET) {
            this.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_START);
            this.PSTqBLTET = false;
        }
    }
}
