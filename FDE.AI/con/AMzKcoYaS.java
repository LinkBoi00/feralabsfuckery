package con;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class AMzKcoYaS {
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.reflect.Method J4Ux7ym32(java.lang.Class r8, java.lang.String r9, java.lang.Object... r10) {
        /*
            r0 = 0
            r1 = 0
            int r2 = r10.length     // Catch: ReflectiveOperationException -> 0x0094
            int r2 = q3BipwRCk(r2, r1)     // Catch: ReflectiveOperationException -> 0x0094
            con.r8qrmPkZl r3 = new con.r8qrmPkZl     // Catch: ReflectiveOperationException -> 0x0094
            r4 = 4
            r3.<init>(r4)     // Catch: ReflectiveOperationException -> 0x0094
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: ReflectiveOperationException -> 0x0094
            r4.<init>()     // Catch: ReflectiveOperationException -> 0x0094
            int r5 = r10.length     // Catch: ReflectiveOperationException -> 0x0094
            r6 = r1
        L_0x0014:
            if (r6 >= r5) goto L_0x0028
            r7 = r10[r6]     // Catch: ReflectiveOperationException -> 0x0094
            if (r7 != 0) goto L_0x001c
            r7 = r0
            goto L_0x0020
        L_0x001c:
            java.lang.Class r7 = r7.getClass()     // Catch: ReflectiveOperationException -> 0x0094
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r4.add(r7)     // Catch: ReflectiveOperationException -> 0x0094
        L_0x0025:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0028:
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Object[] r10 = r4.toArray(r10)     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r10 == 0) goto L_0x008e
            r3.q3BipwRCk(r10)     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Class<con.rJ0s9PfCL> r10 = con.rJ0s9PfCL.class
            java.util.ArrayList r5 = r3.q3BipwRCk     // Catch: ReflectiveOperationException -> 0x0094
            r5.add(r10)     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: ReflectiveOperationException -> 0x0094
            java.util.ArrayList r5 = r3.q3BipwRCk     // Catch: ReflectiveOperationException -> 0x0094
            r5.add(r10)     // Catch: ReflectiveOperationException -> 0x0094
            con.G8ebKyy85 r5 = new con.G8ebKyy85     // Catch: ReflectiveOperationException -> 0x0094
            r5.<init>(r1, r2)     // Catch: ReflectiveOperationException -> 0x0094
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: ReflectiveOperationException -> 0x0094
            r6 = 10
            int r6 = con.CjvsxH2Me.nlGCs0NZs(r5, r6)     // Catch: ReflectiveOperationException -> 0x0094
            r2.<init>(r6)     // Catch: ReflectiveOperationException -> 0x0094
            java.util.Iterator r5 = r5.iterator()     // Catch: ReflectiveOperationException -> 0x0094
        L_0x0057:
            r6 = r5
            con.hbC5oTdpL r6 = (con.hbC5oTdpL) r6     // Catch: ReflectiveOperationException -> 0x0094
            boolean r6 = r6.kmSgne1rO     // Catch: ReflectiveOperationException -> 0x0094
            if (r6 == 0) goto L_0x0068
            r6 = r5
            con.hbC5oTdpL r6 = (con.hbC5oTdpL) r6     // Catch: ReflectiveOperationException -> 0x0094
            r6.J4Ux7ym32()     // Catch: ReflectiveOperationException -> 0x0094
            r2.add(r10)     // Catch: ReflectiveOperationException -> 0x0094
            goto L_0x0057
        L_0x0068:
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Object[] r10 = r2.toArray(r10)     // Catch: ReflectiveOperationException -> 0x0094
            if (r10 == 0) goto L_0x0088
            r3.q3BipwRCk(r10)     // Catch: ReflectiveOperationException -> 0x0094
            java.util.ArrayList r10 = r3.q3BipwRCk     // Catch: ReflectiveOperationException -> 0x0094
            int r10 = r10.size()     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: ReflectiveOperationException -> 0x0094
            java.util.ArrayList r2 = r3.q3BipwRCk     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Object[] r10 = r2.toArray(r10)     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.Class[] r10 = (java.lang.Class[]) r10     // Catch: ReflectiveOperationException -> 0x0094
            java.lang.reflect.Method r10 = tGV7Q6urW(r8, r9, r10)     // Catch: ReflectiveOperationException -> 0x0094
            goto L_0x00ad
        L_0x0088:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: ReflectiveOperationException -> 0x0094
            r10.<init>(r4)     // Catch: ReflectiveOperationException -> 0x0094
            throw r10     // Catch: ReflectiveOperationException -> 0x0094
        L_0x008e:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: ReflectiveOperationException -> 0x0094
            r10.<init>(r4)     // Catch: ReflectiveOperationException -> 0x0094
            throw r10     // Catch: ReflectiveOperationException -> 0x0094
        L_0x0094:
            java.lang.reflect.Method[] r10 = r8.getDeclaredMethods()     // Catch: ReflectiveOperationException -> 0x00ac
            int r2 = r10.length     // Catch: ReflectiveOperationException -> 0x00ac
        L_0x0099:
            if (r1 >= r2) goto L_0x00ac
            r3 = r10[r1]     // Catch: ReflectiveOperationException -> 0x00ac
            java.lang.String r4 = r3.getName()     // Catch: ReflectiveOperationException -> 0x00ac
            boolean r4 = con.anXlDk6fV.tGV7Q6urW(r4, r9)     // Catch: ReflectiveOperationException -> 0x00ac
            if (r4 == 0) goto L_0x00a9
            r0 = r3
            goto L_0x00ac
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00ac:
            r10 = r0
        L_0x00ad:
            if (r10 == 0) goto L_0x00b0
            return r10
        L_0x00b0:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = r8.getName()
            r0.append(r8)
            r8 = 46
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            r10.<init>(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: con.AMzKcoYaS.J4Ux7ym32(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
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
    public static final java.lang.reflect.Method tGV7Q6urW(java.lang.Class r12, java.lang.String r13, java.lang.Class... r14) {
        /*
            int r0 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            java.lang.Class[] r14 = (java.lang.Class[]) r14
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()
            int r0 = r12.length
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r2 >= r0) goto L_0x0074
            r3 = r12[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = con.anXlDk6fV.tGV7Q6urW(r13, r4)
            r5 = 1
            if (r4 == 0) goto L_0x006d
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r6 = r4.length
            int r7 = r14.length
            if (r6 != r7) goto L_0x0069
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            int r7 = r4.length
            r8 = r1
            r9 = r8
        L_0x002e:
            if (r8 >= r7) goto L_0x0045
            r10 = r4[r8]
            int r11 = r9 + 1
            r9 = r14[r9]
            boolean r9 = r10.isAssignableFrom(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r6.add(r9)
            int r8 = r8 + 1
            r9 = r11
            goto L_0x002e
        L_0x0045:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            java.util.Iterator r4 = r6.iterator()
        L_0x0050:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0064
            java.lang.Object r6 = r4.next()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0050
            r4 = r1
            goto L_0x0065
        L_0x0064:
            r4 = r5
        L_0x0065:
            if (r4 == 0) goto L_0x0069
            r4 = r5
            goto L_0x006a
        L_0x0069:
            r4 = r1
        L_0x006a:
            if (r4 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = r1
        L_0x006e:
            if (r5 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x0078
            return r3
        L_0x0078:
            java.lang.NoSuchMethodException r12 = new java.lang.NoSuchMethodException
            java.lang.String r14 = " not found"
            java.lang.String r13 = con.anXlDk6fV.iMyQMM6Qj(r13, r14)
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: con.AMzKcoYaS.tGV7Q6urW(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
