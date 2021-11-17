package con;
/* loaded from: classes.dex */
public final class ngczBF8du {
    public final eEwksJAjd J4Ux7ym32;
    public final String q3BipwRCk;

    public ngczBF8du(String str, eEwksJAjd eewksjajd) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = eewksjajd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngczBF8du)) {
            return false;
        }
        ngczBF8du ngczbf8du = (ngczBF8du) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, ngczbf8du.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, ngczbf8du.J4Ux7ym32);
    }

    public int hashCode() {
        String str = this.q3BipwRCk;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        eEwksJAjd eewksjajd = this.J4Ux7ym32;
        if (eewksjajd != null) {
            i = eewksjajd.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AccessibilityAction(label=");
        q3BipwRCk.append((Object) this.q3BipwRCk);
        q3BipwRCk.append(", action=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
