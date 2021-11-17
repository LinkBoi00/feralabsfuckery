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
public class CheckBoxPreference extends TwoStatePreference {
    public final RG2GI7LDp CpG0imbht = new RG2GI7LDp();

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements CompoundButton.OnCheckedChangeListener {
        public RG2GI7LDp() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(CheckBoxPreference.this);
            CheckBoxPreference.this.iiGwOFFnr(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int kmSgne1rO = BBVaGLNaU.kmSgne1rO(context, R.attr.checkBoxPreferenceStyle, 16842895);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4mgv64gh.q3BipwRCk, kmSgne1rO, 0);
        this.dfpT1j18n = BBVaGLNaU.WaUP0CF08(obtainStyledAttributes, 5, 0);
        String string = obtainStyledAttributes.getString(4);
        this.iMyQMM6Qj = string == null ? obtainStyledAttributes.getString(1) : string;
        this.IytU16YUK = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
