package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
import java.util.HashSet;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int kmSgne1rO = BBVaGLNaU.kmSgne1rO(context, R.attr.dialogPreferenceStyle, 16842897);
        new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.kCA6Zs9sL, kmSgne1rO, 0);
        BBVaGLNaU.dfpT1j18n(obtainStyledAttributes, 2, 0);
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
