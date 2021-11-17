package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class O1GOtf4FK extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ ox3n2YYii qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1GOtf4FK(ox3n2YYii ox3n2yyii, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ox3n2yyii;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        O1GOtf4FK o1GOtf4FK = new O1GOtf4FK(this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        o1GOtf4FK.ilHKhw3Yw = (tDmftakZl) obj;
        return o1GOtf4FK.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        O1GOtf4FK o1GOtf4FK = new O1GOtf4FK(this.qVUwofr5s, this.Eeka1udhb, way959ade);
        o1GOtf4FK.ilHKhw3Yw = obj;
        return o1GOtf4FK;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ((prCJwNx2x) this.qVUwofr5s.dIocxURUo).CBQ5d1kRq(Boolean.TRUE);
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            if (kkcqgcx5g.WaUP0CF08((tDmftakZl) this.ilHKhw3Yw, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((prCJwNx2x) this.qVUwofr5s.dIocxURUo).CBQ5d1kRq(Boolean.FALSE);
        return qih4lW99W.q3BipwRCk;
    }
}
