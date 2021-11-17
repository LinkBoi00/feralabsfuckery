package con;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class xlOBOy68E implements ThreadFactory {
    public final AtomicInteger q3BipwRCk = new AtomicInteger(0);

    public xlOBOy68E(J7r1pEVJR j7r1pEVJR) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.q3BipwRCk.getAndIncrement())));
        return thread;
    }
}
