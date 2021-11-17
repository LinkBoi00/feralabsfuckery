package con;
/* loaded from: classes.dex */
public final class IQdzbaj10 implements bfRmVSaJr {
    public final int J4Ux7ym32;
    public final long dIocxURUo;
    public final KqzoSSpJV q3BipwRCk;
    public final long tGV7Q6urW;

    public IQdzbaj10(KqzoSSpJV kqzoSSpJV, int i, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = kqzoSSpJV;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = ((long) (kqzoSSpJV.tGV7Q6urW() + kqzoSSpJV.iiGwOFFnr())) * 1000000;
        this.dIocxURUo = j * 1000000;
    }

    @Override // con.bfRmVSaJr
    public long GPLPRo6go(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return Long.MAX_VALUE;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 J4Ux7ym32(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return this.q3BipwRCk.J4Ux7ym32(Puu3Rhg4F(j), jocybbwa4, jocybbwa42, yWvV4ePLl(j, jocybbwa4, jocybbwa43, jocybbwa42));
    }

    public final long Puu3Rhg4F(long j) {
        long j2 = j + this.dIocxURUo;
        if (j2 <= 0) {
            return 0;
        }
        long j3 = this.tGV7Q6urW;
        long j4 = j2 / j3;
        return (this.J4Ux7ym32 == 1 || j4 % ((long) 2) == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 dIocxURUo(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return J4Ux7ym32(Long.MAX_VALUE, jocybbwa4, jocybbwa42, jocybbwa43);
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 kCA6Zs9sL(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return this.q3BipwRCk.kCA6Zs9sL(Puu3Rhg4F(j), jocybbwa4, jocybbwa42, yWvV4ePLl(j, jocybbwa4, jocybbwa43, jocybbwa42));
    }

    @Override // con.bfRmVSaJr
    public boolean q3BipwRCk() {
        return true;
    }

    public final jOCYbBWA4 yWvV4ePLl(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        long j2 = this.dIocxURUo;
        long j3 = this.tGV7Q6urW;
        return j + j2 > j3 ? J4Ux7ym32(j3 - j2, jocybbwa4, jocybbwa42, jocybbwa43) : jocybbwa42;
    }
}
