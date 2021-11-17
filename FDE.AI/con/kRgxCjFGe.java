package con;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class kRgxCjFGe implements Transition.TransitionListener {
    public final /* synthetic */ ArrayList J4Ux7ym32;
    public final /* synthetic */ View q3BipwRCk;

    public kRgxCjFGe(ymwkPoInc ymwkpoinc, View view, ArrayList arrayList) {
        this.q3BipwRCk = view;
        this.J4Ux7ym32 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.q3BipwRCk.setVisibility(8);
        int size = this.J4Ux7ym32.size();
        for (int i = 0; i < size; i++) {
            ((View) this.J4Ux7ym32.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
