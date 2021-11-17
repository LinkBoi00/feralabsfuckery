package con;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes.dex */
public class TEVOiLnrc implements Runnable {
    public final /* synthetic */ boolean Bhmn1KIah;
    public final /* synthetic */ UxHHqhbTP CBQ5d1kRq;
    public final /* synthetic */ View MzoOEjc4X;
    public final /* synthetic */ rwhamSOu2 PSTqBLTET;
    public final /* synthetic */ xobLfQFEO ilHKhw3Yw;
    public final /* synthetic */ UxHHqhbTP kmSgne1rO;
    public final /* synthetic */ Rect qVUwofr5s;

    public TEVOiLnrc(UxHHqhbTP uxHHqhbTP, UxHHqhbTP uxHHqhbTP2, boolean z, rwhamSOu2 rwhamsou2, View view, xobLfQFEO xoblfqfeo, Rect rect) {
        this.CBQ5d1kRq = uxHHqhbTP;
        this.kmSgne1rO = uxHHqhbTP2;
        this.Bhmn1KIah = z;
        this.PSTqBLTET = rwhamsou2;
        this.MzoOEjc4X = view;
        this.ilHKhw3Yw = xoblfqfeo;
        this.qVUwofr5s = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        XU5bm7KSu.tGV7Q6urW(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, this.PSTqBLTET, false);
        View view = this.MzoOEjc4X;
        if (view != null) {
            this.ilHKhw3Yw.oon79WMrY(view, this.qVUwofr5s);
        }
    }
}
