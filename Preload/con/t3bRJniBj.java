package con;

import androidx.lifecycle.RG2GI7LDp;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class t3bRJniBj {
    public static Map q3BipwRCk = new HashMap();
    public static Map J4Ux7ym32 = new HashMap();

    public static String J4Ux7ym32(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static rNTkypKjh q3BipwRCk(Constructor constructor, Object obj) {
        try {
            return (rNTkypKjh) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int tGV7Q6urW(Class cls) {
        Constructor constructor;
        Map map;
        boolean z;
        Integer num = (Integer) ((HashMap) q3BipwRCk).get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List list = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String J4Ux7ym322 = J4Ux7ym32(canonicalName);
                if (!name.isEmpty()) {
                    J4Ux7ym322 = name + "." + J4Ux7ym322;
                }
                constructor = Class.forName(J4Ux7ym322).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = J4Ux7ym32;
                list = Collections.singletonList(constructor);
            } else {
                RG2GI7LDp rG2GI7LDp = RG2GI7LDp.tGV7Q6urW;
                Boolean bool = (Boolean) rG2GI7LDp.J4Ux7ym32.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                rG2GI7LDp.J4Ux7ym32.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((cqLjMdkAC) declaredMethods[i2].getAnnotation(cqLjMdkAC.class)) != null) {
                                rG2GI7LDp.q3BipwRCk(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && mScwA0bsb.class.isAssignableFrom(superclass)) {
                        if (tGV7Q6urW(superclass) != 1) {
                            list = new ArrayList((Collection) ((HashMap) J4Ux7ym32).get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && mScwA0bsb.class.isAssignableFrom(cls2)) {
                                if (tGV7Q6urW(cls2) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.addAll((Collection) ((HashMap) J4Ux7ym32).get(cls2));
                            }
                            i3++;
                        } else if (list != null) {
                            map = J4Ux7ym32;
                        }
                    }
                }
            }
            ((HashMap) map).put(cls, list);
            i = 2;
        }
        ((HashMap) q3BipwRCk).put(cls, Integer.valueOf(i));
        return i;
    }
}
