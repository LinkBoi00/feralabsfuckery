package con;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            con.QvXlJJNbM.GPLPRo6go = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: all -> 0x0015
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            con.QvXlJJNbM.q3BipwRCk = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: all -> 0x0023
            r3.setAccessible(r2)     // Catch: all -> 0x0023
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            con.QvXlJJNbM.J4Ux7ym32 = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: all -> 0x0030
            r0.setAccessible(r2)     // Catch: all -> 0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            con.QvXlJJNbM.tGV7Q6urW = r0
            java.lang.Class r0 = con.QvXlJJNbM.q3BipwRCk
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0053
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: all -> 0x003c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: all -> 0x003c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: all -> 0x003c
            r7[r2] = r8     // Catch: all -> 0x003c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: all -> 0x003c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: all -> 0x003c
            r0.setAccessible(r2)     // Catch: all -> 0x003c
        L_0x0053:
            con.QvXlJJNbM.dIocxURUo = r0
            java.lang.Class r0 = con.QvXlJJNbM.q3BipwRCk
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: all -> 0x0059
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: all -> 0x0059
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: all -> 0x0059
            r7[r2] = r8     // Catch: all -> 0x0059
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: all -> 0x0059
            r0.setAccessible(r2)     // Catch: all -> 0x0059
        L_0x006c:
            con.QvXlJJNbM.kCA6Zs9sL = r0
            java.lang.Class r0 = con.QvXlJJNbM.q3BipwRCk
            boolean r4 = q3BipwRCk()
            if (r4 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: all -> 0x00ad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: all -> 0x00ad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: all -> 0x00ad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: all -> 0x00ad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: all -> 0x00ad
            r7[r3] = r5     // Catch: all -> 0x00ad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: all -> 0x00ad
            r7[r3] = r5     // Catch: all -> 0x00ad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: all -> 0x00ad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: all -> 0x00ad
            r3 = 7
            r7[r3] = r5     // Catch: all -> 0x00ad
            r3 = 8
            r7[r3] = r5     // Catch: all -> 0x00ad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: all -> 0x00ad
            r0.setAccessible(r2)     // Catch: all -> 0x00ad
            r1 = r0
        L_0x00ad:
            con.QvXlJJNbM.iiGwOFFnr = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.QvXlJJNbM.<clinit>():void");
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
