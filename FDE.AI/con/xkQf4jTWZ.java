package con;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class xkQf4jTWZ implements Runnable {
    public final /* synthetic */ ArrayList Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ ArrayList MzoOEjc4X;
    public final /* synthetic */ ArrayList PSTqBLTET;
    public final /* synthetic */ ArrayList kmSgne1rO;

    public xkQf4jTWZ(xobLfQFEO xoblfqfeo, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = arrayList;
        this.Bhmn1KIah = arrayList2;
        this.PSTqBLTET = arrayList3;
        this.MzoOEjc4X = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.CBQ5d1kRq; i++) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.ixWaw2akD((View) this.kmSgne1rO.get(i), (String) this.Bhmn1KIah.get(i));
            mJLaJepZo.ixWaw2akD((View) this.PSTqBLTET.get(i), (String) this.MzoOEjc4X.get(i));
        }
    }
}
