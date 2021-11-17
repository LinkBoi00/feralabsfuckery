package con;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class YGTdT21e3 {
    public static final sXaMULvdn q3BipwRCk;

    static {
        sXaMULvdn sxamulvdn = null;
        try {
            sxamulvdn = (sXaMULvdn) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sxamulvdn == null) {
            sxamulvdn = new sXaMULvdn();
        }
        q3BipwRCk = sxamulvdn;
    }

    public static WwFGbLVWX q3BipwRCk(Class cls) {
        Objects.requireNonNull(q3BipwRCk);
        return new Ej3Qf1wRO(cls);
    }
}
