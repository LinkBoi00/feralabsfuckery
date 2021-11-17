package con;
/* loaded from: classes.dex */
public final class MHv2Ig8xA {
    public final float J4Ux7ym32;
    public final float dIocxURUo;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    public MHv2Ig8xA(float f, float f2, float f3, float f4, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
    }

    public float J4Ux7ym32(BFRsKhrQv bFRsKhrQv) {
        if (bFRsKhrQv == BFRsKhrQv.Ltr) {
            return this.tGV7Q6urW;
        }
        return this.q3BipwRCk;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MHv2Ig8xA)) {
            return false;
        }
        MHv2Ig8xA mHv2Ig8xA = (MHv2Ig8xA) obj;
        if (!lRwPpHNL9.q3BipwRCk(this.q3BipwRCk, mHv2Ig8xA.q3BipwRCk) || !lRwPpHNL9.q3BipwRCk(this.J4Ux7ym32, mHv2Ig8xA.J4Ux7ym32) || !lRwPpHNL9.q3BipwRCk(this.tGV7Q6urW, mHv2Ig8xA.tGV7Q6urW) || !lRwPpHNL9.q3BipwRCk(this.dIocxURUo, mHv2Ig8xA.dIocxURUo)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.q3BipwRCk) * 31) + Float.hashCode(this.J4Ux7ym32)) * 31) + Float.hashCode(this.tGV7Q6urW)) * 31) + Float.hashCode(this.dIocxURUo);
    }

    public float q3BipwRCk(BFRsKhrQv bFRsKhrQv) {
        if (bFRsKhrQv == BFRsKhrQv.Ltr) {
            return this.q3BipwRCk;
        }
        return this.tGV7Q6urW;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PaddingValues(start=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.q3BipwRCk));
        q3BipwRCk.append(", top=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.J4Ux7ym32));
        q3BipwRCk.append(", end=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.tGV7Q6urW));
        q3BipwRCk.append(", bottom=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.dIocxURUo));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
