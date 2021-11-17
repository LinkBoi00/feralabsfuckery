package con;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes.dex */
public final class pDLEDo7dT {
    public static final pDLEDo7dT GPLPRo6go;
    public static final pDLEDo7dT Puu3Rhg4F;
    public static final jHwJ5gMKj dIocxURUo;
    public final int J4Ux7ym32;
    public final boolean q3BipwRCk;
    public final jHwJ5gMKj tGV7Q6urW;
    public static final String kCA6Zs9sL = Character.toString(8206);
    public static final String iiGwOFFnr = Character.toString(8207);

    static {
        jHwJ5gMKj jhwj5gmkj = PkFf5koay.tGV7Q6urW;
        dIocxURUo = jhwj5gmkj;
        GPLPRo6go = new pDLEDo7dT(false, 2, jhwj5gmkj);
        Puu3Rhg4F = new pDLEDo7dT(true, 2, jhwj5gmkj);
    }

    public pDLEDo7dT(boolean z, int i, jHwJ5gMKj jhwj5gmkj) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = jhwj5gmkj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int J4Ux7ym32(CharSequence charSequence) {
        cpJ35uekT cpj35uekt = new cpJ35uekT(charSequence, false);
        cpj35uekt.tGV7Q6urW = cpj35uekt.J4Ux7ym32;
        int i = 0;
        while (true) {
            int i2 = i;
            while (cpj35uekt.tGV7Q6urW > 0) {
                byte q3BipwRCk = cpj35uekt.q3BipwRCk();
                if (q3BipwRCk != 0) {
                    if (q3BipwRCk == 1 || q3BipwRCk == 2) {
                        if (i2 != 0) {
                            if (i == 0) {
                                break;
                            }
                        }
                    } else if (q3BipwRCk != 9) {
                        switch (q3BipwRCk) {
                            case 14:
                            case 15:
                                if (i == i2) {
                                    break;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i == i2) {
                                    break;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                        i = i2;
                    } else {
                        continue;
                    }
                } else if (i2 != 0) {
                    if (i == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r3 != 0) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r4 == 0) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r0.tGV7Q6urW <= 0) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        switch(r0.q3BipwRCk()) {
            case 14: goto L_0x008a;
            case 15: goto L_0x008a;
            case 16: goto L_0x0086;
            case 17: goto L_0x0086;
            case 18: goto L_0x0083;
            default: goto L_0x0082;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r3 != r5) goto L_0x008e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r3 != r5) goto L_0x008e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int q3BipwRCk(CharSequence charSequence) {
        byte b;
        cpJ35uekT cpj35uekt = new cpJ35uekT(charSequence, false);
        cpj35uekt.tGV7Q6urW = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = cpj35uekt.tGV7Q6urW;
            if (i4 < cpj35uekt.J4Ux7ym32 && i == 0) {
                char charAt = cpj35uekt.q3BipwRCk.charAt(i4);
                cpj35uekt.dIocxURUo = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(cpj35uekt.q3BipwRCk, cpj35uekt.tGV7Q6urW);
                    cpj35uekt.tGV7Q6urW = Character.charCount(codePointAt) + cpj35uekt.tGV7Q6urW;
                    b = Character.getDirectionality(codePointAt);
                } else {
                    cpj35uekt.tGV7Q6urW++;
                    char c = cpj35uekt.dIocxURUo;
                    b = c < 1792 ? cpJ35uekT.kCA6Zs9sL[c] : Character.getDirectionality(c);
                }
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    public static pDLEDo7dT tGV7Q6urW() {
        Locale locale = Locale.getDefault();
        int i = cHOXDkDvM.q3BipwRCk;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        jHwJ5gMKj jhwj5gmkj = dIocxURUo;
        if (jhwj5gmkj == dIocxURUo) {
            return z ? Puu3Rhg4F : GPLPRo6go;
        }
        return new pDLEDo7dT(z, 2, jhwj5gmkj);
    }

    public CharSequence dIocxURUo(CharSequence charSequence, jHwJ5gMKj jhwj5gmkj, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean J4Ux7ym32 = jhwj5gmkj.J4Ux7ym32(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.J4Ux7ym32 & 2) != 0) && z) {
            boolean J4Ux7ym322 = (J4Ux7ym32 ? PkFf5koay.J4Ux7ym32 : PkFf5koay.q3BipwRCk).J4Ux7ym32(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.q3BipwRCk || (!J4Ux7ym322 && q3BipwRCk(charSequence) != 1)) ? (!this.q3BipwRCk || (J4Ux7ym322 && q3BipwRCk(charSequence) != -1)) ? str : iiGwOFFnr : kCA6Zs9sL));
        }
        if (J4Ux7ym32 != this.q3BipwRCk) {
            spannableStringBuilder.append(J4Ux7ym32 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean J4Ux7ym323 = (J4Ux7ym32 ? PkFf5koay.J4Ux7ym32 : PkFf5koay.q3BipwRCk).J4Ux7ym32(charSequence, 0, charSequence.length());
            if (!this.q3BipwRCk && (J4Ux7ym323 || J4Ux7ym32(charSequence) == 1)) {
                str = kCA6Zs9sL;
            } else if (this.q3BipwRCk && (!J4Ux7ym323 || J4Ux7ym32(charSequence) == -1)) {
                str = iiGwOFFnr;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
