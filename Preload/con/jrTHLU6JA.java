package con;
/* loaded from: classes.dex */
public final class jrTHLU6JA {
    public final int J4Ux7ym32;
    public final Object q3BipwRCk;
    public final int tGV7Q6urW;

    public jrTHLU6JA(Object obj, int i, int i2) {
        this.q3BipwRCk = obj;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrTHLU6JA)) {
            return false;
        }
        jrTHLU6JA jrthlu6ja = (jrTHLU6JA) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, jrthlu6ja.q3BipwRCk) && this.J4Ux7ym32 == jrthlu6ja.J4Ux7ym32 && this.tGV7Q6urW == jrthlu6ja.tGV7Q6urW;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.J4Ux7ym32);
        return Integer.hashCode(this.tGV7Q6urW) + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SpanRange(span=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", start=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", end=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ')');
    }
}
