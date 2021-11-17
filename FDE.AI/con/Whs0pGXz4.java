package con;
/* loaded from: classes.dex */
public final class Whs0pGXz4 {
    public final NzvP5Rex8 J4Ux7ym32;
    public final Object q3BipwRCk;

    public Whs0pGXz4(Object obj, NzvP5Rex8 nzvP5Rex8) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = nzvP5Rex8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Whs0pGXz4)) {
            return false;
        }
        Whs0pGXz4 whs0pGXz4 = (Whs0pGXz4) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, whs0pGXz4.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, whs0pGXz4.J4Ux7ym32);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        return this.J4Ux7ym32.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FadeInFadeOutAnimationItem(key=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", transition=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
