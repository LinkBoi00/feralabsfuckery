package con;

import android.animation.Animator;
/* loaded from: classes.dex */
public class D7nmUbn3p implements Animator.AnimatorListener {
    public final /* synthetic */ CoGXo2yJl J4Ux7ym32;
    public final /* synthetic */ fWAISGlrC q3BipwRCk;

    public D7nmUbn3p(CoGXo2yJl coGXo2yJl, fWAISGlrC fwaisglrc) {
        this.J4Ux7ym32 = coGXo2yJl;
        this.q3BipwRCk = fwaisglrc;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.J4Ux7ym32.q3BipwRCk(1.0f, this.q3BipwRCk, true);
        fWAISGlrC fwaisglrc = this.q3BipwRCk;
        fwaisglrc.vPSbyrYWX = fwaisglrc.kCA6Zs9sL;
        fwaisglrc.CBQ5d1kRq = fwaisglrc.iiGwOFFnr;
        fwaisglrc.kmSgne1rO = fwaisglrc.GPLPRo6go;
        fwaisglrc.q3BipwRCk((fwaisglrc.oon79WMrY + 1) % fwaisglrc.yWvV4ePLl.length);
        CoGXo2yJl coGXo2yJl = this.J4Ux7ym32;
        if (coGXo2yJl.ilHKhw3Yw) {
            coGXo2yJl.ilHKhw3Yw = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.q3BipwRCk.J4Ux7ym32(false);
            return;
        }
        coGXo2yJl.MzoOEjc4X += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.J4Ux7ym32.MzoOEjc4X = 0.0f;
    }
}
