package androidx.lifecycle;

import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.N0a4Shkkl;
import con.PPcH1Yg6X;
import con.WGohiwKSS;
import con.mScwA0bsb;
import con.rNTkypKjh;
import con.t3bRJniBj;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class aXI58Y1kr {
    public WGohiwKSS J4Ux7ym32;
    public mhl5lIdbQ.EnumC0005mhl5lIdbQ q3BipwRCk;

    public aXI58Y1kr(mScwA0bsb mscwa0bsb, mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq) {
        WGohiwKSS wGohiwKSS;
        Map map = t3bRJniBj.q3BipwRCk;
        boolean z = mscwa0bsb instanceof WGohiwKSS;
        boolean z2 = mscwa0bsb instanceof PPcH1Yg6X;
        if (z && z2) {
            wGohiwKSS = new FullLifecycleObserverAdapter((PPcH1Yg6X) mscwa0bsb, (WGohiwKSS) mscwa0bsb);
        } else if (z2) {
            wGohiwKSS = new FullLifecycleObserverAdapter((PPcH1Yg6X) mscwa0bsb, null);
        } else if (z) {
            wGohiwKSS = (WGohiwKSS) mscwa0bsb;
        } else {
            Class<?> cls = mscwa0bsb.getClass();
            if (t3bRJniBj.tGV7Q6urW(cls) == 2) {
                List list = (List) ((HashMap) t3bRJniBj.J4Ux7ym32).get(cls);
                if (list.size() == 1) {
                    wGohiwKSS = new SingleGeneratedAdapterObserver(t3bRJniBj.q3BipwRCk((Constructor) list.get(0), mscwa0bsb));
                } else {
                    rNTkypKjh[] rntkypkjhArr = new rNTkypKjh[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        rntkypkjhArr[i] = t3bRJniBj.q3BipwRCk((Constructor) list.get(i), mscwa0bsb);
                    }
                    wGohiwKSS = new CompositeGeneratedAdaptersObserver(rntkypkjhArr);
                }
            } else {
                wGohiwKSS = new ReflectiveGenericLifecycleObserver(mscwa0bsb);
            }
        }
        this.J4Ux7ym32 = wGohiwKSS;
        this.q3BipwRCk = mhl5lidbq;
    }

    public void q3BipwRCk(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        mhl5lIdbQ.EnumC0005mhl5lIdbQ q3BipwRCk = rG2GI7LDp.q3BipwRCk();
        this.q3BipwRCk = N0a4Shkkl.iiGwOFFnr(this.q3BipwRCk, q3BipwRCk);
        this.J4Ux7ym32.tGV7Q6urW(bgHiMFrEI, rG2GI7LDp);
        this.q3BipwRCk = q3BipwRCk;
    }
}
