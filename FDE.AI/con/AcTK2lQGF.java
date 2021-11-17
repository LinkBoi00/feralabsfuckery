package con;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.RG2GI7LDp;
/* loaded from: classes.dex */
public final class AcTK2lQGF implements H8Cq8Y88s {
    public gdEmqfwpT Bhmn1KIah;
    public final AndroidComposeView CBQ5d1kRq;
    public AA4ZBBPJq Eeka1udhb;
    public final xj4ka7JlA MzoOEjc4X;
    public boolean PSTqBLTET;
    public boolean ilHKhw3Yw;
    public PmanMZxiM kmSgne1rO;
    public boolean qVUwofr5s;
    public final Du7hlPDkT sk5s77z6Q;
    public final hrJ1tyVgP dXrmkklc8 = new hrJ1tyVgP(pSdrExTbX.WaUP0CF08);
    public final iFKnyAZAM RG6kpfv3v = new iFKnyAZAM(7);
    public long ixWaw2akD = WyfbJwwBZ.tGV7Q6urW;

    public AcTK2lQGF(AndroidComposeView androidComposeView, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        this.CBQ5d1kRq = androidComposeView;
        this.kmSgne1rO = pmanMZxiM;
        this.Bhmn1KIah = gdemqfwpt;
        this.MzoOEjc4X = new xj4ka7JlA(androidComposeView.getDensity());
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        Du7hlPDkT b8xlctike = Build.VERSION.SDK_INT >= 29 ? new b8xLCTIKe(androidComposeView) : new RG2GI7LDp(androidComposeView);
        b8xlctike.i8XZMQc6Z(true);
        this.sk5s77z6Q = b8xlctike;
    }

    @Override // con.H8Cq8Y88s
    public void GPLPRo6go(SI0VpKubr sI0VpKubr) {
        Canvas canvas = RvtysjeZn.q3BipwRCk;
        Canvas canvas2 = ((YSo0hTREC) sI0VpKubr).q3BipwRCk;
        boolean z = false;
        if (canvas2.isHardwareAccelerated()) {
            kCA6Zs9sL();
            if (this.sk5s77z6Q.NyWTwPF6V() > 0.0f) {
                z = true;
            }
            this.qVUwofr5s = z;
            if (z) {
                sI0VpKubr.ilHKhw3Yw();
            }
            this.sk5s77z6Q.MzoOEjc4X(canvas2);
            if (this.qVUwofr5s) {
                sI0VpKubr.vPSbyrYWX();
                return;
            }
            return;
        }
        float qVUwofr5s = (float) this.sk5s77z6Q.qVUwofr5s();
        float ilHKhw3Yw = (float) this.sk5s77z6Q.ilHKhw3Yw();
        float CBQ5d1kRq = (float) this.sk5s77z6Q.CBQ5d1kRq();
        float vPSbyrYWX = (float) this.sk5s77z6Q.vPSbyrYWX();
        if (this.sk5s77z6Q.dXrmkklc8() < 1.0f) {
            AA4ZBBPJq aA4ZBBPJq = this.Eeka1udhb;
            if (aA4ZBBPJq == null) {
                aA4ZBBPJq = new AA4ZBBPJq();
                this.Eeka1udhb = aA4ZBBPJq;
            }
            aA4ZBBPJq.Puu3Rhg4F(this.sk5s77z6Q.dXrmkklc8());
            canvas2.saveLayer(qVUwofr5s, ilHKhw3Yw, CBQ5d1kRq, vPSbyrYWX, aA4ZBBPJq.q3BipwRCk);
        } else {
            sI0VpKubr.GPLPRo6go();
        }
        sI0VpKubr.dXrmkklc8(qVUwofr5s, ilHKhw3Yw);
        sI0VpKubr.MzoOEjc4X(this.dXrmkklc8.J4Ux7ym32(this.sk5s77z6Q));
        if (this.sk5s77z6Q.kmSgne1rO() || this.sk5s77z6Q.PSTqBLTET()) {
            this.MzoOEjc4X.q3BipwRCk(sI0VpKubr);
        }
        PmanMZxiM pmanMZxiM = this.kmSgne1rO;
        if (pmanMZxiM != null) {
            pmanMZxiM.IytU16YUK(sI0VpKubr);
        }
        sI0VpKubr.J4Ux7ym32();
        vPSbyrYWX(false);
    }

    @Override // con.H8Cq8Y88s
    public void J4Ux7ym32() {
        if (this.sk5s77z6Q.dfpT1j18n()) {
            this.sk5s77z6Q.mUqPm6GBh();
        }
        this.kmSgne1rO = null;
        this.Bhmn1KIah = null;
        this.ilHKhw3Yw = true;
        vPSbyrYWX(false);
        AndroidComposeView androidComposeView = this.CBQ5d1kRq;
        androidComposeView.nlGCs0NZs = true;
        androidComposeView.qVUwofr5s(this);
    }

    @Override // con.H8Cq8Y88s
    public void Puu3Rhg4F(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, JZuV4yGnu jZuV4yGnu, boolean z, yA4i3FtpV ya4i3ftpv, BFRsKhrQv bFRsKhrQv, AU29aHa4X aU29aHa4X) {
        gdEmqfwpT gdemqfwpt;
        this.ixWaw2akD = j;
        boolean z2 = false;
        boolean z3 = this.sk5s77z6Q.kmSgne1rO() && !(this.MzoOEjc4X.yWvV4ePLl ^ true);
        this.sk5s77z6Q.CpG0imbht(f);
        this.sk5s77z6Q.Puu3Rhg4F(f2);
        this.sk5s77z6Q.GPLPRo6go(f3);
        this.sk5s77z6Q.iiGwOFFnr(f4);
        this.sk5s77z6Q.sk5s77z6Q(f5);
        this.sk5s77z6Q.yWvV4ePLl(f6);
        this.sk5s77z6Q.RG6kpfv3v(f9);
        this.sk5s77z6Q.qFBXIgpia(f7);
        this.sk5s77z6Q.tGV7Q6urW(f8);
        this.sk5s77z6Q.WaUP0CF08(f10);
        this.sk5s77z6Q.ixWaw2akD(WyfbJwwBZ.q3BipwRCk(j) * ((float) this.sk5s77z6Q.q3BipwRCk()));
        this.sk5s77z6Q.kCA6Zs9sL(WyfbJwwBZ.J4Ux7ym32(j) * ((float) this.sk5s77z6Q.J4Ux7ym32()));
        this.sk5s77z6Q.Eeka1udhb(z && jZuV4yGnu != Nb0J8E3sF.q3BipwRCk);
        this.sk5s77z6Q.iMyQMM6Qj(z && jZuV4yGnu == Nb0J8E3sF.q3BipwRCk);
        this.sk5s77z6Q.dIocxURUo(null);
        boolean dIocxURUo = this.MzoOEjc4X.dIocxURUo(jZuV4yGnu, this.sk5s77z6Q.dXrmkklc8(), this.sk5s77z6Q.kmSgne1rO(), this.sk5s77z6Q.NyWTwPF6V(), bFRsKhrQv, aU29aHa4X);
        this.sk5s77z6Q.cAwN510t2(this.MzoOEjc4X.J4Ux7ym32());
        if (this.sk5s77z6Q.kmSgne1rO() && !(!this.MzoOEjc4X.yWvV4ePLl)) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && dIocxURUo)) {
            invalidate();
        } else {
            bKLvaluG6.q3BipwRCk.q3BipwRCk(this.CBQ5d1kRq);
        }
        if (!this.qVUwofr5s && this.sk5s77z6Q.NyWTwPF6V() > 0.0f && (gdemqfwpt = this.Bhmn1KIah) != null) {
            gdemqfwpt.GPLPRo6go();
        }
        this.dXrmkklc8.tGV7Q6urW();
    }

    @Override // con.H8Cq8Y88s
    public void dIocxURUo(long j) {
        int qVUwofr5s = this.sk5s77z6Q.qVUwofr5s();
        int ilHKhw3Yw = this.sk5s77z6Q.ilHKhw3Yw();
        int q3BipwRCk = ZtJSMDYDl.q3BipwRCk(j);
        int J4Ux7ym32 = ZtJSMDYDl.J4Ux7ym32(j);
        if (qVUwofr5s != q3BipwRCk || ilHKhw3Yw != J4Ux7ym32) {
            this.sk5s77z6Q.oon79WMrY(q3BipwRCk - qVUwofr5s);
            this.sk5s77z6Q.Bhmn1KIah(J4Ux7ym32 - ilHKhw3Yw);
            bKLvaluG6.q3BipwRCk.q3BipwRCk(this.CBQ5d1kRq);
            this.dXrmkklc8.tGV7Q6urW();
        }
    }

    @Override // con.H8Cq8Y88s
    public void iiGwOFFnr(long j) {
        int tGV7Q6urW = YWiUMZOtw.tGV7Q6urW(j);
        int J4Ux7ym32 = YWiUMZOtw.J4Ux7ym32(j);
        float f = (float) tGV7Q6urW;
        this.sk5s77z6Q.ixWaw2akD(WyfbJwwBZ.q3BipwRCk(this.ixWaw2akD) * f);
        float f2 = (float) J4Ux7ym32;
        this.sk5s77z6Q.kCA6Zs9sL(WyfbJwwBZ.J4Ux7ym32(this.ixWaw2akD) * f2);
        Du7hlPDkT du7hlPDkT = this.sk5s77z6Q;
        if (du7hlPDkT.IytU16YUK(du7hlPDkT.qVUwofr5s(), this.sk5s77z6Q.ilHKhw3Yw(), this.sk5s77z6Q.qVUwofr5s() + tGV7Q6urW, this.sk5s77z6Q.ilHKhw3Yw() + J4Ux7ym32)) {
            xj4ka7JlA xj4ka7jla = this.MzoOEjc4X;
            long J4Ux7ym322 = gThLCaTO1.J4Ux7ym32(f, f2);
            if (!tbzY8QG6X.J4Ux7ym32(xj4ka7jla.dIocxURUo, J4Ux7ym322)) {
                xj4ka7jla.dIocxURUo = J4Ux7ym322;
                xj4ka7jla.Puu3Rhg4F = true;
            }
            this.sk5s77z6Q.cAwN510t2(this.MzoOEjc4X.J4Ux7ym32());
            invalidate();
            this.dXrmkklc8.tGV7Q6urW();
        }
    }

    @Override // con.H8Cq8Y88s
    public void invalidate() {
        if (!this.PSTqBLTET && !this.ilHKhw3Yw) {
            this.CBQ5d1kRq.invalidate();
            vPSbyrYWX(true);
        }
    }

    @Override // con.H8Cq8Y88s
    public void kCA6Zs9sL() {
        A128gLXzp a128gLXzp;
        if (this.PSTqBLTET || !this.sk5s77z6Q.dfpT1j18n()) {
            vPSbyrYWX(false);
            if (this.sk5s77z6Q.kmSgne1rO()) {
                xj4ka7JlA xj4ka7jla = this.MzoOEjc4X;
                if (!(!xj4ka7jla.yWvV4ePLl)) {
                    xj4ka7jla.kCA6Zs9sL();
                    a128gLXzp = xj4ka7jla.GPLPRo6go;
                    this.sk5s77z6Q.nlGCs0NZs(this.RG6kpfv3v, a128gLXzp, this.kmSgne1rO);
                }
            }
            a128gLXzp = null;
            this.sk5s77z6Q.nlGCs0NZs(this.RG6kpfv3v, a128gLXzp, this.kmSgne1rO);
        }
    }

    @Override // con.H8Cq8Y88s
    public boolean oon79WMrY(long j) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
        if (this.sk5s77z6Q.PSTqBLTET()) {
            return 0.0f <= tGV7Q6urW && tGV7Q6urW < ((float) this.sk5s77z6Q.q3BipwRCk()) && 0.0f <= dIocxURUo && dIocxURUo < ((float) this.sk5s77z6Q.J4Ux7ym32());
        }
        if (this.sk5s77z6Q.kmSgne1rO()) {
            return this.MzoOEjc4X.tGV7Q6urW(j);
        }
        return true;
    }

    @Override // con.H8Cq8Y88s
    public void q3BipwRCk(PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        vPSbyrYWX(false);
        this.ilHKhw3Yw = false;
        this.qVUwofr5s = false;
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        this.ixWaw2akD = WyfbJwwBZ.tGV7Q6urW;
        this.kmSgne1rO = pmanMZxiM;
        this.Bhmn1KIah = gdemqfwpt;
    }

    @Override // con.H8Cq8Y88s
    public long tGV7Q6urW(long j, boolean z) {
        if (!z) {
            return p20sE4qqm.J4Ux7ym32(this.dXrmkklc8.J4Ux7ym32(this.sk5s77z6Q), j);
        }
        float[] q3BipwRCk = this.dXrmkklc8.q3BipwRCk(this.sk5s77z6Q);
        bRgfgYIQX brgfgyiqx = q3BipwRCk == null ? null : new bRgfgYIQX(p20sE4qqm.J4Ux7ym32(q3BipwRCk, j));
        if (brgfgyiqx != null) {
            return brgfgyiqx.q3BipwRCk;
        }
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.dIocxURUo;
    }

    public final void vPSbyrYWX(boolean z) {
        if (z != this.PSTqBLTET) {
            this.PSTqBLTET = z;
            this.CBQ5d1kRq.CBQ5d1kRq(this, z);
        }
    }

    @Override // con.H8Cq8Y88s
    public void yWvV4ePLl(iPoCEXeoL ipocexeol, boolean z) {
        if (z) {
            float[] q3BipwRCk = this.dXrmkklc8.q3BipwRCk(this.sk5s77z6Q);
            if (q3BipwRCk == null) {
                ipocexeol.q3BipwRCk = 0.0f;
                ipocexeol.J4Ux7ym32 = 0.0f;
                ipocexeol.tGV7Q6urW = 0.0f;
                ipocexeol.dIocxURUo = 0.0f;
                return;
            }
            p20sE4qqm.tGV7Q6urW(q3BipwRCk, ipocexeol);
            return;
        }
        p20sE4qqm.tGV7Q6urW(this.dXrmkklc8.J4Ux7ym32(this.sk5s77z6Q), ipocexeol);
    }
}
