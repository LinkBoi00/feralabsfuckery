package con;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
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
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: con.kuvj6DyFF.J4Ux7ym32():void");
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
