package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class dyRLRaL1h {
    public GfYKj7jWp J4Ux7ym32;
    public final G9VdDqs1M q3BipwRCk;
    public mnTaxtMa7 tGV7Q6urW;

    public dyRLRaL1h(G9VdDqs1M g9VdDqs1M, GfYKj7jWp gfYKj7jWp, mnTaxtMa7 mntaxtma7, int i) {
        GfYKj7jWp gfYKj7jWp2;
        if ((i & 2) != 0) {
            Objects.requireNonNull(GfYKj7jWp.J4Ux7ym32);
            gfYKj7jWp2 = ihHXPsZgG.tGV7Q6urW;
        } else {
            gfYKj7jWp2 = null;
        }
        this.q3BipwRCk = g9VdDqs1M;
        this.J4Ux7ym32 = gfYKj7jWp2;
        this.tGV7Q6urW = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyRLRaL1h)) {
            return false;
        }
        dyRLRaL1h dyrlral1h = (dyRLRaL1h) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, dyrlral1h.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, dyrlral1h.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, dyrlral1h.tGV7Q6urW);
    }

    public int hashCode() {
        int hashCode = (this.J4Ux7ym32.hashCode() + (this.q3BipwRCk.hashCode() * 31)) * 31;
        mnTaxtMa7 mntaxtma7 = this.tGV7Q6urW;
        return hashCode + (mntaxtma7 == null ? 0 : mntaxtma7.hashCode());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("BringIntoViewData(bringRectangleOnScreenRequester=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", parent=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", layoutCoordinates=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
