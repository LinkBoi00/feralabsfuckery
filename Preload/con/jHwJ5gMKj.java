package con;
/* loaded from: classes.dex */
public abstract class jHwJ5gMKj {
    public Object q3BipwRCk;

    public jHwJ5gMKj(PkoWOcmqg pkoWOcmqg) {
        this.q3BipwRCk = pkoWOcmqg;
    }

    public boolean J4Ux7ym32(CharSequence charSequence, int i, int i2) {
        if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
            throw new IllegalArgumentException();
        }
        PkoWOcmqg pkoWOcmqg = (PkoWOcmqg) this.q3BipwRCk;
        if (pkoWOcmqg == null) {
            return q3BipwRCk();
        }
        int q3BipwRCk = pkoWOcmqg.q3BipwRCk(charSequence, i, i2);
        if (q3BipwRCk == 0) {
            return true;
        }
        if (q3BipwRCk != 1) {
            return q3BipwRCk();
        }
        return false;
    }

    public abstract boolean q3BipwRCk();
}
