package con;
@jHNqfwCVd(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {682}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y8BpyylDX extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ Kh7ffW4RH Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ NzvP5Rex8 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8BpyylDX(NzvP5Rex8 nzvP5Rex8, Kh7ffW4RH kh7ffW4RH, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = nzvP5Rex8;
        this.Eeka1udhb = kh7ffW4RH;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        y8BpyylDX y8bpyyldx = new y8BpyylDX(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        y8bpyyldx.ilHKhw3Yw = (oQkvjGXIr) obj;
        return y8bpyyldx.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        y8BpyylDX y8bpyyldx = new y8BpyylDX(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        y8bpyyldx.ilHKhw3Yw = obj;
        return y8bpyyldx;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            NzvP5Rex8 nzvP5Rex8 = this.qVUwofr5s;
            Kh7ffW4RH kh7ffW4RH = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            if (nzvP5Rex8.sk5s77z6Q((oQkvjGXIr) this.ilHKhw3Yw, kh7ffW4RH, this) == kbkjsqcsl) {
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
