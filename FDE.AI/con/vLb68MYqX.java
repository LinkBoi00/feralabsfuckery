package con;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class vLb68MYqX extends DGdyNqLvN {
    public final /* synthetic */ mVCAZ6E2C tGV7Q6urW;

    public vLb68MYqX(mVCAZ6E2C mvcaz6e2c) {
        this.tGV7Q6urW = mvcaz6e2c;
    }

    @Override // con.DGdyNqLvN
    public IqwHQ6O2l J4Ux7ym32(int i) {
        int i2 = i == 2 ? this.tGV7Q6urW.vPSbyrYWX : this.tGV7Q6urW.CBQ5d1kRq;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return new IqwHQ6O2l(AccessibilityNodeInfo.obtain(this.tGV7Q6urW.PSTqBLTET(i2).q3BipwRCk));
    }

    @Override // con.DGdyNqLvN
    public boolean kCA6Zs9sL(int i, int i2, Bundle bundle) {
        int i3;
        mVCAZ6E2C mvcaz6e2c = this.tGV7Q6urW;
        if (i != -1) {
            boolean z = true;
            if (i2 == 1) {
                return mvcaz6e2c.qVUwofr5s(i);
            }
            if (i2 == 2) {
                return mvcaz6e2c.vPSbyrYWX(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? mvcaz6e2c.MzoOEjc4X(i, i2, bundle) : mvcaz6e2c.oon79WMrY(i);
            }
            z = false;
            if (mvcaz6e2c.Puu3Rhg4F.isEnabled() && mvcaz6e2c.Puu3Rhg4F.isTouchExplorationEnabled() && (i3 = mvcaz6e2c.vPSbyrYWX) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    mvcaz6e2c.oon79WMrY(i3);
                }
                mvcaz6e2c.vPSbyrYWX = i;
                mvcaz6e2c.yWvV4ePLl.invalidate();
                mvcaz6e2c.Eeka1udhb(i, 32768);
            }
            return z;
        }
        View view = mvcaz6e2c.yWvV4ePLl;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return VCCyeOu6I.oon79WMrY(view, i2, bundle);
    }

    @Override // con.DGdyNqLvN
    public IqwHQ6O2l q3BipwRCk(int i) {
        return new IqwHQ6O2l(AccessibilityNodeInfo.obtain(this.tGV7Q6urW.PSTqBLTET(i).q3BipwRCk));
    }
}
