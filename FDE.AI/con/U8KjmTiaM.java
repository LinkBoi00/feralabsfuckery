package con;
@jHNqfwCVd(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1", f = "FloatingActionButton.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class U8KjmTiaM extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ KnVJFSivd ilHKhw3Yw;
    public final /* synthetic */ fhHgxp0FC qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8KjmTiaM(KnVJFSivd knVJFSivd, fhHgxp0FC fhhgxp0fc, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = knVJFSivd;
        this.qVUwofr5s = fhhgxp0fc;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new U8KjmTiaM(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new U8KjmTiaM(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            StKB0Hl3H stKB0Hl3H = ((RqP4RtdHY) this.ilHKhw3Yw).q3BipwRCk;
            fYAiT3YXw fyait3yxw = new fYAiT3YXw(this.qVUwofr5s, 1);
            this.MzoOEjc4X = 1;
            if (stKB0Hl3H.tGV7Q6urW(fyait3yxw, this) == kbkjsqcsl) {
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
