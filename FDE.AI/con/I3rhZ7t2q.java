package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {466}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class I3rhZ7t2q extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ qbiNIYS53 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3rhZ7t2q(qbiNIYS53 qbiniys53, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = qbiniys53;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        I3rhZ7t2q i3rhZ7t2q = new I3rhZ7t2q(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        i3rhZ7t2q.ilHKhw3Yw = (uldsWYbnP) obj;
        return i3rhZ7t2q.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        I3rhZ7t2q i3rhZ7t2q = new I3rhZ7t2q(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        i3rhZ7t2q.ilHKhw3Yw = obj;
        return i3rhZ7t2q;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            qbiNIYS53 qbiniys53 = this.qVUwofr5s;
            qbiniys53.J4Ux7ym32 = (uldsWYbnP) this.ilHKhw3Yw;
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            if (kkcqgcx5g.WaUP0CF08(qbiniys53, this) == kbkjsqcsl) {
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
