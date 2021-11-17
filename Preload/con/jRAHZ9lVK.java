package con;

import android.transition.Transition;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class jRAHZ9lVK implements Transition.TransitionListener {
    public final /* synthetic */ ymwkPoInc GPLPRo6go;
    public final /* synthetic */ ArrayList J4Ux7ym32;
    public final /* synthetic */ ArrayList dIocxURUo;
    public final /* synthetic */ ArrayList iiGwOFFnr;
    public final /* synthetic */ Object kCA6Zs9sL;
    public final /* synthetic */ Object q3BipwRCk;
    public final /* synthetic */ Object tGV7Q6urW;

    public jRAHZ9lVK(ymwkPoInc ymwkpoinc, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.GPLPRo6go = ymwkpoinc;
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = arrayList;
        this.tGV7Q6urW = obj2;
        this.dIocxURUo = arrayList2;
        this.kCA6Zs9sL = obj3;
        this.iiGwOFFnr = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        Object obj = this.q3BipwRCk;
        if (obj != null) {
            this.GPLPRo6go.MzoOEjc4X(obj, this.J4Ux7ym32, null);
        }
        Object obj2 = this.tGV7Q6urW;
        if (obj2 != null) {
            this.GPLPRo6go.MzoOEjc4X(obj2, this.dIocxURUo, null);
        }
        Object obj3 = this.kCA6Zs9sL;
        if (obj3 != null) {
            this.GPLPRo6go.MzoOEjc4X(obj3, this.iiGwOFFnr, null);
        }
    }
}
