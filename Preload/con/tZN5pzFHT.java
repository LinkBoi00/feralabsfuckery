package con;

import android.os.Looper;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class tZN5pzFHT extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        Choreographer instance = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            J7YsuEuPq j7YsuEuPq = new J7YsuEuPq(instance, iOdo7IZgc.J4Ux7ym32(myLooper), null);
            return j7YsuEuPq.plus(j7YsuEuPq.ixWaw2akD);
        }
        throw new IllegalStateException("no Looper on this thread".toString());
    }
}
