package con;
/* loaded from: classes.dex */
public abstract class HhnYCaabI extends aEEiasOYa {
    public static final Integer nlGCs0NZs(String str) {
        boolean z;
        int i;
        idpM54xlp.J4Ux7ym32(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            int i3 = -2147483647;
            int i4 = 1;
            if (anXlDk6fV.oon79WMrY(charAt, 48) >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    i3 = Integer.MIN_VALUE;
                    z = true;
                } else if (charAt == '+') {
                    z = false;
                }
            }
            int i5 = -59652323;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0 && ((i2 >= i5 || (i5 == -59652323 && i2 >= (i5 = i3 / 10))) && (i = i2 * 10) >= i3 + digit)) {
                    i2 = i - digit;
                    i4++;
                }
            }
            return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
        }
        return null;
    }
}
