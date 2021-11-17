package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* loaded from: classes.dex */
public class aIlHLkEoe extends AnimatorListenerAdapter {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ DRrV7WVOe q3BipwRCk;

    public aIlHLkEoe(Roohga8FY roohga8FY, DRrV7WVOe dRrV7WVOe, View view) {
        this.q3BipwRCk = dRrV7WVOe;
        this.J4Ux7ym32 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.q3BipwRCk.J4Ux7ym32(this.J4Ux7ym32);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.onAnimationEnd(this.J4Ux7ym32);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.q3BipwRCk.q3BipwRCk(this.J4Ux7ym32);
    }
}
