package con;
/* loaded from: classes.dex */
public final class dGwOm42fX {
    public static final uEb6wTQlg dIocxURUo = new uEb6wTQlg(0);
    public static final dGwOm42fX kCA6Zs9sL = new dGwOm42fX(0.0f, new WLosHMQ8L(0.0f, 0.0f), 0, 4);
    public final WLosHMQ8L J4Ux7ym32;
    public final float q3BipwRCk;
    public final int tGV7Q6urW;

    public dGwOm42fX(float f, WLosHMQ8L wLosHMQ8L, int i) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = wLosHMQ8L;
        this.tGV7Q6urW = i;
    }

    public dGwOm42fX(float f, WLosHMQ8L wLosHMQ8L, int i, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = wLosHMQ8L;
        this.tGV7Q6urW = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dGwOm42fX)) {
            return false;
        }
        dGwOm42fX dgwom42fx = (dGwOm42fX) obj;
        return ((this.q3BipwRCk > dgwom42fx.q3BipwRCk ? 1 : (this.q3BipwRCk == dgwom42fx.q3BipwRCk ? 0 : -1)) == 0) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, dgwom42fx.J4Ux7ym32) && this.tGV7Q6urW == dgwom42fx.tGV7Q6urW;
    }

    public int hashCode() {
        return ((this.J4Ux7ym32.hashCode() + (Float.hashCode(this.q3BipwRCk) * 31)) * 31) + this.tGV7Q6urW;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ProgressBarRangeInfo(current=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", range=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", steps=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ')');
    }
}
