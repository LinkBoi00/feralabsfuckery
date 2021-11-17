package con;
/* loaded from: classes.dex */
public final class QWpF893u7 {
    public final int J4Ux7ym32;
    public final int dIocxURUo;
    public final int q3BipwRCk;
    public final int tGV7Q6urW;

    public QWpF893u7(int i, int i2, int i3, int i4) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = i3;
        this.dIocxURUo = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QWpF893u7)) {
            return false;
        }
        QWpF893u7 qWpF893u7 = (QWpF893u7) obj;
        return this.q3BipwRCk == qWpF893u7.q3BipwRCk && this.J4Ux7ym32 == qWpF893u7.J4Ux7ym32 && this.tGV7Q6urW == qWpF893u7.tGV7Q6urW && this.dIocxURUo == qWpF893u7.dIocxURUo;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.J4Ux7ym32);
        int hashCode2 = Integer.hashCode(this.tGV7Q6urW);
        return Integer.hashCode(this.dIocxURUo) + ((hashCode2 + ((hashCode + (Integer.hashCode(this.q3BipwRCk) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("IntRect.fromLTRB(");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", ");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", ");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", ");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.dIocxURUo, ')');
    }
}
