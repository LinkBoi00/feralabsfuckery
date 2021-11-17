package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class sNJjL8iwQ implements xkFni34F4 {
    public final /* synthetic */ int q3BipwRCk;

    public sNJjL8iwQ(int i) {
        this.q3BipwRCk = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r7.equals("sql") == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r7.equals("pdb") == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r7.equals("mdb") == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r7.equals("dbf") == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r7.equals("db") == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r7.equals("pages") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        if (r7.equals("docx") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r7.equals("wps") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r7.equals("wpd") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r7.equals("txt") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
        if (r7.equals("tex") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        if (r7.equals("rtf") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
        if (r7.equals("odt") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r7.equals("msg") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (r7.equals("log") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (r7.equals("doc") == false) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r7.equals("accdb") == false) goto L_0x0059;
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
                case 0: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005c
        L_0x000c:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x0013
            goto L_0x005b
        L_0x0013:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 3198: goto L_0x0051;
                case 99240: goto L_0x0048;
                case 107947: goto L_0x003f;
                case 110830: goto L_0x0036;
                case 114126: goto L_0x002d;
                case 92629183: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0059
        L_0x0024:
            java.lang.String r0 = "accdb"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x0059
        L_0x002d:
            java.lang.String r0 = "sql"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x0059
        L_0x0036:
            java.lang.String r0 = "pdb"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x0059
        L_0x003f:
            java.lang.String r0 = "mdb"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x0059
        L_0x0048:
            java.lang.String r0 = "dbf"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x0059
        L_0x0051:
            java.lang.String r0 = "db"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
        L_0x0059:
            r1 = r4
        L_0x005a:
            r4 = r1
        L_0x005b:
            return r4
        L_0x005c:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x0064
            goto L_0x00da
        L_0x0064:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 99640: goto L_0x00d0;
                case 107332: goto L_0x00c7;
                case 108417: goto L_0x00be;
                case 109887: goto L_0x00b5;
                case 113252: goto L_0x00ac;
                case 114727: goto L_0x00a3;
                case 115312: goto L_0x009a;
                case 117931: goto L_0x0091;
                case 117946: goto L_0x0088;
                case 3088960: goto L_0x007f;
                case 106426308: goto L_0x0076;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x00d8
        L_0x0076:
            java.lang.String r0 = "pages"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x007f:
            java.lang.String r0 = "docx"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x0088:
            java.lang.String r0 = "wps"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x0091:
            java.lang.String r0 = "wpd"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x009a:
            java.lang.String r0 = "txt"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00a3:
            java.lang.String r0 = "tex"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00ac:
            java.lang.String r0 = "rtf"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00b5:
            java.lang.String r0 = "odt"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00be:
            java.lang.String r0 = "msg"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00c7:
            java.lang.String r0 = "log"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00d8
        L_0x00d0:
            java.lang.String r0 = "doc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d9
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            r4 = r1
        L_0x00da:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.sNJjL8iwQ.J4Ux7ym32(java.lang.String):boolean");
    }

    @Override // con.xkFni34F4
    public int q3BipwRCk() {
        return R.drawable.ic_unknown_file_picker;
    }
}
