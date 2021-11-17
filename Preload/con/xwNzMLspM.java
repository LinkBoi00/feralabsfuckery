package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class xwNzMLspM {
    public static final xwNzMLspM q3BipwRCk = new xwNzMLspM();

    public static void q3BipwRCk(xwNzMLspM xwnzmlspm, TextView textView, Context context, Integer num, Integer num2, int i) {
        int tGV7Q6urW;
        if (num != null && num != null && (tGV7Q6urW = tGV7Q6urW(xwnzmlspm, context, null, num, null, 10)) != 0) {
            textView.setTextColor(tGV7Q6urW);
        }
    }

    public static /* synthetic */ int tGV7Q6urW(xwNzMLspM xwnzmlspm, Context context, Integer num, Integer num2, gdEmqfwpT gdemqfwpt, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            gdemqfwpt = null;
        }
        return xwnzmlspm.J4Ux7ym32(context, num, num2, gdemqfwpt);
    }

    public final int J4Ux7ym32(Context context, Integer num, Integer num2, gdEmqfwpT gdemqfwpt) {
        int i = 0;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                return (color != 0 || gdemqfwpt == null) ? color : ((Number) gdemqfwpt.GPLPRo6go()).intValue();
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            if (num != null) {
                i = num.intValue();
            }
            Object obj = D856HTNqd.q3BipwRCk;
            return nHNpaD9No.q3BipwRCk(context, i);
        }
    }
}
