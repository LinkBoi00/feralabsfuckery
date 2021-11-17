package con;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class o8nscdGif {
    public static final o8nscdGif J4Ux7ym32;
    public final rH0APD7hz q3BipwRCk;

    static {
        J4Ux7ym32 = Build.VERSION.SDK_INT >= 30 ? SBL7lL1f4.ilHKhw3Yw : rH0APD7hz.J4Ux7ym32;
    }

    public o8nscdGif(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.q3BipwRCk = i >= 30 ? new SBL7lL1f4(this, windowInsets) : i >= 29 ? new BsKZm9xWR(this, windowInsets) : i >= 28 ? new PgEZIZSin(this, windowInsets) : new TWeXN7eAR(this, windowInsets);
    }

    public o8nscdGif(o8nscdGif o8nscdgif) {
        this.q3BipwRCk = new rH0APD7hz(this);
    }

    public static o8nscdGif Puu3Rhg4F(WindowInsets windowInsets) {
        return yWvV4ePLl(windowInsets, null);
    }

    public static BWdUDHRcA kCA6Zs9sL(BWdUDHRcA bWdUDHRcA, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bWdUDHRcA.q3BipwRCk - i);
        int max2 = Math.max(0, bWdUDHRcA.J4Ux7ym32 - i2);
        int max3 = Math.max(0, bWdUDHRcA.tGV7Q6urW - i3);
        int max4 = Math.max(0, bWdUDHRcA.dIocxURUo - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bWdUDHRcA : BWdUDHRcA.q3BipwRCk(max, max2, max3, max4);
    }

    public static o8nscdGif yWvV4ePLl(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        o8nscdGif o8nscdgif = new o8nscdGif(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mN6fklC4R.J4Ux7ym32(view)) {
                o8nscdgif.q3BipwRCk.kmSgne1rO(tJeYlszdE.q3BipwRCk(view));
                o8nscdgif.q3BipwRCk.dIocxURUo(view.getRootView());
            }
        }
        return o8nscdgif;
    }

    public WindowInsets GPLPRo6go() {
        rH0APD7hz rh0apd7hz = this.q3BipwRCk;
        if (rh0apd7hz instanceof FYfEv1QIw) {
            return ((FYfEv1QIw) rh0apd7hz).tGV7Q6urW;
        }
        return null;
    }

    @Deprecated
    public int J4Ux7ym32() {
        return this.q3BipwRCk.Puu3Rhg4F().q3BipwRCk;
    }

    @Deprecated
    public int dIocxURUo() {
        return this.q3BipwRCk.Puu3Rhg4F().J4Ux7ym32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8nscdGif)) {
            return false;
        }
        return Objects.equals(this.q3BipwRCk, ((o8nscdGif) obj).q3BipwRCk);
    }

    public int hashCode() {
        rH0APD7hz rh0apd7hz = this.q3BipwRCk;
        if (rh0apd7hz == null) {
            return 0;
        }
        return rh0apd7hz.hashCode();
    }

    public boolean iiGwOFFnr() {
        return this.q3BipwRCk.oon79WMrY();
    }

    @Deprecated
    public int q3BipwRCk() {
        return this.q3BipwRCk.Puu3Rhg4F().dIocxURUo;
    }

    @Deprecated
    public int tGV7Q6urW() {
        return this.q3BipwRCk.Puu3Rhg4F().tGV7Q6urW;
    }
}
