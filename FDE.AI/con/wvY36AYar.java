package con;
@jHNqfwCVd(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wvY36AYar extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ boolean ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvY36AYar(boolean z, RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = z;
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = rqP4RtdHY;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new wvY36AYar(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new wvY36AYar(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            if (!this.ilHKhw3Yw) {
                RNEcgN6dQ rNEcgN6dQ = this.qVUwofr5s;
                RqP4RtdHY rqP4RtdHY = this.Eeka1udhb;
                this.MzoOEjc4X = 1;
                if (wnsMyABxC.J4Ux7ym32(rNEcgN6dQ, rqP4RtdHY, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
