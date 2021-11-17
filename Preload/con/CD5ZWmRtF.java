package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class CD5ZWmRtF implements xkFni34F4 {
    public final /* synthetic */ int q3BipwRCk;

    public CD5ZWmRtF(int i) {
        this.q3BipwRCk = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r7.equals("alac") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r7.equals("wma") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r7.equals("wav") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r7.equals("ogg") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r7.equals("mpa") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r7.equals("mp3") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r7.equals("mid") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r7.equals("m4a") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r7.equals("m3u") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r7.equals("iff") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r7.equals("ape") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r7.equals("aif") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r7.equals("ttf") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r7.equals("otf") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
        if (r7.equals("fon") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (r7.equals("fnt") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r7.equals("flac") == false) goto L_0x009d;
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
                    case 96574:
                        break;
                    case 96790:
                        break;
                    case 104169:
                        break;
                    case 106447:
                        break;
                    case 106458:
                        break;
                    case 108104:
                        break;
                    case 108272:
                        break;
                    case 108318:
                        break;
                    case 109967:
                        break;
                    case 117484:
                        break;
                    case 117835:
                        break;
                    case 2996621:
                        break;
                    case 3145576:
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
                    case 101548:
                        break;
                    case 101573:
                        break;
                    case 110369:
                        break;
                    case 115174:
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
        switch (this.q3BipwRCk) {
            case 0:
                return R.drawable.ic_music_file_picker;
            default:
                return R.drawable.ic_unknown_file_picker;
        }
    }
}
