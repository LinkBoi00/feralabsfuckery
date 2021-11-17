package con;
/* loaded from: classes.dex */
public final class lRwPpHNL9 implements Comparable {
    public final float CBQ5d1kRq;

    public /* synthetic */ lRwPpHNL9(float f) {
        this.CBQ5d1kRq = f;
    }

    public static String J4Ux7ym32(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean q3BipwRCk(float f, float f2) {
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return Float.compare(this.CBQ5d1kRq, ((lRwPpHNL9) obj).CBQ5d1kRq);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        float f = this.CBQ5d1kRq;
        if (!(obj instanceof lRwPpHNL9)) {
            return false;
        }
        if (!anXlDk6fV.tGV7Q6urW(Float.valueOf(f), Float.valueOf(((lRwPpHNL9) obj).CBQ5d1kRq))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Float.hashCode(this.CBQ5d1kRq);
    }

    @Override // java.lang.Object
    public String toString() {
        return J4Ux7ym32(this.CBQ5d1kRq);
    }
}
