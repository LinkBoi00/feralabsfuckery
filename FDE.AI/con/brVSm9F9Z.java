package con;
/* loaded from: classes.dex */
public final class brVSm9F9Z {
    public final int J4Ux7ym32;
    public final Object q3BipwRCk;

    public brVSm9F9Z(Object obj, int i) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brVSm9F9Z)) {
            return false;
        }
        brVSm9F9Z brvsm9f9z = (brVSm9F9Z) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, brvsm9f9z.q3BipwRCk) && this.J4Ux7ym32 == brvsm9f9z.J4Ux7ym32;
    }

    public int hashCode() {
        return Integer.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("HorizontalAnchor(id=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", index=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
