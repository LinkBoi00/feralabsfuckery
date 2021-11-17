package con;
/* loaded from: classes.dex */
public final class Sz3BF1fv6 implements wjjWl3mHt {
    public final wjjWl3mHt J4Ux7ym32;
    public final W39e6bnPN dIocxURUo = anXlDk6fV.dIocxURUo("kotlin.Triple", new W39e6bnPN[0], new nVhenZUxZ(this));
    public final wjjWl3mHt q3BipwRCk;
    public final wjjWl3mHt tGV7Q6urW;

    public Sz3BF1fv6(wjjWl3mHt wjjwl3mht, wjjWl3mHt wjjwl3mht2, wjjWl3mHt wjjwl3mht3) {
        this.q3BipwRCk = wjjwl3mht;
        this.J4Ux7ym32 = wjjwl3mht2;
        this.tGV7Q6urW = wjjwl3mht3;
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        C8ZZcTzJg kmSgne1rO = vobnba4s1.kmSgne1rO(this.dIocxURUo);
        if (kmSgne1rO.sk5s77z6Q()) {
            Object obj = kmSgne1rO.cAwN510t2(this.dIocxURUo, 0, this.q3BipwRCk, null);
            Object obj2 = kmSgne1rO.cAwN510t2(this.dIocxURUo, 1, this.J4Ux7ym32, null);
            Object obj3 = kmSgne1rO.cAwN510t2(this.dIocxURUo, 2, this.tGV7Q6urW, null);
            kmSgne1rO.Eeka1udhb(this.dIocxURUo);
            return new qZBmE0wDS(obj, obj2, obj3);
        }
        Object obj4 = SZG6VD3zH.q3BipwRCk;
        Object obj5 = SZG6VD3zH.q3BipwRCk;
        Object obj6 = obj5;
        Object obj7 = obj6;
        while (true) {
            int oon79WMrY = kmSgne1rO.oon79WMrY(this.dIocxURUo);
            if (oon79WMrY == -1) {
                kmSgne1rO.Eeka1udhb(this.dIocxURUo);
                Object obj8 = SZG6VD3zH.q3BipwRCk;
                Object obj9 = SZG6VD3zH.q3BipwRCk;
                if (obj5 == obj9) {
                    throw new oPOFYJ4Sr("Element 'first' is missing");
                } else if (obj6 == obj9) {
                    throw new oPOFYJ4Sr("Element 'second' is missing");
                } else if (obj7 != obj9) {
                    return new qZBmE0wDS(obj5, obj6, obj7);
                } else {
                    throw new oPOFYJ4Sr("Element 'third' is missing");
                }
            } else if (oon79WMrY == 0) {
                obj5 = kmSgne1rO.cAwN510t2(this.dIocxURUo, 0, this.q3BipwRCk, null);
            } else if (oon79WMrY == 1) {
                obj6 = kmSgne1rO.cAwN510t2(this.dIocxURUo, 1, this.J4Ux7ym32, null);
            } else if (oon79WMrY == 2) {
                obj7 = kmSgne1rO.cAwN510t2(this.dIocxURUo, 2, this.tGV7Q6urW, null);
            } else {
                throw new oPOFYJ4Sr(anXlDk6fV.iMyQMM6Qj("Unexpected index ", Integer.valueOf(oon79WMrY)));
            }
        }
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return this.dIocxURUo;
    }
}
