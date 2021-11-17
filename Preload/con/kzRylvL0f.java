package con;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* loaded from: classes.dex */
public final class kzRylvL0f {
    public static final kzRylvL0f q3BipwRCk = new kzRylvL0f();

    public final float J4Ux7ym32(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final EdgeEffect q3BipwRCk(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float tGV7Q6urW(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
