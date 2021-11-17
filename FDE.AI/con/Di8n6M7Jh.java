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
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Di8n6M7Jh.MzoOEjc4X():long");
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
    public final void ixWaw2akD(long r13, con.yxtPW6v5D r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000a
            r0 = r4
            goto L_0x005d
        L_0x000a:
            java.lang.Object r0 = r12._delayed
            con.B4xCdATgk r0 = (con.B4xCdATgk) r0
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = con.Di8n6M7Jh.qVUwofr5s
            con.B4xCdATgk r5 = new con.B4xCdATgk
            r5.<init>(r13)
            r0.compareAndSet(r12, r3, r5)
            java.lang.Object r0 = r12._delayed
            con.B4xCdATgk r0 = (con.B4xCdATgk) r0
        L_0x001e:
            monitor-enter(r15)
            java.lang.Object r5 = r15.kmSgne1rO     // Catch: all -> 0x009c
            con.vX9ZKIhAp r6 = con.plqClx8zg.q3BipwRCk     // Catch: all -> 0x009c
            if (r5 != r6) goto L_0x0027
            r0 = r2
            goto L_0x005c
        L_0x0027:
            monitor-enter(r0)     // Catch: all -> 0x009c
            con.yxtPW6v5D r5 = r0.J4Ux7ym32()     // Catch: all -> 0x0099
            int r6 = r12._isCompleted     // Catch: all -> 0x0099
            if (r6 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch: all -> 0x009c
            r0 = r4
            goto L_0x005c
        L_0x0033:
            r6 = 0
            if (r5 != 0) goto L_0x0039
            r8 = r13
            goto L_0x004a
        L_0x0039:
            long r8 = r5.CBQ5d1kRq     // Catch: all -> 0x0099
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0042
            r8 = r13
        L_0x0042:
            long r10 = r0.J4Ux7ym32     // Catch: all -> 0x0099
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
        L_0x004a:
            r0.J4Ux7ym32 = r8     // Catch: all -> 0x0099
        L_0x004c:
            long r8 = r15.CBQ5d1kRq     // Catch: all -> 0x0099
            long r10 = r0.J4Ux7ym32     // Catch: all -> 0x0099
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0057
            r15.CBQ5d1kRq = r10     // Catch: all -> 0x0099
        L_0x0057:
            r0.q3BipwRCk(r15)     // Catch: all -> 0x0099
            monitor-exit(r0)     // Catch: all -> 0x009c
            r0 = r1
        L_0x005c:
            monitor-exit(r15)
        L_0x005d:
            if (r0 == 0) goto L_0x0076
            if (r0 == r4) goto L_0x0070
            if (r0 != r2) goto L_0x0064
            goto L_0x0095
        L_0x0064:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0070:
            con.uJ8K7bc8r r0 = con.uJ8K7bc8r.Eeka1udhb
            r0.ixWaw2akD(r13, r15)
            goto L_0x0095
        L_0x0076:
            java.lang.Object r13 = r12._delayed
            con.B4xCdATgk r13 = (con.B4xCdATgk) r13
            if (r13 != 0) goto L_0x007d
            goto L_0x0083
        L_0x007d:
            monitor-enter(r13)
            con.yxtPW6v5D r3 = r13.J4Ux7ym32()     // Catch: all -> 0x0096
            monitor-exit(r13)
        L_0x0083:
            if (r3 != r15) goto L_0x0086
            r1 = r4
        L_0x0086:
            if (r1 == 0) goto L_0x0095
            java.lang.Thread r13 = r12.kmSgne1rO()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x0095
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x0099:
            r13 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x009c
            throw r13     // Catch: all -> 0x009c
        L_0x009c:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Di8n6M7Jh.ixWaw2akD(long, con.yxtPW6v5D):void");
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
