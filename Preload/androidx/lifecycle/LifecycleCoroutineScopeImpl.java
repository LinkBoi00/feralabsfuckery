package androidx.lifecycle;

import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.N0a4Shkkl;
import con.WGohiwKSS;
import con.anXlDk6fV;
import con.bu5cjmae6;
import con.q9dGs9SI6;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends q9dGs9SI6 implements WGohiwKSS {
    public final mhl5lIdbQ CBQ5d1kRq;
    public final bu5cjmae6 kmSgne1rO;

    public LifecycleCoroutineScopeImpl(mhl5lIdbQ mhl5lidbq, bu5cjmae6 bu5cjmae6) {
        this.CBQ5d1kRq = mhl5lidbq;
        this.kmSgne1rO = bu5cjmae6;
        if (((N0a4Shkkl) mhl5lidbq).tGV7Q6urW == mhl5lIdbQ.EnumC0005mhl5lIdbQ.DESTROYED) {
            anXlDk6fV.Puu3Rhg4F(bu5cjmae6, null, 1, null);
        }
    }

    @Override // con.oQkvjGXIr
    public bu5cjmae6 dIocxURUo() {
        return this.kmSgne1rO;
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (((N0a4Shkkl) this.CBQ5d1kRq).tGV7Q6urW.compareTo(mhl5lIdbQ.EnumC0005mhl5lIdbQ.DESTROYED) <= 0) {
            N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) this.CBQ5d1kRq;
            n0a4Shkkl.dIocxURUo("removeObserver");
            n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
            anXlDk6fV.Puu3Rhg4F(this.kmSgne1rO, null, 1, null);
        }
    }
}
