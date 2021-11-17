package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class QcsmVOjjR implements xkFni34F4 {
    @Override // con.xkFni34F4
    public boolean J4Ux7ym32(String str) {
        if (!r6NbD4wnj.mUqPm6GBh(str, ".", false, 2)) {
            return false;
        }
        String substring = str.substring(r6NbD4wnj.juJ6pnCpu(str, ".", 0, false, 6) + 1);
        switch (substring.hashCode()) {
            case 3711:
                if (!substring.equals("ts")) {
                    return false;
                }
                break;
            case 52254:
                if (!substring.equals("3g2")) {
                    return false;
                }
                break;
            case 52316:
                if (!substring.equals("3gp")) {
                    return false;
                }
                break;
            case 96980:
                if (!substring.equals("avi")) {
                    return false;
                }
                break;
            case 101488:
                if (!substring.equals("flv")) {
                    return false;
                }
                break;
            case 106479:
                if (!substring.equals("m4v")) {
                    return false;
                }
                break;
            case 108184:
                if (!substring.equals("mkv")) {
                    return false;
                }
                break;
            case 108273:
                if (!substring.equals("mp4")) {
                    return false;
                }
                break;
            case 108308:
                if (!substring.equals("mov")) {
                    return false;
                }
                break;
            case 108324:
                if (!substring.equals("mpg")) {
                    return false;
                }
                break;
            case 114306:
                if (!substring.equals("swf")) {
                    return false;
                }
                break;
            case 116937:
                if (!substring.equals("vob")) {
                    return false;
                }
                break;
            case 117856:
                if (!substring.equals("wmv")) {
                    return false;
                }
                break;
            case 1621908:
                if (!substring.equals("3gpp")) {
                    return false;
                }
                break;
            case 3358085:
                if (!substring.equals("mpeg")) {
                    return false;
                }
                break;
            case 3645337:
                if (!substring.equals("webm")) {
                    return false;
                }
                break;
            case 50279198:
                if (!substring.equals("3gpp2")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    @Override // con.xkFni34F4
    public int q3BipwRCk() {
        return R.drawable.ic_video_file_picker;
    }
}
