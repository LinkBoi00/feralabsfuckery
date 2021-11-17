package con;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class qhaZGYFO8 extends n2gATecRC implements hKxHUWEcH, mnTaxtMa7, h6X6YP6tq, PmanMZxiM {
    public static final HuuFmERlx AqaWJg0b4 = new HuuFmERlx();
    public PmanMZxiM Eeka1udhb;
    public iPoCEXeoL IytU16YUK;
    public final pLYbCSTk0 MzoOEjc4X;
    public BFRsKhrQv RG6kpfv3v;
    public aZDaaZZJA WaUP0CF08;
    public boolean cAwN510t2;
    public AU29aHa4X dXrmkklc8;
    public Map i8XZMQc6Z;
    public float iMyQMM6Qj;
    public qhaZGYFO8 ilHKhw3Yw;
    public H8Cq8Y88s nlGCs0NZs;
    public boolean qFBXIgpia;
    public boolean qVUwofr5s;
    public boolean sk5s77z6Q;
    public float ixWaw2akD = 0.8f;
    public long dfpT1j18n = ZtJSMDYDl.tGV7Q6urW;
    public final gdEmqfwpT CpG0imbht = new nwvyEZJPU(this);

    public qhaZGYFO8(pLYbCSTk0 plybcstk0) {
        this.MzoOEjc4X = plybcstk0;
        this.dXrmkklc8 = plybcstk0.iMyQMM6Qj;
        this.RG6kpfv3v = plybcstk0.IytU16YUK;
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
    }

    public final jgMsl7cgu BL4OzhZBd() {
        jgMsl7cgu wIZEdYHUn;
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        jgMsl7cgu XYT7vJqNO = qhazgyfo8 == null ? null : qhazgyfo8.XYT7vJqNO();
        if (XYT7vJqNO != null) {
            return XYT7vJqNO;
        }
        pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
        do {
            plybcstk0 = plybcstk0.oon79WMrY();
            if (plybcstk0 == null) {
                return null;
            }
            wIZEdYHUn = plybcstk0.V9LQMKGJe.ilHKhw3Yw.wIZEdYHUn();
        } while (wIZEdYHUn == null);
        return wIZEdYHUn;
    }

    public void BqpzfZavo(Mf8l3AEb0 mf8l3AEb0) {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 != null) {
            qhazgyfo8.BqpzfZavo(mf8l3AEb0);
        }
    }

    public long CMnfe2r2N(long j) {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            j = h8Cq8Y88s.tGV7Q6urW(j, false);
        }
        long j2 = this.dfpT1j18n;
        return ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(j) + ((float) ZtJSMDYDl.q3BipwRCk(j2)), bRgfgYIQX.dIocxURUo(j) + ((float) ZtJSMDYDl.J4Ux7ym32(j2)));
    }

    public final long Dr7UqlxEV() {
        return this.dXrmkklc8.PSTqBLTET(this.MzoOEjc4X.CpG0imbht.kCA6Zs9sL());
    }

    public abstract KB2jjcOAK DuuXfa7LE();

    public final long EBQXiIPmm(qhaZGYFO8 qhazgyfo8, long j) {
        if (qhazgyfo8 == this) {
            return j;
        }
        qhaZGYFO8 qhazgyfo82 = this.ilHKhw3Yw;
        return (qhazgyfo82 == null || anXlDk6fV.tGV7Q6urW(qhazgyfo8, qhazgyfo82)) ? INnK5Rew6(j) : INnK5Rew6(qhazgyfo82.EBQXiIPmm(qhazgyfo8, j));
    }

    public qhaZGYFO8 IG30YE5GU() {
        return null;
    }

    public long INnK5Rew6(long j) {
        long j2 = this.dfpT1j18n;
        long dIocxURUo = ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(j) - ((float) ZtJSMDYDl.q3BipwRCk(j2)), bRgfgYIQX.dIocxURUo(j) - ((float) ZtJSMDYDl.J4Ux7ym32(j2)));
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        return h8Cq8Y88s == null ? dIocxURUo : h8Cq8Y88s.tGV7Q6urW(dIocxURUo, true);
    }

    public long Ihm5o4uLx(mnTaxtMa7 mntaxtma7, long j) {
        qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
        qhaZGYFO8 zHl31GGXU = zHl31GGXU(qhazgyfo8);
        while (qhazgyfo8 != zHl31GGXU) {
            j = qhazgyfo8.CMnfe2r2N(j);
            qhazgyfo8 = qhazgyfo8.ilHKhw3Yw;
        }
        return EBQXiIPmm(zHl31GGXU, j);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        boolean z;
        SI0VpKubr sI0VpKubr = (SI0VpKubr) obj;
        pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
        if (plybcstk0.nlGCs0NZs) {
            OIP2vionU snapshotObserver = BBVaGLNaU.i0Zug1mVk(plybcstk0).getSnapshotObserver();
            snapshotObserver.q3BipwRCk.J4Ux7ym32(this, DlhjQ2PrY.qFBXIgpia, new kuvj6DyFF(this, sI0VpKubr));
            z = false;
        } else {
            z = true;
        }
        this.qFBXIgpia = z;
        return qih4lW99W.q3BipwRCk;
    }

    public abstract KB2jjcOAK IzM1cD9ly(boolean z);

    @Override // con.h6X6YP6tq
    public boolean J4Ux7ym32() {
        return this.nlGCs0NZs != null;
    }

    public void JxIJId84K(int i, int i2) {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            h8Cq8Y88s.iiGwOFFnr(D3DEikrvb.dIocxURUo(i, i2));
        } else {
            qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
            if (qhazgyfo8 != null) {
                qhazgyfo8.lqFHPHdW3();
            }
        }
        pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
        jRWr6Yc4S jrwr6yc4s = plybcstk0.qVUwofr5s;
        if (jrwr6yc4s != null) {
            ((AndroidComposeView) jrwr6yc4s).kmSgne1rO(plybcstk0);
        }
        QNqj6nIzv(D3DEikrvb.dIocxURUo(i, i2));
    }

    public final List KBYw84i3W(boolean z) {
        qhaZGYFO8 IG30YE5GU = IG30YE5GU();
        KB2jjcOAK IzM1cD9ly = IG30YE5GU == null ? null : IG30YE5GU.IzM1cD9ly(z);
        if (IzM1cD9ly != null) {
            return Collections.singletonList(IzM1cD9ly);
        }
        ArrayList arrayList = new ArrayList();
        List Puu3Rhg4F = this.MzoOEjc4X.Puu3Rhg4F();
        int i = 0;
        int size = Puu3Rhg4F.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                xpuSUT7Gh.QNqj6nIzv((pLYbCSTk0) Puu3Rhg4F.get(i), arrayList, z);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public abstract void KlYagMRWx(long j, ugecCdPSw ugeccdpsw);

    public final void L4EwGfXiQ(SI0VpKubr sI0VpKubr, AA4ZBBPJq aA4ZBBPJq) {
        sI0VpKubr.CBQ5d1kRq(new bzmJZsHMu(0.5f, 0.5f, ((float) YWiUMZOtw.tGV7Q6urW(this.Bhmn1KIah)) - 0.5f, ((float) YWiUMZOtw.J4Ux7ym32(this.Bhmn1KIah)) - 0.5f), aA4ZBBPJq);
    }

    public final mnTaxtMa7 M66hQ219i() {
        if (oesmsHQJU()) {
            return this.MzoOEjc4X.V9LQMKGJe.ilHKhw3Yw.ilHKhw3Yw;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final KB2jjcOAK OpLJtmvFM() {
        KB2jjcOAK ziwPzaoF3;
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        KB2jjcOAK DuuXfa7LE = qhazgyfo8 == null ? null : qhazgyfo8.DuuXfa7LE();
        if (DuuXfa7LE != null) {
            return DuuXfa7LE;
        }
        pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
        do {
            plybcstk0 = plybcstk0.oon79WMrY();
            if (plybcstk0 == null) {
                return null;
            }
            ziwPzaoF3 = plybcstk0.V9LQMKGJe.ilHKhw3Yw.ziwPzaoF3();
        } while (ziwPzaoF3 == null);
        return ziwPzaoF3;
    }

    public final void OuoYhTxyj() {
        qhaZGYFO8 qhazgyfo8;
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        boolean z = false;
        if (h8Cq8Y88s != null) {
            PmanMZxiM pmanMZxiM = this.Eeka1udhb;
            if (pmanMZxiM != null) {
                HuuFmERlx huuFmERlx = AqaWJg0b4;
                huuFmERlx.CBQ5d1kRq = 1.0f;
                huuFmERlx.kmSgne1rO = 1.0f;
                huuFmERlx.Bhmn1KIah = 1.0f;
                huuFmERlx.PSTqBLTET = 0.0f;
                huuFmERlx.MzoOEjc4X = 0.0f;
                huuFmERlx.ilHKhw3Yw = 0.0f;
                huuFmERlx.qVUwofr5s = 0.0f;
                huuFmERlx.Eeka1udhb = 0.0f;
                huuFmERlx.dXrmkklc8 = 0.0f;
                huuFmERlx.RG6kpfv3v = 8.0f;
                ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
                huuFmERlx.ixWaw2akD = WyfbJwwBZ.tGV7Q6urW;
                huuFmERlx.sk5s77z6Q = Nb0J8E3sF.q3BipwRCk;
                huuFmERlx.WaUP0CF08 = false;
                pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
                huuFmERlx.i8XZMQc6Z = plybcstk0.iMyQMM6Qj;
                OIP2vionU snapshotObserver = BBVaGLNaU.i0Zug1mVk(plybcstk0).getSnapshotObserver();
                snapshotObserver.q3BipwRCk.J4Ux7ym32(this, JHFXdtjfx.IytU16YUK, new nwvyEZJPU(pmanMZxiM));
                float f = huuFmERlx.CBQ5d1kRq;
                float f2 = huuFmERlx.kmSgne1rO;
                float f3 = huuFmERlx.Bhmn1KIah;
                float f4 = huuFmERlx.PSTqBLTET;
                float f5 = huuFmERlx.MzoOEjc4X;
                float f6 = huuFmERlx.ilHKhw3Yw;
                float f7 = huuFmERlx.qVUwofr5s;
                float f8 = huuFmERlx.Eeka1udhb;
                float f9 = huuFmERlx.dXrmkklc8;
                float f10 = huuFmERlx.RG6kpfv3v;
                long j = huuFmERlx.ixWaw2akD;
                JZuV4yGnu jZuV4yGnu = huuFmERlx.sk5s77z6Q;
                boolean z2 = huuFmERlx.WaUP0CF08;
                pLYbCSTk0 plybcstk02 = this.MzoOEjc4X;
                h8Cq8Y88s.Puu3Rhg4F(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, jZuV4yGnu, z2, null, plybcstk02.IytU16YUK, plybcstk02.iMyQMM6Qj);
                qhazgyfo8 = this;
                qhazgyfo8.qVUwofr5s = huuFmERlx.WaUP0CF08;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            qhazgyfo8 = this;
            if (qhazgyfo8.Eeka1udhb == null) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        qhazgyfo8.ixWaw2akD = AqaWJg0b4.Bhmn1KIah;
        pLYbCSTk0 plybcstk03 = qhazgyfo8.MzoOEjc4X;
        jRWr6Yc4S jrwr6yc4s = plybcstk03.qVUwofr5s;
        if (jrwr6yc4s != null) {
            ((AndroidComposeView) jrwr6yc4s).kmSgne1rO(plybcstk03);
        }
    }

    public final void QSbMsHU5X(SI0VpKubr sI0VpKubr) {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            h8Cq8Y88s.GPLPRo6go(sI0VpKubr);
            return;
        }
        float q3BipwRCk = (float) ZtJSMDYDl.q3BipwRCk(this.dfpT1j18n);
        float J4Ux7ym32 = (float) ZtJSMDYDl.J4Ux7ym32(this.dfpT1j18n);
        sI0VpKubr.dXrmkklc8(q3BipwRCk, J4Ux7ym32);
        aS2AFthYA(sI0VpKubr);
        sI0VpKubr.dXrmkklc8(-q3BipwRCk, -J4Ux7ym32);
    }

    public Set R2hkbNqWf() {
        Map dIocxURUo;
        aZDaaZZJA azdaazzja = this.WaUP0CF08;
        Set set = null;
        if (!(azdaazzja == null || (dIocxURUo = azdaazzja.dIocxURUo()) == null)) {
            set = dIocxURUo.keySet();
        }
        return set == null ? bSc306J1d.CBQ5d1kRq : set;
    }

    public bzmJZsHMu ShSN9wbzk(mnTaxtMa7 mntaxtma7, boolean z) {
        if (oesmsHQJU()) {
            qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
            if (qhazgyfo8.oesmsHQJU()) {
                qhaZGYFO8 zHl31GGXU = zHl31GGXU(qhazgyfo8);
                iPoCEXeoL ipocexeol = this.IytU16YUK;
                if (ipocexeol == null) {
                    ipocexeol = new iPoCEXeoL(0.0f, 0.0f, 0.0f, 0.0f);
                    this.IytU16YUK = ipocexeol;
                }
                ipocexeol.q3BipwRCk = 0.0f;
                ipocexeol.J4Ux7ym32 = 0.0f;
                ipocexeol.tGV7Q6urW = (float) YWiUMZOtw.tGV7Q6urW(qhazgyfo8.Bhmn1KIah);
                ipocexeol.dIocxURUo = (float) YWiUMZOtw.J4Ux7ym32(qhazgyfo8.Bhmn1KIah);
                while (qhazgyfo8 != zHl31GGXU) {
                    qhazgyfo8.koMoKnP1S(ipocexeol, z, false);
                    if (ipocexeol.J4Ux7ym32()) {
                        ksLrMHgEz kslrmhgez = bzmJZsHMu.kCA6Zs9sL;
                        ksLrMHgEz kslrmhgez2 = bzmJZsHMu.kCA6Zs9sL;
                        return bzmJZsHMu.iiGwOFFnr;
                    }
                    qhazgyfo8 = qhazgyfo8.ilHKhw3Yw;
                }
                igRQEZxnW(zHl31GGXU, ipocexeol, z);
                return new bzmJZsHMu(ipocexeol.q3BipwRCk, ipocexeol.J4Ux7ym32, ipocexeol.tGV7Q6urW, ipocexeol.dIocxURUo);
            }
            throw new IllegalStateException(("LayoutCoordinates " + mntaxtma7 + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final aZDaaZZJA SuKhTJIQc() {
        aZDaaZZJA azdaazzja = this.WaUP0CF08;
        if (azdaazzja != null) {
            return azdaazzja;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public long Ta2zrwkcM(long j) {
        if (oesmsHQJU()) {
            for (qhaZGYFO8 qhazgyfo8 = this; qhazgyfo8 != null; qhazgyfo8 = qhazgyfo8.ilHKhw3Yw) {
                j = qhazgyfo8.CMnfe2r2N(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public void TyB1UUd72() {
        this.sk5s77z6Q = true;
        vIbyhVf1d(this.Eeka1udhb);
    }

    public abstract jgMsl7cgu XYT7vJqNO();

    public final boolean YmNRDyka4() {
        if (this.nlGCs0NZs != null && this.ixWaw2akD <= 0.0f) {
            return true;
        }
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 == null) {
            return false;
        }
        return qhazgyfo8.YmNRDyka4();
    }

    public final long a8N8UmDyD(long j) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
        float max = Math.max(0.0f, tGV7Q6urW < 0.0f ? -tGV7Q6urW : tGV7Q6urW - ((float) i0Zug1mVk()));
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
        return ODug2UCW1.dIocxURUo(max, Math.max(0.0f, dIocxURUo < 0.0f ? -dIocxURUo : dIocxURUo - ((float) vNtjxmzUM())));
    }

    public abstract void aS2AFthYA(SI0VpKubr sI0VpKubr);

    public abstract void buPcffgdD(long j, ugecCdPSw ugeccdpsw, boolean z);

    public Object hKeU0pt2N(PJrc76djZ pJrc76djZ) {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        Object hKeU0pt2N = qhazgyfo8 == null ? null : qhazgyfo8.hKeU0pt2N(pJrc76djZ);
        return hKeU0pt2N == null ? pJrc76djZ.q3BipwRCk.GPLPRo6go() : hKeU0pt2N;
    }

    @Override // con.RKTSrafvn
    public final int i8XZMQc6Z(OGQYjfdsY oGQYjfdsY) {
        int juJ6pnCpu;
        if ((this.WaUP0CF08 != null) && (juJ6pnCpu = juJ6pnCpu(oGQYjfdsY)) != Integer.MIN_VALUE) {
            return juJ6pnCpu + ZtJSMDYDl.J4Ux7ym32(NyWTwPF6V());
        }
        return Integer.MIN_VALUE;
    }

    public final void ifDs8fRNm(aZDaaZZJA azdaazzja) {
        pLYbCSTk0 oon79WMrY;
        aZDaaZZJA azdaazzja2 = this.WaUP0CF08;
        if (azdaazzja != azdaazzja2) {
            this.WaUP0CF08 = azdaazzja;
            if (!(azdaazzja2 != null && azdaazzja.q3BipwRCk() == azdaazzja2.q3BipwRCk() && azdaazzja.J4Ux7ym32() == azdaazzja2.J4Ux7ym32())) {
                JxIJId84K(azdaazzja.q3BipwRCk(), azdaazzja.J4Ux7ym32());
            }
            Map map = this.i8XZMQc6Z;
            if ((!(map == null || map.isEmpty()) || (!azdaazzja.dIocxURUo().isEmpty())) && !anXlDk6fV.tGV7Q6urW(azdaazzja.dIocxURUo(), this.i8XZMQc6Z)) {
                qhaZGYFO8 IG30YE5GU = IG30YE5GU();
                if (anXlDk6fV.tGV7Q6urW(IG30YE5GU == null ? null : IG30YE5GU.MzoOEjc4X, this.MzoOEjc4X)) {
                    pLYbCSTk0 oon79WMrY2 = this.MzoOEjc4X.oon79WMrY();
                    if (oon79WMrY2 != null) {
                        oon79WMrY2.i8XZMQc6Z();
                    }
                    pLYbCSTk0 plybcstk0 = this.MzoOEjc4X;
                    kFuaB4ofb kfuab4ofb = plybcstk0.qFBXIgpia;
                    if (kfuab4ofb.tGV7Q6urW) {
                        pLYbCSTk0 oon79WMrY3 = plybcstk0.oon79WMrY();
                        if (oon79WMrY3 != null) {
                            oon79WMrY3.nlGCs0NZs();
                        }
                    } else if (kfuab4ofb.dIocxURUo && (oon79WMrY = plybcstk0.oon79WMrY()) != null) {
                        oon79WMrY.CpG0imbht();
                    }
                } else {
                    this.MzoOEjc4X.i8XZMQc6Z();
                }
                this.MzoOEjc4X.qFBXIgpia.J4Ux7ym32 = true;
                Map map2 = this.i8XZMQc6Z;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.i8XZMQc6Z = map2;
                }
                map2.clear();
                map2.putAll(azdaazzja.dIocxURUo());
            }
        }
    }

    public final void igRQEZxnW(qhaZGYFO8 qhazgyfo8, iPoCEXeoL ipocexeol, boolean z) {
        if (qhazgyfo8 != this) {
            qhaZGYFO8 qhazgyfo82 = this.ilHKhw3Yw;
            if (qhazgyfo82 != null) {
                qhazgyfo82.igRQEZxnW(qhazgyfo8, ipocexeol, z);
            }
            float q3BipwRCk = (float) ZtJSMDYDl.q3BipwRCk(this.dfpT1j18n);
            ipocexeol.q3BipwRCk -= q3BipwRCk;
            ipocexeol.tGV7Q6urW -= q3BipwRCk;
            float J4Ux7ym32 = (float) ZtJSMDYDl.J4Ux7ym32(this.dfpT1j18n);
            ipocexeol.J4Ux7ym32 -= J4Ux7ym32;
            ipocexeol.dIocxURUo -= J4Ux7ym32;
            H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
            if (h8Cq8Y88s != null) {
                h8Cq8Y88s.yWvV4ePLl(ipocexeol, true);
                if (this.qVUwofr5s && z) {
                    ipocexeol.q3BipwRCk(0.0f, 0.0f, (float) YWiUMZOtw.tGV7Q6urW(this.Bhmn1KIah), (float) YWiUMZOtw.J4Ux7ym32(this.Bhmn1KIah));
                }
            }
        }
    }

    public void j22ftfeNI() {
        this.sk5s77z6Q = false;
        vIbyhVf1d(this.Eeka1udhb);
        pLYbCSTk0 oon79WMrY = this.MzoOEjc4X.oon79WMrY();
        if (oon79WMrY != null) {
            oon79WMrY.MzoOEjc4X();
        }
    }

    public abstract int juJ6pnCpu(OGQYjfdsY oGQYjfdsY);

    public abstract vo9l1HK5r kktL0P5MG();

    public final void koMoKnP1S(iPoCEXeoL ipocexeol, boolean z, boolean z2) {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            if (this.qVUwofr5s) {
                if (z2) {
                    long Dr7UqlxEV = Dr7UqlxEV();
                    float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(Dr7UqlxEV) / 2.0f;
                    float tGV7Q6urW = tbzY8QG6X.tGV7Q6urW(Dr7UqlxEV) / 2.0f;
                    ipocexeol.q3BipwRCk(-kCA6Zs9sL, -tGV7Q6urW, ((float) YWiUMZOtw.tGV7Q6urW(this.Bhmn1KIah)) + kCA6Zs9sL, ((float) YWiUMZOtw.J4Ux7ym32(this.Bhmn1KIah)) + tGV7Q6urW);
                } else if (z) {
                    ipocexeol.q3BipwRCk(0.0f, 0.0f, (float) YWiUMZOtw.tGV7Q6urW(this.Bhmn1KIah), (float) YWiUMZOtw.J4Ux7ym32(this.Bhmn1KIah));
                }
                if (ipocexeol.J4Ux7ym32()) {
                    return;
                }
            }
            h8Cq8Y88s.yWvV4ePLl(ipocexeol, false);
        }
        float q3BipwRCk = (float) ZtJSMDYDl.q3BipwRCk(this.dfpT1j18n);
        ipocexeol.q3BipwRCk += q3BipwRCk;
        ipocexeol.tGV7Q6urW += q3BipwRCk;
        float J4Ux7ym32 = (float) ZtJSMDYDl.J4Ux7ym32(this.dfpT1j18n);
        ipocexeol.J4Ux7ym32 += J4Ux7ym32;
        ipocexeol.dIocxURUo += J4Ux7ym32;
    }

    public abstract FRJidynr8 ln3nf7LH3();

    public void lqFHPHdW3() {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            h8Cq8Y88s.invalidate();
            return;
        }
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 != null) {
            qhazgyfo8.lqFHPHdW3();
        }
    }

    public abstract vo9l1HK5r n4UIOvAko();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r3 == null) goto L_0x0043;
     */
    @Override // con.n2gATecRC
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void o4LF8RkoQ(long r3, float r5, con.PmanMZxiM r6) {
        /*
            r2 = this;
            r2.vIbyhVf1d(r6)
            long r0 = r2.dfpT1j18n
            con.joOFKdxvJ r6 = con.ZtJSMDYDl.J4Ux7ym32
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x000d
            r6 = 1
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x004f
            r2.dfpT1j18n = r3
            con.H8Cq8Y88s r6 = r2.nlGCs0NZs
            if (r6 == 0) goto L_0x001a
            r6.dIocxURUo(r3)
            goto L_0x0022
        L_0x001a:
            con.qhaZGYFO8 r3 = r2.ilHKhw3Yw
            if (r3 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r3.lqFHPHdW3()
        L_0x0022:
            con.qhaZGYFO8 r3 = r2.IG30YE5GU()
            if (r3 != 0) goto L_0x002a
            r3 = 0
            goto L_0x002c
        L_0x002a:
            con.pLYbCSTk0 r3 = r3.MzoOEjc4X
        L_0x002c:
            con.pLYbCSTk0 r4 = r2.MzoOEjc4X
            boolean r3 = con.anXlDk6fV.tGV7Q6urW(r3, r4)
            if (r3 != 0) goto L_0x0037
            con.pLYbCSTk0 r3 = r2.MzoOEjc4X
            goto L_0x0040
        L_0x0037:
            con.pLYbCSTk0 r3 = r2.MzoOEjc4X
            con.pLYbCSTk0 r3 = r3.oon79WMrY()
            if (r3 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r3.i8XZMQc6Z()
        L_0x0043:
            con.pLYbCSTk0 r3 = r2.MzoOEjc4X
            con.jRWr6Yc4S r4 = r3.qVUwofr5s
            if (r4 != 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r4.kmSgne1rO(r3)
        L_0x004f:
            r2.iMyQMM6Qj = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qhaZGYFO8.o4LF8RkoQ(long, float, con.PmanMZxiM):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean oRfL5Lv1q(long r7, boolean r9) {
        /*
            r6 = this;
            float r0 = con.bRgfgYIQX.tGV7Q6urW(r7)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0014
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0014
            r0 = r3
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x002e
            float r0 = con.bRgfgYIQX.dIocxURUo(r7)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0029
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0029
            r0 = r3
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r0 = r3
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x0032:
            con.H8Cq8Y88s r0 = r6.nlGCs0NZs
            if (r0 == 0) goto L_0x008c
            boolean r1 = r6.qVUwofr5s
            if (r1 == 0) goto L_0x008c
            if (r9 == 0) goto L_0x0087
            long r4 = r6.Dr7UqlxEV()
            float r9 = con.tbzY8QG6X.kCA6Zs9sL(r4)
            r1 = 0
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0054
            float r9 = con.tbzY8QG6X.tGV7Q6urW(r4)
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r9 = r2
            goto L_0x0055
        L_0x0054:
            r9 = r3
        L_0x0055:
            if (r9 != 0) goto L_0x0087
            long r7 = r6.a8N8UmDyD(r7)
            con.AU29aHa4X r9 = r6.dXrmkklc8
            con.pLYbCSTk0 r0 = r6.MzoOEjc4X
            con.fCkNY70T9 r0 = r0.CpG0imbht
            long r0 = r0.kCA6Zs9sL()
            long r0 = r9.PSTqBLTET(r0)
            float r9 = con.bRgfgYIQX.tGV7Q6urW(r7)
            float r4 = con.tbzY8QG6X.kCA6Zs9sL(r0)
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0086
            float r7 = con.bRgfgYIQX.dIocxURUo(r7)
            float r8 = con.tbzY8QG6X.tGV7Q6urW(r0)
            float r8 = r8 / r5
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0086
            r2 = r3
        L_0x0086:
            return r2
        L_0x0087:
            boolean r7 = r0.oon79WMrY(r7)
            return r7
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qhaZGYFO8.oRfL5Lv1q(long, boolean):boolean");
    }

    public final boolean oesmsHQJU() {
        if (!this.sk5s77z6Q || this.MzoOEjc4X.Eeka1udhb()) {
            return this.sk5s77z6Q;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void suAKJqyYV() {
        H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
        if (h8Cq8Y88s != null) {
            h8Cq8Y88s.invalidate();
        }
    }

    public void tFD7BDQ71(swjAY0qwY swjay0qwy) {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 != null) {
            qhazgyfo8.tFD7BDQ71(swjay0qwy);
        }
    }

    public long tTcQQNK5P(long j) {
        if (oesmsHQJU()) {
            mnTaxtMa7 iMyQMM6Qj = p62TZmTyO.iMyQMM6Qj(this);
            AndroidComposeView androidComposeView = (AndroidComposeView) BBVaGLNaU.i0Zug1mVk(this.MzoOEjc4X);
            androidComposeView.MzoOEjc4X();
            return Ihm5o4uLx(iMyQMM6Qj, bRgfgYIQX.kCA6Zs9sL(p20sE4qqm.J4Ux7ym32(androidComposeView.QSbMsHU5X, j), p62TZmTyO.nlGCs0NZs(iMyQMM6Qj)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public long uSBmk4hFZ(long j) {
        long Ta2zrwkcM = Ta2zrwkcM(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) BBVaGLNaU.i0Zug1mVk(this.MzoOEjc4X);
        androidComposeView.MzoOEjc4X();
        return p20sE4qqm.J4Ux7ym32(androidComposeView.j22ftfeNI, Ta2zrwkcM);
    }

    public final void vIbyhVf1d(PmanMZxiM pmanMZxiM) {
        pLYbCSTk0 plybcstk0;
        jRWr6Yc4S jrwr6yc4s;
        boolean z = (this.Eeka1udhb == pmanMZxiM && anXlDk6fV.tGV7Q6urW(this.dXrmkklc8, this.MzoOEjc4X.iMyQMM6Qj) && this.RG6kpfv3v == this.MzoOEjc4X.IytU16YUK) ? false : true;
        this.Eeka1udhb = pmanMZxiM;
        pLYbCSTk0 plybcstk02 = this.MzoOEjc4X;
        this.dXrmkklc8 = plybcstk02.iMyQMM6Qj;
        this.RG6kpfv3v = plybcstk02.IytU16YUK;
        Object obj = null;
        if (!oesmsHQJU() || pmanMZxiM == null) {
            H8Cq8Y88s h8Cq8Y88s = this.nlGCs0NZs;
            if (h8Cq8Y88s != null) {
                h8Cq8Y88s.J4Ux7ym32();
                this.MzoOEjc4X.EBQXiIPmm = true;
                this.CpG0imbht.GPLPRo6go();
                if (oesmsHQJU() && (jrwr6yc4s = (plybcstk0 = this.MzoOEjc4X).qVUwofr5s) != null) {
                    ((AndroidComposeView) jrwr6yc4s).kmSgne1rO(plybcstk0);
                }
            }
            this.nlGCs0NZs = null;
            this.qFBXIgpia = false;
        } else if (this.nlGCs0NZs == null) {
            jRWr6Yc4S i0Zug1mVk = BBVaGLNaU.i0Zug1mVk(this.MzoOEjc4X);
            gdEmqfwpT gdemqfwpt = this.CpG0imbht;
            AndroidComposeView androidComposeView = (AndroidComposeView) i0Zug1mVk;
            PlegqbMSA plegqbMSA = androidComposeView.buPcffgdD;
            plegqbMSA.tGV7Q6urW();
            while (true) {
                if (!((pnuAOe8oh) plegqbMSA.CBQ5d1kRq).oon79WMrY()) {
                    break;
                }
                pnuAOe8oh pnuaoe8oh = (pnuAOe8oh) plegqbMSA.CBQ5d1kRq;
                Object obj2 = ((Reference) pnuaoe8oh.CBQ5d1kRq(pnuaoe8oh.Bhmn1KIah - 1)).get();
                if (obj2 != null) {
                    obj = obj2;
                    break;
                }
            }
            H8Cq8Y88s h8Cq8Y88s2 = (H8Cq8Y88s) obj;
            if (h8Cq8Y88s2 != null) {
                h8Cq8Y88s2.q3BipwRCk(this, gdemqfwpt);
            } else {
                if (androidComposeView.isHardwareAccelerated() && androidComposeView.IzM1cD9ly) {
                    try {
                        h8Cq8Y88s2 = new AcTK2lQGF(androidComposeView, this, gdemqfwpt);
                    } catch (Throwable unused) {
                        androidComposeView.IzM1cD9ly = false;
                    }
                }
                if (androidComposeView.o4LF8RkoQ == null) {
                    Kfj0pfb90 kfj0pfb90 = iUgWrj1f5.WaUP0CF08;
                    if (!iUgWrj1f5.cAwN510t2) {
                        kfj0pfb90.q3BipwRCk(new View(androidComposeView.getContext()));
                    }
                    kvS6fwO6H kvs6fwo6h = iUgWrj1f5.IytU16YUK ? new kvS6fwO6H(androidComposeView.getContext()) : new lRaSRwqWj(androidComposeView.getContext());
                    androidComposeView.o4LF8RkoQ = kvs6fwo6h;
                    androidComposeView.addView(kvs6fwo6h);
                }
                h8Cq8Y88s2 = new iUgWrj1f5(androidComposeView, androidComposeView.o4LF8RkoQ, this, gdemqfwpt);
            }
            h8Cq8Y88s2.iiGwOFFnr(this.Bhmn1KIah);
            h8Cq8Y88s2.dIocxURUo(this.dfpT1j18n);
            this.nlGCs0NZs = h8Cq8Y88s2;
            OuoYhTxyj();
            this.MzoOEjc4X.EBQXiIPmm = true;
            this.CpG0imbht.GPLPRo6go();
        } else if (z) {
            OuoYhTxyj();
        }
    }

    public abstract jgMsl7cgu wIZEdYHUn();

    public final qhaZGYFO8 zHl31GGXU(qhaZGYFO8 qhazgyfo8) {
        pLYbCSTk0 plybcstk0 = qhazgyfo8.MzoOEjc4X;
        pLYbCSTk0 plybcstk02 = this.MzoOEjc4X;
        if (plybcstk0 == plybcstk02) {
            qhaZGYFO8 qhazgyfo82 = plybcstk02.V9LQMKGJe.ilHKhw3Yw;
            qhaZGYFO8 qhazgyfo83 = this;
            while (qhazgyfo83 != qhazgyfo82 && qhazgyfo83 != qhazgyfo8) {
                qhazgyfo83 = qhazgyfo83.ilHKhw3Yw;
            }
            return qhazgyfo83 == qhazgyfo8 ? qhazgyfo8 : this;
        }
        while (plybcstk0.Eeka1udhb > plybcstk02.Eeka1udhb) {
            plybcstk0 = plybcstk0.oon79WMrY();
        }
        while (plybcstk02.Eeka1udhb > plybcstk0.Eeka1udhb) {
            plybcstk02 = plybcstk02.oon79WMrY();
        }
        while (plybcstk0 != plybcstk02) {
            plybcstk0 = plybcstk0.oon79WMrY();
            plybcstk02 = plybcstk02.oon79WMrY();
            if (plybcstk0 != null) {
                if (plybcstk02 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (plybcstk02 == this.MzoOEjc4X) {
            return this;
        }
        return plybcstk0 == qhazgyfo8.MzoOEjc4X ? qhazgyfo8 : plybcstk0.o4LF8RkoQ;
    }

    public abstract KB2jjcOAK ziwPzaoF3();
}
