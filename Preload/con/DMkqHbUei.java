package con;
/* loaded from: classes.dex */
public final class DMkqHbUei implements Sm35UxCQt {
    public final /* synthetic */ Sm35UxCQt CBQ5d1kRq;
    public final /* synthetic */ int kmSgne1rO;

    public DMkqHbUei(Sm35UxCQt sm35UxCQt, int i) {
        this.CBQ5d1kRq = sm35UxCQt;
        this.kmSgne1rO = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:2|(2:4|(6:6|8|25|(1:(2:11|12)(2:13|14))(3:15|16|(1:18))|22|23))|7|8|25|(0)(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r8.CBQ5d1kRq != r7) goto L_0x0057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Type inference failed for: r7v0, types: [con.f106ugAzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [con.qih4lW99W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // con.Sm35UxCQt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object tGV7Q6urW(f106ugAzx f106ugazx, Way959ade way959ade) {
        OUBcRKgpr oUBcRKgpr;
        int i;
        if (way959ade instanceof OUBcRKgpr) {
            oUBcRKgpr = (OUBcRKgpr) way959ade;
            int i2 = oUBcRKgpr.MzoOEjc4X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oUBcRKgpr.MzoOEjc4X = i2 - Integer.MIN_VALUE;
                Object obj = oUBcRKgpr.PSTqBLTET;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = oUBcRKgpr.MzoOEjc4X;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    BdFQ0RqNz bdFQ0RqNz = new BdFQ0RqNz();
                    Sm35UxCQt sm35UxCQt = this.CBQ5d1kRq;
                    mivJlWd6O mivjlwd6o = new mivJlWd6O(bdFQ0RqNz, this.kmSgne1rO, f106ugazx);
                    oUBcRKgpr.qVUwofr5s = f106ugazx;
                    oUBcRKgpr.MzoOEjc4X = 1;
                    if (sm35UxCQt.tGV7Q6urW(mivjlwd6o, oUBcRKgpr) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                } else if (i == 1) {
                    f106ugAzx f106ugazx2 = (f106ugAzx) oUBcRKgpr.qVUwofr5s;
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f106ugazx = qih4lW99W.q3BipwRCk;
                return f106ugazx;
            }
        }
        oUBcRKgpr = new OUBcRKgpr(this, way959ade);
        Object obj2 = oUBcRKgpr.PSTqBLTET;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = oUBcRKgpr.MzoOEjc4X;
        if (i != 0) {
        }
        f106ugazx = qih4lW99W.q3BipwRCk;
        return f106ugazx;
    }
}
