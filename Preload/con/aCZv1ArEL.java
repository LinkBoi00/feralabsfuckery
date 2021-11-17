package con;
@jHNqfwCVd(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", l = {102, 106, 108}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aCZv1ArEL extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ nHAI4XIti dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aCZv1ArEL(RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, nHAI4XIti nhai4xiti, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = rqP4RtdHY;
        this.dXrmkklc8 = nhai4xiti;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new aCZv1ArEL(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new aCZv1ArEL(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        jWApO2ugs jwapo2ugs;
        nHAI4XIti nhai4xiti;
        RqP4RtdHY rqP4RtdHY;
        RNEcgN6dQ rNEcgN6dQ;
        RNEcgN6dQ rNEcgN6dQ2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            jWApO2ugs jwapo2ugs2 = (jWApO2ugs) ((prCJwNx2x) this.qVUwofr5s).getValue();
            if (jwapo2ugs2 != null) {
                RqP4RtdHY rqP4RtdHY2 = this.Eeka1udhb;
                rNEcgN6dQ = this.qVUwofr5s;
                fLraXaWgb flraxawgb = new fLraXaWgb(jwapo2ugs2);
                if (rqP4RtdHY2 != null) {
                    this.MzoOEjc4X = rNEcgN6dQ;
                    this.ilHKhw3Yw = 1;
                    if (rqP4RtdHY2.q3BipwRCk(flraxawgb, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    rNEcgN6dQ2 = rNEcgN6dQ;
                }
                ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
            }
            jwapo2ugs = new jWApO2ugs();
            rqP4RtdHY = this.Eeka1udhb;
            if (rqP4RtdHY != null) {
                this.MzoOEjc4X = jwapo2ugs;
                this.ilHKhw3Yw = 2;
                if (rqP4RtdHY.q3BipwRCk(jwapo2ugs, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(jwapo2ugs);
            nhai4xiti = this.dXrmkklc8;
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 3;
            if (((VyqlGpAAE) nhai4xiti).q3BipwRCk(null, this) == kbkjsqcsl) {
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            rNEcgN6dQ2 = (RNEcgN6dQ) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            jwapo2ugs = (jWApO2ugs) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(jwapo2ugs);
            nhai4xiti = this.dXrmkklc8;
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 3;
            if (((VyqlGpAAE) nhai4xiti).q3BipwRCk(null, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 3) {
            anXlDk6fV.IytU16YUK(obj);
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rNEcgN6dQ = rNEcgN6dQ2;
        ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(null);
        jwapo2ugs = new jWApO2ugs();
        rqP4RtdHY = this.Eeka1udhb;
        if (rqP4RtdHY != null) {
        }
        ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(jwapo2ugs);
        nhai4xiti = this.dXrmkklc8;
        this.MzoOEjc4X = null;
        this.ilHKhw3Yw = 3;
        if (((VyqlGpAAE) nhai4xiti).q3BipwRCk(null, this) == kbkjsqcsl) {
        }
        return qih4lW99W.q3BipwRCk;
    }
}
