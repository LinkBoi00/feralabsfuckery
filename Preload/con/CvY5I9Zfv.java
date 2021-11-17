package con;
/* loaded from: classes.dex */
public class CvY5I9Zfv {
    public CvY5I9Zfv J4Ux7ym32;
    public long q3BipwRCk = 0;

    public void GPLPRo6go() {
        this.q3BipwRCk = 0;
        CvY5I9Zfv cvY5I9Zfv = this.J4Ux7ym32;
        if (cvY5I9Zfv != null) {
            cvY5I9Zfv.GPLPRo6go();
        }
    }

    public int J4Ux7ym32(int i) {
        long j;
        CvY5I9Zfv cvY5I9Zfv = this.J4Ux7ym32;
        if (cvY5I9Zfv == null) {
            if (i >= 64) {
                j = this.q3BipwRCk;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.q3BipwRCk) + cvY5I9Zfv.J4Ux7ym32(i - 64);
        }
        j = this.q3BipwRCk & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    public void Puu3Rhg4F(int i) {
        if (i >= 64) {
            tGV7Q6urW();
            this.J4Ux7ym32.Puu3Rhg4F(i - 64);
            return;
        }
        this.q3BipwRCk |= 1 << i;
    }

    public boolean dIocxURUo(int i) {
        if (i < 64) {
            return (this.q3BipwRCk & (1 << i)) != 0;
        }
        tGV7Q6urW();
        return this.J4Ux7ym32.dIocxURUo(i - 64);
    }

    public boolean iiGwOFFnr(int i) {
        if (i >= 64) {
            tGV7Q6urW();
            return this.J4Ux7ym32.iiGwOFFnr(i - 64);
        }
        long j = 1 << i;
        long j2 = this.q3BipwRCk;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.q3BipwRCk = j3;
        long j4 = j - 1;
        this.q3BipwRCk = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        CvY5I9Zfv cvY5I9Zfv = this.J4Ux7ym32;
        if (cvY5I9Zfv != null) {
            if (cvY5I9Zfv.dIocxURUo(0)) {
                Puu3Rhg4F(63);
            }
            this.J4Ux7ym32.iiGwOFFnr(0);
        }
        return z;
    }

    public void kCA6Zs9sL(int i, boolean z) {
        if (i >= 64) {
            tGV7Q6urW();
            this.J4Ux7ym32.kCA6Zs9sL(i - 64, z);
            return;
        }
        long j = this.q3BipwRCk;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.q3BipwRCk = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            Puu3Rhg4F(i);
        } else {
            q3BipwRCk(i);
        }
        if (z2 || this.J4Ux7ym32 != null) {
            tGV7Q6urW();
            this.J4Ux7ym32.kCA6Zs9sL(0, z2);
        }
    }

    public void q3BipwRCk(int i) {
        if (i >= 64) {
            CvY5I9Zfv cvY5I9Zfv = this.J4Ux7ym32;
            if (cvY5I9Zfv != null) {
                cvY5I9Zfv.q3BipwRCk(i - 64);
                return;
            }
            return;
        }
        this.q3BipwRCk &= ~(1 << i);
    }

    public final void tGV7Q6urW() {
        if (this.J4Ux7ym32 == null) {
            this.J4Ux7ym32 = new CvY5I9Zfv();
        }
    }

    public String toString() {
        if (this.J4Ux7ym32 == null) {
            return Long.toBinaryString(this.q3BipwRCk);
        }
        return this.J4Ux7ym32.toString() + "xx" + Long.toBinaryString(this.q3BipwRCk);
    }
}
