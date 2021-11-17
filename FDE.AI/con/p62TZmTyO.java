package con;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;
/* loaded from: classes.dex */
public abstract class p62TZmTyO {
    public static final void AqaWJg0b4(KB2jjcOAK kB2jjcOAK, boolean z) {
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (z) {
                    kB2jjcOAK.DEe4ujgEA(kB2jjcOAK.D91ZKn9BG());
                    return;
                } else if (Eeka1udhb(pwwzaxl9D, false, 1)) {
                    IytU16YUK(kB2jjcOAK, z);
                    kB2jjcOAK.zH62iiANw(null);
                    return;
                } else {
                    return;
                }
            } else if (!(ordinal == 2 || ordinal == 3 || ordinal == 4)) {
                if (ordinal == 5) {
                    KB2jjcOAK OpLJtmvFM = kB2jjcOAK.OpLJtmvFM();
                    if (OpLJtmvFM != null) {
                        mUqPm6GBh(OpLJtmvFM, kB2jjcOAK, z);
                        return;
                    } else if (NyWTwPF6V(kB2jjcOAK)) {
                        IytU16YUK(kB2jjcOAK, z);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        kB2jjcOAK.DEe4ujgEA(kB2jjcOAK.D91ZKn9BG());
    }

    public static final void Bhmn1KIah(KB2jjcOAK kB2jjcOAK) {
        ftmnXRQmW ftmnxrqmw;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal == 3) {
            ftmnxrqmw = ftmnXRQmW.Inactive;
        } else if (ordinal == 4) {
            ftmnxrqmw = ftmnXRQmW.ActiveParent;
        } else {
            return;
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (con.anXlDk6fV.tGV7Q6urW(con.xP6F5SR9v.Bhmn1KIah(r0, con.VSVuhz7Ow.CBQ5d1kRq), java.lang.Boolean.TRUE) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean CBQ5d1kRq(con.or5nbo9ku r2) {
        /*
            con.ogG45sslV r0 = r2.kCA6Zs9sL
            con.JCsIEQgIX r1 = con.JCsIEQgIX.q3BipwRCk
            con.SHlGWJTIu r1 = con.JCsIEQgIX.yWvV4ePLl
            boolean r0 = r0.J4Ux7ym32(r1)
            if (r0 == 0) goto L_0x001f
            con.ogG45sslV r0 = r2.kCA6Zs9sL
            con.VSVuhz7Ow r1 = con.VSVuhz7Ow.q3BipwRCk
            con.SHlGWJTIu r1 = con.VSVuhz7Ow.CBQ5d1kRq
            java.lang.Object r0 = con.xP6F5SR9v.Bhmn1KIah(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = con.anXlDk6fV.tGV7Q6urW(r0, r1)
            if (r0 != 0) goto L_0x001f
            goto L_0x0049
        L_0x001f:
            con.pLYbCSTk0 r2 = r2.GPLPRo6go
            con.DlhjQ2PrY r0 = con.DlhjQ2PrY.AqaWJg0b4
            con.pLYbCSTk0 r2 = WaUP0CF08(r2, r0)
            r0 = 0
            if (r2 == 0) goto L_0x004a
            con.mhjbbkjEL r2 = con.BBVaGLNaU.dXrmkklc8(r2)
            if (r2 != 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            con.ogG45sslV r2 = r2.eylCJcWC7()
            if (r2 != 0) goto L_0x0039
        L_0x0037:
            r2 = r0
            goto L_0x0047
        L_0x0039:
            con.VSVuhz7Ow r1 = con.VSVuhz7Ow.q3BipwRCk
            con.SHlGWJTIu r1 = con.VSVuhz7Ow.CBQ5d1kRq
            java.lang.Object r2 = con.xP6F5SR9v.Bhmn1KIah(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r2 = con.anXlDk6fV.tGV7Q6urW(r2, r1)
        L_0x0047:
            if (r2 != 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.CBQ5d1kRq(con.or5nbo9ku):boolean");
    }

    public static final boolean CpG0imbht(TB2AsrPRd tB2AsrPRd, boolean z) {
        mnTaxtMa7 mntaxtma7;
        UwmKmkwV0 uwmKmkwV0 = tB2AsrPRd.dIocxURUo;
        if (uwmKmkwV0 == null || (mntaxtma7 = uwmKmkwV0.kCA6Zs9sL) == null) {
            return false;
        }
        mnTaxtMa7 iMyQMM6Qj = iMyQMM6Qj(mntaxtma7);
        bzmJZsHMu ilHKhw3Yw = ilHKhw3Yw(mntaxtma7);
        qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) iMyQMM6Qj;
        long uSBmk4hFZ = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.q3BipwRCk, ilHKhw3Yw.J4Ux7ym32));
        long uSBmk4hFZ2 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.tGV7Q6urW, ilHKhw3Yw.J4Ux7ym32));
        long uSBmk4hFZ3 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.tGV7Q6urW, ilHKhw3Yw.dIocxURUo));
        long uSBmk4hFZ4 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.q3BipwRCk, ilHKhw3Yw.dIocxURUo));
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ);
        float[] fArr = {bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ2), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ4), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ3)};
        for (int i = 0; i < 3; i++) {
            tGV7Q6urW = Math.min(tGV7Q6urW, fArr[i]);
        }
        float dIocxURUo = bRgfgYIQX.dIocxURUo(uSBmk4hFZ);
        float[] fArr2 = {bRgfgYIQX.dIocxURUo(uSBmk4hFZ2), bRgfgYIQX.dIocxURUo(uSBmk4hFZ4), bRgfgYIQX.dIocxURUo(uSBmk4hFZ3)};
        for (int i2 = 0; i2 < 3; i2++) {
            dIocxURUo = Math.min(dIocxURUo, fArr2[i2]);
        }
        float tGV7Q6urW2 = bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ);
        float[] fArr3 = {bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ2), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ4), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ3)};
        int i3 = 0;
        for (int i4 = 3; i3 < i4; i4 = 3) {
            tGV7Q6urW2 = Math.max(tGV7Q6urW2, fArr3[i3]);
            i3++;
        }
        float dIocxURUo2 = bRgfgYIQX.dIocxURUo(uSBmk4hFZ);
        float[] fArr4 = {bRgfgYIQX.dIocxURUo(uSBmk4hFZ2), bRgfgYIQX.dIocxURUo(uSBmk4hFZ4), bRgfgYIQX.dIocxURUo(uSBmk4hFZ3)};
        for (int i5 = 0; i5 < 3; i5++) {
            dIocxURUo2 = Math.max(dIocxURUo2, fArr4[i5]);
        }
        qhaZGYFO8 qhazgyfo82 = (qhaZGYFO8) mntaxtma7;
        long tTcQQNK5P = qhazgyfo82.tTcQQNK5P(new bzmJZsHMu(tGV7Q6urW, dIocxURUo, tGV7Q6urW2, dIocxURUo2).dIocxURUo());
        long tTcQQNK5P2 = qhazgyfo82.tTcQQNK5P(ODug2UCW1.dIocxURUo(tGV7Q6urW2, dIocxURUo2));
        float tGV7Q6urW3 = bRgfgYIQX.tGV7Q6urW(tTcQQNK5P);
        float dIocxURUo3 = bRgfgYIQX.dIocxURUo(tTcQQNK5P);
        float tGV7Q6urW4 = bRgfgYIQX.tGV7Q6urW(tTcQQNK5P2);
        float dIocxURUo4 = bRgfgYIQX.dIocxURUo(tTcQQNK5P2);
        long Puu3Rhg4F = tB2AsrPRd.Puu3Rhg4F(z);
        float tGV7Q6urW5 = bRgfgYIQX.tGV7Q6urW(Puu3Rhg4F);
        if (tGV7Q6urW3 <= tGV7Q6urW5 && tGV7Q6urW5 <= tGV7Q6urW4) {
            float dIocxURUo5 = bRgfgYIQX.dIocxURUo(Puu3Rhg4F);
            if (dIocxURUo3 <= dIocxURUo5 && dIocxURUo5 <= dIocxURUo4) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean Eeka1udhb(KB2jjcOAK kB2jjcOAK, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return qVUwofr5s(kB2jjcOAK, z);
    }

    public static final void GPLPRo6go(BgIsSUB3d bgIsSUB3d, JZuV4yGnu jZuV4yGnu, long j, long j2, float f, BgIsSUB3d bgIsSUB3d2, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i) {
        int i2;
        long j3;
        long j4;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-750961828);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i & 14) == 0) {
            i2 = (wpxpbwg1j.iiGwOFFnr(bgIsSUB3d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(jZuV4yGnu) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= wpxpbwg1j.kCA6Zs9sL(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= wpxpbwg1j.kCA6Zs9sL(j2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(null) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= wpxpbwg1j.tGV7Q6urW(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(kkcqgcx5g) ? 8388608 : 4194304;
        }
        if (((i2 & 23967451) ^ 4793490) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
            ead9RRQSb ead9rrqsb = (ead9RRQSb) wpxpbwg1j.oon79WMrY(yQA1x14I8.q3BipwRCk);
            hOY2Rgtej hoy2rgtej = yQA1x14I8.J4Ux7ym32;
            float f2 = ((lRwPpHNL9) wpxpbwg1j.oon79WMrY(hoy2rgtej)).CBQ5d1kRq + f;
            wpxpbwg1j.zHl31GGXU(-750961449);
            hOY2Rgtej hoy2rgtej2 = aaizp84lL.q3BipwRCk;
            if (!bO2dbmrf7.tGV7Q6urW(j, ((q56y96RYz) wpxpbwg1j.oon79WMrY(hoy2rgtej2)).yWvV4ePLl()) || ead9rrqsb == null) {
                j3 = j;
            } else {
                q56y96RYz q56y96ryz = (q56y96RYz) wpxpbwg1j.oon79WMrY(hoy2rgtej2);
                if (Float.compare(f2, (float) 0) <= 0 || q56y96ryz.oon79WMrY()) {
                    j4 = j;
                } else {
                    hOY2Rgtej hoy2rgtej3 = yQA1x14I8.q3BipwRCk;
                    j4 = xpuSUT7Gh.AqaWJg0b4(bO2dbmrf7.J4Ux7ym32(aaizp84lL.q3BipwRCk(j, wpxpbwg1j), ((((float) Math.log((double) (((float) 1) + f2))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j);
                }
                j3 = j4;
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{pJroOTB7B.q3BipwRCk.J4Ux7ym32(new bO2dbmrf7(j2)), hoy2rgtej.J4Ux7ym32(new lRwPpHNL9(f2))}, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819902018, true, new IdeqGXvyg(bgIsSUB3d, f, jZuV4yGnu, j3, bgIsSUB3d2, kkcqgcx5g, i2, 0)), wpxpbwg1j, 56);
        } else {
            wpxpbwg1j.igRQEZxnW();
        }
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new WNsZsRD1I(bgIsSUB3d, jZuV4yGnu, j, j2, f, bgIsSUB3d2, kkcqgcx5g, i);
        }
    }

    public static final void IytU16YUK(KB2jjcOAK kB2jjcOAK, boolean z) {
        ftmnXRQmW ftmnxrqmw;
        ftmnXRQmW ftmnxrqmw2;
        KB2jjcOAK kB2jjcOAK2 = (KB2jjcOAK) wkFJfVmcv.QNqj6nIzv(kB2jjcOAK.KBYw84i3W(false));
        if (kB2jjcOAK2 == null || !z) {
            int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal == 2) {
                    ftmnxrqmw = ftmnXRQmW.Captured;
                    ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                    kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
                    return;
                } else if (ordinal == 3 || ordinal == 4) {
                    throw new IllegalStateException("Granting focus to a deactivated node.".toString());
                } else if (ordinal != 5) {
                    throw new dnCerKhAM();
                }
            }
            ftmnxrqmw = ftmnXRQmW.Active;
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            return;
        }
        int ordinal2 = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (!(ordinal2 == 0 || ordinal2 == 1)) {
            if (ordinal2 == 2) {
                return;
            }
            if (ordinal2 == 3 || ordinal2 == 4) {
                ftmnxrqmw2 = ftmnXRQmW.DeactivatedParent;
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
                IytU16YUK(kB2jjcOAK2, z);
            } else if (ordinal2 != 5) {
                throw new dnCerKhAM();
            }
        }
        ftmnxrqmw2 = ftmnXRQmW.ActiveParent;
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
        IytU16YUK(kB2jjcOAK2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void J4Ux7ym32(con.D3PUCzPxK r18, boolean r19, con.BgIsSUB3d r20, con.EVoQ2RqaN r21, con.JzLhkMe5F r22, java.lang.String r23, con.NzvP5Rex8 r24, con.rJ0s9PfCL r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.J4Ux7ym32(con.D3PUCzPxK, boolean, con.BgIsSUB3d, con.EVoQ2RqaN, con.JzLhkMe5F, java.lang.String, con.NzvP5Rex8, con.rJ0s9PfCL, int, int):void");
    }

    public static final bzmJZsHMu MzoOEjc4X(mnTaxtMa7 mntaxtma7) {
        qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
        mnTaxtMa7 M66hQ219i = qhazgyfo8.M66hQ219i();
        return M66hQ219i == null ? new bzmJZsHMu(0.0f, 0.0f, (float) YWiUMZOtw.tGV7Q6urW(qhazgyfo8.Bhmn1KIah), (float) YWiUMZOtw.J4Ux7ym32(qhazgyfo8.Bhmn1KIah)) : gThLCaTO1.ilHKhw3Yw(M66hQ219i, mntaxtma7, false, 2, null);
    }

    public static final boolean NyWTwPF6V(KB2jjcOAK kB2jjcOAK) {
        jRWr6Yc4S jrwr6yc4s = kB2jjcOAK.MzoOEjc4X.qVUwofr5s;
        if (jrwr6yc4s != null) {
            return jrwr6yc4s.requestFocus();
        }
        throw new IllegalArgumentException("Owner not initialized.".toString());
    }

    public static final Bitmap PSTqBLTET(Y3ibtOJiE y3ibtOJiE) {
        if (y3ibtOJiE instanceof tNgdvtcFW) {
            return ((tNgdvtcFW) y3ibtOJiE).J4Ux7ym32;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void Puu3Rhg4F(boolean r9, con.sL9xhCFIS r10, con.TB2AsrPRd r11, con.rJ0s9PfCL r12, int r13) {
        /*
            con.wpXpbWG1J r12 = (con.wpXpbWG1J) r12
            r0 = -1630620397(0xffffffff9eceb513, float:-2.1885989E-20)
            r12.ziwPzaoF3(r0)
            java.lang.Object r0 = con.G7WvUK4mQ.q3BipwRCk
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r12.zHl31GGXU(r1)
            boolean r0 = r12.iiGwOFFnr(r0)
            boolean r1 = r12.iiGwOFFnr(r11)
            r0 = r0 | r1
            java.lang.Object r1 = r12.dfpT1j18n()
            if (r0 != 0) goto L_0x0029
            int r0 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r0 = con.P7Re99G8L.J4Ux7ym32
            if (r1 != r0) goto L_0x0031
        L_0x0029:
            con.frX9jolH3 r1 = new con.frX9jolH3
            r1.<init>(r11, r9)
            r12.INnK5Rew6(r1)
        L_0x0031:
            r0 = 0
            r12.ilHKhw3Yw(r0)
            con.NUBOYYpO5 r1 = (con.NUBOYYpO5) r1
            long r2 = r11.Puu3Rhg4F(r9)
            con.eTxfvEx3L r0 = r11.kCA6Zs9sL
            long r4 = r0.J4Ux7ym32
            boolean r4 = con.czCYotiRn.Puu3Rhg4F(r4)
            int r0 = con.BgIsSUB3d.Puu3Rhg4F
            con.H11ySchUh r0 = con.H11ySchUh.CBQ5d1kRq
            con.WFb41TQqn r5 = new con.WFb41TQqn
            r6 = 0
            r5.<init>(r1, r6)
            con.BgIsSUB3d r5 = con.VpcjuZfOq.q3BipwRCk(r0, r1, r5)
            r0 = 196608(0x30000, float:2.75506E-40)
            int r1 = r13 << 3
            r7 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r0 = r2
            r2 = r9
            r3 = r10
            r7 = r12
            con.pz7YPhQTU.iiGwOFFnr(r0, r2, r3, r4, r5, r6, r7, r8)
            con.rESgwfV20 r12 = r12.Eeka1udhb()
            if (r12 != 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            con.gRy6syfBG r0 = new con.gRy6syfBG
            r0.<init>(r9, r10, r11, r13)
            r12.dIocxURUo = r0
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.Puu3Rhg4F(boolean, con.sL9xhCFIS, con.TB2AsrPRd, con.rJ0s9PfCL, int):void");
    }

    public static final BgIsSUB3d RG6kpfv3v(BgIsSUB3d bgIsSUB3d, kkcQgCx5G kkcqgcx5g, PmanMZxiM pmanMZxiM, njjwS3RZT njjws3rzt, boolean z, RqP4RtdHY rqP4RtdHY, gdEmqfwpT gdemqfwpt, NzvP5Rex8 nzvP5Rex8, NzvP5Rex8 nzvP5Rex82, boolean z2) {
        boolean z3 = Rjnc3TWC6.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(bgIsSUB3d, f7B6YCXHx.kmSgne1rO, new oPtznyhSA(kkcqgcx5g, rqP4RtdHY, gdemqfwpt, pmanMZxiM, nzvP5Rex8, nzvP5Rex82, njjws3rzt, z, z2));
    }

    public static final Bitmap.Config V9LQMKGJe(int i) {
        oWhsE8IPp owhse8ipp = QrGf69nPE.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = QrGf69nPE.q3BipwRCk;
        if (!QrGf69nPE.q3BipwRCk(i, 0)) {
            if (QrGf69nPE.q3BipwRCk(i, 1)) {
                return Bitmap.Config.ALPHA_8;
            }
            if (QrGf69nPE.q3BipwRCk(i, 2)) {
                return Bitmap.Config.RGB_565;
            }
            if (QrGf69nPE.q3BipwRCk(i, 3)) {
                return Bitmap.Config.RGBA_F16;
            }
            if (QrGf69nPE.q3BipwRCk(i, 4)) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final pLYbCSTk0 WaUP0CF08(pLYbCSTk0 plybcstk0, PmanMZxiM pmanMZxiM) {
        do {
            plybcstk0 = plybcstk0.oon79WMrY();
            if (plybcstk0 == null) {
                return null;
            }
        } while (!((Boolean) pmanMZxiM.IytU16YUK(plybcstk0)).booleanValue());
        return plybcstk0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v13, types: [con.qhaZGYFO8] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void cAwN510t2(android.graphics.Region r10, con.or5nbo9ku r11, java.util.Map r12, con.or5nbo9ku r13) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.cAwN510t2(android.graphics.Region, con.or5nbo9ku, java.util.Map, con.or5nbo9ku):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
        if (r13 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0145;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void dIocxURUo(con.gdEmqfwpT r20, con.BgIsSUB3d r21, con.bb216AtXv r22, con.mKU9R6cnm r23, con.E1sOlrROE r24, con.rJ0s9PfCL r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.dIocxURUo(con.gdEmqfwpT, con.BgIsSUB3d, con.bb216AtXv, con.mKU9R6cnm, con.E1sOlrROE, con.rJ0s9PfCL, int, int):void");
    }

    public static final void dXrmkklc8(KB2jjcOAK kB2jjcOAK) {
        VQ5lQYeWH focusManager;
        ftmnXRQmW ftmnxrqmw = ftmnXRQmW.Deactivated;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ftmnxrqmw = ftmnXRQmW.DeactivatedParent;
            } else if (ordinal != 2) {
                if (ordinal != 5) {
                    return;
                }
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
        }
        jRWr6Yc4S jrwr6yc4s = kB2jjcOAK.MzoOEjc4X.qVUwofr5s;
        if (!(jrwr6yc4s == null || (focusManager = jrwr6yc4s.getFocusManager()) == null)) {
            ((EBke9S31I) focusManager).q3BipwRCk(true);
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
    }

    public static final int dfpT1j18n(CharSequence charSequence, int i) {
        int i2 = i - 1;
        if (1 > i2) {
            return 0;
        }
        while (true) {
            int i3 = i2 - 1;
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            if (1 > i3) {
                return 0;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (((java.lang.Boolean) ((con.prCJwNx2x) r3).getValue()).booleanValue() != false) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (((java.lang.Boolean) r8.IytU16YUK(r7.J4Ux7ym32())).booleanValue() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.AwUV2q7WY i0Zug1mVk(con.kdbvrtBH1 r7, con.PmanMZxiM r8, java.lang.Object r9, con.rJ0s9PfCL r10) {
        /*
            con.AwUV2q7WY r0 = con.AwUV2q7WY.PostExit
            con.AwUV2q7WY r1 = con.AwUV2q7WY.PreEnter
            con.AwUV2q7WY r2 = con.AwUV2q7WY.Visible
            con.wpXpbWG1J r10 = (con.wpXpbWG1J) r10
            r3 = -721837653(0xffffffffd4f9a1ab, float:-8.5772736E12)
            r10.zHl31GGXU(r3)
            java.lang.Object r3 = con.G7WvUK4mQ.q3BipwRCk
            r3 = -721837546(0xffffffffd4f9a216, float:-8.5773297E12)
            r10.j22ftfeNI(r3, r7)
            boolean r3 = r7.GPLPRo6go()
            r4 = 0
            if (r3 == 0) goto L_0x003b
            java.lang.Object r9 = r8.IytU16YUK(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x002a
            goto L_0x007f
        L_0x002a:
            java.lang.Object r7 = r7.J4Ux7ym32()
            java.lang.Object r7 = r8.IytU16YUK(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0090
            goto L_0x0091
        L_0x003b:
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.zHl31GGXU(r3)
            java.lang.Object r3 = r10.dfpT1j18n()
            int r5 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r5 = con.P7Re99G8L.J4Ux7ym32
            if (r3 != r5) goto L_0x0056
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5 = 2
            r6 = 0
            con.RNEcgN6dQ r3 = con.u51fgFYkV.dIocxURUo(r3, r6, r5, r6)
            r10.INnK5Rew6(r3)
        L_0x0056:
            r10.ilHKhw3Yw(r4)
            con.RNEcgN6dQ r3 = (con.RNEcgN6dQ) r3
            java.lang.Object r7 = r7.J4Ux7ym32()
            java.lang.Object r7 = r8.IytU16YUK(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0073
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5 = r3
            con.prCJwNx2x r5 = (con.prCJwNx2x) r5
            r5.CBQ5d1kRq(r7)
        L_0x0073:
            java.lang.Object r7 = r8.IytU16YUK(r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0081
        L_0x007f:
            r0 = r2
            goto L_0x0091
        L_0x0081:
            con.prCJwNx2x r3 = (con.prCJwNx2x) r3
            java.lang.Object r7 = r3.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r0 = r1
        L_0x0091:
            r10.ilHKhw3Yw(r4)
            r10.ilHKhw3Yw(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.i0Zug1mVk(con.kdbvrtBH1, con.PmanMZxiM, java.lang.Object, con.rJ0s9PfCL):con.AwUV2q7WY");
    }

    public static final int i8XZMQc6Z(CharSequence charSequence, int i) {
        int i2 = i + 1;
        int length = charSequence.length();
        if (i2 < length) {
            while (true) {
                int i3 = i2 + 1;
                if (charSequence.charAt(i2) == '\n') {
                    return i2;
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return charSequence.length();
    }

    public static final mnTaxtMa7 iMyQMM6Qj(mnTaxtMa7 mntaxtma7) {
        qhaZGYFO8 qhazgyfo8;
        while (true) {
            qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
            mnTaxtMa7 M66hQ219i = qhazgyfo8.M66hQ219i();
            if (M66hQ219i == null) {
                break;
            }
            mntaxtma7 = M66hQ219i;
        }
        if (!(mntaxtma7 instanceof qhaZGYFO8)) {
            qhazgyfo8 = null;
        }
        if (qhazgyfo8 == null) {
            return mntaxtma7;
        }
        while (true) {
            qhaZGYFO8 qhazgyfo82 = qhazgyfo8.ilHKhw3Yw;
            if (qhazgyfo82 == null) {
                return qhazgyfo8;
            }
            qhazgyfo8 = qhazgyfo82;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void iiGwOFFnr(con.BgIsSUB3d r25, con.JZuV4yGnu r26, long r27, long r29, float r31, con.kkcQgCx5G r32, con.rJ0s9PfCL r33, int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.iiGwOFFnr(con.BgIsSUB3d, con.JZuV4yGnu, long, long, float, con.kkcQgCx5G, con.rJ0s9PfCL, int, int):void");
    }

    public static final bzmJZsHMu ilHKhw3Yw(mnTaxtMa7 mntaxtma7) {
        return gThLCaTO1.ilHKhw3Yw(iMyQMM6Qj(mntaxtma7), mntaxtma7, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[LOOP:0: B:21:0x0033->B:37:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0065 A[EDGE_INSN: B:44:0x0065->B:36:0x0065 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.lang.String ixWaw2akD(java.util.List r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, con.PmanMZxiM r9, int r10) {
        /*
            r5 = r10 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r4 = ", "
        L_0x0006:
            r5 = r10 & 2
            java.lang.String r6 = ""
            r8 = 0
            if (r5 == 0) goto L_0x000f
            r5 = r6
            goto L_0x0010
        L_0x000f:
            r5 = r8
        L_0x0010:
            r9 = r10 & 4
            if (r9 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r6 = r8
        L_0x0016:
            r9 = r10 & 8
            r0 = -1
            if (r9 == 0) goto L_0x001c
            r7 = r0
        L_0x001c:
            r9 = r10 & 16
            if (r9 == 0) goto L_0x0022
            java.lang.String r8 = "..."
        L_0x0022:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            int r5 = r3.size()
            int r5 = r5 + r0
            r10 = 0
            if (r5 < 0) goto L_0x0069
            r0 = r10
        L_0x0033:
            int r1 = r10 + 1
            java.lang.Object r10 = r3.get(r10)
            r2 = 1
            int r0 = r0 + r2
            if (r0 <= r2) goto L_0x0040
            r9.append(r4)
        L_0x0040:
            if (r7 < 0) goto L_0x0044
            if (r0 > r7) goto L_0x0065
        L_0x0044:
            if (r10 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            boolean r2 = r10 instanceof java.lang.CharSequence
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            goto L_0x0060
        L_0x004e:
            boolean r2 = r10 instanceof java.lang.Character
            if (r2 == 0) goto L_0x005c
            java.lang.Character r10 = (java.lang.Character) r10
            char r10 = r10.charValue()
            r9.append(r10)
            goto L_0x0063
        L_0x005c:
            java.lang.String r10 = java.lang.String.valueOf(r10)
        L_0x0060:
            r9.append(r10)
        L_0x0063:
            if (r1 <= r5) goto L_0x0067
        L_0x0065:
            r10 = r0
            goto L_0x0069
        L_0x0067:
            r10 = r1
            goto L_0x0033
        L_0x0069:
            if (r7 < 0) goto L_0x0070
            if (r10 <= r7) goto L_0x0070
            r9.append(r8)
        L_0x0070:
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.ixWaw2akD(java.util.List, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, con.PmanMZxiM, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void kCA6Zs9sL(con.gdEmqfwpT r28, con.BgIsSUB3d r29, con.JZuV4yGnu r30, long r31, long r33, float r35, con.RqP4RtdHY r36, con.D9Yt6oHyO r37, boolean r38, java.lang.String r39, con.qDffvYFss r40, con.kkcQgCx5G r41, con.rJ0s9PfCL r42, int r43, int r44, int r45) {
        /*
        // Method dump skipped, instructions count: 759
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.kCA6Zs9sL(con.gdEmqfwpT, con.BgIsSUB3d, con.JZuV4yGnu, long, long, float, con.RqP4RtdHY, con.D9Yt6oHyO, boolean, java.lang.String, con.qDffvYFss, con.kkcQgCx5G, con.rJ0s9PfCL, int, int, int):void");
    }

    public static final boolean kmSgne1rO(or5nbo9ku or5nbo9ku) {
        return or5nbo9ku.GPLPRo6go.IytU16YUK == BFRsKhrQv.Rtl;
    }

    public static final boolean mUqPm6GBh(KB2jjcOAK kB2jjcOAK, KB2jjcOAK kB2jjcOAK2, boolean z) {
        if (kB2jjcOAK.KBYw84i3W(false).contains(kB2jjcOAK2)) {
            int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
            if (ordinal == 0) {
                ftmnXRQmW ftmnxrqmw = ftmnXRQmW.ActiveParent;
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            } else if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (!Eeka1udhb(pwwzaxl9D, false, 1)) {
                    return false;
                }
            } else if (ordinal == 2) {
                return false;
            } else {
                if (ordinal == 3) {
                    Bhmn1KIah(kB2jjcOAK);
                    boolean mUqPm6GBh = mUqPm6GBh(kB2jjcOAK, kB2jjcOAK2, z);
                    dXrmkklc8(kB2jjcOAK);
                    return mUqPm6GBh;
                } else if (ordinal == 4) {
                    KB2jjcOAK pwwzaxl9D2 = kB2jjcOAK.pwwzaxl9D();
                    if (pwwzaxl9D2 != null && !Eeka1udhb(pwwzaxl9D2, false, 1)) {
                        return false;
                    }
                } else if (ordinal == 5) {
                    KB2jjcOAK OpLJtmvFM = kB2jjcOAK.OpLJtmvFM();
                    if (OpLJtmvFM == null) {
                        if (!NyWTwPF6V(kB2jjcOAK)) {
                            return false;
                        }
                        ftmnXRQmW ftmnxrqmw2 = ftmnXRQmW.Active;
                        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
                        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
                    } else if (!mUqPm6GBh(OpLJtmvFM, kB2jjcOAK, false)) {
                        return false;
                    }
                    return mUqPm6GBh(kB2jjcOAK, kB2jjcOAK2, z);
                } else {
                    throw new dnCerKhAM();
                }
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
            IytU16YUK(kB2jjcOAK2, z);
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    public static final long nlGCs0NZs(mnTaxtMa7 mntaxtma7) {
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return ((qhaZGYFO8) mntaxtma7).Ta2zrwkcM(bRgfgYIQX.tGV7Q6urW);
    }

    public static final Rect o4LF8RkoQ(bzmJZsHMu bzmjzshmu) {
        return new Rect((int) bzmjzshmu.q3BipwRCk, (int) bzmjzshmu.J4Ux7ym32, (int) bzmjzshmu.tGV7Q6urW, (int) bzmjzshmu.dIocxURUo);
    }

    public static final Object oon79WMrY(k0ugT26MT k0ugt26mt, n4f84B5OG n4f84b5og, W1NiVqEgR w1NiVqEgR, CcBVlmP2F ccBVlmP2F, boolean z, njjwS3RZT njjws3rzt, Way959ade way959ade) {
        float floatValue = ((Number) n4f84b5og.kmSgne1rO).floatValue();
        cKAQplqZy ckaqplqzy = (cKAQplqZy) n4f84b5og.CBQ5d1kRq;
        njjwS3RZT njjws3rzt2 = njjwS3RZT.Vertical;
        long dIocxURUo = njjws3rzt == njjws3rzt2 ? ODug2UCW1.dIocxURUo(0.0f, floatValue) : ODug2UCW1.dIocxURUo(floatValue, 0.0f);
        long j = ckaqplqzy.tGV7Q6urW;
        float signum = Math.signum(njjws3rzt == njjws3rzt2 ? bRgfgYIQX.dIocxURUo(j) : bRgfgYIQX.tGV7Q6urW(j));
        long kCA6Zs9sL = bRgfgYIQX.kCA6Zs9sL(j, ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(dIocxURUo) * signum, bRgfgYIQX.dIocxURUo(dIocxURUo) * signum));
        spFv56w6q spfv56w6q = (spFv56w6q) ccBVlmP2F;
        spfv56w6q.Puu3Rhg4F(new s4NxAcTJi(kCA6Zs9sL, null));
        if (z) {
            floatValue *= (float) -1;
        }
        spfv56w6q.Puu3Rhg4F(new rgshbUd80(floatValue, kCA6Zs9sL, null));
        xn7fPE2PN xn7fpe2pn = new xn7fPE2PN(w1NiVqEgR, njjws3rzt, spfv56w6q, z);
        if (njjws3rzt == njjws3rzt2) {
            return ZEpQDovLv.oon79WMrY(k0ugt26mt, ckaqplqzy.q3BipwRCk, xn7fpe2pn, way959ade);
        }
        return ZEpQDovLv.GPLPRo6go(k0ugt26mt, ckaqplqzy.q3BipwRCk, xn7fpe2pn, way959ade);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x039f, code lost:
        if (r9 == null) goto L_0x03ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ac, code lost:
        if (r9 == null) goto L_0x03ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b2, code lost:
        r9 = r9.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03da, code lost:
        if (r7 == null) goto L_0x03ed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03eb, code lost:
        if (r7 == null) goto L_0x03ed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f1, code lost:
        r7 = r7.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04b8, code lost:
        if (r10 == null) goto L_0x04ca;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04c8, code lost:
        if (r10 == null) goto L_0x04ca;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04cd, code lost:
        r10 = r10.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04ee, code lost:
        if (r11 == null) goto L_0x0502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04fb, code lost:
        if (r11 == null) goto L_0x0502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04fe, code lost:
        r22 = r11.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if (r12 == con.P7Re99G8L.J4Ux7ym32) goto L_0x00ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
        if (r15 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d1, code lost:
        if (r10 == con.P7Re99G8L.J4Ux7ym32) goto L_0x01d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0222, code lost:
        if (r10 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a4, code lost:
        if (r9 == con.P7Re99G8L.J4Ux7ym32) goto L_0x02a6;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(con.kdbvrtBH1 r32, con.PmanMZxiM r33, con.BgIsSUB3d r34, con.EVoQ2RqaN r35, con.JzLhkMe5F r36, con.NzvP5Rex8 r37, con.rJ0s9PfCL r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1920
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.q3BipwRCk(con.kdbvrtBH1, con.PmanMZxiM, con.BgIsSUB3d, con.EVoQ2RqaN, con.JzLhkMe5F, con.NzvP5Rex8, con.rJ0s9PfCL, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.xNzBgcwLi qFBXIgpia(int r42, con.rJ0s9PfCL r43, int r44) {
        /*
        // Method dump skipped, instructions count: 1298
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.qFBXIgpia(int, con.rJ0s9PfCL, int):con.xNzBgcwLi");
    }

    public static final boolean qVUwofr5s(KB2jjcOAK kB2jjcOAK, boolean z) {
        boolean qVUwofr5s;
        ftmnXRQmW ftmnxrqmw = ftmnXRQmW.Inactive;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D != null) {
                    qVUwofr5s = qVUwofr5s(pwwzaxl9D, z);
                    if (!qVUwofr5s) {
                        return qVUwofr5s;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        KB2jjcOAK pwwzaxl9D2 = kB2jjcOAK.pwwzaxl9D();
                        if (pwwzaxl9D2 != null) {
                            qVUwofr5s = qVUwofr5s(pwwzaxl9D2, z);
                            if (!qVUwofr5s) {
                                return qVUwofr5s;
                            }
                            ftmnxrqmw = ftmnXRQmW.Deactivated;
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (ordinal != 5) {
                        throw new dnCerKhAM();
                    }
                }
            } else if (!z) {
                return z;
            } else {
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
                return z;
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            kB2jjcOAK.zH62iiANw(null);
            return qVUwofr5s;
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
        return true;
    }

    public static final u1Gs6N2OQ sk5s77z6Q(List list, int i) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (((u1Gs6N2OQ) list.get(i2)).CBQ5d1kRq == i) {
                return (u1Gs6N2OQ) list.get(i2);
            }
            if (i3 > size) {
                return null;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(boolean r18, con.BgIsSUB3d r19, con.EVoQ2RqaN r20, con.JzLhkMe5F r21, java.lang.String r22, con.NzvP5Rex8 r23, con.rJ0s9PfCL r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.tGV7Q6urW(boolean, con.BgIsSUB3d, con.EVoQ2RqaN, con.JzLhkMe5F, java.lang.String, con.NzvP5Rex8, con.rJ0s9PfCL, int, int):void");
    }

    public static final BgIsSUB3d vNtjxmzUM(BgIsSUB3d bgIsSUB3d, float f, JZuV4yGnu jZuV4yGnu, boolean z) {
        if (Float.compare(f, (float) 0) <= 0 && !z) {
            return bgIsSUB3d;
        }
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        f7B6YCXHx f7b6ycxhx = f7B6YCXHx.kmSgne1rO;
        int i = BgIsSUB3d.Puu3Rhg4F;
        OUek6J1C1 oUek6J1C1 = new OUek6J1C1(f, jZuV4yGnu, z, 0);
        boolean z3 = Rjnc3TWC6.q3BipwRCk;
        return Rjnc3TWC6.q3BipwRCk(bgIsSUB3d, f7b6ycxhx, new ihwWLIzx8(oUek6J1C1, f7B6YCXHx.kmSgne1rO));
    }

    public static final boolean vPSbyrYWX(or5nbo9ku or5nbo9ku) {
        ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        return xP6F5SR9v.Bhmn1KIah(iiGwOFFnr, VSVuhz7Ow.oon79WMrY) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object yWvV4ePLl(con.k0ugT26MT r7, con.UBY2Inzw8 r8, con.UBY2Inzw8 r9, con.W1NiVqEgR r10, con.njjwS3RZT r11, con.Way959ade r12) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: con.p62TZmTyO.yWvV4ePLl(con.k0ugT26MT, con.UBY2Inzw8, con.UBY2Inzw8, con.W1NiVqEgR, con.njjwS3RZT, con.Way959ade):java.lang.Object");
    }
}
