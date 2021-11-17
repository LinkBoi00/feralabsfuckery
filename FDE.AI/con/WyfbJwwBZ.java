package con;
/* loaded from: classes.dex */
public final class WyfbJwwBZ {
    public static final ksLrMHgEz J4Ux7ym32 = new ksLrMHgEz(null, 16);
    public static final long tGV7Q6urW = gThLCaTO1.kCA6Zs9sL(0.5f, 0.5f);
    public final long q3BipwRCk;

    public /* synthetic */ WyfbJwwBZ(long j) {
        this.q3BipwRCk = j;
    }

    public static final float J4Ux7ym32(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float q3BipwRCk(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String tGV7Q6urW(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof WyfbJwwBZ) && j == ((WyfbJwwBZ) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return tGV7Q6urW(this.q3BipwRCk);
    }
}
