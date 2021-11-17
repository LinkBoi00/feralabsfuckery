package con;

import android.view.accessibility.AccessibilityEvent;
import androidx.activity.ComponentActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public final /* synthetic */ class UoUKJhr5d implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object kmSgne1rO;

    public /* synthetic */ UoUKJhr5d(ComponentActivity componentActivity) {
        this.kmSgne1rO = componentActivity;
    }

    public /* synthetic */ UoUKJhr5d(LCXryTULd lCXryTULd) {
        this.kmSgne1rO = lCXryTULd;
    }

    public /* synthetic */ UoUKJhr5d(R30OeZHHv r30OeZHHv) {
        this.kmSgne1rO = r30OeZHHv;
    }

    public /* synthetic */ UoUKJhr5d(Tpuv1V0a9 tpuv1V0a9) {
        this.kmSgne1rO = tpuv1V0a9;
    }

    public /* synthetic */ UoUKJhr5d(FilePickerActivity filePickerActivity) {
        this.kmSgne1rO = filePickerActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x046d, code lost:
        if (r2.J4Ux7ym32 != null) goto L_0x0476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0474, code lost:
        if (r2.J4Ux7ym32 == null) goto L_0x0476;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [con.Tpuv1V0a9] */
    /* JADX WARN: Type inference failed for: r2v116, types: [android.view.accessibility.AccessibilityEvent] */
    /* JADX WARN: Type inference failed for: r2v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v46, types: [con.joIJ4ANvK] */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Unknown variable types count: 5 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        File file;
        String str;
        or5nbo9ku or5nbo9ku;
        String str2;
        or5nbo9ku or5nbo9ku2;
        boolean z;
        SHlGWJTIu sHlGWJTIu;
        int i;
        or5nbo9ku or5nbo9ku3;
        int i2;
        Of4EROl6B of4EROl6B;
        Integer num;
        int i3;
        int i4;
        boolean z2;
        String str3;
        Of4EROl6B of4EROl6B2;
        int i5;
        switch (this.CBQ5d1kRq) {
            case 0:
                ((ComponentActivity) this.kmSgne1rO).invalidateOptionsMenu();
                return;
            case 1:
                R30OeZHHv.m0setRippleState$lambda2((R30OeZHHv) this.kmSgne1rO);
                return;
            case 2:
                ?? r1 = (Tpuv1V0a9) this.kmSgne1rO;
                r1.qFBXIgpia(r1.dIocxURUo.getSemanticsOwner().q3BipwRCk(), r1.RG6kpfv3v);
                Map MzoOEjc4X = r1.MzoOEjc4X();
                ArrayList arrayList = new ArrayList(r1.WaUP0CF08);
                r1.WaUP0CF08.clear();
                Iterator it = MzoOEjc4X.keySet().iterator();
                while (true) {
                    int i6 = 0;
                    List list = null;
                    if (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        Of4EROl6B of4EROl6B3 = (Of4EROl6B) r1.dXrmkklc8.get(Integer.valueOf(intValue));
                        if (of4EROl6B3 != null) {
                            BIRL6IXtO bIRL6IXtO = (BIRL6IXtO) MzoOEjc4X.get(Integer.valueOf(intValue));
                            if (bIRL6IXtO == null) {
                                or5nbo9ku2 = null;
                            } else {
                                or5nbo9ku2 = bIRL6IXtO.q3BipwRCk;
                            }
                            Iterator it2 = or5nbo9ku2.kCA6Zs9sL.iterator();
                            boolean z3 = false;
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Object key = entry.getKey();
                                VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
                                SHlGWJTIu sHlGWJTIu2 = VSVuhz7Ow.Bhmn1KIah;
                                if (anXlDk6fV.tGV7Q6urW(key, sHlGWJTIu2) || anXlDk6fV.tGV7Q6urW(entry.getKey(), VSVuhz7Ow.PSTqBLTET)) {
                                    u1Gs6N2OQ sk5s77z6Q = p62TZmTyO.sk5s77z6Q(arrayList, intValue);
                                    if (sk5s77z6Q != null) {
                                        i = i6;
                                        sHlGWJTIu = sHlGWJTIu2;
                                    } else {
                                        sHlGWJTIu = sHlGWJTIu2;
                                        sk5s77z6Q = new u1Gs6N2OQ(intValue, r1.WaUP0CF08, null, null, null, null);
                                        i = 1;
                                    }
                                    r1.WaUP0CF08.add(sk5s77z6Q);
                                } else {
                                    i = i6;
                                    sHlGWJTIu = sHlGWJTIu2;
                                }
                                if (i != 0 || !anXlDk6fV.tGV7Q6urW(entry.getValue(), xP6F5SR9v.Bhmn1KIah(of4EROl6B3.q3BipwRCk, (SHlGWJTIu) entry.getKey()))) {
                                    SHlGWJTIu sHlGWJTIu3 = (SHlGWJTIu) entry.getKey();
                                    SHlGWJTIu sHlGWJTIu4 = VSVuhz7Ow.kCA6Zs9sL;
                                    if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, sHlGWJTIu4)) {
                                        Object value = entry.getValue();
                                        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
                                        String str4 = (String) value;
                                        if (of4EROl6B3.q3BipwRCk.CBQ5d1kRq.containsKey(sHlGWJTIu4)) {
                                            r1.cAwN510t2(intValue, 8, str4);
                                        }
                                    } else if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.tGV7Q6urW) ? true : anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.WaUP0CF08)) {
                                        r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, 64, list);
                                        r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, Integer.valueOf(i6), list);
                                    } else {
                                        if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.dIocxURUo)) {
                                            r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, 64, list);
                                            i3 = r1.WaUP0CF08(intValue);
                                            num = Integer.valueOf(i6);
                                            or5nbo9ku3 = or5nbo9ku2;
                                            i2 = intValue;
                                            of4EROl6B = of4EROl6B3;
                                        } else {
                                            SHlGWJTIu sHlGWJTIu5 = VSVuhz7Ow.sk5s77z6Q;
                                            if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, sHlGWJTIu5)) {
                                                qDffvYFss qdffvyfss = (qDffvYFss) xP6F5SR9v.Bhmn1KIah(or5nbo9ku2.iiGwOFFnr(), VSVuhz7Ow.ilHKhw3Yw);
                                                ksLrMHgEz kslrmhgez = qDffvYFss.J4Ux7ym32;
                                                ksLrMHgEz kslrmhgez2 = qDffvYFss.J4Ux7ym32;
                                                if (qdffvyfss == null) {
                                                    i5 = i6;
                                                } else {
                                                    i5 = qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 4);
                                                }
                                                if (i5 == 0) {
                                                    r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, 64, list);
                                                } else if (anXlDk6fV.tGV7Q6urW(xP6F5SR9v.Bhmn1KIah(or5nbo9ku2.iiGwOFFnr(), sHlGWJTIu5), Boolean.TRUE)) {
                                                    ?? CBQ5d1kRq = r1.CBQ5d1kRq(r1.WaUP0CF08(intValue), 4);
                                                    or5nbo9ku or5nbo9ku4 = new or5nbo9ku(or5nbo9ku2.q3BipwRCk, true);
                                                    List list2 = (List) xP6F5SR9v.Bhmn1KIah(or5nbo9ku4.iiGwOFFnr(), VSVuhz7Ow.J4Ux7ym32);
                                                    String ixWaw2akD = list2 == null ? list : p62TZmTyO.ixWaw2akD(list2, ",", null, null, 0, null, null, 62);
                                                    List list3 = (List) xP6F5SR9v.Bhmn1KIah(or5nbo9ku4.iiGwOFFnr(), VSVuhz7Ow.Eeka1udhb);
                                                    Object ixWaw2akD2 = list3 == null ? list : p62TZmTyO.ixWaw2akD(list3, ",", null, null, 0, null, null, 62);
                                                    if (ixWaw2akD != 0) {
                                                        CBQ5d1kRq.setContentDescription(ixWaw2akD);
                                                    }
                                                    if (ixWaw2akD2 != null) {
                                                        CBQ5d1kRq.getText().add(ixWaw2akD2);
                                                    }
                                                    r1.i8XZMQc6Z(CBQ5d1kRq);
                                                }
                                                r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, Integer.valueOf(i6), list);
                                            } else if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.J4Ux7ym32)) {
                                                int WaUP0CF08 = r1.WaUP0CF08(intValue);
                                                Object value2 = entry.getValue();
                                                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                r1.dfpT1j18n(WaUP0CF08, 2048, 4, (List) value2);
                                            } else {
                                                String str5 = "";
                                                if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.dXrmkklc8)) {
                                                    ogG45sslV ogg45sslv = or5nbo9ku2.kCA6Zs9sL;
                                                    JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
                                                    if (ogg45sslv.J4Ux7ym32(JCsIEQgIX.yWvV4ePLl)) {
                                                        CharSequence qVUwofr5s = r1.qVUwofr5s(of4EROl6B3.q3BipwRCk);
                                                        if (qVUwofr5s == null) {
                                                            qVUwofr5s = str5;
                                                        }
                                                        ?? qVUwofr5s2 = r1.qVUwofr5s(or5nbo9ku2.kCA6Zs9sL);
                                                        if (qVUwofr5s2 != 0) {
                                                            str5 = qVUwofr5s2;
                                                        }
                                                        int length = qVUwofr5s.length();
                                                        int length2 = str5.length();
                                                        int i7 = length > length2 ? length2 : length;
                                                        while (i6 < i7 && qVUwofr5s.charAt(i6) == str5.charAt(i6)) {
                                                            i6++;
                                                        }
                                                        int i8 = 0;
                                                        while (true) {
                                                            if (i8 < i7 - i6) {
                                                                of4EROl6B2 = of4EROl6B3;
                                                                if (qVUwofr5s.charAt((length - 1) - i8) == str5.charAt((length2 - 1) - i8)) {
                                                                    i8++;
                                                                    of4EROl6B3 = of4EROl6B2;
                                                                }
                                                            } else {
                                                                of4EROl6B2 = of4EROl6B3;
                                                            }
                                                        }
                                                        AccessibilityEvent CBQ5d1kRq2 = r1.CBQ5d1kRq(r1.WaUP0CF08(intValue), 16);
                                                        CBQ5d1kRq2.setFromIndex(i6);
                                                        CBQ5d1kRq2.setRemovedCount((length - i8) - i6);
                                                        CBQ5d1kRq2.setAddedCount((length2 - i8) - i6);
                                                        CBQ5d1kRq2.setBeforeText(qVUwofr5s);
                                                        CBQ5d1kRq2.getText().add(r1.mUqPm6GBh(str5, 100000));
                                                        r1.i8XZMQc6Z(CBQ5d1kRq2);
                                                        or5nbo9ku3 = or5nbo9ku2;
                                                        i2 = intValue;
                                                        of4EROl6B = of4EROl6B2;
                                                        of4EROl6B3 = of4EROl6B;
                                                        intValue = i2;
                                                        or5nbo9ku2 = or5nbo9ku3;
                                                        i6 = 0;
                                                        list = null;
                                                    } else {
                                                        i3 = r1.WaUP0CF08(intValue);
                                                        i4 = 2;
                                                        or5nbo9ku3 = or5nbo9ku2;
                                                        i2 = intValue;
                                                        of4EROl6B = of4EROl6B3;
                                                    }
                                                } else {
                                                    SHlGWJTIu sHlGWJTIu6 = VSVuhz7Ow.RG6kpfv3v;
                                                    if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, sHlGWJTIu6)) {
                                                        joIJ4ANvK qVUwofr5s3 = r1.qVUwofr5s(or5nbo9ku2.kCA6Zs9sL);
                                                        if (!(qVUwofr5s3 == null || (str3 = qVUwofr5s3.CBQ5d1kRq) == null)) {
                                                            str5 = str3;
                                                        }
                                                        long j = ((czCYotiRn) or5nbo9ku2.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu6)).q3BipwRCk;
                                                        or5nbo9ku3 = or5nbo9ku2;
                                                        i2 = intValue;
                                                        r1.i8XZMQc6Z(r1.kmSgne1rO(r1.WaUP0CF08(intValue), Integer.valueOf(czCYotiRn.yWvV4ePLl(j)), Integer.valueOf(czCYotiRn.dIocxURUo(j)), Integer.valueOf(str5.length()), (String) r1.mUqPm6GBh(str5, 100000)));
                                                        r1.IytU16YUK(or5nbo9ku3.iiGwOFFnr);
                                                        of4EROl6B = of4EROl6B3;
                                                    } else {
                                                        or5nbo9ku3 = or5nbo9ku2;
                                                        i2 = intValue;
                                                        of4EROl6B = of4EROl6B3;
                                                        if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, sHlGWJTIu) ? true : anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.PSTqBLTET)) {
                                                            r1.dXrmkklc8(or5nbo9ku3.GPLPRo6go);
                                                            u1Gs6N2OQ sk5s77z6Q2 = p62TZmTyO.sk5s77z6Q(r1.WaUP0CF08, i2);
                                                            sk5s77z6Q2.MzoOEjc4X = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(or5nbo9ku3.kCA6Zs9sL, sHlGWJTIu);
                                                            sk5s77z6Q2.ilHKhw3Yw = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(or5nbo9ku3.kCA6Zs9sL, VSVuhz7Ow.PSTqBLTET);
                                                            r1.CpG0imbht(sk5s77z6Q2);
                                                        } else if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, VSVuhz7Ow.CBQ5d1kRq)) {
                                                            Object value3 = entry.getValue();
                                                            Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                            if (((Boolean) value3).booleanValue()) {
                                                                r1.i8XZMQc6Z(r1.CBQ5d1kRq(r1.WaUP0CF08(or5nbo9ku3.iiGwOFFnr), 8));
                                                            }
                                                            i3 = r1.WaUP0CF08(or5nbo9ku3.iiGwOFFnr);
                                                            i4 = 0;
                                                        } else {
                                                            JCsIEQgIX jCsIEQgIX2 = JCsIEQgIX.q3BipwRCk;
                                                            SHlGWJTIu sHlGWJTIu7 = JCsIEQgIX.MzoOEjc4X;
                                                            if (anXlDk6fV.tGV7Q6urW(sHlGWJTIu3, sHlGWJTIu7)) {
                                                                List list4 = (List) or5nbo9ku3.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu7);
                                                                List list5 = (List) xP6F5SR9v.Bhmn1KIah(of4EROl6B.q3BipwRCk, sHlGWJTIu7);
                                                                if (list5 != null) {
                                                                    ?? linkedHashSet = new LinkedHashSet();
                                                                    if (list4.size() - 1 < 0) {
                                                                        ?? linkedHashSet2 = new LinkedHashSet();
                                                                        if (list5.size() - 1 < 0) {
                                                                            if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                z3 = false;
                                                                            }
                                                                            z3 = true;
                                                                        } else {
                                                                            K6PL0z3I0.q3BipwRCk(list5.get(0));
                                                                            Objects.requireNonNull(null);
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        K6PL0z3I0.q3BipwRCk(list4.get(0));
                                                                        Objects.requireNonNull(null);
                                                                        throw null;
                                                                    }
                                                                } else if (!list4.isEmpty()) {
                                                                    of4EROl6B3 = of4EROl6B;
                                                                    intValue = i2;
                                                                    z3 = true;
                                                                }
                                                            } else {
                                                                if (entry.getValue() instanceof ngczBF8du) {
                                                                    Object value4 = entry.getValue();
                                                                    Objects.requireNonNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                    ngczBF8du ngczbf8du = (ngczBF8du) value4;
                                                                    Object Bhmn1KIah = xP6F5SR9v.Bhmn1KIah(of4EROl6B.q3BipwRCk, (SHlGWJTIu) entry.getKey());
                                                                    if (ngczbf8du != Bhmn1KIah) {
                                                                        if (Bhmn1KIah instanceof ngczBF8du) {
                                                                            ngczBF8du ngczbf8du2 = (ngczBF8du) Bhmn1KIah;
                                                                            if (anXlDk6fV.tGV7Q6urW(ngczbf8du.q3BipwRCk, ngczbf8du2.q3BipwRCk)) {
                                                                                eEwksJAjd eewksjajd = ngczbf8du.J4Ux7ym32;
                                                                                if (eewksjajd == null) {
                                                                                    break;
                                                                                }
                                                                                if (eewksjajd != null) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        z2 = false;
                                                                        z3 = !z2;
                                                                    }
                                                                    z2 = true;
                                                                    z3 = !z2;
                                                                }
                                                                z3 = true;
                                                            }
                                                            or5nbo9ku2 = or5nbo9ku3;
                                                            i6 = 0;
                                                            list = null;
                                                        }
                                                    }
                                                    of4EROl6B3 = of4EROl6B;
                                                    intValue = i2;
                                                    or5nbo9ku2 = or5nbo9ku3;
                                                    i6 = 0;
                                                    list = null;
                                                }
                                                num = Integer.valueOf(i4);
                                            }
                                            or5nbo9ku3 = or5nbo9ku2;
                                            of4EROl6B = of4EROl6B3;
                                            i2 = intValue;
                                            of4EROl6B3 = of4EROl6B;
                                            intValue = i2;
                                            or5nbo9ku2 = or5nbo9ku3;
                                            i6 = 0;
                                            list = null;
                                        }
                                        r1.dfpT1j18n(i3, 2048, num, null);
                                        of4EROl6B3 = of4EROl6B;
                                        intValue = i2;
                                        or5nbo9ku2 = or5nbo9ku3;
                                        i6 = 0;
                                        list = null;
                                    }
                                }
                                or5nbo9ku3 = or5nbo9ku2;
                                of4EROl6B = of4EROl6B3;
                                i2 = intValue;
                                of4EROl6B3 = of4EROl6B;
                                intValue = i2;
                                or5nbo9ku2 = or5nbo9ku3;
                                i6 = 0;
                                list = null;
                            }
                            if (!z3) {
                                Iterator it3 = of4EROl6B3.q3BipwRCk.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z = false;
                                    } else if (!or5nbo9ku2.iiGwOFFnr().J4Ux7ym32((SHlGWJTIu) ((Map.Entry) it3.next()).getKey())) {
                                        z = true;
                                    }
                                }
                                z3 = z;
                            }
                            if (z3) {
                                r1.dfpT1j18n(r1.WaUP0CF08(intValue), 2048, 0, null);
                            }
                        }
                    } else {
                        Iterator it4 = r1.Eeka1udhb.iterator();
                        while (it4.hasNext()) {
                            Integer num2 = (Integer) it4.next();
                            BIRL6IXtO bIRL6IXtO2 = (BIRL6IXtO) r1.MzoOEjc4X().get(num2);
                            if (bIRL6IXtO2 == null) {
                                or5nbo9ku = null;
                            } else {
                                or5nbo9ku = bIRL6IXtO2.q3BipwRCk;
                            }
                            if (or5nbo9ku != null) {
                                ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
                                VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
                                if (!iiGwOFFnr.CBQ5d1kRq.containsKey(VSVuhz7Ow.kCA6Zs9sL)) {
                                }
                            }
                            r1.Eeka1udhb.remove(num2);
                            int intValue2 = num2.intValue();
                            Of4EROl6B of4EROl6B4 = (Of4EROl6B) r1.dXrmkklc8.get(num2);
                            if (of4EROl6B4 == null) {
                                str2 = null;
                            } else {
                                ogG45sslV ogg45sslv2 = of4EROl6B4.q3BipwRCk;
                                VSVuhz7Ow vSVuhz7Ow3 = VSVuhz7Ow.q3BipwRCk;
                                str2 = (String) xP6F5SR9v.Bhmn1KIah(ogg45sslv2, VSVuhz7Ow.kCA6Zs9sL);
                            }
                            r1.cAwN510t2(intValue2, 32, str2);
                        }
                        r1.dXrmkklc8.clear();
                        for (Map.Entry entry2 : r1.MzoOEjc4X().entrySet()) {
                            ogG45sslV iiGwOFFnr2 = ((BIRL6IXtO) entry2.getValue()).q3BipwRCk.iiGwOFFnr();
                            VSVuhz7Ow vSVuhz7Ow4 = VSVuhz7Ow.q3BipwRCk;
                            SHlGWJTIu sHlGWJTIu8 = VSVuhz7Ow.kCA6Zs9sL;
                            if (iiGwOFFnr2.CBQ5d1kRq.containsKey(sHlGWJTIu8) && r1.Eeka1udhb.add(entry2.getKey())) {
                                r1.cAwN510t2(((Number) entry2.getKey()).intValue(), 16, (String) ((BIRL6IXtO) entry2.getValue()).q3BipwRCk.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu8));
                            }
                            r1.dXrmkklc8.put(entry2.getKey(), new Of4EROl6B(((BIRL6IXtO) entry2.getValue()).q3BipwRCk, r1.MzoOEjc4X()));
                        }
                        r1.RG6kpfv3v = new Of4EROl6B(r1.dIocxURUo.getSemanticsOwner().q3BipwRCk(), r1.MzoOEjc4X());
                        r1.ixWaw2akD = false;
                        return;
                    }
                }
                break;
            case 3:
                LCXryTULd lCXryTULd = (LCXryTULd) this.kmSgne1rO;
                lCXryTULd.J4Ux7ym32();
                ((spFv56w6q) lCXryTULd.vPSbyrYWX).Puu3Rhg4F(Boolean.TRUE);
                return;
            default:
                FilePickerActivity filePickerActivity = (FilePickerActivity) this.kmSgne1rO;
                if (filePickerActivity.o4LF8RkoQ.isEmpty() && filePickerActivity.RG6kpfv3v().tGV7Q6urW) {
                    file = dyvSzXDfa.q3BipwRCk.kCA6Zs9sL();
                } else if (!filePickerActivity.o4LF8RkoQ.isEmpty() || filePickerActivity.RG6kpfv3v().tGV7Q6urW) {
                    file = new File(((xZLHWtbav) wkFJfVmcv.TyB1UUd72(filePickerActivity.o4LF8RkoQ)).J4Ux7ym32);
                } else {
                    file = dyvSzXDfa.q3BipwRCk.kCA6Zs9sL().getParentFile();
                }
                joOFKdxvJ joofkdxvj = dyvSzXDfa.q3BipwRCk;
                ArrayList iiGwOFFnr3 = joofkdxvj.iiGwOFFnr(file);
                ArrayList arrayList2 = filePickerActivity.o4LF8RkoQ;
                if (arrayList2.isEmpty()) {
                    str = file.getPath();
                } else {
                    str = ((xZLHWtbav) wkFJfVmcv.TyB1UUd72(filePickerActivity.o4LF8RkoQ)).J4Ux7ym32;
                }
                filePickerActivity.o4LF8RkoQ = joofkdxvj.GPLPRo6go(arrayList2, str, filePickerActivity);
                filePickerActivity.nlGCs0NZs.post(new NS7vjtAxy(filePickerActivity, iiGwOFFnr3));
                return;
        }
    }
}
