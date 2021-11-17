package con;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NdeNx9ZYu implements Runnable {
    public final /* synthetic */ Map Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ ArrayList kmSgne1rO;

    public NdeNx9ZYu(xobLfQFEO xoblfqfeo, ArrayList arrayList, Map map, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = arrayList;
            this.Bhmn1KIah = map;
            return;
        }
        this.kmSgne1rO = arrayList;
        this.Bhmn1KIah = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int i = 0;
        switch (this.CBQ5d1kRq) {
            case 0:
                int size = this.kmSgne1rO.size();
                while (i < size) {
                    View view = (View) this.kmSgne1rO.get(i);
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    String vPSbyrYWX = mJLaJepZo.vPSbyrYWX(view);
                    if (vPSbyrYWX != null) {
                        Iterator it = this.Bhmn1KIah.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (vPSbyrYWX.equals(entry.getValue())) {
                                    str = (String) entry.getKey();
                                }
                            } else {
                                str = null;
                            }
                        }
                        mJLaJepZo.ixWaw2akD(view, str);
                    }
                    i++;
                }
                return;
            default:
                int size2 = this.kmSgne1rO.size();
                while (i < size2) {
                    View view2 = (View) this.kmSgne1rO.get(i);
                    WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                    mJLaJepZo.ixWaw2akD(view2, (String) this.Bhmn1KIah.get(mJLaJepZo.vPSbyrYWX(view2)));
                    i++;
                }
                return;
        }
    }
}
