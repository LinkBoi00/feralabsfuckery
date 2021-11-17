package con;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class Ohkja0BCf implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ qt4vMCOja kmSgne1rO;

    public Ohkja0BCf(qt4vMCOja qt4vmcoja, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = qt4vmcoja;
        } else {
            this.kmSgne1rO = qt4vmcoja;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                ViewParent parent = this.kmSgne1rO.PSTqBLTET.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                qt4vMCOja qt4vmcoja = this.kmSgne1rO;
                qt4vmcoja.q3BipwRCk();
                View view = qt4vmcoja.PSTqBLTET;
                if (view.isEnabled() && !view.isLongClickable() && qt4vmcoja.tGV7Q6urW()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    qt4vmcoja.qVUwofr5s = true;
                    return;
                }
                return;
        }
    }
}
