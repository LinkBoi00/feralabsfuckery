package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp implements Preference.RG2GI7LDp {
        public static RG2GI7LDp q3BipwRCk;

        @Override // androidx.preference.Preference.RG2GI7LDp
        public CharSequence q3BipwRCk(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            if (TextUtils.isEmpty(null)) {
                return editTextPreference.CBQ5d1kRq.getString(R.string.not_set);
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int kmSgne1rO = BBVaGLNaU.kmSgne1rO(context, R.attr.editTextPreferenceStyle, 16842898);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.tGV7Q6urW, kmSgne1rO, 0);
        if (BBVaGLNaU.Bhmn1KIah(obtainStyledAttributes, 0, 0, false)) {
            if (RG2GI7LDp.q3BipwRCk == null) {
                RG2GI7LDp.q3BipwRCk = new RG2GI7LDp();
            }
            this.WaUP0CF08 = RG2GI7LDp.q3BipwRCk;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
