package con;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class FYAbHLRSt extends cs4d8hjG8 {
    public static final int Bhmn1KIah;
    public static final FYAbHLRSt kmSgne1rO = new FYAbHLRSt();
    private static volatile Executor pool;

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer nlGCs0NZs = HhnYCaabI.nlGCs0NZs(str);
            if (nlGCs0NZs == null || nlGCs0NZs.intValue() < 1) {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = nlGCs0NZs.intValue();
        }
        Bhmn1KIah = i;
    }

    public final int CBQ5d1kRq() {
        Integer valueOf = Integer.valueOf(Bhmn1KIah);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors < 1) {
            return 1;
        }
        return availableProcessors;
    }

    @Override // con.xaeEKvU2c
    public void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                synchronized (this) {
                    executor = pool;
                    if (executor == null) {
                        executor = vPSbyrYWX();
                        pool = executor;
                    }
                }
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            uJ8K7bc8r.Eeka1udhb.qVUwofr5s(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final ExecutorService oon79WMrY() {
        return Executors.newFixedThreadPool(CBQ5d1kRq(), new ThreadFactory(new AtomicInteger()) { // from class: con.IHmdCiUjP
            public final /* synthetic */ AtomicInteger q3BipwRCk;

            {
                this.q3BipwRCk = r1;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, anXlDk6fV.iMyQMM6Qj("CommonPool-worker-", Integer.valueOf(this.q3BipwRCk.incrementAndGet())));
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    @Override // con.xaeEKvU2c, java.lang.Object
    public String toString() {
        return "CommonPool";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final ExecutorService vPSbyrYWX() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        Object invoke;
        Object invoke2;
        if (System.getSecurityManager() != null) {
            return oon79WMrY();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return oon79WMrY();
        }
        if (Bhmn1KIah < 0) {
            try {
                invoke2 = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            if (invoke2 instanceof ExecutorService) {
                executorService = (ExecutorService) invoke2;
                if (executorService != null) {
                    executorService.submit(rAIYQi5IN.CBQ5d1kRq);
                    try {
                        invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    } catch (Throwable unused3) {
                    }
                    if (invoke instanceof Integer) {
                        num = (Integer) invoke;
                        if (!(num != null && num.intValue() >= 1)) {
                            executorService = null;
                        }
                        if (executorService != null) {
                            return executorService;
                        }
                    }
                    num = null;
                    if (num != null) {
                        if (!(num != null && num.intValue() >= 1)) {
                        }
                        if (executorService != null) {
                        }
                    }
                    if (!(num != null && num.intValue() >= 1)) {
                    }
                    if (executorService != null) {
                    }
                }
            }
            executorService = null;
            if (executorService != null) {
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(kmSgne1rO.CBQ5d1kRq()));
            if (newInstance instanceof ExecutorService) {
                executorService2 = (ExecutorService) newInstance;
            }
        } catch (Throwable unused4) {
        }
        return executorService2 == null ? oon79WMrY() : executorService2;
    }
}
