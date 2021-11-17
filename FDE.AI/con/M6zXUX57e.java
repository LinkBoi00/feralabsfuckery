package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import con.SBj41z1W0;
/* loaded from: classes.dex */
public class M6zXUX57e extends AnimatorListenerAdapter implements SBj41z1W0.mhl5lIdbQ {
    public final int J4Ux7ym32;
    public final boolean dIocxURUo;
    public boolean iiGwOFFnr = false;
    public boolean kCA6Zs9sL;
    public final View q3BipwRCk;
    public final ViewGroup tGV7Q6urW;

    public M6zXUX57e(View view, int i, boolean z) {
        this.q3BipwRCk = view;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = (ViewGroup) view.getParent();
        this.dIocxURUo = z;
        GPLPRo6go(true);
    }

    public final void GPLPRo6go(boolean z) {
        ViewGroup viewGroup;
        if (this.dIocxURUo && this.kCA6Zs9sL != z && (viewGroup = this.tGV7Q6urW) != null) {
            this.kCA6Zs9sL = z;
            b0fskPUIL.q3BipwRCk(viewGroup, z);
        }
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void J4Ux7ym32(SBj41z1W0 sBj41z1W0) {
        iiGwOFFnr();
        sBj41z1W0.ixWaw2akD(this);
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void dIocxURUo(SBj41z1W0 sBj41z1W0) {
    }

    public final void iiGwOFFnr() {
        if (!this.iiGwOFFnr) {
            lSxPlj8FZ.q3BipwRCk.Puu3Rhg4F(this.q3BipwRCk, this.J4Ux7ym32);
            ViewGroup viewGroup = this.tGV7Q6urW;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        GPLPRo6go(false);
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void kCA6Zs9sL(SBj41z1W0 sBj41z1W0) {
        GPLPRo6go(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.iiGwOFFnr = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        iiGwOFFnr();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        if (!this.iiGwOFFnr) {
            lSxPlj8FZ.q3BipwRCk.Puu3Rhg4F(this.q3BipwRCk, this.J4Ux7ym32);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        if (!this.iiGwOFFnr) {
            lSxPlj8FZ.q3BipwRCk.Puu3Rhg4F(this.q3BipwRCk, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void q3BipwRCk(SBj41z1W0 sBj41z1W0) {
        GPLPRo6go(false);
    }

    @Override // con.SBj41z1W0.mhl5lIdbQ
    public void tGV7Q6urW(SBj41z1W0 sBj41z1W0) {
    }
}
