package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class fpjpWAHwn {
    public static final /* synthetic */ int q3BipwRCk;

    static {
        ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        long j = bO2dbmrf7.GPLPRo6go;
        ksLrMHgEz kslrmhgez3 = BM5bZVvAe.J4Ux7ym32;
        ksLrMHgEz kslrmhgez4 = BM5bZVvAe.J4Ux7ym32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
        if (r16 == false) goto L_0x00d9;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f7 A[EDGE_INSN: B:118:0x00f7->B:73:0x00f7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2 A[LOOP:4: B:45:0x00af->B:72:0x00f2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final List q3BipwRCk(String str) {
        char c;
        float[] fArr;
        if (str == null) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        rKKfiOTQO rkkfiotqo = new rKKfiOTQO();
        ((List) rkkfiotqo.q3BipwRCk).clear();
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i3++;
                    }
                }
                if (!(charAt == 'e' || charAt == 'E')) {
                    break;
                }
                i3++;
            }
            String substring = str.substring(i2, i3);
            int length = substring.length() - i;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                c = ' ';
                if (i4 > length) {
                    break;
                }
                int i6 = anXlDk6fV.oon79WMrY(substring.charAt(i5 == 0 ? i4 : length), 32) <= 0 ? i : 0;
                if (i5 == 0) {
                    if (i6 == 0) {
                        i5 = i;
                    } else {
                        i4++;
                    }
                } else if (i6 == 0) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i4, length + 1).toString();
            if ((obj.length() > 0 ? i : 0) != 0) {
                if (obj.charAt(0) == 'z' || obj.charAt(0) == 'Z') {
                    fArr = new float[0];
                } else {
                    int length2 = obj.length();
                    float[] fArr2 = new float[length2];
                    int length3 = obj.length();
                    int i7 = 0;
                    int i8 = i;
                    while (i8 < length3) {
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        int i9 = i8;
                        while (i9 < obj.length()) {
                            char charAt2 = obj.charAt(i9);
                            if (!(charAt2 == c || charAt2 == ',')) {
                                if (charAt2 == '-') {
                                    if (i9 != i8) {
                                    }
                                    z2 = false;
                                    if (z4) {
                                        break;
                                    }
                                    i9++;
                                    c = ' ';
                                } else {
                                    if (charAt2 == '.') {
                                        if (!z) {
                                            z2 = false;
                                            z = true;
                                        }
                                        z3 = true;
                                    } else {
                                        if (charAt2 == 'e' || charAt2 == 'E') {
                                            z2 = true;
                                        }
                                        z2 = false;
                                    }
                                    if (z4) {
                                    }
                                }
                            }
                            z2 = false;
                            z4 = true;
                            if (z4) {
                            }
                        }
                        if (i8 < i9) {
                            fArr2[i7] = Float.parseFloat(obj.substring(i8, i9));
                            i7++;
                        }
                        if (!z3) {
                            i9++;
                        }
                        i8 = i9;
                        c = ' ';
                    }
                    if (i7 < 0) {
                        throw new IllegalArgumentException();
                    } else if (length2 >= 0) {
                        int i10 = i7 + 0;
                        int min = Math.min(i10, length2 + 0);
                        fArr = new float[i10];
                        System.arraycopy(fArr2, 0, fArr, 0, (min + 0) - 0);
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }
                rkkfiotqo.q3BipwRCk(obj.charAt(0), fArr);
            }
            i3++;
            i2 = i3;
            i = 1;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            rkkfiotqo.q3BipwRCk(str.charAt(i2), new float[0]);
        }
        return (List) rkkfiotqo.q3BipwRCk;
    }
}
