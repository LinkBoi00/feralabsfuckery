package con;
/* loaded from: classes.dex */
public abstract class dBsFbrhJp implements Comparable {
    public static final JhpbRXxsg CBQ5d1kRq = new JhpbRXxsg(0);
    public static final float kmSgne1rO = Float.intBitsToFloat(1056964608);

    static {
        q3BipwRCk(1.0f);
        q3BipwRCk(-1.0f);
    }

    public static final float J4Ux7ym32(short s) {
        int i;
        int i2 = s & 65535;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 != 0) {
            i = i5 << 13;
            if (i4 == 31) {
                i6 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i6 = (i4 - 15) + 127;
            }
        } else if (i5 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - kmSgne1rO;
            return i3 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (i3 << 16) | (i6 << 23));
    }

    public static short q3BipwRCk(float f) {
        return CBQ5d1kRq.q3BipwRCk(f);
    }
}
