package con;

import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class sFazzyHPy implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ rf3cOyxnl q3BipwRCk;

    public sFazzyHPy(rf3cOyxnl rf3coyxnl) {
        this.q3BipwRCk = rf3coyxnl;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        rf3cOyxnl rf3coyxnl = this.q3BipwRCk;
        rf3coyxnl.oon79WMrY = true;
        rf3coyxnl.CBQ5d1kRq = System.currentTimeMillis();
        rf3cOyxnl.iiGwOFFnr(this.q3BipwRCk, false);
    }
}
