package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
/* loaded from: classes.dex */
public final class srLS6zLvm {
    public static final PorterDuff.Mode J4Ux7ym32 = PorterDuff.Mode.SRC_IN;
    public static srLS6zLvm tGV7Q6urW;
    public b3J1OyZhd q3BipwRCk;

    public static void iiGwOFFnr(Drawable drawable, lNNWSSNDS lnnwssnds, int[] iArr) {
        PorterDuff.Mode mode = b3J1OyZhd.Puu3Rhg4F;
        if (!Y4wRqkFOh.q3BipwRCk(drawable) || drawable.mutate() == drawable) {
            boolean z = lnnwssnds.dIocxURUo;
            if (z || lnnwssnds.tGV7Q6urW) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? (ColorStateList) lnnwssnds.q3BipwRCk : null;
                PorterDuff.Mode mode2 = lnnwssnds.tGV7Q6urW ? (PorterDuff.Mode) lnnwssnds.J4Ux7ym32 : b3J1OyZhd.Puu3Rhg4F;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = b3J1OyZhd.GPLPRo6go(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public static synchronized void kCA6Zs9sL() {
        synchronized (srLS6zLvm.class) {
            if (tGV7Q6urW == null) {
                srLS6zLvm srls6zlvm = new srLS6zLvm();
                tGV7Q6urW = srls6zlvm;
                srls6zlvm.q3BipwRCk = b3J1OyZhd.tGV7Q6urW();
                b3J1OyZhd b3j1oyzhd = tGV7Q6urW.q3BipwRCk;
                lxnOH5yvO lxnoh5yvo = new lxnOH5yvO();
                synchronized (b3j1oyzhd) {
                    b3j1oyzhd.GPLPRo6go = lxnoh5yvo;
                }
            }
        }
    }

    public static synchronized srLS6zLvm q3BipwRCk() {
        srLS6zLvm srls6zlvm;
        synchronized (srLS6zLvm.class) {
            if (tGV7Q6urW == null) {
                kCA6Zs9sL();
            }
            srls6zlvm = tGV7Q6urW;
        }
        return srls6zlvm;
    }

    public static synchronized PorterDuffColorFilter tGV7Q6urW(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter GPLPRo6go;
        synchronized (srLS6zLvm.class) {
            GPLPRo6go = b3J1OyZhd.GPLPRo6go(i, mode);
        }
        return GPLPRo6go;
    }

    public synchronized Drawable J4Ux7ym32(Context context, int i) {
        return this.q3BipwRCk.kCA6Zs9sL(context, i);
    }

    public synchronized ColorStateList dIocxURUo(Context context, int i) {
        return this.q3BipwRCk.Puu3Rhg4F(context, i);
    }
}
