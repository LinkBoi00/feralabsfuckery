package con;
/* loaded from: classes.dex */
public final class LsXjuMQ0I implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final int q3BipwRCk;

    public LsXjuMQ0I(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LsXjuMQ0I)) {
            return false;
        }
        LsXjuMQ0I lsXjuMQ0I = (LsXjuMQ0I) obj;
        return this.q3BipwRCk == lsXjuMQ0I.q3BipwRCk && this.J4Ux7ym32 == lsXjuMQ0I.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk * 31) + this.J4Ux7ym32;
    }

    @Override // con.wX7bxQPFb
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        int i;
        int i2 = this.q3BipwRCk;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 0;
            i = 0;
            do {
                i4++;
                i++;
                int i5 = gib52uzmw.J4Ux7ym32;
                if (i5 > i) {
                    if (Character.isHighSurrogate(gib52uzmw.tGV7Q6urW((i5 - i) - 1)) && Character.isLowSurrogate(gib52uzmw.tGV7Q6urW(gib52uzmw.J4Ux7ym32 - i))) {
                        i++;
                    }
                }
                if (i != gib52uzmw.J4Ux7ym32) {
                    break;
                    break;
                }
                break;
            } while (i4 < i2);
        } else {
            i = 0;
        }
        int i6 = this.J4Ux7ym32;
        if (i6 > 0) {
            int i7 = 0;
            int i8 = 0;
            do {
                i7++;
                i8++;
                if (gib52uzmw.tGV7Q6urW + i8 < gib52uzmw.dIocxURUo()) {
                    if (Character.isHighSurrogate(gib52uzmw.tGV7Q6urW((gib52uzmw.tGV7Q6urW + i8) - 1)) && Character.isLowSurrogate(gib52uzmw.tGV7Q6urW(gib52uzmw.tGV7Q6urW + i8))) {
                        i8++;
                    }
                }
                if (gib52uzmw.tGV7Q6urW + i8 != gib52uzmw.dIocxURUo()) {
                    break;
                    break;
                }
                break;
            } while (i7 < i6);
            i3 = i8;
        }
        int i9 = gib52uzmw.tGV7Q6urW;
        gib52uzmw.J4Ux7ym32(i9, i3 + i9);
        int i10 = gib52uzmw.J4Ux7ym32;
        gib52uzmw.J4Ux7ym32(i10 - i, i10);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", lengthAfterCursor=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
