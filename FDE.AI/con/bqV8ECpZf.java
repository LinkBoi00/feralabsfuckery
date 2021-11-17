package con;
/* loaded from: classes.dex */
public abstract class bqV8ECpZf {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final long J4Ux7ym32(java.lang.String r23, long r24, long r26, long r28) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: con.bqV8ECpZf.J4Ux7ym32(java.lang.String, long, long, long):long");
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
