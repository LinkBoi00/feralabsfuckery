package con;
/* loaded from: classes.dex */
public final class VZDBz9ON3 {
    public final int J4Ux7ym32;
    public final Object q3BipwRCk;

    public VZDBz9ON3(Object obj, int i) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VZDBz9ON3)) {
            return false;
        }
        VZDBz9ON3 vZDBz9ON3 = (VZDBz9ON3) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, vZDBz9ON3.q3BipwRCk) && this.J4Ux7ym32 == vZDBz9ON3.J4Ux7ym32;
    }

    public int hashCode() {
        return Integer.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("VerticalAnchor(id=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", index=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
