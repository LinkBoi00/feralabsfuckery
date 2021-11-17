package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class ZwCuKt5sx {
    public static final /* synthetic */ AtomicReferenceFieldUpdater q3BipwRCk = AtomicReferenceFieldUpdater.newUpdater(ZwCuKt5sx.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public ZwCuKt5sx(boolean z) {
        this._cur = new SV2Dk988f(8, z);
    }

    public final void J4Ux7ym32() {
        while (true) {
            SV2Dk988f sV2Dk988f = (SV2Dk988f) this._cur;
            if (!sV2Dk988f.J4Ux7ym32()) {
                q3BipwRCk.compareAndSet(this, sV2Dk988f, sV2Dk988f.kCA6Zs9sL());
            } else {
                return;
            }
        }
    }

    public final Object dIocxURUo() {
        while (true) {
            SV2Dk988f sV2Dk988f = (SV2Dk988f) this._cur;
            Object iiGwOFFnr = sV2Dk988f.iiGwOFFnr();
            if (iiGwOFFnr != SV2Dk988f.GPLPRo6go) {
                return iiGwOFFnr;
            }
            q3BipwRCk.compareAndSet(this, sV2Dk988f, sV2Dk988f.kCA6Zs9sL());
        }
    }

    public final boolean q3BipwRCk(Object obj) {
        while (true) {
            SV2Dk988f sV2Dk988f = (SV2Dk988f) this._cur;
            int q3BipwRCk2 = sV2Dk988f.q3BipwRCk(obj);
            if (q3BipwRCk2 == 0) {
                return true;
            }
            if (q3BipwRCk2 == 1) {
                q3BipwRCk.compareAndSet(this, sV2Dk988f, sV2Dk988f.kCA6Zs9sL());
            } else if (q3BipwRCk2 == 2) {
                return false;
            }
        }
    }

    public final int tGV7Q6urW() {
        return ((SV2Dk988f) this._cur).tGV7Q6urW();
    }
}
