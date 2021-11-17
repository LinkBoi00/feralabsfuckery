package con;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class VD1E5Z441 implements nBnrGO77H {
    public final float J4Ux7ym32;
    public final boolean q3BipwRCk;

    public VD1E5Z441(boolean z, float f) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = f;
    }

    public final int GPLPRo6go(List list, int i, kkcQgCx5G kkcqgcx5g) {
        HqmYLYbvB hqmYLYbvB;
        Object obj;
        Object obj2;
        Object obj3;
        for (Object obj4 : list) {
            if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj4), "TextField")) {
                int intValue = ((Number) kkcqgcx5g.WaUP0CF08(obj4, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    hqmYLYbvB = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj), "Trailing")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB2 = (HqmYLYbvB) obj;
                int intValue2 = hqmYLYbvB2 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB2, Integer.valueOf(i))).intValue();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj2), "Trailing")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB3 = (HqmYLYbvB) obj2;
                int intValue3 = hqmYLYbvB3 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB3, Integer.valueOf(i))).intValue();
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj3), "Leading")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB4 = (HqmYLYbvB) obj3;
                int intValue4 = hqmYLYbvB4 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB4, Integer.valueOf(i))).intValue();
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) next), "Hint")) {
                        hqmYLYbvB = next;
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB5 = hqmYLYbvB;
                return TCGRWVYXO.dIocxURUo(intValue4, intValue3, intValue, intValue2, hqmYLYbvB5 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB5, Integer.valueOf(i))).intValue(), TCGRWVYXO.dIocxURUo);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // con.nBnrGO77H
    public aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        Object obj;
        Object obj2;
        n2gATecRC n2gatecrc;
        n2gATecRC n2gatecrc2;
        Object obj3;
        int i;
        Object obj4;
        float f = o1knaFTwA.q3BipwRCk;
        int iiGwOFFnr = fRJidynr8.iiGwOFFnr(o1knaFTwA.tGV7Q6urW);
        float f2 = TCGRWVYXO.q3BipwRCk;
        int iiGwOFFnr2 = fRJidynr8.iiGwOFFnr(TCGRWVYXO.q3BipwRCk);
        int iiGwOFFnr3 = fRJidynr8.iiGwOFFnr(TCGRWVYXO.J4Ux7ym32);
        int iiGwOFFnr4 = fRJidynr8.iiGwOFFnr(TCGRWVYXO.tGV7Q6urW);
        long q3BipwRCk = K5PjwoFCN.q3BipwRCk(j, 0, 0, 0, 0, 10);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v((hKxHUWEcH) obj), "Leading")) {
                break;
            }
        }
        hKxHUWEcH hkxhuwech = (hKxHUWEcH) obj;
        n2gATecRC dIocxURUo = hkxhuwech == null ? null : hkxhuwech.dIocxURUo(q3BipwRCk);
        boolean z = false;
        int dIocxURUo2 = o1knaFTwA.dIocxURUo(dIocxURUo) + 0;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v((hKxHUWEcH) obj2), "Trailing")) {
                break;
            }
        }
        hKxHUWEcH hkxhuwech2 = (hKxHUWEcH) obj2;
        if (hkxhuwech2 == null) {
            n2gatecrc = dIocxURUo;
            n2gatecrc2 = null;
        } else {
            n2gatecrc = dIocxURUo;
            n2gatecrc2 = hkxhuwech2.dIocxURUo(dnBSj5uJN.dfpT1j18n(q3BipwRCk, -dIocxURUo2, 0));
        }
        int i2 = -iiGwOFFnr3;
        int i3 = -(o1knaFTwA.dIocxURUo(n2gatecrc2) + dIocxURUo2);
        long dfpT1j18n = dnBSj5uJN.dfpT1j18n(q3BipwRCk, i3, i2);
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v((hKxHUWEcH) obj3), "Label")) {
                break;
            }
        }
        hKxHUWEcH hkxhuwech3 = (hKxHUWEcH) obj3;
        n2gATecRC dIocxURUo3 = hkxhuwech3 == null ? null : hkxhuwech3.dIocxURUo(dfpT1j18n);
        if (dIocxURUo3 == null) {
            i = 0;
        } else {
            i = dIocxURUo3.i8XZMQc6Z(gqrMNsZhs.J4Ux7ym32);
            if (i == Integer.MIN_VALUE) {
                i = dIocxURUo3.kmSgne1rO;
            }
        }
        int max = Math.max(i, iiGwOFFnr2);
        long dfpT1j18n2 = dnBSj5uJN.dfpT1j18n(K5PjwoFCN.q3BipwRCk(j, 0, 0, 0, 0, 11), i3, dIocxURUo3 != null ? (i2 - iiGwOFFnr4) - max : (-iiGwOFFnr) * 2);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            hKxHUWEcH hkxhuwech4 = (hKxHUWEcH) it4.next();
            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v(hkxhuwech4), "TextField")) {
                n2gATecRC dIocxURUo4 = hkxhuwech4.dIocxURUo(dfpT1j18n2);
                long q3BipwRCk2 = K5PjwoFCN.q3BipwRCk(dfpT1j18n2, 0, 0, 0, 0, 14);
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it5.next();
                    if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v((hKxHUWEcH) obj4), "Hint")) {
                        break;
                    }
                }
                hKxHUWEcH hkxhuwech5 = (hKxHUWEcH) obj4;
                n2gATecRC dIocxURUo5 = hkxhuwech5 == null ? null : hkxhuwech5.dIocxURUo(q3BipwRCk2);
                int dIocxURUo6 = TCGRWVYXO.dIocxURUo(o1knaFTwA.dIocxURUo(n2gatecrc), o1knaFTwA.dIocxURUo(n2gatecrc2), dIocxURUo4.CBQ5d1kRq, o1knaFTwA.dIocxURUo(dIocxURUo3), o1knaFTwA.dIocxURUo(dIocxURUo5), j);
                int i4 = dIocxURUo4.kmSgne1rO;
                if (dIocxURUo3 != null) {
                    z = true;
                }
                int tGV7Q6urW = TCGRWVYXO.tGV7Q6urW(i4, z, max, o1knaFTwA.tGV7Q6urW(n2gatecrc), o1knaFTwA.tGV7Q6urW(n2gatecrc2), o1knaFTwA.tGV7Q6urW(dIocxURUo5), j, fRJidynr8.getDensity());
                return fRJidynr8.nlGCs0NZs(dIocxURUo6, tGV7Q6urW, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new FZqzEHbmq(dIocxURUo3, iiGwOFFnr2, i, dIocxURUo6, tGV7Q6urW, dIocxURUo4, dIocxURUo5, n2gatecrc, n2gatecrc2, this, max, iiGwOFFnr4, fRJidynr8));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return iiGwOFFnr(kaIKYh6OP, list, i, rK9K320Ix.Eeka1udhb);
    }

    public final int iiGwOFFnr(KaIKYh6OP kaIKYh6OP, List list, int i, kkcQgCx5G kkcqgcx5g) {
        HqmYLYbvB hqmYLYbvB;
        Object obj;
        Object obj2;
        Object obj3;
        for (Object obj4 : list) {
            if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj4), "TextField")) {
                int intValue = ((Number) kkcqgcx5g.WaUP0CF08(obj4, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    hqmYLYbvB = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj), "Trailing")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB2 = (HqmYLYbvB) obj;
                int intValue2 = hqmYLYbvB2 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB2, Integer.valueOf(i))).intValue();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj2), "Trailing")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB3 = (HqmYLYbvB) obj2;
                int intValue3 = hqmYLYbvB3 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB3, Integer.valueOf(i))).intValue();
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) obj3), "Leading")) {
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB4 = (HqmYLYbvB) obj3;
                int intValue4 = hqmYLYbvB4 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB4, Integer.valueOf(i))).intValue();
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (anXlDk6fV.tGV7Q6urW(TCGRWVYXO.kCA6Zs9sL((HqmYLYbvB) next), "Hint")) {
                        hqmYLYbvB = next;
                        break;
                    }
                }
                HqmYLYbvB hqmYLYbvB5 = hqmYLYbvB;
                return TCGRWVYXO.tGV7Q6urW(intValue, intValue2 != 0, intValue2, intValue4, intValue3, hqmYLYbvB5 == null ? 0 : ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB5, Integer.valueOf(i))).intValue(), TCGRWVYXO.dIocxURUo, kaIKYh6OP.getDensity());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return iiGwOFFnr(kaIKYh6OP, list, i, ZUnPHIUWr.Eeka1udhb);
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return GPLPRo6go(list, i, pSdrExTbX.ixWaw2akD);
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return GPLPRo6go(list, i, ncKm8DzZ7.ixWaw2akD);
    }
}
