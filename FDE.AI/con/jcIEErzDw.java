package con;

import java.text.BreakIterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class jcIEErzDw {
    public static final uEb6wTQlg kCA6Zs9sL = new uEb6wTQlg(0);
    public final int J4Ux7ym32;
    public final BreakIterator dIocxURUo;
    public final CharSequence q3BipwRCk;
    public final int tGV7Q6urW;

    public jcIEErzDw(CharSequence charSequence, int i, int i2, Locale locale) {
        this.q3BipwRCk = charSequence;
        boolean z = true;
        if (i >= 0 && i <= charSequence.length()) {
            if ((i2 < 0 || i2 > charSequence.length()) ? false : z) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.dIocxURUo = wordInstance;
                this.J4Ux7ym32 = Math.max(0, i - 50);
                this.tGV7Q6urW = Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new P000ZIs6c(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final boolean J4Ux7ym32(int i) {
        return (i <= this.tGV7Q6urW && this.J4Ux7ym32 + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.q3BipwRCk, i));
    }

    public final boolean dIocxURUo(int i) {
        return (i < this.tGV7Q6urW && this.J4Ux7ym32 <= i) && Character.isLetterOrDigit(Character.codePointAt(this.q3BipwRCk, i));
    }

    public final boolean kCA6Zs9sL(int i) {
        if (!(i < this.tGV7Q6urW && this.J4Ux7ym32 <= i)) {
            return false;
        }
        return kCA6Zs9sL.tGV7Q6urW(Character.codePointAt(this.q3BipwRCk, i));
    }

    public final void q3BipwRCk(int i) {
        int i2 = this.J4Ux7ym32;
        boolean z = false;
        if (i <= this.tGV7Q6urW && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Invalid offset: ", i, ". Valid range is [");
            q3BipwRCk.append(this.J4Ux7ym32);
            q3BipwRCk.append(" , ");
            throw new IllegalArgumentException(dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ']').toString());
        }
    }

    public final boolean tGV7Q6urW(int i) {
        boolean z = true;
        int i2 = this.J4Ux7ym32 + 1;
        if (i > this.tGV7Q6urW || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return kCA6Zs9sL.tGV7Q6urW(Character.codePointBefore(this.q3BipwRCk, i));
    }
}
