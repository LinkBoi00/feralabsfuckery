package con;
/* loaded from: classes.dex */
public final class RLPskO21n implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;

    public RLPskO21n(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RLPskO21n)) {
            return false;
        }
        RLPskO21n rLPskO21n = (RLPskO21n) obj;
        return this.q3BipwRCk == rLPskO21n.q3BipwRCk && this.J4Ux7ym32 == rLPskO21n.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk * 31) + this.J4Ux7ym32;
    }

    @Override // con.wX7bxQPFb
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        int i = gib52uzmw.tGV7Q6urW;
        gib52uzmw.J4Ux7ym32(i, Math.min(this.J4Ux7ym32 + i, gib52uzmw.dIocxURUo()));
        gib52uzmw.J4Ux7ym32(Math.max(0, gib52uzmw.J4Ux7ym32 - this.q3BipwRCk), gib52uzmw.J4Ux7ym32);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", lengthAfterCursor=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
