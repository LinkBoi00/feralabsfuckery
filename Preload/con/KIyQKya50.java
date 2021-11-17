package con;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class KIyQKya50 extends RecyclerView.wnbPPCp4x {
    public final /* synthetic */ Pzd2J3aOK J4Ux7ym32;
    public boolean q3BipwRCk = false;

    public KIyQKya50(Pzd2J3aOK pzd2J3aOK) {
        this.J4Ux7ym32 = pzd2J3aOK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
    public void J4Ux7ym32(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.q3BipwRCk = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
    public void q3BipwRCk(RecyclerView recyclerView, int i) {
        if (i == 0 && this.q3BipwRCk) {
            this.q3BipwRCk = false;
            this.J4Ux7ym32.yWvV4ePLl();
        }
    }
}
