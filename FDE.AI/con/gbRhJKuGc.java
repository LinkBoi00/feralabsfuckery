package con;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class gbRhJKuGc extends AbstractExecutorService implements Callable {
    public boolean CBQ5d1kRq = false;
    public ArrayDeque kmSgne1rO = new ArrayDeque();
    public FutureTask Bhmn1KIah = null;

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean awaitTermination(long j, TimeUnit timeUnit) {
        FutureTask futureTask = this.Bhmn1KIah;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        Runnable runnable;
        while (true) {
            synchronized (this) {
                runnable = (Runnable) this.kmSgne1rO.poll();
                if (runnable == null) {
                    this.Bhmn1KIah = null;
                    return null;
                }
            }
            runnable.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (!this.CBQ5d1kRq) {
            this.kmSgne1rO.offer(runnable);
            if (this.Bhmn1KIah == null) {
                FutureTask futureTask = new FutureTask(this);
                this.Bhmn1KIah = futureTask;
                xheEapSkC.Eeka1udhb.execute(futureTask);
            }
        } else {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isShutdown() {
        return this.CBQ5d1kRq;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isTerminated() {
        boolean z;
        if (this.CBQ5d1kRq) {
            if (this.Bhmn1KIah == null) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized void shutdown() {
        this.CBQ5d1kRq = true;
        this.kmSgne1rO.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized List shutdownNow() {
        ArrayList arrayList;
        this.CBQ5d1kRq = true;
        FutureTask futureTask = this.Bhmn1KIah;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        arrayList = new ArrayList(this.kmSgne1rO);
        this.kmSgne1rO.clear();
        return arrayList;
    }
}
