package con;

import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class FBoi8InCZ implements Runnable {
    public final /* synthetic */ View Bhmn1KIah;
    public final /* synthetic */ Object CBQ5d1kRq;
    public final /* synthetic */ Object Eeka1udhb;
    public final /* synthetic */ ArrayList MzoOEjc4X;
    public final /* synthetic */ UxHHqhbTP PSTqBLTET;
    public final /* synthetic */ ArrayList ilHKhw3Yw;
    public final /* synthetic */ xobLfQFEO kmSgne1rO;
    public final /* synthetic */ ArrayList qVUwofr5s;

    public FBoi8InCZ(Object obj, xobLfQFEO xoblfqfeo, View view, UxHHqhbTP uxHHqhbTP, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = xoblfqfeo;
        this.Bhmn1KIah = view;
        this.PSTqBLTET = uxHHqhbTP;
        this.MzoOEjc4X = arrayList;
        this.ilHKhw3Yw = arrayList2;
        this.qVUwofr5s = arrayList3;
        this.Eeka1udhb = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.CBQ5d1kRq;
        if (obj != null) {
            this.kmSgne1rO.PSTqBLTET(obj, this.Bhmn1KIah);
            this.ilHKhw3Yw.addAll(XU5bm7KSu.Puu3Rhg4F(this.kmSgne1rO, this.CBQ5d1kRq, this.PSTqBLTET, this.MzoOEjc4X, this.Bhmn1KIah));
        }
        if (this.qVUwofr5s != null) {
            if (this.Eeka1udhb != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.Bhmn1KIah);
                this.kmSgne1rO.MzoOEjc4X(this.Eeka1udhb, this.qVUwofr5s, arrayList);
            }
            this.qVUwofr5s.clear();
            this.qVUwofr5s.add(this.Bhmn1KIah);
        }
    }
}
