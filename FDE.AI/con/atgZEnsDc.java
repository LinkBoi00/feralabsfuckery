package con;

import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.compose.ui.platform.s7MlVynBG;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.List;
/* loaded from: classes.dex */
public final class atgZEnsDc extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgZEnsDc(MainActivity mainActivity, tcFbS2CQx tcfbs2cqx, oQkvjGXIr oqkvjgxir) {
        super(0);
        this.Bhmn1KIah = mainActivity;
        this.PSTqBLTET = tcfbs2cqx;
        this.MzoOEjc4X = oqkvjgxir;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (con.ODug2UCW1.WaUP0CF08(r2, con.OUcp9JXoJ.class) == false) goto L_0x007b;
     */
    @Override // con.gdEmqfwpT
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.Object GPLPRo6go() {
        /*
            r7 = this;
            int r0 = r7.kmSgne1rO
            switch(r0) {
                case 0: goto L_0x008b;
                case 1: goto L_0x0085;
                case 2: goto L_0x0013;
                case 3: goto L_0x000d;
                case 4: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00bb
        L_0x0007:
            r7.q3BipwRCk()
            con.qih4lW99W r0 = con.qih4lW99W.q3BipwRCk
            return r0
        L_0x000d:
            r7.q3BipwRCk()
            con.qih4lW99W r0 = con.qih4lW99W.q3BipwRCk
            return r0
        L_0x0013:
            java.lang.Object r0 = r7.Bhmn1KIah
            con.j6XJY7rz4 r0 = (con.j6XJY7rz4) r0
            java.lang.Object r0 = r0.kmSgne1rO
            con.llWJsfBCK r0 = (con.llWJsfBCK) r0
            java.lang.Object r0 = r0.getValue()
            android.text.BoringLayout$Metrics r0 = (android.text.BoringLayout.Metrics) r0
            if (r0 != 0) goto L_0x0025
            r0 = 0
            goto L_0x002c
        L_0x0025:
            int r0 = r0.width
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x002c:
            r1 = 0
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = r7.PSTqBLTET
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r2 = r0.length()
            java.lang.Object r3 = r7.MzoOEjc4X
            android.text.TextPaint r3 = (android.text.TextPaint) r3
            float r0 = android.text.Layout.getDesiredWidth(r0, r1, r2, r3)
            goto L_0x0044
        L_0x0040:
            float r0 = r0.floatValue()
        L_0x0044:
            java.lang.Object r2 = r7.PSTqBLTET
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r3 = r7.MzoOEjc4X
            android.text.TextPaint r3 = (android.text.TextPaint) r3
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L_0x0054
            r5 = r6
            goto L_0x0055
        L_0x0054:
            r5 = r1
        L_0x0055:
            if (r5 != 0) goto L_0x007b
            boolean r5 = r2 instanceof android.text.Spanned
            if (r5 == 0) goto L_0x007b
            float r3 = r3.getLetterSpacing()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            r3 = r6
            goto L_0x0066
        L_0x0065:
            r3 = r1
        L_0x0066:
            if (r3 == 0) goto L_0x007a
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<con.CKs4YWklF> r3 = con.CKs4YWklF.class
            boolean r3 = con.ODug2UCW1.WaUP0CF08(r2, r3)
            if (r3 != 0) goto L_0x007a
            java.lang.Class<con.OUcp9JXoJ> r3 = con.OUcp9JXoJ.class
            boolean r2 = con.ODug2UCW1.WaUP0CF08(r2, r3)
            if (r2 == 0) goto L_0x007b
        L_0x007a:
            r1 = r6
        L_0x007b:
            if (r1 == 0) goto L_0x0080
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L_0x0080:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0085:
            r7.q3BipwRCk()
            con.qih4lW99W r0 = con.qih4lW99W.q3BipwRCk
            return r0
        L_0x008b:
            con.Sl1WIfCio r0 = new con.Sl1WIfCio
            r0.<init>()
            java.lang.Object r1 = r7.Bhmn1KIah
            con.UBY2Inzw8 r1 = (con.UBY2Inzw8) r1
            java.lang.Object r1 = r1.getValue()
            con.PmanMZxiM r1 = (con.PmanMZxiM) r1
            r1.IytU16YUK(r0)
            con.ox1v3fq6f r1 = new con.ox1v3fq6f
            java.lang.Object r2 = r7.PSTqBLTET
            con.R7CNZOOL2 r2 = (con.R7CNZOOL2) r2
            con.JYTRn9Ica r3 = r0.J4Ux7ym32
            java.util.List r0 = r0.tGV7Q6urW
            if (r0 != 0) goto L_0x00ab
            con.Dqz1pJHWH r0 = con.Dqz1pJHWH.CBQ5d1kRq
        L_0x00ab:
            java.lang.Object r4 = r7.MzoOEjc4X
            con.RNEcgN6dQ r4 = (con.RNEcgN6dQ) r4
            con.prCJwNx2x r4 = (con.prCJwNx2x) r4
            java.lang.Object r4 = r4.getValue()
            con.G8ebKyy85 r4 = (con.G8ebKyy85) r4
            r1.<init>(r2, r3, r0, r4)
            return r1
        L_0x00bb:
            java.lang.Object r0 = r7.Bhmn1KIah
            con.OQAe3E1UA r0 = (con.OQAe3E1UA) r0
            java.lang.Object r1 = r7.PSTqBLTET
            con.NWqEIvIkR r1 = (con.NWqEIvIkR) r1
            java.util.Objects.requireNonNull(r0)
            con.BScqaI6mx r0 = (con.BScqaI6mx) r0
            java.lang.Object r0 = con.cOutqbkMD.dIocxURUo(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.atgZEnsDc.GPLPRo6go():java.lang.Object");
    }

    public void q3BipwRCk() {
        int i = 0;
        switch (this.kmSgne1rO) {
            case 1:
                pW31wYUjR pw31wyujr = (pW31wYUjR) this.Bhmn1KIah;
                e3ALPxmyo e3alpxmyo = (e3ALPxmyo) this.PSTqBLTET;
                pLYbCSTk0 plybcstk0 = (pLYbCSTk0) this.MzoOEjc4X;
                pLYbCSTk0 J4Ux7ym32 = pw31wyujr.J4Ux7ym32();
                J4Ux7ym32.ixWaw2akD = true;
                kkcQgCx5G kkcqgcx5g = e3alpxmyo.J4Ux7ym32;
                v0l3RHDWl v0l3rhdwl = e3alpxmyo.tGV7Q6urW;
                z3ICU5k15 z3icu5k15 = pw31wyujr.J4Ux7ym32;
                if (z3icu5k15 != null) {
                    poAUpaBYd nlGCs0NZs = xpuSUT7Gh.nlGCs0NZs(-985540398, true, new MAZDnzQe5(kkcqgcx5g));
                    if (v0l3rhdwl == null || v0l3rhdwl.J4Ux7ym32()) {
                        ViewGroup.LayoutParams layoutParams = s7MlVynBG.q3BipwRCk;
                        v0l3rhdwl = MLnKY8xDo.q3BipwRCk(new aPSn62JU5(plybcstk0), z3icu5k15);
                    }
                    v0l3rhdwl.dIocxURUo(nlGCs0NZs);
                    e3alpxmyo.tGV7Q6urW = v0l3rhdwl;
                    J4Ux7ym32.ixWaw2akD = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            case 2:
            default:
                int i2 = MainActivity.mUqPm6GBh;
                if (((MainActivity) this.Bhmn1KIah).EBQXiIPmm()) {
                    oWhsE8IPp owhse8ipp = q4OLPt0Jo.q3BipwRCk;
                    JyuTiwi92 jyuTiwi92 = JyuTiwi92.q3BipwRCk;
                    ((D7JlMB0DC) ((tcFbS2CQx) this.PSTqBLTET)).q3BipwRCk(0);
                    idpM54xlp.RG6kpfv3v((oQkvjGXIr) this.MzoOEjc4X, null, 0, new Ww93uCr1v((MainActivity) this.Bhmn1KIah, null), 3, null);
                    MainActivity mainActivity = (MainActivity) this.Bhmn1KIah;
                    ((prCJwNx2x) mainActivity.i8XZMQc6Z).CBQ5d1kRq(mainActivity.getString(R.string.unpreloaded));
                    return;
                }
                return;
            case 3:
                List list = (List) this.Bhmn1KIah;
                A2fLYD2UL a2fLYD2UL = (A2fLYD2UL) this.PSTqBLTET;
                nPZZG1232 npzzg1232 = (nPZZG1232) this.MzoOEjc4X;
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = i + 1;
                        Object Bhmn1KIah = ((hKxHUWEcH) list.get(i)).Bhmn1KIah();
                        FiQJL8Ct3 fiQJL8Ct3 = Bhmn1KIah instanceof FiQJL8Ct3 ? (FiQJL8Ct3) Bhmn1KIah : null;
                        if (fiQJL8Ct3 != null) {
                            CSCtv8Wiy cSCtv8Wiy = new CSCtv8Wiy(fiQJL8Ct3.CBQ5d1kRq.q3BipwRCk);
                            fiQJL8Ct3.kmSgne1rO.IytU16YUK(cSCtv8Wiy);
                            for (PmanMZxiM pmanMZxiM : cSCtv8Wiy.J4Ux7ym32) {
                                pmanMZxiM.IytU16YUK(a2fLYD2UL);
                            }
                        }
                        npzzg1232.ilHKhw3Yw.add(fiQJL8Ct3);
                        if (i3 <= size) {
                            i = i3;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgZEnsDc(UBY2Inzw8 uBY2Inzw8, R7CNZOOL2 r7cnzool2, RNEcgN6dQ rNEcgN6dQ) {
        super(0);
        this.Bhmn1KIah = uBY2Inzw8;
        this.PSTqBLTET = r7cnzool2;
        this.MzoOEjc4X = rNEcgN6dQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgZEnsDc(pW31wYUjR pw31wyujr, e3ALPxmyo e3alpxmyo, pLYbCSTk0 plybcstk0) {
        super(0);
        this.Bhmn1KIah = pw31wyujr;
        this.PSTqBLTET = e3alpxmyo;
        this.MzoOEjc4X = plybcstk0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgZEnsDc(j6XJY7rz4 j6xjy7rz4, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.Bhmn1KIah = j6xjy7rz4;
        this.PSTqBLTET = charSequence;
        this.MzoOEjc4X = textPaint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgZEnsDc(List list, A2fLYD2UL a2fLYD2UL, nPZZG1232 npzzg1232) {
        super(0);
        this.Bhmn1KIah = list;
        this.PSTqBLTET = a2fLYD2UL;
        this.MzoOEjc4X = npzzg1232;
    }
}
