package con;
/* loaded from: classes.dex */
public final class VGh7XGpXv implements Qu7jcd5XZ {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;
    public final lOtvezK70 tGV7Q6urW;

    public VGh7XGpXv(int i, int i2, lOtvezK70 lotvezk70) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = lotvezk70;
    }

    public VGh7XGpXv(int i, int i2, lOtvezK70 lotvezk70, int i3) {
        i = (i3 & 1) != 0 ? 300 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 4) != 0) {
            lOtvezK70 lotvezk702 = TqRcaVEga.q3BipwRCk;
            lotvezk70 = TqRcaVEga.q3BipwRCk;
        }
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = lotvezk70;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VGh7XGpXv)) {
            return false;
        }
        VGh7XGpXv vGh7XGpXv = (VGh7XGpXv) obj;
        return vGh7XGpXv.q3BipwRCk == this.q3BipwRCk && vGh7XGpXv.J4Ux7ym32 == this.J4Ux7ym32 && anXlDk6fV.tGV7Q6urW(vGh7XGpXv.tGV7Q6urW, this.tGV7Q6urW);
    }

    public int hashCode() {
        return ((this.tGV7Q6urW.hashCode() + (this.q3BipwRCk * 31)) * 31) + this.J4Ux7ym32;
    }

    @Override // con.Qu7jcd5XZ, con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new dY6cOIPvm(this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW);
    }

    @Override // con.Qu7jcd5XZ, con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public KqzoSSpJV mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new dY6cOIPvm(this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW);
    }
}
