package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class Di8n6M7Jh extends ev1IlyvL8 implements XUDDOHuAx {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ilHKhw3Yw = AtomicReferenceFieldUpdater.newUpdater(Di8n6M7Jh.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater qVUwofr5s = AtomicReferenceFieldUpdater.newUpdater(Di8n6M7Jh.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public final boolean Eeka1udhb(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (ilHKhw3Yw.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof SV2Dk988f) {
                SV2Dk988f sV2Dk988f = (SV2Dk988f) obj;
                int q3BipwRCk = sV2Dk988f.q3BipwRCk(runnable);
                if (q3BipwRCk == 0) {
                    return true;
                }
                if (q3BipwRCk == 1) {
                    ilHKhw3Yw.compareAndSet(this, obj, sV2Dk988f.kCA6Zs9sL());
                } else if (q3BipwRCk == 2) {
                    return false;
                }
            } else if (obj == plqClx8zg.J4Ux7ym32) {
                return false;
            } else {
                SV2Dk988f sV2Dk988f2 = new SV2Dk988f(8, true);
                sV2Dk988f2.q3BipwRCk((Runnable) obj);
                sV2Dk988f2.q3BipwRCk(runnable);
                if (ilHKhw3Yw.compareAndSet(this, obj, sV2Dk988f2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004c A[EDGE_INSN: B:85:0x004c->B:31:0x004c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // con.ev1IlyvL8
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long MzoOEjc4X() {
        Object obj;
        Runnable runnable;
        long j;
        yxtPW6v5D yxtpw6v5d;
        if (ilHKhw3Yw()) {
            return 0;
        }
        B4xCdATgk b4xCdATgk = (B4xCdATgk) this._delayed;
        boolean z = true;
        yxtPW6v5D yxtpw6v5d2 = null;
        if (b4xCdATgk == null || b4xCdATgk.tGV7Q6urW()) {
            while (true) {
                obj = this._queue;
                if (obj == null) {
                    break;
                } else if (obj instanceof SV2Dk988f) {
                    SV2Dk988f sV2Dk988f = (SV2Dk988f) obj;
                    Object iiGwOFFnr = sV2Dk988f.iiGwOFFnr();
                    if (iiGwOFFnr != SV2Dk988f.GPLPRo6go) {
                        runnable = (Runnable) iiGwOFFnr;
                        break;
                    }
                    ilHKhw3Yw.compareAndSet(this, obj, sV2Dk988f.kCA6Zs9sL());
                } else if (obj == plqClx8zg.J4Ux7ym32) {
                    break;
                } else if (ilHKhw3Yw.compareAndSet(this, obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
            if (runnable == null) {
                runnable.run();
                return 0;
            }
            ETdSLSXRx eTdSLSXRx = this.PSTqBLTET;
            if (eTdSLSXRx != null) {
                if (eTdSLSXRx.J4Ux7ym32 != eTdSLSXRx.tGV7Q6urW) {
                    z = false;
                }
                if (!z) {
                    j = 0;
                    if (j != 0) {
                        return 0;
                    }
                    Object obj2 = this._queue;
                    if (obj2 != null) {
                        if (!(obj2 instanceof SV2Dk988f)) {
                            if (obj2 != plqClx8zg.J4Ux7ym32) {
                                return 0;
                            }
                            return Long.MAX_VALUE;
                        } else if (!((SV2Dk988f) obj2).dIocxURUo()) {
                            return 0;
                        }
                    }
                    B4xCdATgk b4xCdATgk2 = (B4xCdATgk) this._delayed;
                    if (b4xCdATgk2 != null) {
                        synchronized (b4xCdATgk2) {
                            yxtpw6v5d2 = b4xCdATgk2.J4Ux7ym32();
                        }
                    }
                    if (yxtpw6v5d2 != null) {
                        long nanoTime = yxtpw6v5d2.CBQ5d1kRq - System.nanoTime();
                        if (nanoTime < 0) {
                            return 0;
                        }
                        return nanoTime;
                    }
                    return Long.MAX_VALUE;
                }
            }
            j = Long.MAX_VALUE;
            if (j != 0) {
            }
        } else {
            long nanoTime2 = System.nanoTime();
            do {
                synchronized (b4xCdATgk) {
                    yxtPW6v5D J4Ux7ym32 = b4xCdATgk.J4Ux7ym32();
                    if (J4Ux7ym32 == null) {
                        yxtpw6v5d = null;
                        continue;
                    } else {
                        yxtpw6v5d = ((nanoTime2 - J4Ux7ym32.CBQ5d1kRq) > 0 ? 1 : ((nanoTime2 - J4Ux7ym32.CBQ5d1kRq) == 0 ? 0 : -1)) >= 0 ? Eeka1udhb(J4Ux7ym32) : false ? b4xCdATgk.dIocxURUo(0) : null;
                        continue;
                    }
                }
            } while (yxtpw6v5d != null);
            while (true) {
                obj = this._queue;
                if (obj == null) {
                }
            }
            if (runnable == null) {
            }
        }
    }

    @Override // con.xaeEKvU2c
    public final void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        qVUwofr5s(runnable);
    }

    public final void RG6kpfv3v() {
        this._queue = null;
        this._delayed = null;
    }

    @Override // con.XUDDOHuAx
    public void dIocxURUo(long j, Z3EvbqMGQ z3EvbqMGQ) {
        long q3BipwRCk = plqClx8zg.q3BipwRCk(j);
        if (q3BipwRCk < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            PmQI62V7v pmQI62V7v = new PmQI62V7v(this, q3BipwRCk + nanoTime, z3EvbqMGQ);
            idpM54xlp.kCA6Zs9sL(z3EvbqMGQ, pmQI62V7v);
            ixWaw2akD(nanoTime, pmQI62V7v);
        }
    }

    public boolean dXrmkklc8() {
        ETdSLSXRx eTdSLSXRx = this.PSTqBLTET;
        if (!(eTdSLSXRx == null || eTdSLSXRx.J4Ux7ym32 == eTdSLSXRx.tGV7Q6urW)) {
            return false;
        }
        B4xCdATgk b4xCdATgk = (B4xCdATgk) this._delayed;
        if (b4xCdATgk != null && !b4xCdATgk.tGV7Q6urW()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof SV2Dk988f) {
            return ((SV2Dk988f) obj).dIocxURUo();
        }
        return obj == plqClx8zg.J4Ux7ym32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if ((r8 - r0.J4Ux7ym32) > 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void ixWaw2akD(long j, yxtPW6v5D yxtpw6v5d) {
        boolean z;
        Thread kmSgne1rO;
        long j2;
        boolean z2 = false;
        yxtPW6v5D yxtpw6v5d2 = null;
        if (this._isCompleted != 0) {
            z = true;
        } else {
            B4xCdATgk b4xCdATgk = (B4xCdATgk) this._delayed;
            if (b4xCdATgk == null) {
                qVUwofr5s.compareAndSet(this, null, new B4xCdATgk(j));
                b4xCdATgk = (B4xCdATgk) this._delayed;
            }
            synchronized (yxtpw6v5d) {
                if (yxtpw6v5d.kmSgne1rO == plqClx8zg.q3BipwRCk) {
                    z = true;
                } else {
                    synchronized (b4xCdATgk) {
                        yxtPW6v5D J4Ux7ym32 = b4xCdATgk.J4Ux7ym32();
                        if (this._isCompleted != 0) {
                            z = true;
                        } else {
                            if (J4Ux7ym32 == null) {
                                j2 = j;
                            } else {
                                j2 = J4Ux7ym32.CBQ5d1kRq;
                                if (j2 - j >= 0) {
                                    j2 = j;
                                }
                            }
                            b4xCdATgk.J4Ux7ym32 = j2;
                            long j3 = yxtpw6v5d.CBQ5d1kRq;
                            long j4 = b4xCdATgk.J4Ux7ym32;
                            if (j3 - j4 < 0) {
                                yxtpw6v5d.CBQ5d1kRq = j4;
                            }
                            b4xCdATgk.q3BipwRCk(yxtpw6v5d);
                            z = false;
                        }
                    }
                }
            }
        }
        if (!z) {
            B4xCdATgk b4xCdATgk2 = (B4xCdATgk) this._delayed;
            if (b4xCdATgk2 != null) {
                synchronized (b4xCdATgk2) {
                    yxtpw6v5d2 = b4xCdATgk2.J4Ux7ym32();
                }
            }
            if (yxtpw6v5d2 == yxtpw6v5d) {
                z2 = true;
            }
            if (z2 && Thread.currentThread() != (kmSgne1rO = kmSgne1rO())) {
                LockSupport.unpark(kmSgne1rO);
            }
        } else if (z) {
            uJ8K7bc8r.Eeka1udhb.ixWaw2akD(j, yxtpw6v5d);
        } else if (!z) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final void qVUwofr5s(Runnable runnable) {
        if (Eeka1udhb(runnable)) {
            Thread kmSgne1rO = kmSgne1rO();
            if (Thread.currentThread() != kmSgne1rO) {
                LockSupport.unpark(kmSgne1rO);
                return;
            }
            return;
        }
        uJ8K7bc8r.Eeka1udhb.qVUwofr5s(runnable);
    }

    @Override // con.ev1IlyvL8
    public void shutdown() {
        IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
        IO5CrIj0i.J4Ux7ym32.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (ilHKhw3Yw.compareAndSet(this, null, plqClx8zg.J4Ux7ym32)) {
                    break;
                }
            } else if (obj instanceof SV2Dk988f) {
                ((SV2Dk988f) obj).J4Ux7ym32();
                break;
            } else if (obj == plqClx8zg.J4Ux7ym32) {
                break;
            } else {
                SV2Dk988f sV2Dk988f = new SV2Dk988f(8, true);
                sV2Dk988f.q3BipwRCk((Runnable) obj);
                if (ilHKhw3Yw.compareAndSet(this, obj, sV2Dk988f)) {
                    break;
                }
            }
        }
        do {
        } while (MzoOEjc4X() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            B4xCdATgk b4xCdATgk = (B4xCdATgk) this._delayed;
            yxtPW6v5D kCA6Zs9sL = b4xCdATgk == null ? null : b4xCdATgk.kCA6Zs9sL();
            if (kCA6Zs9sL != null) {
                uJ8K7bc8r.Eeka1udhb.ixWaw2akD(nanoTime, kCA6Zs9sL);
            } else {
                return;
            }
        }
    }

    @Override // con.XUDDOHuAx
    public clUYjTSq7 tGV7Q6urW(long j, Runnable runnable, bu5cjmae6 bu5cjmae6) {
        return ((uJ8K7bc8r) JfPi3Rw8a.q3BipwRCk).tGV7Q6urW(j, runnable, bu5cjmae6);
    }
}
