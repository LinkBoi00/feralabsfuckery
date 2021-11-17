package con;
@jHNqfwCVd(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m4jvGXoDi extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ float Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ SmsTS63dj dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ T3vFETFEI qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4jvGXoDi(T3vFETFEI t3vFETFEI, float f, SmsTS63dj smsTS63dj, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = t3vFETFEI;
        this.Eeka1udhb = f;
        this.dXrmkklc8 = smsTS63dj;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        m4jvGXoDi m4jvgxodi = new m4jvGXoDi(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        m4jvgxodi.ilHKhw3Yw = (uldsWYbnP) obj;
        return m4jvgxodi.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        m4jvGXoDi m4jvgxodi = new m4jvGXoDi(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
        m4jvgxodi.ilHKhw3Yw = obj;
        return m4jvgxodi;
    }

    /* JADX WARN: Finally extract failed */
    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                uldsWYbnP uldswybnp = (uldsWYbnP) this.ilHKhw3Yw;
                sl5e2Y3xY sl5e2y3xy = new sl5e2Y3xY();
                sl5e2y3xy.CBQ5d1kRq = ((Number) ((prCJwNx2x) this.qVUwofr5s.GPLPRo6go).getValue()).floatValue();
                ((prCJwNx2x) this.qVUwofr5s.Puu3Rhg4F).CBQ5d1kRq(new Float(this.Eeka1udhb));
                T3vFETFEI.q3BipwRCk(this.qVUwofr5s, true);
                IxbokG044 q3BipwRCk = iM0DCUL8r.q3BipwRCk(sl5e2y3xy.CBQ5d1kRq, 0.0f, 2);
                Float f = new Float(this.Eeka1udhb);
                SmsTS63dj smsTS63dj = this.dXrmkklc8;
                dMQC97DHs dmqc97dhs = new dMQC97DHs(uldswybnp, sl5e2y3xy);
                this.MzoOEjc4X = 1;
                if (IxbokG044.tGV7Q6urW(q3BipwRCk, f, smsTS63dj, null, dmqc97dhs, this, 4) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            } else if (i == 1) {
                anXlDk6fV.IytU16YUK(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((prCJwNx2x) this.qVUwofr5s.Puu3Rhg4F).CBQ5d1kRq(null);
            T3vFETFEI.q3BipwRCk(this.qVUwofr5s, false);
            return qih4lW99W.q3BipwRCk;
        } catch (Throwable th) {
            ((prCJwNx2x) this.qVUwofr5s.Puu3Rhg4F).CBQ5d1kRq(null);
            T3vFETFEI.q3BipwRCk(this.qVUwofr5s, false);
            throw th;
        }
    }
}
