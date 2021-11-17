package con;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class KYuHUB7GA {
    public static void J4Ux7ym32(WQpIMzWun wQpIMzWun, TextView textView, Integer num, CharSequence charSequence, int i, Typeface typeface, Integer num2, int i2) {
        CharSequence charSequence2 = null;
        Integer num3 = (i2 & 2) != 0 ? null : num;
        CharSequence charSequence3 = (i2 & 4) != 0 ? null : charSequence;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        Integer num4 = (i2 & 32) != 0 ? null : num2;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        } else {
            Integer valueOf = Integer.valueOf(i3);
            Context context = wQpIMzWun.WaUP0CF08;
            int intValue = num3 != null ? num3.intValue() : valueOf != null ? valueOf.intValue() : 0;
            if (intValue != 0) {
                charSequence2 = context.getResources().getText(intValue);
            }
        }
        if (charSequence2 != null) {
            ViewParent parent = textView.getParent();
            if (parent != null) {
                ((View) parent).setVisibility(0);
                textView.setVisibility(0);
                textView.setText(charSequence2);
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                xwNzMLspM.q3BipwRCk(xwNzMLspM.q3BipwRCk, textView, wQpIMzWun.WaUP0CF08, num4, null, 4);
                return;
            }
            throw new y5mNuzXIA("null cannot be cast to non-null type android.view.View");
        }
        textView.setVisibility(8);
    }

    public static boolean dIocxURUo(Context context, int i, boolean z) {
        TypedValue tGV7Q6urW = tGV7Q6urW(context, i);
        return (tGV7Q6urW == null || tGV7Q6urW.type != 18) ? z : tGV7Q6urW.data != 0;
    }

    public static final int iiGwOFFnr(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int kCA6Zs9sL(Context context, int i, String str) {
        TypedValue tGV7Q6urW = tGV7Q6urW(context, i);
        if (tGV7Q6urW != null) {
            return tGV7Q6urW.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final String q3BipwRCk(String str) {
        return new String(Base64.decode(str, 0), vey4CQMCh.q3BipwRCk);
    }

    public static TypedValue tGV7Q6urW(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
}
