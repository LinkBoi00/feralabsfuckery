package con;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ywLNtYaFP implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int CBQ5d1kRq = 2;
    public final /* synthetic */ Object kmSgne1rO;

    public ywLNtYaFP(iSPvE3YGn ispve3ygn) {
        this.kmSgne1rO = ispve3ygn;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean z = false;
        switch (this.CBQ5d1kRq) {
            case 0:
                if (((XSh7SAV24) this.kmSgne1rO).J4Ux7ym32() && ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.size() > 0 && !((W85tF8RjC) ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.get(0)).q3BipwRCk.NyWTwPF6V) {
                    View view = ((XSh7SAV24) this.kmSgne1rO).iMyQMM6Qj;
                    if (view == null || !view.isShown()) {
                        ((XSh7SAV24) this.kmSgne1rO).dismiss();
                        return;
                    }
                    for (W85tF8RjC w85tF8RjC : ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8) {
                        w85tF8RjC.q3BipwRCk.GPLPRo6go();
                    }
                    return;
                }
                return;
            case 1:
                if (((tDVlVoCRy) this.kmSgne1rO).J4Ux7ym32()) {
                    tDVlVoCRy tdvlvocry = (tDVlVoCRy) this.kmSgne1rO;
                    if (!tdvlvocry.dXrmkklc8.NyWTwPF6V) {
                        View view2 = tdvlvocry.i8XZMQc6Z;
                        if (view2 == null || !view2.isShown()) {
                            ((tDVlVoCRy) this.kmSgne1rO).dismiss();
                            return;
                        } else {
                            ((tDVlVoCRy) this.kmSgne1rO).dXrmkklc8.GPLPRo6go();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                if (!((JMfjgYvcq) this.kmSgne1rO).getInternalPopup().J4Ux7ym32()) {
                    ((JMfjgYvcq) this.kmSgne1rO).J4Ux7ym32();
                }
                ViewTreeObserver viewTreeObserver = ((JMfjgYvcq) this.kmSgne1rO).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                iSPvE3YGn ispve3ygn = (iSPvE3YGn) this.kmSgne1rO;
                JMfjgYvcq jMfjgYvcq = ispve3ygn.TyB1UUd72;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (mN6fklC4R.J4Ux7ym32(jMfjgYvcq) && jMfjgYvcq.getGlobalVisibleRect(ispve3ygn.igRQEZxnW)) {
                    z = true;
                }
                if (!z) {
                    ((iSPvE3YGn) this.kmSgne1rO).dismiss();
                    return;
                }
                ((iSPvE3YGn) this.kmSgne1rO).dXrmkklc8();
                ((iSPvE3YGn) this.kmSgne1rO).GPLPRo6go();
                return;
        }
    }

    public ywLNtYaFP(JMfjgYvcq jMfjgYvcq) {
        this.kmSgne1rO = jMfjgYvcq;
    }

    public ywLNtYaFP(XSh7SAV24 xSh7SAV24) {
        this.kmSgne1rO = xSh7SAV24;
    }

    public ywLNtYaFP(tDVlVoCRy tdvlvocry) {
        this.kmSgne1rO = tdvlvocry;
    }
}
