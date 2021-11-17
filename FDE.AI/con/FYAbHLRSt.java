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
    public final java.util.concurrent.ExecutorService vPSbyrYWX() {
        /*
            r7 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r7.oon79WMrY()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: all -> 0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = r7.oon79WMrY()
            return r0
        L_0x001b:
            int r2 = con.FYAbHLRSt.Bhmn1KIah
            r3 = 1
            r4 = 0
            if (r2 >= 0) goto L_0x0069
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: all -> 0x0036
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: all -> 0x0036
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: all -> 0x0036
            java.lang.Object r2 = r2.invoke(r0, r5)     // Catch: all -> 0x0036
            boolean r5 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: all -> 0x0036
            if (r5 == 0) goto L_0x0036
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: all -> 0x0036
            goto L_0x0037
        L_0x0036:
            r2 = r0
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            goto L_0x0069
        L_0x003a:
            con.rAIYQi5IN r5 = con.rAIYQi5IN.CBQ5d1kRq
            r2.submit(r5)
            java.lang.String r5 = "getPoolSize"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: all -> 0x0054
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: all -> 0x0054
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: all -> 0x0054
            java.lang.Object r5 = r5.invoke(r2, r6)     // Catch: all -> 0x0054
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: all -> 0x0054
            if (r6 == 0) goto L_0x0054
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: all -> 0x0054
            goto L_0x0055
        L_0x0054:
            r5 = r0
        L_0x0055:
            if (r5 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            int r5 = r5.intValue()
            if (r5 < r3) goto L_0x0060
            r5 = r3
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            if (r5 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = r0
        L_0x0065:
            if (r2 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            return r2
        L_0x0069:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: all -> 0x008c
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: all -> 0x008c
            r2[r4] = r5     // Catch: all -> 0x008c
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: all -> 0x008c
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: all -> 0x008c
            con.FYAbHLRSt r3 = con.FYAbHLRSt.kmSgne1rO     // Catch: all -> 0x008c
            int r3 = r3.CBQ5d1kRq()     // Catch: all -> 0x008c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x008c
            r2[r4] = r3     // Catch: all -> 0x008c
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: all -> 0x008c
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: all -> 0x008c
            if (r2 == 0) goto L_0x008c
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: all -> 0x008c
            r0 = r1
        L_0x008c:
            if (r0 != 0) goto L_0x0092
            java.util.concurrent.ExecutorService r0 = r7.oon79WMrY()
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.FYAbHLRSt.vPSbyrYWX():java.util.concurrent.ExecutorService");
    }
}
