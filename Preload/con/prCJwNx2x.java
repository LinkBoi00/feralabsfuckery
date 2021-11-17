package con;
/* loaded from: classes.dex */
public abstract class prCJwNx2x implements vlsBqYUof, RNEcgN6dQ {
    public final jdeJZ7JPq CBQ5d1kRq;
    public VaOunZCMh kmSgne1rO;

    public prCJwNx2x(Object obj, jdeJZ7JPq jdejz7jpq) {
        this.CBQ5d1kRq = jdejz7jpq;
        this.kmSgne1rO = new VaOunZCMh(obj);
    }

    public void CBQ5d1kRq(Object obj) {
        s05BzCoHq Puu3Rhg4F;
        aq0NJzKbg aq0njzkbg;
        VaOunZCMh vaOunZCMh = (VaOunZCMh) UvOuyIFuT.GPLPRo6go(this.kmSgne1rO, UvOuyIFuT.Puu3Rhg4F());
        if (!this.CBQ5d1kRq.q3BipwRCk(vaOunZCMh.tGV7Q6urW, obj)) {
            VaOunZCMh vaOunZCMh2 = this.kmSgne1rO;
            PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
            synchronized (UvOuyIFuT.J4Ux7ym32) {
                Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
                if (Puu3Rhg4F.iiGwOFFnr()) {
                    Puu3Rhg4F.CBQ5d1kRq(this);
                }
                int tGV7Q6urW = Puu3Rhg4F.tGV7Q6urW();
                if (vaOunZCMh.q3BipwRCk == tGV7Q6urW) {
                    aq0njzkbg = vaOunZCMh;
                } else {
                    aq0NJzKbg yWvV4ePLl = UvOuyIFuT.yWvV4ePLl(vaOunZCMh2, this, Puu3Rhg4F);
                    yWvV4ePLl.q3BipwRCk = tGV7Q6urW;
                    Puu3Rhg4F.CBQ5d1kRq(this);
                    aq0njzkbg = yWvV4ePLl;
                }
                ((VaOunZCMh) aq0njzkbg).tGV7Q6urW = obj;
            }
            UvOuyIFuT.oon79WMrY(Puu3Rhg4F, this);
        }
    }

    @Override // con.vlsBqYUof
    public aq0NJzKbg J4Ux7ym32() {
        return this.kmSgne1rO;
    }

    @Override // con.UBY2Inzw8
    public Object getValue() {
        return ((VaOunZCMh) UvOuyIFuT.kmSgne1rO(this.kmSgne1rO, this)).tGV7Q6urW;
    }

    @Override // con.vlsBqYUof
    public aq0NJzKbg iiGwOFFnr(aq0NJzKbg aq0njzkbg, aq0NJzKbg aq0njzkbg2, aq0NJzKbg aq0njzkbg3) {
        VaOunZCMh vaOunZCMh = (VaOunZCMh) aq0njzkbg;
        VaOunZCMh vaOunZCMh2 = (VaOunZCMh) aq0njzkbg2;
        VaOunZCMh vaOunZCMh3 = (VaOunZCMh) aq0njzkbg3;
        if (this.CBQ5d1kRq.q3BipwRCk(vaOunZCMh2.tGV7Q6urW, vaOunZCMh3.tGV7Q6urW)) {
            return aq0njzkbg2;
        }
        Object J4Ux7ym32 = this.CBQ5d1kRq.J4Ux7ym32(vaOunZCMh.tGV7Q6urW, vaOunZCMh2.tGV7Q6urW, vaOunZCMh3.tGV7Q6urW);
        if (J4Ux7ym32 == null) {
            return null;
        }
        aq0NJzKbg J4Ux7ym322 = vaOunZCMh3.J4Ux7ym32();
        ((VaOunZCMh) J4Ux7ym322).tGV7Q6urW = J4Ux7ym32;
        return J4Ux7ym322;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("MutableState(value=");
        q3BipwRCk.append(((VaOunZCMh) UvOuyIFuT.GPLPRo6go(this.kmSgne1rO, UvOuyIFuT.Puu3Rhg4F())).tGV7Q6urW);
        q3BipwRCk.append(")@");
        q3BipwRCk.append(hashCode());
        return q3BipwRCk.toString();
    }

    @Override // con.vlsBqYUof
    public void vPSbyrYWX(aq0NJzKbg aq0njzkbg) {
        this.kmSgne1rO = (VaOunZCMh) aq0njzkbg;
    }
}
