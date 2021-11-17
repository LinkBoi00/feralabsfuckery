package con;

import android.view.View;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class uCG9ix8YG extends XflkRyC2J {
    public final /* synthetic */ gBRio1gPW dIocxURUo;

    public uCG9ix8YG(gBRio1gPW gbrio1gpw) {
        this.dIocxURUo = gbrio1gpw;
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        gBRio1gPW gbrio1gpw;
        int i;
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
        if (this.dIocxURUo.buPcffgdD.getVisibility() == 0) {
            gbrio1gpw = this.dIocxURUo;
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            gbrio1gpw = this.dIocxURUo;
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        iqwHQ6O2l.q3BipwRCk.setHintText(gbrio1gpw.i8XZMQc6Z(i));
    }
}
