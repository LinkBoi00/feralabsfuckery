package con;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class QWJmHBGHJ {
    public static Method J4Ux7ym32;
    public static long q3BipwRCk;

    @SuppressLint({"NewApi"})
    public static boolean q3BipwRCk() {
        try {
            if (J4Ux7ym32 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (J4Ux7ym32 == null) {
                q3BipwRCk = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                J4Ux7ym32 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) J4Ux7ym32.invoke(null, Long.valueOf(q3BipwRCk))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }
}
