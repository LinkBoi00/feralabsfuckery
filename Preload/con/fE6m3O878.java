package con;

import android.view.View;
import com.google.android.material.datepicker.s7MlVynBG;
/* loaded from: classes.dex */
public class fE6m3O878 implements View.OnClickListener {
    public final /* synthetic */ s7MlVynBG CBQ5d1kRq;
    public final /* synthetic */ gBRio1gPW kmSgne1rO;

    public fE6m3O878(gBRio1gPW gbrio1gpw, s7MlVynBG s7mlvynbg) {
        this.kmSgne1rO = gbrio1gpw;
        this.CBQ5d1kRq = s7mlvynbg;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int ZDWv1omvl = this.kmSgne1rO.INnK5Rew6().ZDWv1omvl() + 1;
        if (ZDWv1omvl < this.kmSgne1rO.R2hkbNqWf.getAdapter().q3BipwRCk()) {
            this.kmSgne1rO.ln3nf7LH3(this.CBQ5d1kRq.Puu3Rhg4F(ZDWv1omvl));
        }
    }
}
