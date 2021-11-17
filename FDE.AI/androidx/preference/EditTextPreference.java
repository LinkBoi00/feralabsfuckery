package androidx.preference;

import android.content.res.TypedArray;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.feravolt.preload.R;
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
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968944(0x7f040170, float:1.7546556E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = con.BBVaGLNaU.kmSgne1rO(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = con.d4mgv64gh.tGV7Q6urW
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = con.BBVaGLNaU.Bhmn1KIah(r4, r1, r1, r1)
            if (r5 == 0) goto L_0x0029
            androidx.preference.EditTextPreference$RG2GI7LDp r5 = androidx.preference.EditTextPreference.RG2GI7LDp.q3BipwRCk
            if (r5 != 0) goto L_0x0025
            androidx.preference.EditTextPreference$RG2GI7LDp r5 = new androidx.preference.EditTextPreference$RG2GI7LDp
            r5.<init>()
            androidx.preference.EditTextPreference.RG2GI7LDp.q3BipwRCk = r5
        L_0x0025:
            androidx.preference.EditTextPreference$RG2GI7LDp r5 = androidx.preference.EditTextPreference.RG2GI7LDp.q3BipwRCk
            r3.WaUP0CF08 = r5
        L_0x0029:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
