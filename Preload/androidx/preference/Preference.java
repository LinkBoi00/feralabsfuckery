package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
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
    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.kmSgne1rO = Integer.MAX_VALUE;
        this.qVUwofr5s = true;
        this.Eeka1udhb = true;
        this.dXrmkklc8 = true;
        this.ixWaw2akD = true;
        this.sk5s77z6Q = true;
        this.CBQ5d1kRq = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.iiGwOFFnr, i, i2);
        BBVaGLNaU.RG6kpfv3v(obtainStyledAttributes, 23, 0, 0);
        String string = obtainStyledAttributes.getString(26);
        this.MzoOEjc4X = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.Bhmn1KIah = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.PSTqBLTET = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.kmSgne1rO = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.ilHKhw3Yw = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.qVUwofr5s = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.Eeka1udhb = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.dXrmkklc8 = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.getString(19) == null) {
            obtainStyledAttributes.getString(10);
        }
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.Eeka1udhb));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.Eeka1udhb));
        int i3 = !obtainStyledAttributes.hasValue(18) ? 11 : 18;
        this.RG6kpfv3v = dIocxURUo(obtainStyledAttributes, i3);
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }
}
