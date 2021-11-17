package con;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class kFuaB4ofb {
    public boolean GPLPRo6go;
    public pLYbCSTk0 Puu3Rhg4F;
    public boolean dIocxURUo;
    public boolean iiGwOFFnr;
    public boolean kCA6Zs9sL;
    public final pLYbCSTk0 q3BipwRCk;
    public boolean tGV7Q6urW;
    public boolean J4Ux7ym32 = true;
    public final Map yWvV4ePLl = new HashMap();

    public kFuaB4ofb(pLYbCSTk0 plybcstk0) {
        this.q3BipwRCk = plybcstk0;
    }

    public static final void tGV7Q6urW(kFuaB4ofb kfuab4ofb, OGQYjfdsY oGQYjfdsY, int i, qhaZGYFO8 qhazgyfo8) {
        long dIocxURUo;
        loop0: while (true) {
            float f = (float) i;
            dIocxURUo = ODug2UCW1.dIocxURUo(f, f);
            do {
                dIocxURUo = qhazgyfo8.CMnfe2r2N(dIocxURUo);
                qhazgyfo8 = qhazgyfo8.ilHKhw3Yw;
                if (anXlDk6fV.tGV7Q6urW(qhazgyfo8, kfuab4ofb.q3BipwRCk.o4LF8RkoQ)) {
                    break loop0;
                }
            } while (!qhazgyfo8.R2hkbNqWf().contains(oGQYjfdsY));
            i = qhazgyfo8.i8XZMQc6Z(oGQYjfdsY);
        }
        int Eeka1udhb = D3DEikrvb.Eeka1udhb(oGQYjfdsY instanceof p65OI4RQQ ? bRgfgYIQX.dIocxURUo(dIocxURUo) : bRgfgYIQX.tGV7Q6urW(dIocxURUo));
        Map map = kfuab4ofb.yWvV4ePLl;
        if (map.containsKey(oGQYjfdsY)) {
            int intValue = ((Number) s0tSbdszx.nlGCs0NZs(kfuab4ofb.yWvV4ePLl, oGQYjfdsY)).intValue();
            p65OI4RQQ p65oi4rqq = gqrMNsZhs.q3BipwRCk;
            Eeka1udhb = ((Number) oGQYjfdsY.q3BipwRCk.WaUP0CF08(Integer.valueOf(intValue), Integer.valueOf(Eeka1udhb))).intValue();
        }
        map.put(oGQYjfdsY, Integer.valueOf(Eeka1udhb));
    }

    public final boolean J4Ux7ym32() {
        dIocxURUo();
        return this.Puu3Rhg4F != null;
    }

    public final void dIocxURUo() {
        kFuaB4ofb kfuab4ofb;
        kFuaB4ofb kfuab4ofb2;
        pLYbCSTk0 plybcstk0 = null;
        if (q3BipwRCk()) {
            plybcstk0 = this.q3BipwRCk;
        } else {
            pLYbCSTk0 oon79WMrY = this.q3BipwRCk.oon79WMrY();
            if (oon79WMrY != null) {
                pLYbCSTk0 plybcstk02 = oon79WMrY.qFBXIgpia.Puu3Rhg4F;
                if (plybcstk02 == null || !plybcstk02.qFBXIgpia.q3BipwRCk()) {
                    pLYbCSTk0 plybcstk03 = this.Puu3Rhg4F;
                    if (plybcstk03 != null && !plybcstk03.qFBXIgpia.q3BipwRCk()) {
                        pLYbCSTk0 oon79WMrY2 = plybcstk03.oon79WMrY();
                        if (!(oon79WMrY2 == null || (kfuab4ofb2 = oon79WMrY2.qFBXIgpia) == null)) {
                            kfuab4ofb2.dIocxURUo();
                        }
                        pLYbCSTk0 oon79WMrY3 = plybcstk03.oon79WMrY();
                        if (!(oon79WMrY3 == null || (kfuab4ofb = oon79WMrY3.qFBXIgpia) == null)) {
                            plybcstk0 = kfuab4ofb.Puu3Rhg4F;
                        }
                    } else {
                        return;
                    }
                } else {
                    plybcstk0 = plybcstk02;
                }
            } else {
                return;
            }
        }
        this.Puu3Rhg4F = plybcstk0;
    }

    public final boolean q3BipwRCk() {
        return this.tGV7Q6urW || this.kCA6Zs9sL || this.iiGwOFFnr || this.GPLPRo6go;
    }
}
