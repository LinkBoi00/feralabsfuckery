package con;

import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityEvent;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class kuvj6DyFF extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(wnbPPCp4x wnbppcp4x, mYYIIpcht myyiipcht) {
        super(0);
        this.Bhmn1KIah = wnbppcp4x;
        this.PSTqBLTET = myyiipcht;
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        switch (this.kmSgne1rO) {
            case 0:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 1:
                return q3BipwRCk();
            case 2:
                if (((Boolean) ((kycC9mx23) this.Bhmn1KIah).q3BipwRCk.J4Ux7ym32.IytU16YUK(zR1zXe0yP.Closed)).booleanValue()) {
                    idpM54xlp.RG6kpfv3v((oQkvjGXIr) this.PSTqBLTET, null, 0, new oFbSzffVE((kycC9mx23) this.Bhmn1KIah, null), 3, null);
                }
                return Boolean.TRUE;
            case 3:
                return new kycC9mx23((zR1zXe0yP) this.Bhmn1KIah, (PmanMZxiM) this.PSTqBLTET);
            case 4:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 5:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 6:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 7:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 8:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 9:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 10:
                return q3BipwRCk();
            case 11:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 12:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            default:
                return anXlDk6fV.kCA6Zs9sL((String) this.Bhmn1KIah, OQ3onEt6c.q3BipwRCk, new W39e6bnPN[0], new nVhenZUxZ((kr2hYxX5l) this.PSTqBLTET));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r1 == false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32() {
        boolean z = true;
        switch (this.kmSgne1rO) {
            case 0:
                ((spFv56w6q) ((DpXbxvzXm) this.Bhmn1KIah)).Puu3Rhg4F(this.PSTqBLTET);
                return;
            case 1:
            case 2:
            case 3:
            case 10:
            default:
                prCJwNx2x prcjwnx2x = (prCJwNx2x) ((RNEcgN6dQ) this.Bhmn1KIah);
                prcjwnx2x.CBQ5d1kRq(Boolean.valueOf(!((Boolean) prcjwnx2x.getValue()).booleanValue()));
                ((nPZZG1232) this.PSTqBLTET).PSTqBLTET = true;
                return;
            case 4:
                if (!anXlDk6fV.tGV7Q6urW((AWlaaRmBK) this.Bhmn1KIah, ((pHrf9LisQ) this.PSTqBLTET).q3BipwRCk)) {
                    lXExmygLE.NyWTwPF6V(((pHrf9LisQ) this.PSTqBLTET).J4Ux7ym32, new NPG5HODp7((AWlaaRmBK) this.Bhmn1KIah, 1));
                    Ltw4aaKkh ltw4aaKkh = ((pHrf9LisQ) this.PSTqBLTET).tGV7Q6urW;
                    if (ltw4aaKkh != null) {
                        ((rESgwfV20) ltw4aaKkh).J4Ux7ym32();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (((kkcQgCx5G) this.Bhmn1KIah) != null) {
                    Object obj = G7WvUK4mQ.q3BipwRCk;
                    ((wpXpbWG1J) this.PSTqBLTET).EBQXiIPmm(200, G7WvUK4mQ.q3BipwRCk, false, null);
                    ((kkcQgCx5G) this.Bhmn1KIah).WaUP0CF08((wpXpbWG1J) this.PSTqBLTET, 1);
                    ((wpXpbWG1J) this.PSTqBLTET).ilHKhw3Yw(false);
                    return;
                }
                wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) this.PSTqBLTET;
                if (wpxpbwg1j.qVUwofr5s.isEmpty()) {
                    wpxpbwg1j.CBQ5d1kRq = wpxpbwg1j.CpG0imbht.qVUwofr5s() + wpxpbwg1j.CBQ5d1kRq;
                    return;
                }
                TQJXgv7HU tQJXgv7HU = wpxpbwg1j.CpG0imbht;
                int iiGwOFFnr = tQJXgv7HU.iiGwOFFnr();
                int i = tQJXgv7HU.iiGwOFFnr;
                Object PSTqBLTET = i < tQJXgv7HU.GPLPRo6go ? tQJXgv7HU.PSTqBLTET(tQJXgv7HU.J4Ux7ym32, i) : null;
                Object kCA6Zs9sL = tQJXgv7HU.kCA6Zs9sL();
                wpxpbwg1j.n4UIOvAko(iiGwOFFnr, PSTqBLTET, kCA6Zs9sL);
                wpxpbwg1j.L4EwGfXiQ(xpuSUT7Gh.PSTqBLTET(tQJXgv7HU.J4Ux7ym32, tQJXgv7HU.iiGwOFFnr), null);
                wpxpbwg1j.qFBXIgpia();
                tQJXgv7HU.dIocxURUo();
                wpxpbwg1j.BL4OzhZBd(iiGwOFFnr, PSTqBLTET, kCA6Zs9sL);
                return;
            case 6:
                OavOIaZo5 oavOIaZo5 = (OavOIaZo5) this.Bhmn1KIah;
                USS5dphka uSS5dphka = (USS5dphka) this.PSTqBLTET;
                Objects.requireNonNull(oavOIaZo5);
                lP4K00fUB lp4k00fub = new lP4K00fUB(oavOIaZo5);
                while (lp4k00fub.hasNext()) {
                    ((qg6veklqT) uSS5dphka).MzoOEjc4X(lp4k00fub.next());
                }
                return;
            case 7:
                ((qhaZGYFO8) this.Bhmn1KIah).aS2AFthYA((SI0VpKubr) this.PSTqBLTET);
                return;
            case 8:
                u1Gs6N2OQ u1gs6n2oq = (u1Gs6N2OQ) this.Bhmn1KIah;
                niYpoU8Cm niypou8cm = u1gs6n2oq.MzoOEjc4X;
                niYpoU8Cm niypou8cm2 = u1gs6n2oq.ilHKhw3Yw;
                Float f = u1gs6n2oq.Bhmn1KIah;
                Float f2 = u1gs6n2oq.PSTqBLTET;
                float floatValue = (niypou8cm == null || f == null) ? 0.0f : ((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue() - f.floatValue();
                float floatValue2 = (niypou8cm2 == null || f2 == null) ? 0.0f : ((Number) niypou8cm2.q3BipwRCk.GPLPRo6go()).floatValue() - f2.floatValue();
                if (floatValue == 0.0f) {
                    if (floatValue2 != 0.0f) {
                        z = false;
                        break;
                    }
                }
                int i2 = ((u1Gs6N2OQ) this.Bhmn1KIah).CBQ5d1kRq;
                int[] iArr = Tpuv1V0a9.dfpT1j18n;
                int WaUP0CF08 = ((Tpuv1V0a9) this.PSTqBLTET).WaUP0CF08(i2);
                Tpuv1V0a9.iMyQMM6Qj((Tpuv1V0a9) this.PSTqBLTET, WaUP0CF08, 2048, 1, null, 8);
                AccessibilityEvent CBQ5d1kRq = ((Tpuv1V0a9) this.PSTqBLTET).CBQ5d1kRq(WaUP0CF08, 4096);
                if (niypou8cm != null) {
                    CBQ5d1kRq.setScrollX((int) ((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue());
                    CBQ5d1kRq.setMaxScrollX((int) ((Number) niypou8cm.J4Ux7ym32.GPLPRo6go()).floatValue());
                }
                if (niypou8cm2 != null) {
                    CBQ5d1kRq.setScrollY((int) ((Number) niypou8cm2.q3BipwRCk.GPLPRo6go()).floatValue());
                    CBQ5d1kRq.setMaxScrollY((int) ((Number) niypou8cm2.J4Ux7ym32.GPLPRo6go()).floatValue());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    ksLrMHgEz kslrmhgez = fomxlg0Yq.q3BipwRCk;
                    CBQ5d1kRq.setScrollDeltaX((int) floatValue);
                    CBQ5d1kRq.setScrollDeltaY((int) floatValue2);
                }
                ((Tpuv1V0a9) this.PSTqBLTET).i8XZMQc6Z(CBQ5d1kRq);
                if (niypou8cm != null) {
                    ((u1Gs6N2OQ) this.Bhmn1KIah).Bhmn1KIah = (Float) niypou8cm.q3BipwRCk.GPLPRo6go();
                }
                if (niypou8cm2 != null) {
                    ((u1Gs6N2OQ) this.Bhmn1KIah).PSTqBLTET = (Float) niypou8cm2.q3BipwRCk.GPLPRo6go();
                    return;
                }
                return;
            case 9:
                ((wnbPPCp4x) this.Bhmn1KIah).removeOnAttachStateChangeListener((mYYIIpcht) this.PSTqBLTET);
                return;
            case 11:
                prCJwNx2x prcjwnx2x2 = (prCJwNx2x) ((RNEcgN6dQ) this.Bhmn1KIah);
                prcjwnx2x2.CBQ5d1kRq(Integer.valueOf((((Number) prcjwnx2x2.getValue()).intValue() + 1) % ((Object[]) this.PSTqBLTET).length));
                return;
        }
    }

    public Float q3BipwRCk() {
        n4f84B5OG n4f84b5og;
        float f;
        float f2;
        switch (this.kmSgne1rO) {
            case 1:
                cnnoFa4Tx cnnofa4tx = (cnnoFa4Tx) this.Bhmn1KIah;
                if (cnnofa4tx.CBQ5d1kRq) {
                    f2 = (float) ((ox1v3fq6f) ((UBY2Inzw8) this.PSTqBLTET).getValue()).J4Ux7ym32.tGV7Q6urW;
                    f = 1.0f;
                } else {
                    f2 = (float) cnnofa4tx.dIocxURUo();
                    f = ((float) ((cnnoFa4Tx) this.Bhmn1KIah).kCA6Zs9sL()) / 100000.0f;
                }
                return Float.valueOf(f2 + f);
            default:
                CharSequence charSequence = (CharSequence) this.Bhmn1KIah;
                TextPaint textPaint = (TextPaint) this.PSTqBLTET;
                BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
                int i = 0;
                lineInstance.setText(new P000ZIs6c(charSequence, 0, charSequence.length()));
                PriorityQueue priorityQueue = new PriorityQueue(10, ndNTpwC0t.q3BipwRCk);
                while (true) {
                    int next = lineInstance.next();
                    if (next != -1) {
                        if (priorityQueue.size() < 10) {
                            n4f84b5og = new n4f84B5OG(Integer.valueOf(i), Integer.valueOf(next));
                        } else {
                            n4f84B5OG n4f84b5og2 = (n4f84B5OG) priorityQueue.peek();
                            if (n4f84b5og2 != null && ((Number) n4f84b5og2.kmSgne1rO).intValue() - ((Number) n4f84b5og2.CBQ5d1kRq).intValue() < next - i) {
                                priorityQueue.poll();
                                n4f84b5og = new n4f84B5OG(Integer.valueOf(i), Integer.valueOf(next));
                            }
                            i = next;
                        }
                        priorityQueue.add(n4f84b5og);
                        i = next;
                    } else {
                        float f3 = 0.0f;
                        Iterator it = priorityQueue.iterator();
                        while (it.hasNext()) {
                            n4f84B5OG n4f84b5og3 = (n4f84B5OG) it.next();
                            f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) n4f84b5og3.CBQ5d1kRq).intValue(), ((Number) n4f84b5og3.kmSgne1rO).intValue(), textPaint));
                        }
                        return Float.valueOf(f3);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(DpXbxvzXm dpXbxvzXm, Object obj) {
        super(0);
        this.Bhmn1KIah = dpXbxvzXm;
        this.PSTqBLTET = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(kycC9mx23 kycc9mx23, oQkvjGXIr oqkvjgxir) {
        super(0);
        this.Bhmn1KIah = kycc9mx23;
        this.PSTqBLTET = oqkvjgxir;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(zR1zXe0yP zr1zxe0yp, PmanMZxiM pmanMZxiM) {
        super(0);
        this.Bhmn1KIah = zr1zxe0yp;
        this.PSTqBLTET = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(kkcQgCx5G kkcqgcx5g, wpXpbWG1J wpxpbwg1j) {
        super(0);
        this.Bhmn1KIah = kkcqgcx5g;
        this.PSTqBLTET = wpxpbwg1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(OavOIaZo5 oavOIaZo5, USS5dphka uSS5dphka) {
        super(0);
        this.Bhmn1KIah = oavOIaZo5;
        this.PSTqBLTET = uSS5dphka;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(qhaZGYFO8 qhazgyfo8, SI0VpKubr sI0VpKubr) {
        super(0);
        this.Bhmn1KIah = qhazgyfo8;
        this.PSTqBLTET = sI0VpKubr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(cnnoFa4Tx cnnofa4tx, UBY2Inzw8 uBY2Inzw8) {
        super(0);
        this.Bhmn1KIah = cnnofa4tx;
        this.PSTqBLTET = uBY2Inzw8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(u1Gs6N2OQ u1gs6n2oq, Tpuv1V0a9 tpuv1V0a9) {
        super(0);
        this.Bhmn1KIah = u1gs6n2oq;
        this.PSTqBLTET = tpuv1V0a9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(AWlaaRmBK aWlaaRmBK, pHrf9LisQ phrf9lisq) {
        super(0);
        this.Bhmn1KIah = aWlaaRmBK;
        this.PSTqBLTET = phrf9lisq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(RNEcgN6dQ rNEcgN6dQ, nPZZG1232 npzzg1232) {
        super(0);
        this.Bhmn1KIah = rNEcgN6dQ;
        this.PSTqBLTET = npzzg1232;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(RNEcgN6dQ rNEcgN6dQ, Object[] objArr) {
        super(0);
        this.Bhmn1KIah = rNEcgN6dQ;
        this.PSTqBLTET = objArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.Bhmn1KIah = charSequence;
        this.PSTqBLTET = textPaint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuvj6DyFF(String str, kr2hYxX5l kr2hyxx5l) {
        super(0);
        this.Bhmn1KIah = str;
        this.PSTqBLTET = kr2hyxx5l;
    }
}
