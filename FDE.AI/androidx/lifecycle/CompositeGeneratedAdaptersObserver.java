package androidx.lifecycle;

import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.Le3QZ1StH;
import con.WGohiwKSS;
import con.rNTkypKjh;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements WGohiwKSS {
    public final rNTkypKjh[] CBQ5d1kRq;

    public CompositeGeneratedAdaptersObserver(rNTkypKjh[] rntkypkjhArr) {
        this.CBQ5d1kRq = rntkypkjhArr;
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        Le3QZ1StH le3QZ1StH = new Le3QZ1StH(1);
        for (rNTkypKjh rntkypkjh : this.CBQ5d1kRq) {
            rntkypkjh.q3BipwRCk(bgHiMFrEI, rG2GI7LDp, false, le3QZ1StH);
        }
        for (rNTkypKjh rntkypkjh2 : this.CBQ5d1kRq) {
            rntkypkjh2.q3BipwRCk(bgHiMFrEI, rG2GI7LDp, true, le3QZ1StH);
        }
    }
}
