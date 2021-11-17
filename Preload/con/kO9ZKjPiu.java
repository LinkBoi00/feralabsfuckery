package con;

import android.view.Choreographer;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class kO9ZKjPiu extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO = 19;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.Bhmn1KIah = frameCallback;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        float f = 0.0f;
        boolean z = false;
        boolean z2 = true;
        switch (this.kmSgne1rO) {
            case 0:
                lbpNajNmL lbpnajnml = (lbpNajNmL) obj;
                double d = (double) 3.0f;
                float pow = (float) Math.pow((double) lbpnajnml.J4Ux7ym32, d);
                float pow2 = (float) Math.pow((double) lbpnajnml.tGV7Q6urW, d);
                float pow3 = (float) Math.pow((double) lbpnajnml.dIocxURUo, d);
                float[] fArr = q0Rdtw9ds.q3BipwRCk;
                float[] fArr2 = q0Rdtw9ds.J4Ux7ym32;
                float q3BipwRCk = q0Rdtw9ds.q3BipwRCk(0, pow, pow2, pow3, fArr2);
                float q3BipwRCk2 = q0Rdtw9ds.q3BipwRCk(1, pow, pow2, pow3, fArr2);
                float q3BipwRCk3 = q0Rdtw9ds.q3BipwRCk(2, pow, pow2, pow3, fArr2);
                float dIocxURUo = cT9gik1zL.dIocxURUo(lbpnajnml.q3BipwRCk, 0.0f, 1.0f);
                float dIocxURUo2 = cT9gik1zL.dIocxURUo(q3BipwRCk, -2.0f, 2.0f);
                float dIocxURUo3 = cT9gik1zL.dIocxURUo(q3BipwRCk2, -2.0f, 2.0f);
                float dIocxURUo4 = cT9gik1zL.dIocxURUo(q3BipwRCk3, -2.0f, 2.0f);
                FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
                return new bO2dbmrf7(bO2dbmrf7.q3BipwRCk(xpuSUT7Gh.J4Ux7ym32(dIocxURUo2, dIocxURUo3, dIocxURUo4, dIocxURUo, FVP3dB50k.qVUwofr5s), (J8UIfudgU) this.Bhmn1KIah));
            case 1:
                return Boolean.valueOf(!anXlDk6fV.tGV7Q6urW(((XeOmD5li4) obj).q3BipwRCk, ((hObCm0yul) this.Bhmn1KIah).q3BipwRCk()));
            case 2:
                return J4Ux7ym32((Vtytzr3yG) obj);
            case 3:
                return J4Ux7ym32((Vtytzr3yG) obj);
            case 4:
                ((e58gNYlqI) obj).q3BipwRCk = !J008eMQIc.q3BipwRCk(((J008eMQIc) ((prCJwNx2x) ((sQduB7jbp) ((s2CbOR66h) this.Bhmn1KIah)).q3BipwRCk).getValue()).q3BipwRCk, 1);
                return qih4lW99W.q3BipwRCk;
            case 5:
                return tGV7Q6urW(((Number) obj).floatValue());
            case 6:
                HXRw132ar hXRw132ar = (HXRw132ar) obj;
                hXRw132ar.J4Ux7ym32();
                ((ypLiboX2O) this.Bhmn1KIah).Puu3Rhg4F(hXRw132ar);
                return qih4lW99W.q3BipwRCk;
            case 7:
            case 8:
            case 10:
            case 12:
            case 15:
            case 25:
            default:
                iiGwOFFnr((Throwable) obj);
                return qih4lW99W.q3BipwRCk;
            case 9:
                return tGV7Q6urW(((Number) obj).floatValue());
            case 11:
                ((dyRLRaL1h) this.Bhmn1KIah).tGV7Q6urW = (mnTaxtMa7) obj;
                return qih4lW99W.q3BipwRCk;
            case 13:
                return q3BipwRCk((ro5oMV4A2) obj);
            case 14:
                return tGV7Q6urW(((Number) obj).floatValue());
            case 16:
                AU29aHa4X aU29aHa4X = (AU29aHa4X) obj;
                return new ZtJSMDYDl(dnBSj5uJN.tGV7Q6urW(D3DEikrvb.Eeka1udhb(((Number) ((prCJwNx2x) ((kycC9mx23) this.Bhmn1KIah).q3BipwRCk.kCA6Zs9sL).getValue()).floatValue()), 0));
            case 17:
                Objects.requireNonNull((bRgfgYIQX) obj);
                ((gdEmqfwpT) this.Bhmn1KIah).GPLPRo6go();
                return qih4lW99W.q3BipwRCk;
            case 18:
                float floatValue = ((Number) ((prCJwNx2x) ((T3vFETFEI) this.Bhmn1KIah).GPLPRo6go).getValue()).floatValue() + ((Number) obj).floatValue();
                T3vFETFEI t3vFETFEI = (T3vFETFEI) this.Bhmn1KIah;
                float dIocxURUo5 = cT9gik1zL.dIocxURUo(floatValue, t3vFETFEI.vPSbyrYWX, t3vFETFEI.CBQ5d1kRq);
                float f2 = floatValue - dIocxURUo5;
                fJQzHH3Lh fjqzhh3lh = (fJQzHH3Lh) ((prCJwNx2x) ((T3vFETFEI) this.Bhmn1KIah).PSTqBLTET).getValue();
                if (fjqzhh3lh != null) {
                    float f3 = f2 < 0.0f ? fjqzhh3lh.J4Ux7ym32 : fjqzhh3lh.tGV7Q6urW;
                    if (f3 == 0.0f) {
                        z = true;
                    }
                    if (!z) {
                        f = (fjqzhh3lh.q3BipwRCk / f3) * ((float) Math.sin((double) ((cT9gik1zL.dIocxURUo(f2 / fjqzhh3lh.q3BipwRCk, -1.0f, 1.0f) * 3.1415927f) / ((float) 2))));
                    }
                }
                ((prCJwNx2x) ((T3vFETFEI) this.Bhmn1KIah).kCA6Zs9sL).CBQ5d1kRq(Float.valueOf(dIocxURUo5 + f));
                ((prCJwNx2x) ((T3vFETFEI) this.Bhmn1KIah).iiGwOFFnr).CBQ5d1kRq(Float.valueOf(f2));
                ((prCJwNx2x) ((T3vFETFEI) this.Bhmn1KIah).GPLPRo6go).CBQ5d1kRq(Float.valueOf(floatValue));
                return qih4lW99W.q3BipwRCk;
            case 19:
                Throwable th = (Throwable) obj;
                Z9HEsXWRa.kmSgne1rO.removeFrameCallback((Choreographer.FrameCallback) this.Bhmn1KIah);
                return qih4lW99W.q3BipwRCk;
            case 20:
                iiGwOFFnr((Throwable) obj);
                return qih4lW99W.q3BipwRCk;
            case 21:
                kCA6Zs9sL(obj);
                return qih4lW99W.q3BipwRCk;
            case 22:
                kCA6Zs9sL(obj);
                return qih4lW99W.q3BipwRCk;
            case 23:
                dVtF46MWK dvtf46mwk = ((dFPeeJFLA) this.Bhmn1KIah).tGV7Q6urW;
                if (dvtf46mwk != null) {
                    z2 = dvtf46mwk.q3BipwRCk(obj);
                }
                return Boolean.valueOf(z2);
            case 24:
                kCA6Zs9sL(obj);
                return qih4lW99W.q3BipwRCk;
            case 26:
                dIocxURUo((wvIIkk6mx) obj);
                return qih4lW99W.q3BipwRCk;
            case 27:
                return q3BipwRCk((ro5oMV4A2) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r5 == null) goto L_0x003c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r3 = r5.tGV7Q6urW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public B82vleiqp J4Ux7ym32(Vtytzr3yG vtytzr3yG) {
        BaMMm5shD baMMm5shD;
        lTg88Bp1o ltg88bp1o;
        AwUV2q7WY awUV2q7WY = AwUV2q7WY.PostExit;
        AwUV2q7WY awUV2q7WY2 = AwUV2q7WY.Visible;
        AwUV2q7WY awUV2q7WY3 = AwUV2q7WY.PreEnter;
        switch (this.kmSgne1rO) {
            case 2:
                B82vleiqp b82vleiqp = null;
                if (vtytzr3yG.q3BipwRCk(awUV2q7WY3, awUV2q7WY2)) {
                    ltg88bp1o = (lTg88Bp1o) ((xfhRvlNGe) this.Bhmn1KIah).Bhmn1KIah.getValue();
                    break;
                } else {
                    if (vtytzr3yG.q3BipwRCk(awUV2q7WY2, awUV2q7WY)) {
                        ltg88bp1o = (lTg88Bp1o) ((xfhRvlNGe) this.Bhmn1KIah).PSTqBLTET.getValue();
                        break;
                    } else {
                        b82vleiqp = KSdwgSYB6.kCA6Zs9sL;
                    }
                    return b82vleiqp == null ? KSdwgSYB6.kCA6Zs9sL : b82vleiqp;
                }
            default:
                if (!vtytzr3yG.q3BipwRCk(awUV2q7WY3, awUV2q7WY2) ? !vtytzr3yG.q3BipwRCk(awUV2q7WY2, awUV2q7WY) || (baMMm5shD = (BaMMm5shD) ((nSRxIV6Cx) this.Bhmn1KIah).Bhmn1KIah.getValue()) == null : (baMMm5shD = (BaMMm5shD) ((nSRxIV6Cx) this.Bhmn1KIah).kmSgne1rO.getValue()) == null) {
                    return KSdwgSYB6.dIocxURUo;
                }
                return baMMm5shD.J4Ux7ym32;
        }
    }

    public void dIocxURUo(wvIIkk6mx wviikk6mx) {
        ((xAnqkutd5) this.Bhmn1KIah).J4Ux7ym32.q3BipwRCk(wviikk6mx);
    }

    public void iiGwOFFnr(Throwable th) {
        switch (this.kmSgne1rO) {
            case 20:
                CancellationException q3BipwRCk = anXlDk6fV.q3BipwRCk("Recomposer effect job completed", th);
                rQamjxEL9 rqamjxel9 = (rQamjxEL9) this.Bhmn1KIah;
                synchronized (rqamjxel9.kCA6Zs9sL) {
                    JEWwjBE8f jEWwjBE8f = rqamjxel9.iiGwOFFnr;
                    if (jEWwjBE8f != null) {
                        ((I5LF8ecws) rqamjxel9.kmSgne1rO).yWvV4ePLl(null, XUuUfkdDV.ShuttingDown);
                        ((Zgh96z4e6) jEWwjBE8f).oon79WMrY(q3BipwRCk);
                        rqamjxel9.CBQ5d1kRq = null;
                        ((Zgh96z4e6) jEWwjBE8f).IytU16YUK(false, true, new dMQC97DHs(rqamjxel9, th));
                    } else {
                        rqamjxel9.GPLPRo6go = q3BipwRCk;
                        ((I5LF8ecws) rqamjxel9.kmSgne1rO).yWvV4ePLl(null, XUuUfkdDV.ShutDown);
                    }
                }
                return;
            default:
                k0ugT26MT k0ugt26mt = (k0ugT26MT) this.Bhmn1KIah;
                Z3EvbqMGQ z3EvbqMGQ = k0ugt26mt.Bhmn1KIah;
                if (z3EvbqMGQ != null) {
                    ((tmgChDFqU) z3EvbqMGQ).CBQ5d1kRq(th);
                }
                k0ugt26mt.Bhmn1KIah = null;
                return;
        }
    }

    public void kCA6Zs9sL(Object obj) {
        switch (this.kmSgne1rO) {
            case 21:
                ((qg6veklqT) ((USS5dphka) this.Bhmn1KIah)).PSTqBLTET(obj);
                return;
            case 22:
                ((Set) this.Bhmn1KIah).add(obj);
                return;
            default:
                ZcF0ya1BQ zcF0ya1BQ = (ZcF0ya1BQ) this.Bhmn1KIah;
                if (!zcF0ya1BQ.GPLPRo6go) {
                    synchronized (zcF0ya1BQ.dIocxURUo) {
                        jn7EwGOqN jn7ewgoqn = zcF0ya1BQ.Puu3Rhg4F;
                        jn7ewgoqn.J4Ux7ym32.q3BipwRCk(obj, jn7ewgoqn.dIocxURUo);
                    }
                    return;
                }
                return;
        }
    }

    public y0FAKpZVf q3BipwRCk(ro5oMV4A2 ro5omv4a2) {
        switch (this.kmSgne1rO) {
            case 13:
                return new tkSFcSA5y((TB2AsrPRd) this.Bhmn1KIah);
            default:
                return new tkSFcSA5y((v0l3RHDWl) this.Bhmn1KIah);
        }
    }

    public Float tGV7Q6urW(float f) {
        int i;
        z11H8SJL7 z11h8sjl7;
        mKU9R6cnm mku9r6cnm;
        pLYbCSTk0 plybcstk0;
        float f2 = f;
        float f3 = 0.0f;
        boolean z = false;
        switch (this.kmSgne1rO) {
            case 5:
                yGEA2YLT7 ygea2ylt7 = (yGEA2YLT7) this.Bhmn1KIah;
                float dIocxURUo = ((float) ((yGEA2YLT7) this.Bhmn1KIah).dIocxURUo()) + f2 + ygea2ylt7.dIocxURUo;
                float dIocxURUo2 = cT9gik1zL.dIocxURUo(dIocxURUo, 0.0f, (float) ((Number) ((prCJwNx2x) ygea2ylt7.tGV7Q6urW).getValue()).intValue());
                if (dIocxURUo == dIocxURUo2) {
                    z = true;
                }
                boolean z2 = !z;
                float dIocxURUo3 = dIocxURUo2 - ((float) ((yGEA2YLT7) this.Bhmn1KIah).dIocxURUo());
                int Eeka1udhb = D3DEikrvb.Eeka1udhb(dIocxURUo3);
                yGEA2YLT7 ygea2ylt72 = (yGEA2YLT7) this.Bhmn1KIah;
                ((prCJwNx2x) ygea2ylt72.q3BipwRCk).CBQ5d1kRq(Integer.valueOf(ygea2ylt72.dIocxURUo() + Eeka1udhb));
                ((yGEA2YLT7) this.Bhmn1KIah).dIocxURUo = dIocxURUo3 - ((float) Eeka1udhb);
                if (z2) {
                    f2 = dIocxURUo3;
                }
                return Float.valueOf(f2);
            case 9:
                cnnoFa4Tx cnnofa4tx = (cnnoFa4Tx) this.Bhmn1KIah;
                float f4 = -f2;
                if ((f4 >= 0.0f || cnnofa4tx.CBQ5d1kRq) && (f4 <= 0.0f || cnnofa4tx.vPSbyrYWX)) {
                    if (Math.abs(cnnofa4tx.dIocxURUo) <= 0.5f) {
                        float f5 = cnnofa4tx.dIocxURUo + f4;
                        cnnofa4tx.dIocxURUo = f5;
                        if (Math.abs(f5) > 0.5f) {
                            float f6 = cnnofa4tx.dIocxURUo;
                            bb216AtXv bb216atxv = cnnofa4tx.oon79WMrY;
                            if (bb216atxv != null) {
                                bb216atxv.q3BipwRCk();
                            }
                            boolean z3 = cnnofa4tx.GPLPRo6go;
                            if (z3 && cnnofa4tx.kmSgne1rO != null) {
                                float f7 = f6 - cnnofa4tx.dIocxURUo;
                                if (z3) {
                                    YJRJURHq0 iiGwOFFnr = cnnofa4tx.iiGwOFFnr();
                                    if (!iiGwOFFnr.kCA6Zs9sL().isEmpty()) {
                                        boolean z4 = f7 < 0.0f;
                                        List kCA6Zs9sL = iiGwOFFnr.kCA6Zs9sL();
                                        if (z4) {
                                            i = ((ymulT8MsV) wkFJfVmcv.TyB1UUd72(kCA6Zs9sL)).J4Ux7ym32 + 1;
                                        } else {
                                            i = ((ymulT8MsV) wkFJfVmcv.o4LF8RkoQ(kCA6Zs9sL)).J4Ux7ym32 - 1;
                                        }
                                        if (i != cnnofa4tx.Puu3Rhg4F) {
                                            if (i >= 0 && i < iiGwOFFnr.iiGwOFFnr()) {
                                                if (!(cnnofa4tx.yWvV4ePLl == z4 || (mku9r6cnm = cnnofa4tx.kmSgne1rO) == null)) {
                                                    int i2 = cnnofa4tx.Puu3Rhg4F;
                                                    z11H8SJL7 z11h8sjl72 = mku9r6cnm.q3BipwRCk;
                                                    if (z11h8sjl72 != null) {
                                                        WTGSMK63e wTGSMK63e = (WTGSMK63e) z11h8sjl72;
                                                        if (i2 == wTGSMK63e.ilHKhw3Yw) {
                                                            QMQpxZCHl qMQpxZCHl = wTGSMK63e.qVUwofr5s;
                                                            if (!(qMQpxZCHl == null || (plybcstk0 = (pLYbCSTk0) qMQpxZCHl.q3BipwRCk.oon79WMrY.remove(qMQpxZCHl.J4Ux7ym32)) == null)) {
                                                                int indexOf = qMQpxZCHl.q3BipwRCk.J4Ux7ym32().yWvV4ePLl().indexOf(plybcstk0);
                                                                if (indexOf != -1) {
                                                                    pW31wYUjR pw31wyujr = qMQpxZCHl.q3BipwRCk;
                                                                    if (pw31wyujr.vPSbyrYWX < pw31wyujr.q3BipwRCk) {
                                                                        int size = pw31wyujr.J4Ux7ym32().yWvV4ePLl().size();
                                                                        pW31wYUjR pw31wyujr2 = qMQpxZCHl.q3BipwRCk;
                                                                        pw31wyujr2.dIocxURUo(indexOf, (size - pw31wyujr2.CBQ5d1kRq) - pw31wyujr2.vPSbyrYWX, 1);
                                                                        qMQpxZCHl.q3BipwRCk.vPSbyrYWX++;
                                                                    } else {
                                                                        pLYbCSTk0 J4Ux7ym32 = pw31wyujr.J4Ux7ym32();
                                                                        J4Ux7ym32.ixWaw2akD = true;
                                                                        e3ALPxmyo e3alpxmyo = (e3ALPxmyo) pw31wyujr.GPLPRo6go.remove(plybcstk0);
                                                                        e3alpxmyo.tGV7Q6urW.q3BipwRCk();
                                                                        pw31wyujr.Puu3Rhg4F.remove(e3alpxmyo.q3BipwRCk);
                                                                        pw31wyujr.J4Ux7ym32().IytU16YUK(indexOf, 1);
                                                                        J4Ux7ym32.ixWaw2akD = false;
                                                                    }
                                                                    pW31wYUjR pw31wyujr3 = qMQpxZCHl.q3BipwRCk;
                                                                    int i3 = pw31wyujr3.CBQ5d1kRq;
                                                                    if (i3 > 0) {
                                                                        pw31wyujr3.CBQ5d1kRq = i3 - 1;
                                                                    } else {
                                                                        throw new IllegalStateException("Check failed.".toString());
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Check failed.".toString());
                                                                }
                                                            }
                                                            wTGSMK63e.ilHKhw3Yw = -1;
                                                        }
                                                    }
                                                }
                                                cnnofa4tx.yWvV4ePLl = z4;
                                                cnnofa4tx.Puu3Rhg4F = i;
                                                mKU9R6cnm mku9r6cnm2 = cnnofa4tx.kmSgne1rO;
                                                if (!(mku9r6cnm2 == null || (z11h8sjl7 = mku9r6cnm2.q3BipwRCk) == null)) {
                                                    WTGSMK63e wTGSMK63e2 = (WTGSMK63e) z11h8sjl7;
                                                    wTGSMK63e2.ilHKhw3Yw = i;
                                                    wTGSMK63e2.qVUwofr5s = null;
                                                    wTGSMK63e2.RG6kpfv3v = false;
                                                    if (!wTGSMK63e2.ixWaw2akD) {
                                                        wTGSMK63e2.ixWaw2akD = true;
                                                        wTGSMK63e2.MzoOEjc4X.post(wTGSMK63e2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (Math.abs(cnnofa4tx.dIocxURUo) > 0.5f) {
                            f4 -= cnnofa4tx.dIocxURUo;
                            cnnofa4tx.dIocxURUo = 0.0f;
                        }
                        f3 = f4;
                    } else {
                        throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("entered drag with non-zero pending scroll: ", Float.valueOf(cnnofa4tx.dIocxURUo)).toString());
                    }
                }
                return Float.valueOf(-f3);
            default:
                float J4Ux7ym322 = ((K0KMmkEKu) this.Bhmn1KIah).J4Ux7ym32() + f2;
                if (J4Ux7ym322 > ((K0KMmkEKu) this.Bhmn1KIah).q3BipwRCk()) {
                    f2 = ((K0KMmkEKu) this.Bhmn1KIah).q3BipwRCk() - ((K0KMmkEKu) this.Bhmn1KIah).J4Ux7ym32();
                } else if (J4Ux7ym322 < 0.0f) {
                    f2 = -((K0KMmkEKu) this.Bhmn1KIah).J4Ux7ym32();
                }
                K0KMmkEKu k0KMmkEKu = (K0KMmkEKu) this.Bhmn1KIah;
                k0KMmkEKu.dIocxURUo(k0KMmkEKu.J4Ux7ym32() + f2);
                return Float.valueOf(f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(dyRLRaL1h dyrlral1h) {
        super(1);
        this.Bhmn1KIah = dyrlral1h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(J8UIfudgU j8UIfudgU) {
        super(1);
        this.Bhmn1KIah = j8UIfudgU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(v0l3RHDWl v0l3rhdwl) {
        super(1);
        this.Bhmn1KIah = v0l3rhdwl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(USS5dphka uSS5dphka) {
        super(1);
        this.Bhmn1KIah = uSS5dphka;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(kycC9mx23 kycc9mx23) {
        super(1);
        this.Bhmn1KIah = kycc9mx23;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(xfhRvlNGe xfhrvlnge) {
        super(1);
        this.Bhmn1KIah = xfhrvlnge;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(gdEmqfwpT gdemqfwpt) {
        super(1);
        this.Bhmn1KIah = gdemqfwpt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(s2CbOR66h s2cbor66h) {
        super(1);
        this.Bhmn1KIah = s2cbor66h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(cnnoFa4Tx cnnofa4tx) {
        super(1);
        this.Bhmn1KIah = cnnofa4tx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(hObCm0yul hobcm0yul) {
        super(1);
        this.Bhmn1KIah = hobcm0yul;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(ypLiboX2O yplibox2o) {
        super(1);
        this.Bhmn1KIah = yplibox2o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(rQamjxEL9 rqamjxel9) {
        super(1);
        this.Bhmn1KIah = rqamjxel9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(dFPeeJFLA dfpeejfla) {
        super(1);
        this.Bhmn1KIah = dfpeejfla;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(yGEA2YLT7 ygea2ylt7) {
        super(1);
        this.Bhmn1KIah = ygea2ylt7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(nSRxIV6Cx nsrxiv6cx) {
        super(1);
        this.Bhmn1KIah = nsrxiv6cx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(ZcF0ya1BQ zcF0ya1BQ) {
        super(1);
        this.Bhmn1KIah = zcF0ya1BQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(k0ugT26MT k0ugt26mt) {
        super(1);
        this.Bhmn1KIah = k0ugt26mt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(T3vFETFEI t3vFETFEI) {
        super(1);
        this.Bhmn1KIah = t3vFETFEI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(K0KMmkEKu k0KMmkEKu) {
        super(1);
        this.Bhmn1KIah = k0KMmkEKu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(TB2AsrPRd tB2AsrPRd) {
        super(1);
        this.Bhmn1KIah = tB2AsrPRd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(xAnqkutd5 xanqkutd5) {
        super(1);
        this.Bhmn1KIah = xanqkutd5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO9ZKjPiu(Set set) {
        super(1);
        this.Bhmn1KIah = set;
    }
}
