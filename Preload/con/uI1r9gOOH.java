package con;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class uI1r9gOOH {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r7 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Object q3BipwRCk(Object[] objArr, B6IRYLW14 b6irylw14, String str, gdEmqfwpT gdemqfwpt, rJ0s9PfCL rj0s9pfcl, int i) {
        Object tGV7Q6urW;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(1059366159);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i & 2) != 0) {
            b6irylw14 = IaRtW3OEX.q3BipwRCk;
        }
        wpxpbwg1j.zHl31GGXU(1059366416);
        int i2 = wpxpbwg1j.i0Zug1mVk;
        idpM54xlp.J4Ux7ym32(36);
        String num = Integer.toString(i2, 36);
        wpxpbwg1j.ilHKhw3Yw(false);
        Objects.requireNonNull(b6irylw14, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        dVtF46MWK dvtf46mwk = (dVtF46MWK) wpxpbwg1j.oon79WMrY(cAJLJrM2D.q3BipwRCk);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        wpxpbwg1j.zHl31GGXU(-3685570);
        int length = copyOf.length;
        int i3 = 0;
        boolean z = false;
        while (i3 < length) {
            Object obj2 = copyOf[i3];
            i3++;
            z |= wpxpbwg1j.iiGwOFFnr(obj2);
        }
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        if (!z) {
            int i4 = rJ0s9PfCL.q3BipwRCk;
        }
        if (dvtf46mwk == null || (tGV7Q6urW = dvtf46mwk.tGV7Q6urW(num)) == null) {
            dfpT1j18n = null;
        } else {
            dfpT1j18n = b6irylw14.J4Ux7ym32.IytU16YUK(tGV7Q6urW);
        }
        if (dfpT1j18n == null) {
            dfpT1j18n = gdemqfwpt.GPLPRo6go();
        }
        wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        wpxpbwg1j.ilHKhw3Yw(false);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object obj3 = G7WvUK4mQ.q3BipwRCk;
        Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
        int i5 = rJ0s9PfCL.q3BipwRCk;
        Object obj4 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n2 == obj4) {
            dfpT1j18n2 = u51fgFYkV.dIocxURUo(b6irylw14, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        prCJwNx2x prcjwnx2x = (prCJwNx2x) ((RNEcgN6dQ) dfpT1j18n2);
        prcjwnx2x.CBQ5d1kRq(b6irylw14);
        if (dvtf46mwk != null) {
            ICC2zzYGi iCC2zzYGi = new ICC2zzYGi(dvtf46mwk, num, prcjwnx2x, dfpT1j18n);
            wpxpbwg1j.zHl31GGXU(592134824);
            wpxpbwg1j.zHl31GGXU(-3686095);
            boolean iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(dvtf46mwk) | wpxpbwg1j.iiGwOFFnr(num) | wpxpbwg1j.iiGwOFFnr(dfpT1j18n);
            Object dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
            if (iiGwOFFnr || dfpT1j18n3 == obj4) {
                wpxpbwg1j.INnK5Rew6(new kG2oMq5aL(iCC2zzYGi));
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            wpxpbwg1j.ilHKhw3Yw(false);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        return dfpT1j18n;
    }
}
