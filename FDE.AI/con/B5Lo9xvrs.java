package con;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class B5Lo9xvrs {
    private static volatile Choreographer choreographer;
    public static final /* synthetic */ int q3BipwRCk = 0;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new VWNUggT0w(q3BipwRCk(Looper.getMainLooper(), true), null, false);
        } catch (Throwable th) {
            obj = new qlt0VySXJ(th);
        }
        if (!(obj instanceof qlt0VySXJ)) {
            obj2 = obj;
        }
        s4jYW5jpn s4jyw5jpn = (s4jYW5jpn) obj2;
    }

    public static final Handler q3BipwRCk(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
