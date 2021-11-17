package con;
/* loaded from: classes.dex */
public final class Ai1mFpeWT {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;
    public final long tGV7Q6urW;

    public Ai1mFpeWT(float f, float f2, long j) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai1mFpeWT)) {
            return false;
        }
        Ai1mFpeWT ai1mFpeWT = (Ai1mFpeWT) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(ai1mFpeWT.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(ai1mFpeWT.J4Ux7ym32)) && this.tGV7Q6urW == ai1mFpeWT.tGV7Q6urW;
    }

    public int hashCode() {
        return Long.hashCode(this.tGV7Q6urW) + gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FlingInfo(initialVelocity=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", distance=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", duration=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
