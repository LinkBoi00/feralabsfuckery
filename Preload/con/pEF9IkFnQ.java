package con;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public class pEF9IkFnQ extends XflkRyC2J {
    public final /* synthetic */ CheckableImageButton dIocxURUo;

    public pEF9IkFnQ(CheckableImageButton checkableImageButton) {
        this.dIocxURUo = checkableImageButton;
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
        iqwHQ6O2l.q3BipwRCk.setCheckable(this.dIocxURUo.PSTqBLTET);
        iqwHQ6O2l.q3BipwRCk.setChecked(this.dIocxURUo.isChecked());
    }

    @Override // con.XflkRyC2J
    public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.dIocxURUo.isChecked());
    }
}
