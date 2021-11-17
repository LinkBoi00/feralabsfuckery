package androidx.lifecycle;

import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import con.BgHiMFrEI;
import con.LiMUeynem;
import con.N0a4Shkkl;
import con.TuTk89oZt;
import con.WGohiwKSS;
import con.XHpudBVT5;
import con.emw2Oo1fE;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements WGohiwKSS {
    public boolean CBQ5d1kRq;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements WGohiwKSS {
        public final /* synthetic */ mhl5lIdbQ CBQ5d1kRq;
        public final /* synthetic */ androidx.savedstate.RG2GI7LDp kmSgne1rO;

        @Override // con.WGohiwKSS
        public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
            if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_START) {
                N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) this.CBQ5d1kRq;
                n0a4Shkkl.dIocxURUo("removeObserver");
                n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
                this.kmSgne1rO.tGV7Q6urW(RG2GI7LDp.class);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp implements RG2GI7LDp.AbstractC0008RG2GI7LDp {
        public void q3BipwRCk(XHpudBVT5 xHpudBVT5) {
            Object obj;
            boolean z;
            if (xHpudBVT5 instanceof LiMUeynem) {
                emw2Oo1fE kCA6Zs9sL = ((LiMUeynem) xHpudBVT5).kCA6Zs9sL();
                androidx.savedstate.RG2GI7LDp q3BipwRCk = xHpudBVT5.q3BipwRCk();
                Objects.requireNonNull(kCA6Zs9sL);
                Iterator it = new HashSet(kCA6Zs9sL.q3BipwRCk.keySet()).iterator();
                while (it.hasNext()) {
                    TuTk89oZt tuTk89oZt = (TuTk89oZt) kCA6Zs9sL.q3BipwRCk.get((String) it.next());
                    mhl5lIdbQ GPLPRo6go = xHpudBVT5.GPLPRo6go();
                    Map map = tuTk89oZt.q3BipwRCk;
                    if (map == null) {
                        obj = null;
                    } else {
                        synchronized (map) {
                            obj = tuTk89oZt.q3BipwRCk.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z = savedStateHandleController.CBQ5d1kRq)) {
                        if (z) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.CBQ5d1kRq = true;
                        GPLPRo6go.q3BipwRCk(savedStateHandleController);
                        throw null;
                    }
                }
                if (!new HashSet(kCA6Zs9sL.q3BipwRCk.keySet()).isEmpty()) {
                    q3BipwRCk.tGV7Q6urW(RG2GI7LDp.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_DESTROY) {
            this.CBQ5d1kRq = false;
            N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) bgHiMFrEI.GPLPRo6go();
            n0a4Shkkl.dIocxURUo("removeObserver");
            n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
        }
    }
}
