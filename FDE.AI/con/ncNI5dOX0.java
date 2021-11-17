package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ncNI5dOX0 extends AnimatorListenerAdapter {
    public final /* synthetic */ TextView J4Ux7ym32;
    public final /* synthetic */ TextView dIocxURUo;
    public final /* synthetic */ GC006c8s6 kCA6Zs9sL;
    public final /* synthetic */ int q3BipwRCk;
    public final /* synthetic */ int tGV7Q6urW;

    public ncNI5dOX0(GC006c8s6 gC006c8s6, int i, TextView textView, int i2, TextView textView2) {
        this.kCA6Zs9sL = gC006c8s6;
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = textView;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        GC006c8s6 gC006c8s6 = this.kCA6Zs9sL;
        gC006c8s6.Puu3Rhg4F = this.q3BipwRCk;
        gC006c8s6.iiGwOFFnr = null;
        TextView textView2 = this.J4Ux7ym32;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.tGV7Q6urW == 1 && (textView = this.kCA6Zs9sL.CBQ5d1kRq) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.dIocxURUo;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.dIocxURUo.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        TextView textView = this.dIocxURUo;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
