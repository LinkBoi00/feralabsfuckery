package con;
/* loaded from: classes.dex */
public abstract class cT9gik1zL {
    public static final Comparable GPLPRo6go(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else if (comparable2.compareTo(comparable3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
        } else if (comparable.compareTo(comparable2) < 0) {
            return comparable2;
        } else {
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static final long J4Ux7ym32(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final DoyxeIIWl Puu3Rhg4F(DoyxeIIWl doyxeIIWl, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = doyxeIIWl.CBQ5d1kRq;
            int i3 = doyxeIIWl.kmSgne1rO;
            if (doyxeIIWl.Bhmn1KIah <= 0) {
                i = -i;
            }
            return new DoyxeIIWl(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final float dIocxURUo(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final long iiGwOFFnr(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final int kCA6Zs9sL(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final float q3BipwRCk(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final double tGV7Q6urW(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final G8ebKyy85 yWvV4ePLl(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new G8ebKyy85(i, i2 - 1);
        }
        Q4TFMtvSV q4TFMtvSV = G8ebKyy85.MzoOEjc4X;
        return G8ebKyy85.PSTqBLTET;
    }
}
