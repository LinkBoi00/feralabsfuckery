package con;
/* loaded from: classes.dex */
public final class FqL6c6a4s implements Sm35UxCQt {
    public final kkcQgCx5G CBQ5d1kRq;

    public FqL6c6a4s(kkcQgCx5G kkcqgcx5g) {
        this.CBQ5d1kRq = kkcqgcx5g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // con.Sm35UxCQt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object tGV7Q6urW(f106ugAzx f106ugazx, Way959ade way959ade) {
        VLYkjU0mM vLYkjU0mM;
        int i;
        Throwable th;
        KYeV3FWhw kYeV3FWhw;
        if (way959ade instanceof VLYkjU0mM) {
            vLYkjU0mM = (VLYkjU0mM) way959ade;
            int i2 = vLYkjU0mM.qVUwofr5s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vLYkjU0mM.qVUwofr5s = i2 - Integer.MIN_VALUE;
                Object obj = vLYkjU0mM.MzoOEjc4X;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = vLYkjU0mM.qVUwofr5s;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    KYeV3FWhw kYeV3FWhw2 = new KYeV3FWhw(f106ugazx, vLYkjU0mM.Bhmn1KIah);
                    try {
                        vLYkjU0mM.PSTqBLTET = kYeV3FWhw2;
                        vLYkjU0mM.qVUwofr5s = 1;
                        Object WaUP0CF08 = this.CBQ5d1kRq.WaUP0CF08(kYeV3FWhw2, vLYkjU0mM);
                        if (WaUP0CF08 != kbkjsqcsl) {
                            WaUP0CF08 = qih4lW99W.q3BipwRCk;
                        }
                        if (WaUP0CF08 == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        kYeV3FWhw = kYeV3FWhw2;
                    } catch (Throwable th2) {
                        th = th2;
                        kYeV3FWhw = kYeV3FWhw2;
                        kYeV3FWhw.oon79WMrY();
                        throw th;
                    }
                } else if (i == 1) {
                    kYeV3FWhw = (KYeV3FWhw) vLYkjU0mM.PSTqBLTET;
                    try {
                        anXlDk6fV.IytU16YUK(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        kYeV3FWhw.oon79WMrY();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kYeV3FWhw.oon79WMrY();
                return qih4lW99W.q3BipwRCk;
            }
        }
        vLYkjU0mM = new VLYkjU0mM(this, way959ade);
        Object obj2 = vLYkjU0mM.MzoOEjc4X;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = vLYkjU0mM.qVUwofr5s;
        if (i != 0) {
        }
        kYeV3FWhw.oon79WMrY();
        return qih4lW99W.q3BipwRCk;
    }
}
