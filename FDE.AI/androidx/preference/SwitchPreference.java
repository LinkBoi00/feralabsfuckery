package androidx.preference;

import android.widget.CompoundButton;
import java.util.Objects;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final RG2GI7LDp CpG0imbht = new RG2GI7LDp();
    public CharSequence nlGCs0NZs;
    public CharSequence qFBXIgpia;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements CompoundButton.OnCheckedChangeListener {
        public RG2GI7LDp() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreference.this);
            SwitchPreference.this.iiGwOFFnr(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = con.BBVaGLNaU.kmSgne1rO(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$RG2GI7LDp r2 = new androidx.preference.SwitchPreference$RG2GI7LDp
            r2.<init>()
            r3.CpG0imbht = r2
            int[] r2 = con.d4mgv64gh.oon79WMrY
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = con.BBVaGLNaU.WaUP0CF08(r4, r5, r1)
            r3.dfpT1j18n = r5
            r5 = 6
            r0 = 1
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x002e
            java.lang.String r5 = r4.getString(r0)
        L_0x002e:
            r3.iMyQMM6Qj = r5
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x003d
            java.lang.String r5 = r4.getString(r0)
        L_0x003d:
            r3.qFBXIgpia = r5
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x004c
            java.lang.String r5 = r4.getString(r0)
        L_0x004c:
            r3.nlGCs0NZs = r5
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.IytU16YUK = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
