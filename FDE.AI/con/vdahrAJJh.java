package con;
/* loaded from: classes.dex */
public final class vdahrAJJh {
    public final long GPLPRo6go;
    public final float J4Ux7ym32;
    public final int Puu3Rhg4F;
    public final float dIocxURUo;
    public final ZOOhBHi6I iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final String q3BipwRCk;
    public final float tGV7Q6urW;

    public vdahrAJJh(String str, float f, float f2, float f3, float f4, ZOOhBHi6I zOOhBHi6I, long j, int i, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = f2;
        this.dIocxURUo = f3;
        this.kCA6Zs9sL = f4;
        this.iiGwOFFnr = zOOhBHi6I;
        this.GPLPRo6go = j;
        this.Puu3Rhg4F = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdahrAJJh)) {
            return false;
        }
        vdahrAJJh vdahrajjh = (vdahrAJJh) obj;
        if (!anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, vdahrajjh.q3BipwRCk) || !lRwPpHNL9.q3BipwRCk(this.J4Ux7ym32, vdahrajjh.J4Ux7ym32) || !lRwPpHNL9.q3BipwRCk(this.tGV7Q6urW, vdahrajjh.tGV7Q6urW)) {
            return false;
        }
        if (!(this.dIocxURUo == vdahrajjh.dIocxURUo)) {
            return false;
        }
        return ((this.kCA6Zs9sL > vdahrajjh.kCA6Zs9sL ? 1 : (this.kCA6Zs9sL == vdahrajjh.kCA6Zs9sL ? 0 : -1)) == 0) && anXlDk6fV.tGV7Q6urW(this.iiGwOFFnr, vdahrajjh.iiGwOFFnr) && bO2dbmrf7.tGV7Q6urW(this.GPLPRo6go, vdahrajjh.GPLPRo6go) && KtdRQT1Je.q3BipwRCk(this.Puu3Rhg4F, vdahrajjh.Puu3Rhg4F);
    }

    public int hashCode() {
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, gXNsYvZus.q3BipwRCk(this.tGV7Q6urW, gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, this.q3BipwRCk.hashCode() * 31, 31), 31), 31), 31);
        int q3BipwRCk2 = E9zMhyPXW.q3BipwRCk(this.GPLPRo6go, (this.iiGwOFFnr.hashCode() + q3BipwRCk) * 31, 31);
        int i = this.Puu3Rhg4F;
        ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
        return Integer.hashCode(i) + q3BipwRCk2;
    }
}
