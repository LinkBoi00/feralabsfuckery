package con;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* loaded from: classes.dex */
public abstract class dUHWk3ytt {
    public static final float J4Ux7ym32(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect);
        }
        return 0.0f;
    }

    public static final EdgeEffect q3BipwRCk(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? kzRylvL0f.q3BipwRCk.q3BipwRCk(context, null) : new EdgeEffect(context);
    }

    public static final float tGV7Q6urW(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kzRylvL0f.q3BipwRCk.tGV7Q6urW(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
