package con;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class BWdUDHRcA {
    public static final BWdUDHRcA kCA6Zs9sL = new BWdUDHRcA(0, 0, 0, 0);
    public final int J4Ux7ym32;
    public final int dIocxURUo;
    public final int q3BipwRCk;
    public final int tGV7Q6urW;

    public BWdUDHRcA(int i, int i2, int i3, int i4) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = i3;
        this.dIocxURUo = i4;
    }

    public static BWdUDHRcA J4Ux7ym32(Insets insets) {
        return q3BipwRCk(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static BWdUDHRcA q3BipwRCk(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? kCA6Zs9sL : new BWdUDHRcA(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BWdUDHRcA.class != obj.getClass()) {
            return false;
        }
        BWdUDHRcA bWdUDHRcA = (BWdUDHRcA) obj;
        return this.dIocxURUo == bWdUDHRcA.dIocxURUo && this.q3BipwRCk == bWdUDHRcA.q3BipwRCk && this.tGV7Q6urW == bWdUDHRcA.tGV7Q6urW && this.J4Ux7ym32 == bWdUDHRcA.J4Ux7ym32;
    }

    public int hashCode() {
        return (((((this.q3BipwRCk * 31) + this.J4Ux7ym32) * 31) + this.tGV7Q6urW) * 31) + this.dIocxURUo;
    }

    public Insets tGV7Q6urW() {
        return Insets.of(this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW, this.dIocxURUo);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Insets{left=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", top=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", right=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", bottom=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.dIocxURUo, '}');
    }
}
