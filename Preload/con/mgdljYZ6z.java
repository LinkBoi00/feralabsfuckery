package con;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public class mgdljYZ6z implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoGXo2yJl J4Ux7ym32;
    public final /* synthetic */ fWAISGlrC q3BipwRCk;

    public mgdljYZ6z(CoGXo2yJl coGXo2yJl, fWAISGlrC fwaisglrc) {
        this.J4Ux7ym32 = coGXo2yJl;
        this.q3BipwRCk = fwaisglrc;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.J4Ux7ym32.dIocxURUo(floatValue, this.q3BipwRCk);
        this.J4Ux7ym32.q3BipwRCk(floatValue, this.q3BipwRCk, false);
        this.J4Ux7ym32.invalidateSelf();
    }
}
