package con;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public abstract class lSxPlj8FZ {
    public static final Property J4Ux7ym32;
    public static final ZNRZ3lc8t q3BipwRCk;

    static {
        q3BipwRCk = Build.VERSION.SDK_INT >= 29 ? new YU1hmxeQu() : new mrqhBRukL();
        J4Ux7ym32 = new Igb0CxGE0(Float.class, "translationAlpha", 1);
        new kbQrvtmdo(Rect.class, "clipBounds", 1);
    }

    public static void J4Ux7ym32(View view, int i, int i2, int i3, int i4) {
        q3BipwRCk.iiGwOFFnr(view, i, i2, i3, i4);
    }

    public static float q3BipwRCk(View view) {
        return q3BipwRCk.dIocxURUo(view);
    }
}
