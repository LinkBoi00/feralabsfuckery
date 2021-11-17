package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class gThLCaTO1 {
    public static final long Bhmn1KIah(long j) {
        return ODug2UCW1.dIocxURUo(tbzY8QG6X.kCA6Zs9sL(j) / 2.0f, tbzY8QG6X.tGV7Q6urW(j) / 2.0f);
    }

    public static /* synthetic */ BgIsSUB3d CBQ5d1kRq(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM, NzvP5Rex8 nzvP5Rex8, int i) {
        f7B6YCXHx f7b6ycxhx;
        if ((i & 1) != 0) {
            boolean z = Rjnc3TWC6.q3BipwRCk;
            f7b6ycxhx = f7B6YCXHx.kmSgne1rO;
        } else {
            f7b6ycxhx = null;
        }
        return vPSbyrYWX(bgIsSUB3d, f7b6ycxhx, nzvP5Rex8);
    }

    public static int Eeka1udhb(vc1fKXGpx vc1fkxgpx, KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return vc1fkxgpx.kCA6Zs9sL(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), new jSV6xiZIZ(hqmYLYbvB, ctgRYtKj8.Max, f1PXpEE8g.Height), dnBSj5uJN.J4Ux7ym32(0, i, 0, 0, 13)).J4Ux7ym32();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r9.tGV7Q6urW <= r11.q3BipwRCk) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r9.J4Ux7ym32 >= r11.dIocxURUo) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r9.dIocxURUo <= r11.J4Ux7ym32) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r9.q3BipwRCk >= r11.tGV7Q6urW) goto L_0x0055;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean GPLPRo6go(con.bzmJZsHMu r9, con.bzmJZsHMu r10, con.bzmJZsHMu r11, int r12) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: con.gThLCaTO1.GPLPRo6go(con.bzmJZsHMu, con.bzmJZsHMu, con.bzmJZsHMu, int):boolean");
    }

    public static final long J4Ux7ym32(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
        return floatToIntBits2;
    }

    public static final long MzoOEjc4X(int i, bzmJZsHMu bzmjzshmu, bzmJZsHMu bzmjzshmu2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
        ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
        if (SBy3PdRIl.q3BipwRCk(i, 3)) {
            f2 = bzmjzshmu.q3BipwRCk;
            f = bzmjzshmu2.tGV7Q6urW;
        } else if (SBy3PdRIl.q3BipwRCk(i, 4)) {
            f2 = bzmjzshmu2.q3BipwRCk;
            f = bzmjzshmu.tGV7Q6urW;
        } else if (SBy3PdRIl.q3BipwRCk(i, 5)) {
            f2 = bzmjzshmu.J4Ux7ym32;
            f = bzmjzshmu2.dIocxURUo;
        } else if (SBy3PdRIl.q3BipwRCk(i, 6)) {
            f2 = bzmjzshmu2.J4Ux7ym32;
            f = bzmjzshmu.dIocxURUo;
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        long abs = (long) Math.abs(Math.max(0.0f, f2 - f));
        boolean z = true;
        if (SBy3PdRIl.q3BipwRCk(i, 3) ? true : SBy3PdRIl.q3BipwRCk(i, 4)) {
            f6 = (float) 2;
            f4 = (bzmjzshmu.J4Ux7ym32() / f6) + bzmjzshmu.J4Ux7ym32;
            f5 = bzmjzshmu2.J4Ux7ym32;
            f3 = bzmjzshmu2.J4Ux7ym32();
        } else {
            if (!SBy3PdRIl.q3BipwRCk(i, 5)) {
                z = SBy3PdRIl.q3BipwRCk(i, 6);
            }
            if (z) {
                f6 = (float) 2;
                f4 = (bzmjzshmu.kCA6Zs9sL() / f6) + bzmjzshmu.q3BipwRCk;
                f5 = bzmjzshmu2.q3BipwRCk;
                f3 = bzmjzshmu2.kCA6Zs9sL();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = (long) Math.abs(f4 - ((f3 / f6) + f5));
        return (abs2 * abs2) + (((long) 13) * abs * abs);
    }

    public static final boolean PSTqBLTET(bzmJZsHMu bzmjzshmu, int i, bzmJZsHMu bzmjzshmu2) {
        ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
        ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
        if (SBy3PdRIl.q3BipwRCk(i, 3)) {
            float f = bzmjzshmu2.tGV7Q6urW;
            float f2 = bzmjzshmu.tGV7Q6urW;
            if ((f > f2 || bzmjzshmu2.q3BipwRCk >= f2) && bzmjzshmu2.q3BipwRCk > bzmjzshmu.q3BipwRCk) {
                return true;
            }
        } else if (SBy3PdRIl.q3BipwRCk(i, 4)) {
            float f3 = bzmjzshmu2.q3BipwRCk;
            float f4 = bzmjzshmu.q3BipwRCk;
            if ((f3 < f4 || bzmjzshmu2.tGV7Q6urW <= f4) && bzmjzshmu2.tGV7Q6urW < bzmjzshmu.tGV7Q6urW) {
                return true;
            }
        } else if (SBy3PdRIl.q3BipwRCk(i, 5)) {
            float f5 = bzmjzshmu2.dIocxURUo;
            float f6 = bzmjzshmu.dIocxURUo;
            if ((f5 > f6 || bzmjzshmu2.J4Ux7ym32 >= f6) && bzmjzshmu2.J4Ux7ym32 > bzmjzshmu.J4Ux7ym32) {
                return true;
            }
        } else if (SBy3PdRIl.q3BipwRCk(i, 6)) {
            float f7 = bzmjzshmu2.J4Ux7ym32;
            float f8 = bzmjzshmu.J4Ux7ym32;
            if ((f7 < f8 || bzmjzshmu2.dIocxURUo <= f8) && bzmjzshmu2.dIocxURUo < bzmjzshmu.dIocxURUo) {
                return true;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return false;
    }

    public static final boolean Puu3Rhg4F(bzmJZsHMu bzmjzshmu, int i, bzmJZsHMu bzmjzshmu2) {
        ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
        ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
        if (!(SBy3PdRIl.q3BipwRCk(i, 3) ? true : SBy3PdRIl.q3BipwRCk(i, 4))) {
            if (!(SBy3PdRIl.q3BipwRCk(i, 5) ? true : SBy3PdRIl.q3BipwRCk(i, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (bzmjzshmu.tGV7Q6urW > bzmjzshmu2.q3BipwRCk && bzmjzshmu.q3BipwRCk < bzmjzshmu2.tGV7Q6urW) {
                return true;
            }
        } else if (bzmjzshmu.dIocxURUo > bzmjzshmu2.J4Ux7ym32 && bzmjzshmu.J4Ux7ym32 < bzmjzshmu2.dIocxURUo) {
            return true;
        }
        return false;
    }

    public static int RG6kpfv3v(vc1fKXGpx vc1fkxgpx, KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return vc1fkxgpx.kCA6Zs9sL(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), new jSV6xiZIZ(hqmYLYbvB, ctgRYtKj8.Min, f1PXpEE8g.Height), dnBSj5uJN.J4Ux7ym32(0, i, 0, 0, 13)).J4Ux7ym32();
    }

    public static final fNOfbycJo WaUP0CF08(List list, List list2, int i) {
        float f;
        float f2;
        if (i < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            int size = i >= list.size() ? list.size() - 1 : i;
            int i2 = i + 1;
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            int size2 = list.size();
            int i5 = size + 1;
            iFKnyAZAM ifknyazam = new iFKnyAZAM(i5, size2);
            if (size2 > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    ifknyazam.qFBXIgpia(0, i6, 1.0f);
                    if (1 < i5) {
                        int i8 = 1;
                        while (true) {
                            int i9 = i8 + 1;
                            ifknyazam.qFBXIgpia(i8, i6, ((Number) list.get(i6)).floatValue() * ifknyazam.RG6kpfv3v(i8 - 1, i6));
                            if (i9 >= i5) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    if (i7 >= size2) {
                        break;
                    }
                    i6 = i7;
                }
            }
            iFKnyAZAM ifknyazam2 = new iFKnyAZAM(i5, size2);
            iFKnyAZAM ifknyazam3 = new iFKnyAZAM(i5, i5);
            if (i5 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (size2 > 0) {
                        int i12 = i3;
                        while (true) {
                            int i13 = i12 + 1;
                            ifknyazam2.qFBXIgpia(i10, i12, ifknyazam.RG6kpfv3v(i10, i12));
                            if (i13 >= size2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i10 > 0) {
                        int i14 = i3;
                        while (true) {
                            int i15 = i14 + 1;
                            float oon79WMrY = ifknyazam2.sk5s77z6Q(i10).oon79WMrY(ifknyazam2.sk5s77z6Q(i14));
                            if (size2 > 0) {
                                int i16 = i3;
                                while (true) {
                                    int i17 = i16 + 1;
                                    ifknyazam2.qFBXIgpia(i10, i16, ifknyazam2.RG6kpfv3v(i10, i16) - (ifknyazam2.RG6kpfv3v(i14, i16) * oon79WMrY));
                                    if (i17 >= size2) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i15 >= i10) {
                                break;
                            }
                            i14 = i15;
                            i3 = 0;
                        }
                    }
                    I6sO15l0X sk5s77z6Q = ifknyazam2.sk5s77z6Q(i10);
                    float sqrt = (float) Math.sqrt((double) sk5s77z6Q.oon79WMrY(sk5s77z6Q));
                    if (((double) sqrt) >= 1.0E-6d) {
                        float f3 = 1.0f / sqrt;
                        if (size2 > 0) {
                            int i18 = 0;
                            while (true) {
                                int i19 = i18 + 1;
                                ifknyazam2.qFBXIgpia(i10, i18, ifknyazam2.RG6kpfv3v(i10, i18) * f3);
                                if (i19 >= size2) {
                                    break;
                                }
                                i18 = i19;
                            }
                        }
                        if (i5 > 0) {
                            int i20 = 0;
                            while (true) {
                                int i21 = i20 + 1;
                                ifknyazam3.qFBXIgpia(i10, i20, i20 < i10 ? 0.0f : ifknyazam2.sk5s77z6Q(i10).oon79WMrY(ifknyazam.sk5s77z6Q(i20)));
                                if (i21 >= i5) {
                                    break;
                                }
                                i20 = i21;
                            }
                        }
                        if (i11 >= i5) {
                            break;
                        }
                        i10 = i11;
                        i3 = 0;
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
            }
            I6sO15l0X i6sO15l0X = new I6sO15l0X(size2);
            if (size2 > 0) {
                int i22 = 0;
                while (true) {
                    int i23 = i22 + 1;
                    ((Float[]) i6sO15l0X.q3BipwRCk)[i22] = Float.valueOf(((Number) list2.get(i22)).floatValue() * 1.0f);
                    if (i23 >= size2) {
                        break;
                    }
                    i22 = i23;
                }
            }
            int i24 = i5 - 1;
            if (i24 >= 0) {
                int i25 = i24;
                while (true) {
                    int i26 = i25 - 1;
                    arrayList.set(i25, Float.valueOf(ifknyazam2.sk5s77z6Q(i25).oon79WMrY(i6sO15l0X)));
                    int i27 = i25 + 1;
                    if (i27 <= i24) {
                        int i28 = i24;
                        while (true) {
                            i28--;
                            arrayList.set(i25, Float.valueOf(((Number) arrayList.get(i25)).floatValue() - (((Number) arrayList.get(i28)).floatValue() * ifknyazam3.RG6kpfv3v(i25, i28))));
                            if (i28 == i27) {
                                break;
                            }
                        }
                    }
                    arrayList.set(i25, Float.valueOf(((Number) arrayList.get(i25)).floatValue() / ifknyazam3.RG6kpfv3v(i25, i25)));
                    if (i26 < 0) {
                        break;
                    }
                    i25 = i26;
                }
            }
            if (size2 > 0) {
                int i29 = 0;
                f = 0.0f;
                while (true) {
                    int i30 = i29 + 1;
                    f += ((Number) list2.get(i29)).floatValue();
                    if (i30 >= size2) {
                        break;
                    }
                    i29 = i30;
                }
            } else {
                f = 0.0f;
            }
            float f4 = f / ((float) size2);
            float f5 = 0.0f;
            if (size2 > 0) {
                int i31 = 0;
                f2 = 0.0f;
                while (true) {
                    int i32 = i31 + 1;
                    float floatValue = ((Number) list2.get(i31)).floatValue() - ((Number) arrayList.get(0)).floatValue();
                    if (1 < i5) {
                        int i33 = 1;
                        float f6 = 1.0f;
                        while (true) {
                            int i34 = i33 + 1;
                            f6 *= ((Number) list.get(i31)).floatValue();
                            floatValue -= ((Number) arrayList.get(i33)).floatValue() * f6;
                            if (i34 >= i5) {
                                break;
                            }
                            i33 = i34;
                        }
                    }
                    f5 += floatValue * 1.0f * floatValue;
                    float floatValue2 = ((Number) list2.get(i31)).floatValue() - f4;
                    f2 += floatValue2 * 1.0f * floatValue2;
                    if (i32 >= size2) {
                        break;
                    }
                    i31 = i32;
                }
            } else {
                f2 = 0.0f;
            }
            return new fNOfbycJo(arrayList, f2 <= 1.0E-6f ? 1.0f : 1.0f - (f5 / f2));
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    public static final void dIocxURUo(pW31wYUjR pw31wyujr, BgIsSUB3d bgIsSUB3d, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-607850308);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 2) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d = H11ySchUh.CBQ5d1kRq;
        }
        pw31wyujr.J4Ux7ym32 = xpuSUT7Gh.kktL0P5MG(wpxpbwg1j);
        gLDxq5bwv.q3BipwRCk(pw31wyujr, new NWs5CXl6V(pw31wyujr, 0), wpxpbwg1j);
        BgIsSUB3d qVUwofr5s = qVUwofr5s(wpxpbwg1j, bgIsSUB3d);
        AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
        BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
        fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
        uEb6wTQlg ueb6wtqlg = pLYbCSTk0.L4EwGfXiQ;
        uEb6wTQlg ueb6wtqlg2 = pLYbCSTk0.L4EwGfXiQ;
        juufjqtjC juufjqtjc = juufjqtjC.sk5s77z6Q;
        wpxpbwg1j.zHl31GGXU(-2103250935);
        if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
            wpxpbwg1j.QSbMsHU5X();
            if (wpxpbwg1j.vNtjxmzUM) {
                wpxpbwg1j.vPSbyrYWX(new GunsxZ6tg(juufjqtjc, 5));
            } else {
                wpxpbwg1j.ln3nf7LH3();
            }
            PmanMZxiM pmanMZxiM = pw31wyujr.tGV7Q6urW;
            if (wpxpbwg1j.vNtjxmzUM) {
                wpxpbwg1j.J4Ux7ym32(qih4lW99W.q3BipwRCk, new MAZDnzQe5(pmanMZxiM));
            }
            Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, qVUwofr5s, xUKgrGMGQ.tGV7Q6urW);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, kkcqgcx5g, pw31wyujr.dIocxURUo);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X, xUKgrGMGQ.dIocxURUo);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, xUKgrGMGQ.GPLPRo6go);
            wpxpbwg1j.ilHKhw3Yw(true);
            wpxpbwg1j.ilHKhw3Yw(false);
            rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb != null) {
                Eeka1udhb.dIocxURUo = new IqXXnNh4t(pw31wyujr, bgIsSUB3d, kkcqgcx5g, i, i2);
                return;
            }
            return;
        }
        xpuSUT7Gh.j22ftfeNI();
        throw null;
    }

    public static int dXrmkklc8(vc1fKXGpx vc1fkxgpx, KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return vc1fkxgpx.kCA6Zs9sL(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), new jSV6xiZIZ(hqmYLYbvB, ctgRYtKj8.Max, f1PXpEE8g.Width), dnBSj5uJN.J4Ux7ym32(0, 0, 0, i, 7)).q3BipwRCk();
    }

    public static final bzmJZsHMu dfpT1j18n(long j) {
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return q3BipwRCk(bRgfgYIQX.tGV7Q6urW, j);
    }

    public static final String i8XZMQc6Z(Object obj, String str) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        return name + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final KB2jjcOAK iMyQMM6Qj(KB2jjcOAK kB2jjcOAK, int i) {
        bzmJZsHMu bzmjzshmu;
        KB2jjcOAK iMyQMM6Qj;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        bzmJZsHMu bzmjzshmu2 = null;
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return kB2jjcOAK;
                        }
                        throw new dnCerKhAM();
                    }
                }
            }
            KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
            if (pwwzaxl9D == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (pwwzaxl9D.D91ZKn9BG() == ftmnXRQmW.ActiveParent && (iMyQMM6Qj = iMyQMM6Qj(pwwzaxl9D, i)) != null) {
                return iMyQMM6Qj;
            } else {
                KB2jjcOAK MzoOEjc4X = ODug2UCW1.MzoOEjc4X(kB2jjcOAK);
                if (MzoOEjc4X != null) {
                    bzmjzshmu2 = MzoOEjc4X.eylCJcWC7();
                }
                if (bzmjzshmu2 != null) {
                    return kmSgne1rO(kB2jjcOAK.KBYw84i3W(true), bzmjzshmu2, i);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        List KBYw84i3W = kB2jjcOAK.KBYw84i3W(true);
        if (KBYw84i3W.size() <= 1) {
            return (KB2jjcOAK) wkFJfVmcv.QNqj6nIzv(KBYw84i3W);
        }
        ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
        ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
        if (SBy3PdRIl.q3BipwRCk(i, 4) ? true : SBy3PdRIl.q3BipwRCk(i, 6)) {
            bzmJZsHMu eylCJcWC7 = kB2jjcOAK.eylCJcWC7();
            float f = eylCJcWC7.q3BipwRCk;
            float f2 = eylCJcWC7.J4Ux7ym32;
            bzmjzshmu = new bzmJZsHMu(f, f2, f, f2);
        } else {
            if (!SBy3PdRIl.q3BipwRCk(i, 3)) {
                z = SBy3PdRIl.q3BipwRCk(i, 5);
            }
            if (z) {
                bzmJZsHMu eylCJcWC72 = kB2jjcOAK.eylCJcWC7();
                float f3 = eylCJcWC72.tGV7Q6urW;
                float f4 = eylCJcWC72.dIocxURUo;
                bzmjzshmu = new bzmJZsHMu(f3, f4, f3, f4);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return kmSgne1rO(KBYw84i3W, bzmjzshmu, i);
    }

    public static final void iiGwOFFnr(W1NiVqEgR w1NiVqEgR, cKAQplqZy ckaqplqzy) {
        List q3BipwRCk = ckaqplqzy.q3BipwRCk();
        int size = q3BipwRCk.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                AZFnwmUeD aZFnwmUeD = (AZFnwmUeD) q3BipwRCk.get(i);
                w1NiVqEgR.q3BipwRCk(aZFnwmUeD.q3BipwRCk, aZFnwmUeD.J4Ux7ym32);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        w1NiVqEgR.q3BipwRCk(ckaqplqzy.J4Ux7ym32, ckaqplqzy.tGV7Q6urW);
    }

    public static /* synthetic */ bzmJZsHMu ilHKhw3Yw(mnTaxtMa7 mntaxtma7, mnTaxtMa7 mntaxtma72, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return ((qhaZGYFO8) mntaxtma7).ShSN9wbzk(mntaxtma72, z);
    }

    public static int ixWaw2akD(vc1fKXGpx vc1fkxgpx, KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return vc1fkxgpx.kCA6Zs9sL(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), new jSV6xiZIZ(hqmYLYbvB, ctgRYtKj8.Min, f1PXpEE8g.Width), dnBSj5uJN.J4Ux7ym32(0, 0, 0, i, 7)).q3BipwRCk();
    }

    public static final long kCA6Zs9sL(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        return floatToIntBits2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.KB2jjcOAK kmSgne1rO(java.util.List r12, con.bzmJZsHMu r13, int r14) {
        /*
            con.ksLrMHgEz r0 = con.SBy3PdRIl.J4Ux7ym32
            con.ksLrMHgEz r0 = con.SBy3PdRIl.J4Ux7ym32
            r0 = 3
            boolean r0 = con.SBy3PdRIl.q3BipwRCk(r14, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            float r0 = r13.kCA6Zs9sL()
            float r3 = (float) r1
            float r0 = r0 + r3
            goto L_0x0022
        L_0x0014:
            r0 = 4
            boolean r0 = con.SBy3PdRIl.q3BipwRCk(r14, r0)
            if (r0 == 0) goto L_0x0027
            float r0 = r13.kCA6Zs9sL()
            float r3 = (float) r1
            float r0 = r0 + r3
            float r0 = -r0
        L_0x0022:
            con.bzmJZsHMu r0 = r13.iiGwOFFnr(r0, r2)
            goto L_0x0047
        L_0x0027:
            r0 = 5
            boolean r0 = con.SBy3PdRIl.q3BipwRCk(r14, r0)
            if (r0 == 0) goto L_0x0035
            float r0 = r13.J4Ux7ym32()
            float r3 = (float) r1
            float r0 = r0 + r3
            goto L_0x0043
        L_0x0035:
            r0 = 6
            boolean r0 = con.SBy3PdRIl.q3BipwRCk(r14, r0)
            if (r0 == 0) goto L_0x0093
            float r0 = r13.J4Ux7ym32()
            float r3 = (float) r1
            float r0 = r0 + r3
            float r0 = -r0
        L_0x0043:
            con.bzmJZsHMu r0 = r13.iiGwOFFnr(r2, r0)
        L_0x0047:
            r2 = 0
            int r3 = r12.size()
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0092
            r4 = 0
            r5 = r4
        L_0x0052:
            int r6 = r5 + 1
            java.lang.Object r5 = r12.get(r5)
            con.KB2jjcOAK r5 = (con.KB2jjcOAK) r5
            con.bzmJZsHMu r7 = r5.eylCJcWC7()
            boolean r8 = PSTqBLTET(r7, r14, r13)
            if (r8 != 0) goto L_0x0065
            goto L_0x0088
        L_0x0065:
            boolean r8 = PSTqBLTET(r0, r14, r13)
            if (r8 != 0) goto L_0x006c
            goto L_0x0086
        L_0x006c:
            boolean r8 = GPLPRo6go(r13, r7, r0, r14)
            if (r8 == 0) goto L_0x0073
            goto L_0x0086
        L_0x0073:
            boolean r8 = GPLPRo6go(r13, r0, r7, r14)
            if (r8 == 0) goto L_0x007a
            goto L_0x0088
        L_0x007a:
            long r8 = MzoOEjc4X(r14, r13, r7)
            long r10 = MzoOEjc4X(r14, r13, r0)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0088
        L_0x0086:
            r8 = r1
            goto L_0x0089
        L_0x0088:
            r8 = r4
        L_0x0089:
            if (r8 == 0) goto L_0x008d
            r2 = r5
            r0 = r7
        L_0x008d:
            if (r6 <= r3) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r5 = r6
            goto L_0x0052
        L_0x0092:
            return r2
        L_0x0093:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "This function should only be used for 2-D focus search"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: con.gThLCaTO1.kmSgne1rO(java.util.List, con.bzmJZsHMu, int):con.KB2jjcOAK");
    }

    public static final BgIsSUB3d oon79WMrY(BgIsSUB3d bgIsSUB3d) {
        return ODug2UCW1.sk5s77z6Q(bgIsSUB3d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, true, 12287);
    }

    public static final bzmJZsHMu q3BipwRCk(long j, long j2) {
        return new bzmJZsHMu(bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j), tbzY8QG6X.kCA6Zs9sL(j2) + bRgfgYIQX.tGV7Q6urW(j), tbzY8QG6X.tGV7Q6urW(j2) + bRgfgYIQX.dIocxURUo(j));
    }

    public static final BgIsSUB3d qVUwofr5s(rJ0s9PfCL rj0s9pfcl, BgIsSUB3d bgIsSUB3d) {
        if (bgIsSUB3d.i8XZMQc6Z(GQN3dSqKV.CpG0imbht)) {
            return bgIsSUB3d;
        }
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(1219399079);
        int i = BgIsSUB3d.Puu3Rhg4F;
        BgIsSUB3d bgIsSUB3d2 = (BgIsSUB3d) bgIsSUB3d.sk5s77z6Q(H11ySchUh.CBQ5d1kRq, new MAZDnzQe5(rj0s9pfcl));
        wpxpbwg1j.ilHKhw3Yw(false);
        return bgIsSUB3d2;
    }

    public static BgIsSUB3d sk5s77z6Q(BgIsSUB3d bgIsSUB3d, xNzBgcwLi xnzbgcwli, boolean z, B01AuRyT3 b01AuRyT3, Z3himwdYy z3himwdYy, float f, jvKy1qifN jvky1qifn, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            int i2 = B01AuRyT3.q3BipwRCk;
            b01AuRyT3 = wkHKTCu1d.dIocxURUo;
        }
        if ((i & 8) != 0) {
            int i3 = Z3himwdYy.q3BipwRCk;
            z3himwdYy = o8nmtEf9G.tGV7Q6urW;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            jvky1qifn = null;
        }
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new Jw6Lm78mw(xnzbgcwli, z, b01AuRyT3, z3himwdYy, f, jvky1qifn, f7B6YCXHx.kmSgne1rO));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(con.BgIsSUB3d r8, con.kkcQgCx5G r9, con.rJ0s9PfCL r10, int r11, int r12) {
        /*
            r6 = r10
            con.wpXpbWG1J r6 = (con.wpXpbWG1J) r6
            r0 = -607851727(0xffffffffdbc4eb31, float:-1.10855382E17)
            r6.ziwPzaoF3(r0)
            java.lang.Object r0 = con.G7WvUK4mQ.q3BipwRCk
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0012
            r1 = r11 | 6
            goto L_0x0025
        L_0x0012:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0024
            r1 = r6
            con.wpXpbWG1J r1 = (con.wpXpbWG1J) r1
            boolean r1 = r1.iiGwOFFnr(r8)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r11
            goto L_0x0025
        L_0x0024:
            r1 = r11
        L_0x0025:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x002c
            r1 = r1 | 48
            goto L_0x003f
        L_0x002c:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003f
            r3 = r6
            con.wpXpbWG1J r3 = (con.wpXpbWG1J) r3
            boolean r3 = r3.iiGwOFFnr(r9)
            if (r3 == 0) goto L_0x003c
            r3 = 32
            goto L_0x003e
        L_0x003c:
            r3 = 16
        L_0x003e:
            r1 = r1 | r3
        L_0x003f:
            r3 = r1 & 91
            r3 = r3 ^ 18
            if (r3 != 0) goto L_0x0054
            r3 = r6
            con.wpXpbWG1J r3 = (con.wpXpbWG1J) r3
            boolean r4 = r3.i8XZMQc6Z()
            if (r4 != 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            r3.igRQEZxnW()
            r1 = r8
            goto L_0x008f
        L_0x0054:
            if (r0 == 0) goto L_0x005c
            int r0 = con.BgIsSUB3d.Puu3Rhg4F
            con.H11ySchUh r0 = con.H11ySchUh.CBQ5d1kRq
            r7 = r0
            goto L_0x005d
        L_0x005c:
            r7 = r8
        L_0x005d:
            r0 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r2 = r6
            con.wpXpbWG1J r2 = (con.wpXpbWG1J) r2
            r2.zHl31GGXU(r0)
            java.lang.Object r0 = r2.dfpT1j18n()
            int r3 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r3 = con.P7Re99G8L.J4Ux7ym32
            r4 = 0
            if (r0 != r3) goto L_0x0079
            con.pW31wYUjR r0 = new con.pW31wYUjR
            r0.<init>(r4)
            r2.INnK5Rew6(r0)
        L_0x0079:
            r2.ilHKhw3Yw(r4)
            con.pW31wYUjR r0 = (con.pW31wYUjR) r0
            int r1 = r1 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | 8
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r2 | r1
            r5 = 0
            r1 = r7
            r2 = r9
            r3 = r6
            dIocxURUo(r0, r1, r2, r3, r4, r5)
        L_0x008f:
            con.wpXpbWG1J r6 = (con.wpXpbWG1J) r6
            con.rESgwfV20 r6 = r6.Eeka1udhb()
            if (r6 != 0) goto L_0x0098
            goto L_0x00a4
        L_0x0098:
            con.TgNmq462U r7 = new con.TgNmq462U
            r5 = 1
            r0 = r7
            r2 = r9
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.dIocxURUo = r7
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.gThLCaTO1.tGV7Q6urW(con.BgIsSUB3d, con.kkcQgCx5G, con.rJ0s9PfCL, int, int):void");
    }

    public static final BgIsSUB3d vPSbyrYWX(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM, NzvP5Rex8 nzvP5Rex8) {
        return bgIsSUB3d.WaUP0CF08(new Yy9MlgMTw(pmanMZxiM, nzvP5Rex8));
    }

    public static final BgIsSUB3d yWvV4ePLl(BgIsSUB3d bgIsSUB3d, JZuV4yGnu jZuV4yGnu) {
        return ODug2UCW1.sk5s77z6Q(bgIsSUB3d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, jZuV4yGnu, true, 10239);
    }
}
