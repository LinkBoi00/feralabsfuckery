package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class gOT6iHysp extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ long Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ RqP4RtdHY dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gOT6iHysp(RNEcgN6dQ rNEcgN6dQ, long j, RqP4RtdHY rqP4RtdHY, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = j;
        this.dXrmkklc8 = rqP4RtdHY;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new gOT6iHysp(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new gOT6iHysp(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        UkUxUO2B6 ukUxUO2B6;
        RqP4RtdHY rqP4RtdHY;
        RNEcgN6dQ rNEcgN6dQ;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            UkUxUO2B6 ukUxUO2B62 = (UkUxUO2B6) ((prCJwNx2x) this.qVUwofr5s).getValue();
            if (ukUxUO2B62 != null) {
                RqP4RtdHY rqP4RtdHY2 = this.dXrmkklc8;
                rNEcgN6dQ = this.qVUwofr5s;
                E3dAdEow6 e3dAdEow6 = new E3dAdEow6(ukUxUO2B62);
                if (rqP4RtdHY2 != null) {
                    this.MzoOEjc4X = rNEcgN6dQ;
                    this.ilHKhw3Yw = 1;
                    if (rqP4RtdHY2.q3BipwRCk(e3dAdEow6, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    rNEcgN6dQ = rNEcgN6dQ;
                }
                ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
            }
            ukUxUO2B6 = new UkUxUO2B6(this.Eeka1udhb, null);
            rqP4RtdHY = this.dXrmkklc8;
            if (rqP4RtdHY != null) {
                this.MzoOEjc4X = ukUxUO2B6;
                this.ilHKhw3Yw = 2;
                if (rqP4RtdHY.q3BipwRCk(ukUxUO2B6, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                ukUxUO2B6 = ukUxUO2B6;
            }
            ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(ukUxUO2B6);
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            rNEcgN6dQ = (RNEcgN6dQ) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            ukUxUO2B6 = (UkUxUO2B6) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(ukUxUO2B6);
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
        ukUxUO2B6 = new UkUxUO2B6(this.Eeka1udhb, null);
        rqP4RtdHY = this.dXrmkklc8;
        if (rqP4RtdHY != null) {
        }
        ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(ukUxUO2B6);
        return qih4lW99W.q3BipwRCk;
    }
}
