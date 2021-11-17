package con;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class vEcc3Zn4P extends tTcOo5jIP {
    public static final /* synthetic */ AtomicIntegerFieldUpdater ilHKhw3Yw = AtomicIntegerFieldUpdater.newUpdater(vEcc3Zn4P.class, "_invoked");
    public final PmanMZxiM MzoOEjc4X;
    private volatile /* synthetic */ int _invoked = 0;

    public vEcc3Zn4P(PmanMZxiM pmanMZxiM) {
        this.MzoOEjc4X = pmanMZxiM;
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        cAwN510t2((Throwable) obj);
        return qih4lW99W.q3BipwRCk;
    }

    @Override // con.OCBIGcYoA
    public void cAwN510t2(Throwable th) {
        if (ilHKhw3Yw.compareAndSet(this, 0, 1)) {
            this.MzoOEjc4X.IytU16YUK(th);
        }
    }
}
