package con;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class IHS162gzt extends AnimatorListenerAdapter {
    public final /* synthetic */ View J4Ux7ym32;
    public final /* synthetic */ zXvxcN9Gl dIocxURUo;
    public final /* synthetic */ nXj9651z1 kCA6Zs9sL;
    public final /* synthetic */ ViewGroup q3BipwRCk;
    public final /* synthetic */ boolean tGV7Q6urW;

    public IHS162gzt(t5E8jan4S t5e8jan4s, ViewGroup viewGroup, View view, boolean z, zXvxcN9Gl zxvxcn9gl, nXj9651z1 nxj9651z1) {
        this.q3BipwRCk = viewGroup;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = z;
        this.dIocxURUo = zxvxcn9gl;
        this.kCA6Zs9sL = nxj9651z1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.q3BipwRCk.endViewTransition(this.J4Ux7ym32);
        if (this.tGV7Q6urW) {
            this.dIocxURUo.q3BipwRCk.q3BipwRCk(this.J4Ux7ym32);
        }
        this.kCA6Zs9sL.J4Ux7ym32();
    }
}
