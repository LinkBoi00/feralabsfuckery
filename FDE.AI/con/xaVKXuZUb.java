package con;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class xaVKXuZUb {
    public static Method J4Ux7ym32;
    public static Method q3BipwRCk;
    public static boolean tGV7Q6urW;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final void q3BipwRCk(Canvas canvas, boolean z) {
        Method method;
        Method method2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            vSKmJcsaB.q3BipwRCk.q3BipwRCk(canvas, z);
            return;
        }
        if (!tGV7Q6urW) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    q3BipwRCk = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    method2 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    q3BipwRCk = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    method2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                J4Ux7ym32 = method2;
                Method method3 = q3BipwRCk;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
                Method method4 = J4Ux7ym32;
                if (method4 != null) {
                    method4.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            tGV7Q6urW = true;
        }
        if (z) {
            try {
                Method method5 = q3BipwRCk;
                if (method5 != null) {
                    method5.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = J4Ux7ym32) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }
}
