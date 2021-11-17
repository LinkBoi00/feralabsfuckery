package con;
/* loaded from: classes.dex */
public final class dY6cOIPvm implements KqzoSSpJV {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;
    public final unvqWbaGj tGV7Q6urW;

    public dY6cOIPvm(int i, int i2, lOtvezK70 lotvezk70) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = new unvqWbaGj(new iTgvVSs9V(i, i2, lotvezk70));
    }

    @Override // con.bfRmVSaJr
    public long GPLPRo6go(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return ((long) (this.q3BipwRCk + this.J4Ux7ym32)) * 1000000;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 J4Ux7ym32(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return this.tGV7Q6urW.J4Ux7ym32(j, jocybbwa4, jocybbwa42, jocybbwa43);
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 dIocxURUo(jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return J4Ux7ym32(((long) (this.q3BipwRCk + this.J4Ux7ym32)) * 1000000, jocybbwa4, jocybbwa42, jocybbwa43);
    }

    @Override // con.KqzoSSpJV
    public int iiGwOFFnr() {
        return this.J4Ux7ym32;
    }

    @Override // con.bfRmVSaJr
    public jOCYbBWA4 kCA6Zs9sL(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42, jOCYbBWA4 jocybbwa43) {
        return this.tGV7Q6urW.kCA6Zs9sL(j, jocybbwa4, jocybbwa42, jocybbwa43);
    }

    @Override // con.bfRmVSaJr
    public boolean q3BipwRCk() {
        return false;
    }

    @Override // con.KqzoSSpJV
    public int tGV7Q6urW() {
        return this.q3BipwRCk;
    }
}
