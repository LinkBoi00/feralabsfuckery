package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class cjQ255nrQ {
    public K5PjwoFCN GPLPRo6go;
    public final pLYbCSTk0 q3BipwRCk;
    public boolean tGV7Q6urW;
    public final gknx5HUb7 J4Ux7ym32 = new gknx5HUb7(false);
    public final Z5ssqGiWd dIocxURUo = new Z5ssqGiWd();
    public long kCA6Zs9sL = 1;
    public final List iiGwOFFnr = new ArrayList();

    public cjQ255nrQ(pLYbCSTk0 plybcstk0) {
        this.q3BipwRCk = plybcstk0;
        int i = jRWr6Yc4S.oon79WMrY;
    }

    public static final boolean q3BipwRCk(cjQ255nrQ cjq255nrq, pLYbCSTk0 plybcstk0, long j) {
        boolean z;
        boolean z2 = true;
        if (plybcstk0 == cjq255nrq.q3BipwRCk) {
            z = plybcstk0.V9LQMKGJe.EBQXiIPmm(j);
        } else {
            z = pLYbCSTk0.iMyQMM6Qj(plybcstk0, null, 1);
        }
        pLYbCSTk0 oon79WMrY = plybcstk0.oon79WMrY();
        if (z) {
            if (oon79WMrY == null) {
                return true;
            }
            LBUvXIUJ7 lBUvXIUJ7 = plybcstk0.vNtjxmzUM;
            if (lBUvXIUJ7 == LBUvXIUJ7.InMeasureBlock) {
                cjq255nrq.iiGwOFFnr(oon79WMrY);
            } else {
                if (lBUvXIUJ7 != LBUvXIUJ7.InLayoutBlock) {
                    z2 = false;
                }
                if (z2) {
                    cjq255nrq.kCA6Zs9sL(oon79WMrY);
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        return false;
    }

    public final void GPLPRo6go(long j) {
        boolean z;
        K5PjwoFCN k5PjwoFCN = this.GPLPRo6go;
        if (k5PjwoFCN == null) {
            z = false;
        } else {
            z = K5PjwoFCN.J4Ux7ym32(k5PjwoFCN.q3BipwRCk, j);
        }
        if (z) {
            return;
        }
        if (!this.tGV7Q6urW) {
            this.GPLPRo6go = new K5PjwoFCN(j);
            pLYbCSTk0 plybcstk0 = this.q3BipwRCk;
            plybcstk0.dXrmkklc8 = LCC21UP9O.NeedsRemeasure;
            this.J4Ux7ym32.q3BipwRCk(plybcstk0);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void J4Ux7ym32(boolean z) {
        if (z) {
            Z5ssqGiWd z5ssqGiWd = this.dIocxURUo;
            pLYbCSTk0 plybcstk0 = this.q3BipwRCk;
            z5ssqGiWd.q3BipwRCk.kCA6Zs9sL();
            z5ssqGiWd.q3BipwRCk.J4Ux7ym32(plybcstk0);
            plybcstk0.j22ftfeNI = true;
        }
        Z5ssqGiWd z5ssqGiWd2 = this.dIocxURUo;
        pnuAOe8oh pnuaoe8oh = z5ssqGiWd2.q3BipwRCk;
        Arrays.sort(pnuaoe8oh.CBQ5d1kRq, 0, pnuaoe8oh.Bhmn1KIah, TZAx1vaW5.q3BipwRCk);
        pnuAOe8oh pnuaoe8oh2 = z5ssqGiWd2.q3BipwRCk;
        int i = pnuaoe8oh2.Bhmn1KIah;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = pnuaoe8oh2.CBQ5d1kRq;
            do {
                pLYbCSTk0 plybcstk02 = (pLYbCSTk0) objArr[i2];
                if (plybcstk02.j22ftfeNI) {
                    z5ssqGiWd2.q3BipwRCk(plybcstk02);
                }
                i2--;
            } while (i2 >= 0);
            z5ssqGiWd2.q3BipwRCk.kCA6Zs9sL();
        }
        z5ssqGiWd2.q3BipwRCk.kCA6Zs9sL();
    }

    public final boolean dIocxURUo(gdEmqfwpT gdemqfwpt) {
        if (!this.q3BipwRCk.Eeka1udhb()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.q3BipwRCk.nlGCs0NZs) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.tGV7Q6urW) {
            K5PjwoFCN k5PjwoFCN = this.GPLPRo6go;
            if (k5PjwoFCN == null) {
                return false;
            }
            long j = k5PjwoFCN.q3BipwRCk;
            if (!(!this.J4Ux7ym32.tGV7Q6urW())) {
                return false;
            }
            this.tGV7Q6urW = true;
            try {
                gknx5HUb7 gknx5hub7 = this.J4Ux7ym32;
                boolean z = false;
                while (!gknx5hub7.tGV7Q6urW()) {
                    pLYbCSTk0 plybcstk0 = (pLYbCSTk0) ((QP0NCzv7O) gknx5hub7.dIocxURUo).first();
                    gknx5hub7.dIocxURUo(plybcstk0);
                    if (plybcstk0.nlGCs0NZs || tGV7Q6urW(plybcstk0) || plybcstk0.qFBXIgpia.J4Ux7ym32()) {
                        if (plybcstk0.dXrmkklc8 == LCC21UP9O.NeedsRemeasure && q3BipwRCk(this, plybcstk0, j)) {
                            z = true;
                        }
                        if (plybcstk0.dXrmkklc8 == LCC21UP9O.NeedsRelayout && plybcstk0.nlGCs0NZs) {
                            if (plybcstk0 == this.q3BipwRCk) {
                                rHo1o6g26 rho1o6g26 = vXUgPfyfe.q3BipwRCk;
                                int i0Zug1mVk = plybcstk0.V9LQMKGJe.i0Zug1mVk();
                                BFRsKhrQv bFRsKhrQv = plybcstk0.IytU16YUK;
                                int i = vXUgPfyfe.tGV7Q6urW;
                                BFRsKhrQv bFRsKhrQv2 = vXUgPfyfe.J4Ux7ym32;
                                vXUgPfyfe.tGV7Q6urW = i0Zug1mVk;
                                vXUgPfyfe.J4Ux7ym32 = bFRsKhrQv;
                                vXUgPfyfe.iiGwOFFnr(rho1o6g26, plybcstk0.V9LQMKGJe, 0, 0, 0.0f, 4, null);
                                vXUgPfyfe.tGV7Q6urW = i;
                                vXUgPfyfe.J4Ux7ym32 = bFRsKhrQv2;
                            } else {
                                C1Fd45X28 c1Fd45X28 = plybcstk0.V9LQMKGJe;
                                if (c1Fd45X28.Eeka1udhb) {
                                    c1Fd45X28.o4LF8RkoQ(c1Fd45X28.RG6kpfv3v, c1Fd45X28.sk5s77z6Q, c1Fd45X28.ixWaw2akD);
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            this.dIocxURUo.q3BipwRCk.J4Ux7ym32(plybcstk0);
                            plybcstk0.j22ftfeNI = true;
                        }
                        if (this.tGV7Q6urW) {
                            this.kCA6Zs9sL++;
                            if (!this.iiGwOFFnr.isEmpty()) {
                                List list = this.iiGwOFFnr;
                                int size = list.size() - 1;
                                if (size >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        int i3 = i2 + 1;
                                        pLYbCSTk0 plybcstk02 = (pLYbCSTk0) list.get(i2);
                                        if (plybcstk02.Eeka1udhb()) {
                                            iiGwOFFnr(plybcstk02);
                                        }
                                        if (i3 > size) {
                                            break;
                                        }
                                        i2 = i3;
                                    }
                                }
                                this.iiGwOFFnr.clear();
                            }
                        } else {
                            throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
                        }
                    }
                }
                if (gdemqfwpt != null) {
                    gdemqfwpt.GPLPRo6go();
                }
                return z;
            } finally {
                this.tGV7Q6urW = false;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean iiGwOFFnr(con.pLYbCSTk0 r8) {
        /*
            r7 = this;
            con.LCC21UP9O r0 = r8.dXrmkklc8
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0065
            if (r0 == r1) goto L_0x0065
            r3 = 2
            if (r0 == r3) goto L_0x0022
            r3 = 3
            if (r0 == r3) goto L_0x001c
            r3 = 4
            if (r0 != r3) goto L_0x0016
            goto L_0x0022
        L_0x0016:
            con.dnCerKhAM r8 = new con.dnCerKhAM
            r8.<init>()
            throw r8
        L_0x001c:
            java.util.List r0 = r7.iiGwOFFnr
            r0.add(r8)
            goto L_0x0065
        L_0x0022:
            boolean r0 = r7.tGV7Q6urW
            if (r0 == 0) goto L_0x0041
            con.jRWr6Yc4S r0 = con.BBVaGLNaU.i0Zug1mVk(r8)
            long r3 = r0.getMeasureIteration()
            con.C1Fd45X28 r0 = r8.V9LQMKGJe
            long r5 = r0.WaUP0CF08
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 == 0) goto L_0x0041
            java.util.List r0 = r7.iiGwOFFnr
            r0.add(r8)
            goto L_0x0060
        L_0x0041:
            con.LCC21UP9O r0 = con.LCC21UP9O.NeedsRemeasure
            r8.dXrmkklc8 = r0
            boolean r3 = r8.nlGCs0NZs
            if (r3 != 0) goto L_0x004f
            boolean r3 = r7.tGV7Q6urW(r8)
            if (r3 == 0) goto L_0x0060
        L_0x004f:
            con.pLYbCSTk0 r3 = r8.oon79WMrY()
            if (r3 != 0) goto L_0x0057
            r3 = 0
            goto L_0x0059
        L_0x0057:
            con.LCC21UP9O r3 = r3.dXrmkklc8
        L_0x0059:
            if (r3 == r0) goto L_0x0060
            con.gknx5HUb7 r0 = r7.J4Ux7ym32
            r0.q3BipwRCk(r8)
        L_0x0060:
            boolean r8 = r7.tGV7Q6urW
            if (r8 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.cjQ255nrQ.iiGwOFFnr(con.pLYbCSTk0):boolean");
    }

    public final boolean kCA6Zs9sL(pLYbCSTk0 plybcstk0) {
        LCC21UP9O lcc21up9o;
        int ordinal = plybcstk0.dXrmkklc8.ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3)) {
            if (ordinal == 4) {
                LCC21UP9O lcc21up9o2 = LCC21UP9O.NeedsRelayout;
                plybcstk0.dXrmkklc8 = lcc21up9o2;
                if (plybcstk0.nlGCs0NZs) {
                    pLYbCSTk0 oon79WMrY = plybcstk0.oon79WMrY();
                    if (oon79WMrY == null) {
                        lcc21up9o = null;
                    } else {
                        lcc21up9o = oon79WMrY.dXrmkklc8;
                    }
                    if (!(lcc21up9o == LCC21UP9O.NeedsRemeasure || lcc21up9o == lcc21up9o2)) {
                        this.J4Ux7ym32.q3BipwRCk(plybcstk0);
                    }
                }
                if (!this.tGV7Q6urW) {
                    return true;
                }
            } else {
                throw new dnCerKhAM();
            }
        }
        return false;
    }

    public final boolean tGV7Q6urW(pLYbCSTk0 plybcstk0) {
        return plybcstk0.dXrmkklc8 == LCC21UP9O.NeedsRemeasure && (plybcstk0.vNtjxmzUM == LBUvXIUJ7.InMeasureBlock || plybcstk0.qFBXIgpia.J4Ux7ym32());
    }
}
