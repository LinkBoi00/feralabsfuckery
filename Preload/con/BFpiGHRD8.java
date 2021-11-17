package con;
@jHNqfwCVd(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BFpiGHRD8 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ UBY2Inzw8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 dXrmkklc8;
    public final /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ IxbokG044 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BFpiGHRD8(Object obj, IxbokG044 ixbokG044, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = obj;
        this.qVUwofr5s = ixbokG044;
        this.Eeka1udhb = uBY2Inzw8;
        this.dXrmkklc8 = uBY2Inzw82;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new BFpiGHRD8(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new BFpiGHRD8(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            if (!anXlDk6fV.tGV7Q6urW(this.ilHKhw3Yw, this.qVUwofr5s.kCA6Zs9sL())) {
                IxbokG044 ixbokG044 = this.qVUwofr5s;
                Object obj2 = this.ilHKhw3Yw;
                UBY2Inzw8 uBY2Inzw8 = this.Eeka1udhb;
                O0hQm6WVz o0hQm6WVz = y2KA9qgKw.q3BipwRCk;
                this.MzoOEjc4X = 1;
                if (IxbokG044.tGV7Q6urW(ixbokG044, obj2, (SmsTS63dj) uBY2Inzw8.getValue(), null, null, this, 12) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UBY2Inzw8 uBY2Inzw82 = this.dXrmkklc8;
        O0hQm6WVz o0hQm6WVz2 = y2KA9qgKw.q3BipwRCk;
        PmanMZxiM pmanMZxiM = (PmanMZxiM) uBY2Inzw82.getValue();
        if (pmanMZxiM != null) {
            pmanMZxiM.IytU16YUK(this.qVUwofr5s.iiGwOFFnr());
        }
        return qih4lW99W.q3BipwRCk;
    }
}
