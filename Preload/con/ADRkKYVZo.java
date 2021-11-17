package con;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class ADRkKYVZo implements nBnrGO77H {
    public final Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public ADRkKYVZo(gq2zZKdsH gq2zzkdsh) {
        this.J4Ux7ym32 = gq2zzkdsh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // con.nBnrGO77H
    public aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        n4f84B5OG n4f84b5og;
        vtNW2XFzs vtnw2xfzs;
        Object obj;
        int i;
        int i2;
        int i3 = 1;
        n2gATecRC n2gatecrc = null;
        switch (this.q3BipwRCk) {
            case 0:
                ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hKxHUWEcH) it.next()).dIocxURUo(j));
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i4 = ((n2gATecRC) obj).CBQ5d1kRq;
                    int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(arrayList);
                    if (1 <= CBQ5d1kRq) {
                        int i5 = 1;
                        while (true) {
                            int i6 = i5 + 1;
                            Object obj2 = arrayList.get(i5);
                            int i7 = ((n2gATecRC) obj2).CBQ5d1kRq;
                            if (i4 < i7) {
                                obj = obj2;
                                i4 = i7;
                            }
                            if (i5 != CBQ5d1kRq) {
                                i5 = i6;
                            }
                        }
                    }
                }
                n2gATecRC n2gatecrc2 = (n2gATecRC) obj;
                if (n2gatecrc2 == null) {
                    i = 0;
                } else {
                    i = n2gatecrc2.CBQ5d1kRq;
                }
                if (!arrayList.isEmpty()) {
                    Object obj3 = arrayList.get(0);
                    int i8 = ((n2gATecRC) obj3).kmSgne1rO;
                    int CBQ5d1kRq2 = idpM54xlp.CBQ5d1kRq(arrayList);
                    Object obj4 = obj3;
                    if (1 <= CBQ5d1kRq2) {
                        while (true) {
                            int i9 = i3 + 1;
                            Object obj5 = arrayList.get(i3);
                            int i10 = ((n2gATecRC) obj5).kmSgne1rO;
                            obj3 = obj4;
                            if (i8 < i10) {
                                obj3 = obj5;
                                i8 = i10;
                            }
                            if (i3 != CBQ5d1kRq2) {
                                i3 = i9;
                                obj4 = obj3;
                            }
                        }
                    }
                    n2gatecrc = obj3;
                }
                n2gATecRC n2gatecrc3 = n2gatecrc;
                if (n2gatecrc3 == null) {
                    i2 = 0;
                } else {
                    i2 = n2gatecrc3.kmSgne1rO;
                }
                ((prCJwNx2x) ((gq2zZKdsH) this.J4Ux7ym32).q3BipwRCk).CBQ5d1kRq(new YWiUMZOtw(D3DEikrvb.dIocxURUo(i, i2)));
                return fRJidynr8.nlGCs0NZs(i, i2, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new bvjNsSY6E(arrayList, 0));
            default:
                pZznYi2iw J4Ux7ym32 = ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk.J4Ux7ym32(j, fRJidynr8.getLayoutDirection(), ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.iiGwOFFnr);
                if (!anXlDk6fV.tGV7Q6urW(((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.iiGwOFFnr, J4Ux7ym32)) {
                    ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.tGV7Q6urW.IytU16YUK(J4Ux7ym32);
                    wQYV02pDG wqyv02pdg = (wQYV02pDG) this.J4Ux7ym32;
                    pZznYi2iw pzznyi2iw = wqyv02pdg.CBQ5d1kRq.iiGwOFFnr;
                    if (!(pzznyi2iw == null || anXlDk6fV.tGV7Q6urW(pzznyi2iw.q3BipwRCk.q3BipwRCk, J4Ux7ym32.q3BipwRCk.q3BipwRCk) || (vtnw2xfzs = wqyv02pdg.kmSgne1rO) == null)) {
                        vtnw2xfzs.J4Ux7ym32(wqyv02pdg.CBQ5d1kRq.J4Ux7ym32);
                    }
                }
                ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.iiGwOFFnr = J4Ux7ym32;
                if (list.size() >= J4Ux7ym32.iiGwOFFnr.size()) {
                    List list2 = J4Ux7ym32.iiGwOFFnr;
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size = list2.size() - 1;
                    if (size >= 0) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            bzmJZsHMu bzmjzshmu = (bzmJZsHMu) list2.get(i11);
                            if (bzmjzshmu == null) {
                                n4f84b5og = null;
                            } else {
                                n4f84b5og = new n4f84B5OG(((hKxHUWEcH) list.get(i11)).dIocxURUo(dnBSj5uJN.J4Ux7ym32(0, (int) ((float) Math.floor((double) bzmjzshmu.kCA6Zs9sL())), 0, (int) ((float) Math.floor((double) bzmjzshmu.J4Ux7ym32())), 5)), new ZtJSMDYDl(dnBSj5uJN.tGV7Q6urW(D3DEikrvb.Eeka1udhb(bzmjzshmu.q3BipwRCk), D3DEikrvb.Eeka1udhb(bzmjzshmu.J4Ux7ym32))));
                            }
                            if (n4f84b5og != null) {
                                arrayList2.add(n4f84b5og);
                            }
                            if (i12 <= size) {
                                i11 = i12;
                            }
                        }
                    }
                    return fRJidynr8.nlGCs0NZs(YWiUMZOtw.tGV7Q6urW(J4Ux7ym32.tGV7Q6urW), YWiUMZOtw.J4Ux7ym32(J4Ux7ym32.tGV7Q6urW), s0tSbdszx.AqaWJg0b4(new n4f84B5OG(gqrMNsZhs.q3BipwRCk, Integer.valueOf(D3DEikrvb.Eeka1udhb(J4Ux7ym32.dIocxURUo))), new n4f84B5OG(gqrMNsZhs.J4Ux7ym32, Integer.valueOf(D3DEikrvb.Eeka1udhb(J4Ux7ym32.kCA6Zs9sL)))), new bvjNsSY6E(arrayList2, 2));
                }
                throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                Integer num = (Integer) IFeOgs2Gp.MzoOEjc4X(new CqYXp4s4a(new axHKWsBUm(list), new RKFuOuJae(i)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                icKZ1RJnW ickz1rjnw = ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk;
                long q3BipwRCk = dnBSj5uJN.q3BipwRCk(0, i, 0, Integer.MAX_VALUE);
                BFRsKhrQv layoutDirection = kaIKYh6OP.getLayoutDirection();
                oWhsE8IPp owhse8ipp = icKZ1RJnW.vPSbyrYWX;
                return YWiUMZOtw.J4Ux7ym32(ickz1rjnw.J4Ux7ym32(q3BipwRCk, layoutDirection, null).tGV7Q6urW);
        }
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                Integer num = (Integer) IFeOgs2Gp.MzoOEjc4X(new CqYXp4s4a(new axHKWsBUm(list), new ufrUqYgoW(i, 0)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                icKZ1RJnW ickz1rjnw = ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk;
                long q3BipwRCk = dnBSj5uJN.q3BipwRCk(0, i, 0, Integer.MAX_VALUE);
                BFRsKhrQv layoutDirection = kaIKYh6OP.getLayoutDirection();
                oWhsE8IPp owhse8ipp = icKZ1RJnW.vPSbyrYWX;
                return YWiUMZOtw.J4Ux7ym32(ickz1rjnw.J4Ux7ym32(q3BipwRCk, layoutDirection, null).tGV7Q6urW);
        }
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                Integer num = (Integer) IFeOgs2Gp.MzoOEjc4X(new CqYXp4s4a(new axHKWsBUm(list), new JIPi5DZYQ(i, 0)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk.tGV7Q6urW(kaIKYh6OP.getLayoutDirection());
                return (int) ((float) Math.ceil((double) ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk.q3BipwRCk().J4Ux7ym32()));
        }
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        switch (this.q3BipwRCk) {
            case 0:
                Integer num = (Integer) IFeOgs2Gp.MzoOEjc4X(new CqYXp4s4a(new axHKWsBUm(list), new iqYAdkLYT(i)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk.tGV7Q6urW(kaIKYh6OP.getLayoutDirection());
                return (int) ((float) Math.ceil((double) ((wQYV02pDG) this.J4Ux7ym32).CBQ5d1kRq.q3BipwRCk.q3BipwRCk().q3BipwRCk()));
        }
    }

    public ADRkKYVZo(wQYV02pDG wqyv02pdg) {
        this.J4Ux7ym32 = wqyv02pdg;
    }
}
