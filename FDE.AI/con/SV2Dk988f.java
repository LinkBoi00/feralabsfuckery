package con;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class SV2Dk988f {
    public final boolean J4Ux7ym32;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public /* synthetic */ AtomicReferenceArray dIocxURUo;
    public final int q3BipwRCk;
    public final int tGV7Q6urW;
    public static final vX9ZKIhAp GPLPRo6go = new vX9ZKIhAp("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicReferenceFieldUpdater kCA6Zs9sL = AtomicReferenceFieldUpdater.newUpdater(SV2Dk988f.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater iiGwOFFnr = AtomicLongFieldUpdater.newUpdater(SV2Dk988f.class, "_state");

    public SV2Dk988f(int i, boolean z) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = z;
        int i2 = i - 1;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean J4Ux7ym32() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!iiGwOFFnr.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final boolean dIocxURUo() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final Object iiGwOFFnr() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return GPLPRo6go;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.tGV7Q6urW;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.dIocxURUo.get(i4);
            if (obj == null) {
                if (this.J4Ux7ym32) {
                    return null;
                }
            } else if (obj instanceof T2eTDSGMF) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                if (iiGwOFFnr.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.dIocxURUo.set(this.tGV7Q6urW & i, null);
                    return obj;
                } else if (this.J4Ux7ym32) {
                    SV2Dk988f sV2Dk988f = this;
                    while (true) {
                        long j3 = sV2Dk988f._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            sV2Dk988f = sV2Dk988f.kCA6Zs9sL();
                        } else if (iiGwOFFnr.compareAndSet(sV2Dk988f, j3, (j3 & -1073741824) | j2)) {
                            sV2Dk988f.dIocxURUo.set(sV2Dk988f.tGV7Q6urW & i5, null);
                            sV2Dk988f = null;
                        } else {
                            continue;
                        }
                        if (sV2Dk988f == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }

    public final SV2Dk988f kCA6Zs9sL() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (iiGwOFFnr.compareAndSet(this, j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            SV2Dk988f sV2Dk988f = (SV2Dk988f) this._next;
            if (sV2Dk988f != null) {
                return sV2Dk988f;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kCA6Zs9sL;
            SV2Dk988f sV2Dk988f2 = new SV2Dk988f(this.q3BipwRCk * 2, this.J4Ux7ym32);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.tGV7Q6urW;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object obj = this.dIocxURUo.get(i4);
                    if (obj == null) {
                        obj = new T2eTDSGMF(i);
                    }
                    sV2Dk988f2.dIocxURUo.set(sV2Dk988f2.tGV7Q6urW & i, obj);
                    i++;
                }
            }
            sV2Dk988f2._state = -1152921504606846977L & j;
            atomicReferenceFieldUpdater.compareAndSet(this, null, sV2Dk988f2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int q3BipwRCk(java.lang.Object r15) {
        /*
            r14 = this;
        L_0x0000:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0015
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0014
            r1 = 2
        L_0x0014:
            return r1
        L_0x0015:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.tGV7Q6urW
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L_0x0030
            return r1
        L_0x0030:
            boolean r4 = r14.J4Ux7ym32
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.dIocxURUo
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r2 = r14.q3BipwRCk
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x004e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L_0x0000
        L_0x004e:
            return r1
        L_0x004f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = con.SV2Dk988f.iiGwOFFnr
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.dIocxURUo
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L_0x006d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0077
            goto L_0x009a
        L_0x0077:
            con.SV2Dk988f r0 = r0.kCA6Zs9sL()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.dIocxURUo
            int r2 = r0.tGV7Q6urW
            r2 = r2 & r10
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof con.T2eTDSGMF
            if (r2 == 0) goto L_0x0097
            con.T2eTDSGMF r1 = (con.T2eTDSGMF) r1
            int r1 = r1.q3BipwRCk
            if (r1 != r10) goto L_0x0097
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.dIocxURUo
            int r2 = r0.tGV7Q6urW
            r2 = r2 & r10
            r1.set(r2, r15)
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            if (r0 != 0) goto L_0x006d
        L_0x009a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.SV2Dk988f.q3BipwRCk(java.lang.Object):int");
    }

    public final int tGV7Q6urW() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }
}
