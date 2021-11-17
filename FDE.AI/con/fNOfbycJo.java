package con;

import java.util.List;
/* loaded from: classes.dex */
public final class fNOfbycJo {
    public final float J4Ux7ym32;
    public final List q3BipwRCk;

    public fNOfbycJo(List list, float f) {
        this.q3BipwRCk = list;
        this.J4Ux7ym32 = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fNOfbycJo)) {
            return false;
        }
        fNOfbycJo fnofbycjo = (fNOfbycJo) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, fnofbycjo.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(fnofbycjo.J4Ux7ym32));
    }

    public int hashCode() {
        return Float.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PolynomialFit(coefficients=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", confidence=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
