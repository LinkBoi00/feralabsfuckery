package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class bWNFfjmZq extends AnimatorListenerAdapter {
    public final /* synthetic */ vC6Qh7mvD q3BipwRCk;

    public bWNFfjmZq(vC6Qh7mvD vc6qh7mvd) {
        this.q3BipwRCk = vc6qh7mvd;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.q3BipwRCk.setEndIconVisible(false);
    }
}
