package con;

import android.content.Context;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class dMQC97DHs extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 27;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(Context context, YwogV6ONJ ywogV6ONJ) {
        super(1);
        this.Bhmn1KIah = context;
        this.PSTqBLTET = ywogV6ONJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    @Override // con.PmanMZxiM
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object IytU16YUK(Object obj) {
        boolean z;
        TB2AsrPRd tB2AsrPRd;
        UwmKmkwV0 uwmKmkwV0;
        zRlqFnDB5 zrlqfndb5;
        boolean z2 = false;
        switch (this.kmSgne1rO) {
            case 1:
                tGV7Q6urW((HXRw132ar) obj);
                return qih4lW99W.q3BipwRCk;
            case 2:
                tGV7Q6urW((HXRw132ar) obj);
                return qih4lW99W.q3BipwRCk;
            case 3:
            case 24:
            case 25:
            case 26:
            default:
                Throwable th = (Throwable) obj;
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                b0pCjrhT1 b0pcjrht1 = (b0pCjrhT1) this.Bhmn1KIah;
                tDmftakZl tdmftakzl = (tDmftakZl) this.PSTqBLTET;
                float f = b0pcjrht1.J4Ux7ym32 ? ((float) -1) * floatValue : floatValue;
                ksLrMHgEz kslrmhgez = tcSzM3TgQ.q3BipwRCk;
                ksLrMHgEz kslrmhgez2 = tcSzM3TgQ.q3BipwRCk;
                return Float.valueOf(floatValue - ((b0pCjrhT1) this.Bhmn1KIah).dIocxURUo(b0pcjrht1.q3BipwRCk(tdmftakzl, f, null, 2)));
            case 5:
                dIocxURUo((vXUgPfyfe) obj);
                return qih4lW99W.q3BipwRCk;
            case 6:
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0 && intValue < ((cnnoFa4Tx) this.Bhmn1KIah).iiGwOFFnr().iiGwOFFnr()) {
                    z2 = true;
                }
                cnnoFa4Tx cnnofa4tx = (cnnoFa4Tx) this.Bhmn1KIah;
                if (z2) {
                    idpM54xlp.RG6kpfv3v((oQkvjGXIr) this.PSTqBLTET, null, 0, new amTAkxkeA(cnnofa4tx, intValue, null), 3, null);
                    return Boolean.TRUE;
                }
                throw new IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + cnnofa4tx.iiGwOFFnr().iiGwOFFnr() + ')').toString());
            case 7:
                return q3BipwRCk((ro5oMV4A2) obj);
            case 8:
                return q3BipwRCk((ro5oMV4A2) obj);
            case 9:
                kCA6Zs9sL((eTxfvEx3L) obj);
                return qih4lW99W.q3BipwRCk;
            case 10:
                kCA6Zs9sL((eTxfvEx3L) obj);
                return qih4lW99W.q3BipwRCk;
            case 11:
                KeyEvent keyEvent = ((PZAPy5kDf) obj).q3BipwRCk;
                if (((UwmKmkwV0) this.Bhmn1KIah).q3BipwRCk() != yyxUIEClD.None) {
                    if (keyEvent.getKeyCode() == 4) {
                        int Puu3Rhg4F = WAflFGuGp.Puu3Rhg4F(keyEvent);
                        ksLrMHgEz kslrmhgez3 = le9Z8LIS5.q3BipwRCk;
                        ksLrMHgEz kslrmhgez4 = le9Z8LIS5.q3BipwRCk;
                        if (le9Z8LIS5.q3BipwRCk(Puu3Rhg4F, 1)) {
                            z = true;
                            if (z) {
                                ((TB2AsrPRd) this.PSTqBLTET).kCA6Zs9sL(null);
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                return Boolean.valueOf(z2);
            case 12:
                ((PmanMZxiM) this.PSTqBLTET).IytU16YUK(((PlegqbMSA) this.Bhmn1KIah).q3BipwRCk((List) obj));
                return qih4lW99W.q3BipwRCk;
            case 13:
                cKAQplqZy ckaqplqzy = (cKAQplqZy) obj;
                long j = ckaqplqzy.tGV7Q6urW;
                zLqhNBfpE zlqhnbfpe = (zLqhNBfpE) this.PSTqBLTET;
                cTqd729wo ctqd729wo = (cTqd729wo) ((NIuwK2X7m) this.Bhmn1KIah);
                if (!((ctqd729wo.q3BipwRCk.kCA6Zs9sL.q3BipwRCk.CBQ5d1kRq.length() == 0) || (uwmKmkwV0 = (tB2AsrPRd = ctqd729wo.q3BipwRCk).dIocxURUo) == null || (zrlqfndb5 = uwmKmkwV0.iiGwOFFnr) == null)) {
                    TB2AsrPRd.q3BipwRCk(tB2AsrPRd, tB2AsrPRd.kCA6Zs9sL, tB2AsrPRd.CBQ5d1kRq.intValue(), zrlqfndb5.J4Ux7ym32(j, false), false, zlqhnbfpe);
                    z2 = true;
                }
                if (z2) {
                    ODug2UCW1.Bhmn1KIah(ckaqplqzy);
                    ODug2UCW1.PSTqBLTET(ckaqplqzy);
                }
                return qih4lW99W.q3BipwRCk;
            case 14:
                hrAjOnL52 hrajonl52 = (hrAjOnL52) obj;
                nPBzGBru7.iiGwOFFnr(hrajonl52, (String) this.Bhmn1KIah);
                nPBzGBru7.dIocxURUo(hrajonl52, null, new GunsxZ6tg((gdEmqfwpT) this.PSTqBLTET, 3), 1);
                return qih4lW99W.q3BipwRCk;
            case 15:
                IxbokG044 ixbokG044 = (IxbokG044) obj;
                ((uldsWYbnP) this.Bhmn1KIah).q3BipwRCk(((Number) ixbokG044.iiGwOFFnr()).floatValue() - ((sl5e2Y3xY) this.PSTqBLTET).CBQ5d1kRq);
                ((sl5e2Y3xY) this.PSTqBLTET).CBQ5d1kRq = ((Number) ixbokG044.iiGwOFFnr()).floatValue();
                return qih4lW99W.q3BipwRCk;
            case 16:
                Throwable th2 = (Throwable) obj;
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 17:
                iiGwOFFnr(obj);
                return qih4lW99W.q3BipwRCk;
            case 18:
                Throwable th3 = (Throwable) obj;
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 19:
                Throwable th4 = (Throwable) obj;
                rQamjxEL9 rqamjxel9 = (rQamjxEL9) this.Bhmn1KIah;
                Object obj2 = rqamjxel9.kCA6Zs9sL;
                Throwable th5 = (Throwable) this.PSTqBLTET;
                synchronized (obj2) {
                    if (th5 == null) {
                        th5 = null;
                    } else if (th4 != null) {
                        if (!(true ^ (th4 instanceof CancellationException))) {
                            th4 = null;
                        }
                        if (th4 != null) {
                            dnBSj5uJN.dIocxURUo(th5, th4);
                        }
                    }
                    rqamjxel9.GPLPRo6go = th5;
                    ((I5LF8ecws) rqamjxel9.kmSgne1rO).yWvV4ePLl(null, XUuUfkdDV.ShutDown);
                }
                return qih4lW99W.q3BipwRCk;
            case 20:
                iiGwOFFnr(obj);
                return qih4lW99W.q3BipwRCk;
            case 21:
                Mf8l3AEb0 mf8l3AEb0 = (Mf8l3AEb0) obj;
                if (!anXlDk6fV.tGV7Q6urW(((prCJwNx2x) ((RNEcgN6dQ) this.Bhmn1KIah)).getValue(), mf8l3AEb0)) {
                    ((prCJwNx2x) ((RNEcgN6dQ) this.Bhmn1KIah)).CBQ5d1kRq(mf8l3AEb0);
                    ((PmanMZxiM) this.PSTqBLTET).IytU16YUK(mf8l3AEb0);
                }
                return qih4lW99W.q3BipwRCk;
            case 22:
                dIocxURUo((vXUgPfyfe) obj);
                return qih4lW99W.q3BipwRCk;
            case 23:
                dIocxURUo((vXUgPfyfe) obj);
                return qih4lW99W.q3BipwRCk;
            case 27:
                return q3BipwRCk((ro5oMV4A2) obj);
            case 28:
                Throwable th6 = (Throwable) obj;
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
        }
    }

    public void J4Ux7ym32() {
        switch (this.kmSgne1rO) {
            case 16:
                vaiCLUymU vaicluymu = (vaiCLUymU) this.Bhmn1KIah;
                Object obj = vaicluymu.kmSgne1rO;
                IXMg0nBBI iXMg0nBBI = (IXMg0nBBI) this.PSTqBLTET;
                synchronized (obj) {
                    List list = vaicluymu.PSTqBLTET;
                    Object obj2 = iXMg0nBBI.CBQ5d1kRq;
                    list.remove(obj2 == null ? null : (G4Xj7GMiq) obj2);
                }
                return;
            case 18:
                gknx5HUb7 gknx5hub7 = (gknx5HUb7) this.Bhmn1KIah;
                Object obj3 = gknx5hub7.J4Ux7ym32;
                Z3EvbqMGQ z3EvbqMGQ = (Z3EvbqMGQ) this.PSTqBLTET;
                synchronized (obj3) {
                    ((List) gknx5hub7.tGV7Q6urW).remove(z3EvbqMGQ);
                }
                return;
            case 28:
                J7YsuEuPq j7YsuEuPq = (J7YsuEuPq) this.Bhmn1KIah;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.PSTqBLTET;
                synchronized (j7YsuEuPq.PSTqBLTET) {
                    j7YsuEuPq.ilHKhw3Yw.remove(frameCallback);
                }
                return;
            default:
                ((SbDM1N4Hj) this.Bhmn1KIah).CBQ5d1kRq.removeFrameCallback((Choreographer.FrameCallback) this.PSTqBLTET);
                return;
        }
    }

    public void dIocxURUo(vXUgPfyfe vxugpfyfe) {
        switch (this.kmSgne1rO) {
            case 5:
                List list = (List) this.Bhmn1KIah;
                ymulT8MsV ymult8msv = (ymulT8MsV) this.PSTqBLTET;
                int size = list.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        ymulT8MsV ymult8msv2 = (ymulT8MsV) list.get(i);
                        if (ymult8msv2 != ymult8msv) {
                            ymult8msv2.q3BipwRCk(vxugpfyfe);
                        }
                        if (i2 <= size) {
                            i = i2;
                        }
                    }
                }
                ymulT8MsV ymult8msv3 = (ymulT8MsV) this.PSTqBLTET;
                if (ymult8msv3 != null) {
                    ymult8msv3.q3BipwRCk(vxugpfyfe);
                    return;
                }
                return;
            case 22:
                vXUgPfyfe.yWvV4ePLl(vxugpfyfe, (n2gATecRC) this.Bhmn1KIah, 0, 0, 0.0f, ((ihwWLIzx8) this.PSTqBLTET).CBQ5d1kRq, 4, null);
                return;
            default:
                vXUgPfyfe.yWvV4ePLl(vxugpfyfe, (n2gATecRC) this.Bhmn1KIah, 0, 0, 0.0f, ((gqCoYRWVZ) this.PSTqBLTET).i8XZMQc6Z, 4, null);
                return;
        }
    }

    public void iiGwOFFnr(Object obj) {
        switch (this.kmSgne1rO) {
            case 17:
                if (obj == ((vhdnXl5MS) this.Bhmn1KIah)) {
                    throw new IllegalStateException("A derived state cannot calculation cannot read itself".toString());
                } else if (obj instanceof vlsBqYUof) {
                    ((HashSet) this.PSTqBLTET).add(obj);
                    return;
                } else {
                    return;
                }
            default:
                ((qg6veklqT) ((USS5dphka) this.Bhmn1KIah)).MzoOEjc4X(obj);
                OavOIaZo5 oavOIaZo5 = (OavOIaZo5) this.PSTqBLTET;
                if (oavOIaZo5 != null) {
                    oavOIaZo5.add(obj);
                    return;
                }
                return;
        }
    }

    public void kCA6Zs9sL(eTxfvEx3L etxfvex3l) {
        switch (this.kmSgne1rO) {
            case 9:
                if (!anXlDk6fV.tGV7Q6urW((eTxfvEx3L) this.Bhmn1KIah, etxfvex3l)) {
                    ((PmanMZxiM) this.PSTqBLTET).IytU16YUK(etxfvex3l);
                    return;
                }
                return;
            default:
                if (!anXlDk6fV.tGV7Q6urW(etxfvex3l.q3BipwRCk.CBQ5d1kRq, ((UwmKmkwV0) this.Bhmn1KIah).q3BipwRCk.q3BipwRCk.CBQ5d1kRq)) {
                    ((prCJwNx2x) ((UwmKmkwV0) this.Bhmn1KIah).GPLPRo6go).CBQ5d1kRq(yyxUIEClD.None);
                }
                ((UwmKmkwV0) this.Bhmn1KIah).kmSgne1rO.IytU16YUK(etxfvex3l);
                ((rESgwfV20) ((Ltw4aaKkh) this.PSTqBLTET)).J4Ux7ym32();
                return;
        }
    }

    public y0FAKpZVf q3BipwRCk(ro5oMV4A2 ro5omv4a2) {
        switch (this.kmSgne1rO) {
            case 7:
                ((VyqlGpAAE) ((nHAI4XIti) this.Bhmn1KIah)).q3BipwRCk.J4Ux7ym32((dyRLRaL1h) this.PSTqBLTET);
                return new BYpsPbsk9((nHAI4XIti) this.Bhmn1KIah, (dyRLRaL1h) this.PSTqBLTET);
            case 8:
                G9VdDqs1M g9VdDqs1M = (G9VdDqs1M) this.Bhmn1KIah;
                g9VdDqs1M.q3BipwRCk = (View) this.PSTqBLTET;
                return new tkSFcSA5y(g9VdDqs1M);
            default:
                ((Context) this.Bhmn1KIah).getApplicationContext().registerComponentCallbacks((YwogV6ONJ) this.PSTqBLTET);
                return new BYpsPbsk9((Context) this.Bhmn1KIah, (YwogV6ONJ) this.PSTqBLTET);
        }
    }

    public void tGV7Q6urW(HXRw132ar hXRw132ar) {
        switch (this.kmSgne1rO) {
            case 1:
                hXRw132ar.J4Ux7ym32();
                K6PL0z3I0.q3BipwRCk(this.Bhmn1KIah);
                Objects.requireNonNull(null);
                throw null;
            default:
                hXRw132ar.J4Ux7ym32();
                YFPaMFEQT.kCA6Zs9sL(hXRw132ar, (A128gLXzp) this.Bhmn1KIah, (bZmnXN812) this.PSTqBLTET, 0.0f, null, null, 0, 60, null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(J7YsuEuPq j7YsuEuPq, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.Bhmn1KIah = j7YsuEuPq;
        this.PSTqBLTET = frameCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(SbDM1N4Hj sbDM1N4Hj, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.Bhmn1KIah = sbDM1N4Hj;
        this.PSTqBLTET = frameCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(G9VdDqs1M g9VdDqs1M, View view) {
        super(1);
        this.Bhmn1KIah = g9VdDqs1M;
        this.PSTqBLTET = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(PlegqbMSA plegqbMSA, PmanMZxiM pmanMZxiM) {
        super(1);
        this.Bhmn1KIah = plegqbMSA;
        this.PSTqBLTET = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(nHAI4XIti nhai4xiti, dyRLRaL1h dyrlral1h) {
        super(1);
        this.Bhmn1KIah = nhai4xiti;
        this.PSTqBLTET = dyrlral1h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(vaiCLUymU vaicluymu, IXMg0nBBI iXMg0nBBI) {
        super(1);
        this.Bhmn1KIah = vaicluymu;
        this.PSTqBLTET = iXMg0nBBI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(USS5dphka uSS5dphka, OavOIaZo5 oavOIaZo5) {
        super(1);
        this.Bhmn1KIah = uSS5dphka;
        this.PSTqBLTET = oavOIaZo5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(uldsWYbnP uldswybnp, sl5e2Y3xY sl5e2y3xy) {
        super(1);
        this.Bhmn1KIah = uldswybnp;
        this.PSTqBLTET = sl5e2y3xy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(vhdnXl5MS vhdnxl5ms, HashSet hashSet) {
        super(1);
        this.Bhmn1KIah = vhdnxl5ms;
        this.PSTqBLTET = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(gknx5HUb7 gknx5hub7, Z3EvbqMGQ z3EvbqMGQ) {
        super(1);
        this.Bhmn1KIah = gknx5hub7;
        this.PSTqBLTET = z3EvbqMGQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(cnnoFa4Tx cnnofa4tx, oQkvjGXIr oqkvjgxir) {
        super(1);
        this.Bhmn1KIah = cnnofa4tx;
        this.PSTqBLTET = oqkvjgxir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(A128gLXzp a128gLXzp, bZmnXN812 bzmnxn812) {
        super(1);
        this.Bhmn1KIah = a128gLXzp;
        this.PSTqBLTET = bzmnxn812;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(n2gATecRC n2gatecrc, ihwWLIzx8 ihwwlizx8) {
        super(1);
        this.Bhmn1KIah = n2gatecrc;
        this.PSTqBLTET = ihwwlizx8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(n2gATecRC n2gatecrc, gqCoYRWVZ gqcoyrwvz) {
        super(1);
        this.Bhmn1KIah = n2gatecrc;
        this.PSTqBLTET = gqcoyrwvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(rQamjxEL9 rqamjxel9, Throwable th) {
        super(1);
        this.Bhmn1KIah = rqamjxel9;
        this.PSTqBLTET = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(b0pCjrhT1 b0pcjrht1, tDmftakZl tdmftakzl) {
        super(1);
        this.Bhmn1KIah = b0pcjrht1;
        this.PSTqBLTET = tdmftakzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(RNEcgN6dQ rNEcgN6dQ, PmanMZxiM pmanMZxiM) {
        super(1);
        this.Bhmn1KIah = rNEcgN6dQ;
        this.PSTqBLTET = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(UwmKmkwV0 uwmKmkwV0, Ltw4aaKkh ltw4aaKkh) {
        super(1);
        this.Bhmn1KIah = uwmKmkwV0;
        this.PSTqBLTET = ltw4aaKkh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(UwmKmkwV0 uwmKmkwV0, TB2AsrPRd tB2AsrPRd) {
        super(1);
        this.Bhmn1KIah = uwmKmkwV0;
        this.PSTqBLTET = tB2AsrPRd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(eTxfvEx3L etxfvex3l, PmanMZxiM pmanMZxiM) {
        super(1);
        this.Bhmn1KIah = etxfvex3l;
        this.PSTqBLTET = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(String str, gdEmqfwpT gdemqfwpt) {
        super(1);
        this.Bhmn1KIah = str;
        this.PSTqBLTET = gdemqfwpt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dMQC97DHs(List list, ymulT8MsV ymult8msv) {
        super(1);
        this.Bhmn1KIah = list;
        this.PSTqBLTET = ymult8msv;
    }
}
