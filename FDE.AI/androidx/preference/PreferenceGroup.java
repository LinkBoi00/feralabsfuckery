package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import con.BBVaGLNaU;
import con.d4mgv64gh;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public List i8XZMQc6Z;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new Handler();
        this.i8XZMQc6Z = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.GPLPRo6go, i, i2);
        BBVaGLNaU.Bhmn1KIah(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)) != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.MzoOEjc4X))) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        obtainStyledAttributes.recycle();
    }
}
