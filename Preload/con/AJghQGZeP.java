package con;
@jHNqfwCVd(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AJghQGZeP extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ SmsTS63dj Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ IxbokG044 ilHKhw3Yw;
    public final /* synthetic */ boolean qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJghQGZeP(IxbokG044 ixbokG044, boolean z, SmsTS63dj smsTS63dj, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ixbokG044;
        this.qVUwofr5s = z;
        this.Eeka1udhb = smsTS63dj;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new AJghQGZeP(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new AJghQGZeP(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            IxbokG044 ixbokG044 = this.ilHKhw3Yw;
            Float f = new Float(this.qVUwofr5s ? 1.0f : 0.8f);
            SmsTS63dj smsTS63dj = this.Eeka1udhb;
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
