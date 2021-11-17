package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class KIsSJYyFq extends AnimatorListenerAdapter {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ sSVv3dJln dIocxURUo;
    public final /* synthetic */ RecyclerView.cywn6086a q3BipwRCk;
    public final /* synthetic */ ViewPropertyAnimator tGV7Q6urW;

    public KIsSJYyFq(sSVv3dJln ssvv3djln, RecyclerView.cywn6086a cywn6086a, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.dIocxURUo = ssvv3djln;
        this.q3BipwRCk = cywn6086a;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.J4Ux7ym32.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.tGV7Q6urW.setListener(null);
        this.dIocxURUo.tGV7Q6urW(this.q3BipwRCk);
        this.dIocxURUo.PSTqBLTET.remove(this.q3BipwRCk);
        this.dIocxURUo.vPSbyrYWX();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.dIocxURUo);
    }
}
