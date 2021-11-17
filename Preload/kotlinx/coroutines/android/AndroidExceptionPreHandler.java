package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import con.V1xq9aVRv;
import con.bu5cjmae6;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
@Keep
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends V1xq9aVRv implements CoroutineExceptionHandler {
    private volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.RG2GI7LDp.CBQ5d1kRq);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(bu5cjmae6 bu5cjmae6, Throwable th) {
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = preHandler();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
        Object invoke = preHandler == null ? null : preHandler.invoke(null, new Object[0]);
        if (invoke instanceof Thread.UncaughtExceptionHandler) {
            uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }
}
