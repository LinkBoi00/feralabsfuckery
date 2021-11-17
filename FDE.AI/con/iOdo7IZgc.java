package con;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public abstract class iOdo7IZgc {
    public static long GPLPRo6go(AU29aHa4X aU29aHa4X, long j) {
        Q4TFMtvSV q4TFMtvSV = y8Q3RJgNN.q3BipwRCk;
        if (j != y8Q3RJgNN.tGV7Q6urW) {
            return gThLCaTO1.J4Ux7ym32(aU29aHa4X.MzoOEjc4X(y8Q3RJgNN.J4Ux7ym32(j)), aU29aHa4X.MzoOEjc4X(y8Q3RJgNN.q3BipwRCk(j)));
        }
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
        return tbzY8QG6X.dIocxURUo;
    }

    public static Handler J4Ux7ym32(Looper looper) {
        Throwable e;
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    public static float dIocxURUo(AU29aHa4X aU29aHa4X, int i) {
        return ((float) i) / aU29aHa4X.getDensity();
    }

    public static float iiGwOFFnr(AU29aHa4X aU29aHa4X, float f) {
        return aU29aHa4X.getDensity() * f;
    }

    public static float kCA6Zs9sL(AU29aHa4X aU29aHa4X, long j) {
        if (fzM0nB5KM.q3BipwRCk(QnjhYJNrZ.J4Ux7ym32(j), 4294967296L)) {
            float tGV7Q6urW = QnjhYJNrZ.tGV7Q6urW(j);
            return aU29aHa4X.getDensity() * aU29aHa4X.yWvV4ePLl() * tGV7Q6urW;
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static final long q3BipwRCk(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        JhpbRXxsg jhpbRXxsg = yqaDqocAW.J4Ux7ym32;
        return floatToIntBits2;
    }

    public static int tGV7Q6urW(AU29aHa4X aU29aHa4X, float f) {
        float MzoOEjc4X = aU29aHa4X.MzoOEjc4X(f);
        if (Float.isInfinite(MzoOEjc4X)) {
            return Integer.MAX_VALUE;
        }
        return D3DEikrvb.Eeka1udhb(MzoOEjc4X);
    }
}
