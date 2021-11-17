package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class ba8VhBGaI {
    public static final int[] q3BipwRCk = {16842752, R.attr.theme};
    public static final int[] J4Ux7ym32 = {R.attr.materialThemeOverlay};

    public static Context q3BipwRCk(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J4Ux7ym32, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof fnUv4KsJz) && ((fnUv4KsJz) context).q3BipwRCk == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        fnUv4KsJz fnuv4ksjz = new fnUv4KsJz(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, q3BipwRCk);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        resourceId2 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
        }
        if (resourceId2 != 0) {
            fnuv4ksjz.getTheme().applyStyle(resourceId2, true);
        }
        return fnuv4ksjz;
    }
}
