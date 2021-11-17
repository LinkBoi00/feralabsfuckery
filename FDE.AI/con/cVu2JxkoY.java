package con;

import java.util.List;
/* loaded from: classes.dex */
public final class cVu2JxkoY implements nBnrGO77H {
    public final /* synthetic */ float J4Ux7ym32;
    public final /* synthetic */ a9Q6ojHoZ dIocxURUo;
    public final /* synthetic */ pennnCA24 kCA6Zs9sL;
    public final /* synthetic */ int q3BipwRCk;
    public final /* synthetic */ int tGV7Q6urW;

    public cVu2JxkoY(int i, float f, int i2, a9Q6ojHoZ a9q6ojhoz, pennnCA24 pennnca24) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = a9q6ojhoz;
        this.kCA6Zs9sL = pennnca24;
    }

    @Override // con.nBnrGO77H
    public aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        List list2 = list;
        int i20 = this.q3BipwRCk;
        int vPSbyrYWX = i20 == 1 ? K5PjwoFCN.vPSbyrYWX(j) : K5PjwoFCN.oon79WMrY(j);
        int yWvV4ePLl = i20 == 1 ? K5PjwoFCN.yWvV4ePLl(j) : K5PjwoFCN.Puu3Rhg4F(j);
        int oon79WMrY = i20 == 1 ? K5PjwoFCN.oon79WMrY(j) : K5PjwoFCN.vPSbyrYWX(j);
        int Puu3Rhg4F = i20 == 1 ? K5PjwoFCN.Puu3Rhg4F(j) : K5PjwoFCN.yWvV4ePLl(j);
        int iiGwOFFnr = fRJidynr8.iiGwOFFnr(this.J4Ux7ym32);
        n2gATecRC[] n2gatecrcArr = new n2gATecRC[list.size()];
        int size = list.size();
        iPxyBBmfH[] ipxybbmfhArr = new iPxyBBmfH[size];
        for (int i21 = 0; i21 < size; i21++) {
            ipxybbmfhArr[i21] = xP6F5SR9v.kmSgne1rO((HqmYLYbvB) list2.get(i21));
        }
        int size2 = list.size() - 1;
        float f3 = 0.0f;
        if (size2 >= 0) {
            f = 0.0f;
            int i22 = 0;
            i5 = 0;
            int i23 = 0;
            i3 = 0;
            i2 = 0;
            while (true) {
                int i24 = i22 + 1;
                hKxHUWEcH hkxhuwech = (hKxHUWEcH) list2.get(i22);
                float PSTqBLTET = xP6F5SR9v.PSTqBLTET(ipxybbmfhArr[i22]);
                if (PSTqBLTET > f3) {
                    f += PSTqBLTET;
                    i5++;
                    i = Puu3Rhg4F;
                    i6 = i23;
                    i4 = oon79WMrY;
                } else {
                    int i25 = yWvV4ePLl == Integer.MAX_VALUE ? Integer.MAX_VALUE : yWvV4ePLl - i3;
                    if (this.q3BipwRCk == 1) {
                        i16 = Puu3Rhg4F;
                        i = i16;
                        i17 = i25;
                    } else {
                        i17 = Puu3Rhg4F;
                        i = i17;
                        i16 = i25;
                    }
                    i4 = oon79WMrY;
                    n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(dnBSj5uJN.q3BipwRCk(0, i17, 0, i16));
                    i6 = Math.min(iiGwOFFnr, (yWvV4ePLl - i3) - xP6F5SR9v.Puu3Rhg4F(dIocxURUo, this.q3BipwRCk));
                    int i26 = this.q3BipwRCk;
                    if (i26 == 1) {
                        i18 = dIocxURUo.CBQ5d1kRq;
                    } else {
                        i18 = dIocxURUo.kmSgne1rO;
                    }
                    int i27 = i18 + i6 + i3;
                    if (i26 == 1) {
                        i19 = dIocxURUo.kmSgne1rO;
                    } else {
                        i19 = dIocxURUo.CBQ5d1kRq;
                    }
                    i2 = Math.max(i2, i19);
                    n2gatecrcArr[i22] = dIocxURUo;
                    i3 = i27;
                }
                if (i24 > size2) {
                    break;
                }
                i22 = i24;
                oon79WMrY = i4;
                Puu3Rhg4F = i;
                f3 = 0.0f;
                i23 = i6;
                list2 = list;
            }
        } else {
            i = Puu3Rhg4F;
            i4 = oon79WMrY;
            i6 = 0;
            i5 = 0;
            i3 = 0;
            i2 = 0;
            f = 0.0f;
        }
        if (i5 == 0) {
            i3 -= i6;
            i8 = i2;
            i7 = 0;
        } else {
            int i28 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i29 = (i5 - 1) * iiGwOFFnr;
            int i30 = (((i28 <= 0 || yWvV4ePLl == Integer.MAX_VALUE) ? vPSbyrYWX : yWvV4ePLl) - i3) - i29;
            float f4 = i28 > 0 ? ((float) i30) / f : 0.0f;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                i31 += D3DEikrvb.Eeka1udhb(xP6F5SR9v.PSTqBLTET(ipxybbmfhArr[i32]) * f4);
            }
            int i33 = i30 - i31;
            int size3 = list.size() - 1;
            if (size3 >= 0) {
                int i34 = i2;
                int i35 = 0;
                i9 = 0;
                while (true) {
                    int i36 = i35 + 1;
                    if (n2gatecrcArr[i35] == null) {
                        hKxHUWEcH hkxhuwech2 = (hKxHUWEcH) list.get(i35);
                        iPxyBBmfH ipxybbmfh = ipxybbmfhArr[i35];
                        float PSTqBLTET2 = xP6F5SR9v.PSTqBLTET(ipxybbmfh);
                        if (PSTqBLTET2 > 0.0f) {
                            int kmSgne1rO = D3DEikrvb.kmSgne1rO(i33);
                            int i37 = i33 - kmSgne1rO;
                            f2 = f4;
                            int max = Math.max(0, D3DEikrvb.Eeka1udhb(PSTqBLTET2 * f4) + kmSgne1rO);
                            if (ipxybbmfh == null) {
                                z = true;
                            } else {
                                z = ipxybbmfh.J4Ux7ym32;
                            }
                            int i38 = (!z || max == Integer.MAX_VALUE) ? 0 : max;
                            if (this.q3BipwRCk == 1) {
                                i14 = max;
                                i12 = i38;
                                i11 = 0;
                                i10 = i37;
                                i13 = i;
                            } else {
                                i14 = i;
                                i12 = 0;
                                i10 = i37;
                                i13 = max;
                                i11 = i38;
                            }
                            n2gATecRC dIocxURUo2 = hkxhuwech2.dIocxURUo(dnBSj5uJN.q3BipwRCk(i12, i14, i11, i13));
                            int Puu3Rhg4F2 = xP6F5SR9v.Puu3Rhg4F(dIocxURUo2, this.q3BipwRCk) + i9;
                            if (this.q3BipwRCk == 1) {
                                i15 = dIocxURUo2.kmSgne1rO;
                            } else {
                                i15 = dIocxURUo2.CBQ5d1kRq;
                            }
                            i34 = Math.max(i34, i15);
                            n2gatecrcArr[i35] = dIocxURUo2;
                            i9 = Puu3Rhg4F2;
                            i33 = i10;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                    } else {
                        f2 = f4;
                    }
                    if (i36 > size3) {
                        i2 = i34;
                        break;
                    }
                    i35 = i36;
                    f4 = f2;
                }
            } else {
                i9 = 0;
            }
            int i39 = i9 + i29;
            i7 = yWvV4ePLl - i3;
            if (i39 <= i7) {
                i7 = i39;
            }
            i8 = i2;
        }
        BdFQ0RqNz bdFQ0RqNz = new BdFQ0RqNz();
        int max2 = Math.max(i3 + i7, vPSbyrYWX);
        int max3 = (i == Integer.MAX_VALUE || this.tGV7Q6urW != 2) ? Math.max(i8, Math.max(i4, bdFQ0RqNz.CBQ5d1kRq + 0)) : i;
        int i40 = this.q3BipwRCk;
        int i41 = i40 == 1 ? max2 : max3;
        int i42 = i40 == 1 ? max3 : max2;
        int size4 = list.size();
        int[] iArr = new int[size4];
        for (int i43 = 0; i43 < size4; i43++) {
            iArr[i43] = 0;
        }
        return fRJidynr8.nlGCs0NZs(i41, i42, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new GkrqaNGqs(list, n2gatecrcArr, this.dIocxURUo, max2, fRJidynr8, iArr, this.q3BipwRCk, ipxybbmfhArr, this.kCA6Zs9sL, max3, bdFQ0RqNz));
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        uVq47GdDC uvq47gddc;
        if (this.q3BipwRCk == 1) {
            YdVaMBFLH ydVaMBFLH = YdVaMBFLH.q3BipwRCk;
            uvq47gddc = uVq47GdDC.Bhmn1KIah;
        } else {
            YdVaMBFLH ydVaMBFLH2 = YdVaMBFLH.q3BipwRCk;
            uvq47gddc = uVq47GdDC.PSTqBLTET;
        }
        return ((Number) uvq47gddc.sk5s77z6Q(list, Integer.valueOf(i), Integer.valueOf(kaIKYh6OP.iiGwOFFnr(this.J4Ux7ym32)))).intValue();
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        jErzxQ5Ge jerzxq5ge;
        if (this.q3BipwRCk == 1) {
            YdVaMBFLH ydVaMBFLH = YdVaMBFLH.q3BipwRCk;
            jerzxq5ge = jErzxQ5Ge.Bhmn1KIah;
        } else {
            YdVaMBFLH ydVaMBFLH2 = YdVaMBFLH.q3BipwRCk;
            jerzxq5ge = jErzxQ5Ge.PSTqBLTET;
        }
        return ((Number) jerzxq5ge.sk5s77z6Q(list, Integer.valueOf(i), Integer.valueOf(kaIKYh6OP.iiGwOFFnr(this.J4Ux7ym32)))).intValue();
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        gSi9xJYHr gsi9xjyhr;
        if (this.q3BipwRCk == 1) {
            YdVaMBFLH ydVaMBFLH = YdVaMBFLH.q3BipwRCk;
            gsi9xjyhr = gSi9xJYHr.Bhmn1KIah;
        } else {
            YdVaMBFLH ydVaMBFLH2 = YdVaMBFLH.q3BipwRCk;
            gsi9xjyhr = gSi9xJYHr.PSTqBLTET;
        }
        return ((Number) gsi9xjyhr.sk5s77z6Q(list, Integer.valueOf(i), Integer.valueOf(kaIKYh6OP.iiGwOFFnr(this.J4Ux7ym32)))).intValue();
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        iFfOge6JZ iffoge6jz;
        if (this.q3BipwRCk == 1) {
            YdVaMBFLH ydVaMBFLH = YdVaMBFLH.q3BipwRCk;
            iffoge6jz = iFfOge6JZ.Bhmn1KIah;
        } else {
            YdVaMBFLH ydVaMBFLH2 = YdVaMBFLH.q3BipwRCk;
            iffoge6jz = iFfOge6JZ.PSTqBLTET;
        }
        return ((Number) iffoge6jz.sk5s77z6Q(list, Integer.valueOf(i), Integer.valueOf(kaIKYh6OP.iiGwOFFnr(this.J4Ux7ym32)))).intValue();
    }
}
