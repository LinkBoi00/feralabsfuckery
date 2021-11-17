package con;
/* loaded from: classes.dex */
public final class iNAHfoPEP extends etphh5KhI {
    public iNAHfoPEP(wYE0YFI4V wye0yfi4v, wYE0YFI4V wye0yfi4v2, wYE0YFI4V wye0yfi4v3, wYE0YFI4V wye0yfi4v4) {
        super(wye0yfi4v, wye0yfi4v2, wye0yfi4v3, wye0yfi4v4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iNAHfoPEP)) {
            return false;
        }
        iNAHfoPEP inahfopep = (iNAHfoPEP) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, inahfopep.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, inahfopep.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, inahfopep.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, inahfopep.dIocxURUo);
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        int hashCode2 = this.tGV7Q6urW.hashCode();
        return this.dIocxURUo.hashCode() + ((hashCode2 + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RoundedCornerShape(topStart = ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", topEnd = ");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", bottomEnd = ");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", bottomStart = ");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
