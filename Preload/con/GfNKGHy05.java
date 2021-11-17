package con;
/* loaded from: classes.dex */
public final class GfNKGHy05 {
    public final etphh5KhI J4Ux7ym32;
    public final etphh5KhI q3BipwRCk;
    public final etphh5KhI tGV7Q6urW;

    public GfNKGHy05(etphh5KhI etphh5khi, etphh5KhI etphh5khi2, etphh5KhI etphh5khi3, int i) {
        iNAHfoPEP inahfopep = null;
        iNAHfoPEP q3BipwRCk = (i & 1) != 0 ? LA6o9xrM4.q3BipwRCk((float) 4) : null;
        iNAHfoPEP q3BipwRCk2 = (i & 2) != 0 ? LA6o9xrM4.q3BipwRCk((float) 4) : null;
        inahfopep = (4 & i) != 0 ? LA6o9xrM4.q3BipwRCk((float) 0) : inahfopep;
        this.q3BipwRCk = q3BipwRCk;
        this.J4Ux7ym32 = q3BipwRCk2;
        this.tGV7Q6urW = inahfopep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GfNKGHy05)) {
            return false;
        }
        GfNKGHy05 gfNKGHy05 = (GfNKGHy05) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, gfNKGHy05.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, gfNKGHy05.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, gfNKGHy05.tGV7Q6urW);
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        return this.tGV7Q6urW.hashCode() + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Shapes(small=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", medium=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", large=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
