package con;
/* loaded from: classes.dex */
public abstract class etphh5KhI implements JZuV4yGnu {
    public final wYE0YFI4V J4Ux7ym32;
    public final wYE0YFI4V dIocxURUo;
    public final wYE0YFI4V q3BipwRCk;
    public final wYE0YFI4V tGV7Q6urW;

    public etphh5KhI(wYE0YFI4V wye0yfi4v, wYE0YFI4V wye0yfi4v2, wYE0YFI4V wye0yfi4v3, wYE0YFI4V wye0yfi4v4) {
        this.q3BipwRCk = wye0yfi4v;
        this.J4Ux7ym32 = wye0yfi4v2;
        this.tGV7Q6urW = wye0yfi4v3;
        this.dIocxURUo = wye0yfi4v4;
    }

    @Override // con.JZuV4yGnu
    public final FHtrhXyto q3BipwRCk(long j, BFRsKhrQv bFRsKhrQv, AU29aHa4X aU29aHa4X) {
        float q3BipwRCk = this.q3BipwRCk.q3BipwRCk(j, aU29aHa4X);
        float q3BipwRCk2 = this.J4Ux7ym32.q3BipwRCk(j, aU29aHa4X);
        float q3BipwRCk3 = this.tGV7Q6urW.q3BipwRCk(j, aU29aHa4X);
        float q3BipwRCk4 = this.dIocxURUo.q3BipwRCk(j, aU29aHa4X);
        float dIocxURUo = tbzY8QG6X.dIocxURUo(j);
        float f = q3BipwRCk + q3BipwRCk4;
        if (f > dIocxURUo) {
            float f2 = dIocxURUo / f;
            q3BipwRCk *= f2;
            q3BipwRCk4 *= f2;
        }
        float f3 = q3BipwRCk2 + q3BipwRCk3;
        if (f3 > dIocxURUo) {
            float f4 = dIocxURUo / f3;
            q3BipwRCk2 *= f4;
            q3BipwRCk3 *= f4;
        }
        boolean z = true;
        if (q3BipwRCk >= 0.0f && q3BipwRCk2 >= 0.0f && q3BipwRCk3 >= 0.0f && q3BipwRCk4 >= 0.0f) {
            if (q3BipwRCk + q3BipwRCk2 + q3BipwRCk3 + q3BipwRCk4 != 0.0f) {
                z = false;
            }
            if (z) {
                return new MFcZC5k5k(gThLCaTO1.dfpT1j18n(j));
            }
            bzmJZsHMu dfpT1j18n = gThLCaTO1.dfpT1j18n(j);
            BFRsKhrQv bFRsKhrQv2 = BFRsKhrQv.Ltr;
            long J4Ux7ym32 = ODug2UCW1.J4Ux7ym32(bFRsKhrQv == bFRsKhrQv2 ? q3BipwRCk : q3BipwRCk2, 0.0f, 2);
            if (bFRsKhrQv == bFRsKhrQv2) {
                q3BipwRCk = q3BipwRCk2;
            }
            long J4Ux7ym322 = ODug2UCW1.J4Ux7ym32(q3BipwRCk, 0.0f, 2);
            long J4Ux7ym323 = ODug2UCW1.J4Ux7ym32(bFRsKhrQv == bFRsKhrQv2 ? q3BipwRCk3 : q3BipwRCk4, 0.0f, 2);
            if (bFRsKhrQv != bFRsKhrQv2) {
                q3BipwRCk4 = q3BipwRCk3;
            }
            return new iJM2jNPIz(new wOXdxhlrk(dfpT1j18n.q3BipwRCk, dfpT1j18n.J4Ux7ym32, dfpT1j18n.tGV7Q6urW, dfpT1j18n.dIocxURUo, J4Ux7ym32, J4Ux7ym322, J4Ux7ym323, ODug2UCW1.J4Ux7ym32(q3BipwRCk4, 0.0f, 2), null));
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + q3BipwRCk + ", topEnd = " + q3BipwRCk2 + ", bottomEnd = " + q3BipwRCk3 + ", bottomStart = " + q3BipwRCk4 + ")!").toString());
    }
}
