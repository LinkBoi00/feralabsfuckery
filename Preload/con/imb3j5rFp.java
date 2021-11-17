package con;
/* loaded from: classes.dex */
public final class imb3j5rFp extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public imb3j5rFp(float f, float f2) {
        super(false, false, 3);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imb3j5rFp)) {
            return false;
        }
        imb3j5rFp imb3j5rfp = (imb3j5rFp) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(imb3j5rfp.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(imb3j5rfp.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + (Float.hashCode(this.tGV7Q6urW) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RelativeMoveTo(dx=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", dy=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
