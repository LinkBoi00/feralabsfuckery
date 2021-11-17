package con;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
/* loaded from: classes.dex */
public abstract class cOutqbkMD {
    public static final String Bhmn1KIah(Way959ade way959ade) {
        Object obj;
        if (way959ade instanceof c27z9OHjq) {
            return way959ade.toString();
        }
        try {
            obj = way959ade + '@' + GPLPRo6go(way959ade);
        } catch (Throwable th) {
            obj = new qlt0VySXJ(th);
        }
        if (YqdLs8aRM.q3BipwRCk(obj) != null) {
            obj = ((Object) way959ade.getClass().getName()) + '@' + GPLPRo6go(way959ade);
        }
        return (String) obj;
    }

    public static final Object CBQ5d1kRq(UuvLiXwHL uuvLiXwHL, Object obj, kkcQgCx5G kkcqgcx5g) {
        Object obj2;
        Object nlGCs0NZs;
        try {
        } catch (Throwable th) {
            obj2 = new zo6RfsWe2(th, false, 2);
        }
        if (kkcqgcx5g != null) {
            J4Ux7ym32(kkcqgcx5g, 2);
            obj2 = kkcqgcx5g.WaUP0CF08(obj, uuvLiXwHL);
            kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
            if (obj2 == kbkjsqcsl || (nlGCs0NZs = uuvLiXwHL.nlGCs0NZs(obj2)) == AB5ApHoQM.J4Ux7ym32) {
                return kbkjsqcsl;
            }
            if (!(nlGCs0NZs instanceof zo6RfsWe2)) {
                return AB5ApHoQM.q3BipwRCk(nlGCs0NZs);
            }
            throw ((zo6RfsWe2) nlGCs0NZs).q3BipwRCk;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final String GPLPRo6go(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Object J4Ux7ym32(Object obj, int i) {
        if (yWvV4ePLl(obj, i)) {
            return obj;
        }
        kmSgne1rO(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final Object PSTqBLTET(Object obj, PmanMZxiM pmanMZxiM) {
        Throwable q3BipwRCk = YqdLs8aRM.q3BipwRCk(obj);
        return q3BipwRCk == null ? pmanMZxiM != null ? new sbK32z90g(obj, pmanMZxiM) : obj : new zo6RfsWe2(q3BipwRCk, false, 2);
    }

    public static /* synthetic */ clUYjTSq7 Puu3Rhg4F(JEWwjBE8f jEWwjBE8f, boolean z, boolean z2, PmanMZxiM pmanMZxiM, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return ((Zgh96z4e6) jEWwjBE8f).IytU16YUK(z, z2, pmanMZxiM);
    }

    public static final Object dIocxURUo(cEBNEpWZV cebnepwzv, NWqEIvIkR nWqEIvIkR) {
        String str;
        String str2;
        String str3;
        if (!(nWqEIvIkR instanceof r26j0AqG0) || cebnepwzv.q3BipwRCk().q3BipwRCk.yWvV4ePLl) {
            return nWqEIvIkR.J4Ux7ym32(cebnepwzv);
        }
        JsonElement dIocxURUo = cebnepwzv.dIocxURUo();
        W39e6bnPN q3BipwRCk = nWqEIvIkR.q3BipwRCk();
        if (dIocxURUo instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) dIocxURUo;
            W39e6bnPN q3BipwRCk2 = nWqEIvIkR.q3BipwRCk();
            Hncu9o7E0 q3BipwRCk3 = cebnepwzv.q3BipwRCk();
            Iterator it = q3BipwRCk2.vPSbyrYWX().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = q3BipwRCk3.q3BipwRCk.oon79WMrY;
                    break;
                }
                Annotation annotation = (Annotation) it.next();
                if (annotation instanceof s27UJWiaQ) {
                    str = ((s27UJWiaQ) annotation).discriminator();
                    break;
                }
            }
            JsonElement jsonElement = (JsonElement) jsonObject.get(str);
            if (jsonElement == null) {
                str2 = null;
            } else {
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                if (jsonPrimitive != null) {
                    str2 = jsonPrimitive.J4Ux7ym32();
                } else {
                    StringBuilder q3BipwRCk4 = abGBwSu8x.q3BipwRCk("Element ");
                    q3BipwRCk4.append(YGTdT21e3.q3BipwRCk(jsonElement.getClass()));
                    q3BipwRCk4.append(" is not a ");
                    q3BipwRCk4.append("JsonPrimitive");
                    throw new IllegalArgumentException(q3BipwRCk4.toString());
                }
            }
            r26j0AqG0 r26j0aqg0 = (r26j0AqG0) nWqEIvIkR;
            Objects.requireNonNull(cebnepwzv.vPSbyrYWX());
            yWvV4ePLl(null, 1);
            if (str2 == null) {
                str3 = "missing class discriminator ('null')";
            } else {
                str3 = "class discriminator '" + ((Object) str2) + '\'';
            }
            throw Ot2IiNSkx.tGV7Q6urW(-1, anXlDk6fV.iMyQMM6Qj("Polymorphic serializer was not found for ", str3), jsonObject.toString());
        }
        StringBuilder q3BipwRCk5 = abGBwSu8x.q3BipwRCk("Expected ");
        q3BipwRCk5.append(YGTdT21e3.q3BipwRCk(JsonObject.class));
        q3BipwRCk5.append(" as the serialized body of ");
        q3BipwRCk5.append(q3BipwRCk.dIocxURUo());
        q3BipwRCk5.append(", but had ");
        q3BipwRCk5.append(YGTdT21e3.q3BipwRCk(dIocxURUo.getClass()));
        throw Ot2IiNSkx.J4Ux7ym32(-1, q3BipwRCk5.toString());
    }

    public static final String iiGwOFFnr(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final NWqEIvIkR kCA6Zs9sL(r26j0AqG0 r26j0aqg0, C8ZZcTzJg c8ZZcTzJg, String str) {
        String str2;
        Objects.requireNonNull(c8ZZcTzJg.vPSbyrYWX());
        yWvV4ePLl(null, 1);
        WwFGbLVWX wwFGbLVWX = r26j0aqg0.q3BipwRCk;
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("in the scope of '");
        q3BipwRCk.append((Object) ((Ej3Qf1wRO) wwFGbLVWX).J4Ux7ym32());
        q3BipwRCk.append('\'');
        String sb = q3BipwRCk.toString();
        if (str == null) {
            str2 = anXlDk6fV.iMyQMM6Qj("Class discriminator was missing and no default polymorphic serializers were registered ", sb);
        } else {
            str2 = "Class '" + ((Object) str) + "' is not registered for polymorphic serialization " + sb + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new oPOFYJ4Sr(str2);
    }

    public static void kmSgne1rO(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(M5g57XBLr.q3BipwRCk(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        anXlDk6fV.dfpT1j18n(classCastException, cOutqbkMD.class.getName());
        throw classCastException;
    }

    public static final int oon79WMrY(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static Map q3BipwRCk(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            anXlDk6fV.dfpT1j18n(e, cOutqbkMD.class.getName());
            throw e;
        }
    }

    public static final Object vPSbyrYWX(Object obj, Way959ade way959ade) {
        return obj instanceof zo6RfsWe2 ? new qlt0VySXJ(((zo6RfsWe2) obj).q3BipwRCk) : obj;
    }

    public static boolean yWvV4ePLl(Object obj, int i) {
        int i2;
        if (obj instanceof eEwksJAjd) {
            if (obj instanceof xSLgCZTSl) {
                i2 = ((xSLgCZTSl) obj).kmSgne1rO();
            } else if (obj instanceof gdEmqfwpT) {
                i2 = 0;
            } else if (obj instanceof PmanMZxiM) {
                i2 = 1;
            } else if (obj instanceof kkcQgCx5G) {
                i2 = 2;
            } else if (obj instanceof NzvP5Rex8) {
                i2 = 3;
            } else if (obj instanceof IonfNvcm2) {
                i2 = 4;
            } else if (obj instanceof a9Q6ojHoZ) {
                i2 = 5;
            } else {
                boolean z = obj instanceof poAUpaBYd;
                i2 = z ? 6 : obj instanceof xshFAE2BY ? 7 : z ? 8 : z ? 9 : z ? 10 : z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
