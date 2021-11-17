package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class rFqjWWzbt implements W39e6bnPN {
    public final W39e6bnPN J4Ux7ym32;
    public final int dIocxURUo = 2;
    public final String q3BipwRCk;
    public final W39e6bnPN tGV7Q6urW;

    public rFqjWWzbt(String str, W39e6bnPN w39e6bnPN, W39e6bnPN w39e6bnPN2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = w39e6bnPN;
        this.tGV7Q6urW = w39e6bnPN2;
    }

    @Override // con.W39e6bnPN
    public int CBQ5d1kRq() {
        return this.dIocxURUo;
    }

    @Override // con.W39e6bnPN
    public List GPLPRo6go(int i) {
        if (i >= 0) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        throw new IllegalArgumentException(my9FFKbZi.q3BipwRCk(Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", "), this.q3BipwRCk, " expects only non-negative indices").toString());
    }

    @Override // con.W39e6bnPN
    public boolean J4Ux7ym32() {
        return false;
    }

    @Override // con.W39e6bnPN
    public W39e6bnPN Puu3Rhg4F(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.J4Ux7ym32;
            }
            if (i2 == 1) {
                return this.tGV7Q6urW;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(my9FFKbZi.q3BipwRCk(Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", "), this.q3BipwRCk, " expects only non-negative indices").toString());
    }

    @Override // con.W39e6bnPN
    public String dIocxURUo() {
        return this.q3BipwRCk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rFqjWWzbt)) {
            return false;
        }
        rFqjWWzbt rfqjwwzbt = (rFqjWWzbt) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, rfqjwwzbt.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, rfqjwwzbt.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, rfqjwwzbt.tGV7Q6urW);
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        return this.tGV7Q6urW.hashCode() + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31);
    }

    @Override // con.W39e6bnPN
    public boolean iiGwOFFnr() {
        return false;
    }

    @Override // con.W39e6bnPN
    public boolean oon79WMrY(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(my9FFKbZi.q3BipwRCk(Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", "), this.q3BipwRCk, " expects only non-negative indices").toString());
    }

    @Override // con.W39e6bnPN
    public String q3BipwRCk(int i) {
        return String.valueOf(i);
    }

    @Override // con.W39e6bnPN
    public int tGV7Q6urW(String str) {
        Integer nlGCs0NZs = HhnYCaabI.nlGCs0NZs(str);
        if (nlGCs0NZs != null) {
            return nlGCs0NZs.intValue();
        }
        throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj(str, " is not a valid map index"));
    }

    public String toString() {
        return this.q3BipwRCk + '(' + this.J4Ux7ym32 + ", " + this.tGV7Q6urW + ')';
    }

    @Override // con.W39e6bnPN
    public List vPSbyrYWX() {
        return Dqz1pJHWH.CBQ5d1kRq;
    }

    @Override // con.W39e6bnPN
    public EMeKvJHwJ yWvV4ePLl() {
        return IEZwICTDI.q3BipwRCk;
    }
}
