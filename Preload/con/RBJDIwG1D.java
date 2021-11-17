package con;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;
/* loaded from: classes.dex */
public abstract class RBJDIwG1D {
    public static boolean GPLPRo6go(View view) {
        return view.isPaddingRelative();
    }

    public static Display J4Ux7ym32(View view) {
        return view.getDisplay();
    }

    public static void Puu3Rhg4F(View view, int i) {
        view.setLabelFor(i);
    }

    public static int dIocxURUo(View view) {
        return view.getLayoutDirection();
    }

    public static int iiGwOFFnr(View view) {
        return view.getPaddingStart();
    }

    public static int kCA6Zs9sL(View view) {
        return view.getPaddingEnd();
    }

    public static void oon79WMrY(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static int q3BipwRCk() {
        return View.generateViewId();
    }

    public static int tGV7Q6urW(View view) {
        return view.getLabelFor();
    }

    public static void vPSbyrYWX(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static void yWvV4ePLl(View view, Paint paint) {
        view.setLayerPaint(paint);
    }
}
