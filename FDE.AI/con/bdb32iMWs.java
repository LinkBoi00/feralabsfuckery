package con;

import java.text.BreakIterator;
import java.util.Locale;
/* loaded from: classes.dex */
public class bdb32iMWs extends Xqme2uw0r {
    public static final ksLrMHgEz dIocxURUo = new ksLrMHgEz(null, 24);
    public static bdb32iMWs kCA6Zs9sL;
    public BreakIterator tGV7Q6urW;

    public bdb32iMWs(Locale locale, dnBSj5uJN dnbsj5ujn) {
        this.tGV7Q6urW = BreakIterator.getCharacterInstance(locale);
    }

    @Override // con.JHsfNVnhw
    public int[] J4Ux7ym32(int i) {
        int length = dIocxURUo().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.tGV7Q6urW;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.tGV7Q6urW;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.tGV7Q6urW;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return tGV7Q6urW(preceding, i);
            }
        } while (i != -1);
        return null;
    }

    @Override // con.Xqme2uw0r
    public void kCA6Zs9sL(String str) {
        this.q3BipwRCk = str;
        BreakIterator breakIterator = this.tGV7Q6urW;
        if (breakIterator == null) {
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    @Override // con.JHsfNVnhw
    public int[] q3BipwRCk(int i) {
        int length = dIocxURUo().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.tGV7Q6urW;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.tGV7Q6urW;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.tGV7Q6urW;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i);
                if (following == -1) {
                    return null;
                }
                return tGV7Q6urW(i, following);
            }
        } while (i != -1);
        return null;
    }
}
