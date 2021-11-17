package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class TvyYuEyuG extends AnimatorListenerAdapter {
    public final /* synthetic */ Object q3BipwRCk;

    public TvyYuEyuG(vC6Qh7mvD vc6qh7mvd) {
        this.q3BipwRCk = vc6qh7mvd;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ((vC6Qh7mvD) this.q3BipwRCk).q3BipwRCk.setEndIconVisible(true);
    }
}
