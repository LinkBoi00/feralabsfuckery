package con;
/* loaded from: classes.dex */
public class cpJ35uekT {
    public static final byte[] kCA6Zs9sL = new byte[1792];
    public final int J4Ux7ym32;
    public char dIocxURUo;
    public final CharSequence q3BipwRCk;
    public int tGV7Q6urW;

    static {
        for (int i = 0; i < 1792; i++) {
            kCA6Zs9sL[i] = Character.getDirectionality(i);
        }
    }

    public cpJ35uekT(CharSequence charSequence, boolean z) {
        this.q3BipwRCk = charSequence;
        this.J4Ux7ym32 = charSequence.length();
    }

    public byte q3BipwRCk() {
        char charAt = this.q3BipwRCk.charAt(this.tGV7Q6urW - 1);
        this.dIocxURUo = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.q3BipwRCk, this.tGV7Q6urW);
            this.tGV7Q6urW -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.tGV7Q6urW--;
        char c = this.dIocxURUo;
        return c < 1792 ? kCA6Zs9sL[c] : Character.getDirectionality(c);
    }
}
