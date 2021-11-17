package con;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class J7r1pEVJR extends NuoRAgLnm {
    public final Object q3BipwRCk = new Object();
    public final ExecutorService J4Ux7ym32 = Executors.newFixedThreadPool(4, new xlOBOy68E(this));

    @Override // con.NuoRAgLnm
    public boolean q3BipwRCk() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
