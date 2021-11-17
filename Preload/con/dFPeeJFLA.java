package con;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class dFPeeJFLA implements c80AgRIEf {
    public static final ksLrMHgEz dIocxURUo = new ksLrMHgEz(null, 9);
    public static final B6IRYLW14 kCA6Zs9sL;
    public final Map J4Ux7ym32;
    public final Map q3BipwRCk;
    public dVtF46MWK tGV7Q6urW;

    static {
        ncKm8DzZ7 nckm8dzz7 = ncKm8DzZ7.WaUP0CF08;
        AdUPdUuqH adUPdUuqH = AdUPdUuqH.WaUP0CF08;
        B6IRYLW14 b6irylw14 = IaRtW3OEX.q3BipwRCk;
        kCA6Zs9sL = new B6IRYLW14(nckm8dzz7, adUPdUuqH);
    }

    public dFPeeJFLA(Map map) {
        this.q3BipwRCk = map;
        this.J4Ux7ym32 = new LinkedHashMap();
    }

    public dFPeeJFLA(Map map, int i) {
        this.q3BipwRCk = (i & 1) != 0 ? new LinkedHashMap() : null;
        this.J4Ux7ym32 = new LinkedHashMap();
    }

    public void q3BipwRCk(Object obj, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i) {
        boolean z;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-111644091);
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.zHl31GGXU(-1530021272);
        if (wpxpbwg1j.CpG0imbht.iiGwOFFnr() == 207 && !anXlDk6fV.tGV7Q6urW(wpxpbwg1j.CpG0imbht.kCA6Zs9sL(), obj) && wpxpbwg1j.i8XZMQc6Z < 0) {
            wpxpbwg1j.i8XZMQc6Z = wpxpbwg1j.CpG0imbht.iiGwOFFnr;
            wpxpbwg1j.WaUP0CF08 = true;
        }
        wpxpbwg1j.EBQXiIPmm(207, null, false, obj);
        wpxpbwg1j.zHl31GGXU(1516495192);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i2 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            dVtF46MWK dvtf46mwk = this.tGV7Q6urW;
            if (dvtf46mwk == null) {
                z = true;
            } else {
                z = dvtf46mwk.q3BipwRCk(obj);
            }
            if (z) {
                dfpT1j18n = new pcNffwfgD(this, obj);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        pcNffwfgD pcnffwfgd = (pcNffwfgD) dfpT1j18n;
        u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{cAJLJrM2D.q3BipwRCk.J4Ux7ym32(pcnffwfgd.J4Ux7ym32)}, kkcqgcx5g, wpxpbwg1j, (i & 112) | 8);
        gLDxq5bwv.q3BipwRCk(qih4lW99W.q3BipwRCk, new ZcRbhWzZ1(this, obj, pcnffwfgd), wpxpbwg1j);
        wpxpbwg1j.ilHKhw3Yw(false);
        if (wpxpbwg1j.WaUP0CF08 && wpxpbwg1j.CpG0imbht.Puu3Rhg4F == wpxpbwg1j.i8XZMQc6Z) {
            wpxpbwg1j.i8XZMQc6Z = -1;
            wpxpbwg1j.WaUP0CF08 = false;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        wpxpbwg1j.ilHKhw3Yw(false);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new XrPnW080C(this, obj, kkcqgcx5g, i);
        }
    }
}
