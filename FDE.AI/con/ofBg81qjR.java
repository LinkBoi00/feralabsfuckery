package con;

import android.transition.Transition;
/* loaded from: classes.dex */
public class ofBg81qjR implements Transition.TransitionListener {
    public final /* synthetic */ Runnable q3BipwRCk;

    public ofBg81qjR(ymwkPoInc ymwkpoinc, Runnable runnable) {
        this.q3BipwRCk = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.q3BipwRCk.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }
}
