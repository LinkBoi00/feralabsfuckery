package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class qUt3b6uCq implements xkFni34F4 {
    public final /* synthetic */ int q3BipwRCk;

    public qUt3b6uCq(int i) {
        this.q3BipwRCk = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r7.equals("zip") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r7.equals("tgz") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r7.equals("tbz") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r7.equals("rar") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r7.equals("iso") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r7.equals("arj") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r7.equals("gz") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r7.equals("7z") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r7.equals("tar.gz") == false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r7.equals("tbz2") == false) goto L_0x007f;
     */
    @Override // con.xkFni34F4
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean J4Ux7ym32(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r6.q3BipwRCk
            r1 = 1
            r2 = 6
            r3 = 2
            r4 = 0
            java.lang.String r5 = "."
            switch(r0) {
                case 0: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0082
        L_0x000d:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0081
        L_0x0015:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case -880960548: goto L_0x0077;
                case 1827: goto L_0x006e;
                case 3315: goto L_0x0065;
                case 96857: goto L_0x005c;
                case 104581: goto L_0x0053;
                case 112675: goto L_0x004a;
                case 114636: goto L_0x0041;
                case 114791: goto L_0x0038;
                case 120609: goto L_0x002f;
                case 3553766: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x007f
        L_0x0026:
            java.lang.String r0 = "tbz2"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x002f:
            java.lang.String r0 = "zip"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0038:
            java.lang.String r0 = "tgz"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0041:
            java.lang.String r0 = "tbz"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x004a:
            java.lang.String r0 = "rar"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0053:
            java.lang.String r0 = "iso"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x005c:
            java.lang.String r0 = "arj"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0065:
            java.lang.String r0 = "gz"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x006e:
            java.lang.String r0 = "7z"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0077:
            java.lang.String r0 = "tar.gz"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            r4 = r1
        L_0x0081:
            return r4
        L_0x0082:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x0089
            goto L_0x00c2
        L_0x0089:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            r2 = 110817(0x1b0e1, float:1.55288E-40)
            if (r0 == r2) goto L_0x00b8
            r2 = 110834(0x1b0f2, float:1.55312E-40)
            if (r0 == r2) goto L_0x00af
            r2 = 3227675(0x31401b, float:4.522936E-39)
            if (r0 == r2) goto L_0x00a6
            goto L_0x00c0
        L_0x00a6:
            java.lang.String r0 = "idnn"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00c1
            goto L_0x00c0
        L_0x00af:
            java.lang.String r0 = "pdf"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00c1
            goto L_0x00c0
        L_0x00b8:
            java.lang.String r0 = "pct"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00c1
        L_0x00c0:
            r1 = r4
        L_0x00c1:
            r4 = r1
        L_0x00c2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qUt3b6uCq.J4Ux7ym32(java.lang.String):boolean");
    }

    @Override // con.xkFni34F4
    public int q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                return R.drawable.ic_compressed_file_picker;
            default:
                return R.drawable.ic_pdf_file_picker;
        }
    }
}
