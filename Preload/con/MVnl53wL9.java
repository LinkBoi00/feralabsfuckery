package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
/* loaded from: classes.dex */
public abstract class MVnl53wL9 {
    public static List<Rect> J4Ux7ym32(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void dIocxURUo(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static View.AccessibilityDelegate q3BipwRCk(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void tGV7Q6urW(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }
}
