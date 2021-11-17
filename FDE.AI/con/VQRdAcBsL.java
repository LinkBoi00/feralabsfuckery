package con;
/* loaded from: classes.dex */
public final class VQRdAcBsL implements B01AuRyT3 {
    public final float J4Ux7ym32;
    public final float tGV7Q6urW;

    public VQRdAcBsL(float f, float f2) {
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VQRdAcBsL)) {
            return false;
        }
        VQRdAcBsL vQRdAcBsL = (VQRdAcBsL) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(vQRdAcBsL.J4Ux7ym32)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(vQRdAcBsL.tGV7Q6urW));
    }

    public int hashCode() {
        return Float.hashCode(this.tGV7Q6urW) + (Float.hashCode(this.J4Ux7ym32) * 31);
    }

    public long q3BipwRCk(long j, long j2, BFRsKhrQv bFRsKhrQv) {
        float tGV7Q6urW = ((float) (YWiUMZOtw.tGV7Q6urW(j2) - YWiUMZOtw.tGV7Q6urW(j))) / 2.0f;
        float J4Ux7ym32 = ((float) (YWiUMZOtw.J4Ux7ym32(j2) - YWiUMZOtw.J4Ux7ym32(j))) / 2.0f;
        float f = (float) 1;
        return dnBSj5uJN.tGV7Q6urW(D3DEikrvb.Eeka1udhb(((bFRsKhrQv == BFRsKhrQv.Ltr ? this.J4Ux7ym32 : ((float) -1) * this.J4Ux7ym32) + f) * tGV7Q6urW), D3DEikrvb.Eeka1udhb((f + this.tGV7Q6urW) * J4Ux7ym32));
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("BiasAlignment(horizontalBias=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", verticalBias=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ')');
    }
}
