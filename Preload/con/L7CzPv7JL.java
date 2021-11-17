package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class L7CzPv7JL implements xkFni34F4 {
    @Override // con.xkFni34F4
    public boolean J4Ux7ym32(String str) {
        if (!r6NbD4wnj.mUqPm6GBh(str, ".", false, 2)) {
            return false;
        }
        String substring = str.substring(r6NbD4wnj.juJ6pnCpu(str, ".", 0, false, 6) + 1);
        switch (substring.hashCode()) {
            case -83251538:
                if (!substring.equals("pspimage")) {
                    return false;
                }
                break;
            case 97669:
                if (!substring.equals("bmp")) {
                    return false;
                }
                break;
            case 99315:
                if (!substring.equals("dds")) {
                    return false;
                }
                break;
            case 102340:
                if (!substring.equals("gif")) {
                    return false;
                }
                break;
            case 105441:
                if (!substring.equals("jpg")) {
                    return false;
                }
                break;
            case 111145:
                if (!substring.equals("png")) {
                    return false;
                }
                break;
            case 111297:
                if (!substring.equals("psd")) {
                    return false;
                }
                break;
            case 114766:
                if (!substring.equals("tga")) {
                    return false;
                }
                break;
            case 114809:
                if (!substring.equals("thm")) {
                    return false;
                }
                break;
            case 114833:
                if (!substring.equals("tif")) {
                    return false;
                }
                break;
            case 120026:
                if (!substring.equals("yuv")) {
                    return false;
                }
                break;
            case 3268712:
                if (!substring.equals("jpeg")) {
                    return false;
                }
                break;
            case 3559925:
                if (!substring.equals("tiff")) {
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
        return R.drawable.ic_image_file_picker;
    }
}
