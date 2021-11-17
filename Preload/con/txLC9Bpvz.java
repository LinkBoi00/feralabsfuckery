package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class txLC9Bpvz {
    public static final int J4Ux7ym32(JYTRn9Ica jYTRn9Ica, int i) {
        if (i < 0 || i >= jYTRn9Ica.tGV7Q6urW) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Index ", i, ", size ");
            q3BipwRCk.append(jYTRn9Ica.tGV7Q6urW);
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        }
        List list = jYTRn9Ica.J4Ux7ym32;
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(list);
        int i2 = 0;
        while (i2 < CBQ5d1kRq) {
            int i3 = ((CBQ5d1kRq - i2) / 2) + i2;
            int i4 = ((Lw10f0Sd9) list.get(i3)).q3BipwRCk;
            if (i4 != i) {
                if (i4 < i) {
                    i2 = i3 + 1;
                    if (i < ((Lw10f0Sd9) list.get(i2)).q3BipwRCk) {
                    }
                } else {
                    CBQ5d1kRq = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0256 A[LOOP:0: B:147:0x0254->B:148:0x0256, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(BgIsSUB3d bgIsSUB3d, cnnoFa4Tx cnnofa4tx, MHv2Ig8xA mHv2Ig8xA, boolean z, boolean z2, IzQNDLr32 izQNDLr32, phqQlbVE3 phqqlbve3, MEtaL9md5 mEtaL9md5, T0XFCDCob t0XFCDCob, xrlB614az xrlb614az, PmanMZxiM pmanMZxiM, rJ0s9PfCL rj0s9pfcl, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        xrlB614az xrlb614az2;
        T0XFCDCob t0XFCDCob2;
        MEtaL9md5 mEtaL9md52;
        phqQlbVE3 phqqlbve32;
        wpXpbWG1J wpxpbwg1j;
        rESgwfV20 Eeka1udhb;
        Object dfpT1j18n;
        Object obj;
        boolean iiGwOFFnr;
        Object dfpT1j18n2;
        boolean iiGwOFFnr2;
        Object dfpT1j18n3;
        int i9;
        int i10;
        boolean z3;
        UBY2Inzw8 uBY2Inzw8;
        boolean z4;
        Object dfpT1j18n4;
        Object obj2;
        ox1v3fq6f ox1v3fq6f;
        Object dfpT1j18n5;
        boolean z5;
        boolean iiGwOFFnr3;
        Object dfpT1j18n6;
        wpXpbWG1J wpxpbwg1j2 = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j2.ziwPzaoF3(-908839111);
        Object obj3 = G7WvUK4mQ.q3BipwRCk;
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (wpxpbwg1j2.iiGwOFFnr(bgIsSUB3d) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= wpxpbwg1j2.iiGwOFFnr(cnnofa4tx) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= wpxpbwg1j2.iiGwOFFnr(mHv2Ig8xA) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= wpxpbwg1j2.GPLPRo6go(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= wpxpbwg1j2.GPLPRo6go(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((458752 & i) == 0) {
            i4 |= wpxpbwg1j2.iiGwOFFnr(izQNDLr32) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i) == 0) {
            i4 |= wpxpbwg1j2.iiGwOFFnr(phqqlbve3) ? 1048576 : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i4 |= wpxpbwg1j2.iiGwOFFnr(mEtaL9md5) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i4 |= wpxpbwg1j2.iiGwOFFnr(t0XFCDCob) ? 67108864 : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                i4 |= wpxpbwg1j2.iiGwOFFnr(xrlb614az) ? 536870912 : 268435456;
            }
            if ((i3 & 1024) == 0) {
                i8 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                i8 = i2 | (wpxpbwg1j2.iiGwOFFnr(pmanMZxiM) ? 4 : 2);
            } else {
                i8 = i2;
            }
            if (((i4 & 1533916891) ^ 306783378) == 0 || ((i8 & 11) ^ 2) != 0 || !wpxpbwg1j2.i8XZMQc6Z()) {
                phqQlbVE3 phqqlbve33 = i11 == 0 ? null : phqqlbve3;
                MEtaL9md5 mEtaL9md53 = i5 == 0 ? null : mEtaL9md5;
                T0XFCDCob t0XFCDCob3 = i6 == 0 ? null : t0XFCDCob;
                xrlB614az xrlb614az3 = i7 == 0 ? null : xrlb614az;
                ypLiboX2O q3BipwRCk = DfyNE1564.q3BipwRCk(wpxpbwg1j2);
                wpxpbwg1j2.zHl31GGXU(-3687241);
                dfpT1j18n = wpxpbwg1j2.dfpT1j18n();
                int i12 = rJ0s9PfCL.q3BipwRCk;
                obj = P7Re99G8L.J4Ux7ym32;
                if (dfpT1j18n == obj) {
                    dfpT1j18n = new R7CNZOOL2();
                    wpxpbwg1j2.INnK5Rew6(dfpT1j18n);
                }
                wpxpbwg1j2.ilHKhw3Yw(false);
                R7CNZOOL2 r7cnzool2 = (R7CNZOOL2) dfpT1j18n;
                wpxpbwg1j2.zHl31GGXU(-1542806777);
                UBY2Inzw8 iiGwOFFnr4 = u51fgFYkV.iiGwOFFnr(pmanMZxiM, wpxpbwg1j2, (((((i4 >> 3) & 14) | ((i8 << 3) & 112)) | 512) >> 3) & 14);
                wpxpbwg1j2.zHl31GGXU(-3686930);
                iiGwOFFnr = wpxpbwg1j2.iiGwOFFnr(cnnofa4tx);
                dfpT1j18n2 = wpxpbwg1j2.dfpT1j18n();
                if (!iiGwOFFnr || dfpT1j18n2 == obj) {
                    dfpT1j18n2 = u51fgFYkV.dIocxURUo(fAbN97osx.q3BipwRCk(cnnofa4tx.q3BipwRCk.q3BipwRCk), null, 2, null);
                    wpxpbwg1j2.INnK5Rew6(dfpT1j18n2);
                }
                wpxpbwg1j2.ilHKhw3Yw(false);
                RNEcgN6dQ rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n2;
                gLDxq5bwv.J4Ux7ym32(rNEcgN6dQ, new oOkHFILdT(cnnofa4tx, rNEcgN6dQ, null), wpxpbwg1j2);
                wpxpbwg1j2.zHl31GGXU(-3686930);
                iiGwOFFnr2 = wpxpbwg1j2.iiGwOFFnr(rNEcgN6dQ);
                dfpT1j18n3 = wpxpbwg1j2.dfpT1j18n();
                if (!iiGwOFFnr2 || dfpT1j18n3 == obj) {
                    dfpT1j18n3 = u51fgFYkV.tGV7Q6urW(new atgZEnsDc(iiGwOFFnr4, r7cnzool2, rNEcgN6dQ));
                    wpxpbwg1j2.INnK5Rew6(dfpT1j18n3);
                }
                wpxpbwg1j2.ilHKhw3Yw(false);
                UBY2Inzw8 uBY2Inzw82 = (UBY2Inzw8) dfpT1j18n3;
                wpxpbwg1j2.ilHKhw3Yw(false);
                wpxpbwg1j2.zHl31GGXU(434385930);
                Object[] objArr = {cnnofa4tx, q3BipwRCk, mHv2Ig8xA, Boolean.valueOf(z), Boolean.valueOf(z2), phqqlbve33, t0XFCDCob3, xrlb614az3, mEtaL9md53};
                wpxpbwg1j2.zHl31GGXU(-3685570);
                i10 = 0;
                z3 = false;
                for (i9 = 9; i10 < i9; i9 = 9) {
                    Object obj4 = objArr[i10];
                    i10++;
                    z3 |= wpxpbwg1j2.iiGwOFFnr(obj4);
                }
                Object dfpT1j18n7 = wpxpbwg1j2.dfpT1j18n();
                if (!z3) {
                    int i13 = rJ0s9PfCL.q3BipwRCk;
                    if (dfpT1j18n7 != P7Re99G8L.J4Ux7ym32) {
                        z4 = false;
                        uBY2Inzw8 = uBY2Inzw82;
                        wpxpbwg1j = wpxpbwg1j2;
                        wpxpbwg1j.ilHKhw3Yw(z4);
                        E1sOlrROE e1sOlrROE = (E1sOlrROE) dfpT1j18n7;
                        wpxpbwg1j.ilHKhw3Yw(z4);
                        wpxpbwg1j.zHl31GGXU(1707618476);
                        Object obj5 = G7WvUK4mQ.q3BipwRCk;
                        wpxpbwg1j.zHl31GGXU(-3687241);
                        dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                        int i14 = rJ0s9PfCL.q3BipwRCk;
                        obj2 = P7Re99G8L.J4Ux7ym32;
                        if (dfpT1j18n4 == obj2) {
                            dfpT1j18n4 = new mKU9R6cnm();
                            wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        wpxpbwg1j.ilHKhw3Yw(false);
                        cnnofa4tx.kmSgne1rO = (mKU9R6cnm) dfpT1j18n4;
                        bb216AtXv sk5s77z6Q = pz7YPhQTU.sk5s77z6Q(wpxpbwg1j);
                        cnnofa4tx.oon79WMrY = sk5s77z6Q;
                        ox1v3fq6f = (ox1v3fq6f) uBY2Inzw8.getValue();
                        if (ox1v3fq6f.J4Ux7ym32.tGV7Q6urW > 0) {
                            zyHgQCuXb zyhgqcuxb = cnnofa4tx.q3BipwRCk;
                            zyhgqcuxb.q3BipwRCk(zyHgQCuXb.GPLPRo6go.q3BipwRCk(zyhgqcuxb.iiGwOFFnr, zyhgqcuxb.q3BipwRCk, ox1v3fq6f), zyhgqcuxb.J4Ux7ym32);
                        }
                        wpxpbwg1j.zHl31GGXU(-723524056);
                        wpxpbwg1j.zHl31GGXU(-3687241);
                        dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
                        if (dfpT1j18n5 == obj2) {
                            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
                            wpxpbwg1j.INnK5Rew6(vqT05HRsg);
                            dfpT1j18n5 = vqT05HRsg;
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n5).CBQ5d1kRq;
                        wpxpbwg1j.ilHKhw3Yw(false);
                        BgIsSUB3d WaUP0CF08 = pA5wCkne4.sk5s77z6Q(bgIsSUB3d, false, new kYIvlkwwJ(z, z2, uBY2Inzw8, cnnofa4tx, oqkvjgxir), 1).WaUP0CF08(z2 ? icndHY7dz.tGV7Q6urW : icndHY7dz.J4Ux7ym32);
                        njjwS3RZT njjws3rzt = z2 ? njjwS3RZT.Vertical : njjwS3RZT.Horizontal;
                        wpxpbwg1j.zHl31GGXU(-908836542);
                        z5 = !z;
                        if ((wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY) == BFRsKhrQv.Rtl) && !z2) {
                            z5 = !z5;
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        BgIsSUB3d kCA6Zs9sL = BEG6ENxHu.kCA6Zs9sL(clxs8reLS.J4Ux7ym32(WaUP0CF08, cnnofa4tx, njjws3rzt, q3BipwRCk, true, z5, izQNDLr32, cnnofa4tx.tGV7Q6urW), mHv2Ig8xA);
                        mKU9R6cnm mku9r6cnm = cnnofa4tx.kmSgne1rO;
                        wpxpbwg1j.zHl31GGXU(-3686930);
                        iiGwOFFnr3 = wpxpbwg1j.iiGwOFFnr(uBY2Inzw8);
                        dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
                        if (!iiGwOFFnr3 || dfpT1j18n6 == obj2) {
                            dfpT1j18n6 = new RHl0HuzrL(uBY2Inzw8, 1);
                            wpxpbwg1j.INnK5Rew6(dfpT1j18n6);
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        p62TZmTyO.dIocxURUo((gdEmqfwpT) dfpT1j18n6, kCA6Zs9sL, sk5s77z6Q, mku9r6cnm, e1sOlrROE, wpxpbwg1j, 0, 0);
                        phqqlbve32 = phqqlbve33;
                        mEtaL9md52 = mEtaL9md53;
                        t0XFCDCob2 = t0XFCDCob3;
                        xrlb614az2 = xrlb614az3;
                    }
                }
                uBY2Inzw8 = uBY2Inzw82;
                wpxpbwg1j = wpxpbwg1j2;
                E1sOlrROE e1sOlrROE2 = new E1sOlrROE(z2, uBY2Inzw82, cnnofa4tx, r7cnzool2, mHv2Ig8xA, mEtaL9md53, xrlb614az3, z, phqqlbve33, t0XFCDCob3, q3BipwRCk);
                wpxpbwg1j.INnK5Rew6(e1sOlrROE2);
                dfpT1j18n7 = e1sOlrROE2;
                z4 = false;
                wpxpbwg1j.ilHKhw3Yw(z4);
                E1sOlrROE e1sOlrROE3 = (E1sOlrROE) dfpT1j18n7;
                wpxpbwg1j.ilHKhw3Yw(z4);
                wpxpbwg1j.zHl31GGXU(1707618476);
                Object obj52 = G7WvUK4mQ.q3BipwRCk;
                wpxpbwg1j.zHl31GGXU(-3687241);
                dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                int i142 = rJ0s9PfCL.q3BipwRCk;
                obj2 = P7Re99G8L.J4Ux7ym32;
                if (dfpT1j18n4 == obj2) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                wpxpbwg1j.ilHKhw3Yw(false);
                cnnofa4tx.kmSgne1rO = (mKU9R6cnm) dfpT1j18n4;
                bb216AtXv sk5s77z6Q2 = pz7YPhQTU.sk5s77z6Q(wpxpbwg1j);
                cnnofa4tx.oon79WMrY = sk5s77z6Q2;
                ox1v3fq6f = (ox1v3fq6f) uBY2Inzw8.getValue();
                if (ox1v3fq6f.J4Ux7ym32.tGV7Q6urW > 0) {
                }
                wpxpbwg1j.zHl31GGXU(-723524056);
                wpxpbwg1j.zHl31GGXU(-3687241);
                dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
                if (dfpT1j18n5 == obj2) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                oQkvjGXIr oqkvjgxir2 = ((VqT05HRsg) dfpT1j18n5).CBQ5d1kRq;
                wpxpbwg1j.ilHKhw3Yw(false);
                BgIsSUB3d WaUP0CF082 = pA5wCkne4.sk5s77z6Q(bgIsSUB3d, false, new kYIvlkwwJ(z, z2, uBY2Inzw8, cnnofa4tx, oqkvjgxir2), 1).WaUP0CF08(z2 ? icndHY7dz.tGV7Q6urW : icndHY7dz.J4Ux7ym32);
                if (z2) {
                }
                wpxpbwg1j.zHl31GGXU(-908836542);
                z5 = !z;
                if (wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY) == BFRsKhrQv.Rtl) {
                    z5 = !z5;
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                BgIsSUB3d kCA6Zs9sL2 = BEG6ENxHu.kCA6Zs9sL(clxs8reLS.J4Ux7ym32(WaUP0CF082, cnnofa4tx, njjws3rzt, q3BipwRCk, true, z5, izQNDLr32, cnnofa4tx.tGV7Q6urW), mHv2Ig8xA);
                mKU9R6cnm mku9r6cnm2 = cnnofa4tx.kmSgne1rO;
                wpxpbwg1j.zHl31GGXU(-3686930);
                iiGwOFFnr3 = wpxpbwg1j.iiGwOFFnr(uBY2Inzw8);
                dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr3) {
                }
                dfpT1j18n6 = new RHl0HuzrL(uBY2Inzw8, 1);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n6);
                wpxpbwg1j.ilHKhw3Yw(false);
                p62TZmTyO.dIocxURUo((gdEmqfwpT) dfpT1j18n6, kCA6Zs9sL2, sk5s77z6Q2, mku9r6cnm2, e1sOlrROE3, wpxpbwg1j, 0, 0);
                phqqlbve32 = phqqlbve33;
                mEtaL9md52 = mEtaL9md53;
                t0XFCDCob2 = t0XFCDCob3;
                xrlb614az2 = xrlb614az3;
            } else {
                wpxpbwg1j2.igRQEZxnW();
                phqqlbve32 = phqqlbve3;
                mEtaL9md52 = mEtaL9md5;
                xrlb614az2 = xrlb614az;
                wpxpbwg1j = wpxpbwg1j2;
                t0XFCDCob2 = t0XFCDCob;
            }
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
                Eeka1udhb.dIocxURUo = new bCMkZFIMT(bgIsSUB3d, cnnofa4tx, mHv2Ig8xA, z, z2, izQNDLr32, phqqlbve32, mEtaL9md52, t0XFCDCob2, xrlb614az2, pmanMZxiM, i, i2, i3);
                return;
            }
            return;
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if (((i4 & 1533916891) ^ 306783378) == 0) {
        }
        if (i11 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        ypLiboX2O q3BipwRCk2 = DfyNE1564.q3BipwRCk(wpxpbwg1j2);
        wpxpbwg1j2.zHl31GGXU(-3687241);
        dfpT1j18n = wpxpbwg1j2.dfpT1j18n();
        int i122 = rJ0s9PfCL.q3BipwRCk;
        obj = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj) {
        }
        wpxpbwg1j2.ilHKhw3Yw(false);
        R7CNZOOL2 r7cnzool22 = (R7CNZOOL2) dfpT1j18n;
        wpxpbwg1j2.zHl31GGXU(-1542806777);
        UBY2Inzw8 iiGwOFFnr42 = u51fgFYkV.iiGwOFFnr(pmanMZxiM, wpxpbwg1j2, (((((i4 >> 3) & 14) | ((i8 << 3) & 112)) | 512) >> 3) & 14);
        wpxpbwg1j2.zHl31GGXU(-3686930);
        iiGwOFFnr = wpxpbwg1j2.iiGwOFFnr(cnnofa4tx);
        dfpT1j18n2 = wpxpbwg1j2.dfpT1j18n();
        if (!iiGwOFFnr) {
        }
        dfpT1j18n2 = u51fgFYkV.dIocxURUo(fAbN97osx.q3BipwRCk(cnnofa4tx.q3BipwRCk.q3BipwRCk), null, 2, null);
        wpxpbwg1j2.INnK5Rew6(dfpT1j18n2);
        wpxpbwg1j2.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ2 = (RNEcgN6dQ) dfpT1j18n2;
        gLDxq5bwv.J4Ux7ym32(rNEcgN6dQ2, new oOkHFILdT(cnnofa4tx, rNEcgN6dQ2, null), wpxpbwg1j2);
        wpxpbwg1j2.zHl31GGXU(-3686930);
        iiGwOFFnr2 = wpxpbwg1j2.iiGwOFFnr(rNEcgN6dQ2);
        dfpT1j18n3 = wpxpbwg1j2.dfpT1j18n();
        if (!iiGwOFFnr2) {
        }
        dfpT1j18n3 = u51fgFYkV.tGV7Q6urW(new atgZEnsDc(iiGwOFFnr42, r7cnzool22, rNEcgN6dQ2));
        wpxpbwg1j2.INnK5Rew6(dfpT1j18n3);
        wpxpbwg1j2.ilHKhw3Yw(false);
        UBY2Inzw8 uBY2Inzw822 = (UBY2Inzw8) dfpT1j18n3;
        wpxpbwg1j2.ilHKhw3Yw(false);
        wpxpbwg1j2.zHl31GGXU(434385930);
        Object[] objArr2 = {cnnofa4tx, q3BipwRCk2, mHv2Ig8xA, Boolean.valueOf(z), Boolean.valueOf(z2), phqqlbve33, t0XFCDCob3, xrlb614az3, mEtaL9md53};
        wpxpbwg1j2.zHl31GGXU(-3685570);
        i10 = 0;
        z3 = false;
        while (i10 < i9) {
        }
        Object dfpT1j18n72 = wpxpbwg1j2.dfpT1j18n();
        if (!z3) {
        }
        uBY2Inzw8 = uBY2Inzw822;
        wpxpbwg1j = wpxpbwg1j2;
        E1sOlrROE e1sOlrROE22 = new E1sOlrROE(z2, uBY2Inzw822, cnnofa4tx, r7cnzool22, mHv2Ig8xA, mEtaL9md53, xrlb614az3, z, phqqlbve33, t0XFCDCob3, q3BipwRCk2);
        wpxpbwg1j.INnK5Rew6(e1sOlrROE22);
        dfpT1j18n72 = e1sOlrROE22;
        z4 = false;
        wpxpbwg1j.ilHKhw3Yw(z4);
        E1sOlrROE e1sOlrROE32 = (E1sOlrROE) dfpT1j18n72;
        wpxpbwg1j.ilHKhw3Yw(z4);
        wpxpbwg1j.zHl31GGXU(1707618476);
        Object obj522 = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.zHl31GGXU(-3687241);
        dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
        int i1422 = rJ0s9PfCL.q3BipwRCk;
        obj2 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n4 == obj2) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        wpxpbwg1j.ilHKhw3Yw(false);
        cnnofa4tx.kmSgne1rO = (mKU9R6cnm) dfpT1j18n4;
        bb216AtXv sk5s77z6Q22 = pz7YPhQTU.sk5s77z6Q(wpxpbwg1j);
        cnnofa4tx.oon79WMrY = sk5s77z6Q22;
        ox1v3fq6f = (ox1v3fq6f) uBY2Inzw8.getValue();
        if (ox1v3fq6f.J4Ux7ym32.tGV7Q6urW > 0) {
        }
        wpxpbwg1j.zHl31GGXU(-723524056);
        wpxpbwg1j.zHl31GGXU(-3687241);
        dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n5 == obj2) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir22 = ((VqT05HRsg) dfpT1j18n5).CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        BgIsSUB3d WaUP0CF0822 = pA5wCkne4.sk5s77z6Q(bgIsSUB3d, false, new kYIvlkwwJ(z, z2, uBY2Inzw8, cnnofa4tx, oqkvjgxir22), 1).WaUP0CF08(z2 ? icndHY7dz.tGV7Q6urW : icndHY7dz.J4Ux7ym32);
        if (z2) {
        }
        wpxpbwg1j.zHl31GGXU(-908836542);
        z5 = !z;
        if (wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY) == BFRsKhrQv.Rtl) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        BgIsSUB3d kCA6Zs9sL22 = BEG6ENxHu.kCA6Zs9sL(clxs8reLS.J4Ux7ym32(WaUP0CF0822, cnnofa4tx, njjws3rzt, q3BipwRCk2, true, z5, izQNDLr32, cnnofa4tx.tGV7Q6urW), mHv2Ig8xA);
        mKU9R6cnm mku9r6cnm22 = cnnofa4tx.kmSgne1rO;
        wpxpbwg1j.zHl31GGXU(-3686930);
        iiGwOFFnr3 = wpxpbwg1j.iiGwOFFnr(uBY2Inzw8);
        dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
        if (!iiGwOFFnr3) {
        }
        dfpT1j18n6 = new RHl0HuzrL(uBY2Inzw8, 1);
        wpxpbwg1j.INnK5Rew6(dfpT1j18n6);
        wpxpbwg1j.ilHKhw3Yw(false);
        p62TZmTyO.dIocxURUo((gdEmqfwpT) dfpT1j18n6, kCA6Zs9sL22, sk5s77z6Q22, mku9r6cnm22, e1sOlrROE32, wpxpbwg1j, 0, 0);
        phqqlbve32 = phqqlbve33;
        mEtaL9md52 = mEtaL9md53;
        t0XFCDCob2 = t0XFCDCob3;
        xrlb614az2 = xrlb614az3;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    public static final cnnoFa4Tx tGV7Q6urW(int i, int i2, rJ0s9PfCL rj0s9pfcl, int i3) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(690738043);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        cnnoFa4Tx cnnofa4tx = (cnnoFa4Tx) uI1r9gOOH.q3BipwRCk(new Object[0], cnnoFa4Tx.Bhmn1KIah.GPLPRo6go(), null, new jLul7pBWy(i, i2), wpxpbwg1j, 4);
        wpxpbwg1j.ilHKhw3Yw(false);
        return cnnofa4tx;
    }
}
