package con;

import android.graphics.Rect;
import java.util.Objects;
/* loaded from: classes.dex */
public class uEb6wTQlg {
    public uEb6wTQlg(int i) {
    }

    public float[] J4Ux7ym32(J8UIfudgU j8UIfudgU, J8UIfudgU j8UIfudgU2, int i) {
        if (!(i == 3)) {
            return null;
        }
        long j = j8UIfudgU.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = eAsjC32WK.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg2 = eAsjC32WK.q3BipwRCk;
        long j2 = eAsjC32WK.J4Ux7ym32;
        boolean q3BipwRCk = eAsjC32WK.q3BipwRCk(j, j2);
        boolean q3BipwRCk2 = eAsjC32WK.q3BipwRCk(j8UIfudgU2.J4Ux7ym32, j2);
        if (q3BipwRCk && q3BipwRCk2) {
            return null;
        }
        if (!q3BipwRCk && !q3BipwRCk2) {
            return null;
        }
        if (!q3BipwRCk) {
            j8UIfudgU = j8UIfudgU2;
        }
        mVycGceov mvycgceov = (mVycGceov) j8UIfudgU;
        float[] q3BipwRCk3 = q3BipwRCk ? mvycgceov.dIocxURUo.q3BipwRCk() : Q5TZwEC4N.kCA6Zs9sL;
        float[] q3BipwRCk4 = q3BipwRCk2 ? mvycgceov.dIocxURUo.q3BipwRCk() : Q5TZwEC4N.kCA6Zs9sL;
        return new float[]{q3BipwRCk3[0] / q3BipwRCk4[0], q3BipwRCk3[1] / q3BipwRCk4[1], q3BipwRCk3[2] / q3BipwRCk4[2]};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void dIocxURUo(eTxfvEx3L etxfvex3l, icKZ1RJnW ickz1rjnw, pZznYi2iw pzznyi2iw, mnTaxtMa7 mntaxtma7, BMaqWJsj7 bMaqWJsj7, boolean z, TI4Z69BNb tI4Z69BNb) {
        bzmJZsHMu bzmjzshmu;
        if (z) {
            int iiGwOFFnr = czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32);
            if (iiGwOFFnr >= pzznyi2iw.q3BipwRCk.q3BipwRCk.length()) {
                if (iiGwOFFnr != 0) {
                    iiGwOFFnr--;
                } else {
                    bzmjzshmu = new bzmJZsHMu(0.0f, 0.0f, 1.0f, (float) YWiUMZOtw.J4Ux7ym32(mUgAoJZpo.q3BipwRCk(ickz1rjnw.J4Ux7ym32, ickz1rjnw.iiGwOFFnr, ickz1rjnw.GPLPRo6go, mUgAoJZpo.q3BipwRCk, 1)));
                    long Ta2zrwkcM = ((qhaZGYFO8) mntaxtma7).Ta2zrwkcM(ODug2UCW1.dIocxURUo(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32));
                    bzmJZsHMu q3BipwRCk = gThLCaTO1.q3BipwRCk(ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(Ta2zrwkcM), bRgfgYIQX.dIocxURUo(Ta2zrwkcM)), gThLCaTO1.J4Ux7ym32(bzmjzshmu.kCA6Zs9sL(), bzmjzshmu.J4Ux7ym32()));
                    if (!bMaqWJsj7.q3BipwRCk()) {
                        LCXryTULd lCXryTULd = (LCXryTULd) bMaqWJsj7.J4Ux7ym32;
                        Objects.requireNonNull(lCXryTULd);
                        Rect rect = new Rect(D3DEikrvb.Eeka1udhb(q3BipwRCk.q3BipwRCk), D3DEikrvb.Eeka1udhb(q3BipwRCk.J4Ux7ym32), D3DEikrvb.Eeka1udhb(q3BipwRCk.tGV7Q6urW), D3DEikrvb.Eeka1udhb(q3BipwRCk.dIocxURUo));
                        lCXryTULd.oon79WMrY = rect;
                        if (lCXryTULd.Puu3Rhg4F == null) {
                            lCXryTULd.q3BipwRCk.requestRectangleOnScreen(new Rect(rect));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            bzmjzshmu = pzznyi2iw.J4Ux7ym32(iiGwOFFnr);
            long Ta2zrwkcM2 = ((qhaZGYFO8) mntaxtma7).Ta2zrwkcM(ODug2UCW1.dIocxURUo(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32));
            bzmJZsHMu q3BipwRCk2 = gThLCaTO1.q3BipwRCk(ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(Ta2zrwkcM2), bRgfgYIQX.dIocxURUo(Ta2zrwkcM2)), gThLCaTO1.J4Ux7ym32(bzmjzshmu.kCA6Zs9sL(), bzmjzshmu.J4Ux7ym32()));
            if (!bMaqWJsj7.q3BipwRCk()) {
            }
        }
    }

    public BMaqWJsj7 iiGwOFFnr(aY3UdkO3G ay3udko3g, eTxfvEx3L etxfvex3l, PlegqbMSA plegqbMSA, wozWTi35b wozwti35b, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2) {
        eTxfvEx3L q3BipwRCk = eTxfvEx3L.q3BipwRCk(etxfvex3l, null, 0, null, 7);
        dMQC97DHs dmqc97dhs = new dMQC97DHs(plegqbMSA, pmanMZxiM);
        LCXryTULd lCXryTULd = (LCXryTULd) ay3udko3g.q3BipwRCk;
        lCXryTULd.tGV7Q6urW = true;
        lCXryTULd.iiGwOFFnr = q3BipwRCk;
        lCXryTULd.GPLPRo6go = wozwti35b;
        lCXryTULd.dIocxURUo = dmqc97dhs;
        lCXryTULd.kCA6Zs9sL = pmanMZxiM2;
        lCXryTULd.q3BipwRCk.post(new UoUKJhr5d(lCXryTULd));
        BMaqWJsj7 bMaqWJsj7 = new BMaqWJsj7(ay3udko3g, ay3udko3g.q3BipwRCk);
        ay3udko3g.J4Ux7ym32.set(bMaqWJsj7);
        return bMaqWJsj7;
    }

    public void kCA6Zs9sL(iFKnyAZAM ifknyazam) {
        V1N1H6iou v1N1H6iou;
        ZoDp2hPgc zoDp2hPgc;
        x5Xme9UIF x5xme9uif;
        Object obj;
        do {
            v1N1H6iou = rQamjxEL9.MzoOEjc4X;
            zoDp2hPgc = (ZoDp2hPgc) ((I5LF8ecws) v1N1H6iou).Puu3Rhg4F();
            x5xme9uif = (x5Xme9UIF) zoDp2hPgc;
            NQDE489uH nQDE489uH = (NQDE489uH) x5xme9uif.Bhmn1KIah.get(ifknyazam);
            if (nQDE489uH != null) {
                OFzjsdJSX oFzjsdJSX = x5xme9uif.Bhmn1KIah;
                boolean z = false;
                yUfRSVKGd WaUP0CF08 = oFzjsdJSX.CBQ5d1kRq.WaUP0CF08(ifknyazam != null ? ifknyazam.hashCode() : 0, ifknyazam, 0);
                if (oFzjsdJSX.CBQ5d1kRq != WaUP0CF08) {
                    if (WaUP0CF08 == null) {
                        oFzjsdJSX = OFzjsdJSX.PSTqBLTET;
                    } else {
                        oFzjsdJSX = new OFzjsdJSX(WaUP0CF08, oFzjsdJSX.size() - 1);
                    }
                }
                Object obj2 = nQDE489uH.q3BipwRCk;
                L5RKcDF9F l5RKcDF9F = L5RKcDF9F.q3BipwRCk;
                if (obj2 != l5RKcDF9F) {
                    oFzjsdJSX = oFzjsdJSX.J4Ux7ym32(nQDE489uH.q3BipwRCk, new NQDE489uH(((NQDE489uH) oFzjsdJSX.get(obj2)).q3BipwRCk, nQDE489uH.J4Ux7ym32));
                }
                Object obj3 = nQDE489uH.J4Ux7ym32;
                if (obj3 != l5RKcDF9F) {
                    oFzjsdJSX = oFzjsdJSX.J4Ux7ym32(nQDE489uH.J4Ux7ym32, new NQDE489uH(nQDE489uH.q3BipwRCk, ((NQDE489uH) oFzjsdJSX.get(obj3)).J4Ux7ym32));
                }
                Object obj4 = nQDE489uH.q3BipwRCk;
                if (!(obj4 != l5RKcDF9F)) {
                    obj = nQDE489uH.J4Ux7ym32;
                } else {
                    obj = x5xme9uif.CBQ5d1kRq;
                }
                if (nQDE489uH.J4Ux7ym32 != l5RKcDF9F) {
                    z = true;
                }
                if (z) {
                    obj4 = x5xme9uif.kmSgne1rO;
                }
                x5xme9uif = new x5Xme9UIF(obj, obj4, oFzjsdJSX);
            }
            if (zoDp2hPgc == x5xme9uif) {
                return;
            }
        } while (!((I5LF8ecws) v1N1H6iou).yWvV4ePLl(zoDp2hPgc, x5xme9uif));
    }

    public void q3BipwRCk(iFKnyAZAM ifknyazam) {
        V1N1H6iou v1N1H6iou;
        ZoDp2hPgc zoDp2hPgc;
        x5Xme9UIF x5xme9uif;
        do {
            v1N1H6iou = rQamjxEL9.MzoOEjc4X;
            zoDp2hPgc = (ZoDp2hPgc) ((I5LF8ecws) v1N1H6iou).Puu3Rhg4F();
            x5xme9uif = (x5Xme9UIF) zoDp2hPgc;
            if (!x5xme9uif.Bhmn1KIah.containsKey(ifknyazam)) {
                if (x5xme9uif.isEmpty()) {
                    x5xme9uif = new x5Xme9UIF(ifknyazam, ifknyazam, x5xme9uif.Bhmn1KIah.J4Ux7ym32(ifknyazam, new NQDE489uH()));
                } else {
                    Object obj = x5xme9uif.kmSgne1rO;
                    x5xme9uif = new x5Xme9UIF(x5xme9uif.CBQ5d1kRq, ifknyazam, x5xme9uif.Bhmn1KIah.J4Ux7ym32(obj, new NQDE489uH(((NQDE489uH) x5xme9uif.Bhmn1KIah.get(obj)).q3BipwRCk, ifknyazam)).J4Ux7ym32(ifknyazam, new NQDE489uH(obj)));
                }
            }
            if (zoDp2hPgc == x5xme9uif) {
                return;
            }
        } while (!((I5LF8ecws) v1N1H6iou).yWvV4ePLl(zoDp2hPgc, x5xme9uif));
    }

    public boolean tGV7Q6urW(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }
}
