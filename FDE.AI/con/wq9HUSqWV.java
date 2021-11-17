package con;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class wq9HUSqWV {
    public static final int J4Ux7ym32;
    public static final long dIocxURUo;
    public static lWVjAUqb7 kCA6Zs9sL;
    public static final long q3BipwRCk = bqV8ECpZf.kCA6Zs9sL("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int tGV7Q6urW;

    static {
        bqV8ECpZf.dIocxURUo("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int i = iG7KBFGGv.q3BipwRCk;
        int dIocxURUo2 = bqV8ECpZf.dIocxURUo("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, null);
        J4Ux7ym32 = dIocxURUo2;
        tGV7Q6urW = bqV8ECpZf.dIocxURUo("kotlinx.coroutines.scheduler.max.pool.size", cT9gik1zL.kCA6Zs9sL(i * 128, dIocxURUo2, 2097150), 0, 2097150, 4, null);
        dIocxURUo = TimeUnit.SECONDS.toNanos(bqV8ECpZf.kCA6Zs9sL("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
        kCA6Zs9sL = NjBZSsY6P.q3BipwRCk;
    }
}
