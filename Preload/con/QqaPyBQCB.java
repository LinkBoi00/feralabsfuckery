package con;

import android.graphics.Rect;
import android.transition.Transition;
/* loaded from: classes.dex */
public class QqaPyBQCB extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    public QqaPyBQCB(ymwkPoInc ymwkpoinc, Rect rect, int i) {
        this.q3BipwRCk = i;
        if (i != 1) {
            this.J4Ux7ym32 = rect;
        } else {
            this.J4Ux7ym32 = rect;
        }
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        switch (this.q3BipwRCk) {
            case 0:
                return this.J4Ux7ym32;
            default:
                Rect rect = this.J4Ux7ym32;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return this.J4Ux7ym32;
        }
    }
}
