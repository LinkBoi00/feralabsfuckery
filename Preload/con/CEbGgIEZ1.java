package con;
@jHNqfwCVd(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {406, 409}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CEbGgIEZ1 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ long Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ RNEcgN6dQ RG6kpfv3v;
    public final /* synthetic */ RqP4RtdHY dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CEbGgIEZ1(UBY2Inzw8 uBY2Inzw8, long j, RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = uBY2Inzw8;
        this.Eeka1udhb = j;
        this.dXrmkklc8 = rqP4RtdHY;
        this.RG6kpfv3v = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new CEbGgIEZ1(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new CEbGgIEZ1(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        UkUxUO2B6 ukUxUO2B6;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            if (((Boolean) ((gdEmqfwpT) this.qVUwofr5s.getValue()).GPLPRo6go()).booleanValue()) {
                long j = JW7skuRep.q3BipwRCk;
                this.ilHKhw3Yw = 1;
                if (dnBSj5uJN.Bhmn1KIah(j, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            ukUxUO2B6 = (UkUxUO2B6) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            ((prCJwNx2x) this.RG6kpfv3v).CBQ5d1kRq(ukUxUO2B6);
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UkUxUO2B6 ukUxUO2B62 = new UkUxUO2B6(this.Eeka1udhb, null);
        RqP4RtdHY rqP4RtdHY = this.dXrmkklc8;
        this.MzoOEjc4X = ukUxUO2B62;
        this.ilHKhw3Yw = 2;
        if (rqP4RtdHY.q3BipwRCk(ukUxUO2B62, this) == kbkjsqcsl) {
            return kbkjsqcsl;
        }
        ukUxUO2B6 = ukUxUO2B62;
        ((prCJwNx2x) this.RG6kpfv3v).CBQ5d1kRq(ukUxUO2B6);
        return qih4lW99W.q3BipwRCk;
    }
}
