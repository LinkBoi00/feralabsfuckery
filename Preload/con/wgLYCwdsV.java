package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wgLYCwdsV extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ QMwzb19sL qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgLYCwdsV(QMwzb19sL qMwzb19sL, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = qMwzb19sL;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        wgLYCwdsV wglycwdsv = new wgLYCwdsV(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        wglycwdsv.ilHKhw3Yw = (tDmftakZl) obj;
        return wglycwdsv.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        wgLYCwdsV wglycwdsv = new wgLYCwdsV(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        wglycwdsv.ilHKhw3Yw = obj;
        return wglycwdsv;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            QMwzb19sL qMwzb19sL = this.qVUwofr5s;
            qMwzb19sL.J4Ux7ym32 = (tDmftakZl) this.ilHKhw3Yw;
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            if (kkcqgcx5g.WaUP0CF08(qMwzb19sL, this) == kbkjsqcsl) {
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
