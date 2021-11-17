package con;
/* loaded from: classes.dex */
public final class XvE91pIJo extends grdjLPaeu implements hPR9G3M3R {
    public final float CBQ5d1kRq;
    public final boolean kmSgne1rO;

    public XvE91pIJo(float f, boolean z, PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = f;
        this.kmSgne1rO = z;
    }

    @Override // con.hPR9G3M3R
    public Object J4Ux7ym32(AU29aHa4X aU29aHa4X, Object obj) {
        iPxyBBmfH ipxybbmfh = obj instanceof iPxyBBmfH ? (iPxyBBmfH) obj : null;
        if (ipxybbmfh == null) {
            ipxybbmfh = new iPxyBBmfH(0.0f, false, null, 7);
        }
        ipxybbmfh.q3BipwRCk = this.CBQ5d1kRq;
        ipxybbmfh.J4Ux7ym32 = this.kmSgne1rO;
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
        XvE91pIJo xvE91pIJo = obj instanceof XvE91pIJo ? (XvE91pIJo) obj : null;
        if (xvE91pIJo == null) {
            return false;
        }
        return !((this.CBQ5d1kRq > xvE91pIJo.CBQ5d1kRq ? 1 : (this.CBQ5d1kRq == xvE91pIJo.CBQ5d1kRq ? 0 : -1)) == 0) && this.kmSgne1rO != xvE91pIJo.kmSgne1rO;
    }

    public int hashCode() {
        return Boolean.hashCode(this.kmSgne1rO) + (Float.hashCode(this.CBQ5d1kRq) * 31);
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
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("LayoutWeightImpl(weight=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", fill=");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
