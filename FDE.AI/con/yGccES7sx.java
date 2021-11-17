package con;

import android.view.View;
/* loaded from: classes.dex */
public class yGccES7sx extends BKr8aejj7 {
    public final /* synthetic */ UxHHqhbTP q3BipwRCk;

    public yGccES7sx(UxHHqhbTP uxHHqhbTP) {
        this.q3BipwRCk = uxHHqhbTP;
    }

    @Override // con.BKr8aejj7
    public boolean dIocxURUo() {
        return this.q3BipwRCk.EBQXiIPmm != null;
    }

    @Override // con.BKr8aejj7
    public View tGV7Q6urW(int i) {
        View view = this.q3BipwRCk.EBQXiIPmm;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Fragment ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(" does not have a view");
        throw new IllegalStateException(q3BipwRCk.toString());
    }
}
