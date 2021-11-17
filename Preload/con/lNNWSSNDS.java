package con;

import android.text.Html;
import android.widget.TextView;
/* loaded from: classes.dex */
public class lNNWSSNDS {
    public Object J4Ux7ym32;
    public boolean dIocxURUo;
    public Object q3BipwRCk;
    public boolean tGV7Q6urW;

    public lNNWSSNDS() {
    }

    public CharSequence q3BipwRCk(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return null;
        }
        return z ? Html.fromHtml(charSequence.toString()) : charSequence;
    }

    public lNNWSSNDS(WQpIMzWun wQpIMzWun, TextView textView) {
        this.q3BipwRCk = wQpIMzWun;
        this.J4Ux7ym32 = textView;
    }
}
