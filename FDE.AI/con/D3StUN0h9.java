package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class D3StUN0h9 extends AnimatorListenerAdapter {
    public final /* synthetic */ SBj41z1W0 q3BipwRCk;

    public D3StUN0h9(SBj41z1W0 sBj41z1W0) {
        this.q3BipwRCk = sBj41z1W0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.kmSgne1rO();
        animator.removeListener(this);
    }
}
