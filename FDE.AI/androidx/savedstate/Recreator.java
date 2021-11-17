package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import con.BgHiMFrEI;
import con.M5g57XBLr;
import con.N0a4Shkkl;
import con.UexvVay3o;
import con.WGohiwKSS;
import con.XHpudBVT5;
import con.abGBwSu8x;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements WGohiwKSS {
    public final XHpudBVT5 CBQ5d1kRq;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp implements RG2GI7LDp.mhl5lIdbQ {
        public final Set q3BipwRCk = new HashSet();

        public RG2GI7LDp(RG2GI7LDp rG2GI7LDp) {
            rG2GI7LDp.J4Ux7ym32("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.RG2GI7LDp.mhl5lIdbQ
        public Bundle q3BipwRCk() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.q3BipwRCk));
            return bundle;
        }
    }

    public Recreator(XHpudBVT5 xHpudBVT5) {
        this.CBQ5d1kRq = xHpudBVT5;
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        Class cls;
        if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_CREATE) {
            N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) bgHiMFrEI.GPLPRo6go();
            n0a4Shkkl.dIocxURUo("removeObserver");
            n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
            Bundle q3BipwRCk = this.CBQ5d1kRq.q3BipwRCk().q3BipwRCk("androidx.savedstate.Restarter");
            if (q3BipwRCk != null) {
                ArrayList<String> stringArrayList = q3BipwRCk.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            try {
                                Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(RG2GI7LDp.AbstractC0008RG2GI7LDp.class).getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((SavedStateHandleController.RG2GI7LDp) ((RG2GI7LDp.AbstractC0008RG2GI7LDp) declaredConstructor.newInstance(new Object[0]))).q3BipwRCk(this.CBQ5d1kRq);
                                } catch (Exception e) {
                                    throw new RuntimeException(UexvVay3o.q3BipwRCk("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Class");
                                q3BipwRCk2.append(cls.getSimpleName());
                                q3BipwRCk2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(q3BipwRCk2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(M5g57XBLr.q3BipwRCk("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
