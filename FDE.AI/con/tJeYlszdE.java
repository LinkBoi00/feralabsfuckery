package con;

import android.view.View;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public abstract class tJeYlszdE {
    public static int J4Ux7ym32(View view) {
        return view.getScrollIndicators();
    }

    public static void dIocxURUo(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static o8nscdGif q3BipwRCk(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        o8nscdGif yWvV4ePLl = o8nscdGif.yWvV4ePLl(rootWindowInsets, null);
        yWvV4ePLl.q3BipwRCk.kmSgne1rO(yWvV4ePLl);
        yWvV4ePLl.q3BipwRCk.dIocxURUo(view.getRootView());
        return yWvV4ePLl;
    }

    public static void tGV7Q6urW(View view, int i) {
        view.setScrollIndicators(i);
    }
}
