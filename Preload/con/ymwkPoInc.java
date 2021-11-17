package con;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ymwkPoInc extends xobLfQFEO {
    public static boolean dfpT1j18n(Transition transition) {
        return !xobLfQFEO.vPSbyrYWX(transition.getTargetIds()) || !xobLfQFEO.vPSbyrYWX(transition.getTargetNames()) || !xobLfQFEO.vPSbyrYWX(transition.getTargetTypes());
    }

    @Override // con.xobLfQFEO
    public Object CBQ5d1kRq(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // con.xobLfQFEO
    public void Eeka1udhb(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new QqaPyBQCB(this, rect, 1));
        }
    }

    @Override // con.xobLfQFEO
    public Object GPLPRo6go(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // con.xobLfQFEO
    public void J4Ux7ym32(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    J4Ux7ym32(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!dfpT1j18n(transition) && xobLfQFEO.vPSbyrYWX(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // con.xobLfQFEO
    public void MzoOEjc4X(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                MzoOEjc4X(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!dfpT1j18n(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // con.xobLfQFEO
    public void PSTqBLTET(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // con.xobLfQFEO
    public void RG6kpfv3v(UxHHqhbTP uxHHqhbTP, Object obj, ce8tBZHr1 ce8tbzhr1, Runnable runnable) {
        ((Transition) obj).addListener(new ofBg81qjR(this, runnable));
    }

    @Override // con.xobLfQFEO
    public void WaUP0CF08(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            MzoOEjc4X(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // con.xobLfQFEO
    public void dXrmkklc8(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            oon79WMrY(view, rect);
            ((Transition) obj).setEpicenterCallback(new QqaPyBQCB(this, rect, 0));
        }
    }

    @Override // con.xobLfQFEO
    public Object i8XZMQc6Z(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // con.xobLfQFEO
    public void ilHKhw3Yw(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new kRgxCjFGe(this, view, arrayList));
    }

    @Override // con.xobLfQFEO
    public boolean kCA6Zs9sL(Object obj) {
        return obj instanceof Transition;
    }

    @Override // con.xobLfQFEO
    public Object kmSgne1rO(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // con.xobLfQFEO
    public void q3BipwRCk(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // con.xobLfQFEO
    public void qVUwofr5s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new jRAHZ9lVK(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // con.xobLfQFEO
    public void sk5s77z6Q(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xobLfQFEO.dIocxURUo(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        J4Ux7ym32(transitionSet, arrayList);
    }

    @Override // con.xobLfQFEO
    public void tGV7Q6urW(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }
}
