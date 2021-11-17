package con;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vFIB0bD5m implements nBnrGO77H {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;
    public final /* synthetic */ Object tGV7Q6urW;

    public vFIB0bD5m(svUKnQBs3 svuknqbs3, BFRsKhrQv bFRsKhrQv) {
        this.J4Ux7ym32 = svuknqbs3;
        this.tGV7Q6urW = bFRsKhrQv;
    }

    @Override // con.nBnrGO77H
    public aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        pZznYi2iw pzznyi2iw;
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        switch (this.q3BipwRCk) {
            case 0:
                icKZ1RJnW ickz1rjnw = ((UwmKmkwV0) this.J4Ux7ym32).q3BipwRCk;
                BFRsKhrQv layoutDirection = fRJidynr8.getLayoutDirection();
                zRlqFnDB5 zrlqfndb5 = ((UwmKmkwV0) this.J4Ux7ym32).iiGwOFFnr;
                pZznYi2iw pzznyi2iw2 = null;
                if (zrlqfndb5 == null) {
                    pzznyi2iw = null;
                } else {
                    pzznyi2iw = zrlqfndb5.q3BipwRCk;
                }
                pZznYi2iw J4Ux7ym32 = ickz1rjnw.J4Ux7ym32(j, layoutDirection, pzznyi2iw);
                Integer valueOf = Integer.valueOf(YWiUMZOtw.tGV7Q6urW(J4Ux7ym32.tGV7Q6urW));
                Integer valueOf2 = Integer.valueOf(YWiUMZOtw.J4Ux7ym32(J4Ux7ym32.tGV7Q6urW));
                int intValue = valueOf.intValue();
                int intValue2 = valueOf2.intValue();
                zRlqFnDB5 zrlqfndb52 = ((UwmKmkwV0) this.J4Ux7ym32).iiGwOFFnr;
                if (zrlqfndb52 != null) {
                    pzznyi2iw2 = zrlqfndb52.q3BipwRCk;
                }
                if (!anXlDk6fV.tGV7Q6urW(pzznyi2iw2, J4Ux7ym32)) {
                    ((UwmKmkwV0) this.J4Ux7ym32).iiGwOFFnr = new zRlqFnDB5(J4Ux7ym32);
                    ((PmanMZxiM) this.tGV7Q6urW).IytU16YUK(J4Ux7ym32);
                }
                return fRJidynr8.nlGCs0NZs(intValue, intValue2, s0tSbdszx.AqaWJg0b4(new n4f84B5OG(gqrMNsZhs.q3BipwRCk, Integer.valueOf(D3DEikrvb.Eeka1udhb(J4Ux7ym32.dIocxURUo))), new n4f84B5OG(gqrMNsZhs.J4Ux7ym32, Integer.valueOf(D3DEikrvb.Eeka1udhb(J4Ux7ym32.kCA6Zs9sL)))), Sw9ZtYnB9.kmSgne1rO);
            case 1:
                String str = (String) this.J4Ux7ym32;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hKxHUWEcH hkxhuwech = (hKxHUWEcH) it.next();
                    if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v(hkxhuwech), str)) {
                        n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(j);
                        int yWvV4ePLl = K5PjwoFCN.yWvV4ePLl(j) - dIocxURUo.CBQ5d1kRq;
                        float f = zx4j6sOyY.q3BipwRCk;
                        int iiGwOFFnr = yWvV4ePLl - fRJidynr8.iiGwOFFnr(zx4j6sOyY.iiGwOFFnr);
                        int vPSbyrYWX = K5PjwoFCN.vPSbyrYWX(j);
                        int i5 = iiGwOFFnr < vPSbyrYWX ? vPSbyrYWX : iiGwOFFnr;
                        String str2 = (String) this.tGV7Q6urW;
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            hKxHUWEcH hkxhuwech2 = (hKxHUWEcH) it2.next();
                            if (anXlDk6fV.tGV7Q6urW(ODug2UCW1.RG6kpfv3v(hkxhuwech2), str2)) {
                                n2gATecRC dIocxURUo2 = hkxhuwech2.dIocxURUo(K5PjwoFCN.q3BipwRCk(j, 0, i5, 0, 0, 9));
                                p65OI4RQQ p65oi4rqq = gqrMNsZhs.q3BipwRCk;
                                int i8XZMQc6Z = dIocxURUo2.i8XZMQc6Z(p65oi4rqq);
                                if (i8XZMQc6Z != Integer.MIN_VALUE) {
                                    int i8XZMQc6Z2 = dIocxURUo2.i8XZMQc6Z(gqrMNsZhs.J4Ux7ym32);
                                    if (i8XZMQc6Z2 != Integer.MIN_VALUE) {
                                        if (i8XZMQc6Z != i8XZMQc6Z2) {
                                            z = false;
                                        }
                                        int yWvV4ePLl2 = K5PjwoFCN.yWvV4ePLl(j) - dIocxURUo.CBQ5d1kRq;
                                        if (z) {
                                            float f2 = zx4j6sOyY.q3BipwRCk;
                                            int max = Math.max(fRJidynr8.iiGwOFFnr(zx4j6sOyY.Puu3Rhg4F), dIocxURUo.kmSgne1rO);
                                            int i6 = (max - dIocxURUo2.kmSgne1rO) / 2;
                                            int i8XZMQc6Z3 = dIocxURUo.i8XZMQc6Z(p65oi4rqq);
                                            if (i8XZMQc6Z3 != Integer.MIN_VALUE) {
                                                i4 = (i8XZMQc6Z + i6) - i8XZMQc6Z3;
                                            }
                                            i3 = max;
                                            i2 = i6;
                                            i = i4;
                                        } else {
                                            float f3 = zx4j6sOyY.q3BipwRCk;
                                            int iiGwOFFnr2 = fRJidynr8.iiGwOFFnr(zx4j6sOyY.q3BipwRCk) - i8XZMQc6Z;
                                            int max2 = Math.max(fRJidynr8.iiGwOFFnr(zx4j6sOyY.yWvV4ePLl), dIocxURUo2.kmSgne1rO + iiGwOFFnr2);
                                            i = (max2 - dIocxURUo.kmSgne1rO) / 2;
                                            i2 = iiGwOFFnr2;
                                            i3 = max2;
                                        }
                                        return fRJidynr8.nlGCs0NZs(K5PjwoFCN.yWvV4ePLl(j), i3, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new lGyEdzj9a(dIocxURUo2, i2, dIocxURUo, yWvV4ePLl2, i));
                                    }
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) this.tGV7Q6urW;
                Objects.requireNonNull((svUKnQBs3) this.J4Ux7ym32);
                return fRJidynr8.nlGCs0NZs(0, 0, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, kIWytMCq1.kmSgne1rO);
        }
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return ODug2UCW1.nlGCs0NZs(this, kaIKYh6OP, list, i);
            case 1:
                return ODug2UCW1.nlGCs0NZs(this, kaIKYh6OP, list, i);
            default:
                return ODug2UCW1.nlGCs0NZs(this, kaIKYh6OP, list, i);
        }
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return ODug2UCW1.IytU16YUK(this, kaIKYh6OP, list, i);
            case 1:
                return ODug2UCW1.IytU16YUK(this, kaIKYh6OP, list, i);
            default:
                return ODug2UCW1.IytU16YUK(this, kaIKYh6OP, list, i);
        }
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                ((UwmKmkwV0) this.J4Ux7ym32).q3BipwRCk.tGV7Q6urW(kaIKYh6OP.getLayoutDirection());
                return (int) ((float) Math.ceil((double) ((UwmKmkwV0) this.J4Ux7ym32).q3BipwRCk.q3BipwRCk().J4Ux7ym32()));
            case 1:
                return ODug2UCW1.CpG0imbht(this, kaIKYh6OP, list, i);
            default:
                return ODug2UCW1.CpG0imbht(this, kaIKYh6OP, list, i);
        }
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return ODug2UCW1.AqaWJg0b4(this, kaIKYh6OP, list, i);
            case 1:
                return ODug2UCW1.AqaWJg0b4(this, kaIKYh6OP, list, i);
            default:
                return ODug2UCW1.AqaWJg0b4(this, kaIKYh6OP, list, i);
        }
    }

    public vFIB0bD5m(UwmKmkwV0 uwmKmkwV0, PmanMZxiM pmanMZxiM) {
        this.J4Ux7ym32 = uwmKmkwV0;
        this.tGV7Q6urW = pmanMZxiM;
    }

    public vFIB0bD5m(String str, String str2) {
        this.J4Ux7ym32 = str;
        this.tGV7Q6urW = str2;
    }
}
