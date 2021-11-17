package con;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class HZDtN0XJv {
    public static WeakReference J4Ux7ym32;
    public static ey4Vf0Eiu tGV7Q6urW;
    public static final HZDtN0XJv q3BipwRCk = new HZDtN0XJv();
    public static List dIocxURUo = new ArrayList();

    public static final ey4Vf0Eiu q3BipwRCk(Activity activity) {
        HZDtN0XJv hZDtN0XJv = q3BipwRCk;
        WeakReference weakReference = J4Ux7ym32;
        if (weakReference != null) {
            weakReference.clear();
        }
        IY2qRSx7X iY2qRSx7X = IY2qRSx7X.q3BipwRCk;
        IY2qRSx7X.dIocxURUo = null;
        J4Ux7ym32 = new WeakReference(activity);
        ey4Vf0Eiu ey4vf0eiu = new ey4Vf0Eiu(hZDtN0XJv);
        tGV7Q6urW = ey4vf0eiu;
        return ey4vf0eiu;
    }
}
