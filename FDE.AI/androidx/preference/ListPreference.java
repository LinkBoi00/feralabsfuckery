package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public String cAwN510t2;
    public CharSequence[] dfpT1j18n;
    public CharSequence[] i8XZMQc6Z;
    public String iMyQMM6Qj;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp implements Preference.RG2GI7LDp {
        public static RG2GI7LDp q3BipwRCk;

        @Override // androidx.preference.Preference.RG2GI7LDp
        public CharSequence q3BipwRCk(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.iiGwOFFnr()) ? listPreference.CBQ5d1kRq.getString(R.string.not_set) : listPreference.iiGwOFFnr();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BBVaGLNaU.kmSgne1rO(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public CharSequence iiGwOFFnr() {
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        String str = this.iMyQMM6Qj;
        int i = -1;
        if (str != null && (charSequenceArr2 = this.dfpT1j18n) != null) {
            int length = charSequenceArr2.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (this.dfpT1j18n[length].equals(str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        if (i < 0 || (charSequenceArr = this.i8XZMQc6Z) == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    @Override // androidx.preference.Preference
    public CharSequence q3BipwRCk() {
        Preference.RG2GI7LDp rG2GI7LDp = this.WaUP0CF08;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.q3BipwRCk(this);
        }
        CharSequence iiGwOFFnr = iiGwOFFnr();
        CharSequence q3BipwRCk = super.q3BipwRCk();
        String str = this.cAwN510t2;
        if (str == null) {
            return q3BipwRCk;
        }
        Object[] objArr = new Object[1];
        if (iiGwOFFnr == null) {
            iiGwOFFnr = "";
        }
        objArr[0] = iiGwOFFnr;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, q3BipwRCk)) {
            return q3BipwRCk;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.dIocxURUo, i, i2);
        this.i8XZMQc6Z = BBVaGLNaU.dfpT1j18n(obtainStyledAttributes, 2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(3);
        this.dfpT1j18n = textArray == null ? obtainStyledAttributes.getTextArray(1) : textArray;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (RG2GI7LDp.q3BipwRCk == null) {
                RG2GI7LDp.q3BipwRCk = new RG2GI7LDp();
            }
            this.WaUP0CF08 = RG2GI7LDp.q3BipwRCk;
            tGV7Q6urW();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d4mgv64gh.iiGwOFFnr, i, i2);
        this.cAwN510t2 = BBVaGLNaU.WaUP0CF08(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
