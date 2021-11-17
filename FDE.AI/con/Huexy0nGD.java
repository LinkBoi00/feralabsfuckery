package con;
/* loaded from: classes.dex */
public final class Huexy0nGD extends bZmnXN812 {
    public final long q3BipwRCk;

    public Huexy0nGD(long j, dnBSj5uJN dnbsj5ujn) {
        super(null);
        this.q3BipwRCk = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Huexy0nGD) && bO2dbmrf7.tGV7Q6urW(this.q3BipwRCk, ((Huexy0nGD) obj).q3BipwRCk);
    }

    public int hashCode() {
        return bO2dbmrf7.yWvV4ePLl(this.q3BipwRCk);
    }

    @Override // con.bZmnXN812
    public void q3BipwRCk(long j, AA4ZBBPJq aA4ZBBPJq, float f) {
        long j2;
        aA4ZBBPJq.Puu3Rhg4F(1.0f);
        if (!(f == 1.0f)) {
            long j3 = this.q3BipwRCk;
            j2 = bO2dbmrf7.J4Ux7ym32(j3, bO2dbmrf7.dIocxURUo(j3) * f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j2 = this.q3BipwRCk;
        }
        aA4ZBBPJq.oon79WMrY(j2);
        if (aA4ZBBPJq.tGV7Q6urW != null) {
            aA4ZBBPJq.Bhmn1KIah(null);
        }
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SolidColor(value=");
        q3BipwRCk.append((Object) bO2dbmrf7.oon79WMrY(this.q3BipwRCk));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
