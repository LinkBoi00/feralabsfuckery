package con;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class uJ8K7bc8r extends Di8n6M7Jh implements Runnable {
    public static final uJ8K7bc8r Eeka1udhb;
    private static volatile Thread _thread;
    public static final long dXrmkklc8;
    private static volatile int debugStatus;

    static {
        Long l;
        uJ8K7bc8r uj8k7bc8r = new uJ8K7bc8r();
        Eeka1udhb = uj8k7bc8r;
        uj8k7bc8r.Bhmn1KIah(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        dXrmkklc8 = timeUnit.toNanos(l.longValue());
    }

    public final boolean WaUP0CF08() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // con.ev1IlyvL8
    public Thread kmSgne1rO() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
        IO5CrIj0i.J4Ux7ym32.set(this);
        try {
            synchronized (this) {
                if (WaUP0CF08()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (z) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long MzoOEjc4X = MzoOEjc4X();
                    if (MzoOEjc4X == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = dXrmkklc8 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            sk5s77z6Q();
                            if (!dXrmkklc8()) {
                                kmSgne1rO();
                                return;
                            }
                            return;
                        }
                        MzoOEjc4X = cT9gik1zL.J4Ux7ym32(MzoOEjc4X, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (MzoOEjc4X > 0) {
                        if (WaUP0CF08()) {
                            _thread = null;
                            sk5s77z6Q();
                            if (!dXrmkklc8()) {
                                kmSgne1rO();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, MzoOEjc4X);
                    }
                }
            }
        } finally {
            _thread = null;
            sk5s77z6Q();
            if (!dXrmkklc8()) {
                kmSgne1rO();
            }
        }
    }

    public final synchronized void sk5s77z6Q() {
        if (WaUP0CF08()) {
            debugStatus = 3;
            RG6kpfv3v();
            notifyAll();
        }
    }

    @Override // con.Di8n6M7Jh, con.XUDDOHuAx
    public clUYjTSq7 tGV7Q6urW(long j, Runnable runnable, bu5cjmae6 bu5cjmae6) {
        long q3BipwRCk = plqClx8zg.q3BipwRCk(j);
        if (q3BipwRCk >= 4611686018427387903L) {
            return JNEteW1Z7.CBQ5d1kRq;
        }
        long nanoTime = System.nanoTime();
        snbZ14V7z snbz14v7z = new snbZ14V7z(q3BipwRCk + nanoTime, runnable);
        ixWaw2akD(nanoTime, snbz14v7z);
        return snbz14v7z;
    }
}
