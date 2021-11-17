package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class rTcohQ78k {
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0206, code lost:
        if (r6 == null) goto L_0x0071;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final wjjWl3mHt GPLPRo6go(IOYQk1Nz8 iOYQk1Nz8, v1smVeB0h v1smveb0h, boolean z) {
        wjjWl3mHt wjjwl3mht;
        ArrayList arrayList;
        wjjWl3mHt wjjwl3mht2;
        wjjWl3mHt wjjwl3mht3;
        wjjWl3mHt J4Ux7ym32;
        WwFGbLVWX tGV7Q6urW = gScbsbDFV.tGV7Q6urW(v1smveb0h);
        boolean z2 = v1smveb0h.tGV7Q6urW;
        List list = v1smveb0h.J4Ux7ym32;
        ArrayList arrayList2 = new ArrayList(CjvsxH2Me.nlGCs0NZs(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            K6PL0z3I0.q3BipwRCk(it.next());
            Objects.requireNonNull(null);
            throw null;
        } else if (arrayList2.isEmpty()) {
            wjjwl3mht = B2GV5CTcl.kCA6Zs9sL(tGV7Q6urW);
            if (wjjwl3mht == null) {
                Objects.requireNonNull(iOYQk1Nz8);
                wjjwl3mht = null;
            }
            if (wjjwl3mht == null) {
                wjjwl3mht = null;
            }
            if (wjjwl3mht != null) {
                return null;
            }
            return (!z2 || wjjwl3mht.q3BipwRCk().iiGwOFFnr()) ? wjjwl3mht : new p3lGSc3Hn(wjjwl3mht);
        } else {
            if (z) {
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(B2GV5CTcl.dIocxURUo(iOYQk1Nz8, (v1smVeB0h) it2.next()));
                }
            } else {
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    wjjWl3mHt GPLPRo6go = GPLPRo6go(iOYQk1Nz8, (v1smVeB0h) it3.next(), false);
                    if (GPLPRo6go == null) {
                        break;
                    }
                    arrayList.add(GPLPRo6go);
                }
            }
            if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Collection.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(List.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(List.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(ArrayList.class))) {
                J4Ux7ym32 = new gjOx6fl4C((wjjWl3mHt) arrayList.get(0), 0);
            } else if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(HashSet.class))) {
                J4Ux7ym32 = new gjOx6fl4C((wjjWl3mHt) arrayList.get(0), 1);
            } else {
                if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Set.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Set.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(LinkedHashSet.class))) {
                    J4Ux7ym32 = new gjOx6fl4C((wjjWl3mHt) arrayList.get(0), 2);
                } else if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(HashMap.class))) {
                    J4Ux7ym32 = new urNF0KKAh((wjjWl3mHt) arrayList.get(0), (wjjWl3mHt) arrayList.get(1), 0);
                } else {
                    if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Map.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Map.class)) ? true : anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(LinkedHashMap.class))) {
                        J4Ux7ym32 = new urNF0KKAh((wjjWl3mHt) arrayList.get(0), (wjjWl3mHt) arrayList.get(1), 1);
                    } else {
                        if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(Map.Entry.class))) {
                            wjjwl3mht2 = new jSznB4lMR((wjjWl3mHt) arrayList.get(0), (wjjWl3mHt) arrayList.get(1), 0);
                        } else {
                            if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(n4f84B5OG.class))) {
                                wjjwl3mht3 = new jSznB4lMR((wjjWl3mHt) arrayList.get(0), (wjjWl3mHt) arrayList.get(1), 1);
                            } else if (anXlDk6fV.tGV7Q6urW(tGV7Q6urW, YGTdT21e3.q3BipwRCk(qZBmE0wDS.class))) {
                                wjjwl3mht2 = new Sz3BF1fv6((wjjWl3mHt) arrayList.get(0), (wjjWl3mHt) arrayList.get(1), (wjjWl3mHt) arrayList.get(2));
                            } else if (idpM54xlp.oon79WMrY(tGV7Q6urW).isArray()) {
                                WwFGbLVWX wwFGbLVWX = ((v1smVeB0h) arrayList2.get(0)).q3BipwRCk;
                                Objects.requireNonNull(wwFGbLVWX, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                                wjjwl3mht3 = new VvN6R9vAr(wwFGbLVWX, (wjjWl3mHt) arrayList.get(0));
                            } else {
                                Object[] array = arrayList.toArray(new wjjWl3mHt[0]);
                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                wjjWl3mHt[] wjjwl3mhtArr = (wjjWl3mHt[]) array;
                                J4Ux7ym32 = B2GV5CTcl.J4Ux7ym32(tGV7Q6urW, (wjjWl3mHt[]) Arrays.copyOf(wjjwl3mhtArr, wjjwl3mhtArr.length));
                                if (J4Ux7ym32 == null) {
                                    J4Ux7ym32 = B2GV5CTcl.kCA6Zs9sL(tGV7Q6urW);
                                }
                            }
                            wjjwl3mht = wjjwl3mht3;
                            if (wjjwl3mht == null) {
                            }
                            if (wjjwl3mht != null) {
                            }
                        }
                        wjjwl3mht = wjjwl3mht2;
                        if (wjjwl3mht == null) {
                        }
                        if (wjjwl3mht != null) {
                        }
                    }
                }
            }
            wjjwl3mht = J4Ux7ym32;
            if (wjjwl3mht == null) {
            }
            if (wjjwl3mht != null) {
            }
        }
    }

    public static final cEBNEpWZV J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        cEBNEpWZV cebnepwzv = vobnba4s1 instanceof cEBNEpWZV ? (cEBNEpWZV) vobnba4s1 : null;
        if (cebnepwzv != null) {
            return cebnepwzv;
        }
        throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", YGTdT21e3.q3BipwRCk(vobnba4s1.getClass())));
    }

    public static final void Puu3Rhg4F(Way959ade way959ade, Way959ade way959ade2) {
        try {
            AIDP2j9pY.q3BipwRCk(idpM54xlp.PSTqBLTET(way959ade), qih4lW99W.q3BipwRCk, null);
        } catch (Throwable th) {
            ((Y371ZqMzx) way959ade2).Bhmn1KIah(new qlt0VySXJ(th));
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (((con.I5LF8ecws) r5).tGV7Q6urW(r2, r0) == r1) goto L_0x0072;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Object dIocxURUo(Sm35UxCQt sm35UxCQt, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        wspkCQZVz wspkcqzvz;
        Object obj;
        int i;
        IXMg0nBBI iXMg0nBBI;
        kkcQgCx5G kkcqgcx5g2;
        IXMg0nBBI iXMg0nBBI2;
        E6zfdjIq2 e6zfdjIq2;
        RG2GI7LDp e;
        if (way959ade instanceof wspkCQZVz) {
            wspkcqzvz = (wspkCQZVz) way959ade;
            int i2 = wspkcqzvz.Eeka1udhb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wspkcqzvz.Eeka1udhb = i2 - Integer.MIN_VALUE;
                Object obj2 = wspkcqzvz.qVUwofr5s;
                obj = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = wspkcqzvz.Eeka1udhb;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj2);
                    iXMg0nBBI2 = new IXMg0nBBI();
                    iXMg0nBBI2.CBQ5d1kRq = rhiWXx8NP.q3BipwRCk;
                    E6zfdjIq2 e6zfdjIq22 = new E6zfdjIq2(kkcqgcx5g, iXMg0nBBI2);
                    try {
                        wspkcqzvz.PSTqBLTET = kkcqgcx5g;
                        wspkcqzvz.MzoOEjc4X = iXMg0nBBI2;
                        wspkcqzvz.ilHKhw3Yw = e6zfdjIq22;
                        wspkcqzvz.Eeka1udhb = 1;
                    } catch (RG2GI7LDp e2) {
                        e = e2;
                        e6zfdjIq2 = e6zfdjIq22;
                    }
                } else if (i == 1) {
                    e6zfdjIq2 = (E6zfdjIq2) wspkcqzvz.ilHKhw3Yw;
                    iXMg0nBBI = (IXMg0nBBI) wspkcqzvz.MzoOEjc4X;
                    kkcqgcx5g2 = (kkcQgCx5G) wspkcqzvz.PSTqBLTET;
                    try {
                        anXlDk6fV.IytU16YUK(obj2);
                    } catch (RG2GI7LDp e3) {
                        e = e3;
                        iXMg0nBBI2 = iXMg0nBBI;
                        kkcqgcx5g = kkcqgcx5g2;
                    }
                    obj = iXMg0nBBI.CBQ5d1kRq;
                    if (obj == rhiWXx8NP.q3BipwRCk) {
                        throw new NoSuchElementException(anXlDk6fV.iMyQMM6Qj("Expected at least one element matching the predicate ", kkcqgcx5g2));
                    }
                    return obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (e.CBQ5d1kRq != e6zfdjIq2) {
                    throw e;
                }
                kkcqgcx5g2 = kkcqgcx5g;
                iXMg0nBBI = iXMg0nBBI2;
                obj = iXMg0nBBI.CBQ5d1kRq;
                if (obj == rhiWXx8NP.q3BipwRCk) {
                }
                return obj;
            }
        }
        wspkcqzvz = new wspkCQZVz(way959ade);
        Object obj22 = wspkcqzvz.qVUwofr5s;
        obj = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = wspkcqzvz.Eeka1udhb;
        if (i != 0) {
        }
        if (e.CBQ5d1kRq != e6zfdjIq2) {
        }
        kkcqgcx5g2 = kkcqgcx5g;
        iXMg0nBBI = iXMg0nBBI2;
        obj = iXMg0nBBI.CBQ5d1kRq;
        if (obj == rhiWXx8NP.q3BipwRCk) {
        }
        return obj;
    }

    public static final void iiGwOFFnr(cVJORDUgo cvjordugo, Way959ade way959ade, boolean z) {
        Object obj;
        Object Puu3Rhg4F = cvjordugo.Puu3Rhg4F();
        Throwable dIocxURUo = cvjordugo.dIocxURUo(Puu3Rhg4F);
        if (dIocxURUo != null) {
            obj = new qlt0VySXJ(dIocxURUo);
        } else {
            obj = cvjordugo.iiGwOFFnr(Puu3Rhg4F);
        }
        if (z) {
            c27z9OHjq c27z9ohjq = (c27z9OHjq) way959ade;
            Way959ade way959ade2 = c27z9ohjq.MzoOEjc4X;
            Object obj2 = c27z9ohjq.qVUwofr5s;
            bu5cjmae6 kCA6Zs9sL = way959ade2.kCA6Zs9sL();
            Object J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(kCA6Zs9sL, obj2);
            oDbW63V52 J4Ux7ym322 = J4Ux7ym32 != cclHSBzpG.q3BipwRCk ? MfTZnip0T.J4Ux7ym32(way959ade2, kCA6Zs9sL, J4Ux7ym32) : null;
            try {
                c27z9ohjq.MzoOEjc4X.Bhmn1KIah(obj);
            } finally {
                if (J4Ux7ym322 == null || J4Ux7ym322.QSbMsHU5X()) {
                    cclHSBzpG.q3BipwRCk(kCA6Zs9sL, J4Ux7ym32);
                }
            }
        } else {
            way959ade.Bhmn1KIah(obj);
        }
    }

    public static final boolean kCA6Zs9sL(int i) {
        return i == 1 || i == 2;
    }

    public static DpXbxvzXm q3BipwRCk(int i, n5fKsru0Y n5fksru0y, PmanMZxiM pmanMZxiM, int i2) {
        n5fKsru0Y n5fksru0y2 = n5fKsru0Y.SUSPEND;
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        n5fKsru0Y n5fksru0y3 = (i2 & 2) != 0 ? n5fksru0y2 : null;
        int i3 = 1;
        if (i == -2) {
            if (n5fksru0y3 == n5fksru0y2) {
                Objects.requireNonNull(DpXbxvzXm.q3BipwRCk);
                i3 = JZh2lPhZo.J4Ux7ym32;
            }
            return new yd8TRguSG(i3, n5fksru0y3, null);
        } else if (i == -1) {
            if (n5fksru0y3 == n5fksru0y2) {
                z = true;
            }
            if (z) {
                return new Jbo7jfKH7(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i == 0) {
            return n5fksru0y3 == n5fksru0y2 ? new t9VPEFyA1(null) : new yd8TRguSG(1, n5fksru0y3, null);
        } else {
            if (i != Integer.MAX_VALUE) {
                return (i == 1 && n5fksru0y3 == n5fKsru0Y.DROP_OLDEST) ? new Jbo7jfKH7(null) : new yd8TRguSG(i, n5fksru0y3, null);
            }
            return new CmrPzG2TC(null);
        }
    }

    public static void yWvV4ePLl(kkcQgCx5G kkcqgcx5g, Object obj, Way959ade way959ade, PmanMZxiM pmanMZxiM, int i) {
        try {
            AIDP2j9pY.q3BipwRCk(idpM54xlp.PSTqBLTET(idpM54xlp.dIocxURUo(kkcqgcx5g, obj, way959ade)), qih4lW99W.q3BipwRCk, null);
        } catch (Throwable th) {
            way959ade.Bhmn1KIah(new qlt0VySXJ(th));
            throw th;
        }
    }
}
