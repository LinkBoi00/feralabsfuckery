package con;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class mJLaJepZo {
    public static boolean Bhmn1KIah(View view) {
        return view.hasNestedScrollingParent();
    }

    public static float CBQ5d1kRq(View view) {
        return view.getTranslationZ();
    }

    public static void Eeka1udhb(View view, float f) {
        view.setElevation(f);
    }

    public static ColorStateList GPLPRo6go(View view) {
        return view.getBackgroundTintList();
    }

    public static o8nscdGif J4Ux7ym32(View view, o8nscdGif o8nscdgif, Rect rect) {
        WindowInsets GPLPRo6go = o8nscdgif.GPLPRo6go();
        if (GPLPRo6go != null) {
            return o8nscdGif.yWvV4ePLl(view.computeSystemWindowInsets(GPLPRo6go, rect), view);
        }
        rect.setEmpty();
        return o8nscdgif;
    }

    public static boolean MzoOEjc4X(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean PSTqBLTET(View view) {
        return view.isImportantForAccessibility();
    }

    public static PorterDuff.Mode Puu3Rhg4F(View view) {
        return view.getBackgroundTintMode();
    }

    public static void RG6kpfv3v(View view, N1zulf8pH n1zulf8pH) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, n1zulf8pH);
        }
        if (n1zulf8pH == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new Sbmhu0GOE(view, n1zulf8pH));
        }
    }

    public static void WaUP0CF08(View view, float f) {
        view.setZ(f);
    }

    public static boolean dIocxURUo(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static void dXrmkklc8(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void dfpT1j18n(View view) {
        view.stopNestedScroll();
    }

    public static boolean i8XZMQc6Z(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static boolean iiGwOFFnr(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static void ilHKhw3Yw(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void ixWaw2akD(View view, String str) {
        view.setTransitionName(str);
    }

    public static boolean kCA6Zs9sL(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static float kmSgne1rO(View view) {
        return view.getZ();
    }

    public static o8nscdGif oon79WMrY(View view) {
        if (!FUWOsaSh1.dIocxURUo || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = FUWOsaSh1.q3BipwRCk.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) FUWOsaSh1.J4Ux7ym32.get(obj);
            Rect rect2 = (Rect) FUWOsaSh1.tGV7Q6urW.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            fPr2OzCjq qprz6rQ4P = i >= 30 ? new Qprz6rQ4P() : i >= 29 ? new TLfAYfc8I() : new Vo8lDzQhu();
            qprz6rQ4P.tGV7Q6urW(BWdUDHRcA.q3BipwRCk(rect.left, rect.top, rect.right, rect.bottom));
            qprz6rQ4P.dIocxURUo(BWdUDHRcA.q3BipwRCk(rect2.left, rect2.top, rect2.right, rect2.bottom));
            o8nscdGif J4Ux7ym32 = qprz6rQ4P.J4Ux7ym32();
            J4Ux7ym32.q3BipwRCk.kmSgne1rO(J4Ux7ym32);
            J4Ux7ym32.q3BipwRCk.dIocxURUo(view.getRootView());
            return J4Ux7ym32;
        } catch (IllegalAccessException e) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Failed to get insets from AttachInfo. ");
            q3BipwRCk.append(e.getMessage());
            Log.w("WindowInsetsCompat", q3BipwRCk.toString(), e);
            return null;
        }
    }

    public static void q3BipwRCk(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void qVUwofr5s(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void sk5s77z6Q(View view, float f) {
        view.setTranslationZ(f);
    }

    public static boolean tGV7Q6urW(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static String vPSbyrYWX(View view) {
        return view.getTransitionName();
    }

    public static float yWvV4ePLl(View view) {
        return view.getElevation();
    }
}
