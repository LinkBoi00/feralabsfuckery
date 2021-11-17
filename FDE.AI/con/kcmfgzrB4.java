package con;
/* loaded from: classes.dex */
public final class kcmfgzrB4 extends grdjLPaeu implements hPR9G3M3R {
    public final phqQlbVE3 CBQ5d1kRq;

    public kcmfgzrB4(phqQlbVE3 phqqlbve3, PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = phqqlbve3;
    }

    @Override // con.hPR9G3M3R
    public Object J4Ux7ym32(AU29aHa4X aU29aHa4X, Object obj) {
        iPxyBBmfH ipxybbmfh = obj instanceof iPxyBBmfH ? (iPxyBBmfH) obj : null;
        if (ipxybbmfh == null) {
            ipxybbmfh = new iPxyBBmfH(0.0f, false, null, 7);
        }
        ipxybbmfh.tGV7Q6urW = new COayQ7be5(this.CBQ5d1kRq);
        return ipxybbmfh;
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
        kcmfgzrB4 kcmfgzrb4 = obj instanceof kcmfgzrB4 ? (kcmfgzrB4) obj : null;
        if (kcmfgzrb4 == null) {
            return false;
        }
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, kcmfgzrb4.CBQ5d1kRq);
    }

    public int hashCode() {
        return this.CBQ5d1kRq.hashCode();
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("HorizontalAlignModifier(horizontal=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
