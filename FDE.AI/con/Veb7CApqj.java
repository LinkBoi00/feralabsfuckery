package con;
/* loaded from: classes.dex */
public final class Veb7CApqj implements qRGoInHan {
    public final float J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    public Veb7CApqj(int i) {
        this.q3BipwRCk = i;
        if (i == 1) {
            this.J4Ux7ym32 = (float) 0;
        } else if (i == 2) {
            this.J4Ux7ym32 = (float) 0;
        } else if (i != 3) {
            this.J4Ux7ym32 = (float) 0;
        } else {
            this.J4Ux7ym32 = (float) 0;
        }
    }

    @Override // con.MEtaL9md5
    public void J4Ux7ym32(AU29aHa4X aU29aHa4X, int i, int[] iArr, int[] iArr2) {
        switch (this.q3BipwRCk) {
            case 0:
                xSTZH8Y9P.q3BipwRCk.q3BipwRCk(i, iArr, iArr2, false);
                return;
            case 1:
                xSTZH8Y9P.q3BipwRCk.dIocxURUo(i, iArr, iArr2, false);
                return;
            case 2:
                xSTZH8Y9P.q3BipwRCk.kCA6Zs9sL(i, iArr, iArr2, false);
                return;
            default:
                xSTZH8Y9P.q3BipwRCk.iiGwOFFnr(i, iArr, iArr2, false);
                return;
        }
    }

    @Override // con.xrlB614az
    public float q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                return this.J4Ux7ym32;
            case 1:
                return this.J4Ux7ym32;
            case 2:
                return this.J4Ux7ym32;
            default:
                return this.J4Ux7ym32;
        }
    }

    @Override // con.xrlB614az
    public void tGV7Q6urW(AU29aHa4X aU29aHa4X, int i, int[] iArr, BFRsKhrQv bFRsKhrQv, int[] iArr2) {
        xSTZH8Y9P xstzh8y9p;
        xSTZH8Y9P xstzh8y9p2;
        xSTZH8Y9P xstzh8y9p3;
        xSTZH8Y9P xstzh8y9p4;
        BFRsKhrQv bFRsKhrQv2 = BFRsKhrQv.Ltr;
        boolean z = false;
        switch (this.q3BipwRCk) {
            case 0:
                if (bFRsKhrQv == bFRsKhrQv2) {
                    xstzh8y9p2 = xSTZH8Y9P.q3BipwRCk;
                } else {
                    xstzh8y9p2 = xSTZH8Y9P.q3BipwRCk;
                    z = true;
                }
                xstzh8y9p2.q3BipwRCk(i, iArr, iArr2, z);
                return;
            case 1:
                if (bFRsKhrQv == bFRsKhrQv2) {
                    xstzh8y9p3 = xSTZH8Y9P.q3BipwRCk;
                } else {
                    xstzh8y9p3 = xSTZH8Y9P.q3BipwRCk;
                    z = true;
                }
                xstzh8y9p3.dIocxURUo(i, iArr, iArr2, z);
                return;
            case 2:
                if (bFRsKhrQv == bFRsKhrQv2) {
                    xstzh8y9p4 = xSTZH8Y9P.q3BipwRCk;
                } else {
                    xstzh8y9p4 = xSTZH8Y9P.q3BipwRCk;
                    z = true;
                }
                xstzh8y9p4.kCA6Zs9sL(i, iArr, iArr2, z);
                return;
            default:
                if (bFRsKhrQv == bFRsKhrQv2) {
                    xstzh8y9p = xSTZH8Y9P.q3BipwRCk;
                } else {
                    xstzh8y9p = xSTZH8Y9P.q3BipwRCk;
                    z = true;
                }
                xstzh8y9p.iiGwOFFnr(i, iArr, iArr2, z);
                return;
        }
    }

    public String toString() {
        switch (this.q3BipwRCk) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
