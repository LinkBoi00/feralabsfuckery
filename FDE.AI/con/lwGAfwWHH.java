package con;
@jHNqfwCVd(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lwGAfwWHH extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ T3vFETFEI ilHKhw3Yw;
    public final /* synthetic */ float qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwGAfwWHH(T3vFETFEI t3vFETFEI, float f, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = t3vFETFEI;
        this.qVUwofr5s = f;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new lwGAfwWHH(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new lwGAfwWHH(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            T3vFETFEI t3vFETFEI = this.ilHKhw3Yw;
            float f = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            Object tGV7Q6urW = t3vFETFEI.oon79WMrY.tGV7Q6urW(new zJTU8cRRg(t3vFETFEI, f), this);
            if (tGV7Q6urW != kbkjsqcsl) {
                tGV7Q6urW = qih4lW99W.q3BipwRCk;
            }
            if (tGV7Q6urW == kbkjsqcsl) {
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
