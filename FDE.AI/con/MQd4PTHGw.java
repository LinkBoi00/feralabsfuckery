package con;

import java.lang.Thread;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes.dex */
public abstract class MQd4PTHGw {
    public static final List q3BipwRCk;

    static {
        PmYqqGuHi axhkwsbum = new axHKWsBUm(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        if (!(axhkwsbum instanceof WSTHXeAv1)) {
            axhkwsbum = new WSTHXeAv1(axhkwsbum);
        }
        q3BipwRCk = IFeOgs2Gp.ilHKhw3Yw(axhkwsbum);
    }

    public static final void q3BipwRCk(bu5cjmae6 bu5cjmae6, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler coroutineExceptionHandler : q3BipwRCk) {
            try {
                coroutineExceptionHandler.handleException(bu5cjmae6, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    dnBSj5uJN.dIocxURUo(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
