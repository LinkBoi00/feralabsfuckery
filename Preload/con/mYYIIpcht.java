package con;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public class mYYIIpcht implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int CBQ5d1kRq = 4;
    public final /* synthetic */ Object kmSgne1rO;

    public mYYIIpcht(wnbPPCp4x wnbppcp4x) {
        this.kmSgne1rO = wnbppcp4x;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        switch (this.CBQ5d1kRq) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            default:
                if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(((LCXryTULd) this.kmSgne1rO).CBQ5d1kRq);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        switch (this.CBQ5d1kRq) {
            case 0:
                ViewTreeObserver viewTreeObserver2 = ((XSh7SAV24) this.kmSgne1rO).vNtjxmzUM;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ((XSh7SAV24) this.kmSgne1rO).vNtjxmzUM = view.getViewTreeObserver();
                    }
                    XSh7SAV24 xSh7SAV24 = (XSh7SAV24) this.kmSgne1rO;
                    xSh7SAV24.vNtjxmzUM.removeGlobalOnLayoutListener(xSh7SAV24.RG6kpfv3v);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                ViewTreeObserver viewTreeObserver3 = ((tDVlVoCRy) this.kmSgne1rO).iMyQMM6Qj;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        ((tDVlVoCRy) this.kmSgne1rO).iMyQMM6Qj = view.getViewTreeObserver();
                    }
                    tDVlVoCRy tdvlvocry = (tDVlVoCRy) this.kmSgne1rO;
                    tdvlvocry.iMyQMM6Qj.removeGlobalOnLayoutListener(tdvlvocry.RG6kpfv3v);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                Tpuv1V0a9 tpuv1V0a9 = (Tpuv1V0a9) this.kmSgne1rO;
                tpuv1V0a9.GPLPRo6go.removeCallbacks(tpuv1V0a9.sk5s77z6Q);
                return;
            case 3:
                wnbPPCp4x wnbppcp4x = (wnbPPCp4x) this.kmSgne1rO;
                v0l3RHDWl v0l3rhdwl = wnbppcp4x.Bhmn1KIah;
                if (v0l3rhdwl != null) {
                    v0l3rhdwl.q3BipwRCk();
                }
                wnbppcp4x.Bhmn1KIah = null;
                wnbppcp4x.requestLayout();
                return;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                ((Zgh96z4e6) ((JEWwjBE8f) this.kmSgne1rO)).oon79WMrY(null);
                return;
            default:
                if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(((LCXryTULd) this.kmSgne1rO).CBQ5d1kRq);
                    return;
                }
                return;
        }
    }

    public mYYIIpcht(Tpuv1V0a9 tpuv1V0a9) {
        this.kmSgne1rO = tpuv1V0a9;
    }

    public mYYIIpcht(XSh7SAV24 xSh7SAV24) {
        this.kmSgne1rO = xSh7SAV24;
    }

    public mYYIIpcht(JEWwjBE8f jEWwjBE8f) {
        this.kmSgne1rO = jEWwjBE8f;
    }

    public mYYIIpcht(tDVlVoCRy tdvlvocry) {
        this.kmSgne1rO = tdvlvocry;
    }

    public mYYIIpcht(LCXryTULd lCXryTULd) {
        this.kmSgne1rO = lCXryTULd;
    }
}
