package con;
/* loaded from: classes.dex */
public final class BaMMm5shD {
    public final B82vleiqp J4Ux7ym32;
    public final PmanMZxiM q3BipwRCk;

    public BaMMm5shD(PmanMZxiM pmanMZxiM, B82vleiqp b82vleiqp) {
        this.q3BipwRCk = pmanMZxiM;
        this.J4Ux7ym32 = b82vleiqp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaMMm5shD)) {
            return false;
        }
        BaMMm5shD baMMm5shD = (BaMMm5shD) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, baMMm5shD.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, baMMm5shD.J4Ux7ym32);
    }

    public int hashCode() {
        return this.J4Ux7ym32.hashCode() + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Slide(slideOffset=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", animationSpec=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
