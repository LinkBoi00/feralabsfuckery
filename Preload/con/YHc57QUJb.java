package con;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public final class YHc57QUJb extends Xqme2uw0r {
    public static final ksLrMHgEz dIocxURUo = new ksLrMHgEz(null, 25);
    public static YHc57QUJb kCA6Zs9sL;
    public BreakIterator tGV7Q6urW;

    public YHc57QUJb(Locale locale, dnBSj5uJN dnbsj5ujn) {
        this.tGV7Q6urW = BreakIterator.getWordInstance(locale);
    }

    public final boolean GPLPRo6go(int i) {
        if (i < 0 || i >= dIocxURUo().length()) {
            return false;
        }
        String dIocxURUo2 = dIocxURUo();
        Objects.requireNonNull(dIocxURUo2, "null cannot be cast to non-null type java.lang.String");
        return Character.isLetterOrDigit(dIocxURUo2.codePointAt(i));
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
        while (i > 0 && !GPLPRo6go(i - 1) && !iiGwOFFnr(i)) {
            BreakIterator breakIterator = this.tGV7Q6urW;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.tGV7Q6urW;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !Puu3Rhg4F(preceding)) {
            return null;
        }
        return tGV7Q6urW(preceding, i);
    }

    public final boolean Puu3Rhg4F(int i) {
        return GPLPRo6go(i) && (i == 0 || !GPLPRo6go(i - 1));
    }

    public final boolean iiGwOFFnr(int i) {
        return i > 0 && GPLPRo6go(i + -1) && (i == dIocxURUo().length() || !GPLPRo6go(i));
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
        if (dIocxURUo().length() <= 0 || i >= dIocxURUo().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!GPLPRo6go(i) && !Puu3Rhg4F(i)) {
            BreakIterator breakIterator = this.tGV7Q6urW;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.tGV7Q6urW;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !iiGwOFFnr(following)) {
            return null;
        }
        return tGV7Q6urW(i, following);
    }
}
