package con;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class r6NbD4wnj extends HhnYCaabI {
    public static final boolean AqaWJg0b4(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (igRQEZxnW(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (V9LQMKGJe(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    public static final CharSequence BL4OzhZBd(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean Eeka1udhb = idpM54xlp.Eeka1udhb(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!Eeka1udhb) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!Eeka1udhb) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean EBQXiIPmm(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() != 0) {
            G8ebKyy85 g8ebKyy85 = new G8ebKyy85(0, charSequence.length() - 1);
            if (!(g8ebKyy85 instanceof Collection) || !((Collection) g8ebKyy85).isEmpty()) {
                Iterator it = g8ebKyy85.iterator();
                while (it.hasNext()) {
                    if (!idpM54xlp.Eeka1udhb(charSequence.charAt(((hbC5oTdpL) it).J4Ux7ym32()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final String IzM1cD9ly(CharSequence charSequence, G8ebKyy85 g8ebKyy85) {
        return charSequence.subSequence(Integer.valueOf(g8ebKyy85.CBQ5d1kRq).intValue(), Integer.valueOf(g8ebKyy85.kmSgne1rO).intValue() + 1).toString();
    }

    public static final boolean L4EwGfXiQ(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!idpM54xlp.GPLPRo6go(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean NyWTwPF6V(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String OpLJtmvFM(String str, char c, String str2, int i) {
        String str3 = (i & 2) != 0 ? str : null;
        int TyB1UUd72 = TyB1UUd72(str, c, 0, false, 6);
        return TyB1UUd72 == -1 ? str3 : str.substring(TyB1UUd72 + 1, str.length());
    }

    public static int QNqj6nIzv(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(Jefa2ExbR.NyWTwPF6V(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int vNtjxmzUM = vNtjxmzUM(charSequence);
        if (i <= vNtjxmzUM) {
            while (true) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z2 = false;
                        break;
                    } else if (idpM54xlp.GPLPRo6go(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    if (i == vNtjxmzUM) {
                        break;
                    }
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    public static final boolean QSbMsHU5X(String str, int i, String str2, int i2, int i3, boolean z) {
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static int TyB1UUd72(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = vNtjxmzUM(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(Jefa2ExbR.NyWTwPF6V(cArr), i);
        }
        int vNtjxmzUM = vNtjxmzUM(charSequence);
        if (i > vNtjxmzUM) {
            i = vNtjxmzUM;
        }
        while (i >= 0) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z2 = false;
                    break;
                } else if (idpM54xlp.GPLPRo6go(cArr[i3], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static /* synthetic */ int V9LQMKGJe(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return o4LF8RkoQ(charSequence, charSequence2, i, i2, z, z2);
    }

    public static final int i0Zug1mVk(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? V9LQMKGJe(charSequence, str, i, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int igRQEZxnW(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return i0Zug1mVk(charSequence, str, i, z);
    }

    public static PmYqqGuHi j22ftfeNI(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        ziwPzaoF3(i2);
        return new yMAbTMUQe(charSequence, i, i2, new hX9Yubb2c(Arrays.asList(strArr), z));
    }

    public static int juJ6pnCpu(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = vNtjxmzUM(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return (z || !(charSequence instanceof String)) ? o4LF8RkoQ(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ boolean mUqPm6GBh(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return AqaWJg0b4(charSequence, charSequence2, z);
    }

    public static String n4UIOvAko(String str, String str2, String str3, int i) {
        String str4 = (i & 2) != 0 ? str : null;
        int igRQEZxnW = igRQEZxnW(str, str2, 0, false, 6);
        return igRQEZxnW == -1 ? str4 : str.substring(str2.length() + igRQEZxnW, str.length());
    }

    public static final int o4LF8RkoQ(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        DoyxeIIWl doyxeIIWl;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            doyxeIIWl = new G8ebKyy85(i, i2);
        } else {
            int vNtjxmzUM = vNtjxmzUM(charSequence);
            if (i > vNtjxmzUM) {
                i = vNtjxmzUM;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            doyxeIIWl = new DoyxeIIWl(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = doyxeIIWl.CBQ5d1kRq;
            int i4 = doyxeIIWl.kmSgne1rO;
            int i5 = doyxeIIWl.Bhmn1KIah;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (!L4EwGfXiQ(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = doyxeIIWl.CBQ5d1kRq;
            int i7 = doyxeIIWl.kmSgne1rO;
            int i8 = doyxeIIWl.Bhmn1KIah;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (!QSbMsHU5X((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    if (i6 != i7) {
                        i6 += i8;
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    public static final int vNtjxmzUM(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static boolean wIZEdYHUn(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return !z ? str.startsWith(str2) : QSbMsHU5X(str, 0, str2, 0, str2.length(), z);
    }

    public static final CharSequence zHl31GGXU(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void ziwPzaoF3(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }
}
