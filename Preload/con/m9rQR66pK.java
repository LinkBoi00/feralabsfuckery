package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class m9rQR66pK implements TZR3Xn1pu {
    public final List J4Ux7ym32;
    public final llWJsfBCK dIocxURUo;
    public final List kCA6Zs9sL;
    public final joIJ4ANvK q3BipwRCk;
    public final llWJsfBCK tGV7Q6urW;

    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0236 A[LOOP:1: B:18:0x009a->B:78:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241 A[EDGE_INSN: B:82:0x0241->B:79:0x0241 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public m9rQR66pK(joIJ4ANvK joij4anvk, GjhoS54Hf gjhoS54Hf, List list, AU29aHa4X aU29aHa4X, C2cgp32t9 c2cgp32t9) {
        String str;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int size;
        Nrdhx1ztZ nrdhx1ztZ;
        int size2;
        List list2;
        m9rQR66pK m9rqr66pk = this;
        joIJ4ANvK joij4anvk2 = joij4anvk;
        m9rqr66pk.q3BipwRCk = joij4anvk2;
        m9rqr66pk.J4Ux7ym32 = list;
        m9rqr66pk.tGV7Q6urW = anXlDk6fV.RG6kpfv3v(3, new yAW7u8Zix(m9rqr66pk, 1));
        int i2 = 0;
        m9rqr66pk.dIocxURUo = anXlDk6fV.RG6kpfv3v(3, new yAW7u8Zix(m9rqr66pk, 0));
        Nrdhx1ztZ tGV7Q6urW = gjhoS54Hf.tGV7Q6urW();
        joIJ4ANvK joij4anvk3 = SXpWpmH9A.q3BipwRCk;
        int length = joij4anvk2.CBQ5d1kRq.length();
        List list3 = joij4anvk2.Bhmn1KIah;
        ArrayList arrayList3 = new ArrayList();
        int size3 = list3.size() - 1;
        int i3 = 0;
        if (size3 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) list3.get(i3);
                Nrdhx1ztZ nrdhx1ztZ2 = (Nrdhx1ztZ) lzuuvzcu0.q3BipwRCk;
                int i6 = lzuuvzcu0.J4Ux7ym32;
                i3 = lzuuvzcu0.tGV7Q6urW;
                if (i6 != i4) {
                    arrayList3.add(new lzuuVzcu0(tGV7Q6urW, i4, i6, ""));
                }
                arrayList3.add(new lzuuVzcu0(tGV7Q6urW.q3BipwRCk(nrdhx1ztZ2), i6, i3, ""));
                if (i5 > size3) {
                    break;
                }
                i4 = i3;
                i3 = i5;
            }
        }
        if (i3 != length) {
            arrayList3.add(new lzuuVzcu0(tGV7Q6urW, i3, length, ""));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new lzuuVzcu0(tGV7Q6urW, 0, 0, ""));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size4 = arrayList3.size() - 1;
        if (size4 >= 0) {
            while (true) {
                int i7 = i2 + 1;
                lzuuVzcu0 lzuuvzcu02 = (lzuuVzcu0) arrayList3.get(i2);
                int i8 = lzuuvzcu02.J4Ux7ym32;
                int i9 = lzuuvzcu02.tGV7Q6urW;
                if (i8 != i9) {
                    String str2 = joij4anvk2.CBQ5d1kRq;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    str = str2.substring(i8, i9);
                } else {
                    str = "";
                }
                if (i8 == i9) {
                    list2 = Dqz1pJHWH.CBQ5d1kRq;
                } else if (i8 != 0 || i9 < joij4anvk2.CBQ5d1kRq.length()) {
                    List list4 = joij4anvk2.kmSgne1rO;
                    ArrayList arrayList5 = new ArrayList(list4.size());
                    int size5 = list4.size() - 1;
                    if (size5 >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj = list4.get(i10);
                            arrayList = arrayList3;
                            lzuuVzcu0 lzuuvzcu03 = (lzuuVzcu0) obj;
                            if (SXpWpmH9A.tGV7Q6urW(i8, i9, lzuuvzcu03.J4Ux7ym32, lzuuvzcu03.tGV7Q6urW)) {
                                arrayList5.add(obj);
                            }
                            if (i11 > size5) {
                                break;
                            }
                            arrayList3 = arrayList;
                            i10 = i11;
                            list4 = list4;
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                    ArrayList arrayList6 = new ArrayList(arrayList5.size());
                    int size6 = arrayList5.size() - 1;
                    if (size6 >= 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            lzuuVzcu0 lzuuvzcu04 = (lzuuVzcu0) arrayList5.get(i12);
                            i = size4;
                            arrayList6.add(new lzuuVzcu0(lzuuvzcu04.q3BipwRCk, cT9gik1zL.kCA6Zs9sL(lzuuvzcu04.J4Ux7ym32, i8, i9) - i8, cT9gik1zL.kCA6Zs9sL(lzuuvzcu04.tGV7Q6urW, i8, i9) - i8, ""));
                            if (i13 > size6) {
                                break;
                            }
                            i12 = i13;
                            arrayList5 = arrayList5;
                            size4 = i;
                        }
                    } else {
                        i = size4;
                    }
                    arrayList2 = arrayList6;
                    Nrdhx1ztZ nrdhx1ztZ3 = (Nrdhx1ztZ) lzuuvzcu02.q3BipwRCk;
                    Nrdhx1ztZ nrdhx1ztZ4 = nrdhx1ztZ3.J4Ux7ym32 != null ? null : nrdhx1ztZ3;
                    GjhoS54Hf gjhoS54Hf2 = new GjhoS54Hf(gjhoS54Hf.dIocxURUo(), gjhoS54Hf.tGV7Q6urW().q3BipwRCk(nrdhx1ztZ4 == null ? new Nrdhx1ztZ(nrdhx1ztZ3.q3BipwRCk, tGV7Q6urW.J4Ux7ym32, nrdhx1ztZ3.tGV7Q6urW, nrdhx1ztZ3.dIocxURUo, null) : nrdhx1ztZ4));
                    List list5 = m9rqr66pk.J4Ux7ym32;
                    int i14 = lzuuvzcu02.J4Ux7ym32;
                    int i15 = lzuuvzcu02.tGV7Q6urW;
                    ArrayList arrayList7 = new ArrayList(list5.size());
                    size = list5.size() - 1;
                    if (size < 0) {
                        int i16 = 0;
                        while (true) {
                            nrdhx1ztZ = tGV7Q6urW;
                            int i17 = i16 + 1;
                            Object obj2 = list5.get(i16);
                            lzuuVzcu0 lzuuvzcu05 = (lzuuVzcu0) obj2;
                            if (SXpWpmH9A.tGV7Q6urW(i14, i15, lzuuvzcu05.J4Ux7ym32, lzuuvzcu05.tGV7Q6urW)) {
                                arrayList7.add(obj2);
                            }
                            if (i17 > size) {
                                break;
                            }
                            i16 = i17;
                            list5 = list5;
                            tGV7Q6urW = nrdhx1ztZ;
                        }
                    } else {
                        nrdhx1ztZ = tGV7Q6urW;
                    }
                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                    size2 = arrayList7.size() - 1;
                    if (size2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            lzuuVzcu0 lzuuvzcu06 = (lzuuVzcu0) arrayList7.get(i18);
                            int i20 = lzuuvzcu06.J4Ux7ym32;
                            if (i14 <= i20 && lzuuvzcu06.tGV7Q6urW <= i15) {
                                arrayList8.add(new lzuuVzcu0(lzuuvzcu06.q3BipwRCk, i20 - i14, lzuuvzcu06.tGV7Q6urW - i14, ""));
                                if (i19 > size2) {
                                    break;
                                }
                                i18 = i19;
                                arrayList7 = arrayList7;
                                i15 = i15;
                            } else {
                                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                            }
                        }
                    }
                    arrayList4.add(new FNRS7AIqa(new AyMB2YALh(str, gjhoS54Hf2, arrayList2, arrayList8, new FeKFMR1ai(null, c2cgp32t9, 1), aU29aHa4X), lzuuvzcu02.J4Ux7ym32, lzuuvzcu02.tGV7Q6urW));
                    size4 = i;
                    if (i7 <= size4) {
                        break;
                    }
                    m9rqr66pk = this;
                    joij4anvk2 = joij4anvk;
                    arrayList3 = arrayList;
                    i2 = i7;
                    tGV7Q6urW = nrdhx1ztZ;
                } else {
                    list2 = joij4anvk2.kmSgne1rO;
                }
                i = size4;
                arrayList = arrayList3;
                arrayList2 = list2;
                Nrdhx1ztZ nrdhx1ztZ32 = (Nrdhx1ztZ) lzuuvzcu02.q3BipwRCk;
                if (nrdhx1ztZ32.J4Ux7ym32 != null) {
                }
                GjhoS54Hf gjhoS54Hf22 = new GjhoS54Hf(gjhoS54Hf.dIocxURUo(), gjhoS54Hf.tGV7Q6urW().q3BipwRCk(nrdhx1ztZ4 == null ? new Nrdhx1ztZ(nrdhx1ztZ32.q3BipwRCk, tGV7Q6urW.J4Ux7ym32, nrdhx1ztZ32.tGV7Q6urW, nrdhx1ztZ32.dIocxURUo, null) : nrdhx1ztZ4));
                List list52 = m9rqr66pk.J4Ux7ym32;
                int i142 = lzuuvzcu02.J4Ux7ym32;
                int i152 = lzuuvzcu02.tGV7Q6urW;
                ArrayList arrayList72 = new ArrayList(list52.size());
                size = list52.size() - 1;
                if (size < 0) {
                }
                ArrayList arrayList82 = new ArrayList(arrayList72.size());
                size2 = arrayList72.size() - 1;
                if (size2 >= 0) {
                }
                arrayList4.add(new FNRS7AIqa(new AyMB2YALh(str, gjhoS54Hf22, arrayList2, arrayList82, new FeKFMR1ai(null, c2cgp32t9, 1), aU29aHa4X), lzuuvzcu02.J4Ux7ym32, lzuuvzcu02.tGV7Q6urW));
                size4 = i;
                if (i7 <= size4) {
                }
            }
        }
        this.kCA6Zs9sL = arrayList4;
    }

    @Override // con.TZR3Xn1pu
    public float J4Ux7ym32() {
        return ((Number) this.dIocxURUo.getValue()).floatValue();
    }

    @Override // con.TZR3Xn1pu
    public float q3BipwRCk() {
        return ((Number) this.tGV7Q6urW.getValue()).floatValue();
    }
}
