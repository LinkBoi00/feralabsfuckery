package con;
/* loaded from: classes.dex */
public final class LGCXy4SLt {
    public final int J4Ux7ym32;
    public final String dIocxURUo;
    public final Object q3BipwRCk;
    public int tGV7Q6urW;

    public LGCXy4SLt(Object obj, int i, int i2, String str) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = str;
    }

    public LGCXy4SLt(Object obj, int i, int i2, String str, int i3) {
        i2 = (i3 & 4) != 0 ? Integer.MIN_VALUE : i2;
        String str2 = (i3 & 8) != 0 ? "" : null;
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LGCXy4SLt)) {
            return false;
        }
        LGCXy4SLt lGCXy4SLt = (LGCXy4SLt) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, lGCXy4SLt.q3BipwRCk) && this.J4Ux7ym32 == lGCXy4SLt.J4Ux7ym32 && this.tGV7Q6urW == lGCXy4SLt.tGV7Q6urW && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, lGCXy4SLt.dIocxURUo);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        int hashCode = obj == null ? 0 : obj.hashCode();
        int hashCode2 = Integer.hashCode(this.J4Ux7ym32);
        return this.dIocxURUo.hashCode() + ((Integer.hashCode(this.tGV7Q6urW) + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public final lzuuVzcu0 q3BipwRCk(int i) {
        int i2 = this.tGV7Q6urW;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            return new lzuuVzcu0(this.q3BipwRCk, this.J4Ux7ym32, i, this.dIocxURUo);
        }
        throw new IllegalStateException("Item.end should be set first".toString());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("MutableRange(item=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", start=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", end=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", tag=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
