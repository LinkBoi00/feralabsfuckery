package con;

import android.view.ViewGroup;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class XczobwRut {
    public static SBj41z1W0 q3BipwRCk = new C0GUqrNvS();
    public static ThreadLocal J4Ux7ym32 = new ThreadLocal();
    public static ArrayList tGV7Q6urW = new ArrayList();

    public static rwhamSOu2 J4Ux7ym32() {
        rwhamSOu2 rwhamsou2;
        WeakReference weakReference = (WeakReference) J4Ux7ym32.get();
        if (weakReference != null && (rwhamsou2 = (rwhamSOu2) weakReference.get()) != null) {
            return rwhamsou2;
        }
        rwhamSOu2 rwhamsou22 = new rwhamSOu2();
        J4Ux7ym32.set(new WeakReference(rwhamsou22));
        return rwhamsou22;
    }

    public static void q3BipwRCk(ViewGroup viewGroup, SBj41z1W0 sBj41z1W0) {
        if (!tGV7Q6urW.contains(viewGroup)) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mN6fklC4R.tGV7Q6urW(viewGroup)) {
                tGV7Q6urW.add(viewGroup);
                if (sBj41z1W0 == null) {
                    sBj41z1W0 = q3BipwRCk;
                }
                SBj41z1W0 oon79WMrY = sBj41z1W0.clone();
                ArrayList arrayList = (ArrayList) J4Ux7ym32().getOrDefault(viewGroup, null);
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SBj41z1W0) it.next()).RG6kpfv3v(viewGroup);
                    }
                }
                if (oon79WMrY != null) {
                    oon79WMrY.Puu3Rhg4F(viewGroup, true);
                }
                K6PL0z3I0.q3BipwRCk(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (oon79WMrY != null) {
                    WxHrHceCL wxHrHceCL = new WxHrHceCL(oon79WMrY, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(wxHrHceCL);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(wxHrHceCL);
                }
            }
        }
    }
}
