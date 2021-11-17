package con;
@jHNqfwCVd(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {256}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wA2rY4bnw extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ ztvmwA530 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wA2rY4bnw(ztvmwA530 ztvmwa530, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ztvmwa530;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        wA2rY4bnw wa2ry4bnw = new wA2rY4bnw(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        wa2ry4bnw.ilHKhw3Yw = (oQkvjGXIr) obj;
        return wa2ry4bnw.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        wA2rY4bnw wa2ry4bnw = new wA2rY4bnw(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        wa2ry4bnw.ilHKhw3Yw = obj;
        return wa2ry4bnw;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ztvmwA530 ztvmwa530 = this.qVUwofr5s;
            ztvmwa530.dXrmkklc8 = (oQkvjGXIr) this.ilHKhw3Yw;
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
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
