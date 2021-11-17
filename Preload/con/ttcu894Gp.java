package con;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ttcu894Gp extends nlgbu4icS {
    public final /* synthetic */ qTSiJXW5w q3BipwRCk;

    public ttcu894Gp(qTSiJXW5w qtsijxw5w) {
        this.q3BipwRCk = qtsijxw5w;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        View view2;
        qTSiJXW5w qtsijxw5w = this.q3BipwRCk;
        if (qtsijxw5w.MzoOEjc4X && (view2 = qtsijxw5w.GPLPRo6go) != null) {
            view2.setTranslationY(0.0f);
            this.q3BipwRCk.dIocxURUo.setTranslationY(0.0f);
        }
        this.q3BipwRCk.dIocxURUo.setVisibility(8);
        this.q3BipwRCk.dIocxURUo.setTransitioning(false);
        qTSiJXW5w qtsijxw5w2 = this.q3BipwRCk;
        qtsijxw5w2.dXrmkklc8 = null;
        uj7tg96A8 uj7tg96a8 = qtsijxw5w2.vPSbyrYWX;
        if (uj7tg96a8 != null) {
            uj7tg96a8.J4Ux7ym32(qtsijxw5w2.oon79WMrY);
            qtsijxw5w2.oon79WMrY = null;
            qtsijxw5w2.vPSbyrYWX = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.q3BipwRCk.tGV7Q6urW;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            cyVJjwbRF.tGV7Q6urW(actionBarOverlayLayout);
        }
    }
}
