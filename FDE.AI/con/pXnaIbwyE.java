package con;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import con.SBj41z1W0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class pXnaIbwyE extends havMSMvry {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ xKPlRztCM dIocxURUo;
    public final /* synthetic */ ViewGroup q3BipwRCk;
    public final /* synthetic */ View tGV7Q6urW;

    public pXnaIbwyE(xKPlRztCM xkplrztcm, ViewGroup viewGroup, View view, View view2) {
        this.dIocxURUo = xkplrztcm;
        this.q3BipwRCk = viewGroup;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = view2;
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void J4Ux7ym32(SBj41z1W0 sBj41z1W0) {
        this.tGV7Q6urW.setTag(R.id.save_overlay_view, null);
        this.q3BipwRCk.getOverlay().remove(this.J4Ux7ym32);
        sBj41z1W0.ixWaw2akD(this);
    }

    @Override // con.havMSMvry, con.SBj41z1W0.mhl5lIdbQ
    public void kCA6Zs9sL(SBj41z1W0 sBj41z1W0) {
        if (this.J4Ux7ym32.getParent() == null) {
            this.q3BipwRCk.getOverlay().add(this.J4Ux7ym32);
            return;
        }
        xKPlRztCM xkplrztcm = this.dIocxURUo;
        int size = xkplrztcm.WaUP0CF08.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) xkplrztcm.WaUP0CF08.get(size)).cancel();
        }
        ArrayList arrayList = xkplrztcm.cAwN510t2;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) xkplrztcm.cAwN510t2.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((SBj41z1W0.mhl5lIdbQ) arrayList2.get(i)).dIocxURUo(xkplrztcm);
            }
        }
    }

    @Override // con.havMSMvry, con.SBj41z1W0.mhl5lIdbQ
    public void q3BipwRCk(SBj41z1W0 sBj41z1W0) {
        this.q3BipwRCk.getOverlay().remove(this.J4Ux7ym32);
    }
}
