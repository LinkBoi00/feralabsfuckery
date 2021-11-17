package con;
/* loaded from: classes.dex */
public class SkzwiTATT {
    public int J4Ux7ym32;
    public int dIocxURUo;
    public int kCA6Zs9sL;
    public int q3BipwRCk = 0;
    public int tGV7Q6urW;

    public int J4Ux7ym32(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    public boolean q3BipwRCk() {
        int i = this.q3BipwRCk;
        if ((i & 7) != 0 && (i & (J4Ux7ym32(this.dIocxURUo, this.J4Ux7ym32) << 0)) == 0) {
            return false;
        }
        int i2 = this.q3BipwRCk;
        if ((i2 & 112) != 0 && (i2 & (J4Ux7ym32(this.dIocxURUo, this.tGV7Q6urW) << 4)) == 0) {
            return false;
        }
        int i3 = this.q3BipwRCk;
        if ((i3 & 1792) != 0 && (i3 & (J4Ux7ym32(this.kCA6Zs9sL, this.J4Ux7ym32) << 8)) == 0) {
            return false;
        }
        int i4 = this.q3BipwRCk;
        return (i4 & 28672) == 0 || (i4 & (J4Ux7ym32(this.kCA6Zs9sL, this.tGV7Q6urW) << 12)) != 0;
    }
}
