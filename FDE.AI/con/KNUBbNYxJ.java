package con;
/* loaded from: classes.dex */
public final class KNUBbNYxJ {
    public final TI4Z69BNb J4Ux7ym32;
    public final joIJ4ANvK q3BipwRCk;

    public KNUBbNYxJ(joIJ4ANvK joij4anvk, TI4Z69BNb tI4Z69BNb) {
        this.q3BipwRCk = joij4anvk;
        this.J4Ux7ym32 = tI4Z69BNb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KNUBbNYxJ)) {
            return false;
        }
        KNUBbNYxJ kNUBbNYxJ = (KNUBbNYxJ) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, kNUBbNYxJ.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, kNUBbNYxJ.J4Ux7ym32);
    }

    public int hashCode() {
        return this.J4Ux7ym32.hashCode() + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TransformedText(text=");
        q3BipwRCk.append((Object) this.q3BipwRCk);
        q3BipwRCk.append(", offsetMapping=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
