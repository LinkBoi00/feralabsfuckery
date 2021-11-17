package con;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class LxklW3zxE implements Way959ade, gXw4WGPur, Serializable {
    public final Way959ade CBQ5d1kRq;

    public LxklW3zxE(Way959ade way959ade) {
        this.CBQ5d1kRq = way959ade;
    }

    @Override // con.Way959ade
    public final void Bhmn1KIah(Object obj) {
        LxklW3zxE lxklW3zxE = this;
        while (true) {
            Way959ade way959ade = lxklW3zxE.CBQ5d1kRq;
            try {
                obj = lxklW3zxE.yWvV4ePLl(obj);
                if (obj == kBKJSqCSL.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new qlt0VySXJ(th);
            }
            lxklW3zxE.oon79WMrY();
            if (way959ade instanceof LxklW3zxE) {
                lxklW3zxE = (LxklW3zxE) way959ade;
            } else {
                way959ade.Bhmn1KIah(obj);
                return;
            }
        }
    }

    public Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement iiGwOFFnr() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        jHNqfwCVd jhnqfwcvd = (jHNqfwCVd) getClass().getAnnotation(jHNqfwCVd.class);
        String str2 = null;
        if (jhnqfwcvd == null) {
            return null;
        }
        int v = jhnqfwcvd.v();
        if (v <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = jhnqfwcvd.l()[i];
            }
            j6XJY7rz4 j6xjy7rz4 = JAoXadvtw.J4Ux7ym32;
            if (j6xjy7rz4 == null) {
                try {
                    j6XJY7rz4 j6xjy7rz42 = new j6XJY7rz4(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    JAoXadvtw.J4Ux7ym32 = j6xjy7rz42;
                    j6xjy7rz4 = j6xjy7rz42;
                } catch (Exception unused2) {
                    j6xjy7rz4 = JAoXadvtw.q3BipwRCk;
                    JAoXadvtw.J4Ux7ym32 = j6xjy7rz4;
                }
            }
            if (!(j6xjy7rz4 == JAoXadvtw.q3BipwRCk || (method = (Method) j6xjy7rz4.kmSgne1rO) == null || (invoke = method.invoke(getClass(), new Object[0])) == null || (method2 = (Method) j6xjy7rz4.Bhmn1KIah) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = (Method) j6xjy7rz4.PSTqBLTET;
                Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
                str2 = str2;
            }
            if (str2 == null) {
                str = jhnqfwcvd.c();
            } else {
                str = str2 + '/' + jhnqfwcvd.c();
            }
            return new StackTraceElement(str, jhnqfwcvd.m(), jhnqfwcvd.f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public void oon79WMrY() {
    }

    @Override // con.gXw4WGPur
    public gXw4WGPur tGV7Q6urW() {
        Way959ade way959ade = this.CBQ5d1kRq;
        if (!(way959ade instanceof gXw4WGPur)) {
            way959ade = null;
        }
        return (gXw4WGPur) way959ade;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Continuation at ");
        Object iiGwOFFnr = iiGwOFFnr();
        if (iiGwOFFnr == null) {
            iiGwOFFnr = getClass().getName();
        }
        q3BipwRCk.append(iiGwOFFnr);
        return q3BipwRCk.toString();
    }

    public abstract Object yWvV4ePLl(Object obj);
}
