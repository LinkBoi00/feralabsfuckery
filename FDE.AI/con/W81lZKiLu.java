package con;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.s7MlVynBG;
/* loaded from: classes.dex */
public class W81lZKiLu extends RecyclerView.wnbPPCp4x {
    public final /* synthetic */ MaterialButton J4Ux7ym32;
    public final /* synthetic */ s7MlVynBG q3BipwRCk;
    public final /* synthetic */ gBRio1gPW tGV7Q6urW;

    public W81lZKiLu(gBRio1gPW gbrio1gpw, s7MlVynBG s7mlvynbg, MaterialButton materialButton) {
        this.tGV7Q6urW = gbrio1gpw;
        this.q3BipwRCk = s7mlvynbg;
        this.J4Ux7ym32 = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
    public void J4Ux7ym32(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager INnK5Rew6 = this.tGV7Q6urW.INnK5Rew6();
        int ZDWv1omvl = i < 0 ? INnK5Rew6.ZDWv1omvl() : INnK5Rew6.RxmCfmRJo();
        this.tGV7Q6urW.SuKhTJIQc = this.q3BipwRCk.Puu3Rhg4F(ZDWv1omvl);
        MaterialButton materialButton = this.J4Ux7ym32;
        s7MlVynBG s7mlvynbg = this.q3BipwRCk;
        materialButton.setText(s7mlvynbg.kCA6Zs9sL.CBQ5d1kRq.Bhmn1KIah(ZDWv1omvl).kmSgne1rO(s7mlvynbg.dIocxURUo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
    public void q3BipwRCk(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.J4Ux7ym32.getText());
        }
    }
}
