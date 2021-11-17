package con;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class blGiSoWm3 {
    public static final ThreadLocal q3BipwRCk = new ThreadLocal();
    public static final ThreadLocal J4Ux7ym32 = new ThreadLocal();

    public static void q3BipwRCk(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            q3BipwRCk(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
