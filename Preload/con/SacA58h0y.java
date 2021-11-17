package con;

import android.os.Build;
/* loaded from: classes.dex */
public abstract class SacA58h0y {
    public static boolean q3BipwRCk() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (!(!"REL".equals(str) && str.compareTo("S") >= 0)) {
                return false;
            }
        }
        return true;
    }
}
