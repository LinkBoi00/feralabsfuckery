package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class KIxB6ke5V extends AnimatorListenerAdapter {
    public final /* synthetic */ SBj41z1W0 J4Ux7ym32;
    public final /* synthetic */ rwhamSOu2 q3BipwRCk;

    public KIxB6ke5V(SBj41z1W0 sBj41z1W0, rwhamSOu2 rwhamsou2) {
        this.J4Ux7ym32 = sBj41z1W0;
        this.q3BipwRCk = rwhamsou2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.remove(animator);
        this.J4Ux7ym32.WaUP0CF08.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.J4Ux7ym32.WaUP0CF08.add(animator);
    }
}
