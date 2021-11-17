package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class GabIU2lD1 {
    public static final GabIU2lD1 q3BipwRCk;
    public static final char[] J4Ux7ym32 = new char[117];
    public static final byte[] tGV7Q6urW = new byte[126];

    static {
        GabIU2lD1 gabIU2lD1 = new GabIU2lD1();
        q3BipwRCk = gabIU2lD1;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            gabIU2lD1.q3BipwRCk(i2, 'u');
            if (i3 > 31) {
                break;
            }
            i2 = i3;
        }
        gabIU2lD1.q3BipwRCk(8, 'b');
        gabIU2lD1.q3BipwRCk(9, 't');
        gabIU2lD1.q3BipwRCk(10, 'n');
        gabIU2lD1.q3BipwRCk(12, 'f');
        gabIU2lD1.q3BipwRCk(13, 'r');
        gabIU2lD1.q3BipwRCk(47, '/');
        gabIU2lD1.q3BipwRCk(34, '\"');
        gabIU2lD1.q3BipwRCk(92, '\\');
        Objects.requireNonNull(q3BipwRCk);
        while (true) {
            int i4 = i + 1;
            byte[] bArr = tGV7Q6urW;
            bArr[i] = Byte.MAX_VALUE;
            if (i4 > 32) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            i = i4;
        }
    }

    public final void q3BipwRCk(int i, char c) {
        if (c != 'u') {
            J4Ux7ym32[c] = (char) i;
        }
    }
}
