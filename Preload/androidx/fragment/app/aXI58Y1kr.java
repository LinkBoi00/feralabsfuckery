package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import con.fVMSvDhE6;
/* loaded from: classes.dex */
public enum aXI58Y1kr {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static aXI58Y1kr J4Ux7ym32(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        throw new IllegalArgumentException("Unknown visibility " + i);
    }

    public static aXI58Y1kr tGV7Q6urW(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : J4Ux7ym32(view.getVisibility());
    }

    public void q3BipwRCk(View view) {
        int i;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                i = 0;
            } else if (ordinal == 2) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                i = 8;
            } else if (ordinal == 3) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                i = 4;
            } else {
                return;
            }
            view.setVisibility(i);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (fVMSvDhE6.juJ6pnCpu(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }
}
