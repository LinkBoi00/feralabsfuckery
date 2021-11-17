package con;
/* loaded from: classes.dex */
public final class lzuuVzcu0 {
    public final int J4Ux7ym32;
    public final String dIocxURUo;
    public final Object q3BipwRCk;
    public final int tGV7Q6urW;

    public lzuuVzcu0(Object obj, int i, int i2, String str) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = str;
        if (!(i <= i2)) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzuuVzcu0)) {
            return false;
        }
        lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, lzuuvzcu0.q3BipwRCk) && this.J4Ux7ym32 == lzuuvzcu0.J4Ux7ym32 && this.tGV7Q6urW == lzuuvzcu0.tGV7Q6urW && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, lzuuvzcu0.dIocxURUo);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        int hashCode = obj == null ? 0 : obj.hashCode();
        int hashCode2 = Integer.hashCode(this.J4Ux7ym32);
        return this.dIocxURUo.hashCode() + ((Integer.hashCode(this.tGV7Q6urW) + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Range(item=");
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
