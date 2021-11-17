package con;
/* loaded from: classes.dex */
public final class wozWTi35b {
    public final int J4Ux7ym32;
    public final int dIocxURUo;
    public final int kCA6Zs9sL;
    public final boolean q3BipwRCk;
    public final boolean tGV7Q6urW;
    public static final joOFKdxvJ iiGwOFFnr = new joOFKdxvJ(0);
    public static final wozWTi35b GPLPRo6go = new wozWTi35b(false, 0, false, 0, 0, 31);

    public wozWTi35b(boolean z, int i, boolean z2, int i2, int i3, int i4) {
        z = (i4 & 1) != 0 ? false : z;
        i = (i4 & 2) != 0 ? 0 : i;
        z2 = (i4 & 4) != 0 ? true : z2;
        i2 = (i4 & 8) != 0 ? 1 : i2;
        i3 = (i4 & 16) != 0 ? 1 : i3;
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = z2;
        this.dIocxURUo = i2;
        this.kCA6Zs9sL = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wozWTi35b)) {
            return false;
        }
        wozWTi35b wozwti35b = (wozWTi35b) obj;
        return this.q3BipwRCk == wozwti35b.q3BipwRCk && AMRrOPXuW.q3BipwRCk(this.J4Ux7ym32, wozwti35b.J4Ux7ym32) && this.tGV7Q6urW == wozwti35b.tGV7Q6urW && qv9mRCVmB.q3BipwRCk(this.dIocxURUo, wozwti35b.dIocxURUo) && exvFNe8oO.q3BipwRCk(this.kCA6Zs9sL, wozwti35b.kCA6Zs9sL);
    }

    public int hashCode() {
        return ((((Boolean.hashCode(this.tGV7Q6urW) + (((Boolean.hashCode(this.q3BipwRCk) * 31) + Integer.hashCode(this.J4Ux7ym32)) * 31)) * 31) + Integer.hashCode(this.dIocxURUo)) * 31) + Integer.hashCode(this.kCA6Zs9sL);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ImeOptions(singleLine=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", capitalization=");
        q3BipwRCk.append((Object) AMRrOPXuW.J4Ux7ym32(this.J4Ux7ym32));
        q3BipwRCk.append(", autoCorrect=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", keyboardType=");
        q3BipwRCk.append((Object) qv9mRCVmB.J4Ux7ym32(this.dIocxURUo));
        q3BipwRCk.append(", imeAction=");
        q3BipwRCk.append((Object) exvFNe8oO.J4Ux7ym32(this.kCA6Zs9sL));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public wozWTi35b(boolean z, int i, boolean z2, int i2, int i3, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = z2;
        this.dIocxURUo = i2;
        this.kCA6Zs9sL = i3;
    }
}
