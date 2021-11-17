package con;
/* loaded from: classes.dex */
public final class S1rM3yRIe {
    public final boolean J4Ux7ym32;
    public final int dIocxURUo;
    public final int q3BipwRCk;
    public final int tGV7Q6urW;
    public static final uEb6wTQlg kCA6Zs9sL = new uEb6wTQlg(0);
    public static final S1rM3yRIe iiGwOFFnr = new S1rM3yRIe(0, false, 0, 0, 15);

    public S1rM3yRIe(int i, boolean z, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        z = (i4 & 2) != 0 ? true : z;
        i2 = (i4 & 4) != 0 ? 1 : i2;
        i3 = (i4 & 8) != 0 ? 1 : i3;
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = z;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1rM3yRIe)) {
            return false;
        }
        S1rM3yRIe s1rM3yRIe = (S1rM3yRIe) obj;
        return AMRrOPXuW.q3BipwRCk(this.q3BipwRCk, s1rM3yRIe.q3BipwRCk) && this.J4Ux7ym32 == s1rM3yRIe.J4Ux7ym32 && qv9mRCVmB.q3BipwRCk(this.tGV7Q6urW, s1rM3yRIe.tGV7Q6urW) && exvFNe8oO.q3BipwRCk(this.dIocxURUo, s1rM3yRIe.dIocxURUo);
    }

    public int hashCode() {
        return ((((Boolean.hashCode(this.J4Ux7ym32) + (Integer.hashCode(this.q3BipwRCk) * 31)) * 31) + Integer.hashCode(this.tGV7Q6urW)) * 31) + Integer.hashCode(this.dIocxURUo);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("KeyboardOptions(capitalization=");
        q3BipwRCk.append((Object) AMRrOPXuW.J4Ux7ym32(this.q3BipwRCk));
        q3BipwRCk.append(", autoCorrect=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", keyboardType=");
        q3BipwRCk.append((Object) qv9mRCVmB.J4Ux7ym32(this.tGV7Q6urW));
        q3BipwRCk.append(", imeAction=");
        q3BipwRCk.append((Object) exvFNe8oO.J4Ux7ym32(this.dIocxURUo));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
