package con;
/* loaded from: classes.dex */
public final class FNRS7AIqa {
    public final int J4Ux7ym32;
    public final TZR3Xn1pu q3BipwRCk;
    public final int tGV7Q6urW;

    public FNRS7AIqa(TZR3Xn1pu tZR3Xn1pu, int i, int i2) {
        this.q3BipwRCk = tZR3Xn1pu;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FNRS7AIqa)) {
            return false;
        }
        FNRS7AIqa fNRS7AIqa = (FNRS7AIqa) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, fNRS7AIqa.q3BipwRCk) && this.J4Ux7ym32 == fNRS7AIqa.J4Ux7ym32 && this.tGV7Q6urW == fNRS7AIqa.tGV7Q6urW;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.J4Ux7ym32);
        return Integer.hashCode(this.tGV7Q6urW) + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ParagraphIntrinsicInfo(intrinsics=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", startIndex=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", endIndex=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ')');
    }
}
