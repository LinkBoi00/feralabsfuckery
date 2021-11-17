package con;
@jHNqfwCVd(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FHlCKcT1G extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ UkUxUO2B6 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ NS7oquKVI ilHKhw3Yw;
    public final /* synthetic */ LHzDrh0CU qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FHlCKcT1G(NS7oquKVI nS7oquKVI, LHzDrh0CU lHzDrh0CU, UkUxUO2B6 ukUxUO2B6, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = nS7oquKVI;
        this.qVUwofr5s = lHzDrh0CU;
        this.Eeka1udhb = ukUxUO2B6;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new FHlCKcT1G(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new FHlCKcT1G(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    /* JADX WARN: Finally extract failed */
    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                NS7oquKVI nS7oquKVI = this.ilHKhw3Yw;
                this.MzoOEjc4X = 1;
                if (nS7oquKVI.q3BipwRCk(this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            } else if (i == 1) {
                anXlDk6fV.IytU16YUK(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.qVUwofr5s.ilHKhw3Yw.remove(this.Eeka1udhb);
            return qih4lW99W.q3BipwRCk;
        } catch (Throwable th) {
            this.qVUwofr5s.ilHKhw3Yw.remove(this.Eeka1udhb);
            throw th;
        }
    }
}
