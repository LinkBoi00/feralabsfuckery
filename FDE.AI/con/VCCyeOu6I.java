package con;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;
/* loaded from: classes.dex */
public abstract class VCCyeOu6I {
    public static void Bhmn1KIah(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void CBQ5d1kRq(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    public static void Eeka1udhb(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static int GPLPRo6go(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean J4Ux7ym32(View view) {
        return view.getFitsSystemWindows();
    }

    public static void MzoOEjc4X(View view) {
        view.requestFitSystemWindows();
    }

    public static void PSTqBLTET(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static boolean Puu3Rhg4F(View view) {
        return view.hasOverlappingRendering();
    }

    public static int dIocxURUo(View view) {
        return view.getMinimumHeight();
    }

    public static ViewParent iiGwOFFnr(View view) {
        return view.getParentForAccessibility();
    }

    public static void ilHKhw3Yw(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int kCA6Zs9sL(View view) {
        return view.getMinimumWidth();
    }

    public static void kmSgne1rO(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static boolean oon79WMrY(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static AccessibilityNodeProvider q3BipwRCk(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static void qVUwofr5s(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static int tGV7Q6urW(View view) {
        return view.getImportantForAccessibility();
    }

    public static void vPSbyrYWX(View view) {
        view.postInvalidateOnAnimation();
    }

    public static boolean yWvV4ePLl(View view) {
        return view.hasTransientState();
    }
}
