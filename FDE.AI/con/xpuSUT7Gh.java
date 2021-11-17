package con;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class xpuSUT7Gh {
    public static final long AqaWJg0b4(long j, long j2) {
        long q3BipwRCk = bO2dbmrf7.q3BipwRCk(j, bO2dbmrf7.iiGwOFFnr(j2));
        float dIocxURUo = bO2dbmrf7.dIocxURUo(j2);
        float dIocxURUo2 = bO2dbmrf7.dIocxURUo(q3BipwRCk);
        float f = 1.0f - dIocxURUo2;
        float f2 = (dIocxURUo * f) + dIocxURUo2;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        boolean z = true;
        float Puu3Rhg4F = i == 0 ? 0.0f : (((bO2dbmrf7.Puu3Rhg4F(j2) * dIocxURUo) * f) + (bO2dbmrf7.Puu3Rhg4F(q3BipwRCk) * dIocxURUo2)) / f2;
        float GPLPRo6go = i == 0 ? 0.0f : (((bO2dbmrf7.GPLPRo6go(j2) * dIocxURUo) * f) + (bO2dbmrf7.GPLPRo6go(q3BipwRCk) * dIocxURUo2)) / f2;
        float kCA6Zs9sL = bO2dbmrf7.kCA6Zs9sL(q3BipwRCk);
        float kCA6Zs9sL2 = bO2dbmrf7.kCA6Zs9sL(j2);
        if (i != 0) {
            z = false;
        }
        if (!z) {
            f3 = (((kCA6Zs9sL2 * dIocxURUo) * f) + (kCA6Zs9sL * dIocxURUo2)) / f2;
        }
        return J4Ux7ym32(Puu3Rhg4F, GPLPRo6go, f3, f2, bO2dbmrf7.iiGwOFFnr(j2));
    }

    public static final float[] BL4OzhZBd(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f4 = fArr[2] * f;
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + f4;
        return fArr2;
    }

    public static final boolean Bhmn1KIah(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final int CBQ5d1kRq(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean CpG0imbht(oeZPZXh5R oezpzxh5r, oeZPZXh5R oezpzxh5r2) {
        if (oezpzxh5r == oezpzxh5r2) {
            return true;
        }
        if (Math.abs(oezpzxh5r.q3BipwRCk - oezpzxh5r2.q3BipwRCk) >= 0.001f || Math.abs(oezpzxh5r.J4Ux7ym32 - oezpzxh5r2.J4Ux7ym32) >= 0.001f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.KB2jjcOAK Dr7UqlxEV(con.pLYbCSTk0 r5, con.pnuAOe8oh r6, boolean r7) {
        /*
            con.pnuAOe8oh r5 = r5.CBQ5d1kRq()
            int r0 = r5.Bhmn1KIah
            r1 = 0
            if (r0 <= 0) goto L_0x0022
            java.lang.Object[] r5 = r5.CBQ5d1kRq
            r2 = r1
        L_0x000c:
            r3 = r5[r2]
            con.pLYbCSTk0 r3 = (con.pLYbCSTk0) r3
            con.C1Fd45X28 r4 = r3.V9LQMKGJe
            con.qhaZGYFO8 r4 = r4.ilHKhw3Yw
            con.KB2jjcOAK r4 = r4.IzM1cD9ly(r7)
            if (r4 == 0) goto L_0x001b
            return r4
        L_0x001b:
            r6.J4Ux7ym32(r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x000c
        L_0x0022:
            boolean r5 = r6.oon79WMrY()
            if (r5 == 0) goto L_0x0035
            java.lang.Object r5 = r6.CBQ5d1kRq(r1)
            con.pLYbCSTk0 r5 = (con.pLYbCSTk0) r5
            con.KB2jjcOAK r5 = Dr7UqlxEV(r5, r6, r7)
            if (r5 == 0) goto L_0x0022
            return r5
        L_0x0035:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xpuSUT7Gh.Dr7UqlxEV(con.pLYbCSTk0, con.pnuAOe8oh, boolean):con.KB2jjcOAK");
    }

    public static final HrqgPICFj DuuXfa7LE() {
        ksLrMHgEz kslrmhgez = DkgxZF0Q3.kmSgne1rO;
        ksLrMHgEz kslrmhgez2 = DkgxZF0Q3.kmSgne1rO;
        return DkgxZF0Q3.Bhmn1KIah;
    }

    public static final float[] EBQXiIPmm(long j) {
        return new float[]{bO2dbmrf7.Puu3Rhg4F(j), bO2dbmrf7.GPLPRo6go(j), bO2dbmrf7.kCA6Zs9sL(j), bO2dbmrf7.dIocxURUo(j)};
    }

    public static final int Eeka1udhb(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final void GPLPRo6go(BgIsSUB3d bgIsSUB3d, kkcQgCx5G kkcqgcx5g, nBnrGO77H nbnrgo77h, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        BgIsSUB3d bgIsSUB3d3;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-850547527);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            bgIsSUB3d2 = bgIsSUB3d;
        } else if ((i & 14) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = (wpxpbwg1j.iiGwOFFnr(bgIsSUB3d) ? 4 : 2) | i;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= wpxpbwg1j.iiGwOFFnr(kkcqgcx5g) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= wpxpbwg1j.iiGwOFFnr(nbnrgo77h) ? 256 : 128;
        }
        if (((i3 & 731) ^ 146) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
            if (i4 != 0) {
                int i5 = BgIsSUB3d.Puu3Rhg4F;
                bgIsSUB3d3 = H11ySchUh.CBQ5d1kRq;
            } else {
                bgIsSUB3d3 = bgIsSUB3d2;
            }
            BgIsSUB3d qVUwofr5s = gThLCaTO1.qVUwofr5s(wpxpbwg1j, bgIsSUB3d3);
            AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
            BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
            fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
            uEb6wTQlg ueb6wtqlg = pLYbCSTk0.L4EwGfXiQ;
            uEb6wTQlg ueb6wtqlg2 = pLYbCSTk0.L4EwGfXiQ;
            juufjqtjC juufjqtjc = juufjqtjC.sk5s77z6Q;
            int i6 = ((i3 << 3) & 896) | 6;
            wpxpbwg1j.zHl31GGXU(1546167803);
            if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                wpxpbwg1j.wIZEdYHUn();
                if (wpxpbwg1j.vNtjxmzUM) {
                    wpxpbwg1j.vPSbyrYWX(juufjqtjc);
                } else {
                    wpxpbwg1j.ln3nf7LH3();
                }
                wpxpbwg1j.WaUP0CF08 = false;
                Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, qVUwofr5s, xUKgrGMGQ.tGV7Q6urW);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, nbnrgo77h, xUKgrGMGQ.kCA6Zs9sL);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X, xUKgrGMGQ.dIocxURUo);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, xUKgrGMGQ.GPLPRo6go);
                MKjNdn1sw mKjNdn1sw = MKjNdn1sw.kmSgne1rO;
                if (wpxpbwg1j.vNtjxmzUM) {
                    wpxpbwg1j.J4Ux7ym32(qih4lW99W.q3BipwRCk, new MAZDnzQe5(mKjNdn1sw));
                }
                wpxpbwg1j.MzoOEjc4X();
                kkcqgcx5g.WaUP0CF08(wpxpbwg1j, Integer.valueOf((i6 >> 6) & 14));
                wpxpbwg1j.ilHKhw3Yw(true);
                wpxpbwg1j.ilHKhw3Yw(false);
            } else {
                j22ftfeNI();
                throw null;
            }
        } else {
            wpxpbwg1j.igRQEZxnW();
            bgIsSUB3d3 = bgIsSUB3d2;
        }
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new IqXXnNh4t(bgIsSUB3d3, kkcqgcx5g, nbnrgo77h, i, i2);
        }
    }

    public static final String IG30YE5GU(float f, int i) {
        int max = Math.max(i, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - ((float) i2) >= 0.5f) {
            i2++;
        }
        float f3 = ((float) i2) / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final boolean INnK5Rew6(Ltw4aaKkh ltw4aaKkh, Ltw4aaKkh ltw4aaKkh2) {
        if (ltw4aaKkh != null) {
            if (ltw4aaKkh instanceof rESgwfV20) {
                rESgwfV20 resgwfv20 = (rESgwfV20) ltw4aaKkh;
                if (!resgwfv20.q3BipwRCk() || anXlDk6fV.tGV7Q6urW(ltw4aaKkh, ltw4aaKkh2) || anXlDk6fV.tGV7Q6urW(resgwfv20.tGV7Q6urW, ((rESgwfV20) ltw4aaKkh2).tGV7Q6urW)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final float[] IytU16YUK(float[] fArr, float[] fArr2, float[] fArr3) {
        BL4OzhZBd(fArr, fArr2);
        BL4OzhZBd(fArr, fArr3);
        return n4UIOvAko(QSbMsHU5X(fArr), OpLJtmvFM(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final NzvP5Rex8 IzM1cD9ly(BgIsSUB3d bgIsSUB3d) {
        return nlGCs0NZs(-985542424, true, new bilXJq405(bgIsSUB3d));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final long J4Ux7ym32(float r10, float r11, float r12, float r13, con.J8UIfudgU r14) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xpuSUT7Gh.J4Ux7ym32(float, float, float, float, con.J8UIfudgU):long");
    }

    public static final FJQyC64rH KBYw84i3W(vdahrAJJh vdahrajjh, rJ0s9PfCL rj0s9pfcl) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-1998939043);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        float f = vdahrajjh.J4Ux7ym32;
        float f2 = vdahrajjh.tGV7Q6urW;
        float f3 = vdahrajjh.dIocxURUo;
        float f4 = vdahrajjh.kCA6Zs9sL;
        String str = vdahrajjh.q3BipwRCk;
        long j = vdahrajjh.GPLPRo6go;
        int i = vdahrajjh.Puu3Rhg4F;
        poAUpaBYd qFBXIgpia = qFBXIgpia(wpxpbwg1j, -819890981, true, new yp133LcAm(vdahrajjh));
        wpxpbwg1j.zHl31GGXU(-1998940692);
        AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
        float MzoOEjc4X = aU29aHa4X.MzoOEjc4X(f);
        float MzoOEjc4X2 = aU29aHa4X.MzoOEjc4X(f2);
        if (Float.isNaN(f3)) {
            f3 = MzoOEjc4X;
        }
        if (Float.isNaN(f4)) {
            f4 = MzoOEjc4X2;
        }
        wpxpbwg1j.zHl31GGXU(-1998939971);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i2 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            dfpT1j18n = new FJQyC64rH();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        FJQyC64rH fJQyC64rH = (FJQyC64rH) dfpT1j18n;
        long J4Ux7ym32 = gThLCaTO1.J4Ux7ym32(MzoOEjc4X, MzoOEjc4X2);
        ((prCJwNx2x) fJQyC64rH.iiGwOFFnr).CBQ5d1kRq(new tbzY8QG6X(J4Ux7ym32));
        fJQyC64rH.iiGwOFFnr(str, f3, f4, qFBXIgpia, wpxpbwg1j, 35840);
        wpxpbwg1j.ilHKhw3Yw(false);
        gLDxq5bwv.kCA6Zs9sL(new OHQikj1zE(fJQyC64rH, j, i), wpxpbwg1j);
        wpxpbwg1j.ilHKhw3Yw(false);
        wpxpbwg1j.ilHKhw3Yw(false);
        return fJQyC64rH;
    }

    public static aZDaaZZJA L4EwGfXiQ(FRJidynr8 fRJidynr8, int i, int i2, Map map, PmanMZxiM pmanMZxiM) {
        return new S2p8WH8eJ(i, i2, map, fRJidynr8, pmanMZxiM);
    }

    public static final int MzoOEjc4X(ArrayList arrayList, int i, int i2) {
        int ln3nf7LH3 = ln3nf7LH3(arrayList, i, i2);
        return ln3nf7LH3 >= 0 ? ln3nf7LH3 : -(ln3nf7LH3 + 1);
    }

    public static final int NyWTwPF6V(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final float[] OpLJtmvFM(float[] fArr, float[] fArr2) {
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr[0] * fArr2[3], fArr[1] * fArr2[4], fArr[2] * fArr2[5], fArr[0] * fArr2[6], fArr[1] * fArr2[7], fArr[2] * fArr2[8]};
    }

    public static final boolean PSTqBLTET(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final void Puu3Rhg4F(List list, int i, String str, bZmnXN812 bzmnxn812, float f, bZmnXN812 bzmnxn8122, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, rJ0s9PfCL rj0s9pfcl, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(435826864);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i6 & 2) != 0) {
            int i10 = fpjpWAHwn.q3BipwRCk;
            i7 = 0;
        } else {
            i7 = i;
        }
        String str2 = (i6 & 4) != 0 ? "" : str;
        bZmnXN812 bzmnxn8123 = (i6 & 8) != 0 ? null : bzmnxn812;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        bZmnXN812 bzmnxn8124 = (i6 & 32) != 0 ? null : bzmnxn8122;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        if ((i6 & 256) != 0) {
            int i11 = fpjpWAHwn.q3BipwRCk;
            i8 = 0;
        } else {
            i8 = i2;
        }
        if ((i6 & 512) != 0) {
            int i12 = fpjpWAHwn.q3BipwRCk;
            i9 = 0;
        } else {
            i9 = i3;
        }
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        cdDDj163c cdddj163c = cdDDj163c.kmSgne1rO;
        wpXpbWG1J wpxpbwg1j2 = wpxpbwg1j;
        wpxpbwg1j2.zHl31GGXU(-2103250935);
        if (wpxpbwg1j2.J4Ux7ym32 instanceof dGRcjwJnj) {
            wpxpbwg1j2.QSbMsHU5X();
            if (wpxpbwg1j2.vNtjxmzUM) {
                wpxpbwg1j2.vPSbyrYWX(new GunsxZ6tg(cdddj163c, 4));
            } else {
                wpxpbwg1j2.ln3nf7LH3();
            }
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, str2, z9kzqBPgK.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, list, kt9INMA46.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, new BM5bZVvAe(i7), fSdWmlSaV.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bzmnxn8123, J5F1g9uKO.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f8), h4wJoUJ5W.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bzmnxn8124, WiSRYboh4.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f9), ULrC5UiqP.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f10), wlQIkUe7X.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, new O4O9M8RBT(i9), wtygOwdaQ.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, new vyxsUqAQM(i8), DUkcdxWlA.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f11), u6XkawBSm.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f12), l5dlXQIoj.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f13), A79dmAkwY.kmSgne1rO);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, Float.valueOf(f14), gTdiugz1G.kmSgne1rO);
            wpxpbwg1j2.ilHKhw3Yw(true);
            wpxpbwg1j2.ilHKhw3Yw(false);
            rESgwfV20 Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
            if (Eeka1udhb != null) {
                Eeka1udhb.dIocxURUo = new dQAXtrbZ4(list, i7, str2, bzmnxn8123, f8, bzmnxn8124, f9, f10, i8, i9, f11, f12, f13, f14, i4, i5, i6);
                return;
            }
            return;
        }
        j22ftfeNI();
        throw null;
    }

    public static final void QNqj6nIzv(pLYbCSTk0 plybcstk0, List list, boolean z) {
        KB2jjcOAK IzM1cD9ly = plybcstk0.V9LQMKGJe.ilHKhw3Yw.IzM1cD9ly(z);
        if ((IzM1cD9ly == null ? null : Boolean.valueOf(list.add(IzM1cD9ly))) == null) {
            List Puu3Rhg4F = plybcstk0.Puu3Rhg4F();
            int i = 0;
            int size = Puu3Rhg4F.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    QNqj6nIzv((pLYbCSTk0) Puu3Rhg4F.get(i), list, z);
                    if (i2 <= size) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final float[] QSbMsHU5X(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final int R2hkbNqWf(long j) {
        J8UIfudgU iiGwOFFnr = bO2dbmrf7.iiGwOFFnr(j);
        if (iiGwOFFnr.dIocxURUo()) {
            return (int) (j >>> 32);
        }
        float[] EBQXiIPmm = EBQXiIPmm(j);
        mUqPm6GBh(iiGwOFFnr, null, 0, 3).q3BipwRCk(EBQXiIPmm);
        return ((int) ((EBQXiIPmm[2] * 255.0f) + 0.5f)) | (((int) ((EBQXiIPmm[3] * 255.0f) + 0.5f)) << 24) | (((int) ((EBQXiIPmm[0] * 255.0f) + 0.5f)) << 16) | (((int) ((EBQXiIPmm[1] * 255.0f) + 0.5f)) << 8);
    }

    public static final void RG6kpfv3v(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    public static final int SuKhTJIQc(int i) {
        return 1 << (((i % 10) * 3) + 1);
    }

    public static final Ltw4aaKkh TyB1UUd72(rJ0s9PfCL rj0s9pfcl) {
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        rESgwfV20 sk5s77z6Q = wpxpbwg1j.sk5s77z6Q();
        if (sk5s77z6Q != null) {
            wpxpbwg1j.o4LF8RkoQ(sk5s77z6Q);
            return sk5s77z6Q;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final BgIsSUB3d V9LQMKGJe(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new NgoI8w9IM(pmanMZxiM, f7B6YCXHx.kmSgne1rO));
    }

    public static final void WaUP0CF08(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    public static final double XYT7vJqNO(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final void buPcffgdD(KB2jjcOAK kB2jjcOAK) {
        x5UCe9JiC x5uce9jic = ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).PSTqBLTET;
        if (x5uce9jic == null) {
            x5uce9jic = null;
        }
        PJrc76djZ pJrc76djZ = eyXmWvcoX.q3BipwRCk;
        if (((e58gNYlqI) ((fb3DLy6Ym) x5uce9jic).hKeU0pt2N(eyXmWvcoX.q3BipwRCk)).q3BipwRCk) {
            p62TZmTyO.Bhmn1KIah(kB2jjcOAK);
        } else {
            p62TZmTyO.dXrmkklc8(kB2jjcOAK);
        }
        int i = 0;
        List KBYw84i3W = kB2jjcOAK.KBYw84i3W(false);
        int size = KBYw84i3W.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                buPcffgdD((KB2jjcOAK) KBYw84i3W.get(i));
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public static final int cAwN510t2(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final long dIocxURUo(long j) {
        long j2 = (j & 4294967295L) << 32;
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        return j2;
    }

    public static final int dXrmkklc8(int[] iArr, int i) {
        int i2 = i * 5;
        return NyWTwPF6V(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final BgIsSUB3d dfpT1j18n(BgIsSUB3d bgIsSUB3d, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? ODug2UCW1.sk5s77z6Q(bgIsSUB3d, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, true, 12283) : bgIsSUB3d;
    }

    public static final BgIsSUB3d i0Zug1mVk(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new mMUU7bQQy(pmanMZxiM, f7B6YCXHx.kmSgne1rO));
    }

    public static J8UIfudgU i8XZMQc6Z(J8UIfudgU j8UIfudgU, oeZPZXh5R oezpzxh5r, TSFe8IL8E tSFe8IL8E, int i) {
        TSFe8IL8E tSFe8IL8E2;
        if ((i & 2) != 0) {
            oWhsE8IPp owhse8ipp = TSFe8IL8E.J4Ux7ym32;
            oWhsE8IPp owhse8ipp2 = TSFe8IL8E.J4Ux7ym32;
            tSFe8IL8E2 = TSFe8IL8E.tGV7Q6urW;
        } else {
            tSFe8IL8E2 = null;
        }
        long j = j8UIfudgU.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
        if (!eAsjC32WK.q3BipwRCk(j, eAsjC32WK.J4Ux7ym32)) {
            return j8UIfudgU;
        }
        mVycGceov mvycgceov = (mVycGceov) j8UIfudgU;
        if (CpG0imbht(mvycgceov.dIocxURUo, oezpzxh5r)) {
            return j8UIfudgU;
        }
        return new mVycGceov(mvycgceov.q3BipwRCk, mvycgceov.Puu3Rhg4F, oezpzxh5r, n4UIOvAko(IytU16YUK(tSFe8IL8E2.q3BipwRCk, mvycgceov.dIocxURUo.q3BipwRCk(), oezpzxh5r.q3BipwRCk()), mvycgceov.yWvV4ePLl), mvycgceov.vPSbyrYWX, mvycgceov.kmSgne1rO, mvycgceov.kCA6Zs9sL, mvycgceov.iiGwOFFnr, mvycgceov.GPLPRo6go, -1);
    }

    public static final KB2jjcOAK iMyQMM6Qj(KB2jjcOAK kB2jjcOAK) {
        KB2jjcOAK iMyQMM6Qj;
        KB2jjcOAK iMyQMM6Qj2;
        KB2jjcOAK iMyQMM6Qj3;
        KB2jjcOAK iMyQMM6Qj4;
        KB2jjcOAK iMyQMM6Qj5;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        boolean z = true;
        if (ordinal != 0) {
            boolean z2 = false;
            if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D != null) {
                    int ordinal2 = pwwzaxl9D.D91ZKn9BG().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            KB2jjcOAK iMyQMM6Qj6 = iMyQMM6Qj(pwwzaxl9D);
                            return iMyQMM6Qj6 == null ? pwwzaxl9D : iMyQMM6Qj6;
                        } else if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 == 4) {
                                    KB2jjcOAK iMyQMM6Qj7 = iMyQMM6Qj(pwwzaxl9D);
                                    if (iMyQMM6Qj7 != null) {
                                        return iMyQMM6Qj7;
                                    }
                                    List KBYw84i3W = kB2jjcOAK.KBYw84i3W(false);
                                    int size = KBYw84i3W.size() - 1;
                                    if (size >= 0) {
                                        boolean z3 = false;
                                        while (true) {
                                            int i = size - 1;
                                            if (z3 && (iMyQMM6Qj3 = iMyQMM6Qj((KB2jjcOAK) KBYw84i3W.get(size))) != null) {
                                                return iMyQMM6Qj3;
                                            }
                                            if (anXlDk6fV.tGV7Q6urW(KBYw84i3W.get(size), pwwzaxl9D)) {
                                                z3 = true;
                                            }
                                            if (i < 0) {
                                                break;
                                            }
                                            size = i;
                                        }
                                    }
                                    if (kB2jjcOAK.OpLJtmvFM() != null) {
                                        z = false;
                                    }
                                    if (z) {
                                        return null;
                                    }
                                    return kB2jjcOAK;
                                } else if (ordinal2 != 5) {
                                    throw new dnCerKhAM();
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    List KBYw84i3W2 = kB2jjcOAK.KBYw84i3W(false);
                    int size2 = KBYw84i3W2.size() - 1;
                    if (size2 >= 0) {
                        boolean z4 = false;
                        while (true) {
                            int i2 = size2 - 1;
                            if (z4 && (iMyQMM6Qj2 = iMyQMM6Qj((KB2jjcOAK) KBYw84i3W2.get(size2))) != null) {
                                return iMyQMM6Qj2;
                            }
                            if (anXlDk6fV.tGV7Q6urW(KBYw84i3W2.get(size2), pwwzaxl9D)) {
                                z4 = true;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    if (kB2jjcOAK.OpLJtmvFM() != null) {
                        z = false;
                    }
                    if (z) {
                        return null;
                    }
                    return kB2jjcOAK;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    KB2jjcOAK kB2jjcOAK2 = (KB2jjcOAK) wkFJfVmcv.juJ6pnCpu(kB2jjcOAK.KBYw84i3W(true));
                    if (kB2jjcOAK2 == null) {
                        return null;
                    }
                    return iMyQMM6Qj(kB2jjcOAK2);
                } else if (ordinal == 4) {
                    KB2jjcOAK pwwzaxl9D2 = kB2jjcOAK.pwwzaxl9D();
                    if (pwwzaxl9D2 != null) {
                        int ordinal3 = pwwzaxl9D2.D91ZKn9BG().ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                KB2jjcOAK iMyQMM6Qj8 = iMyQMM6Qj(pwwzaxl9D2);
                                return iMyQMM6Qj8 == null ? pwwzaxl9D2 : iMyQMM6Qj8;
                            } else if (ordinal3 != 2) {
                                if (ordinal3 != 3) {
                                    if (ordinal3 == 4) {
                                        KB2jjcOAK iMyQMM6Qj9 = iMyQMM6Qj(pwwzaxl9D2);
                                        if (iMyQMM6Qj9 != null) {
                                            return iMyQMM6Qj9;
                                        }
                                        List KBYw84i3W3 = kB2jjcOAK.KBYw84i3W(false);
                                        int size3 = KBYw84i3W3.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i3 = size3 - 1;
                                                if (z2 && (iMyQMM6Qj5 = iMyQMM6Qj((KB2jjcOAK) KBYw84i3W3.get(size3))) != null) {
                                                    return iMyQMM6Qj5;
                                                }
                                                if (anXlDk6fV.tGV7Q6urW(KBYw84i3W3.get(size3), pwwzaxl9D2)) {
                                                    z2 = true;
                                                }
                                                if (i3 < 0) {
                                                    break;
                                                }
                                                size3 = i3;
                                            }
                                        }
                                        return null;
                                    } else if (ordinal3 != 5) {
                                        throw new dnCerKhAM();
                                    }
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        }
                        List KBYw84i3W4 = kB2jjcOAK.KBYw84i3W(false);
                        int size4 = KBYw84i3W4.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i4 = size4 - 1;
                                if (z2 && (iMyQMM6Qj4 = iMyQMM6Qj((KB2jjcOAK) KBYw84i3W4.get(size4))) != null) {
                                    return iMyQMM6Qj4;
                                }
                                if (anXlDk6fV.tGV7Q6urW(KBYw84i3W4.get(size4), pwwzaxl9D2)) {
                                    z2 = true;
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size4 = i4;
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                } else if (ordinal != 5) {
                    throw new dnCerKhAM();
                }
            }
        }
        KB2jjcOAK kB2jjcOAK3 = (KB2jjcOAK) wkFJfVmcv.juJ6pnCpu(kB2jjcOAK.KBYw84i3W(true));
        return (kB2jjcOAK3 == null || (iMyQMM6Qj = iMyQMM6Qj(kB2jjcOAK3)) == null) ? kB2jjcOAK : iMyQMM6Qj;
    }

    public static final KB2jjcOAK igRQEZxnW(KB2jjcOAK kB2jjcOAK) {
        KB2jjcOAK igRQEZxnW;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3)) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return kB2jjcOAK;
                        }
                        throw new dnCerKhAM();
                    }
                }
            }
            KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
            if (pwwzaxl9D != null) {
                KB2jjcOAK igRQEZxnW2 = igRQEZxnW(pwwzaxl9D);
                if (igRQEZxnW2 != null) {
                    return igRQEZxnW2;
                }
                List KBYw84i3W = kB2jjcOAK.KBYw84i3W(false);
                int size = KBYw84i3W.size() - 1;
                if (size >= 0) {
                    boolean z = false;
                    while (true) {
                        int i2 = i + 1;
                        if (z && (igRQEZxnW = igRQEZxnW((KB2jjcOAK) KBYw84i3W.get(i))) != null) {
                            return igRQEZxnW;
                        }
                        if (anXlDk6fV.tGV7Q6urW(KBYw84i3W.get(i), pwwzaxl9D)) {
                            z = true;
                        }
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                return null;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        List KBYw84i3W2 = kB2jjcOAK.KBYw84i3W(false);
        int size2 = KBYw84i3W2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i3 = i + 1;
                KB2jjcOAK igRQEZxnW3 = igRQEZxnW((KB2jjcOAK) KBYw84i3W2.get(i));
                if (igRQEZxnW3 != null) {
                    return igRQEZxnW3;
                }
                if (i3 > size2) {
                    break;
                }
                i = i3;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void iiGwOFFnr(java.lang.String r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, java.util.List r25, con.kkcQgCx5G r26, con.rJ0s9PfCL r27, int r28, int r29) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xpuSUT7Gh.iiGwOFFnr(java.lang.String, float, float, float, float, float, float, float, java.util.List, con.kkcQgCx5G, con.rJ0s9PfCL, int, int):void");
    }

    public static final int ilHKhw3Yw(long j) {
        int i = 32;
        if ((4294967295L & j) == 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    public static final void ixWaw2akD(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
            iArr[(i * 5) + 3] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final void j22ftfeNI() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final Kh7ffW4RH juJ6pnCpu(bu5cjmae6 bu5cjmae6) {
        int i = Kh7ffW4RH.yWvV4ePLl;
        Kh7ffW4RH kh7ffW4RH = (Kh7ffW4RH) bu5cjmae6.get(LQcLPKzab.CBQ5d1kRq);
        if (kh7ffW4RH != null) {
            return kh7ffW4RH;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static long kCA6Zs9sL(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return tGV7Q6urW(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final z3ICU5k15 kktL0P5MG(rJ0s9PfCL rj0s9pfcl) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-1359197906);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.juJ6pnCpu(206, G7WvUK4mQ.iiGwOFFnr);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        uJhqmS3nE ujhqms3ne = dfpT1j18n instanceof uJhqmS3nE ? (uJhqmS3nE) dfpT1j18n : null;
        if (ujhqms3ne == null) {
            ujhqms3ne = new uJhqmS3nE(new s949OxqB2(wpxpbwg1j, wpxpbwg1j.i0Zug1mVk, wpxpbwg1j.MzoOEjc4X));
            wpxpbwg1j.INnK5Rew6(ujhqms3ne);
        }
        ((prCJwNx2x) ujhqms3ne.CBQ5d1kRq.kCA6Zs9sL).CBQ5d1kRq(wpxpbwg1j.CBQ5d1kRq());
        wpxpbwg1j.ilHKhw3Yw(false);
        s949OxqB2 s949oxqb2 = ujhqms3ne.CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        return s949oxqb2;
    }

    public static final boolean kmSgne1rO(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final int ln3nf7LH3(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((EuSwp7OG7) arrayList.get(i4)).q3BipwRCk;
            if (i5 < 0) {
                i5 += i2;
            }
            int oon79WMrY = anXlDk6fV.oon79WMrY(i5, i);
            if (oon79WMrY < 0) {
                i3 = i4 + 1;
            } else if (oon79WMrY <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static dJZmIm0Ve mUqPm6GBh(J8UIfudgU j8UIfudgU, J8UIfudgU j8UIfudgU2, int i, int i2) {
        if ((i2 & 1) != 0) {
            FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
            j8UIfudgU2 = FVP3dB50k.dIocxURUo;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (j8UIfudgU == j8UIfudgU2) {
            return new rDi30WAfY(j8UIfudgU, 1);
        }
        long j = j8UIfudgU.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
        long j2 = eAsjC32WK.J4Ux7ym32;
        return (!eAsjC32WK.q3BipwRCk(j, j2) || !eAsjC32WK.q3BipwRCk(j8UIfudgU2.J4Ux7ym32, j2)) ? new dJZmIm0Ve(j8UIfudgU, j8UIfudgU2, i, null) : new XJ0pIA6br((mVycGceov) j8UIfudgU, (mVycGceov) j8UIfudgU2, i, null);
    }

    public static final float[] n4UIOvAko(float[] fArr, float[] fArr2) {
        float f = fArr[3] * fArr2[1];
        float f2 = fArr[6] * fArr2[2];
        float f3 = fArr[4] * fArr2[1];
        float f4 = fArr[7] * fArr2[2];
        float f5 = fArr[5] * fArr2[1];
        return new float[]{f2 + f + (fArr[0] * fArr2[0]), f4 + f3 + (fArr[1] * fArr2[0]), (fArr[8] * fArr2[2]) + f5 + (fArr[2] * fArr2[0]), (fArr[6] * fArr2[5]) + (fArr[3] * fArr2[4]) + (fArr[0] * fArr2[3]), (fArr[7] * fArr2[5]) + (fArr[4] * fArr2[4]) + (fArr[1] * fArr2[3]), (fArr[8] * fArr2[5]) + (fArr[5] * fArr2[4]) + (fArr[2] * fArr2[3]), (fArr[6] * fArr2[8]) + (fArr[3] * fArr2[7]) + (fArr[0] * fArr2[6]), (fArr[7] * fArr2[8]) + (fArr[4] * fArr2[7]) + (fArr[1] * fArr2[6]), (fArr[8] * fArr2[8]) + (fArr[5] * fArr2[7]) + (fArr[2] * fArr2[6])};
    }

    public static final poAUpaBYd nlGCs0NZs(int i, boolean z, Object obj) {
        J9LUUfNUi j9LUUfNUi = new J9LUUfNUi(i, z);
        j9LUUfNUi.iiGwOFFnr(obj);
        return j9LUUfNUi;
    }

    public static final BgIsSUB3d o4LF8RkoQ(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(bgIsSUB3d, f7B6YCXHx.kmSgne1rO, new ZlwKx93xF(pmanMZxiM, 0));
    }

    public static final int oon79WMrY(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final SI0VpKubr q3BipwRCk(Y3ibtOJiE y3ibtOJiE) {
        Canvas canvas = RvtysjeZn.q3BipwRCk;
        YSo0hTREC ySo0hTREC = new YSo0hTREC();
        ySo0hTREC.q3BipwRCk = new Canvas(p62TZmTyO.PSTqBLTET(y3ibtOJiE));
        return ySo0hTREC;
    }

    public static final poAUpaBYd qFBXIgpia(rJ0s9PfCL rj0s9pfcl, int i, boolean z, Object obj) {
        J9LUUfNUi j9LUUfNUi;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.EBQXiIPmm(i, null, false, null);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i2 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            j9LUUfNUi = new J9LUUfNUi(i, z);
            wpxpbwg1j.INnK5Rew6(j9LUUfNUi);
        } else {
            Objects.requireNonNull(dfpT1j18n, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            j9LUUfNUi = (J9LUUfNUi) dfpT1j18n;
        }
        j9LUUfNUi.iiGwOFFnr(obj);
        wpxpbwg1j.ilHKhw3Yw(false);
        return j9LUUfNUi;
    }

    public static final int qVUwofr5s(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 134217727;
    }

    public static final void sk5s77z6Q(int[] iArr, int i, int i2) {
        if (i2 >= 0 && i2 < 134217727) {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & -134217728);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final long tGV7Q6urW(int i) {
        long j = ((long) i) << 32;
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        return j;
    }

    public static final int vNtjxmzUM(int i) {
        return 2 << (((i % 10) * 3) + 1);
    }

    public static final Float vPSbyrYWX(Map map, Object obj) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (anXlDk6fV.tGV7Q6urW(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    public static final float wIZEdYHUn(long j) {
        J8UIfudgU iiGwOFFnr = bO2dbmrf7.iiGwOFFnr(j);
        long j2 = iiGwOFFnr.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
        if (eAsjC32WK.q3BipwRCk(j2, eAsjC32WK.J4Ux7ym32)) {
            PmanMZxiM pmanMZxiM = ((mVycGceov) iiGwOFFnr).Bhmn1KIah;
            double doubleValue = ((Number) pmanMZxiM.IytU16YUK(Double.valueOf((double) bO2dbmrf7.Puu3Rhg4F(j)))).doubleValue();
            double doubleValue2 = ((Number) pmanMZxiM.IytU16YUK(Double.valueOf((double) bO2dbmrf7.kCA6Zs9sL(j)))).doubleValue() * 0.0722d;
            float doubleValue3 = (float) (doubleValue2 + (((Number) pmanMZxiM.IytU16YUK(Double.valueOf((double) bO2dbmrf7.GPLPRo6go(j)))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d));
            if (doubleValue3 <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue3 >= 1.0f) {
                return 1.0f;
            }
            return doubleValue3;
        }
        throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("The specified color must be encoded in an RGB color space. The supplied color space is ", eAsjC32WK.J4Ux7ym32(iiGwOFFnr.J4Ux7ym32)).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void yWvV4ePLl(con.ZOOhBHi6I r23, java.util.Map r24, con.rJ0s9PfCL r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 581
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xpuSUT7Gh.yWvV4ePLl(con.ZOOhBHi6I, java.util.Map, con.rJ0s9PfCL, int, int):void");
    }

    public static final long ziwPzaoF3(long j, long j2, float f) {
        FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
        J8UIfudgU j8UIfudgU = FVP3dB50k.RG6kpfv3v;
        long q3BipwRCk = bO2dbmrf7.q3BipwRCk(j, j8UIfudgU);
        long q3BipwRCk2 = bO2dbmrf7.q3BipwRCk(j2, j8UIfudgU);
        float dIocxURUo = bO2dbmrf7.dIocxURUo(q3BipwRCk);
        float Puu3Rhg4F = bO2dbmrf7.Puu3Rhg4F(q3BipwRCk);
        float GPLPRo6go = bO2dbmrf7.GPLPRo6go(q3BipwRCk);
        float kCA6Zs9sL = bO2dbmrf7.kCA6Zs9sL(q3BipwRCk);
        float dIocxURUo2 = bO2dbmrf7.dIocxURUo(q3BipwRCk2);
        float Puu3Rhg4F2 = bO2dbmrf7.Puu3Rhg4F(q3BipwRCk2);
        float GPLPRo6go2 = bO2dbmrf7.GPLPRo6go(q3BipwRCk2);
        float kCA6Zs9sL2 = bO2dbmrf7.kCA6Zs9sL(q3BipwRCk2);
        return bO2dbmrf7.q3BipwRCk(J4Ux7ym32(BBVaGLNaU.qFBXIgpia(Puu3Rhg4F, Puu3Rhg4F2, f), BBVaGLNaU.qFBXIgpia(GPLPRo6go, GPLPRo6go2, f), BBVaGLNaU.qFBXIgpia(kCA6Zs9sL, kCA6Zs9sL2, f), BBVaGLNaU.qFBXIgpia(dIocxURUo, dIocxURUo2, f), j8UIfudgU), bO2dbmrf7.iiGwOFFnr(j2));
    }
}
