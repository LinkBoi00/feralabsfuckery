package con;

import android.view.View;
/* loaded from: classes.dex */
public class M7tdG3F08 implements View.OnFocusChangeListener {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public M7tdG3F08(vC6Qh7mvD vc6qh7mvd) {
        this.J4Ux7ym32 = vc6qh7mvd;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        switch (this.q3BipwRCk) {
            case 0:
                vC6Qh7mvD vc6qh7mvd = (vC6Qh7mvD) this.J4Ux7ym32;
                vc6qh7mvd.kCA6Zs9sL(vC6Qh7mvD.dIocxURUo(vc6qh7mvd));
                return;
            default:
                ((rf3cOyxnl) this.J4Ux7ym32).q3BipwRCk.setEndIconActivated(z);
                if (!z) {
                    rf3cOyxnl.iiGwOFFnr((rf3cOyxnl) this.J4Ux7ym32, false);
                    ((rf3cOyxnl) this.J4Ux7ym32).oon79WMrY = false;
                    return;
                }
                return;
        }
    }

    public M7tdG3F08(rf3cOyxnl rf3coyxnl) {
        this.J4Ux7ym32 = rf3coyxnl;
    }
}
