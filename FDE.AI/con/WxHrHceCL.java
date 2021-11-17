package con;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class WxHrHceCL implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public SBj41z1W0 CBQ5d1kRq;
    public ViewGroup kmSgne1rO;

    public WxHrHceCL(SBj41z1W0 sBj41z1W0, ViewGroup viewGroup) {
        this.CBQ5d1kRq = sBj41z1W0;
        this.kmSgne1rO = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0204 A[EDGE_INSN: B:143:0x0204->B:93:0x0204 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onPreDraw() {
        /*
        // Method dump skipped, instructions count: 727
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WxHrHceCL.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.kmSgne1rO.getViewTreeObserver().removeOnPreDrawListener(this);
        this.kmSgne1rO.removeOnAttachStateChangeListener(this);
        XczobwRut.tGV7Q6urW.remove(this.kmSgne1rO);
        ArrayList arrayList = (ArrayList) XczobwRut.J4Ux7ym32().get(this.kmSgne1rO);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SBj41z1W0) it.next()).WaUP0CF08(this.kmSgne1rO);
            }
        }
        this.CBQ5d1kRq.yWvV4ePLl(true);
    }
}
