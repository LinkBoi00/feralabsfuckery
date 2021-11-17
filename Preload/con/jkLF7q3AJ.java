package con;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class jkLF7q3AJ {
    public static final Method q3BipwRCk;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (con.anXlDk6fV.tGV7Q6urW(r5, java.lang.Throwable.class) != false) goto L_0x002c;
     */
    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            boolean z = true;
            if (anXlDk6fV.tGV7Q6urW(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
            }
            z = false;
            if (z) {
                method = method2;
                break;
            }
            i2++;
        }
        q3BipwRCk = method;
        int length2 = methods.length;
        while (i < length2 && !anXlDk6fV.tGV7Q6urW(methods[i].getName(), "getSuppressed")) {
            i++;
        }
    }
}
