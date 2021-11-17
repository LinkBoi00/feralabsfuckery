package con;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Sbmhu0GOE implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ View J4Ux7ym32;
    public o8nscdGif q3BipwRCk = null;
    public final /* synthetic */ N1zulf8pH tGV7Q6urW;

    public Sbmhu0GOE(View view, N1zulf8pH n1zulf8pH) {
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = n1zulf8pH;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o8nscdGif yWvV4ePLl = o8nscdGif.yWvV4ePLl(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            mJLaJepZo.q3BipwRCk(windowInsets, this.J4Ux7ym32);
            if (yWvV4ePLl.equals(this.q3BipwRCk)) {
                return this.tGV7Q6urW.J4Ux7ym32(view, yWvV4ePLl).GPLPRo6go();
            }
        }
        this.q3BipwRCk = yWvV4ePLl;
        o8nscdGif J4Ux7ym32 = this.tGV7Q6urW.J4Ux7ym32(view, yWvV4ePLl);
        if (i >= 30) {
            return J4Ux7ym32.GPLPRo6go();
        }
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(view);
        return J4Ux7ym32.GPLPRo6go();
    }
}
