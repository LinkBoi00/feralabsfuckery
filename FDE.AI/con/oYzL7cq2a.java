package con;
@jHNqfwCVd(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class oYzL7cq2a extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ DpySBRZvw ilHKhw3Yw;
    public final /* synthetic */ SmsTS63dj qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oYzL7cq2a(DpySBRZvw dpySBRZvw, SmsTS63dj smsTS63dj, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = dpySBRZvw;
        this.qVUwofr5s = smsTS63dj;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new oYzL7cq2a(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new oYzL7cq2a(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            IxbokG044 ixbokG044 = this.ilHKhw3Yw.tGV7Q6urW;
            Float f = new Float(0.0f);
            SmsTS63dj smsTS63dj = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            if (IxbokG044.tGV7Q6urW(ixbokG044, f, smsTS63dj, null, null, this, 12) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
