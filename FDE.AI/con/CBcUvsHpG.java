package con;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class CBcUvsHpG implements GobDDNrsi {
    public static final Q4TFMtvSV Bhmn1KIah = new Q4TFMtvSV(0);
    public static AtomicInteger PSTqBLTET = new AtomicInteger(0);
    public final int CBQ5d1kRq;
    public final ogG45sslV kmSgne1rO;

    public CBcUvsHpG(int i, boolean z, boolean z2, PmanMZxiM pmanMZxiM) {
        this.CBQ5d1kRq = i;
        ogG45sslV ogg45sslv = new ogG45sslV();
        ogg45sslv.kmSgne1rO = z;
        ogg45sslv.Bhmn1KIah = z2;
        pmanMZxiM.IytU16YUK(ogg45sslv);
        this.kmSgne1rO = ogg45sslv;
    }

    @Override // con.BgIsSUB3d
    public BgIsSUB3d WaUP0CF08(BgIsSUB3d bgIsSUB3d) {
        return pz7YPhQTU.i8XZMQc6Z(this, bgIsSUB3d);
    }

    @Override // con.BgIsSUB3d
    public Object dXrmkklc8(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(this, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBcUvsHpG)) {
            return false;
        }
        CBcUvsHpG cBcUvsHpG = (CBcUvsHpG) obj;
        return this.CBQ5d1kRq == cBcUvsHpG.CBQ5d1kRq && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, cBcUvsHpG.kmSgne1rO);
    }

    public int hashCode() {
        return Integer.hashCode(this.CBQ5d1kRq) + (this.kmSgne1rO.hashCode() * 31);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }
}
