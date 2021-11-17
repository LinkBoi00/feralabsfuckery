package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.feravolt.preload.R;
import con.BBVaGLNaU;
import con.d4mgv64gh;
import java.util.Objects;
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final RG2GI7LDp CpG0imbht = new RG2GI7LDp();
    public CharSequence nlGCs0NZs;
    public CharSequence qFBXIgpia;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements CompoundButton.OnCheckedChangeListener {
        public RG2GI7LDp() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreferenceCompat.this);
            SwitchPreferenceCompat.this.iiGwOFFnr(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.vPSbyrYWX, R.attr.switchPreferenceCompatStyle, 0);
        this.dfpT1j18n = BBVaGLNaU.WaUP0CF08(obtainStyledAttributes, 7, 0);
        String string = obtainStyledAttributes.getString(6);
        this.iMyQMM6Qj = string == null ? obtainStyledAttributes.getString(1) : string;
        String string2 = obtainStyledAttributes.getString(9);
        this.qFBXIgpia = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        String string3 = obtainStyledAttributes.getString(8);
        this.nlGCs0NZs = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        this.IytU16YUK = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
