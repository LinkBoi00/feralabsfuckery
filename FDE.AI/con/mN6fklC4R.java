package con;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public abstract class mN6fklC4R {
    public static void GPLPRo6go(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static boolean J4Ux7ym32(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean dIocxURUo(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void iiGwOFFnr(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void kCA6Zs9sL(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static int q3BipwRCk(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean tGV7Q6urW(View view) {
        return view.isLaidOut();
    }
}
