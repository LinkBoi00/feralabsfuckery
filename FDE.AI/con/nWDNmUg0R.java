package con;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class nWDNmUg0R implements uj7tg96A8 {
    public final /* synthetic */ Jg0aTLb6g J4Ux7ym32;
    public uj7tg96A8 q3BipwRCk;

    public nWDNmUg0R(Jg0aTLb6g jg0aTLb6g, uj7tg96A8 uj7tg96a8) {
        this.J4Ux7ym32 = jg0aTLb6g;
        this.q3BipwRCk = uj7tg96a8;
    }

    @Override // con.uj7tg96A8
    public void J4Ux7ym32(pOLFExxoD polfexxod) {
        this.q3BipwRCk.J4Ux7ym32(polfexxod);
        Jg0aTLb6g jg0aTLb6g = this.J4Ux7ym32;
        if (jg0aTLb6g.iMyQMM6Qj != null) {
            jg0aTLb6g.MzoOEjc4X.getDecorView().removeCallbacks(this.J4Ux7ym32.cAwN510t2);
        }
        Jg0aTLb6g jg0aTLb6g2 = this.J4Ux7ym32;
        if (jg0aTLb6g2.dfpT1j18n != null) {
            jg0aTLb6g2.WaUP0CF08();
            Jg0aTLb6g jg0aTLb6g3 = this.J4Ux7ym32;
            Roohga8FY J4Ux7ym32 = IuQbWntsc.J4Ux7ym32(jg0aTLb6g3.dfpT1j18n);
            J4Ux7ym32.q3BipwRCk(0.0f);
            jg0aTLb6g3.IytU16YUK = J4Ux7ym32;
            Roohga8FY roohga8FY = this.J4Ux7ym32.IytU16YUK;
            gYZryFPoK gyzryfpok = new gYZryFPoK(this);
            View view = (View) roohga8FY.q3BipwRCk.get();
            if (view != null) {
                roohga8FY.kCA6Zs9sL(view, gyzryfpok);
            }
        }
        Jg0aTLb6g jg0aTLb6g4 = this.J4Ux7ym32;
        zmOE3WTfy zmoe3wtfy = jg0aTLb6g4.qVUwofr5s;
        if (zmoe3wtfy != null) {
            zmoe3wtfy.dIocxURUo(jg0aTLb6g4.i8XZMQc6Z);
        }
        Jg0aTLb6g jg0aTLb6g5 = this.J4Ux7ym32;
        jg0aTLb6g5.i8XZMQc6Z = null;
        ViewGroup viewGroup = jg0aTLb6g5.qFBXIgpia;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(viewGroup);
    }

    @Override // con.uj7tg96A8
    public boolean dIocxURUo(pOLFExxoD polfexxod, Menu menu) {
        return this.q3BipwRCk.dIocxURUo(polfexxod, menu);
    }

    @Override // con.uj7tg96A8
    public boolean kCA6Zs9sL(pOLFExxoD polfexxod, Menu menu) {
        ViewGroup viewGroup = this.J4Ux7ym32.qFBXIgpia;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(viewGroup);
        return this.q3BipwRCk.kCA6Zs9sL(polfexxod, menu);
    }

    @Override // con.uj7tg96A8
    public boolean tGV7Q6urW(pOLFExxoD polfexxod, MenuItem menuItem) {
        return this.q3BipwRCk.tGV7Q6urW(polfexxod, menuItem);
    }
}
