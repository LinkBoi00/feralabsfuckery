package con;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class TtT6iPwpR implements nBnrGO77H {
    public final /* synthetic */ float J4Ux7ym32;
    public final /* synthetic */ PmanMZxiM q3BipwRCk;
    public final /* synthetic */ boolean tGV7Q6urW;

    public TtT6iPwpR(PmanMZxiM pmanMZxiM, float f, boolean z) {
        this.q3BipwRCk = pmanMZxiM;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = z;
    }

    @Override // con.nBnrGO77H
    public final aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        Object obj;
        Object obj2;
        n2gATecRC n2gatecrc;
        Object obj3;
        Object obj4;
        float f = o1knaFTwA.q3BipwRCk;
        int iiGwOFFnr = fRJidynr8.iiGwOFFnr(o1knaFTwA.tGV7Q6urW);
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
        int i = 0;
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
            n2gatecrc = null;
        } else {
            n2gatecrc = hkxhuwech2.dIocxURUo(dnBSj5uJN.dfpT1j18n(q3BipwRCk, -dIocxURUo2, 0));
        }
        int i2 = -(o1knaFTwA.dIocxURUo(n2gatecrc) + dIocxURUo2);
        int i3 = -iiGwOFFnr;
        long dfpT1j18n = dnBSj5uJN.dfpT1j18n(q3BipwRCk, i2, i3);
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
        if (dIocxURUo3 != null) {
            this.q3BipwRCk.IytU16YUK(new tbzY8QG6X(gThLCaTO1.J4Ux7ym32((float) dIocxURUo3.CBQ5d1kRq, (float) dIocxURUo3.kmSgne1rO)));
        }
        long q3BipwRCk2 = K5PjwoFCN.q3BipwRCk(dnBSj5uJN.dfpT1j18n(j, i2, i3 - Math.max(o1knaFTwA.tGV7Q6urW(dIocxURUo3) / 2, iiGwOFFnr)), 0, 0, 0, 0, 11);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            hKxHUWEcH hkxhuwech4 = (hKxHUWEcH) it4.next();
            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v(hkxhuwech4), "TextField")) {
                n2gATecRC dIocxURUo4 = hkxhuwech4.dIocxURUo(q3BipwRCk2);
                long q3BipwRCk3 = K5PjwoFCN.q3BipwRCk(q3BipwRCk2, 0, 0, 0, 0, 14);
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
                n2gATecRC dIocxURUo5 = hkxhuwech5 == null ? null : hkxhuwech5.dIocxURUo(q3BipwRCk3);
                int max = Math.max(o1knaFTwA.dIocxURUo(n2gatecrc) + o1knaFTwA.dIocxURUo(dIocxURUo) + Math.max(dIocxURUo4.CBQ5d1kRq, Math.max(o1knaFTwA.dIocxURUo(dIocxURUo3), o1knaFTwA.dIocxURUo(dIocxURUo5))), K5PjwoFCN.vPSbyrYWX(j));
                float density = fRJidynr8.getDensity();
                int max2 = Math.max(dIocxURUo4.kmSgne1rO, o1knaFTwA.tGV7Q6urW(dIocxURUo5));
                float f2 = o1knaFTwA.q3BipwRCk;
                float f3 = o1knaFTwA.tGV7Q6urW * density;
                int max3 = Math.max(K5PjwoFCN.oon79WMrY(j), Math.max(o1knaFTwA.tGV7Q6urW(dIocxURUo), Math.max(o1knaFTwA.tGV7Q6urW(n2gatecrc), D3DEikrvb.Eeka1udhb(Math.max(f3, ((float) o1knaFTwA.tGV7Q6urW(dIocxURUo3)) / 2.0f) + ((float) max2) + f3))));
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    hKxHUWEcH hkxhuwech6 = (hKxHUWEcH) it6.next();
                    if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v(hkxhuwech6), "border")) {
                        int i4 = max != Integer.MAX_VALUE ? max : 0;
                        if (max3 != Integer.MAX_VALUE) {
                            i = max3;
                        }
                        return fRJidynr8.nlGCs0NZs(max, max3, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new M9G76Tcwz(max3, max, dIocxURUo, n2gatecrc, dIocxURUo4, dIocxURUo3, dIocxURUo5, hkxhuwech6.dIocxURUo(dnBSj5uJN.q3BipwRCk(i4, max, i, max3)), this.J4Ux7ym32, this.tGV7Q6urW, fRJidynr8));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.nlGCs0NZs(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.IytU16YUK(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.CpG0imbht(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.AqaWJg0b4(this, kaIKYh6OP, list, i);
    }
}
