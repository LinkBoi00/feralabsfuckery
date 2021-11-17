package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class yEz1ivYb6 extends GQjlVlcZE {
    public static final oWhsE8IPp kCA6Zs9sL = new oWhsE8IPp(null, 16);
    public final float J4Ux7ym32;
    public final int dIocxURUo;
    public final float q3BipwRCk;
    public final int tGV7Q6urW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yEz1ivYb6(float f, float f2, int i, int i2, int i3) {
        super(null);
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = i;
        this.dIocxURUo = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yEz1ivYb6)) {
            return false;
        }
        yEz1ivYb6 yez1ivyb6 = (yEz1ivYb6) obj;
        if (!(this.q3BipwRCk == yez1ivyb6.q3BipwRCk)) {
            return false;
        }
        if (!(this.J4Ux7ym32 == yez1ivyb6.J4Ux7ym32) || !vyxsUqAQM.q3BipwRCk(this.tGV7Q6urW, yez1ivyb6.tGV7Q6urW) || !O4O9M8RBT.q3BipwRCk(this.dIocxURUo, yez1ivyb6.dIocxURUo)) {
            return false;
        }
        Objects.requireNonNull(yez1ivyb6);
        return anXlDk6fV.tGV7Q6urW(null, null);
    }

    public int hashCode() {
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31);
        return ((Integer.hashCode(this.dIocxURUo) + ((Integer.hashCode(this.tGV7Q6urW) + q3BipwRCk) * 31)) * 31) + 0;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Stroke(width=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", miter=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", cap=");
        q3BipwRCk.append((Object) vyxsUqAQM.J4Ux7ym32(this.tGV7Q6urW));
        q3BipwRCk.append(", join=");
        q3BipwRCk.append((Object) O4O9M8RBT.J4Ux7ym32(this.dIocxURUo));
        q3BipwRCk.append(", pathEffect=");
        q3BipwRCk.append((Object) null);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
