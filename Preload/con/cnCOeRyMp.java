package con;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public final class cnCOeRyMp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PmanMZxiM q3BipwRCk;

    public cnCOeRyMp(long j, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        this.q3BipwRCk = pmanMZxiM;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PmanMZxiM pmanMZxiM = this.q3BipwRCk;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            pmanMZxiM.IytU16YUK((Integer) animatedValue);
            return;
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type kotlin.Int");
    }
}
