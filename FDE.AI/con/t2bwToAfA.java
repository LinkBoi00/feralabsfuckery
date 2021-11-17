package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class t2bwToAfA extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator J4Ux7ym32;
    public final /* synthetic */ sSVv3dJln dIocxURUo;
    public final /* synthetic */ RecyclerView.cywn6086a q3BipwRCk;
    public final /* synthetic */ View tGV7Q6urW;

    public t2bwToAfA(sSVv3dJln ssvv3djln, RecyclerView.cywn6086a cywn6086a, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.dIocxURUo = ssvv3djln;
        this.q3BipwRCk = cywn6086a;
        this.J4Ux7ym32 = viewPropertyAnimator;
        this.tGV7Q6urW = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.J4Ux7ym32.setListener(null);
        this.tGV7Q6urW.setAlpha(1.0f);
        this.dIocxURUo.tGV7Q6urW(this.q3BipwRCk);
        this.dIocxURUo.ilHKhw3Yw.remove(this.q3BipwRCk);
        this.dIocxURUo.vPSbyrYWX();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.dIocxURUo);
    }
}
