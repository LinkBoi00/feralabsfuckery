package con;
/* loaded from: classes.dex */
public final class KJq8y1k90 {
    public final Object J4Ux7ym32;
    public final int q3BipwRCk;

    public KJq8y1k90(int i, Object obj) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KJq8y1k90)) {
            return false;
        }
        KJq8y1k90 kJq8y1k90 = (KJq8y1k90) obj;
        return this.q3BipwRCk == kJq8y1k90.q3BipwRCk && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, kJq8y1k90.J4Ux7ym32);
    }

    public int hashCode() {
        int i = this.q3BipwRCk * 31;
        Object obj = this.J4Ux7ym32;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("IndexedValue(index=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", value=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(")");
        return q3BipwRCk.toString();
    }
}
