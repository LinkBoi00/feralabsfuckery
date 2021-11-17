package con;

import java.util.List;
/* loaded from: classes.dex */
public final class D32LxzbZS extends kVmRinNH6 implements AfVJL8w1P {
    public int Bhmn1KIah;
    public final AfVJL8w1P CBQ5d1kRq;
    public final int kmSgne1rO;

    public D32LxzbZS(AfVJL8w1P afVJL8w1P, int i, int i2) {
        this.CBQ5d1kRq = afVJL8w1P;
        this.kmSgne1rO = i;
        YxlPjG8Es.tGV7Q6urW(i, i2, ((Og6dYSoy7) afVJL8w1P).J4Ux7ym32());
        this.Bhmn1KIah = i2 - i;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.Bhmn1KIah;
    }

    @Override // con.kVmRinNH6, java.util.List
    public Object get(int i) {
        YxlPjG8Es.q3BipwRCk(i, this.Bhmn1KIah);
        return this.CBQ5d1kRq.get(this.kmSgne1rO + i);
    }

    @Override // con.kVmRinNH6, java.util.List
    public List subList(int i, int i2) {
        YxlPjG8Es.tGV7Q6urW(i, i2, this.Bhmn1KIah);
        AfVJL8w1P afVJL8w1P = this.CBQ5d1kRq;
        int i3 = this.kmSgne1rO;
        return new D32LxzbZS(afVJL8w1P, i + i3, i3 + i2);
    }
}
