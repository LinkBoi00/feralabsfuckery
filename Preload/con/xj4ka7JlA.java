package con;

import android.graphics.Outline;
import android.os.Build;
/* loaded from: classes.dex */
public final class xj4ka7JlA {
    public long Bhmn1KIah;
    public float CBQ5d1kRq;
    public A128gLXzp GPLPRo6go;
    public boolean PSTqBLTET;
    public boolean Puu3Rhg4F;
    public long dIocxURUo;
    public A128gLXzp iiGwOFFnr;
    public FHtrhXyto ilHKhw3Yw;
    public A128gLXzp oon79WMrY;
    public AU29aHa4X q3BipwRCk;
    public final Outline tGV7Q6urW;
    public wOXdxhlrk vPSbyrYWX;
    public boolean yWvV4ePLl;
    public boolean J4Ux7ym32 = true;
    public JZuV4yGnu kCA6Zs9sL = Nb0J8E3sF.q3BipwRCk;
    public long kmSgne1rO = bRgfgYIQX.tGV7Q6urW;
    public BFRsKhrQv MzoOEjc4X = BFRsKhrQv.Ltr;

    public xj4ka7JlA(AU29aHa4X aU29aHa4X) {
        this.q3BipwRCk = aU29aHa4X;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.tGV7Q6urW = outline;
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
        long j = tbzY8QG6X.tGV7Q6urW;
        this.dIocxURUo = j;
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        this.Bhmn1KIah = j;
    }

    public final Outline J4Ux7ym32() {
        kCA6Zs9sL();
        if (!this.PSTqBLTET || !this.J4Ux7ym32) {
            return null;
        }
        return this.tGV7Q6urW;
    }

    public final boolean dIocxURUo(JZuV4yGnu jZuV4yGnu, float f, boolean z, float f2, BFRsKhrQv bFRsKhrQv, AU29aHa4X aU29aHa4X) {
        this.tGV7Q6urW.setAlpha(f);
        boolean z2 = !anXlDk6fV.tGV7Q6urW(this.kCA6Zs9sL, jZuV4yGnu);
        if (z2) {
            this.kCA6Zs9sL = jZuV4yGnu;
            this.Puu3Rhg4F = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.PSTqBLTET != z3) {
            this.PSTqBLTET = z3;
            this.Puu3Rhg4F = true;
        }
        if (this.MzoOEjc4X != bFRsKhrQv) {
            this.MzoOEjc4X = bFRsKhrQv;
            this.Puu3Rhg4F = true;
        }
        if (!anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, aU29aHa4X)) {
            this.q3BipwRCk = aU29aHa4X;
            this.Puu3Rhg4F = true;
        }
        return z2;
    }

    public final void iiGwOFFnr(A128gLXzp a128gLXzp) {
        if (Build.VERSION.SDK_INT > 28 || ((Q3Qxqu4re) a128gLXzp).q3BipwRCk.isConvex()) {
            Outline outline = this.tGV7Q6urW;
            if (a128gLXzp instanceof Q3Qxqu4re) {
                outline.setConvexPath(((Q3Qxqu4re) a128gLXzp).q3BipwRCk);
                this.yWvV4ePLl = !this.tGV7Q6urW.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW.setEmpty();
            this.yWvV4ePLl = true;
        }
        this.GPLPRo6go = a128gLXzp;
    }

    public final void kCA6Zs9sL() {
        if (this.Puu3Rhg4F) {
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            this.kmSgne1rO = bRgfgYIQX.tGV7Q6urW;
            long j = this.dIocxURUo;
            this.Bhmn1KIah = j;
            this.CBQ5d1kRq = 0.0f;
            this.GPLPRo6go = null;
            this.Puu3Rhg4F = false;
            this.yWvV4ePLl = false;
            if (!this.PSTqBLTET || tbzY8QG6X.kCA6Zs9sL(j) <= 0.0f || tbzY8QG6X.tGV7Q6urW(this.dIocxURUo) <= 0.0f) {
                this.tGV7Q6urW.setEmpty();
                return;
            }
            this.J4Ux7ym32 = true;
            FHtrhXyto q3BipwRCk = this.kCA6Zs9sL.q3BipwRCk(this.dIocxURUo, this.MzoOEjc4X, this.q3BipwRCk);
            this.ilHKhw3Yw = q3BipwRCk;
            if (q3BipwRCk instanceof MFcZC5k5k) {
                bzmJZsHMu bzmjzshmu = ((MFcZC5k5k) q3BipwRCk).q3BipwRCk;
                this.kmSgne1rO = ODug2UCW1.dIocxURUo(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32);
                this.Bhmn1KIah = gThLCaTO1.J4Ux7ym32(bzmjzshmu.kCA6Zs9sL(), bzmjzshmu.J4Ux7ym32());
                this.tGV7Q6urW.setRect(D3DEikrvb.Eeka1udhb(bzmjzshmu.q3BipwRCk), D3DEikrvb.Eeka1udhb(bzmjzshmu.J4Ux7ym32), D3DEikrvb.Eeka1udhb(bzmjzshmu.tGV7Q6urW), D3DEikrvb.Eeka1udhb(bzmjzshmu.dIocxURUo));
            } else if (q3BipwRCk instanceof iJM2jNPIz) {
                wOXdxhlrk woxdxhlrk = ((iJM2jNPIz) q3BipwRCk).q3BipwRCk;
                float J4Ux7ym32 = yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL);
                this.kmSgne1rO = ODug2UCW1.dIocxURUo(woxdxhlrk.q3BipwRCk, woxdxhlrk.J4Ux7ym32);
                this.Bhmn1KIah = gThLCaTO1.J4Ux7ym32(woxdxhlrk.J4Ux7ym32(), woxdxhlrk.q3BipwRCk());
                if (ODug2UCW1.iMyQMM6Qj(woxdxhlrk)) {
                    this.tGV7Q6urW.setRoundRect(D3DEikrvb.Eeka1udhb(woxdxhlrk.q3BipwRCk), D3DEikrvb.Eeka1udhb(woxdxhlrk.J4Ux7ym32), D3DEikrvb.Eeka1udhb(woxdxhlrk.tGV7Q6urW), D3DEikrvb.Eeka1udhb(woxdxhlrk.dIocxURUo), J4Ux7ym32);
                    this.CBQ5d1kRq = J4Ux7ym32;
                    return;
                }
                A128gLXzp a128gLXzp = this.iiGwOFFnr;
                if (a128gLXzp == null) {
                    a128gLXzp = xP6F5SR9v.iiGwOFFnr();
                    this.iiGwOFFnr = a128gLXzp;
                }
                Q3Qxqu4re q3Qxqu4re = (Q3Qxqu4re) a128gLXzp;
                q3Qxqu4re.q3BipwRCk.reset();
                q3Qxqu4re.J4Ux7ym32(woxdxhlrk);
                iiGwOFFnr(a128gLXzp);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        if ((con.yDwaznigW.J4Ux7ym32(r8.kCA6Zs9sL) == r2) != false) goto L_0x0087;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r14 == false) goto L_0x0089;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [con.A128gLXzp] */
    /* JADX WARN: Type inference failed for: r7v2, types: [con.A128gLXzp] */
    /* JADX WARN: Type inference failed for: r7v4, types: [con.Q3Qxqu4re, con.A128gLXzp] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void q3BipwRCk(SI0VpKubr sI0VpKubr) {
        A128gLXzp a128gLXzp;
        boolean z;
        kCA6Zs9sL();
        A128gLXzp a128gLXzp2 = this.GPLPRo6go;
        if (a128gLXzp2 != null) {
            ODug2UCW1.CBQ5d1kRq(sI0VpKubr, a128gLXzp2, 0, 2, null);
            return;
        }
        float f = this.CBQ5d1kRq;
        if (f > 0.0f) {
            ?? r7 = this.oon79WMrY;
            wOXdxhlrk woxdxhlrk = this.vPSbyrYWX;
            if (r7 != 0) {
                long j = this.kmSgne1rO;
                long j2 = this.Bhmn1KIah;
                if (woxdxhlrk != null && ODug2UCW1.iMyQMM6Qj(woxdxhlrk)) {
                    z = true;
                    if (woxdxhlrk.q3BipwRCk == bRgfgYIQX.tGV7Q6urW(j)) {
                        if (woxdxhlrk.J4Ux7ym32 == bRgfgYIQX.dIocxURUo(j)) {
                            if (woxdxhlrk.tGV7Q6urW == tbzY8QG6X.kCA6Zs9sL(j2) + bRgfgYIQX.tGV7Q6urW(j)) {
                                if (woxdxhlrk.dIocxURUo == tbzY8QG6X.tGV7Q6urW(j2) + bRgfgYIQX.dIocxURUo(j)) {
                                }
                            }
                        }
                    }
                }
                z = false;
            }
            wOXdxhlrk kCA6Zs9sL = ODug2UCW1.kCA6Zs9sL(bRgfgYIQX.tGV7Q6urW(this.kmSgne1rO), bRgfgYIQX.dIocxURUo(this.kmSgne1rO), tbzY8QG6X.kCA6Zs9sL(this.Bhmn1KIah) + bRgfgYIQX.tGV7Q6urW(this.kmSgne1rO), tbzY8QG6X.tGV7Q6urW(this.Bhmn1KIah) + bRgfgYIQX.dIocxURUo(this.kmSgne1rO), ODug2UCW1.J4Ux7ym32(this.CBQ5d1kRq, 0.0f, 2));
            if (r7 == 0) {
                a128gLXzp = xP6F5SR9v.iiGwOFFnr();
            } else {
                ((Q3Qxqu4re) r7).q3BipwRCk.reset();
                a128gLXzp = r7;
            }
            r7 = (Q3Qxqu4re) a128gLXzp;
            r7.J4Ux7ym32(kCA6Zs9sL);
            this.vPSbyrYWX = kCA6Zs9sL;
            this.oon79WMrY = r7;
            ODug2UCW1.CBQ5d1kRq(sI0VpKubr, r7, 0, 2, null);
            return;
        }
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(this.kmSgne1rO);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(this.kmSgne1rO);
        float tGV7Q6urW2 = bRgfgYIQX.tGV7Q6urW(this.kmSgne1rO) + tbzY8QG6X.kCA6Zs9sL(this.Bhmn1KIah);
        float dIocxURUo2 = bRgfgYIQX.dIocxURUo(this.kmSgne1rO) + tbzY8QG6X.tGV7Q6urW(this.Bhmn1KIah);
        oWhsE8IPp owhse8ipp = c8C9YlOpy.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = c8C9YlOpy.q3BipwRCk;
        sI0VpKubr.Eeka1udhb(tGV7Q6urW, dIocxURUo, tGV7Q6urW2, dIocxURUo2, 1);
    }

    public final boolean tGV7Q6urW(long j) {
        FHtrhXyto fHtrhXyto;
        float f;
        long j2;
        long j3;
        if (!this.PSTqBLTET || (fHtrhXyto = this.ilHKhw3Yw) == null) {
            return true;
        }
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
        boolean z = false;
        if (fHtrhXyto instanceof MFcZC5k5k) {
            bzmJZsHMu bzmjzshmu = ((MFcZC5k5k) fHtrhXyto).q3BipwRCk;
            if (bzmjzshmu.q3BipwRCk <= tGV7Q6urW && tGV7Q6urW < bzmjzshmu.tGV7Q6urW && bzmjzshmu.J4Ux7ym32 <= dIocxURUo && dIocxURUo < bzmjzshmu.dIocxURUo) {
                return true;
            }
        } else if (fHtrhXyto instanceof iJM2jNPIz) {
            wOXdxhlrk woxdxhlrk = ((iJM2jNPIz) fHtrhXyto).q3BipwRCk;
            if (tGV7Q6urW >= woxdxhlrk.q3BipwRCk && tGV7Q6urW < woxdxhlrk.tGV7Q6urW && dIocxURUo >= woxdxhlrk.J4Ux7ym32 && dIocxURUo < woxdxhlrk.dIocxURUo) {
                if (yDwaznigW.J4Ux7ym32(woxdxhlrk.iiGwOFFnr) + yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) <= woxdxhlrk.J4Ux7ym32()) {
                    if (yDwaznigW.J4Ux7ym32(woxdxhlrk.GPLPRo6go) + yDwaznigW.J4Ux7ym32(woxdxhlrk.Puu3Rhg4F) <= woxdxhlrk.J4Ux7ym32()) {
                        if (yDwaznigW.tGV7Q6urW(woxdxhlrk.Puu3Rhg4F) + yDwaznigW.tGV7Q6urW(woxdxhlrk.kCA6Zs9sL) <= woxdxhlrk.q3BipwRCk()) {
                            if (yDwaznigW.tGV7Q6urW(woxdxhlrk.GPLPRo6go) + yDwaznigW.tGV7Q6urW(woxdxhlrk.iiGwOFFnr) <= woxdxhlrk.q3BipwRCk()) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    Q3Qxqu4re q3Qxqu4re = (Q3Qxqu4re) xP6F5SR9v.iiGwOFFnr();
                    q3Qxqu4re.J4Ux7ym32(woxdxhlrk);
                    return xP6F5SR9v.MzoOEjc4X(q3Qxqu4re, tGV7Q6urW, dIocxURUo, null, null);
                }
                float J4Ux7ym32 = yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) + woxdxhlrk.q3BipwRCk;
                float tGV7Q6urW2 = yDwaznigW.tGV7Q6urW(woxdxhlrk.kCA6Zs9sL) + woxdxhlrk.J4Ux7ym32;
                float J4Ux7ym322 = woxdxhlrk.tGV7Q6urW - yDwaznigW.J4Ux7ym32(woxdxhlrk.iiGwOFFnr);
                float tGV7Q6urW3 = yDwaznigW.tGV7Q6urW(woxdxhlrk.iiGwOFFnr) + woxdxhlrk.J4Ux7ym32;
                float J4Ux7ym323 = woxdxhlrk.tGV7Q6urW - yDwaznigW.J4Ux7ym32(woxdxhlrk.GPLPRo6go);
                float tGV7Q6urW4 = woxdxhlrk.dIocxURUo - yDwaznigW.tGV7Q6urW(woxdxhlrk.GPLPRo6go);
                float tGV7Q6urW5 = woxdxhlrk.dIocxURUo - yDwaznigW.tGV7Q6urW(woxdxhlrk.Puu3Rhg4F);
                float J4Ux7ym324 = yDwaznigW.J4Ux7ym32(woxdxhlrk.Puu3Rhg4F) + woxdxhlrk.q3BipwRCk;
                if (tGV7Q6urW < J4Ux7ym32 && dIocxURUo < tGV7Q6urW2) {
                    j3 = woxdxhlrk.kCA6Zs9sL;
                } else if (tGV7Q6urW < J4Ux7ym324 && dIocxURUo > tGV7Q6urW5) {
                    j3 = woxdxhlrk.Puu3Rhg4F;
                    tGV7Q6urW2 = tGV7Q6urW5;
                    J4Ux7ym32 = J4Ux7ym324;
                } else if (tGV7Q6urW > J4Ux7ym322 && dIocxURUo < tGV7Q6urW3) {
                    j2 = woxdxhlrk.iiGwOFFnr;
                    tGV7Q6urW4 = tGV7Q6urW3;
                    f = J4Ux7ym322;
                    return xP6F5SR9v.ilHKhw3Yw(tGV7Q6urW, dIocxURUo, j2, f, tGV7Q6urW4);
                } else if (tGV7Q6urW <= J4Ux7ym323 || dIocxURUo <= tGV7Q6urW4) {
                    return true;
                } else {
                    j3 = woxdxhlrk.GPLPRo6go;
                    f = J4Ux7ym323;
                    j2 = j3;
                    return xP6F5SR9v.ilHKhw3Yw(tGV7Q6urW, dIocxURUo, j2, f, tGV7Q6urW4);
                }
                f = J4Ux7ym32;
                tGV7Q6urW4 = tGV7Q6urW2;
                j2 = j3;
                return xP6F5SR9v.ilHKhw3Yw(tGV7Q6urW, dIocxURUo, j2, f, tGV7Q6urW4);
            }
        } else {
            throw new dnCerKhAM();
        }
        return false;
    }
}
