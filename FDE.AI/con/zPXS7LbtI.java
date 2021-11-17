package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class zPXS7LbtI extends AnimatorListenerAdapter {
    public final /* synthetic */ isrYs6b4I J4Ux7ym32;
    public boolean q3BipwRCk = false;

    public zPXS7LbtI(isrYs6b4I isrys6b4i) {
        this.J4Ux7ym32 = isrys6b4i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.q3BipwRCk = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.q3BipwRCk) {
            this.q3BipwRCk = false;
        } else if (((Float) this.J4Ux7ym32.dfpT1j18n.getAnimatedValue()).floatValue() == 0.0f) {
            isrYs6b4I isrys6b4i = this.J4Ux7ym32;
            isrys6b4i.iMyQMM6Qj = 0;
            isrys6b4i.oon79WMrY(0);
        } else {
            isrYs6b4I isrys6b4i2 = this.J4Ux7ym32;
            isrys6b4i2.iMyQMM6Qj = 2;
            isrys6b4i2.Eeka1udhb.invalidate();
        }
    }
}
