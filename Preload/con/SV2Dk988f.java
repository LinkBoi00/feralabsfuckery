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
    public final int q3BipwRCk(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.tGV7Q6urW;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.J4Ux7ym32 && this.dIocxURUo.get(i2 & i3) != null) {
                int i4 = this.q3BipwRCk;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (iiGwOFFnr.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.dIocxURUo.set(i2 & i3, obj);
                SV2Dk988f sV2Dk988f = this;
                while ((sV2Dk988f._state & 1152921504606846976L) != 0) {
                    sV2Dk988f = sV2Dk988f.kCA6Zs9sL();
                    Object obj2 = sV2Dk988f.dIocxURUo.get(sV2Dk988f.tGV7Q6urW & i2);
                    if (!(obj2 instanceof T2eTDSGMF) || ((T2eTDSGMF) obj2).q3BipwRCk != i2) {
                        sV2Dk988f = null;
                        continue;
                    } else {
                        sV2Dk988f.dIocxURUo.set(sV2Dk988f.tGV7Q6urW & i2, obj);
                        continue;
                    }
                    if (sV2Dk988f == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final int tGV7Q6urW() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }
}
