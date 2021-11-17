package con;
/* loaded from: classes.dex */
public final class JhpbRXxsg implements L9RuSJz5i {
    public JhpbRXxsg(int i) {
    }

    public int J4Ux7ym32(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public short q3BipwRCk(float f) {
        int i;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = floatToRawIntBits & 8388607;
        int i5 = 0;
        if (i3 == 255) {
            if (i4 != 0) {
                i5 = 512;
            }
            i5 = 31;
        } else {
            int i6 = (i3 - 127) + 15;
            if (i6 >= 31) {
                i5 = 49;
                i5 = 0;
            } else if (i6 > 0) {
                int i7 = i4 >> 13;
                if ((i4 & 4096) != 0) {
                    i = (((i6 << 10) | i7) + 1) | (i2 << 15);
                    return (short) i;
                }
                i5 = i7;
                i5 = i6;
            } else if (i6 < -10) {
                i5 = 0;
            } else {
                int i8 = (i4 | 8388608) >> (1 - i6);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i5 = i8 >> 13;
            }
        }
        i = i5 | (i2 << 15) | (i5 << 10);
        return (short) i;
    }

    public int tGV7Q6urW(m0AevvDOv m0aevvdov, int i) {
        return J4Ux7ym32(m0aevvdov.compareTo(FeKFMR1ai.tGV7Q6urW) >= 0, JI2JIz7iN.q3BipwRCk(i, 1));
    }
}
