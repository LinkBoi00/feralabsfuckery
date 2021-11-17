package con;
/* loaded from: classes.dex */
public abstract class PhWyMtRZm {
    public static final int[] q3BipwRCk = new int[0];
    public static final long[] J4Ux7ym32 = new long[0];
    public static final Object[] tGV7Q6urW = new Object[0];

    public static int J4Ux7ym32(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static int dIocxURUo(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public static int iiGwOFFnr(int i) {
        return dIocxURUo(i * 8) / 8;
    }

    public static int kCA6Zs9sL(int i) {
        return dIocxURUo(i * 4) / 4;
    }

    public static int q3BipwRCk(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static boolean tGV7Q6urW(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
