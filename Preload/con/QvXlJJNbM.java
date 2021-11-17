package con;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public abstract class QvXlJJNbM {
    public static final Handler GPLPRo6go = new Handler(Looper.getMainLooper());
    public static final Field J4Ux7ym32;
    public static final Method dIocxURUo;
    public static final Method iiGwOFFnr;
    public static final Method kCA6Zs9sL;
    public static final Class q3BipwRCk;
    public static final Field tGV7Q6urW;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        q3BipwRCk = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        J4Ux7ym32 = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        tGV7Q6urW = field2;
        Class cls4 = q3BipwRCk;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            dIocxURUo = declaredMethod;
            cls2 = q3BipwRCk;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                kCA6Zs9sL = declaredMethod2;
                cls3 = q3BipwRCk;
                if (q3BipwRCk() && cls3 != null) {
                    try {
                        Class<?> cls5 = Boolean.TYPE;
                        Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                        declaredMethod3.setAccessible(true);
                        method = declaredMethod3;
                    } catch (Throwable unused6) {
                    }
                }
                iiGwOFFnr = method;
            }
            declaredMethod2 = null;
            kCA6Zs9sL = declaredMethod2;
            cls3 = q3BipwRCk;
            if (q3BipwRCk()) {
                Class<?> cls52 = Boolean.TYPE;
                Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
                declaredMethod32.setAccessible(true);
                method = declaredMethod32;
            }
            iiGwOFFnr = method;
        }
        declaredMethod = null;
        dIocxURUo = declaredMethod;
        cls2 = q3BipwRCk;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        kCA6Zs9sL = declaredMethod2;
        cls3 = q3BipwRCk;
        if (q3BipwRCk()) {
        }
        iiGwOFFnr = method;
    }

    public static boolean J4Ux7ym32(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (q3BipwRCk() && iiGwOFFnr == null) {
            return false;
        } else {
            if (kCA6Zs9sL == null && dIocxURUo == null) {
                return false;
            }
            try {
                Object obj2 = tGV7Q6urW.get(activity);
                if (obj2 == null || (obj = J4Ux7ym32.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                KLR4KBNKI klr4kbnki = new KLR4KBNKI(activity);
                application.registerActivityLifecycleCallbacks(klr4kbnki);
                Handler handler = GPLPRo6go;
                handler.post(new DJbXkgfuR(klr4kbnki, obj2));
                if (q3BipwRCk()) {
                    Method method = iiGwOFFnr;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new DJbXkgfuR(application, klr4kbnki));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public static boolean q3BipwRCk() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
