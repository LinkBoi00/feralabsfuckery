package con;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class Ej3Qf1wRO implements WwFGbLVWX, SPxpCpatl {
    public static final Map J4Ux7ym32;
    public static final Map tGV7Q6urW;
    public final Class q3BipwRCk;

    static {
        int i = 0;
        List ixWaw2akD = idpM54xlp.ixWaw2akD(gdEmqfwpT.class, PmanMZxiM.class, kkcQgCx5G.class, NzvP5Rex8.class, IonfNvcm2.class, a9Q6ojHoZ.class, poAUpaBYd.class, xshFAE2BY.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, WeRxNR3Fj.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, poAUpaBYd.class, uuBar5Bd3.class);
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(ixWaw2akD, 10));
        for (Object obj : ixWaw2akD) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new n4f84B5OG((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                idpM54xlp.IytU16YUK();
                throw null;
            }
        }
        J4Ux7ym32 = s0tSbdszx.mUqPm6GBh(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("kotlin.jvm.internal.");
            q3BipwRCk.append(r6NbD4wnj.OpLJtmvFM(str, '.', null, 2));
            q3BipwRCk.append("CompanionObject");
            String sb = q3BipwRCk.toString();
            hashMap3.put(sb, str + ".Companion");
        }
        for (Map.Entry entry : J4Ux7ym32.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(anXlDk6fV.WaUP0CF08(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), r6NbD4wnj.OpLJtmvFM((String) entry2.getValue(), '.', null, 2));
        }
        tGV7Q6urW = linkedHashMap;
    }

    public Ej3Qf1wRO(Class cls) {
        this.q3BipwRCk = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public String J4Ux7ym32() {
        String str;
        String str2;
        Class cls = this.q3BipwRCk;
        String str3 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    str2 = enclosingMethod.getName() + "$";
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        str2 = enclosingConstructor.getName() + "$";
                    } else {
                        str = null;
                        if (str == null) {
                            return str;
                        }
                        int QNqj6nIzv = r6NbD4wnj.QNqj6nIzv(simpleName, '$', 0, false, 6);
                        if (QNqj6nIzv == -1) {
                            return simpleName;
                        }
                        return simpleName.substring(QNqj6nIzv + 1, simpleName.length());
                    }
                }
                str = r6NbD4wnj.n4UIOvAko(simpleName, str2, null, 2);
                if (str == null) {
                }
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    String str4 = (String) ((LinkedHashMap) tGV7Q6urW).get(componentType.getName());
                    if (str4 != null) {
                        str3 = UexvVay3o.q3BipwRCk(str4, "Array");
                    }
                }
                if (str3 == null) {
                    return "Array";
                }
            } else {
                String str5 = (String) ((LinkedHashMap) tGV7Q6urW).get(cls.getName());
                return str5 != null ? str5 : cls.getSimpleName();
            }
        }
        return str3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ej3Qf1wRO) && anXlDk6fV.tGV7Q6urW(idpM54xlp.vPSbyrYWX(this), idpM54xlp.vPSbyrYWX((WwFGbLVWX) obj));
    }

    public int hashCode() {
        return idpM54xlp.vPSbyrYWX(this).hashCode();
    }

    @Override // con.SPxpCpatl
    public Class q3BipwRCk() {
        return this.q3BipwRCk;
    }

    public String toString() {
        return this.q3BipwRCk.toString() + " (Kotlin reflection is not available)";
    }
}
