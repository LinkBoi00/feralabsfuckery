package con;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import com.feravolt.preload.R;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Pf8Spcrui extends I6sO15l0X {
    public final Rect dIocxURUo;
    public Drawable tGV7Q6urW;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Pf8Spcrui(Context context) {
        super(r6, r15 == null ? 0 : r15.data);
        TypedValue tGV7Q6urW = KYuHUB7GA.tGV7Q6urW(context, R.attr.materialAlertDialogTheme);
        int i = tGV7Q6urW == null ? 0 : tGV7Q6urW.data;
        Context q3BipwRCk = ba8VhBGaI.q3BipwRCk(context, null, R.attr.alertDialogStyle, 2131820860);
        q3BipwRCk = i != 0 ? new fnUv4KsJz(q3BipwRCk, i) : q3BipwRCk;
        TypedValue tGV7Q6urW2 = KYuHUB7GA.tGV7Q6urW(context, R.attr.materialAlertDialogTheme);
        Context tGV7Q6urW3 = tGV7Q6urW();
        Resources.Theme theme = tGV7Q6urW3.getTheme();
        int[] iArr = RisoK3egD.oon79WMrY;
        hF1hMObUZ.q3BipwRCk(tGV7Q6urW3, null, R.attr.alertDialogStyle, 2131820860);
        hF1hMObUZ.J4Ux7ym32(tGV7Q6urW3, null, iArr, R.attr.alertDialogStyle, 2131820860, new int[0]);
        TypedArray obtainStyledAttributes = tGV7Q6urW3.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, 2131820860);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, tGV7Q6urW3.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, tGV7Q6urW3.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, tGV7Q6urW3.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, tGV7Q6urW3.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        if (tGV7Q6urW3.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.dIocxURUo = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int kCA6Zs9sL = KYuHUB7GA.kCA6Zs9sL(tGV7Q6urW3, R.attr.colorSurface, Pf8Spcrui.class.getCanonicalName());
        dOSsQaJVg dossqajvg = new dOSsQaJVg(tGV7Q6urW3, null, R.attr.alertDialogStyle, 2131820860);
        dossqajvg.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(tGV7Q6urW3);
        dossqajvg.sk5s77z6Q();
        dossqajvg.MzoOEjc4X(ColorStateList.valueOf(kCA6Zs9sL));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(tGV7Q6urW().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                dossqajvg.CBQ5d1kRq.q3BipwRCk = dossqajvg.CBQ5d1kRq.q3BipwRCk.kCA6Zs9sL(dimension);
                dossqajvg.invalidateSelf();
            }
        }
        this.tGV7Q6urW = dossqajvg;
    }

    @Override // con.I6sO15l0X
    public I6sO15l0X GPLPRo6go(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        super.GPLPRo6go(listAdapter, i, onClickListener);
        return this;
    }

    @Override // con.I6sO15l0X
    public I6sO15l0X Puu3Rhg4F(CharSequence charSequence) {
        ((V8gQUs5xA) this.q3BipwRCk).kCA6Zs9sL = charSequence;
        return this;
    }

    @Override // con.I6sO15l0X
    public dF3gF5M3i q3BipwRCk() {
        dF3gF5M3i q3BipwRCk = super.q3BipwRCk();
        Window window = q3BipwRCk.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.tGV7Q6urW;
        if (drawable instanceof dOSsQaJVg) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            ((dOSsQaJVg) drawable).PSTqBLTET(mJLaJepZo.yWvV4ePLl(decorView));
        }
        Drawable drawable2 = this.tGV7Q6urW;
        Rect rect = this.dIocxURUo;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ouK4dv6x7(q3BipwRCk, this.dIocxURUo));
        return q3BipwRCk;
    }

    public Pf8Spcrui vPSbyrYWX(CharSequence charSequence) {
        ((V8gQUs5xA) this.q3BipwRCk).kCA6Zs9sL = charSequence;
        return this;
    }
}
