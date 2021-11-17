package con;
@jHNqfwCVd(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", f = "Focusable.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class jgBWXtNkX extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgBWXtNkX(RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = rqP4RtdHY;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new jgBWXtNkX(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new jgBWXtNkX(this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        RNEcgN6dQ rNEcgN6dQ;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            jWApO2ugs jwapo2ugs = (jWApO2ugs) ((prCJwNx2x) this.qVUwofr5s).getValue();
            if (jwapo2ugs != null) {
                RqP4RtdHY rqP4RtdHY = this.Eeka1udhb;
                rNEcgN6dQ = this.qVUwofr5s;
                fLraXaWgb flraxawgb = new fLraXaWgb(jwapo2ugs);
                if (rqP4RtdHY != null) {
                    this.MzoOEjc4X = rNEcgN6dQ;
                    this.ilHKhw3Yw = 1;
                    if (rqP4RtdHY.q3BipwRCk(flraxawgb, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    rNEcgN6dQ = rNEcgN6dQ;
                }
                ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            rNEcgN6dQ = (RNEcgN6dQ) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
        return qih4lW99W.q3BipwRCk;
    }
}
