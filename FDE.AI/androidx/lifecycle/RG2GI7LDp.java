package androidx.lifecycle;

import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.NPIIOJaRF;
import con.abGBwSu8x;
import con.cqLjMdkAC;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public final class RG2GI7LDp {
    public static RG2GI7LDp tGV7Q6urW = new RG2GI7LDp();
    public final Map q3BipwRCk = new HashMap();
    public final Map J4Ux7ym32 = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public static class C0004RG2GI7LDp {
        public final Map J4Ux7ym32;
        public final Map q3BipwRCk = new HashMap();

        public C0004RG2GI7LDp(Map map) {
            this.J4Ux7ym32 = map;
            for (Map.Entry entry : map.entrySet()) {
                mhl5lIdbQ.RG2GI7LDp rG2GI7LDp = (mhl5lIdbQ.RG2GI7LDp) entry.getValue();
                List list = (List) this.q3BipwRCk.get(rG2GI7LDp);
                if (list == null) {
                    list = new ArrayList();
                    this.q3BipwRCk.put(rG2GI7LDp, list);
                }
                list.add((NPIIOJaRF) entry.getKey());
            }
        }

        public static void q3BipwRCk(List list, BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    NPIIOJaRF nPIIOJaRF = (NPIIOJaRF) list.get(size);
                    Objects.requireNonNull(nPIIOJaRF);
                    try {
                        int i = nPIIOJaRF.q3BipwRCk;
                        if (i == 0) {
                            nPIIOJaRF.J4Ux7ym32.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            nPIIOJaRF.J4Ux7ym32.invoke(obj, bgHiMFrEI);
                        } else if (i == 2) {
                            nPIIOJaRF.J4Ux7ym32.invoke(obj, bgHiMFrEI, rG2GI7LDp);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    public C0004RG2GI7LDp J4Ux7ym32(Class cls) {
        C0004RG2GI7LDp rG2GI7LDp = (C0004RG2GI7LDp) this.q3BipwRCk.get(cls);
        return rG2GI7LDp != null ? rG2GI7LDp : q3BipwRCk(cls, null);
    }

    public final C0004RG2GI7LDp q3BipwRCk(Class cls, Method[] methodArr) {
        int i;
        C0004RG2GI7LDp J4Ux7ym32;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (J4Ux7ym32 = J4Ux7ym32(superclass)) == null)) {
            hashMap.putAll(J4Ux7ym32.J4Ux7ym32);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : J4Ux7ym32(cls2).J4Ux7ym32.entrySet()) {
                tGV7Q6urW(hashMap, (NPIIOJaRF) entry.getKey(), (mhl5lIdbQ.RG2GI7LDp) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            cqLjMdkAC cqljmdkac = (cqLjMdkAC) method.getAnnotation(cqLjMdkAC.class);
            if (cqljmdkac != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(BgHiMFrEI.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                mhl5lIdbQ.RG2GI7LDp value = cqljmdkac.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(mhl5lIdbQ.RG2GI7LDp.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == mhl5lIdbQ.RG2GI7LDp.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    tGV7Q6urW(hashMap, new NPIIOJaRF(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0004RG2GI7LDp rG2GI7LDp = new C0004RG2GI7LDp(hashMap);
        this.q3BipwRCk.put(cls, rG2GI7LDp);
        this.J4Ux7ym32.put(cls, Boolean.valueOf(z));
        return rG2GI7LDp;
    }

    public final void tGV7Q6urW(Map map, NPIIOJaRF nPIIOJaRF, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp, Class cls) {
        mhl5lIdbQ.RG2GI7LDp rG2GI7LDp2 = (mhl5lIdbQ.RG2GI7LDp) map.get(nPIIOJaRF);
        if (rG2GI7LDp2 != null && rG2GI7LDp != rG2GI7LDp2) {
            Method method = nPIIOJaRF.J4Ux7ym32;
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Method ");
            q3BipwRCk.append(method.getName());
            q3BipwRCk.append(" in ");
            q3BipwRCk.append(cls.getName());
            q3BipwRCk.append(" already declared with different @OnLifecycleEvent value: previous value ");
            q3BipwRCk.append(rG2GI7LDp2);
            q3BipwRCk.append(", new value ");
            q3BipwRCk.append(rG2GI7LDp);
            throw new IllegalArgumentException(q3BipwRCk.toString());
        } else if (rG2GI7LDp2 == null) {
            map.put(nPIIOJaRF, rG2GI7LDp);
        }
    }
}
