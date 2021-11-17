package con;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
/* loaded from: classes.dex */
public final /* synthetic */ class xJMblIIqI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object kmSgne1rO;

    public /* synthetic */ xJMblIIqI(AndroidComposeView androidComposeView) {
        this.kmSgne1rO = androidComposeView;
    }

    public /* synthetic */ xJMblIIqI(LCXryTULd lCXryTULd) {
        this.kmSgne1rO = lCXryTULd;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.CBQ5d1kRq) {
            case 0:
                Class cls = AndroidComposeView.ShSN9wbzk;
                ((AndroidComposeView) this.kmSgne1rO).sk5s77z6Q();
                return;
            default:
                LCXryTULd lCXryTULd = (LCXryTULd) this.kmSgne1rO;
                Rect rect = lCXryTULd.oon79WMrY;
                if (rect != null) {
                    lCXryTULd.q3BipwRCk.requestRectangleOnScreen(new Rect(rect));
                    return;
                }
                return;
        }
    }
}
