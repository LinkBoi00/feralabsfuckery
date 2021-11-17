package con;
@jHNqfwCVd(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lgGS4qhC8 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ jQiuvL5NS Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ KnVJFSivd qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgGS4qhC8(KnVJFSivd knVJFSivd, jQiuvL5NS jqiuvl5ns, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = knVJFSivd;
        this.Eeka1udhb = jqiuvl5ns;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        lgGS4qhC8 lggs4qhc8 = new lgGS4qhC8(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        lggs4qhc8.ilHKhw3Yw = (oQkvjGXIr) obj;
        return lggs4qhc8.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        lgGS4qhC8 lggs4qhc8 = new lgGS4qhC8(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        lggs4qhc8.ilHKhw3Yw = obj;
        return lggs4qhc8;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            StKB0Hl3H stKB0Hl3H = ((RqP4RtdHY) this.qVUwofr5s).q3BipwRCk;
            Vf7VAKj3F vf7VAKj3F = new Vf7VAKj3F(this.Eeka1udhb, (oQkvjGXIr) this.ilHKhw3Yw);
            this.MzoOEjc4X = 1;
            if (stKB0Hl3H.tGV7Q6urW(vf7VAKj3F, this) == kbkjsqcsl) {
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
