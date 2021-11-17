package con;
/* loaded from: classes.dex */
public final class K5PjwoFCN {
    public final long q3BipwRCk;
    public static final joOFKdxvJ J4Ux7ym32 = new joOFKdxvJ(0);
    public static final int[] tGV7Q6urW = {18, 20, 17, 15};
    public static final int[] dIocxURUo = {65535, 262143, 32767, 8191};
    public static final int[] kCA6Zs9sL = {32767, 8191, 65535, 262143};

    public /* synthetic */ K5PjwoFCN(long j) {
        this.q3BipwRCk = j;
    }

    public static String CBQ5d1kRq(long j) {
        int yWvV4ePLl = yWvV4ePLl(j);
        String str = "Infinity";
        String valueOf = yWvV4ePLl == Integer.MAX_VALUE ? str : String.valueOf(yWvV4ePLl);
        int Puu3Rhg4F = Puu3Rhg4F(j);
        if (Puu3Rhg4F != Integer.MAX_VALUE) {
            str = String.valueOf(Puu3Rhg4F);
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Constraints(minWidth = ");
        q3BipwRCk.append(vPSbyrYWX(j));
        q3BipwRCk.append(", maxWidth = ");
        q3BipwRCk.append(valueOf);
        q3BipwRCk.append(", minHeight = ");
        q3BipwRCk.append(oon79WMrY(j));
        q3BipwRCk.append(", maxHeight = ");
        q3BipwRCk.append(str);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public static final boolean GPLPRo6go(long j) {
        return yWvV4ePLl(j) == vPSbyrYWX(j);
    }

    public static final boolean J4Ux7ym32(long j, long j2) {
        return j == j2;
    }

    public static final int Puu3Rhg4F(long j) {
        int tGV7Q6urW2 = tGV7Q6urW(j);
        int i = ((int) (j >> (tGV7Q6urW[tGV7Q6urW2] + 31))) & kCA6Zs9sL[tGV7Q6urW2];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final boolean dIocxURUo(long j) {
        int tGV7Q6urW2 = tGV7Q6urW(j);
        return (((int) (j >> (tGV7Q6urW[tGV7Q6urW2] + 31))) & kCA6Zs9sL[tGV7Q6urW2]) != 0;
    }

    public static final boolean iiGwOFFnr(long j) {
        return Puu3Rhg4F(j) == oon79WMrY(j);
    }

    public static final boolean kCA6Zs9sL(long j) {
        return (((int) (j >> 33)) & dIocxURUo[tGV7Q6urW(j)]) != 0;
    }

    public static final int oon79WMrY(long j) {
        int tGV7Q6urW2 = tGV7Q6urW(j);
        return ((int) (j >> tGV7Q6urW[tGV7Q6urW2])) & kCA6Zs9sL[tGV7Q6urW2];
    }

    public static long q3BipwRCk(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = vPSbyrYWX(j);
        }
        if ((i5 & 2) != 0) {
            i2 = yWvV4ePLl(j);
        }
        if ((i5 & 4) != 0) {
            i3 = oon79WMrY(j);
        }
        if ((i5 & 8) != 0) {
            i4 = Puu3Rhg4F(j);
        }
        boolean z = false;
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    return J4Ux7ym32.tGV7Q6urW(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    public static final int tGV7Q6urW(long j) {
        return (int) (j & 3);
    }

    public static final int vPSbyrYWX(long j) {
        return ((int) (j >> 2)) & dIocxURUo[tGV7Q6urW(j)];
    }

    public static final int yWvV4ePLl(long j) {
        int i = ((int) (j >> 33)) & dIocxURUo[tGV7Q6urW(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof K5PjwoFCN) && j == ((K5PjwoFCN) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return CBQ5d1kRq(this.q3BipwRCk);
    }
}
