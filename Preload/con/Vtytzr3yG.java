package con;
/* loaded from: classes.dex */
public final class Vtytzr3yG {
    public final Object J4Ux7ym32;
    public final Object q3BipwRCk;

    public Vtytzr3yG(Object obj, Object obj2) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Vtytzr3yG) {
            Vtytzr3yG vtytzr3yG = (Vtytzr3yG) obj;
            if (anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, vtytzr3yG.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, vtytzr3yG.J4Ux7ym32)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.J4Ux7ym32;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public boolean q3BipwRCk(Object obj, Object obj2) {
        return anXlDk6fV.tGV7Q6urW(obj, this.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(obj2, this.J4Ux7ym32);
    }
}
