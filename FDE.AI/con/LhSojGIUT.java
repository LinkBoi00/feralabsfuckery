package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class LhSojGIUT extends AnimatorListenerAdapter {
    public final /* synthetic */ int J4Ux7ym32;
    public final /* synthetic */ int dIocxURUo;
    public final /* synthetic */ sSVv3dJln iiGwOFFnr;
    public final /* synthetic */ ViewPropertyAnimator kCA6Zs9sL;
    public final /* synthetic */ RecyclerView.cywn6086a q3BipwRCk;
    public final /* synthetic */ View tGV7Q6urW;

    public LhSojGIUT(sSVv3dJln ssvv3djln, RecyclerView.cywn6086a cywn6086a, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.iiGwOFFnr = ssvv3djln;
        this.q3BipwRCk = cywn6086a;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = view;
        this.dIocxURUo = i2;
        this.kCA6Zs9sL = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.J4Ux7ym32 != 0) {
            this.tGV7Q6urW.setTranslationX(0.0f);
        }
        if (this.dIocxURUo != 0) {
            this.tGV7Q6urW.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.kCA6Zs9sL.setListener(null);
        this.iiGwOFFnr.tGV7Q6urW(this.q3BipwRCk);
        this.iiGwOFFnr.MzoOEjc4X.remove(this.q3BipwRCk);
        this.iiGwOFFnr.vPSbyrYWX();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.iiGwOFFnr);
    }
}
