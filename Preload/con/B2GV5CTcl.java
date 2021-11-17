package con;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract /* synthetic */ class B2GV5CTcl {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
        if (r4 == false) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
        if (r11 == false) goto L_0x0113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r12 == false) goto L_0x0157;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2 A[Catch: NoSuchFieldException -> 0x01a5, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01a5, blocks: (B:94:0x016b, B:96:0x0174, B:101:0x0187, B:104:0x018d, B:107:0x0193, B:110:0x019a, B:111:0x019e, B:113:0x01a2), top: B:131:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final wjjWl3mHt J4Ux7ym32(WwFGbLVWX wwFGbLVWX, wjjWl3mHt... wjjwl3mhtArr) {
        Object obj;
        wjjWl3mHt wjjwl3mht;
        wjjWl3mHt wjjwl3mht2;
        wjjWl3mHt wjjwl3mht3;
        Class<?> cls;
        Object obj2;
        Field field;
        boolean z;
        Class[] clsArr;
        Object invoke;
        Class oon79WMrY = idpM54xlp.oon79WMrY(wwFGbLVWX);
        int i = 0;
        if (oon79WMrY.isEnum()) {
            if (oon79WMrY.getAnnotation(TIYMCd0MU.class) == null && oon79WMrY.getAnnotation(Whh7ZUGG5.class) == null) {
                Object[] enumConstants = oon79WMrY.getEnumConstants();
                String canonicalName = oon79WMrY.getCanonicalName();
                Objects.requireNonNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
                return new tZY3irN9a(canonicalName, (Enum[]) enumConstants);
            }
        }
        if (oon79WMrY.isInterface()) {
            TIYMCd0MU tIYMCd0MU = (TIYMCd0MU) idpM54xlp.oon79WMrY(wwFGbLVWX).getAnnotation(TIYMCd0MU.class);
            if (tIYMCd0MU == null || anXlDk6fV.tGV7Q6urW(YGTdT21e3.q3BipwRCk(tIYMCd0MU.with()), YGTdT21e3.q3BipwRCk(r26j0AqG0.class))) {
                return new r26j0AqG0(wwFGbLVWX);
            }
            return null;
        }
        wjjWl3mHt[] wjjwl3mhtArr2 = (wjjWl3mHt[]) Arrays.copyOf(wjjwl3mhtArr, wjjwl3mhtArr.length);
        try {
            Field declaredField = oon79WMrY.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj != null) {
            try {
                if (wjjwl3mhtArr2.length == 0) {
                    clsArr = new Class[0];
                } else {
                    int length = wjjwl3mhtArr2.length;
                    Class[] clsArr2 = new Class[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        clsArr2[i2] = wjjWl3mHt.class;
                    }
                    clsArr = clsArr2;
                }
                invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(wjjwl3mhtArr2, wjjwl3mhtArr2.length));
            } catch (NoSuchMethodException unused2) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    String message = cause.getMessage();
                    if (message == null) {
                        message = e.getMessage();
                    }
                    throw new InvocationTargetException(cause, message);
                }
                throw e;
            }
            if (invoke instanceof wjjWl3mHt) {
                wjjwl3mht = (wjjWl3mHt) invoke;
                if (wjjwl3mht == null) {
                    return wjjwl3mht;
                }
                Field[] declaredFields = oon79WMrY.getDeclaredFields();
                int length2 = declaredFields.length;
                int i3 = 0;
                boolean z2 = false;
                Field field2 = null;
                while (true) {
                    if (i3 < length2) {
                        Field field3 = declaredFields[i3];
                        if (anXlDk6fV.tGV7Q6urW(field3.getName(), "INSTANCE") && anXlDk6fV.tGV7Q6urW(field3.getType(), oon79WMrY) && Modifier.isStatic(field3.getModifiers())) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            field2 = field3;
                        }
                        i3++;
                    }
                }
                field2 = null;
                if (field2 != null) {
                    Object obj3 = field2.get(null);
                    Method[] methods = oon79WMrY.getMethods();
                    int length3 = methods.length;
                    int i4 = 0;
                    boolean z3 = false;
                    Method method = null;
                    while (true) {
                        if (i4 < length3) {
                            Method method2 = methods[i4];
                            if (anXlDk6fV.tGV7Q6urW(method2.getName(), "serializer")) {
                                if ((method2.getParameterTypes().length == 0) && anXlDk6fV.tGV7Q6urW(method2.getReturnType(), wjjWl3mHt.class)) {
                                    z = true;
                                    if (z) {
                                        if (z3) {
                                            break;
                                        }
                                        method = method2;
                                        z3 = true;
                                    }
                                    i4++;
                                }
                            }
                            z = false;
                            if (z) {
                            }
                            i4++;
                        }
                    }
                    method = null;
                    if (method != null) {
                        Object invoke2 = method.invoke(obj3, new Object[0]);
                        if (invoke2 instanceof wjjWl3mHt) {
                            wjjwl3mht2 = (wjjWl3mHt) invoke2;
                            if (wjjwl3mht2 == null) {
                                return wjjwl3mht2;
                            }
                            try {
                                Class<?>[] declaredClasses = oon79WMrY.getDeclaredClasses();
                                int length4 = declaredClasses.length;
                                boolean z4 = false;
                                Class<?> cls2 = null;
                                while (true) {
                                    if (i < length4) {
                                        Class<?> cls3 = declaredClasses[i];
                                        if (anXlDk6fV.tGV7Q6urW(cls3.getSimpleName(), "$serializer")) {
                                            if (z4) {
                                                break;
                                            }
                                            cls2 = cls3;
                                            z4 = true;
                                        }
                                        i++;
                                    }
                                }
                                cls2 = null;
                                cls = cls2;
                            } catch (NoSuchFieldException unused3) {
                            }
                            if (!(cls == null || (field = cls.getField("INSTANCE")) == null)) {
                                obj2 = field.get(null);
                                if (obj2 instanceof wjjWl3mHt) {
                                    wjjwl3mht3 = (wjjWl3mHt) obj2;
                                    if (wjjwl3mht3 != null) {
                                        return wjjwl3mht3;
                                    }
                                    Class oon79WMrY2 = idpM54xlp.oon79WMrY(wwFGbLVWX);
                                    if (oon79WMrY2.getAnnotation(Whh7ZUGG5.class) != null) {
                                        return new r26j0AqG0(wwFGbLVWX);
                                    }
                                    TIYMCd0MU tIYMCd0MU2 = (TIYMCd0MU) oon79WMrY2.getAnnotation(TIYMCd0MU.class);
                                    if (tIYMCd0MU2 == null || !anXlDk6fV.tGV7Q6urW(YGTdT21e3.q3BipwRCk(tIYMCd0MU2.with()), YGTdT21e3.q3BipwRCk(r26j0AqG0.class))) {
                                        return null;
                                    }
                                    return new r26j0AqG0(wwFGbLVWX);
                                }
                                wjjwl3mht3 = null;
                                if (wjjwl3mht3 != null) {
                                }
                            }
                            obj2 = null;
                            if (obj2 instanceof wjjWl3mHt) {
                            }
                            wjjwl3mht3 = null;
                            if (wjjwl3mht3 != null) {
                            }
                        }
                    }
                }
                wjjwl3mht2 = null;
                if (wjjwl3mht2 == null) {
                }
            }
        }
        wjjwl3mht = null;
        if (wjjwl3mht == null) {
        }
    }

    public static final wjjWl3mHt dIocxURUo(IOYQk1Nz8 iOYQk1Nz8, v1smVeB0h v1smveb0h) {
        wjjWl3mHt GPLPRo6go = rTcohQ78k.GPLPRo6go(iOYQk1Nz8, v1smveb0h, true);
        if (GPLPRo6go != null) {
            return GPLPRo6go;
        }
        WwFGbLVWX tGV7Q6urW = gScbsbDFV.tGV7Q6urW(v1smveb0h);
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Serializer for class '");
        q3BipwRCk.append((Object) ((Ej3Qf1wRO) tGV7Q6urW).J4Ux7ym32());
        q3BipwRCk.append("' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
        throw new oPOFYJ4Sr(q3BipwRCk.toString());
    }

    public static final wjjWl3mHt kCA6Zs9sL(WwFGbLVWX wwFGbLVWX) {
        wjjWl3mHt J4Ux7ym32 = J4Ux7ym32(wwFGbLVWX, new wjjWl3mHt[0]);
        return J4Ux7ym32 == null ? (wjjWl3mHt) emCil6bAE.q3BipwRCk.get(wwFGbLVWX) : J4Ux7ym32;
    }

    public static final W39e6bnPN q3BipwRCk(W39e6bnPN w39e6bnPN, IOYQk1Nz8 iOYQk1Nz8) {
        if (!anXlDk6fV.tGV7Q6urW(w39e6bnPN.yWvV4ePLl(), ExxfeSnE3.q3BipwRCk)) {
            return w39e6bnPN.J4Ux7ym32() ? w39e6bnPN.Puu3Rhg4F(0) : w39e6bnPN;
        }
        if (anXlDk6fV.kmSgne1rO(w39e6bnPN) == null) {
            return w39e6bnPN;
        }
        K6PL0z3I0.q3BipwRCk(null);
        return w39e6bnPN;
    }

    public static final Object tGV7Q6urW(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }
}
