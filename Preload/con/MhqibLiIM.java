package con;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class MhqibLiIM extends yXzWc1b4D {
    public final /* synthetic */ int CBQ5d1kRq = 1;
    public final /* synthetic */ Object kmSgne1rO;

    public MhqibLiIM(rf3cOyxnl rf3coyxnl) {
        this.kmSgne1rO = rf3coyxnl;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.CBQ5d1kRq) {
            case 0:
                AutoCompleteTextView dIocxURUo = rf3cOyxnl.dIocxURUo(((rf3cOyxnl) this.kmSgne1rO).q3BipwRCk.getEditText());
                if (((rf3cOyxnl) this.kmSgne1rO).PSTqBLTET.isTouchExplorationEnabled() && rf3cOyxnl.kCA6Zs9sL(dIocxURUo) && !((rf3cOyxnl) this.kmSgne1rO).tGV7Q6urW.hasFocus()) {
                    dIocxURUo.dismissDropDown();
                }
                dIocxURUo.post(new DJbXkgfuR(this, dIocxURUo));
                return;
            default:
                return;
        }
    }

    @Override // con.yXzWc1b4D, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.CBQ5d1kRq) {
            case 1:
                eV9inabdD ev9inabdd = (eV9inabdD) this.kmSgne1rO;
                ev9inabdd.tGV7Q6urW.setChecked(!eV9inabdD.dIocxURUo(ev9inabdd));
                return;
            default:
                return;
        }
    }

    public MhqibLiIM(eV9inabdD ev9inabdd) {
        this.kmSgne1rO = ev9inabdd;
    }
}
