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
    public final con.DV1oYHwIh vPSbyrYWX(con.mUx47mhWb r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            con.DV1oYHwIh r7 = (con.DV1oYHwIh) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = con.DV1oYHwIh.kmSgne1rO
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.Eeka1udhb()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof con.mUx47mhWb
            if (r4 == 0) goto L_0x002c
            con.mUx47mhWb r3 = (con.mUx47mhWb) r3
            r3.q3BipwRCk(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof con.FH3z6PRTs
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = con.DV1oYHwIh.CBQ5d1kRq
            con.FH3z6PRTs r3 = (con.FH3z6PRTs) r3
            con.DV1oYHwIh r3 = r3.q3BipwRCk
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            con.DV1oYHwIh r1 = (con.DV1oYHwIh) r1
            goto L_0x0007
        L_0x0046:
            r2 = r3
            con.DV1oYHwIh r2 = (con.DV1oYHwIh) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: con.DV1oYHwIh.vPSbyrYWX(con.mUx47mhWb):con.DV1oYHwIh");
    }
}
