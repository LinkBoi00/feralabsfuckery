package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import con.BgHiMFrEI;
import con.N0a4Shkkl;
import con.WGohiwKSS;
import con.XHpudBVT5;
import con.dtGksSk0f;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mhl5lIdbQ {
    public final RG2GI7LDp J4Ux7ym32 = new RG2GI7LDp();
    public final XHpudBVT5 q3BipwRCk;

    public mhl5lIdbQ(XHpudBVT5 xHpudBVT5) {
        this.q3BipwRCk = xHpudBVT5;
    }

    public void J4Ux7ym32(Bundle bundle) {
        RG2GI7LDp rG2GI7LDp = this.J4Ux7ym32;
        Objects.requireNonNull(rG2GI7LDp);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = rG2GI7LDp.J4Ux7ym32;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        dtGksSk0f.RG2GI7LDp kCA6Zs9sL = rG2GI7LDp.q3BipwRCk.kCA6Zs9sL();
        while (kCA6Zs9sL.hasNext()) {
            Map.Entry entry = (Map.Entry) kCA6Zs9sL.next();
            bundle2.putBundle((String) entry.getKey(), ((RG2GI7LDp.mhl5lIdbQ) entry.getValue()).q3BipwRCk());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void q3BipwRCk(Bundle bundle) {
        androidx.lifecycle.mhl5lIdbQ GPLPRo6go = this.q3BipwRCk.GPLPRo6go();
        if (((N0a4Shkkl) GPLPRo6go).tGV7Q6urW == mhl5lIdbQ.EnumC0005mhl5lIdbQ.INITIALIZED) {
            GPLPRo6go.q3BipwRCk(new Recreator(this.q3BipwRCk));
            RG2GI7LDp rG2GI7LDp = this.J4Ux7ym32;
            if (!rG2GI7LDp.tGV7Q6urW) {
                if (bundle != null) {
                    rG2GI7LDp.J4Ux7ym32 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                GPLPRo6go.q3BipwRCk(new WGohiwKSS() { // from class: androidx.savedstate.SavedStateRegistry$1
                    @Override // con.WGohiwKSS
                    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp2) {
                        RG2GI7LDp rG2GI7LDp3;
                        boolean z;
                        if (rG2GI7LDp2 == mhl5lIdbQ.RG2GI7LDp.ON_START) {
                            rG2GI7LDp3 = RG2GI7LDp.this;
                            z = true;
                        } else if (rG2GI7LDp2 == mhl5lIdbQ.RG2GI7LDp.ON_STOP) {
                            rG2GI7LDp3 = RG2GI7LDp.this;
                            z = false;
                        } else {
                            return;
                        }
                        rG2GI7LDp3.kCA6Zs9sL = z;
                    }
                });
                rG2GI7LDp.tGV7Q6urW = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
