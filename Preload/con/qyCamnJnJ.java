package con;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class qyCamnJnJ {
    public static Method q3BipwRCk;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            q3BipwRCk = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                q3BipwRCk.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean J4Ux7ym32(View view) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return RBJDIwG1D.dIocxURUo(view) == 1;
    }

    public static void q3BipwRCk(View view, Rect rect, Rect rect2) {
        Method method = q3BipwRCk;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
