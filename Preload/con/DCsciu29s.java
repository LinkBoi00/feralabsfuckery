package con;
/* loaded from: classes.dex */
public final class DCsciu29s extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public DCsciu29s(float f, float f2) {
        super(false, false, 3);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DCsciu29s)) {
            return false;
        }
        DCsciu29s dCsciu29s = (DCsciu29s) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(dCsciu29s.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(dCsciu29s.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + (Float.hashCode(this.tGV7Q6urW) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("LineTo(x=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", y=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
