package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class LYJmtOyks implements W39e6bnPN {
    public final int J4Ux7ym32 = 1;
    public final W39e6bnPN q3BipwRCk;

    public LYJmtOyks(W39e6bnPN w39e6bnPN, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = w39e6bnPN;
    }

    @Override // con.W39e6bnPN
    public int CBQ5d1kRq() {
        return this.J4Ux7ym32;
    }

    @Override // con.W39e6bnPN
    public List GPLPRo6go(int i) {
        if (i >= 0) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", ");
        q3BipwRCk.append(dIocxURUo());
        q3BipwRCk.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q3BipwRCk.toString().toString());
    }

    @Override // con.W39e6bnPN
    public boolean J4Ux7ym32() {
        return false;
    }

    @Override // con.W39e6bnPN
    public W39e6bnPN Puu3Rhg4F(int i) {
        if (i >= 0) {
            return this.q3BipwRCk;
        }
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", ");
        q3BipwRCk.append(dIocxURUo());
        q3BipwRCk.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q3BipwRCk.toString().toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LYJmtOyks)) {
            return false;
        }
        LYJmtOyks lYJmtOyks = (LYJmtOyks) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, lYJmtOyks.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(dIocxURUo(), lYJmtOyks.dIocxURUo());
    }

    public int hashCode() {
        return dIocxURUo().hashCode() + (this.q3BipwRCk.hashCode() * 31);
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
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Illegal index ", i, ", ");
        q3BipwRCk.append(dIocxURUo());
        q3BipwRCk.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q3BipwRCk.toString().toString());
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
        throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj(str, " is not a valid list index"));
    }

    public String toString() {
        return dIocxURUo() + '(' + this.q3BipwRCk + ')';
    }

    @Override // con.W39e6bnPN
    public List vPSbyrYWX() {
        return Dqz1pJHWH.CBQ5d1kRq;
    }

    @Override // con.W39e6bnPN
    public EMeKvJHwJ yWvV4ePLl() {
        return KjkEm2fGt.q3BipwRCk;
    }
}
