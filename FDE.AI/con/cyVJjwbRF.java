package con;

import android.view.View;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public abstract class cyVJjwbRF {
    public static WindowInsets J4Ux7ym32(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static WindowInsets q3BipwRCk(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void tGV7Q6urW(View view) {
        view.requestApplyInsets();
    }
}
