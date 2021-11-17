package con;
/* loaded from: classes.dex */
public abstract class bqV8ECpZf {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final long J4Ux7ym32(String str, long j, long j2, long j3) {
        Long l;
        int i;
        int i2;
        int i3;
        String tGV7Q6urW = tGV7Q6urW(str);
        if (tGV7Q6urW == null) {
            return j;
        }
        idpM54xlp.J4Ux7ym32(10);
        int length = tGV7Q6urW.length();
        if (length != 0) {
            char charAt = tGV7Q6urW.charAt(0);
            long j4 = -9223372036854775807L;
            if (anXlDk6fV.oon79WMrY(charAt, 48) >= 0) {
                i2 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    j4 = Long.MIN_VALUE;
                    i2 = 1;
                } else if (charAt == '+') {
                    i = 0;
                    i2 = 1;
                    long j5 = 0;
                    long j6 = -256204778801521550L;
                    while (i2 < length) {
                        int digit = Character.digit((int) tGV7Q6urW.charAt(i2), 10);
                        if (digit >= 0) {
                            if (j5 >= j6) {
                                i3 = i2;
                            } else if (j6 == -256204778801521550L) {
                                i3 = i2;
                                j6 = j4 / ((long) 10);
                                if (j5 < j6) {
                                }
                            }
                            long j7 = j5 * ((long) 10);
                            long j8 = (long) digit;
                            if (j7 >= j4 + j8) {
                                j5 = j7 - j8;
                                i2 = i3 + 1;
                            }
                        }
                    }
                    l = i == 0 ? Long.valueOf(j5) : Long.valueOf(-j5);
                    if (l != null) {
                        long longValue = l.longValue();
                        if (j2 <= longValue && longValue <= j3) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
                    }
                    throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + tGV7Q6urW + '\'').toString());
                }
            }
            i = i2;
            long j52 = 0;
            long j62 = -256204778801521550L;
            while (i2 < length) {
            }
            if (i == 0) {
            }
            if (l != null) {
            }
        }
        l = null;
        if (l != null) {
        }
    }

    public static int dIocxURUo(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) J4Ux7ym32(str, (long) i, (long) i2, (long) i3);
    }

    public static /* synthetic */ long kCA6Zs9sL(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return J4Ux7ym32(str, j, j2, j3);
    }

    public static final byte q3BipwRCk(char c) {
        if (c < '~') {
            return GabIU2lD1.tGV7Q6urW[c];
        }
        return 0;
    }

    public static final String tGV7Q6urW(String str) {
        int i = iG7KBFGGv.q3BipwRCk;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
