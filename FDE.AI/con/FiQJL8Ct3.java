package con;
/* loaded from: classes.dex */
public final class FiQJL8Ct3 implements FBt0Qj7Qb {
    public final Object Bhmn1KIah;
    public final ldH4l9sHo CBQ5d1kRq;
    public final PmanMZxiM kmSgne1rO;

    public FiQJL8Ct3(ldH4l9sHo ldh4l9sho, PmanMZxiM pmanMZxiM) {
        this.CBQ5d1kRq = ldh4l9sho;
        this.kmSgne1rO = pmanMZxiM;
        this.Bhmn1KIah = ldh4l9sho.q3BipwRCk;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FiQJL8Ct3) {
            FiQJL8Ct3 fiQJL8Ct3 = (FiQJL8Ct3) obj;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq.q3BipwRCk, fiQJL8Ct3.CBQ5d1kRq.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, fiQJL8Ct3.kmSgne1rO)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.kmSgne1rO.hashCode() + (this.CBQ5d1kRq.q3BipwRCk.hashCode() * 31);
    }

    @Override // con.FBt0Qj7Qb
    public Object q3BipwRCk() {
        return this.Bhmn1KIah;
    }
}
