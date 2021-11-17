package con;
/* loaded from: classes.dex */
public final class sl3YzGsPn {
    public final Object J4Ux7ym32;
    public final Object q3BipwRCk;

    public sl3YzGsPn(Object obj, Object obj2) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl3YzGsPn)) {
            return false;
        }
        sl3YzGsPn sl3yzgspn = (sl3YzGsPn) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, sl3yzgspn.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, sl3yzgspn.J4Ux7ym32);
    }

    public int hashCode() {
        return q3BipwRCk(this.J4Ux7ym32) + (q3BipwRCk(this.q3BipwRCk) * 31);
    }

    public final int q3BipwRCk(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("JoinedKey(left=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", right=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
