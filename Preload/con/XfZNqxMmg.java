package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class XfZNqxMmg {
    public int Bhmn1KIah;
    public JQhKJ2jfw[] CBQ5d1kRq;
    public int kmSgne1rO;

    public final void GPLPRo6go(JQhKJ2jfw jQhKJ2jfw) {
        int i;
        Way959ade[] J4Ux7ym32;
        synchronized (this) {
            int i2 = this.kmSgne1rO - 1;
            this.kmSgne1rO = i2;
            i = 0;
            if (i2 == 0) {
                this.Bhmn1KIah = 0;
            }
            J4Ux7ym32 = jQhKJ2jfw.J4Ux7ym32(this);
        }
        int length = J4Ux7ym32.length;
        while (i < length) {
            Way959ade way959ade = J4Ux7ym32[i];
            i++;
            if (way959ade != null) {
                way959ade.Bhmn1KIah(qih4lW99W.q3BipwRCk);
            }
        }
    }

    public final JQhKJ2jfw dIocxURUo() {
        JQhKJ2jfw jQhKJ2jfw;
        synchronized (this) {
            JQhKJ2jfw[] jQhKJ2jfwArr = this.CBQ5d1kRq;
            if (jQhKJ2jfwArr == null) {
                jQhKJ2jfwArr = iiGwOFFnr(2);
                this.CBQ5d1kRq = jQhKJ2jfwArr;
            } else if (this.kmSgne1rO >= jQhKJ2jfwArr.length) {
                Object[] copyOf = Arrays.copyOf(jQhKJ2jfwArr, jQhKJ2jfwArr.length * 2);
                this.CBQ5d1kRq = (JQhKJ2jfw[]) copyOf;
                jQhKJ2jfwArr = (JQhKJ2jfw[]) copyOf;
            }
            int i = this.Bhmn1KIah;
            do {
                jQhKJ2jfw = jQhKJ2jfwArr[i];
                if (jQhKJ2jfw == null) {
                    jQhKJ2jfw = kCA6Zs9sL();
                    jQhKJ2jfwArr[i] = jQhKJ2jfw;
                }
                i++;
                if (i >= jQhKJ2jfwArr.length) {
                    i = 0;
                }
            } while (!jQhKJ2jfw.q3BipwRCk(this));
            this.Bhmn1KIah = i;
            this.kmSgne1rO++;
        }
        return jQhKJ2jfw;
    }

    public abstract JQhKJ2jfw[] iiGwOFFnr(int i);

    public abstract JQhKJ2jfw kCA6Zs9sL();
}
