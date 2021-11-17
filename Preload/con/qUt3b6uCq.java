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
    public boolean J4Ux7ym32(String str) {
        boolean z = true;
        switch (this.q3BipwRCk) {
            case 0:
                if (!r6NbD4wnj.mUqPm6GBh(str, ".", false, 2)) {
                    return false;
                }
                String substring = str.substring(r6NbD4wnj.juJ6pnCpu(str, ".", 0, false, 6) + 1);
                switch (substring.hashCode()) {
                    case -880960548:
                        break;
                    case 1827:
                        break;
                    case 3315:
                        break;
                    case 96857:
                        break;
                    case 104581:
                        break;
                    case 112675:
                        break;
                    case 114636:
                        break;
                    case 114791:
                        break;
                    case 120609:
                        break;
                    case 3553766:
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
                int hashCode = substring2.hashCode();
                if (hashCode == 110817 ? !substring2.equals("pct") : !(hashCode == 110834 ? substring2.equals("pdf") : hashCode == 3227675 && substring2.equals("idnn"))) {
                    z = false;
                }
                return z;
        }
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
