package con;
/* loaded from: classes.dex */
public final class R1zyWYdFl extends Xqme2uw0r {
    public static R1zyWYdFl tGV7Q6urW;

    public R1zyWYdFl(dnBSj5uJN dnbsj5ujn) {
    }

    public final boolean GPLPRo6go(int i) {
        return dIocxURUo().charAt(i) != '\n' && (i == 0 || dIocxURUo().charAt(i - 1) == '\n');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // con.JHsfNVnhw
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] J4Ux7ym32(int i) {
        int length = dIocxURUo().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && dIocxURUo().charAt(i - 1) == '\n' && !iiGwOFFnr(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && !GPLPRo6go(i2)) {
            i2--;
        }
        return tGV7Q6urW(i2, i);
    }

    public final boolean iiGwOFFnr(int i) {
        return i > 0 && dIocxURUo().charAt(i + -1) != '\n' && (i == dIocxURUo().length() || dIocxURUo().charAt(i) == '\n');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // con.JHsfNVnhw
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] q3BipwRCk(int i) {
        int length = dIocxURUo().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && dIocxURUo().charAt(i) == '\n' && !GPLPRo6go(i)) {
            i++;
        }
        int i2 = i + 1;
        while (i2 < length && !iiGwOFFnr(i2)) {
            i2++;
        }
        return tGV7Q6urW(i, i2);
    }
}
