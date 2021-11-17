package con;

import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class Roohga8FY {
    public int J4Ux7ym32 = -1;
    public WeakReference q3BipwRCk;

    public Roohga8FY(View view) {
        this.q3BipwRCk = new WeakReference(view);
    }

    public Roohga8FY GPLPRo6go(float f) {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public void J4Ux7ym32() {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public Roohga8FY dIocxURUo(DRrV7WVOe dRrV7WVOe) {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            kCA6Zs9sL(view, dRrV7WVOe);
        }
        return this;
    }

    public Roohga8FY iiGwOFFnr(iFKnyAZAM ifknyazam) {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            OoLXoaREZ ooLXoaREZ = null;
            if (ifknyazam != null) {
                ooLXoaREZ = new OoLXoaREZ(this, ifknyazam, view);
            }
            view.animate().setUpdateListener(ooLXoaREZ);
        }
        return this;
    }

    public final void kCA6Zs9sL(View view, DRrV7WVOe dRrV7WVOe) {
        if (dRrV7WVOe != null) {
            view.animate().setListener(new aIlHLkEoe(this, dRrV7WVOe, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public Roohga8FY q3BipwRCk(float f) {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public Roohga8FY tGV7Q6urW(long j) {
        View view = (View) this.q3BipwRCk.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }
}
