package con;
/* loaded from: classes.dex */
public final class XeOmD5li4 {
    public final kkcQgCx5G J4Ux7ym32;
    public final Object q3BipwRCk;

    public XeOmD5li4(Object obj, kkcQgCx5G kkcqgcx5g) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = kkcqgcx5g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XeOmD5li4)) {
            return false;
        }
        XeOmD5li4 xeOmD5li4 = (XeOmD5li4) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, xeOmD5li4.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, xeOmD5li4.J4Ux7ym32);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        return this.J4Ux7ym32.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CrossfadeAnimationItem(key=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", content=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
