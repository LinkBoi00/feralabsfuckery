package con;

import android.animation.ValueAnimator;
import android.view.View;
/* loaded from: classes.dex */
public class OoLXoaREZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ iFKnyAZAM q3BipwRCk;

    public OoLXoaREZ(Roohga8FY roohga8FY, iFKnyAZAM ifknyazam, View view) {
        this.q3BipwRCk = ifknyazam;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) ((qTSiJXW5w) this.q3BipwRCk.kmSgne1rO).dIocxURUo.getParent()).invalidate();
    }
}
