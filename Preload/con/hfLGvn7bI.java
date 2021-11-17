package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public abstract class hfLGvn7bI {
    public static final ThreadLocal q3BipwRCk = new ThreadLocal();
    public static final int[] J4Ux7ym32 = {-16842910};
    public static final int[] tGV7Q6urW = {16842908};
    public static final int[] dIocxURUo = {16842919};
    public static final int[] kCA6Zs9sL = {16842912};
    public static final int[] iiGwOFFnr = new int[0];
    public static final int[] GPLPRo6go = new int[1];

    public static int J4Ux7ym32(Context context, int i) {
        ColorStateList dIocxURUo2 = dIocxURUo(context, i);
        if (dIocxURUo2 != null && dIocxURUo2.isStateful()) {
            return dIocxURUo2.getColorForState(J4Ux7ym32, dIocxURUo2.getDefaultColor());
        }
        ThreadLocal threadLocal = q3BipwRCk;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int tGV7Q6urW2 = tGV7Q6urW(context, i);
        return R33DQrZIb.kCA6Zs9sL(tGV7Q6urW2, Math.round(((float) Color.alpha(tGV7Q6urW2)) * f));
    }

    public static ColorStateList dIocxURUo(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = GPLPRo6go;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void q3BipwRCk(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ZolH67hOx.oon79WMrY);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int tGV7Q6urW(Context context, int i) {
        int[] iArr = GPLPRo6go;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
