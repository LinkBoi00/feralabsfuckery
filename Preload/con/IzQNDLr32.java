package con;
/* loaded from: classes.dex */
public final class IzQNDLr32 {
    public final rYVnnKccO q3BipwRCk;

    public IzQNDLr32(rYVnnKccO ryvnnkcco) {
        this.q3BipwRCk = ryvnnkcco;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(tDmftakZl tdmftakzl, float f, Way959ade way959ade) {
        wHusdTMR8 whusdtmr8;
        int i;
        sl5e2Y3xY sl5e2y3xy;
        float f2 = f;
        if (way959ade instanceof wHusdTMR8) {
            whusdtmr8 = (wHusdTMR8) way959ade;
            int i2 = whusdtmr8.qVUwofr5s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whusdtmr8.qVUwofr5s = i2 - Integer.MIN_VALUE;
                Object obj = whusdtmr8.MzoOEjc4X;
                Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = whusdtmr8.qVUwofr5s;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    if (Math.abs(f) > 1.0f) {
                        sl5e2Y3xY sl5e2y3xy2 = new sl5e2Y3xY();
                        sl5e2y3xy2.CBQ5d1kRq = f2;
                        sl5e2Y3xY sl5e2y3xy3 = new sl5e2Y3xY();
                        aVKpYNINy avkpyniny = NvSSsPAuJ.q3BipwRCk;
                        rJ2CWKUxs rj2cwkuxs = new rJ2CWKUxs(avkpyniny, Float.valueOf(0.0f), new wA9iW3D4I(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
                        rYVnnKccO ryvnnkcco = this.q3BipwRCk;
                        ZcRbhWzZ1 zcRbhWzZ1 = new ZcRbhWzZ1(sl5e2y3xy3, tdmftakzl, sl5e2y3xy2);
                        whusdtmr8.PSTqBLTET = sl5e2y3xy2;
                        whusdtmr8.qVUwofr5s = 1;
                        Object q3BipwRCk = cqKak5Wfn.q3BipwRCk(rj2cwkuxs, new h78UvoI4B(ryvnnkcco, avkpyniny, rj2cwkuxs.getValue(), rj2cwkuxs.Bhmn1KIah), Long.MIN_VALUE, zcRbhWzZ1, whusdtmr8);
                        if (q3BipwRCk != obj2) {
                            q3BipwRCk = qih4lW99W.q3BipwRCk;
                        }
                        if (q3BipwRCk == obj2) {
                            return obj2;
                        }
                        sl5e2y3xy = sl5e2y3xy2;
                    }
                    return new Float(f2);
                } else if (i == 1) {
                    sl5e2y3xy = (sl5e2Y3xY) whusdtmr8.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f2 = sl5e2y3xy.CBQ5d1kRq;
                return new Float(f2);
            }
        }
        whusdtmr8 = new wHusdTMR8(this, way959ade);
        Object obj3 = whusdtmr8.MzoOEjc4X;
        Object obj22 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = whusdtmr8.qVUwofr5s;
        if (i != 0) {
        }
        f2 = sl5e2y3xy.CBQ5d1kRq;
        return new Float(f2);
    }
}
