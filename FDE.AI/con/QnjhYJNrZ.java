package con;
/* loaded from: classes.dex */
public final class QnjhYJNrZ {
    public final long q3BipwRCk;
    public static final rstHZ5Gu8 J4Ux7ym32 = new rstHZ5Gu8(0);
    public static final fzM0nB5KM[] tGV7Q6urW = {new fzM0nB5KM(0), new fzM0nB5KM(4294967296L), new fzM0nB5KM(8589934592L)};
    public static final long dIocxURUo = BBVaGLNaU.vNtjxmzUM(0, Float.NaN);

    public /* synthetic */ QnjhYJNrZ(long j) {
        this.q3BipwRCk = j;
    }

    public static final long J4Ux7ym32(long j) {
        return tGV7Q6urW[(int) ((j & 1095216660480L) >>> 32)].q3BipwRCk;
    }

    public static String dIocxURUo(long j) {
        StringBuilder sb;
        String str;
        long J4Ux7ym322 = J4Ux7ym32(j);
        if (fzM0nB5KM.q3BipwRCk(J4Ux7ym322, 0)) {
            return "Unspecified";
        }
        if (fzM0nB5KM.q3BipwRCk(J4Ux7ym322, 4294967296L)) {
            sb = new StringBuilder();
            sb.append(tGV7Q6urW(j));
            str = ".sp";
        } else if (!fzM0nB5KM.q3BipwRCk(J4Ux7ym322, 8589934592L)) {
            return "Invalid";
        } else {
            sb = new StringBuilder();
            sb.append(tGV7Q6urW(j));
            str = ".em";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final boolean q3BipwRCk(long j, long j2) {
        return j == j2;
    }

    public static final float tGV7Q6urW(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        long j = this.q3BipwRCk;
        if ((obj instanceof QnjhYJNrZ) && j == ((QnjhYJNrZ) obj).q3BipwRCk) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.q3BipwRCk);
    }

    public String toString() {
        return dIocxURUo(this.q3BipwRCk);
    }
}
