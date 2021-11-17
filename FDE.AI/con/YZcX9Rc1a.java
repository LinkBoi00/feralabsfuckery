package con;
/* loaded from: classes.dex */
public final class YZcX9Rc1a {
    public lOtvezK70 J4Ux7ym32;
    public final Object q3BipwRCk;

    public YZcX9Rc1a(Object obj, lOtvezK70 lotvezk70, int i) {
        XP8g1cdgt xP8g1cdgt;
        if ((i & 2) != 0) {
            lOtvezK70 lotvezk702 = TqRcaVEga.q3BipwRCk;
            xP8g1cdgt = XP8g1cdgt.q3BipwRCk;
        } else {
            xP8g1cdgt = null;
        }
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = xP8g1cdgt;
    }

    public boolean equals(Object obj) {
        if (obj instanceof YZcX9Rc1a) {
            YZcX9Rc1a yZcX9Rc1a = (YZcX9Rc1a) obj;
            if (anXlDk6fV.tGV7Q6urW(yZcX9Rc1a.q3BipwRCk, this.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(yZcX9Rc1a.J4Ux7ym32, this.J4Ux7ym32)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        return this.J4Ux7ym32.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }
}
