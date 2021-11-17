package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public CharSequence Bhmn1KIah;
    public Context CBQ5d1kRq;
    public boolean Eeka1udhb;
    public String MzoOEjc4X;
    public CharSequence PSTqBLTET;
    public Object RG6kpfv3v;
    public RG2GI7LDp WaUP0CF08;
    public boolean dXrmkklc8;
    public String ilHKhw3Yw;
    public boolean ixWaw2akD;
    public int kmSgne1rO;
    public boolean qVUwofr5s;
    public boolean sk5s77z6Q;

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
        CharSequence q3BipwRCk(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BBVaGLNaU.kmSgne1rO(context, R.attr.preferenceStyle, 16842894), 0);
    }

    public boolean J4Ux7ym32() {
        return this.qVUwofr5s && this.ixWaw2akD && this.sk5s77z6Q;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.kmSgne1rO;
        int i2 = preference2.kmSgne1rO;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.Bhmn1KIah;
        CharSequence charSequence2 = preference2.Bhmn1KIah;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.Bhmn1KIah.toString());
    }

    public Object dIocxURUo(TypedArray typedArray, int i) {
        return null;
    }

    public boolean kCA6Zs9sL() {
        return !J4Ux7ym32();
    }

    public CharSequence q3BipwRCk() {
        RG2GI7LDp rG2GI7LDp = this.WaUP0CF08;
        return rG2GI7LDp != null ? rG2GI7LDp.q3BipwRCk(this) : this.PSTqBLTET;
    }

    public void tGV7Q6urW() {
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.Bhmn1KIah;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence q3BipwRCk = q3BipwRCk();
        if (!TextUtils.isEmpty(q3BipwRCk)) {
            sb.append(q3BipwRCk);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
        if (r4.hasValue(11) != false) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Preference(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
