package con;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class uyyOxpvGH {

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
    }

    public static PorterDuff.Mode J4Ux7ym32(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean q3BipwRCk(View view) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return RBJDIwG1D.dIocxURUo(view) == 1;
    }
}
