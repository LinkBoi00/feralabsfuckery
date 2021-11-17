package con;
/* loaded from: classes.dex */
public final class Jyy1rTQJd implements BgIsSUB3d {
    public final BgIsSUB3d CBQ5d1kRq;
    public final BgIsSUB3d kmSgne1rO;

    public Jyy1rTQJd(BgIsSUB3d bgIsSUB3d, BgIsSUB3d bgIsSUB3d2) {
        this.CBQ5d1kRq = bgIsSUB3d;
        this.kmSgne1rO = bgIsSUB3d2;
    }

    @Override // con.BgIsSUB3d
    public BgIsSUB3d WaUP0CF08(BgIsSUB3d bgIsSUB3d) {
        return bgIsSUB3d == H11ySchUh.CBQ5d1kRq ? this : new Jyy1rTQJd(this, bgIsSUB3d);
    }

    @Override // con.BgIsSUB3d
    public Object dXrmkklc8(Object obj, kkcQgCx5G kkcqgcx5g) {
        return this.CBQ5d1kRq.dXrmkklc8(this.kmSgne1rO.dXrmkklc8(obj, kkcqgcx5g), kkcqgcx5g);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Jyy1rTQJd) {
            Jyy1rTQJd jyy1rTQJd = (Jyy1rTQJd) obj;
            if (anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, jyy1rTQJd.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, jyy1rTQJd.kmSgne1rO)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.kmSgne1rO.hashCode() * 31) + this.CBQ5d1kRq.hashCode();
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return this.CBQ5d1kRq.i8XZMQc6Z(pmanMZxiM) && this.kmSgne1rO.i8XZMQc6Z(pmanMZxiM);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return this.kmSgne1rO.sk5s77z6Q(this.CBQ5d1kRq.sk5s77z6Q(obj, kkcqgcx5g), kkcqgcx5g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ZUnPHIUWr zUnPHIUWr = ZUnPHIUWr.ixWaw2akD;
        sb.append((String) this.kmSgne1rO.sk5s77z6Q(this.CBQ5d1kRq.sk5s77z6Q("", zUnPHIUWr), zUnPHIUWr));
        sb.append(']');
        return sb.toString();
    }
}
