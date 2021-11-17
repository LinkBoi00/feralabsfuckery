package con;

import android.content.Context;
import androidx.profileinstaller.RG2GI7LDp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class hV0ISka2g implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Context kmSgne1rO;

    public /* synthetic */ hV0ISka2g(Context context, int i) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new hV0ISka2g(this.kmSgne1rO, 1));
                return;
            default:
                RG2GI7LDp.q3BipwRCk(this.kmSgne1rO, nFqoYrH98.CBQ5d1kRq, RG2GI7LDp.q3BipwRCk, false);
                return;
        }
    }
}
