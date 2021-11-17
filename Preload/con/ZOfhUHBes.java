package con;

import android.view.Choreographer;
import java.util.List;
/* loaded from: classes.dex */
public final class ZOfhUHBes implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ J7YsuEuPq CBQ5d1kRq;

    public ZOfhUHBes(J7YsuEuPq j7YsuEuPq) {
        this.CBQ5d1kRq = j7YsuEuPq;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.CBQ5d1kRq.Bhmn1KIah.removeCallbacks(this);
        J7YsuEuPq.oon79WMrY(this.CBQ5d1kRq);
        J7YsuEuPq j7YsuEuPq = this.CBQ5d1kRq;
        synchronized (j7YsuEuPq.PSTqBLTET) {
            if (j7YsuEuPq.dXrmkklc8) {
                int i = 0;
                j7YsuEuPq.dXrmkklc8 = false;
                List list = j7YsuEuPq.ilHKhw3Yw;
                j7YsuEuPq.ilHKhw3Yw = j7YsuEuPq.qVUwofr5s;
                j7YsuEuPq.qVUwofr5s = list;
                int size = list.size();
                if (size > 0) {
                    while (true) {
                        int i2 = i + 1;
                        ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    }
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        J7YsuEuPq.oon79WMrY(this.CBQ5d1kRq);
        J7YsuEuPq j7YsuEuPq = this.CBQ5d1kRq;
        synchronized (j7YsuEuPq.PSTqBLTET) {
            if (j7YsuEuPq.ilHKhw3Yw.isEmpty()) {
                j7YsuEuPq.kmSgne1rO.removeFrameCallback(this);
                j7YsuEuPq.dXrmkklc8 = false;
            }
        }
    }
}
