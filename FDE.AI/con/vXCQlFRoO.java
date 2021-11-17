package con;

import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class vXCQlFRoO extends nlgbu4icS {
    public final /* synthetic */ Jg0aTLb6g q3BipwRCk;

    public vXCQlFRoO(Jg0aTLb6g jg0aTLb6g) {
        this.q3BipwRCk = jg0aTLb6g;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void onAnimationEnd(View view) {
        this.q3BipwRCk.dfpT1j18n.setAlpha(1.0f);
        this.q3BipwRCk.IytU16YUK.dIocxURUo(null);
        this.q3BipwRCk.IytU16YUK = null;
    }

    @Override // con.nlgbu4icS, con.DRrV7WVOe
    public void q3BipwRCk(View view) {
        this.q3BipwRCk.dfpT1j18n.setVisibility(0);
        this.q3BipwRCk.dfpT1j18n.sendAccessibilityEvent(32);
        if (this.q3BipwRCk.dfpT1j18n.getParent() instanceof View) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            cyVJjwbRF.tGV7Q6urW((View) this.q3BipwRCk.dfpT1j18n.getParent());
        }
    }
}
