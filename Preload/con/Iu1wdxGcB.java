package con;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class Iu1wdxGcB extends cs4d8hjG8 implements MgUdeu75i, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater qVUwofr5s = AtomicIntegerFieldUpdater.newUpdater(Iu1wdxGcB.class, "inFlightTasks");
    public final int Bhmn1KIah;
    public final int MzoOEjc4X;
    public final String PSTqBLTET;
    public final ConcurrentLinkedQueue ilHKhw3Yw = new ConcurrentLinkedQueue();
    private volatile /* synthetic */ int inFlightTasks = 0;
    public final yu2QUAlaV kmSgne1rO;

    public Iu1wdxGcB(yu2QUAlaV yu2qualav, int i, String str, int i2) {
        this.kmSgne1rO = yu2qualav;
        this.Bhmn1KIah = i;
        this.PSTqBLTET = str;
        this.MzoOEjc4X = i2;
    }

    @Override // con.MgUdeu75i
    public void GPLPRo6go() {
        Runnable runnable = (Runnable) this.ilHKhw3Yw.poll();
        if (runnable != null) {
            yu2QUAlaV yu2qualav = this.kmSgne1rO;
            Objects.requireNonNull(yu2qualav);
            try {
                yu2qualav.ilHKhw3Yw.dIocxURUo(runnable, this, true);
            } catch (RejectedExecutionException unused) {
                uJ8K7bc8r.Eeka1udhb.qVUwofr5s(yu2qualav.ilHKhw3Yw.J4Ux7ym32(runnable, this));
            }
        } else {
            qVUwofr5s.decrementAndGet(this);
            Runnable runnable2 = (Runnable) this.ilHKhw3Yw.poll();
            if (runnable2 != null) {
                oon79WMrY(runnable2, true);
            }
        }
    }

    @Override // con.xaeEKvU2c
    public void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        oon79WMrY(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        oon79WMrY(runnable, false);
    }

    @Override // con.MgUdeu75i
    public int kCA6Zs9sL() {
        return this.MzoOEjc4X;
    }

    public final void oon79WMrY(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qVUwofr5s;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.Bhmn1KIah) {
                yu2QUAlaV yu2qualav = this.kmSgne1rO;
                Objects.requireNonNull(yu2qualav);
                try {
                    yu2qualav.ilHKhw3Yw.dIocxURUo(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    uJ8K7bc8r.Eeka1udhb.qVUwofr5s(yu2qualav.ilHKhw3Yw.J4Ux7ym32(runnable, this));
                    return;
                }
            } else {
                this.ilHKhw3Yw.add(runnable);
                if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.Bhmn1KIah) {
                    runnable = (Runnable) this.ilHKhw3Yw.poll();
                } else {
                    return;
                }
            }
        } while (runnable != null);
    }

    @Override // con.xaeEKvU2c, java.lang.Object
    public String toString() {
        String str = this.PSTqBLTET;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.kmSgne1rO + ']';
    }
}
