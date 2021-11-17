package con;
/* loaded from: classes.dex */
public final class xSTZH8Y9P {
    public static final xSTZH8Y9P q3BipwRCk = new xSTZH8Y9P();
    public static final xrlB614az J4Ux7ym32 = new PlNIrc9UM();
    public static final MEtaL9md5 tGV7Q6urW = new baKzNT0qM(1);
    public static final MEtaL9md5 dIocxURUo = new baKzNT0qM(0);
    public static final qRGoInHan kCA6Zs9sL = new Veb7CApqj(0);
    public static final qRGoInHan iiGwOFFnr = new Veb7CApqj(1);

    static {
        new Veb7CApqj(3);
        new Veb7CApqj(2);
    }

    public final void J4Ux7ym32(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                i2++;
                iArr2[i2] = i3;
                i3 += i4;
                i++;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                int i6 = iArr[length2];
                iArr2[length2] = i;
                i += i6;
                if (i5 >= 0) {
                    length2 = i5;
                } else {
                    return;
                }
            }
        }
    }

    public final void dIocxURUo(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float length = (iArr.length == 0) ^ true ? ((float) (i - i2)) / ((float) iArr.length) : 0.0f;
        float f = length / ((float) 2);
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = D3DEikrvb.Eeka1udhb(f);
                f += ((float) i5) + length;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                int i7 = iArr[length2];
                iArr2[length2] = D3DEikrvb.Eeka1udhb(f);
                f += ((float) i7) + length;
                if (i6 >= 0) {
                    length2 = i6;
                } else {
                    return;
                }
            }
        }
    }

    public final void iiGwOFFnr(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float length = ((float) (i - i2)) / ((float) (iArr.length + 1));
        if (!z) {
            float f = length;
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = D3DEikrvb.Eeka1udhb(f);
                f += ((float) i5) + length;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            float f2 = length;
            while (true) {
                int i6 = length2 - 1;
                int i7 = iArr[length2];
                iArr2[length2] = D3DEikrvb.Eeka1udhb(f2);
                f2 += ((float) i7) + length;
                if (i6 >= 0) {
                    length2 = i6;
                } else {
                    return;
                }
            }
        }
    }

    public final void kCA6Zs9sL(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float f = 0.0f;
        float length = iArr.length > 1 ? ((float) (i - i2)) / ((float) (iArr.length - 1)) : 0.0f;
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = D3DEikrvb.Eeka1udhb(f);
                f += ((float) i5) + length;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                int i7 = iArr[length2];
                iArr2[length2] = D3DEikrvb.Eeka1udhb(f);
                f += ((float) i7) + length;
                if (i6 >= 0) {
                    length2 = i6;
                } else {
                    return;
                }
            }
        }
    }

    public final void q3BipwRCk(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float f = ((float) (i - i2)) / ((float) 2);
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = D3DEikrvb.Eeka1udhb(f);
                f += (float) i5;
            }
            return;
        }
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i6 = length - 1;
                int i7 = iArr[length];
                iArr2[length] = D3DEikrvb.Eeka1udhb(f);
                f += (float) i7;
                if (i6 >= 0) {
                    length = i6;
                } else {
                    return;
                }
            }
        }
    }

    public final void tGV7Q6urW(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        int i4 = i - i2;
        if (!z) {
            int i5 = 0;
            for (int i6 : iArr) {
                i5++;
                iArr2[i5] = i4;
                i4 += i6;
            }
            return;
        }
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                int i8 = iArr[length];
                iArr2[length] = i4;
                i4 += i8;
                if (i7 >= 0) {
                    length = i7;
                } else {
                    return;
                }
            }
        }
    }
}
