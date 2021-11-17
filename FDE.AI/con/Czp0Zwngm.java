package con;
@jHNqfwCVd(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$2$1", f = "LazySemantics.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Czp0Zwngm extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ cnnoFa4Tx ilHKhw3Yw;
    public final /* synthetic */ float qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Czp0Zwngm(cnnoFa4Tx cnnofa4tx, float f, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = cnnofa4tx;
        this.qVUwofr5s = f;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Czp0Zwngm(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Czp0Zwngm(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            cnnoFa4Tx cnnofa4tx = this.ilHKhw3Yw;
            float f = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            if (xP6F5SR9v.oon79WMrY(cnnofa4tx, f, null, this, 2) == kbkjsqcsl) {
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
