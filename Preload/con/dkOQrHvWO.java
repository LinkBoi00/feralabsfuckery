package con;
/* loaded from: classes.dex */
public final class dkOQrHvWO {
    public final boolean J4Ux7ym32;
    public final int dIocxURUo;
    public final boolean iiGwOFFnr;
    public final boolean kCA6Zs9sL;
    public final boolean q3BipwRCk;
    public final boolean tGV7Q6urW;

    public dkOQrHvWO(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? true : z3;
        i = (i2 & 8) != 0 ? 1 : i;
        z4 = (i2 & 16) != 0 ? true : z4;
        z5 = (i2 & 32) != 0 ? true : z5;
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = z2;
        this.tGV7Q6urW = z3;
        this.dIocxURUo = i;
        this.kCA6Zs9sL = z4;
        this.iiGwOFFnr = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkOQrHvWO)) {
            return false;
        }
        dkOQrHvWO dkoqrhvwo = (dkOQrHvWO) obj;
        return this.q3BipwRCk == dkoqrhvwo.q3BipwRCk && this.J4Ux7ym32 == dkoqrhvwo.J4Ux7ym32 && this.tGV7Q6urW == dkoqrhvwo.tGV7Q6urW && this.dIocxURUo == dkoqrhvwo.dIocxURUo && this.kCA6Zs9sL == dkoqrhvwo.kCA6Zs9sL && this.iiGwOFFnr == dkoqrhvwo.iiGwOFFnr;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.q3BipwRCk);
        int hashCode2 = Boolean.hashCode(this.J4Ux7ym32);
        int hashCode3 = Boolean.hashCode(this.tGV7Q6urW);
        int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(this.dIocxURUo);
        int hashCode4 = Boolean.hashCode(this.kCA6Zs9sL);
        int hashCode5 = Boolean.hashCode(this.iiGwOFFnr);
        return Boolean.hashCode(false) + ((hashCode5 + ((hashCode4 + ((tGV7Q6urW + ((hashCode3 + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.J4Ux7ym32) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
