package con;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.RG2GI7LDp;
/* loaded from: classes.dex */
public class mCum8mep9 implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 3;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    public mCum8mep9(PlegqbMSA plegqbMSA, rPR8g1Ebn rpr8g1ebn, int i) {
        this.PSTqBLTET = plegqbMSA;
        this.Bhmn1KIah = rpr8g1ebn;
        this.kmSgne1rO = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        hAHDFOdMb hahdfodmb;
        switch (this.CBQ5d1kRq) {
            case 0:
                MOVjTUs5I mOVjTUs5I = (MOVjTUs5I) this.PSTqBLTET;
                int i = this.kmSgne1rO;
                Object tGV7Q6urW = ((DGdyNqLvN) this.Bhmn1KIah).tGV7Q6urW();
                String str = (String) mOVjTUs5I.J4Ux7ym32.get(Integer.valueOf(i));
                if (str != null) {
                    RG2GI7LDp.C0000RG2GI7LDp rG2GI7LDp = (RG2GI7LDp.C0000RG2GI7LDp) mOVjTUs5I.iiGwOFFnr.get(str);
                    if (rG2GI7LDp == null || (hahdfodmb = rG2GI7LDp.q3BipwRCk) == null) {
                        mOVjTUs5I.Puu3Rhg4F.remove(str);
                        mOVjTUs5I.GPLPRo6go.put(str, tGV7Q6urW);
                        return;
                    } else if (mOVjTUs5I.kCA6Zs9sL.remove(str)) {
                        ((uRyiqsiNk) hahdfodmb).J4Ux7ym32(tGV7Q6urW);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((MOVjTUs5I) this.PSTqBLTET).q3BipwRCk(this.kmSgne1rO, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.Bhmn1KIah));
                return;
            default:
                int i2 = this.kmSgne1rO;
                DfseMYa7G dfseMYa7G = (DfseMYa7G) ((rPR8g1Ebn) this.Bhmn1KIah).J4Ux7ym32;
                if (dfseMYa7G != null) {
                    dfseMYa7G.kCA6Zs9sL(i2);
                    return;
                }
                return;
        }
    }
}
