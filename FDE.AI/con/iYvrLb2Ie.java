package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class iYvrLb2Ie extends AnimatorListenerAdapter {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ uRyiqsiNk dIocxURUo;
    public final /* synthetic */ ce8tBZHr1 kCA6Zs9sL;
    public final /* synthetic */ ViewGroup q3BipwRCk;
    public final /* synthetic */ UxHHqhbTP tGV7Q6urW;

    public iYvrLb2Ie(ViewGroup viewGroup, View view, UxHHqhbTP uxHHqhbTP, uRyiqsiNk uryiqsink, ce8tBZHr1 ce8tbzhr1) {
        this.q3BipwRCk = viewGroup;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = uxHHqhbTP;
        this.dIocxURUo = uryiqsink;
        this.kCA6Zs9sL = ce8tbzhr1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.endViewTransition(this.J4Ux7ym32);
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        rwMIknDWL rwmikndwl = uxHHqhbTP.j22ftfeNI;
        Animator animator2 = rwmikndwl == null ? null : rwmikndwl.J4Ux7ym32;
        uxHHqhbTP.OpLJtmvFM(null);
        if (animator2 != null && this.q3BipwRCk.indexOfChild(this.J4Ux7ym32) < 0) {
            this.dIocxURUo.tGV7Q6urW(this.tGV7Q6urW, this.kCA6Zs9sL);
        }
    }
}
