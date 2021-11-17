package con;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* loaded from: classes.dex */
public class SGj4zZBGq implements Animation.AnimationListener {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ ViewGroup q3BipwRCk;
    public final /* synthetic */ nXj9651z1 tGV7Q6urW;

    public SGj4zZBGq(t5E8jan4S t5e8jan4s, ViewGroup viewGroup, View view, nXj9651z1 nxj9651z1) {
        this.q3BipwRCk = viewGroup;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = nxj9651z1;
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
