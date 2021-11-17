package con;

import java.util.Map;
/* loaded from: classes.dex */
public final class Bxkl1BO9q implements f106ugAzx {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Object kmSgne1rO;

    public Bxkl1BO9q(f106ugAzx f106ugazx) {
        this.CBQ5d1kRq = 2;
        this.kmSgne1rO = f106ugazx;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // con.f106ugAzx
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        AkqfjV5hm akqfjV5hm;
        int i;
        switch (this.CBQ5d1kRq) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((prCJwNx2x) ((RNEcgN6dQ) this.kmSgne1rO)).CBQ5d1kRq(Boolean.valueOf(booleanValue));
                return qih4lW99W.q3BipwRCk;
            case 1:
                ((prCJwNx2x) ((RNEcgN6dQ) this.kmSgne1rO)).CBQ5d1kRq((G8ebKyy85) obj);
                return qih4lW99W.q3BipwRCk;
            default:
                if (way959ade instanceof AkqfjV5hm) {
                    akqfjV5hm = (AkqfjV5hm) way959ade;
                    int i2 = akqfjV5hm.MzoOEjc4X;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        akqfjV5hm.MzoOEjc4X = i2 - Integer.MIN_VALUE;
                        Object obj2 = akqfjV5hm.PSTqBLTET;
                        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                        i = akqfjV5hm.MzoOEjc4X;
                        if (i != 0) {
                            anXlDk6fV.IytU16YUK(obj2);
                            f106ugAzx f106ugazx = (f106ugAzx) this.kmSgne1rO;
                            if (!((Map) obj).isEmpty()) {
                                akqfjV5hm.MzoOEjc4X = 1;
                                if (f106ugazx.q3BipwRCk(obj, akqfjV5hm) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                            }
                        } else if (i == 1) {
                            anXlDk6fV.IytU16YUK(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return qih4lW99W.q3BipwRCk;
                    }
                }
                akqfjV5hm = new AkqfjV5hm(this, way959ade);
                Object obj22 = akqfjV5hm.PSTqBLTET;
                kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = akqfjV5hm.MzoOEjc4X;
                if (i != 0) {
                }
                return qih4lW99W.q3BipwRCk;
        }
    }

    public Bxkl1BO9q(RNEcgN6dQ rNEcgN6dQ, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = rNEcgN6dQ;
        } else {
            this.kmSgne1rO = rNEcgN6dQ;
        }
    }
}
