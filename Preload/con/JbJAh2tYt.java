package con;
/* loaded from: classes.dex */
public final class JbJAh2tYt implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;

    public JbJAh2tYt(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JbJAh2tYt)) {
            return false;
        }
        JbJAh2tYt jbJAh2tYt = (JbJAh2tYt) obj;
        return this.q3BipwRCk == jbJAh2tYt.q3BipwRCk && this.J4Ux7ym32 == jbJAh2tYt.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk * 31) + this.J4Ux7ym32;
    }

    @Override // con.wX7bxQPFb
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(this.q3BipwRCk, 0, gib52uzmw.dIocxURUo());
        int kCA6Zs9sL2 = cT9gik1zL.kCA6Zs9sL(this.J4Ux7ym32, 0, gib52uzmw.dIocxURUo());
        if (kCA6Zs9sL < kCA6Zs9sL2) {
            gib52uzmw.Puu3Rhg4F(kCA6Zs9sL, kCA6Zs9sL2);
        } else {
            gib52uzmw.Puu3Rhg4F(kCA6Zs9sL2, kCA6Zs9sL);
        }
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SetSelectionCommand(start=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", end=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
