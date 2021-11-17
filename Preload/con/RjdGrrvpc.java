package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class RjdGrrvpc extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator J4Ux7ym32;
    public final /* synthetic */ sSVv3dJln dIocxURUo;
    public final /* synthetic */ ltHymUmUx q3BipwRCk;
    public final /* synthetic */ View tGV7Q6urW;

    public RjdGrrvpc(sSVv3dJln ssvv3djln, ltHymUmUx lthymumux, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.dIocxURUo = ssvv3djln;
        this.q3BipwRCk = lthymumux;
        this.J4Ux7ym32 = viewPropertyAnimator;
        this.tGV7Q6urW = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.J4Ux7ym32.setListener(null);
        this.tGV7Q6urW.setAlpha(1.0f);
        this.tGV7Q6urW.setTranslationX(0.0f);
        this.tGV7Q6urW.setTranslationY(0.0f);
        this.dIocxURUo.tGV7Q6urW(this.q3BipwRCk.J4Ux7ym32);
        this.dIocxURUo.qVUwofr5s.remove(this.q3BipwRCk.J4Ux7ym32);
        this.dIocxURUo.vPSbyrYWX();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        sSVv3dJln ssvv3djln = this.dIocxURUo;
        RecyclerView.cywn6086a cywn6086a = this.q3BipwRCk.J4Ux7ym32;
        Objects.requireNonNull(ssvv3djln);
    }
}
