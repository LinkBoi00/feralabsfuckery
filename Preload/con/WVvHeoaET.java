package con;

import android.content.res.Resources;
/* loaded from: classes.dex */
public final class WVvHeoaET {
    public final int J4Ux7ym32;
    public final Resources.Theme q3BipwRCk;

    public WVvHeoaET(Resources.Theme theme, int i) {
        this.q3BipwRCk = theme;
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WVvHeoaET)) {
            return false;
        }
        WVvHeoaET wVvHeoaET = (WVvHeoaET) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, wVvHeoaET.q3BipwRCk) && this.J4Ux7ym32 == wVvHeoaET.J4Ux7ym32;
    }

    public int hashCode() {
        return Integer.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Key(theme=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", id=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
