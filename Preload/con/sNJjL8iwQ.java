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
    public boolean J4Ux7ym32(String str) {
        boolean z = true;
        switch (this.q3BipwRCk) {
            case 0:
                if (!r6NbD4wnj.mUqPm6GBh(str, ".", false, 2)) {
                    return false;
                }
                String substring = str.substring(r6NbD4wnj.juJ6pnCpu(str, ".", 0, false, 6) + 1);
                switch (substring.hashCode()) {
                    case 3198:
                        break;
                    case 99240:
                        break;
                    case 107947:
                        break;
                    case 110830:
                        break;
                    case 114126:
                        break;
                    case 92629183:
                        break;
                    default:
                        z = false;
                        break;
                }
                return z;
            default:
                if (!r6NbD4wnj.mUqPm6GBh(str, ".", false, 2)) {
                    return false;
                }
                String substring2 = str.substring(r6NbD4wnj.juJ6pnCpu(str, ".", 0, false, 6) + 1);
                switch (substring2.hashCode()) {
                    case 99640:
                        break;
                    case 107332:
                        break;
                    case 108417:
                        break;
                    case 109887:
                        break;
                    case 113252:
                        break;
                    case 114727:
                        break;
                    case 115312:
                        break;
                    case 117931:
                        break;
                    case 117946:
                        break;
                    case 3088960:
                        break;
                    case 106426308:
                        break;
                    default:
                        z = false;
                        break;
                }
                return z;
        }
    }

    @Override // con.xkFni34F4
    public int q3BipwRCk() {
        return R.drawable.ic_unknown_file_picker;
    }
}
