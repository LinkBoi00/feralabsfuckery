package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class jwvlSqURP extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ IXMg0nBBI Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ DpXbxvzXm dXrmkklc8;
    public int ilHKhw3Yw;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwvlSqURP(IXMg0nBBI iXMg0nBBI, DpXbxvzXm dpXbxvzXm, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = iXMg0nBBI;
        this.dXrmkklc8 = dpXbxvzXm;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        jwvlSqURP jwvlsqurp = new jwvlSqURP(this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        jwvlsqurp.qVUwofr5s = (tOZ92cI5y) obj;
        return jwvlsqurp.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        jwvlSqURP jwvlsqurp = new jwvlSqURP(this.Eeka1udhb, this.dXrmkklc8, way959ade);
        jwvlsqurp.qVUwofr5s = obj;
        return jwvlsqurp;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        jwvlSqURP jwvlsqurp;
        tOZ92cI5y toz92ci5y;
        Object obj2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            toz92ci5y = (tOZ92cI5y) this.qVUwofr5s;
            jwvlsqurp = this;
            obj2 = jwvlsqurp.Eeka1udhb.CBQ5d1kRq;
            if (!(obj2 instanceof UliWfoMkZ)) {
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            IXMg0nBBI iXMg0nBBI = (IXMg0nBBI) this.MzoOEjc4X;
            tOZ92cI5y toz92ci5y2 = (tOZ92cI5y) this.qVUwofr5s;
            anXlDk6fV.IytU16YUK(obj);
            kBKJSqCSL kbkjsqcsl2 = kbkjsqcsl;
            jwvlSqURP jwvlsqurp2 = this;
            iXMg0nBBI.CBQ5d1kRq = obj;
            jwvlsqurp = jwvlsqurp2;
            kbkjsqcsl = kbkjsqcsl2;
            toz92ci5y = toz92ci5y2;
            obj2 = jwvlsqurp.Eeka1udhb.CBQ5d1kRq;
            if (!(obj2 instanceof UliWfoMkZ) || (obj2 instanceof vM0xskL0R)) {
                return qih4lW99W.q3BipwRCk;
            }
            rgshbUd80 rgshbud80 = obj2 instanceof rgshbUd80 ? (rgshbUd80) obj2 : null;
            if (rgshbud80 != null) {
                toz92ci5y.q3BipwRCk(rgshbud80.q3BipwRCk, rgshbud80.J4Ux7ym32);
            }
            IXMg0nBBI iXMg0nBBI2 = jwvlsqurp.Eeka1udhb;
            DpXbxvzXm dpXbxvzXm = jwvlsqurp.dXrmkklc8;
            jwvlsqurp.qVUwofr5s = toz92ci5y;
            jwvlsqurp.MzoOEjc4X = iXMg0nBBI2;
            jwvlsqurp.ilHKhw3Yw = 1;
            Object MzoOEjc4X = ((DrTf1eLw4) dpXbxvzXm).MzoOEjc4X(jwvlsqurp);
            if (MzoOEjc4X == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            jwvlsqurp2 = jwvlsqurp;
            obj = MzoOEjc4X;
            toz92ci5y2 = toz92ci5y;
            iXMg0nBBI = iXMg0nBBI2;
            kbkjsqcsl2 = kbkjsqcsl;
            iXMg0nBBI.CBQ5d1kRq = obj;
            jwvlsqurp = jwvlsqurp2;
            kbkjsqcsl = kbkjsqcsl2;
            toz92ci5y = toz92ci5y2;
            obj2 = jwvlsqurp.Eeka1udhb.CBQ5d1kRq;
            if (!(obj2 instanceof UliWfoMkZ)) {
            }
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
