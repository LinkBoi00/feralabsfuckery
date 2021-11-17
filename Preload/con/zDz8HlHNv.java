package con;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class zDz8HlHNv implements Executor, Closeable {
    public final long Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final leiAJTXxT MzoOEjc4X;
    public final String PSTqBLTET;
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public final leiAJTXxT ilHKhw3Yw;
    public final int kmSgne1rO;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final AtomicReferenceArray qVUwofr5s;
    public static final vX9ZKIhAp ixWaw2akD = new vX9ZKIhAp("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater Eeka1udhb = AtomicLongFieldUpdater.newUpdater(zDz8HlHNv.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater dXrmkklc8 = AtomicLongFieldUpdater.newUpdater(zDz8HlHNv.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater RG6kpfv3v = AtomicIntegerFieldUpdater.newUpdater(zDz8HlHNv.class, "_isTerminated");

    public zDz8HlHNv(int i, int i2, long j, String str) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = i2;
        this.Bhmn1KIah = j;
        this.PSTqBLTET = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.MzoOEjc4X = new leiAJTXxT();
                        this.ilHKhw3Yw = new leiAJTXxT();
                        this.parkedWorkersStack = 0;
                        this.qVUwofr5s = new AtomicReferenceArray(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    public final void GPLPRo6go(AdXqJxcTm adXqJxcTm, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? kCA6Zs9sL(adXqJxcTm) : i2;
            }
            if (i3 >= 0 && Eeka1udhb.compareAndSet(this, j, j2 | ((long) i3))) {
                return;
            }
        }
    }

    public final P3AfVviyS J4Ux7ym32(Runnable runnable, MgUdeu75i mgUdeu75i) {
        Objects.requireNonNull((NjBZSsY6P) wq9HUSqWV.kCA6Zs9sL);
        long nanoTime = System.nanoTime();
        if (!(runnable instanceof P3AfVviyS)) {
            return new xeRnjdFDi(runnable, nanoTime, mgUdeu75i);
        }
        P3AfVviyS p3AfVviyS = (P3AfVviyS) runnable;
        p3AfVviyS.CBQ5d1kRq = nanoTime;
        p3AfVviyS.kmSgne1rO = mgUdeu75i;
        return p3AfVviyS;
    }

    public final void Puu3Rhg4F(P3AfVviyS p3AfVviyS) {
        try {
            p3AfVviyS.run();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[LOOP:0: B:12:0x001f->B:26:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063 A[EDGE_INSN: B:45:0x0063->B:27:0x0063 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void close() {
        int i;
        boolean z;
        if (RG6kpfv3v.compareAndSet(this, 0, 1)) {
            AdXqJxcTm tGV7Q6urW = tGV7Q6urW();
            synchronized (this.qVUwofr5s) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    AdXqJxcTm adXqJxcTm = (AdXqJxcTm) this.qVUwofr5s.get(i2);
                    if (adXqJxcTm != tGV7Q6urW) {
                        while (adXqJxcTm.isAlive()) {
                            LockSupport.unpark(adXqJxcTm);
                            adXqJxcTm.join(10000);
                        }
                        SdmiF4e4J sdmiF4e4J = adXqJxcTm.CBQ5d1kRq;
                        leiAJTXxT leiajtxxt = this.ilHKhw3Yw;
                        Objects.requireNonNull(sdmiF4e4J);
                        P3AfVviyS p3AfVviyS = (P3AfVviyS) SdmiF4e4J.J4Ux7ym32.getAndSet(sdmiF4e4J, null);
                        if (p3AfVviyS != null) {
                            leiajtxxt.q3BipwRCk(p3AfVviyS);
                        }
                        do {
                            P3AfVviyS iiGwOFFnr = sdmiF4e4J.iiGwOFFnr();
                            if (iiGwOFFnr == null) {
                                z = false;
                                continue;
                            } else {
                                leiajtxxt.q3BipwRCk(iiGwOFFnr);
                                z = true;
                                continue;
                            }
                        } while (z);
                        if (i2 != i) {
                            break;
                        }
                        i2 = i3;
                    } else if (i2 != i) {
                    }
                }
            }
            this.ilHKhw3Yw.J4Ux7ym32();
            this.MzoOEjc4X.J4Ux7ym32();
            while (true) {
                P3AfVviyS q3BipwRCk = tGV7Q6urW == null ? null : tGV7Q6urW.q3BipwRCk(true);
                if (q3BipwRCk == null && (q3BipwRCk = (P3AfVviyS) this.MzoOEjc4X.dIocxURUo()) == null && (q3BipwRCk = (P3AfVviyS) this.ilHKhw3Yw.dIocxURUo()) == null) {
                    break;
                }
                Puu3Rhg4F(q3BipwRCk);
            }
            if (tGV7Q6urW != null) {
                tGV7Q6urW.Puu3Rhg4F(5);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final void dIocxURUo(Runnable runnable, MgUdeu75i mgUdeu75i, boolean z) {
        P3AfVviyS p3AfVviyS;
        P3AfVviyS J4Ux7ym32 = J4Ux7ym32(runnable, mgUdeu75i);
        AdXqJxcTm tGV7Q6urW = tGV7Q6urW();
        boolean z2 = true;
        if (tGV7Q6urW == null || tGV7Q6urW.kmSgne1rO == 5 || (J4Ux7ym32.kmSgne1rO.kCA6Zs9sL() == 0 && tGV7Q6urW.kmSgne1rO == 2)) {
            p3AfVviyS = J4Ux7ym32;
        } else {
            tGV7Q6urW.ilHKhw3Yw = true;
            p3AfVviyS = tGV7Q6urW.CBQ5d1kRq.q3BipwRCk(J4Ux7ym32, z);
        }
        if (p3AfVviyS != null) {
            if (!(p3AfVviyS.kmSgne1rO.kCA6Zs9sL() == 1 ? this.ilHKhw3Yw : this.MzoOEjc4X).q3BipwRCk(p3AfVviyS)) {
                throw new RejectedExecutionException(anXlDk6fV.iMyQMM6Qj(this.PSTqBLTET, " was terminated"));
            }
        }
        if (!z || tGV7Q6urW == null) {
            z2 = false;
        }
        if (J4Ux7ym32.kmSgne1rO.kCA6Zs9sL() != 0) {
            long addAndGet = dXrmkklc8.addAndGet(this, 2097152);
            if (!z2 && !vPSbyrYWX() && !oon79WMrY(addAndGet)) {
                vPSbyrYWX();
            }
        } else if (!z2) {
            yWvV4ePLl();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dIocxURUo(runnable, djFtLGhoA.CBQ5d1kRq, false);
    }

    public final boolean iiGwOFFnr(AdXqJxcTm adXqJxcTm) {
        long j;
        int J4Ux7ym32;
        if (adXqJxcTm.tGV7Q6urW() != ixWaw2akD) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            J4Ux7ym32 = adXqJxcTm.J4Ux7ym32();
            adXqJxcTm.GPLPRo6go(this.qVUwofr5s.get((int) (2097151 & j)));
        } while (!Eeka1udhb.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) J4Ux7ym32)));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int kCA6Zs9sL(AdXqJxcTm adXqJxcTm) {
        int J4Ux7ym32;
        do {
            Object tGV7Q6urW = adXqJxcTm.tGV7Q6urW();
            if (tGV7Q6urW == ixWaw2akD) {
                return -1;
            }
            if (tGV7Q6urW == null) {
                return 0;
            }
            adXqJxcTm = (AdXqJxcTm) tGV7Q6urW;
            J4Ux7ym32 = adXqJxcTm.J4Ux7ym32();
        } while (J4Ux7ym32 == 0);
        return J4Ux7ym32;
    }

    public final boolean oon79WMrY(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.CBQ5d1kRq) {
            int q3BipwRCk = q3BipwRCk();
            if (q3BipwRCk == 1 && this.CBQ5d1kRq > 1) {
                q3BipwRCk();
            }
            if (q3BipwRCk > 0) {
                return true;
            }
        }
        return false;
    }

    public final int q3BipwRCk() {
        int i;
        synchronized (this.qVUwofr5s) {
            if (this._isTerminated != 0) {
                i = -1;
            } else {
                long j = this.controlState;
                int i2 = (int) (j & 2097151);
                int i3 = i2 - ((int) ((j & 4398044413952L) >> 21));
                boolean z = false;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.CBQ5d1kRq) {
                    return 0;
                }
                if (i2 >= this.kmSgne1rO) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (i4 > 0 && this.qVUwofr5s.get(i4) == null) {
                    AdXqJxcTm adXqJxcTm = new AdXqJxcTm(this, i4);
                    this.qVUwofr5s.set(i4, adXqJxcTm);
                    if (i4 == ((int) (2097151 & dXrmkklc8.incrementAndGet(this)))) {
                        z = true;
                    }
                    if (z) {
                        adXqJxcTm.start();
                        i = i3 + 1;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return i;
        }
    }

    public final AdXqJxcTm tGV7Q6urW() {
        Thread currentThread = Thread.currentThread();
        AdXqJxcTm adXqJxcTm = currentThread instanceof AdXqJxcTm ? (AdXqJxcTm) currentThread : null;
        if (adXqJxcTm != null && anXlDk6fV.tGV7Q6urW(adXqJxcTm.qVUwofr5s, this)) {
            return adXqJxcTm;
        }
        return null;
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.qVUwofr5s.length();
        int i5 = 0;
        if (1 < length) {
            int i6 = 1;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
            while (true) {
                int i7 = i6 + 1;
                AdXqJxcTm adXqJxcTm = (AdXqJxcTm) this.qVUwofr5s.get(i6);
                if (adXqJxcTm != null) {
                    int dIocxURUo = adXqJxcTm.CBQ5d1kRq.dIocxURUo();
                    int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(adXqJxcTm.kmSgne1rO);
                    if (tGV7Q6urW == 0) {
                        i5++;
                        sb = new StringBuilder();
                        sb.append(dIocxURUo);
                        c = 'c';
                    } else if (tGV7Q6urW == 1) {
                        i4++;
                        sb = new StringBuilder();
                        sb.append(dIocxURUo);
                        c = 'b';
                    } else if (tGV7Q6urW == 2) {
                        i3++;
                    } else if (tGV7Q6urW == 3) {
                        i2++;
                        if (dIocxURUo > 0) {
                            sb = new StringBuilder();
                            sb.append(dIocxURUo);
                            c = 'd';
                        }
                    } else if (tGV7Q6urW == 4) {
                        i++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                }
                if (i7 >= length) {
                    break;
                }
                i6 = i7;
            }
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j = this.controlState;
        return this.PSTqBLTET + '@' + cOutqbkMD.GPLPRo6go(this) + "[Pool Size {core = " + this.CBQ5d1kRq + ", max = " + this.kmSgne1rO + "}, Worker States {CPU = " + i5 + ", blocking = " + i4 + ", parked = " + i3 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.MzoOEjc4X.tGV7Q6urW() + ", global blocking queue size = " + this.ilHKhw3Yw.tGV7Q6urW() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.CBQ5d1kRq - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }

    public final boolean vPSbyrYWX() {
        while (true) {
            long j = this.parkedWorkersStack;
            AdXqJxcTm adXqJxcTm = (AdXqJxcTm) this.qVUwofr5s.get((int) (2097151 & j));
            if (adXqJxcTm == null) {
                adXqJxcTm = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                int kCA6Zs9sL = kCA6Zs9sL(adXqJxcTm);
                if (kCA6Zs9sL >= 0 && Eeka1udhb.compareAndSet(this, j, ((long) kCA6Zs9sL) | j2)) {
                    adXqJxcTm.GPLPRo6go(ixWaw2akD);
                }
            }
            if (adXqJxcTm == null) {
                return false;
            }
            if (AdXqJxcTm.Eeka1udhb.compareAndSet(adXqJxcTm, -1, 0)) {
                LockSupport.unpark(adXqJxcTm);
                return true;
            }
        }
    }

    public final void yWvV4ePLl() {
        if (!vPSbyrYWX() && !oon79WMrY(this.controlState)) {
            vPSbyrYWX();
        }
    }
}
