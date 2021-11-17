package con;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public class Vy34gh4kh implements Handler.Callback {
    public final /* synthetic */ LKa8y802S q3BipwRCk;

    public Vy34gh4kh(LKa8y802S lKa8y802S) {
        this.q3BipwRCk = lKa8y802S;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        LKa8y802S lKa8y802S = this.q3BipwRCk;
        K6PL0z3I0.q3BipwRCk(message.obj);
        synchronized (lKa8y802S.q3BipwRCk) {
            K6PL0z3I0.q3BipwRCk(lKa8y802S.tGV7Q6urW);
            lKa8y802S.yWvV4ePLl(null, 2);
            throw null;
        }
    }
}
