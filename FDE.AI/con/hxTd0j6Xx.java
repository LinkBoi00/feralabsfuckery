package con;
/* loaded from: classes.dex */
public final class hxTd0j6Xx {
    public final float J4Ux7ym32;
    public final float dIocxURUo;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    public hxTd0j6Xx(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxTd0j6Xx)) {
            return false;
        }
        hxTd0j6Xx hxtd0j6xx = (hxTd0j6Xx) obj;
        if (!(this.q3BipwRCk == hxtd0j6xx.q3BipwRCk)) {
            return false;
        }
        if (!(this.J4Ux7ym32 == hxtd0j6xx.J4Ux7ym32)) {
            return false;
        }
        if (!(this.tGV7Q6urW == hxtd0j6xx.tGV7Q6urW)) {
            return false;
        }
        return (this.dIocxURUo > hxtd0j6xx.dIocxURUo ? 1 : (this.dIocxURUo == hxtd0j6xx.dIocxURUo ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + gXNsYvZus.q3BipwRCk(this.tGV7Q6urW, gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RippleAlpha(draggedAlpha=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", focusedAlpha=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", hoveredAlpha=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", pressedAlpha=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
