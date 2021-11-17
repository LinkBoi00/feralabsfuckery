package con;

import android.view.ViewGroup;
import android.view.animation.Animation;
/* loaded from: classes.dex */
public class ZlZSxeZ6Q implements Animation.AnimationListener {
    public final /* synthetic */ UxHHqhbTP J4Ux7ym32;
    public final /* synthetic */ ce8tBZHr1 dIocxURUo;
    public final /* synthetic */ ViewGroup q3BipwRCk;
    public final /* synthetic */ uRyiqsiNk tGV7Q6urW;

    public ZlZSxeZ6Q(ViewGroup viewGroup, UxHHqhbTP uxHHqhbTP, uRyiqsiNk uryiqsink, ce8tBZHr1 ce8tbzhr1) {
        this.q3BipwRCk = viewGroup;
        this.J4Ux7ym32 = uxHHqhbTP;
        this.tGV7Q6urW = uryiqsink;
        this.dIocxURUo = ce8tbzhr1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.q3BipwRCk.post(new Ybx9VCssc(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
