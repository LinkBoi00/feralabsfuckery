package con;
/* loaded from: classes.dex */
public final class R1zyWYdFl extends Xqme2uw0r {
    public static R1zyWYdFl tGV7Q6urW;

    public R1zyWYdFl(dnBSj5uJN dnbsj5ujn) {
    }

    public final boolean GPLPRo6go(int i) {
        return dIocxURUo().charAt(i) != '\n' && (i == 0 || dIocxURUo().charAt(i - 1) == '\n');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // con.JHsfNVnhw
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] J4Ux7ym32(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.dIocxURUo()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L_0x000c
            return r1
        L_0x000c:
            if (r4 > 0) goto L_0x000f
            return r1
        L_0x000f:
            if (r4 <= r0) goto L_0x0012
            r4 = r0
        L_0x0012:
            if (r4 <= 0) goto L_0x002b
            java.lang.String r0 = r3.dIocxURUo()
            int r2 = r4 + -1
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 != r2) goto L_0x002b
            boolean r0 = r3.iiGwOFFnr(r4)
            if (r0 != 0) goto L_0x002b
            int r4 = r4 + -1
            goto L_0x0012
        L_0x002b:
            if (r4 > 0) goto L_0x002e
            return r1
        L_0x002e:
            int r0 = r4 + -1
        L_0x0030:
            if (r0 <= 0) goto L_0x003b
            boolean r1 = r3.GPLPRo6go(r0)
            if (r1 != 0) goto L_0x003b
            int r0 = r0 + -1
            goto L_0x0030
        L_0x003b:
            int[] r4 = r3.tGV7Q6urW(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.R1zyWYdFl.J4Ux7ym32(int):int[]");
    }

    public final boolean iiGwOFFnr(int i) {
        return i > 0 && dIocxURUo().charAt(i + -1) != '\n' && (i == dIocxURUo().length() || dIocxURUo().charAt(i) == '\n');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // con.JHsfNVnhw
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] q3BipwRCk(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.dIocxURUo()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L_0x000c
            return r1
        L_0x000c:
            if (r5 < r0) goto L_0x000f
            return r1
        L_0x000f:
            if (r5 >= 0) goto L_0x0012
            r5 = 0
        L_0x0012:
            if (r5 >= r0) goto L_0x0029
            java.lang.String r2 = r4.dIocxURUo()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L_0x0029
            boolean r2 = r4.GPLPRo6go(r5)
            if (r2 != 0) goto L_0x0029
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0029:
            if (r5 < r0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r5 + 1
        L_0x002e:
            if (r1 >= r0) goto L_0x0039
            boolean r2 = r4.iiGwOFFnr(r1)
            if (r2 != 0) goto L_0x0039
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0039:
            int[] r5 = r4.tGV7Q6urW(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: con.R1zyWYdFl.q3BipwRCk(int):int[]");
    }
}
