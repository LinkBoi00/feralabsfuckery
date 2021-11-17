package con;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public class UaOcQlKQj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ vC6Qh7mvD J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    public UaOcQlKQj(vC6Qh7mvD vc6qh7mvd, int i) {
        this.q3BipwRCk = i;
        if (i != 1) {
            this.J4Ux7ym32 = vc6qh7mvd;
        } else {
            this.J4Ux7ym32 = vc6qh7mvd;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.q3BipwRCk) {
            case 0:
                this.J4Ux7ym32.tGV7Q6urW.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.J4Ux7ym32.tGV7Q6urW.setScaleX(floatValue);
                this.J4Ux7ym32.tGV7Q6urW.setScaleY(floatValue);
                return;
        }
    }
}
