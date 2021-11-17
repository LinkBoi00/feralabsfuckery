package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BBVaGLNaU.kmSgne1rO(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.J4Ux7ym32, i, i2);
        BBVaGLNaU.WaUP0CF08(obtainStyledAttributes, 9, 0);
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        if (obtainStyledAttributes.getString(11) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(10) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
