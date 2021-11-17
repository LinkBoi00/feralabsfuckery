package con;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
/* loaded from: classes.dex */
public final class O4xeEjEdD {
    public final boolean J4Ux7ym32;
    public final JyP4fsVuo q3BipwRCk;
    public int tGV7Q6urW;

    public O4xeEjEdD(lWcW85d4y lwcw85d4y, JyP4fsVuo jyP4fsVuo) {
        this.q3BipwRCk = jyP4fsVuo;
        this.J4Ux7ym32 = lwcw85d4y.tGV7Q6urW;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Object q3BipwRCk(O4xeEjEdD o4xeEjEdD, EZxKDd411 eZxKDd411, Way959ade way959ade) {
        U2CgWVKPz u2CgWVKPz;
        int i;
        kBKJSqCSL kbkjsqcsl;
        LinkedHashMap linkedHashMap;
        kBKJSqCSL kbkjsqcsl2;
        byte yWvV4ePLl;
        EZxKDd411 eZxKDd4112;
        U2CgWVKPz u2CgWVKPz2;
        O4xeEjEdD o4xeEjEdD2 = o4xeEjEdD;
        Objects.requireNonNull(o4xeEjEdD);
        kBKJSqCSL kbkjsqcsl3 = kBKJSqCSL.COROUTINE_SUSPENDED;
        if (way959ade instanceof U2CgWVKPz) {
            u2CgWVKPz = (U2CgWVKPz) way959ade;
            int i2 = u2CgWVKPz.RG6kpfv3v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u2CgWVKPz.RG6kpfv3v = i2 - Integer.MIN_VALUE;
                Object obj = u2CgWVKPz.Eeka1udhb;
                i = u2CgWVKPz.RG6kpfv3v;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    byte oon79WMrY = o4xeEjEdD2.q3BipwRCk.oon79WMrY((byte) 6);
                    if (o4xeEjEdD2.q3BipwRCk.ixWaw2akD() != 4) {
                        linkedHashMap = new LinkedHashMap();
                        kbkjsqcsl = kbkjsqcsl3;
                        u2CgWVKPz2 = u2CgWVKPz;
                        yWvV4ePLl = oon79WMrY;
                        kbkjsqcsl2 = kbkjsqcsl;
                        eZxKDd4112 = eZxKDd411;
                        if (!o4xeEjEdD2.q3BipwRCk.kCA6Zs9sL()) {
                        }
                    } else {
                        JyP4fsVuo.dXrmkklc8(o4xeEjEdD2.q3BipwRCk, "Unexpected leading comma", 0, 2, null);
                        throw null;
                    }
                } else if (i == 1) {
                    linkedHashMap = (LinkedHashMap) u2CgWVKPz.qVUwofr5s;
                    String str = (String) u2CgWVKPz.ilHKhw3Yw;
                    o4xeEjEdD2 = (O4xeEjEdD) u2CgWVKPz.MzoOEjc4X;
                    EZxKDd411 eZxKDd4113 = (EZxKDd411) u2CgWVKPz.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                    U2CgWVKPz u2CgWVKPz3 = u2CgWVKPz;
                    kbkjsqcsl2 = kbkjsqcsl3;
                    kbkjsqcsl = kbkjsqcsl2;
                    linkedHashMap.put(str, (JsonElement) obj);
                    yWvV4ePLl = o4xeEjEdD2.q3BipwRCk.yWvV4ePLl();
                    if (yWvV4ePLl != 4 || yWvV4ePLl == 7) {
                        eZxKDd4112 = eZxKDd4113;
                        u2CgWVKPz2 = u2CgWVKPz3;
                        if (!o4xeEjEdD2.q3BipwRCk.kCA6Zs9sL()) {
                            if (o4xeEjEdD2.J4Ux7ym32) {
                                str = o4xeEjEdD2.q3BipwRCk.Bhmn1KIah();
                            } else {
                                str = o4xeEjEdD2.q3BipwRCk.kmSgne1rO();
                            }
                            o4xeEjEdD2.q3BipwRCk.oon79WMrY((byte) 5);
                            qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
                            u2CgWVKPz2.PSTqBLTET = eZxKDd4112;
                            u2CgWVKPz2.MzoOEjc4X = o4xeEjEdD2;
                            u2CgWVKPz2.ilHKhw3Yw = str;
                            u2CgWVKPz2.qVUwofr5s = linkedHashMap;
                            u2CgWVKPz2.RG6kpfv3v = 1;
                            Objects.requireNonNull(eZxKDd4112);
                            eZxKDd4112.Bhmn1KIah = u2CgWVKPz2;
                            eZxKDd4112.kmSgne1rO = qih4lw99w;
                            if (kbkjsqcsl2 == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            u2CgWVKPz3 = u2CgWVKPz2;
                            eZxKDd4113 = eZxKDd4112;
                            obj = kbkjsqcsl2;
                            linkedHashMap.put(str, (JsonElement) obj);
                            yWvV4ePLl = o4xeEjEdD2.q3BipwRCk.yWvV4ePLl();
                            if (yWvV4ePLl != 4) {
                            }
                            eZxKDd4112 = eZxKDd4113;
                            u2CgWVKPz2 = u2CgWVKPz3;
                            if (!o4xeEjEdD2.q3BipwRCk.kCA6Zs9sL()) {
                                if (yWvV4ePLl == 6) {
                                    o4xeEjEdD2.q3BipwRCk.oon79WMrY((byte) 7);
                                } else if (yWvV4ePLl == 4) {
                                    JyP4fsVuo.dXrmkklc8(o4xeEjEdD2.q3BipwRCk, "Unexpected trailing comma", 0, 2, null);
                                    throw null;
                                }
                                return new JsonObject(linkedHashMap);
                            }
                        }
                    } else {
                        JyP4fsVuo.dXrmkklc8(o4xeEjEdD2.q3BipwRCk, "Expected end of the object or comma", 0, 2, null);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        u2CgWVKPz = new U2CgWVKPz(o4xeEjEdD2, way959ade);
        Object obj2 = u2CgWVKPz.Eeka1udhb;
        i = u2CgWVKPz.RG6kpfv3v;
        if (i != 0) {
        }
    }

    public final JsonElement J4Ux7ym32() {
        JsonElement jsonElement;
        String str;
        NzvP5Rex8 nzvP5Rex8;
        Object obj;
        byte ixWaw2akD = this.q3BipwRCk.ixWaw2akD();
        if (ixWaw2akD == 1) {
            return dIocxURUo(true);
        }
        if (ixWaw2akD == 0) {
            return dIocxURUo(false);
        }
        if (ixWaw2akD == 6) {
            int i = this.tGV7Q6urW + 1;
            this.tGV7Q6urW = i;
            if (i == 200) {
                EZxKDd411 eZxKDd411 = new EZxKDd411(new r75h8KOeT(this, null), qih4lW99W.q3BipwRCk);
                while (true) {
                    Object obj2 = eZxKDd411.PSTqBLTET;
                    Way959ade way959ade = eZxKDd411.Bhmn1KIah;
                    if (way959ade == null) {
                        anXlDk6fV.IytU16YUK(obj2);
                        jsonElement = (JsonElement) obj2;
                        break;
                    }
                    kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                    if (anXlDk6fV.tGV7Q6urW(kbkjsqcsl, obj2)) {
                        try {
                            nzvP5Rex8 = eZxKDd411.CBQ5d1kRq;
                            obj = eZxKDd411.kmSgne1rO;
                        } catch (Throwable th) {
                            way959ade.Bhmn1KIah(new qlt0VySXJ(th));
                        }
                        if (nzvP5Rex8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type (R, P, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            break;
                        }
                        cOutqbkMD.J4Ux7ym32(nzvP5Rex8, 3);
                        obj2 = nzvP5Rex8.sk5s77z6Q(eZxKDd411, obj, way959ade);
                        if (obj2 != kbkjsqcsl) {
                        }
                    } else {
                        eZxKDd411.PSTqBLTET = kbkjsqcsl;
                    }
                    way959ade.Bhmn1KIah(obj2);
                }
            } else {
                byte oon79WMrY = this.q3BipwRCk.oon79WMrY((byte) 6);
                if (this.q3BipwRCk.ixWaw2akD() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (this.q3BipwRCk.kCA6Zs9sL()) {
                        if (this.J4Ux7ym32) {
                            str = this.q3BipwRCk.Bhmn1KIah();
                        } else {
                            str = this.q3BipwRCk.kmSgne1rO();
                        }
                        this.q3BipwRCk.oon79WMrY((byte) 5);
                        linkedHashMap.put(str, J4Ux7ym32());
                        oon79WMrY = this.q3BipwRCk.yWvV4ePLl();
                        if (oon79WMrY != 4 && oon79WMrY != 7) {
                            JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, "Expected end of the object or comma", 0, 2, null);
                            throw null;
                        }
                    }
                    if (oon79WMrY == 6) {
                        this.q3BipwRCk.oon79WMrY((byte) 7);
                    } else if (oon79WMrY == 4) {
                        JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, "Unexpected trailing comma", 0, 2, null);
                        throw null;
                    }
                    jsonElement = new JsonObject(linkedHashMap);
                } else {
                    JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, "Unexpected leading comma", 0, 2, null);
                    throw null;
                }
            }
            this.tGV7Q6urW--;
            return jsonElement;
        } else if (ixWaw2akD == 8) {
            return tGV7Q6urW();
        } else {
            JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, anXlDk6fV.iMyQMM6Qj("Cannot begin reading element, unexpected token: ", Byte.valueOf(ixWaw2akD)), 0, 2, null);
            throw null;
        }
    }

    public final JsonPrimitive dIocxURUo(boolean z) {
        String Bhmn1KIah = (this.J4Ux7ym32 || !z) ? this.q3BipwRCk.Bhmn1KIah() : this.q3BipwRCk.kmSgne1rO();
        return (z || !anXlDk6fV.tGV7Q6urW(Bhmn1KIah, "null")) ? new ECCL6mpE4(Bhmn1KIah, z) : JsonNull.q3BipwRCk;
    }

    public final JsonElement tGV7Q6urW() {
        byte yWvV4ePLl = this.q3BipwRCk.yWvV4ePLl();
        if (this.q3BipwRCk.ixWaw2akD() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.q3BipwRCk.kCA6Zs9sL()) {
                arrayList.add(J4Ux7ym32());
                yWvV4ePLl = this.q3BipwRCk.yWvV4ePLl();
                if (yWvV4ePLl != 4) {
                    JyP4fsVuo jyP4fsVuo = this.q3BipwRCk;
                    boolean z = yWvV4ePLl == 9;
                    int i = jyP4fsVuo.q3BipwRCk;
                    if (!z) {
                        throw Ot2IiNSkx.tGV7Q6urW(i, "Expected end of the array or comma", jyP4fsVuo.dIocxURUo);
                    }
                }
            }
            if (yWvV4ePLl == 8) {
                this.q3BipwRCk.oon79WMrY((byte) 9);
            } else if (yWvV4ePLl == 4) {
                JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, "Unexpected trailing comma", 0, 2, null);
                throw null;
            }
            return new JsonArray(arrayList);
        }
        JyP4fsVuo.dXrmkklc8(this.q3BipwRCk, "Unexpected leading comma", 0, 2, null);
        throw null;
    }
}
