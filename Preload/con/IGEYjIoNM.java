package con;

import android.view.View;
/* loaded from: classes.dex */
public class IGEYjIoNM implements View.OnClickListener {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ jlGuDYsZo kmSgne1rO;

    public IGEYjIoNM(jlGuDYsZo jlgudyszo, int i) {
        this.kmSgne1rO = jlgudyszo;
        this.CBQ5d1kRq = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        mznBSeryj iiGwOFFnr = mznBSeryj.iiGwOFFnr(this.CBQ5d1kRq, this.kmSgne1rO.dIocxURUo.SuKhTJIQc.kmSgne1rO);
        RAxgJWiGj rAxgJWiGj = this.kmSgne1rO.dIocxURUo.INnK5Rew6;
        if (iiGwOFFnr.compareTo(rAxgJWiGj.CBQ5d1kRq) < 0) {
            iiGwOFFnr = rAxgJWiGj.CBQ5d1kRq;
        } else if (iiGwOFFnr.compareTo(rAxgJWiGj.kmSgne1rO) > 0) {
            iiGwOFFnr = rAxgJWiGj.kmSgne1rO;
        }
        this.kmSgne1rO.dIocxURUo.ln3nf7LH3(iiGwOFFnr);
        this.kmSgne1rO.dIocxURUo.Dr7UqlxEV(1);
    }
}
