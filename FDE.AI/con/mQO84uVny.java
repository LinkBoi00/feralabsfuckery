package con;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class mQO84uVny implements Executor {
    public static final /* synthetic */ mQO84uVny CBQ5d1kRq = new mQO84uVny();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = RJRwDKpCU.q3BipwRCk;
        if (D3DEikrvb.qVUwofr5s()) {
            runnable.run();
        } else {
            RJRwDKpCU.q3BipwRCk.post(runnable);
        }
    }
}
