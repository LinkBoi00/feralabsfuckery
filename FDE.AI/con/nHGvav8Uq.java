package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class nHGvav8Uq extends AnimatorListenerAdapter {
    public final /* synthetic */ rf3cOyxnl q3BipwRCk;

    public nHGvav8Uq(rf3cOyxnl rf3coyxnl) {
        this.q3BipwRCk = rf3coyxnl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        rf3cOyxnl rf3coyxnl = this.q3BipwRCk;
        rf3coyxnl.tGV7Q6urW.setChecked(rf3coyxnl.vPSbyrYWX);
        this.q3BipwRCk.ilHKhw3Yw.start();
    }
}
