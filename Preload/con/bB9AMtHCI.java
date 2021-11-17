package con;

import android.os.Process;
/* loaded from: classes.dex */
public class bB9AMtHCI extends Thread {
    public final int CBQ5d1kRq;

    public bB9AMtHCI(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.CBQ5d1kRq = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.CBQ5d1kRq);
        super.run();
    }
}
