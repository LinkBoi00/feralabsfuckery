package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v0EiJ1BC3 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ boolean Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ RqP4RtdHY dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0EiJ1BC3(RNEcgN6dQ rNEcgN6dQ, boolean z, RqP4RtdHY rqP4RtdHY, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = z;
        this.dXrmkklc8 = rqP4RtdHY;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new v0EiJ1BC3(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new v0EiJ1BC3(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        RNEcgN6dQ rNEcgN6dQ;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            UkUxUO2B6 ukUxUO2B6 = (UkUxUO2B6) ((prCJwNx2x) this.qVUwofr5s).getValue();
            if (ukUxUO2B6 != null) {
                boolean z = this.Eeka1udhb;
                RqP4RtdHY rqP4RtdHY = this.dXrmkklc8;
                rNEcgN6dQ = this.qVUwofr5s;
                F7nWKUx7R dk2ill9co = z ? new dK2ILL9CO(ukUxUO2B6) : new E3dAdEow6(ukUxUO2B6);
                if (rqP4RtdHY != null) {
                    this.MzoOEjc4X = rNEcgN6dQ;
                    this.ilHKhw3Yw = 1;
                    if (rqP4RtdHY.q3BipwRCk(dk2ill9co, this) == kbkjsqcsl) {
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
