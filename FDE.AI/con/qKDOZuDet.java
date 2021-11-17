package con;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
/* loaded from: classes.dex */
public class qKDOZuDet {
    public static final ZmYjNS8wW J4Ux7ym32 = new ZmYjNS8wW();
    public final /* synthetic */ fVMSvDhE6 q3BipwRCk;

    public qKDOZuDet(fVMSvDhE6 fvmsvdhe6) {
        this.q3BipwRCk = fvmsvdhe6;
    }

    public static Class J4Ux7ym32(ClassLoader classLoader, String str) {
        ZmYjNS8wW zmYjNS8wW = J4Ux7ym32;
        ZmYjNS8wW zmYjNS8wW2 = (ZmYjNS8wW) zmYjNS8wW.getOrDefault(classLoader, null);
        if (zmYjNS8wW2 == null) {
            zmYjNS8wW2 = new ZmYjNS8wW();
            zmYjNS8wW.put(classLoader, zmYjNS8wW2);
        }
        Class cls = (Class) zmYjNS8wW2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        zmYjNS8wW2.put(str, cls2);
        return cls2;
    }

    public static Class tGV7Q6urW(ClassLoader classLoader, String str) {
        try {
            return J4Ux7ym32(classLoader, str);
        } catch (ClassCastException e) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public UxHHqhbTP q3BipwRCk(String str) {
        z0NkpHHvU z0nkphhvu = this.q3BipwRCk.ilHKhw3Yw;
        Context context = z0nkphhvu.kmSgne1rO;
        Objects.requireNonNull(z0nkphhvu);
        Object obj = UxHHqhbTP.DuuXfa7LE;
        try {
            return (UxHHqhbTP) tGV7Q6urW(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new kROZxQ3HW(M5g57XBLr.q3BipwRCk("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
