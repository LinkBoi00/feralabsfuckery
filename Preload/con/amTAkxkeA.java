package con;
@jHNqfwCVd(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$3$2", f = "LazySemantics.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class amTAkxkeA extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ cnnoFa4Tx ilHKhw3Yw;
    public final /* synthetic */ int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amTAkxkeA(cnnoFa4Tx cnnofa4tx, int i, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = cnnofa4tx;
        this.qVUwofr5s = i;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new amTAkxkeA(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new amTAkxkeA(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            cnnoFa4Tx cnnofa4tx = this.ilHKhw3Yw;
            int i2 = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            Object obj3 = cnnofa4tx.kCA6Zs9sL.J4Ux7ym32((r4 & 1) != 0 ? s1x258HRp.Default : null, new uKoz5OxWK(cnnofa4tx, i2, 0, null), this);
            if (obj3 != obj2) {
                obj3 = qih4lW99W.q3BipwRCk;
            }
            if (obj3 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
