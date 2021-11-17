package con;
/* loaded from: classes.dex */
public final class sbK32z90g {
    public final PmanMZxiM J4Ux7ym32;
    public final Object q3BipwRCk;

    public sbK32z90g(Object obj, PmanMZxiM pmanMZxiM) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = pmanMZxiM;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbK32z90g)) {
            return false;
        }
        sbK32z90g sbk32z90g = (sbK32z90g) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, sbk32z90g.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, sbk32z90g.J4Ux7ym32);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        return this.J4Ux7ym32.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CompletedWithCancellation(result=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", onCancellation=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
