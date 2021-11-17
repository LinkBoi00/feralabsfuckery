package con;
/* loaded from: classes.dex */
public final class xWMOih5Lb implements SmsTS63dj {
    public final int J4Ux7ym32;
    public final Qu7jcd5XZ q3BipwRCk;
    public final long tGV7Q6urW;

    public xWMOih5Lb(Qu7jcd5XZ qu7jcd5XZ, int i, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = qu7jcd5XZ;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof xWMOih5Lb) {
            xWMOih5Lb xwmoih5lb = (xWMOih5Lb) obj;
            if (anXlDk6fV.tGV7Q6urW(xwmoih5lb.q3BipwRCk, this.q3BipwRCk) && xwmoih5lb.J4Ux7ym32 == this.J4Ux7ym32) {
                if (xwmoih5lb.tGV7Q6urW == this.tGV7Q6urW) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((vtDfS6nCt.tGV7Q6urW(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31)) * 31) + Long.hashCode(this.tGV7Q6urW);
    }

    @Override // con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new IQdzbaj10(this.q3BipwRCk.mo1q3BipwRCk(avkpyniny), this.J4Ux7ym32, this.tGV7Q6urW, null);
    }
}
