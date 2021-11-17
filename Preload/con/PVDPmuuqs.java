package con;
/* loaded from: classes.dex */
public abstract class PVDPmuuqs {
    public static xheEapSkC J4Ux7ym32;
    public static boolean q3BipwRCk;
    public static NWj29W5je tGV7Q6urW;

    public static synchronized xheEapSkC J4Ux7ym32() {
        xheEapSkC xheeapskc;
        synchronized (PVDPmuuqs.class) {
            xheEapSkC xheeapskc2 = J4Ux7ym32;
            if (xheeapskc2 != null && xheeapskc2.CBQ5d1kRq < 0) {
                J4Ux7ym32 = null;
            }
            xheeapskc = J4Ux7ym32;
        }
        return xheeapskc;
    }

    public static synchronized xheEapSkC q3BipwRCk() {
        xheEapSkC J4Ux7ym322;
        synchronized (PVDPmuuqs.class) {
            J4Ux7ym322 = J4Ux7ym32();
            if (J4Ux7ym322 == null) {
                q3BipwRCk = true;
                if (tGV7Q6urW == null) {
                    tGV7Q6urW = new NWj29W5je();
                }
                J4Ux7ym322 = tGV7Q6urW.q3BipwRCk();
                q3BipwRCk = false;
            }
        }
        return J4Ux7ym322;
    }
}
