package con;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes.dex */
public abstract class zDglqb3ZC {
    public static boolean J4Ux7ym32(View view) {
        return view.isInLayout();
    }

    public static Rect q3BipwRCk(View view) {
        return view.getClipBounds();
    }

    public static void tGV7Q6urW(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
