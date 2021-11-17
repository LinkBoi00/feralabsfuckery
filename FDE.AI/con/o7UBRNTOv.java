package con;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public class o7UBRNTOv implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener CBQ5d1kRq;
    public final /* synthetic */ iSPvE3YGn kmSgne1rO;

    public o7UBRNTOv(iSPvE3YGn ispve3ygn, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.kmSgne1rO = ispve3ygn;
        this.CBQ5d1kRq = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.kmSgne1rO.TyB1UUd72.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.CBQ5d1kRq);
        }
    }
}
