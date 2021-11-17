package con;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class vv61aJl28 implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ xobLfQFEO CBQ5d1kRq;
    public final /* synthetic */ UxHHqhbTP Eeka1udhb;
    public final /* synthetic */ ArrayList MzoOEjc4X;
    public final /* synthetic */ pIv3jHZsn PSTqBLTET;
    public final /* synthetic */ ArrayList RG6kpfv3v;
    public final /* synthetic */ boolean dXrmkklc8;
    public final /* synthetic */ View ilHKhw3Yw;
    public final /* synthetic */ Object ixWaw2akD;
    public final /* synthetic */ rwhamSOu2 kmSgne1rO;
    public final /* synthetic */ UxHHqhbTP qVUwofr5s;
    public final /* synthetic */ Rect sk5s77z6Q;

    public vv61aJl28(xobLfQFEO xoblfqfeo, rwhamSOu2 rwhamsou2, Object obj, pIv3jHZsn piv3jhzsn, ArrayList arrayList, View view, UxHHqhbTP uxHHqhbTP, UxHHqhbTP uxHHqhbTP2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.CBQ5d1kRq = xoblfqfeo;
        this.kmSgne1rO = rwhamsou2;
        this.Bhmn1KIah = obj;
        this.PSTqBLTET = piv3jhzsn;
        this.MzoOEjc4X = arrayList;
        this.ilHKhw3Yw = view;
        this.qVUwofr5s = uxHHqhbTP;
        this.Eeka1udhb = uxHHqhbTP2;
        this.dXrmkklc8 = z;
        this.RG6kpfv3v = arrayList2;
        this.ixWaw2akD = obj2;
        this.sk5s77z6Q = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        rwhamSOu2 kCA6Zs9sL = XU5bm7KSu.kCA6Zs9sL(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, this.PSTqBLTET);
        if (kCA6Zs9sL != null) {
            this.MzoOEjc4X.addAll(kCA6Zs9sL.values());
            this.MzoOEjc4X.add(this.ilHKhw3Yw);
        }
        XU5bm7KSu.tGV7Q6urW(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, kCA6Zs9sL, false);
        Object obj = this.Bhmn1KIah;
        if (obj != null) {
            this.CBQ5d1kRq.WaUP0CF08(obj, this.RG6kpfv3v, this.MzoOEjc4X);
            View vPSbyrYWX = XU5bm7KSu.vPSbyrYWX(kCA6Zs9sL, this.PSTqBLTET, this.ixWaw2akD, this.dXrmkklc8);
            if (vPSbyrYWX != null) {
                this.CBQ5d1kRq.oon79WMrY(vPSbyrYWX, this.sk5s77z6Q);
            }
        }
    }
}
