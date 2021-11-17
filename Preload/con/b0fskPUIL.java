package con;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class b0fskPUIL {
    public static boolean q3BipwRCk = true;

    public static void q3BipwRCk(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (q3BipwRCk) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                q3BipwRCk = false;
            }
        }
    }
}
