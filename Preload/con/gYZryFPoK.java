package con;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class gYZryFPoK extends nlgbu4icS {
    public final /* synthetic */ nWDNmUg0R q3BipwRCk;

    public gYZryFPoK(nWDNmUg0R nwdnmug0r) {
        this.q3BipwRCk = nwdnmug0r;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        this.q3BipwRCk.J4Ux7ym32.dfpT1j18n.setVisibility(8);
        Jg0aTLb6g jg0aTLb6g = this.q3BipwRCk.J4Ux7ym32;
        PopupWindow popupWindow = jg0aTLb6g.iMyQMM6Qj;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (jg0aTLb6g.dfpT1j18n.getParent() instanceof View) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            cyVJjwbRF.tGV7Q6urW((View) this.q3BipwRCk.J4Ux7ym32.dfpT1j18n.getParent());
        }
        this.q3BipwRCk.J4Ux7ym32.dfpT1j18n.Puu3Rhg4F();
        this.q3BipwRCk.J4Ux7ym32.IytU16YUK.dIocxURUo(null);
        Jg0aTLb6g jg0aTLb6g2 = this.q3BipwRCk.J4Ux7ym32;
        jg0aTLb6g2.IytU16YUK = null;
        ViewGroup viewGroup = jg0aTLb6g2.qFBXIgpia;
        WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(viewGroup);
    }
}
