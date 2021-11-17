package con;
/* loaded from: classes.dex */
public final class qtBXPTlxW implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;

    public qtBXPTlxW(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtBXPTlxW)) {
            return false;
        }
        qtBXPTlxW qtbxptlxw = (qtBXPTlxW) obj;
        return this.q3BipwRCk == qtbxptlxw.q3BipwRCk && this.J4Ux7ym32 == qtbxptlxw.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk * 31) + this.J4Ux7ym32;
    }

    @Override // con.wX7bxQPFb
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        if (gib52uzmw.kCA6Zs9sL()) {
            gib52uzmw.q3BipwRCk();
        }
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(this.q3BipwRCk, 0, gib52uzmw.dIocxURUo());
        int kCA6Zs9sL2 = cT9gik1zL.kCA6Zs9sL(this.J4Ux7ym32, 0, gib52uzmw.dIocxURUo());
        if (kCA6Zs9sL != kCA6Zs9sL2) {
            if (kCA6Zs9sL < kCA6Zs9sL2) {
                gib52uzmw.GPLPRo6go(kCA6Zs9sL, kCA6Zs9sL2);
            } else {
                gib52uzmw.GPLPRo6go(kCA6Zs9sL2, kCA6Zs9sL);
            }
        }
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SetComposingRegionCommand(start=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", end=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
