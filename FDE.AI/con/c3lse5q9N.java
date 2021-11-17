package con;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class c3lse5q9N extends TextInputLayout.s7MlVynBG {
    public final /* synthetic */ rf3cOyxnl kCA6Zs9sL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3lse5q9N(rf3cOyxnl rf3coyxnl, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.kCA6Zs9sL = rf3coyxnl;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.s7MlVynBG, con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        super.dIocxURUo(view, iqwHQ6O2l);
        if (!rf3cOyxnl.kCA6Zs9sL(this.kCA6Zs9sL.q3BipwRCk.getEditText())) {
            iqwHQ6O2l.q3BipwRCk.setClassName(Spinner.class.getName());
        }
        if (iqwHQ6O2l.q3BipwRCk.isShowingHintText()) {
            iqwHQ6O2l.q3BipwRCk.setHintText(null);
        }
    }

    @Override // con.XflkRyC2J
    public void kCA6Zs9sL(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onPopulateAccessibilityEvent(view, accessibilityEvent);
        AutoCompleteTextView dIocxURUo = rf3cOyxnl.dIocxURUo(this.kCA6Zs9sL.q3BipwRCk.getEditText());
        if (accessibilityEvent.getEventType() == 1 && this.kCA6Zs9sL.PSTqBLTET.isTouchExplorationEnabled() && !rf3cOyxnl.kCA6Zs9sL(this.kCA6Zs9sL.q3BipwRCk.getEditText())) {
            rf3cOyxnl.GPLPRo6go(this.kCA6Zs9sL, dIocxURUo);
        }
    }
}
