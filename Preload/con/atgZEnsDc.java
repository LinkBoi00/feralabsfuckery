package con;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.compose.ui.platform.s7MlVynBG;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.List;
import java.util.Objects;
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
    public Object GPLPRo6go() {
        Float f;
        float f2;
        switch (this.kmSgne1rO) {
            case 0:
                Sl1WIfCio sl1WIfCio = new Sl1WIfCio();
                ((PmanMZxiM) ((UBY2Inzw8) this.Bhmn1KIah).getValue()).IytU16YUK(sl1WIfCio);
                R7CNZOOL2 r7cnzool2 = (R7CNZOOL2) this.PSTqBLTET;
                JYTRn9Ica jYTRn9Ica = sl1WIfCio.J4Ux7ym32;
                List list = sl1WIfCio.tGV7Q6urW;
                if (list == null) {
                    list = Dqz1pJHWH.CBQ5d1kRq;
                }
                return new ox1v3fq6f(r7cnzool2, jYTRn9Ica, list, (G8ebKyy85) ((prCJwNx2x) ((RNEcgN6dQ) this.MzoOEjc4X)).getValue());
            case 1:
                q3BipwRCk();
                return qih4lW99W.q3BipwRCk;
            case 2:
                BoringLayout.Metrics metrics = (BoringLayout.Metrics) ((llWJsfBCK) ((j6XJY7rz4) this.Bhmn1KIah).kmSgne1rO).getValue();
                if (metrics == null) {
                    f = null;
                } else {
                    f = Float.valueOf((float) metrics.width);
                }
                boolean z = false;
                if (f == null) {
                    CharSequence charSequence = (CharSequence) this.PSTqBLTET;
                    f2 = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), (TextPaint) this.MzoOEjc4X);
                } else {
                    f2 = f.floatValue();
                }
                CharSequence charSequence2 = (CharSequence) this.PSTqBLTET;
                TextPaint textPaint = (TextPaint) this.MzoOEjc4X;
                if (!(f2 == 0.0f) && (charSequence2 instanceof Spanned)) {
                    if (textPaint.getLetterSpacing() == 0.0f) {
                        Spanned spanned = (Spanned) charSequence2;
                        if (!ODug2UCW1.WaUP0CF08(spanned, CKs4YWklF.class)) {
                            break;
                        }
                    }
                    z = true;
                }
                if (z) {
                    f2 += 0.5f;
                }
                return Float.valueOf(f2);
            case 3:
                q3BipwRCk();
                return qih4lW99W.q3BipwRCk;
            case 4:
                q3BipwRCk();
                return qih4lW99W.q3BipwRCk;
            default:
                OQAe3E1UA oQAe3E1UA = (OQAe3E1UA) this.Bhmn1KIah;
                Objects.requireNonNull(oQAe3E1UA);
                return cOutqbkMD.dIocxURUo((BScqaI6mx) oQAe3E1UA, (NWqEIvIkR) this.PSTqBLTET);
        }
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
