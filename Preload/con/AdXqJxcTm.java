package con;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class AdXqJxcTm extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Eeka1udhb = AtomicIntegerFieldUpdater.newUpdater(AdXqJxcTm.class, "workerCtl");
    public long Bhmn1KIah;
    public long PSTqBLTET;
    public boolean ilHKhw3Yw;
    private volatile int indexInArray;
    public final /* synthetic */ zDz8HlHNv qVUwofr5s;
    public final SdmiF4e4J CBQ5d1kRq = new SdmiF4e4J();
    public int kmSgne1rO = 4;
    public volatile /* synthetic */ int workerCtl = 0;
    private volatile Object nextParkedWorker = zDz8HlHNv.ixWaw2akD;
    public int MzoOEjc4X = frseFxszT.CBQ5d1kRq.q3BipwRCk();

    public AdXqJxcTm(zDz8HlHNv zdz8hlhnv, int i) {
        this.qVUwofr5s = zdz8hlhnv;
        this.qVUwofr5s = zdz8hlhnv;
        setDaemon(true);
        tARdjubCZ tardjubcz = frseFxszT.kmSgne1rO;
        iiGwOFFnr(i);
    }

    public final void GPLPRo6go(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final int J4Ux7ym32() {
        return this.indexInArray;
    }

    public final boolean Puu3Rhg4F(int i) {
        int i2 = this.kmSgne1rO;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            zDz8HlHNv.dXrmkklc8.addAndGet(this.qVUwofr5s, 4398046511104L);
        }
        if (i2 != i) {
            this.kmSgne1rO = i;
        }
        return z;
    }

    public final int dIocxURUo(int i) {
        int i2 = this.MzoOEjc4X;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.MzoOEjc4X = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final void iiGwOFFnr(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.qVUwofr5s.PSTqBLTET);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final P3AfVviyS kCA6Zs9sL() {
        leiAJTXxT leiajtxxt;
        if (dIocxURUo(2) == 0) {
            P3AfVviyS p3AfVviyS = (P3AfVviyS) this.qVUwofr5s.MzoOEjc4X.dIocxURUo();
            if (p3AfVviyS != null) {
                return p3AfVviyS;
            }
            leiajtxxt = this.qVUwofr5s.ilHKhw3Yw;
        } else {
            P3AfVviyS p3AfVviyS2 = (P3AfVviyS) this.qVUwofr5s.ilHKhw3Yw.dIocxURUo();
            if (p3AfVviyS2 != null) {
                return p3AfVviyS2;
            }
            leiajtxxt = this.qVUwofr5s.MzoOEjc4X;
        }
        return (P3AfVviyS) leiajtxxt.dIocxURUo();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final P3AfVviyS q3BipwRCk(boolean z) {
        boolean z2;
        P3AfVviyS p3AfVviyS;
        P3AfVviyS kCA6Zs9sL;
        P3AfVviyS kCA6Zs9sL2;
        boolean z3;
        boolean z4 = true;
        if (this.kmSgne1rO != 1) {
            zDz8HlHNv zdz8hlhnv = this.qVUwofr5s;
            while (true) {
                long j = zdz8hlhnv.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (zDz8HlHNv.dXrmkklc8.compareAndSet(zdz8hlhnv, j, j - 4398046511104L)) {
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                this.kmSgne1rO = 1;
            } else {
                z2 = false;
                if (!z2) {
                    if (z) {
                        if (dIocxURUo(this.qVUwofr5s.CBQ5d1kRq * 2) != 0) {
                            z4 = false;
                        }
                        if (z4 && (kCA6Zs9sL2 = kCA6Zs9sL()) != null) {
                            return kCA6Zs9sL2;
                        }
                        P3AfVviyS kCA6Zs9sL3 = this.CBQ5d1kRq.kCA6Zs9sL();
                        if (kCA6Zs9sL3 != null) {
                            return kCA6Zs9sL3;
                        }
                        if (!z4 && (kCA6Zs9sL = kCA6Zs9sL()) != null) {
                            return kCA6Zs9sL;
                        }
                    } else {
                        P3AfVviyS kCA6Zs9sL4 = kCA6Zs9sL();
                        if (kCA6Zs9sL4 != null) {
                            return kCA6Zs9sL4;
                        }
                    }
                    return yWvV4ePLl(false);
                }
                if (!z || (p3AfVviyS = this.CBQ5d1kRq.kCA6Zs9sL()) == null) {
                    p3AfVviyS = (P3AfVviyS) this.qVUwofr5s.ilHKhw3Yw.dIocxURUo();
                }
                return p3AfVviyS == null ? yWvV4ePLl(true) : p3AfVviyS;
            }
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        loop0: while (true) {
            boolean z = false;
            while (!this.qVUwofr5s.isTerminated() && this.kmSgne1rO != 5) {
                P3AfVviyS q3BipwRCk = q3BipwRCk(this.ilHKhw3Yw);
                if (q3BipwRCk != null) {
                    this.PSTqBLTET = 0;
                    int kCA6Zs9sL = q3BipwRCk.kmSgne1rO.kCA6Zs9sL();
                    this.Bhmn1KIah = 0;
                    if (this.kmSgne1rO == 3) {
                        this.kmSgne1rO = 2;
                    }
                    if (kCA6Zs9sL != 0 && Puu3Rhg4F(2)) {
                        this.qVUwofr5s.yWvV4ePLl();
                    }
                    this.qVUwofr5s.Puu3Rhg4F(q3BipwRCk);
                    if (kCA6Zs9sL != 0) {
                        zDz8HlHNv.dXrmkklc8.addAndGet(this.qVUwofr5s, -2097152);
                        if (this.kmSgne1rO != 5) {
                            this.kmSgne1rO = 4;
                        }
                    }
                } else {
                    this.ilHKhw3Yw = false;
                    if (this.PSTqBLTET == 0) {
                        if (!(this.nextParkedWorker != zDz8HlHNv.ixWaw2akD)) {
                            this.qVUwofr5s.iiGwOFFnr(this);
                        } else {
                            this.workerCtl = -1;
                            while (true) {
                                if ((this.nextParkedWorker != zDz8HlHNv.ixWaw2akD) && this.workerCtl == -1 && !this.qVUwofr5s.isTerminated() && this.kmSgne1rO != 5) {
                                    Puu3Rhg4F(3);
                                    Thread.interrupted();
                                    if (this.Bhmn1KIah == 0) {
                                        this.Bhmn1KIah = System.nanoTime() + this.qVUwofr5s.Bhmn1KIah;
                                    }
                                    LockSupport.parkNanos(this.qVUwofr5s.Bhmn1KIah);
                                    if (System.nanoTime() - this.Bhmn1KIah >= 0) {
                                        this.Bhmn1KIah = 0;
                                        zDz8HlHNv zdz8hlhnv = this.qVUwofr5s;
                                        synchronized (zdz8hlhnv.qVUwofr5s) {
                                            if (!zdz8hlhnv.isTerminated() && ((int) (zdz8hlhnv.controlState & 2097151)) > zdz8hlhnv.CBQ5d1kRq && Eeka1udhb.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                iiGwOFFnr(0);
                                                zdz8hlhnv.GPLPRo6go(this, i, 0);
                                                int andDecrement = (int) (zDz8HlHNv.dXrmkklc8.getAndDecrement(zdz8hlhnv) & 2097151);
                                                if (andDecrement != i) {
                                                    AdXqJxcTm adXqJxcTm = (AdXqJxcTm) zdz8hlhnv.qVUwofr5s.get(andDecrement);
                                                    zdz8hlhnv.qVUwofr5s.set(i, adXqJxcTm);
                                                    adXqJxcTm.iiGwOFFnr(i);
                                                    zdz8hlhnv.GPLPRo6go(adXqJxcTm, andDecrement, i);
                                                }
                                                zdz8hlhnv.qVUwofr5s.set(andDecrement, null);
                                                this.kmSgne1rO = 5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!z) {
                        z = true;
                    } else {
                        Puu3Rhg4F(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.PSTqBLTET);
                        this.PSTqBLTET = 0;
                    }
                }
            }
        }
        Puu3Rhg4F(5);
    }

    public final Object tGV7Q6urW() {
        return this.nextParkedWorker;
    }

    public final P3AfVviyS yWvV4ePLl(boolean z) {
        long j;
        int i = (int) (this.qVUwofr5s.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int dIocxURUo = dIocxURUo(i);
        zDz8HlHNv zdz8hlhnv = this.qVUwofr5s;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            dIocxURUo++;
            if (dIocxURUo > i) {
                dIocxURUo = 1;
            }
            AdXqJxcTm adXqJxcTm = (AdXqJxcTm) zdz8hlhnv.qVUwofr5s.get(dIocxURUo);
            if (!(adXqJxcTm == null || adXqJxcTm == this)) {
                SdmiF4e4J sdmiF4e4J = this.CBQ5d1kRq;
                SdmiF4e4J sdmiF4e4J2 = adXqJxcTm.CBQ5d1kRq;
                if (z) {
                    j = sdmiF4e4J.GPLPRo6go(sdmiF4e4J2);
                } else {
                    Objects.requireNonNull(sdmiF4e4J);
                    P3AfVviyS iiGwOFFnr = sdmiF4e4J2.iiGwOFFnr();
                    if (iiGwOFFnr != null) {
                        sdmiF4e4J.q3BipwRCk(iiGwOFFnr, false);
                        j = -1;
                    } else {
                        j = sdmiF4e4J.Puu3Rhg4F(sdmiF4e4J2, false);
                    }
                }
                if (j == -1) {
                    return this.CBQ5d1kRq.kCA6Zs9sL();
                }
                if (j > 0) {
                    j2 = Math.min(j2, j);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = 0;
        }
        this.PSTqBLTET = j2;
        return null;
    }
}
