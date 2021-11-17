package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class DV1oYHwIh {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CBQ5d1kRq = AtomicReferenceFieldUpdater.newUpdater(DV1oYHwIh.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater kmSgne1rO = AtomicReferenceFieldUpdater.newUpdater(DV1oYHwIh.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Bhmn1KIah = AtomicReferenceFieldUpdater.newUpdater(DV1oYHwIh.class, Object.class, "_removedRef");

    public final Object Bhmn1KIah() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof mUx47mhWb)) {
                return obj;
            }
            ((mUx47mhWb) obj).q3BipwRCk(this);
        }
    }

    public final void CBQ5d1kRq(DV1oYHwIh dV1oYHwIh) {
        DV1oYHwIh dV1oYHwIh2;
        do {
            dV1oYHwIh2 = (DV1oYHwIh) dV1oYHwIh._prev;
            if (Bhmn1KIah() != dV1oYHwIh) {
                return;
            }
        } while (!kmSgne1rO.compareAndSet(dV1oYHwIh, dV1oYHwIh2, this));
        if (Eeka1udhb()) {
            dV1oYHwIh.vPSbyrYWX(null);
        }
    }

    public boolean Eeka1udhb() {
        return Bhmn1KIah() instanceof FH3z6PRTs;
    }

    public final DV1oYHwIh MzoOEjc4X() {
        DV1oYHwIh vPSbyrYWX = vPSbyrYWX(null);
        if (vPSbyrYWX == null) {
            Object obj = this._prev;
            while (true) {
                vPSbyrYWX = (DV1oYHwIh) obj;
                if (!vPSbyrYWX.Eeka1udhb()) {
                    break;
                }
                obj = vPSbyrYWX._prev;
            }
        }
        return vPSbyrYWX;
    }

    public final DV1oYHwIh PSTqBLTET() {
        Object Bhmn1KIah2 = Bhmn1KIah();
        FH3z6PRTs fH3z6PRTs = Bhmn1KIah2 instanceof FH3z6PRTs ? (FH3z6PRTs) Bhmn1KIah2 : null;
        return fH3z6PRTs == null ? (DV1oYHwIh) Bhmn1KIah2 : fH3z6PRTs.q3BipwRCk;
    }

    public boolean RG6kpfv3v() {
        return ixWaw2akD() == null;
    }

    public final int i8XZMQc6Z(DV1oYHwIh dV1oYHwIh, DV1oYHwIh dV1oYHwIh2, qFHLSmhbf qfhlsmhbf) {
        kmSgne1rO.lazySet(dV1oYHwIh, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CBQ5d1kRq;
        atomicReferenceFieldUpdater.lazySet(dV1oYHwIh, dV1oYHwIh2);
        qfhlsmhbf.tGV7Q6urW = dV1oYHwIh2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, dV1oYHwIh2, qfhlsmhbf)) {
            return 0;
        }
        return qfhlsmhbf.q3BipwRCk(this) == null ? 1 : 2;
    }

    public final void ilHKhw3Yw() {
        ((FH3z6PRTs) Bhmn1KIah()).q3BipwRCk.qVUwofr5s();
    }

    public final DV1oYHwIh ixWaw2akD() {
        Object Bhmn1KIah2;
        DV1oYHwIh dV1oYHwIh;
        FH3z6PRTs fH3z6PRTs;
        do {
            Bhmn1KIah2 = Bhmn1KIah();
            if (Bhmn1KIah2 instanceof FH3z6PRTs) {
                return ((FH3z6PRTs) Bhmn1KIah2).q3BipwRCk;
            }
            if (Bhmn1KIah2 == this) {
                return (DV1oYHwIh) Bhmn1KIah2;
            }
            dV1oYHwIh = (DV1oYHwIh) Bhmn1KIah2;
            fH3z6PRTs = (FH3z6PRTs) dV1oYHwIh._removedRef;
            if (fH3z6PRTs == null) {
                fH3z6PRTs = new FH3z6PRTs(dV1oYHwIh);
                Bhmn1KIah.lazySet(dV1oYHwIh, fH3z6PRTs);
            }
        } while (!CBQ5d1kRq.compareAndSet(this, Bhmn1KIah2, fH3z6PRTs));
        dV1oYHwIh.vPSbyrYWX(null);
        return null;
    }

    public final boolean oon79WMrY(DV1oYHwIh dV1oYHwIh, DV1oYHwIh dV1oYHwIh2) {
        kmSgne1rO.lazySet(dV1oYHwIh, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CBQ5d1kRq;
        atomicReferenceFieldUpdater.lazySet(dV1oYHwIh, dV1oYHwIh2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, dV1oYHwIh2, dV1oYHwIh)) {
            return false;
        }
        dV1oYHwIh.CBQ5d1kRq(dV1oYHwIh2);
        return true;
    }

    public final void qVUwofr5s() {
        DV1oYHwIh dV1oYHwIh = this;
        while (true) {
            Object Bhmn1KIah2 = dV1oYHwIh.Bhmn1KIah();
            if (!(Bhmn1KIah2 instanceof FH3z6PRTs)) {
                dV1oYHwIh.vPSbyrYWX(null);
                return;
            }
            dV1oYHwIh = ((FH3z6PRTs) Bhmn1KIah2).q3BipwRCk;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (con.DV1oYHwIh.CBQ5d1kRq.compareAndSet(r2, r1, ((con.FH3z6PRTs) r3).q3BipwRCk) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final DV1oYHwIh vPSbyrYWX(mUx47mhWb mux47mhwb) {
        while (true) {
            DV1oYHwIh dV1oYHwIh = (DV1oYHwIh) this._prev;
            DV1oYHwIh dV1oYHwIh2 = dV1oYHwIh;
            while (true) {
                DV1oYHwIh dV1oYHwIh3 = null;
                while (true) {
                    Object obj = dV1oYHwIh2._next;
                    if (obj == this) {
                        if (dV1oYHwIh == dV1oYHwIh2 || kmSgne1rO.compareAndSet(this, dV1oYHwIh, dV1oYHwIh2)) {
                            return dV1oYHwIh2;
                        }
                    } else if (Eeka1udhb()) {
                        return null;
                    } else {
                        if (obj == null) {
                            return dV1oYHwIh2;
                        }
                        if (obj instanceof mUx47mhWb) {
                            ((mUx47mhWb) obj).q3BipwRCk(dV1oYHwIh2);
                            break;
                        } else if (!(obj instanceof FH3z6PRTs)) {
                            dV1oYHwIh2 = (DV1oYHwIh) obj;
                            dV1oYHwIh3 = dV1oYHwIh2;
                        } else if (dV1oYHwIh3 != null) {
                            break;
                        } else {
                            dV1oYHwIh2 = (DV1oYHwIh) dV1oYHwIh2._prev;
                        }
                    }
                }
                dV1oYHwIh2 = dV1oYHwIh3;
            }
        }
    }
}
