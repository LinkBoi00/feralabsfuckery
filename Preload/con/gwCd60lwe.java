package con;

import java.util.List;
/* loaded from: classes.dex */
public final class gwCd60lwe extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwCd60lwe(W3r8jsmHE w3r8jsmHE, EuSwp7OG7 euSwp7OG7, List list) {
        super(3);
        this.Bhmn1KIah = w3r8jsmHE;
        this.PSTqBLTET = euSwp7OG7;
        this.MzoOEjc4X = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r3 == con.P7Re99G8L.J4Ux7ym32) goto L_0x008a;
     */
    /* JADX WARN: Finally extract failed */
    @Override // con.NzvP5Rex8
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        int i = 0;
        switch (this.kmSgne1rO) {
            case 0:
                GX14exZ1F gX14exZ1F = (GX14exZ1F) obj;
                ZVqfObOve zVqfObOve = (ZVqfObOve) obj2;
                gl0eeduiq gl0eeduiq = (gl0eeduiq) obj3;
                List list = (List) this.MzoOEjc4X;
                ZVqfObOve kCA6Zs9sL = ((W3r8jsmHE) this.Bhmn1KIah).kCA6Zs9sL();
                try {
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = i + 1;
                            ((NzvP5Rex8) list.get(i)).sk5s77z6Q(gX14exZ1F, kCA6Zs9sL, gl0eeduiq);
                            if (i2 <= size) {
                                i = i2;
                            }
                        }
                    }
                    kCA6Zs9sL.iiGwOFFnr();
                    zVqfObOve.kCA6Zs9sL();
                    W3r8jsmHE w3r8jsmHE = (W3r8jsmHE) this.Bhmn1KIah;
                    zVqfObOve.ixWaw2akD(w3r8jsmHE, ((EuSwp7OG7) this.PSTqBLTET).J4Ux7ym32(w3r8jsmHE));
                    zVqfObOve.CBQ5d1kRq();
                    return qih4lW99W.q3BipwRCk;
                } catch (Throwable th) {
                    kCA6Zs9sL.iiGwOFFnr();
                    throw th;
                }
            default:
                BgIsSUB3d bgIsSUB3d = (BgIsSUB3d) obj;
                ((Number) obj3).intValue();
                wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) ((rJ0s9PfCL) obj2);
                wpxpbwg1j.zHl31GGXU(674422814);
                Object obj4 = G7WvUK4mQ.q3BipwRCk;
                AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
                wpxpbwg1j.zHl31GGXU(-3686930);
                boolean iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(aU29aHa4X);
                Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr) {
                    int i3 = rJ0s9PfCL.q3BipwRCk;
                    break;
                }
                dfpT1j18n = new ztvmwA530(fckny70t9, aU29aHa4X);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                wpxpbwg1j.ilHKhw3Yw(false);
                ztvmwA530 ztvmwa530 = (ztvmwA530) dfpT1j18n;
                gLDxq5bwv.dIocxURUo(bgIsSUB3d, this.Bhmn1KIah, this.PSTqBLTET, new wA2rY4bnw(ztvmwa530, (kkcQgCx5G) this.MzoOEjc4X, null), wpxpbwg1j);
                wpxpbwg1j.ilHKhw3Yw(false);
                return ztvmwa530;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwCd60lwe(Object obj, Object obj2, kkcQgCx5G kkcqgcx5g) {
        super(3);
        this.Bhmn1KIah = obj;
        this.PSTqBLTET = obj2;
        this.MzoOEjc4X = kkcqgcx5g;
    }
}
