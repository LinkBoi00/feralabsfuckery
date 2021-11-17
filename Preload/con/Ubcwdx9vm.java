package con;
/* loaded from: classes.dex */
public final class Ubcwdx9vm {
    public final /* synthetic */ OpkJLRxhD q3BipwRCk;

    public Ubcwdx9vm(OpkJLRxhD opkJLRxhD) {
        this.q3BipwRCk = opkJLRxhD;
    }

    public void J4Ux7ym32(float f, float f2, float f3, float f4) {
        SI0VpKubr q3BipwRCk = this.q3BipwRCk.q3BipwRCk();
        OpkJLRxhD opkJLRxhD = this.q3BipwRCk;
        long J4Ux7ym32 = gThLCaTO1.J4Ux7ym32(tbzY8QG6X.kCA6Zs9sL(opkJLRxhD.J4Ux7ym32()) - (f3 + f), tbzY8QG6X.tGV7Q6urW(this.q3BipwRCk.J4Ux7ym32()) - (f4 + f2));
        if (tbzY8QG6X.kCA6Zs9sL(J4Ux7ym32) >= 0.0f && tbzY8QG6X.tGV7Q6urW(J4Ux7ym32) >= 0.0f) {
            opkJLRxhD.tGV7Q6urW(J4Ux7ym32);
            q3BipwRCk.dXrmkklc8(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    public void dIocxURUo(float f, float f2) {
        this.q3BipwRCk.q3BipwRCk().dXrmkklc8(f, f2);
    }

    public void q3BipwRCk(float f, float f2, float f3, float f4, int i) {
        this.q3BipwRCk.q3BipwRCk().Eeka1udhb(f, f2, f3, f4, i);
    }

    public void tGV7Q6urW(float f, float f2, long j) {
        SI0VpKubr q3BipwRCk = this.q3BipwRCk.q3BipwRCk();
        q3BipwRCk.dXrmkklc8(bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j));
        q3BipwRCk.iiGwOFFnr(f, f2);
        q3BipwRCk.dXrmkklc8(-bRgfgYIQX.tGV7Q6urW(j), -bRgfgYIQX.dIocxURUo(j));
    }
}
