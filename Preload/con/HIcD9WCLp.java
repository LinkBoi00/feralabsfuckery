package con;
/* loaded from: classes.dex */
public final class HIcD9WCLp extends xhlMoiaQ8 {
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public HIcD9WCLp(float f, float f2) {
        super(false, false, 3);
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HIcD9WCLp)) {
            return false;
        }
        HIcD9WCLp hIcD9WCLp = (HIcD9WCLp) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(hIcD9WCLp.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(hIcD9WCLp.dIocxURUo));
    }

    public int hashCode() {
        return Float.hashCode(this.dIocxURUo) + (Float.hashCode(this.tGV7Q6urW) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("MoveTo(x=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", y=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
