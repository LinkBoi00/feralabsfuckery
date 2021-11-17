package con;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class AMzKcoYaS {
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Method J4Ux7ym32(Class cls, String str, Object... objArr) {
        Method method;
        int q3BipwRCk;
        r8qrmPkZl r8qrmpkzl;
        Object[] array;
        Method method2 = null;
        int i = 0;
        try {
            try {
                q3BipwRCk = q3BipwRCk(objArr.length, 0);
                r8qrmpkzl = new r8qrmPkZl(4);
                ArrayList arrayList = new ArrayList();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    Class<?> cls2 = obj == null ? null : obj.getClass();
                    if (cls2 != null) {
                        arrayList.add(cls2);
                    }
                }
                array = arrayList.toArray(new Class[0]);
            } catch (ReflectiveOperationException unused) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length2 = declaredMethods.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (anXlDk6fV.tGV7Q6urW(method3.getName(), str)) {
                        method2 = method3;
                        break;
                    }
                    i++;
                }
                method = method2;
                if (method != null) {
                }
            }
        } catch (ReflectiveOperationException unused2) {
            method = method2;
            if (method != null) {
            }
        }
        if (array != null) {
            r8qrmpkzl.q3BipwRCk(array);
            r8qrmpkzl.q3BipwRCk.add(rJ0s9PfCL.class);
            Class cls3 = Integer.TYPE;
            r8qrmpkzl.q3BipwRCk.add(cls3);
            G8ebKyy85 g8ebKyy85 = new G8ebKyy85(0, q3BipwRCk);
            ArrayList arrayList2 = new ArrayList(CjvsxH2Me.nlGCs0NZs(g8ebKyy85, 10));
            Iterator it = g8ebKyy85.iterator();
            while (((hbC5oTdpL) it).kmSgne1rO) {
                ((hbC5oTdpL) it).J4Ux7ym32();
                arrayList2.add(cls3);
            }
            Object[] array2 = arrayList2.toArray(new Class[0]);
            if (array2 != null) {
                r8qrmpkzl.q3BipwRCk(array2);
                method = tGV7Q6urW(cls, str, (Class[]) r8qrmpkzl.q3BipwRCk.toArray(new Class[r8qrmpkzl.q3BipwRCk.size()]));
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(((Object) cls.getName()) + '.' + str);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object dIocxURUo(Method method, Object obj, rJ0s9PfCL rj0s9pfcl, Object... objArr) {
        int i;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            } else if (anXlDk6fV.tGV7Q6urW(parameterTypes[length], rJ0s9PfCL.class)) {
                break;
            } else {
                length--;
            }
        }
        int i2 = length + 1;
        int q3BipwRCk = q3BipwRCk(length, obj != null ? 1 : 0) + i2;
        int length2 = method.getParameterTypes().length;
        if ((length2 != q3BipwRCk ? (int) Math.ceil(((double) length) / 31.0d) : 0) + q3BipwRCk == length2) {
            Object[] objArr2 = new Object[length2];
            int i3 = 0;
            while (i3 < length2) {
                if (i3 >= 0 && i3 < length) {
                    if (i3 < 0 || i3 > objArr.length - 1) {
                        String name = method.getParameterTypes()[i3].getName();
                        switch (name.hashCode()) {
                            case -1325958191:
                                if (name.equals("double")) {
                                    i = Double.valueOf(0.0d);
                                    break;
                                }
                                i = null;
                                break;
                            case 104431:
                                if (name.equals("int")) {
                                    i = 0;
                                    break;
                                }
                                i = null;
                                break;
                            case 3039496:
                                if (name.equals("byte")) {
                                    i = (byte) 0;
                                    break;
                                }
                                i = null;
                                break;
                            case 3052374:
                                if (name.equals("char")) {
                                    i = '0';
                                    break;
                                }
                                i = null;
                                break;
                            case 3327612:
                                if (name.equals("long")) {
                                    i = 0L;
                                    break;
                                }
                                i = null;
                                break;
                            case 64711720:
                                if (name.equals("boolean")) {
                                    i = Boolean.FALSE;
                                    break;
                                }
                                i = null;
                                break;
                            case 97526364:
                                if (name.equals("float")) {
                                    i = Float.valueOf(0.0f);
                                    break;
                                }
                                i = null;
                                break;
                            case 109413500:
                                if (name.equals("short")) {
                                    i = (short) 0;
                                    break;
                                }
                                i = null;
                                break;
                            default:
                                i = null;
                                break;
                        }
                    } else {
                        i = objArr[i3];
                    }
                } else if (i3 == length) {
                    i = rj0s9pfcl;
                } else {
                    if (i2 <= i3 && i3 < q3BipwRCk) {
                        i = 0;
                    } else {
                        if (q3BipwRCk <= i3 && i3 < length2) {
                            i = 2097151;
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                objArr2[i3] = i;
                i3++;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void kCA6Zs9sL(String str, String str2, rJ0s9PfCL rj0s9pfcl, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method J4Ux7ym32 = J4Ux7ym32(cls, str2, Arrays.copyOf(objArr, objArr.length));
            J4Ux7ym32.setAccessible(true);
            if (Modifier.isStatic(J4Ux7ym32.getModifiers())) {
                dIocxURUo(J4Ux7ym32, null, rj0s9pfcl, Arrays.copyOf(objArr, objArr.length));
            } else {
                dIocxURUo(J4Ux7ym32, cls.getConstructor(new Class[0]).newInstance(new Object[0]), rj0s9pfcl, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e) {
            throw new ClassNotFoundException("Composable Method '" + str + '.' + str2 + "' not found", e);
        }
    }

    public static final int q3BipwRCk(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 15.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r4 == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Method tGV7Q6urW(Class cls, String str, Class... clsArr) {
        Method method;
        boolean z;
        boolean z2;
        Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            boolean z3 = true;
            if (anXlDk6fV.tGV7Q6urW(str, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int i2 = 0;
                    for (Class<?> cls2 : parameterTypes) {
                        i2++;
                        arrayList.add(Boolean.valueOf(cls2.isAssignableFrom(clsArr2[i2])));
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        z = true;
                    }
                }
                z = false;
            }
            z3 = false;
            if (z3) {
                break;
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(anXlDk6fV.iMyQMM6Qj(str, " not found"));
    }
}
