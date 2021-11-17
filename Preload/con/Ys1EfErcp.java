package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class Ys1EfErcp extends LVtOVALR4 {
    public static Class J4Ux7ym32 = null;
    public static Method dIocxURUo = null;
    public static boolean iiGwOFFnr = false;
    public static Method kCA6Zs9sL;
    public static Constructor tGV7Q6urW;

    public static void iiGwOFFnr() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!iiGwOFFnr) {
            iiGwOFFnr = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            tGV7Q6urW = constructor;
            J4Ux7ym32 = cls;
            dIocxURUo = method;
            kCA6Zs9sL = method2;
        }
    }

    public static boolean kCA6Zs9sL(Object obj, String str, int i, boolean z) {
        iiGwOFFnr();
        try {
            return ((Boolean) dIocxURUo.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // con.LVtOVALR4
    public Typeface q3BipwRCk(Context context, fyPKNAQNN fypknaqnn, Resources resources, int i) {
        iiGwOFFnr();
        try {
            Object newInstance = tGV7Q6urW.newInstance(new Object[0]);
            U90DuDsYT[] u90DuDsYTArr = fypknaqnn.q3BipwRCk;
            for (U90DuDsYT u90DuDsYT : u90DuDsYTArr) {
                File i8XZMQc6Z = BBVaGLNaU.i8XZMQc6Z(context);
                if (i8XZMQc6Z == null) {
                    return null;
                }
                try {
                    if (!BBVaGLNaU.Puu3Rhg4F(i8XZMQc6Z, resources, u90DuDsYT.iiGwOFFnr)) {
                        return null;
                    }
                    if (!kCA6Zs9sL(newInstance, i8XZMQc6Z.getPath(), u90DuDsYT.J4Ux7ym32, u90DuDsYT.tGV7Q6urW)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    i8XZMQc6Z.delete();
                }
            }
            iiGwOFFnr();
            try {
                Object newInstance2 = Array.newInstance(J4Ux7ym32, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) kCA6Zs9sL.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
