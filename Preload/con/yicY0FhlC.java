package con;
/* loaded from: classes.dex */
public final class yicY0FhlC {
    public final int J4Ux7ym32;
    public final vdahrAJJh q3BipwRCk;

    public yicY0FhlC(vdahrAJJh vdahrajjh, int i) {
        this.q3BipwRCk = vdahrajjh;
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yicY0FhlC)) {
            return false;
        }
        yicY0FhlC yicy0fhlc = (yicY0FhlC) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, yicy0fhlc.q3BipwRCk) && this.J4Ux7ym32 == yicy0fhlc.J4Ux7ym32;
    }

    public int hashCode() {
        return Integer.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ImageVectorEntry(imageVector=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", configFlags=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
