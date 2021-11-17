package con;
/* loaded from: classes.dex */
public final class WI3XTEIMS {
    public final m0AevvDOv J4Ux7ym32;
    public final int dIocxURUo;
    public final Vyo35YgKP q3BipwRCk;
    public final int tGV7Q6urW;

    public WI3XTEIMS(Vyo35YgKP vyo35YgKP, m0AevvDOv m0aevvdov, int i, int i2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = vyo35YgKP;
        this.J4Ux7ym32 = m0aevvdov;
        this.tGV7Q6urW = i;
        this.dIocxURUo = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WI3XTEIMS)) {
            return false;
        }
        WI3XTEIMS wi3xteims = (WI3XTEIMS) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, wi3xteims.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, wi3xteims.J4Ux7ym32) && JI2JIz7iN.q3BipwRCk(this.tGV7Q6urW, wi3xteims.tGV7Q6urW) && Z7oCchjRS.q3BipwRCk(this.dIocxURUo, wi3xteims.dIocxURUo);
    }

    public int hashCode() {
        Vyo35YgKP vyo35YgKP = this.q3BipwRCk;
        int hashCode = vyo35YgKP == null ? 0 : vyo35YgKP.hashCode();
        int i = this.dIocxURUo;
        oWhsE8IPp owhse8ipp = Z7oCchjRS.J4Ux7ym32;
        return (((((hashCode * 31) + this.J4Ux7ym32.CBQ5d1kRq) * 31) + Integer.hashCode(this.tGV7Q6urW)) * 31) + Integer.hashCode(i);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CacheKey(fontFamily=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", fontWeight=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", fontStyle=");
        q3BipwRCk.append((Object) JI2JIz7iN.J4Ux7ym32(this.tGV7Q6urW));
        q3BipwRCk.append(", fontSynthesis=");
        q3BipwRCk.append((Object) Z7oCchjRS.J4Ux7ym32(this.dIocxURUo));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
