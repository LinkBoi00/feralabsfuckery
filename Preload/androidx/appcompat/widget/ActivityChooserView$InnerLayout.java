package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import con.C8A1BseZU;
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] CBQ5d1kRq = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CBQ5d1kRq);
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C8A1BseZU.q3BipwRCk(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
