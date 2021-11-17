package con;

import java.util.Map;
/* loaded from: classes.dex */
public final class xHCS6bK6v implements KqzoSSpJV {
    public final int J4Ux7ym32;
    public jOCYbBWA4 dIocxURUo;
    public final Map q3BipwRCk;
    public jOCYbBWA4 tGV7Q6urW;

    public xHCS6bK6v(Map map, int i, int i2) {
        this.q3BipwRCk = map;
        this.J4Ux7ym32 = i;
    }

    @Override // con.bfRmVSaJr
    public long GPLPRo6go(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return ((long) (this.J4Ux7ym32 + 0)) * 1000000;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 J4Ux7ym32(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        long J4Ux7ym32 = syekKyXqd.J4Ux7ym32(this, j / 1000000);
        if (J4Ux7ym32 <= 0) {
            return jocybbwa43;
        }
        jOCYbBWA4 kCA6Zs9sL = kCA6Zs9sL((J4Ux7ym32 - 1) * 1000000, jocybbwa4, jocybbwa42, jocybbwa43);
        jOCYbBWA4 kCA6Zs9sL2 = kCA6Zs9sL(J4Ux7ym32 * 1000000, jocybbwa4, jocybbwa42, jocybbwa43);
        if (this.tGV7Q6urW == null) {
            this.tGV7Q6urW = jocybbwa4.tGV7Q6urW();
            this.dIocxURUo = jocybbwa4.tGV7Q6urW();
        }
        int i = 0;
        int J4Ux7ym322 = kCA6Zs9sL.J4Ux7ym32();
        if (J4Ux7ym322 > 0) {
            while (true) {
                int i2 = i + 1;
                jOCYbBWA4 jocybbwa44 = this.dIocxURUo;
                if (jocybbwa44 == null) {
                    jocybbwa44 = null;
                }
                jocybbwa44.kCA6Zs9sL(i, (kCA6Zs9sL.q3BipwRCk(i) - kCA6Zs9sL2.q3BipwRCk(i)) * 1000.0f);
                if (i2 >= J4Ux7ym322) {
                    break;
                }
                i = i2;
            }
        }
        jOCYbBWA4 jocybbwa45 = this.dIocxURUo;
        if (jocybbwa45 == null) {
            return null;
        }
        return jocybbwa45;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 dIocxURUo(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return J4Ux7ym32(((long) (this.J4Ux7ym32 + 0)) * 1000000, jocybbwa4, jocybbwa42, jocybbwa43);
    }

    @Override // con.KqzoSSpJV
    public int iiGwOFFnr() {
        return 0;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 kCA6Zs9sL(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        int J4Ux7ym32 = (int) syekKyXqd.J4Ux7ym32(this, j / 1000000);
        if (this.q3BipwRCk.containsKey(Integer.valueOf(J4Ux7ym32))) {
            return (jOCYbBWA4) ((n4f84B5OG) s0tSbdszx.nlGCs0NZs(this.q3BipwRCk, Integer.valueOf(J4Ux7ym32))).CBQ5d1kRq;
        }
        int i = this.J4Ux7ym32;
        if (J4Ux7ym32 >= i) {
            return jocybbwa42;
        }
        if (J4Ux7ym32 <= 0) {
            return jocybbwa4;
        }
        lOtvezK70 lotvezk70 = TqRcaVEga.q3BipwRCk;
        lOtvezK70 lotvezk702 = XP8g1cdgt.q3BipwRCk;
        int i2 = 0;
        jOCYbBWA4 jocybbwa44 = jocybbwa4;
        int i3 = 0;
        for (Map.Entry entry : this.q3BipwRCk.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            n4f84B5OG n4f84b5og = (n4f84B5OG) entry.getValue();
            if (J4Ux7ym32 > intValue && intValue >= i3) {
                jocybbwa44 = (jOCYbBWA4) n4f84b5og.CBQ5d1kRq;
                lotvezk702 = (lOtvezK70) n4f84b5og.kmSgne1rO;
                i3 = intValue;
            } else if (J4Ux7ym32 < intValue && intValue <= i) {
                jocybbwa42 = (jOCYbBWA4) n4f84b5og.CBQ5d1kRq;
                i = intValue;
            }
        }
        float q3BipwRCk = lotvezk702.q3BipwRCk(((float) (J4Ux7ym32 - i3)) / ((float) (i - i3)));
        if (this.tGV7Q6urW == null) {
            this.tGV7Q6urW = jocybbwa4.tGV7Q6urW();
            this.dIocxURUo = jocybbwa4.tGV7Q6urW();
        }
        int J4Ux7ym322 = jocybbwa44.J4Ux7ym32();
        if (J4Ux7ym322 > 0) {
            while (true) {
                int i4 = i2 + 1;
                jOCYbBWA4 jocybbwa45 = this.tGV7Q6urW;
                if (jocybbwa45 == null) {
                    jocybbwa45 = null;
                }
                float q3BipwRCk2 = jocybbwa44.q3BipwRCk(i2);
                float q3BipwRCk3 = jocybbwa42.q3BipwRCk(i2);
                aVKpYNINy avkpyniny = NvSSsPAuJ.q3BipwRCk;
                jocybbwa45.kCA6Zs9sL(i2, (q3BipwRCk3 * q3BipwRCk) + ((((float) 1) - q3BipwRCk) * q3BipwRCk2));
                if (i4 >= J4Ux7ym322) {
                    break;
                }
                i2 = i4;
            }
        }
        jOCYbBWA4 jocybbwa46 = this.tGV7Q6urW;
        if (jocybbwa46 == null) {
            return null;
        }
        return jocybbwa46;
    }

    @Override // con.bfRmVSaJr
    public boolean q3BipwRCk() {
        return false;
    }

    @Override // con.KqzoSSpJV
    public int tGV7Q6urW() {
        return this.J4Ux7ym32;
    }
}
