package androidx.lifecycle;

import androidx.lifecycle.RG2GI7LDp;
import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.WGohiwKSS;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements WGohiwKSS {
    public final Object CBQ5d1kRq;
    public final RG2GI7LDp.C0004RG2GI7LDp kmSgne1rO;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = RG2GI7LDp.tGV7Q6urW.J4Ux7ym32(obj.getClass());
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        RG2GI7LDp.C0004RG2GI7LDp rG2GI7LDp2 = this.kmSgne1rO;
        Object obj = this.CBQ5d1kRq;
        RG2GI7LDp.C0004RG2GI7LDp.q3BipwRCk((List) rG2GI7LDp2.q3BipwRCk.get(rG2GI7LDp), bgHiMFrEI, rG2GI7LDp, obj);
        RG2GI7LDp.C0004RG2GI7LDp.q3BipwRCk((List) rG2GI7LDp2.q3BipwRCk.get(mhl5lIdbQ.RG2GI7LDp.ON_ANY), bgHiMFrEI, rG2GI7LDp, obj);
    }
}
