package con;
/* loaded from: classes.dex */
public abstract class if3rYjZeq {
    public static final String[] q3BipwRCk;

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            strArr[i2] = "\\u" + J4Ux7ym32(i2 >> 12) + J4Ux7ym32(i2 >> 8) + J4Ux7ym32(i2 >> 4) + J4Ux7ym32(i2);
            if (i3 > 31) {
                break;
            }
            i2 = i3;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        q3BipwRCk = strArr;
        byte[] bArr = new byte[93];
        while (true) {
            int i4 = i + 1;
            bArr[i] = 1;
            if (i4 <= 31) {
                i = i4;
            } else {
                return;
            }
        }
    }

    public static final char J4Ux7ym32(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }

    public static final void q3BipwRCk(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length() - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                String[] strArr = q3BipwRCk;
                if (charAt < strArr.length && strArr[charAt] != null) {
                    sb.append((CharSequence) str, i2, i);
                    sb.append(strArr[charAt]);
                    i2 = i3;
                }
                if (i3 > length) {
                    break;
                }
                i = i3;
            }
            i = i2;
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }
}
