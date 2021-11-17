package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ghmRemUn3 extends AnimatorListenerAdapter {
    public boolean J4Ux7ym32 = false;
    public final View q3BipwRCk;

    public ghmRemUn3(View view) {
        this.q3BipwRCk = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        lSxPlj8FZ.q3BipwRCk.GPLPRo6go(this.q3BipwRCk, 1.0f);
        if (this.J4Ux7ym32) {
            this.q3BipwRCk.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        View view = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.Puu3Rhg4F(view) && this.q3BipwRCk.getLayerType() == 0) {
            this.J4Ux7ym32 = true;
            this.q3BipwRCk.setLayerType(2, null);
        }
    }
}
