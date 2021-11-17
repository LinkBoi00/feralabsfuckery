package con;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.feravolt.preload.R;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class WAflFGuGp {
    public static final String GPLPRo6go(int i, rJ0s9PfCL rj0s9pfcl) {
        String str;
        int i2;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-845575816);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.oon79WMrY(KApR71V3i.q3BipwRCk);
        Resources resources = ((Context) wpxpbwg1j.oon79WMrY(KApR71V3i.J4Ux7ym32)).getResources();
        ksLrMHgEz kslrmhgez = QGj7N4XWh.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = QGj7N4XWh.q3BipwRCk;
        if (QGj7N4XWh.q3BipwRCk(i, 0)) {
            i2 = R.string.navigation_menu;
        } else if (QGj7N4XWh.q3BipwRCk(i, 1)) {
            i2 = R.string.close_drawer;
        } else if (QGj7N4XWh.q3BipwRCk(i, 2)) {
            i2 = R.string.close_sheet;
        } else if (QGj7N4XWh.q3BipwRCk(i, 3)) {
            i2 = R.string.default_error_message;
        } else if (QGj7N4XWh.q3BipwRCk(i, 4)) {
            i2 = R.string.dropdown_menu;
        } else {
            str = "";
            wpxpbwg1j.ilHKhw3Yw(false);
            return str;
        }
        str = resources.getString(i2);
        wpxpbwg1j.ilHKhw3Yw(false);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void J4Ux7ym32(java.lang.String r28, con.BgIsSUB3d r29, con.GjhoS54Hf r30, con.PmanMZxiM r31, int r32, boolean r33, int r34, con.rJ0s9PfCL r35, int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 735
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WAflFGuGp.J4Ux7ym32(java.lang.String, con.BgIsSUB3d, con.GjhoS54Hf, con.PmanMZxiM, int, boolean, int, con.rJ0s9PfCL, int, int):void");
    }

    public static final int Puu3Rhg4F(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            ksLrMHgEz kslrmhgez = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez2 = le9Z8LIS5.q3BipwRCk;
            return 2;
        } else if (action != 1) {
            ksLrMHgEz kslrmhgez3 = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez4 = le9Z8LIS5.q3BipwRCk;
            return 0;
        } else {
            ksLrMHgEz kslrmhgez5 = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez6 = le9Z8LIS5.q3BipwRCk;
            return 1;
        }
    }

    public static final bzmJZsHMu dIocxURUo(AU29aHa4X aU29aHa4X, int i, KNUBbNYxJ kNUBbNYxJ, pZznYi2iw pzznyi2iw, boolean z, int i2) {
        bzmJZsHMu bzmjzshmu;
        if (pzznyi2iw == null) {
            bzmjzshmu = null;
        } else {
            Objects.requireNonNull((zmrz5MjK1) kNUBbNYxJ.J4Ux7ym32);
            bzmjzshmu = pzznyi2iw.tGV7Q6urW(i);
        }
        if (bzmjzshmu == null) {
            ksLrMHgEz kslrmhgez = bzmJZsHMu.kCA6Zs9sL;
            ksLrMHgEz kslrmhgez2 = bzmJZsHMu.kCA6Zs9sL;
            bzmjzshmu = bzmJZsHMu.iiGwOFFnr;
        }
        float f = ULcVOH77q.q3BipwRCk;
        int iiGwOFFnr = aU29aHa4X.iiGwOFFnr(ULcVOH77q.q3BipwRCk);
        float f2 = z ? (((float) i2) - bzmjzshmu.q3BipwRCk) - ((float) iiGwOFFnr) : bzmjzshmu.q3BipwRCk;
        float f3 = z ? ((float) i2) - bzmjzshmu.q3BipwRCk : ((float) iiGwOFFnr) + bzmjzshmu.q3BipwRCk;
        ksLrMHgEz kslrmhgez3 = bzmJZsHMu.kCA6Zs9sL;
        return new bzmJZsHMu(f2, bzmjzshmu.J4Ux7ym32, f3, bzmjzshmu.dIocxURUo);
    }

    public static final long iiGwOFFnr(KeyEvent keyEvent) {
        return ODug2UCW1.tGV7Q6urW(keyEvent.getKeyCode());
    }

    public static final MRJRYaP06 kCA6Zs9sL(Context context) {
        LLsIOxFFo lLsIOxFFo = LLsIOxFFo.q3BipwRCk;
        return new MRJRYaP06(lLsIOxFFo.q3BipwRCk(context, 17170461), lLsIOxFFo.q3BipwRCk(context, 17170462), lLsIOxFFo.q3BipwRCk(context, 17170463), lLsIOxFFo.q3BipwRCk(context, 17170464), lLsIOxFFo.q3BipwRCk(context, 17170465), lLsIOxFFo.q3BipwRCk(context, 17170466), lLsIOxFFo.q3BipwRCk(context, 17170467), lLsIOxFFo.q3BipwRCk(context, 17170468), lLsIOxFFo.q3BipwRCk(context, 17170469), lLsIOxFFo.q3BipwRCk(context, 17170470), lLsIOxFFo.q3BipwRCk(context, 17170471), lLsIOxFFo.q3BipwRCk(context, 17170472), lLsIOxFFo.q3BipwRCk(context, 17170473), lLsIOxFFo.q3BipwRCk(context, 17170474), lLsIOxFFo.q3BipwRCk(context, 17170475), lLsIOxFFo.q3BipwRCk(context, 17170476), lLsIOxFFo.q3BipwRCk(context, 17170477), lLsIOxFFo.q3BipwRCk(context, 17170478), lLsIOxFFo.q3BipwRCk(context, 17170479), lLsIOxFFo.q3BipwRCk(context, 17170480), lLsIOxFFo.q3BipwRCk(context, 17170481), lLsIOxFFo.q3BipwRCk(context, 17170482), lLsIOxFFo.q3BipwRCk(context, 17170483), lLsIOxFFo.q3BipwRCk(context, 17170484), lLsIOxFFo.q3BipwRCk(context, 17170485), lLsIOxFFo.q3BipwRCk(context, 17170486), lLsIOxFFo.q3BipwRCk(context, 17170487), lLsIOxFFo.q3BipwRCk(context, 17170488), lLsIOxFFo.q3BipwRCk(context, 17170489), lLsIOxFFo.q3BipwRCk(context, 17170490), lLsIOxFFo.q3BipwRCk(context, 17170491), lLsIOxFFo.q3BipwRCk(context, 17170492), lLsIOxFFo.q3BipwRCk(context, 17170493), lLsIOxFFo.q3BipwRCk(context, 17170494), lLsIOxFFo.q3BipwRCk(context, 17170495), lLsIOxFFo.q3BipwRCk(context, 17170496), lLsIOxFFo.q3BipwRCk(context, 17170497), lLsIOxFFo.q3BipwRCk(context, 17170498), lLsIOxFFo.q3BipwRCk(context, 17170499), lLsIOxFFo.q3BipwRCk(context, 17170500), lLsIOxFFo.q3BipwRCk(context, 17170501), lLsIOxFFo.q3BipwRCk(context, 17170502), lLsIOxFFo.q3BipwRCk(context, 17170503), lLsIOxFFo.q3BipwRCk(context, 17170504), lLsIOxFFo.q3BipwRCk(context, 17170505), lLsIOxFFo.q3BipwRCk(context, 17170506), lLsIOxFFo.q3BipwRCk(context, 17170507), lLsIOxFFo.q3BipwRCk(context, 17170508), lLsIOxFFo.q3BipwRCk(context, 17170509), lLsIOxFFo.q3BipwRCk(context, 17170510), lLsIOxFFo.q3BipwRCk(context, 17170511), lLsIOxFFo.q3BipwRCk(context, 17170512), lLsIOxFFo.q3BipwRCk(context, 17170513), lLsIOxFFo.q3BipwRCk(context, 17170514), lLsIOxFFo.q3BipwRCk(context, 17170515), lLsIOxFFo.q3BipwRCk(context, 17170516), lLsIOxFFo.q3BipwRCk(context, 17170517), lLsIOxFFo.q3BipwRCk(context, 17170518), lLsIOxFFo.q3BipwRCk(context, 17170519), lLsIOxFFo.q3BipwRCk(context, 17170520), lLsIOxFFo.q3BipwRCk(context, 17170521), lLsIOxFFo.q3BipwRCk(context, 17170522), lLsIOxFFo.q3BipwRCk(context, 17170523), lLsIOxFFo.q3BipwRCk(context, 17170524), lLsIOxFFo.q3BipwRCk(context, 17170525), null);
    }

    public static final long kmSgne1rO(long j, float f) {
        return ODug2UCW1.q3BipwRCk(Math.max(0.0f, yDwaznigW.J4Ux7ym32(j) - f), Math.max(0.0f, yDwaznigW.tGV7Q6urW(j) - f));
    }

    public static InputConnection oon79WMrY(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fe A[LOOP:0: B:126:0x01c7->B:138:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020c A[EDGE_INSN: B:174:0x020c->B:140:0x020c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(con.joIJ4ANvK r34, con.BgIsSUB3d r35, con.GjhoS54Hf r36, con.PmanMZxiM r37, int r38, boolean r39, int r40, java.util.Map r41, con.rJ0s9PfCL r42, int r43, int r44) {
        /*
        // Method dump skipped, instructions count: 998
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WAflFGuGp.q3BipwRCk(con.joIJ4ANvK, con.BgIsSUB3d, con.GjhoS54Hf, con.PmanMZxiM, int, boolean, int, java.util.Map, con.rJ0s9PfCL, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r1 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(con.mKU9R6cnm r7, con.bb216AtXv r8, con.ZiaC7TNf1 r9, con.pW31wYUjR r10, con.rJ0s9PfCL r11, int r12) {
        /*
            con.wpXpbWG1J r11 = (con.wpXpbWG1J) r11
            r0 = -649386156(0xffffffffd94b2754, float:-3.57391638E15)
            r11.ziwPzaoF3(r0)
            java.lang.Object r0 = con.G7WvUK4mQ.q3BipwRCk
            con.hOY2Rgtej r0 = con.KApR71V3i.iiGwOFFnr
            con.wpXpbWG1J r11 = (con.wpXpbWG1J) r11
            java.lang.Object r0 = r11.oon79WMrY(r0)
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            r0 = -3686095(0xffffffffffc7c131, float:NaN)
            r11.zHl31GGXU(r0)
            boolean r0 = r11.iiGwOFFnr(r10)
            boolean r1 = r11.iiGwOFFnr(r7)
            r0 = r0 | r1
            boolean r1 = r11.iiGwOFFnr(r6)
            r0 = r0 | r1
            java.lang.Object r1 = r11.dfpT1j18n()
            if (r0 != 0) goto L_0x0035
            int r0 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r0 = con.P7Re99G8L.J4Ux7ym32
            if (r1 != r0) goto L_0x0042
        L_0x0035:
            con.WTGSMK63e r0 = new con.WTGSMK63e
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r11.INnK5Rew6(r0)
        L_0x0042:
            r0 = 0
            r11.ilHKhw3Yw(r0)
            con.rESgwfV20 r11 = r11.Eeka1udhb()
            if (r11 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            con.Z8l8H7cKR r6 = new con.Z8l8H7cKR
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r11.dIocxURUo = r6
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WAflFGuGp.tGV7Q6urW(con.mKU9R6cnm, con.bb216AtXv, con.ZiaC7TNf1, con.pW31wYUjR, con.rJ0s9PfCL, int):void");
    }

    public static final Object[] vPSbyrYWX(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final RFvh4RAur yWvV4ePLl(R7CNZOOL2 r7cnzool2) {
        RFvh4RAur rFvh4RAur = (RFvh4RAur) r7cnzool2.q3BipwRCk;
        if (rFvh4RAur != null) {
            return rFvh4RAur;
        }
        RFvh4RAur rFvh4RAur2 = new RFvh4RAur(null, null, null, null, 15);
        r7cnzool2.q3BipwRCk = rFvh4RAur2;
        return rFvh4RAur2;
    }
}
