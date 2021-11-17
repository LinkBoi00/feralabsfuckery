package con;
/* loaded from: classes.dex */
public final class SLFBujE8J {
    public final float q3BipwRCk;

    public /* synthetic */ SLFBujE8J(float f) {
        this.q3BipwRCk = f;
    }

    public boolean equals(Object obj) {
        float f = this.q3BipwRCk;
        if (!(obj instanceof SLFBujE8J)) {
            return false;
        }
        if (!anXlDk6fV.tGV7Q6urW(Float.valueOf(f), Float.valueOf(((SLFBujE8J) obj).q3BipwRCk))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        float f = this.q3BipwRCk;
        return "BaselineShift(multiplier=" + f + ')';
    }
}
