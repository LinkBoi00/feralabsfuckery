package con;
/* loaded from: classes.dex */
public abstract class a03LPUL7f implements wjjWl3mHt {
    public final wjjWl3mHt J4Ux7ym32;
    public final wjjWl3mHt q3BipwRCk;

    public a03LPUL7f(wjjWl3mHt wjjwl3mht, wjjWl3mHt wjjwl3mht2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = wjjwl3mht;
        this.J4Ux7ym32 = wjjwl3mht2;
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        jSznB4lMR jsznb4lmr = (jSznB4lMR) this;
        C8ZZcTzJg kmSgne1rO = vobnba4s1.kmSgne1rO(jsznb4lmr.q3BipwRCk());
        if (kmSgne1rO.sk5s77z6Q()) {
            Object obj = kmSgne1rO.cAwN510t2(jsznb4lmr.q3BipwRCk(), 0, this.q3BipwRCk, null);
            Object obj2 = kmSgne1rO.cAwN510t2(jsznb4lmr.q3BipwRCk(), 1, this.J4Ux7ym32, null);
            switch (jsznb4lmr.tGV7Q6urW) {
                case 0:
                    return new iakKtOJVy(obj, obj2);
                default:
                    return new n4f84B5OG(obj, obj2);
            }
        } else {
            Object obj3 = SZG6VD3zH.q3BipwRCk;
            Object obj4 = SZG6VD3zH.q3BipwRCk;
            Object obj5 = obj4;
            while (true) {
                int oon79WMrY = kmSgne1rO.oon79WMrY(jsznb4lmr.q3BipwRCk());
                if (oon79WMrY == -1) {
                    kmSgne1rO.Eeka1udhb(jsznb4lmr.q3BipwRCk());
                    Object obj6 = SZG6VD3zH.q3BipwRCk;
                    Object obj7 = SZG6VD3zH.q3BipwRCk;
                    if (obj4 == obj7) {
                        throw new oPOFYJ4Sr("Element 'key' is missing");
                    } else if (obj5 != obj7) {
                        switch (jsznb4lmr.tGV7Q6urW) {
                            case 0:
                                return new iakKtOJVy(obj4, obj5);
                            default:
                                return new n4f84B5OG(obj4, obj5);
                        }
                    } else {
                        throw new oPOFYJ4Sr("Element 'value' is missing");
                    }
                } else if (oon79WMrY == 0) {
                    obj4 = kmSgne1rO.cAwN510t2(jsznb4lmr.q3BipwRCk(), 0, this.q3BipwRCk, null);
                } else if (oon79WMrY == 1) {
                    obj5 = kmSgne1rO.cAwN510t2(jsznb4lmr.q3BipwRCk(), 1, this.J4Ux7ym32, null);
                } else {
                    throw new oPOFYJ4Sr(anXlDk6fV.iMyQMM6Qj("Invalid index: ", Integer.valueOf(oon79WMrY)));
                }
            }
        }
    }
}
