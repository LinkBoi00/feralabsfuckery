package con;

import android.text.Editable;
import android.text.TextWatcher;
/* loaded from: classes.dex */
public class kPOyr2xfh implements TextWatcher {
    public final /* synthetic */ vC6Qh7mvD CBQ5d1kRq;

    public kPOyr2xfh(vC6Qh7mvD vc6qh7mvd) {
        this.CBQ5d1kRq = vc6qh7mvd;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.CBQ5d1kRq.q3BipwRCk.getSuffixText() == null) {
            vC6Qh7mvD vc6qh7mvd = this.CBQ5d1kRq;
            vc6qh7mvd.kCA6Zs9sL(vC6Qh7mvD.dIocxURUo(vc6qh7mvd));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
