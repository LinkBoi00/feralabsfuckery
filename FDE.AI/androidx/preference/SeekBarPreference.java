package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.d4mgv64gh;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int dfpT1j18n;
    public int i8XZMQc6Z;
    public int iMyQMM6Qj;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.yWvV4ePLl, R.attr.seekBarPreferenceStyle, 0);
        this.i8XZMQc6Z = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.i8XZMQc6Z;
        i = i < i2 ? i2 : i;
        if (i != this.dfpT1j18n) {
            this.dfpT1j18n = i;
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.iMyQMM6Qj) {
            this.iMyQMM6Qj = Math.min(this.dfpT1j18n - this.i8XZMQc6Z, Math.abs(i3));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
