package con;
/* loaded from: classes.dex */
public final class X47LlE0dx implements wYE0YFI4V {
    public final float q3BipwRCk;

    public X47LlE0dx(float f) {
        this.q3BipwRCk = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X47LlE0dx) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(((X47LlE0dx) obj).q3BipwRCk));
    }

    public int hashCode() {
        return Float.hashCode(this.q3BipwRCk);
    }

    @Override // con.wYE0YFI4V
    public float q3BipwRCk(long j, AU29aHa4X aU29aHa4X) {
        return (this.q3BipwRCk / 100.0f) * tbzY8QG6X.dIocxURUo(j);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CornerSize(size = ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append("%)");
        return q3BipwRCk.toString();
    }
}
