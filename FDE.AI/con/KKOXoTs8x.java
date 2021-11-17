package con;
/* loaded from: classes.dex */
public final class KKOXoTs8x implements rossXWJSA {
    public final Szv4I4Bzo CBQ5d1kRq;
    public final PmanMZxiM kmSgne1rO;

    public KKOXoTs8x(Szv4I4Bzo szv4I4Bzo, PmanMZxiM pmanMZxiM) {
        this.CBQ5d1kRq = szv4I4Bzo;
        this.kmSgne1rO = pmanMZxiM;
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
        if (!(obj instanceof KKOXoTs8x)) {
            return false;
        }
        KKOXoTs8x kKOXoTs8x = (KKOXoTs8x) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, kKOXoTs8x.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, kKOXoTs8x.kmSgne1rO);
    }

    public int hashCode() {
        return this.kmSgne1rO.hashCode() + (this.CBQ5d1kRq.hashCode() * 31);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.rossXWJSA
    public void iMyQMM6Qj(HXRw132ar hXRw132ar) {
        this.CBQ5d1kRq.kmSgne1rO.q3BipwRCk.IytU16YUK(hXRw132ar);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DrawContentCacheModifier(cacheDrawScope=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", onBuildDrawCache=");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
