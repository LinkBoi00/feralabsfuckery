package con;
@jHNqfwCVd(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", f = "SuspendingPointerInputFilter.kt", l = {286}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class iWAHHrS4Z extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ ztvmwA530 dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ ztvmwA530 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iWAHHrS4Z(ztvmwA530 ztvmwa530, kkcQgCx5G kkcqgcx5g, ztvmwA530 ztvmwa5302, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ztvmwa530;
        this.Eeka1udhb = kkcqgcx5g;
        this.dXrmkklc8 = ztvmwa5302;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        iWAHHrS4Z iwahhrs4z = new iWAHHrS4Z(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        iwahhrs4z.ilHKhw3Yw = (oQkvjGXIr) obj;
        return iwahhrs4z.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        iWAHHrS4Z iwahhrs4z = new iWAHHrS4Z(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
        iwahhrs4z.ilHKhw3Yw = obj;
        return iwahhrs4z;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.qVUwofr5s.dXrmkklc8 = (oQkvjGXIr) this.ilHKhw3Yw;
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
            ztvmwA530 ztvmwa530 = this.dXrmkklc8;
            this.MzoOEjc4X = 1;
            if (kkcqgcx5g.WaUP0CF08(ztvmwa530, this) == kbkjsqcsl) {
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
