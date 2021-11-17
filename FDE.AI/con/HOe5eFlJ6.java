package con;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public class HOe5eFlJ6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public HOe5eFlJ6(rf3cOyxnl rf3coyxnl) {
        this.J4Ux7ym32 = rf3coyxnl;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.q3BipwRCk) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ((isrYs6b4I) this.J4Ux7ym32).tGV7Q6urW.setAlpha(floatValue);
                ((isrYs6b4I) this.J4Ux7ym32).dIocxURUo.setAlpha(floatValue);
                ((isrYs6b4I) this.J4Ux7ym32).Eeka1udhb.invalidate();
                return;
            default:
                ((rf3cOyxnl) this.J4Ux7ym32).tGV7Q6urW.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public HOe5eFlJ6(isrYs6b4I isrys6b4i) {
        this.J4Ux7ym32 = isrys6b4i;
    }
}
