package con;
/* loaded from: classes.dex */
public final class elk9YiMBN {
    public static final uEb6wTQlg J4Ux7ym32 = new uEb6wTQlg(0);
    public static final long tGV7Q6urW = D3DEikrvb.J4Ux7ym32(Float.NaN, Float.NaN);
    public final long q3BipwRCk;

    static {
        float f = (float) 0;
        D3DEikrvb.J4Ux7ym32(f, f);
    }

    public /* synthetic */ elk9YiMBN(long j) {
        this.q3BipwRCk = j;
    }

    public static final float J4Ux7ym32(long j) {
        if (j != tGV7Q6urW) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float q3BipwRCk(long j) {
        if (j != tGV7Q6urW) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof elk9YiMBN) && j == ((elk9YiMBN) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        long j = this.q3BipwRCk;
        if (!(j != tGV7Q6urW)) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) lRwPpHNL9.J4Ux7ym32(q3BipwRCk(j))) + ", " + ((Object) lRwPpHNL9.J4Ux7ym32(J4Ux7ym32(j))) + ')';
    }
}
