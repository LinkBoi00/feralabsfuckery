package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wKgFMR8wZ extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ ox3n2YYii ilHKhw3Yw;
    public final /* synthetic */ s1x258HRp qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wKgFMR8wZ(ox3n2YYii ox3n2yyii, s1x258HRp s1x258hrp, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ox3n2yyii;
        this.qVUwofr5s = s1x258hrp;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new wKgFMR8wZ(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new wKgFMR8wZ(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ox3n2YYii ox3n2yyii = this.ilHKhw3Yw;
            YbqT9SvuP ybqT9SvuP = ox3n2yyii.tGV7Q6urW;
            tDmftakZl tdmftakzl = ox3n2yyii.J4Ux7ym32;
            s1x258HRp s1x258hrp = this.qVUwofr5s;
            O1GOtf4FK o1GOtf4FK = new O1GOtf4FK(ox3n2yyii, this.Eeka1udhb, null);
            this.MzoOEjc4X = 1;
            if (ybqT9SvuP.q3BipwRCk(tdmftakzl, s1x258hrp, o1GOtf4FK, this) == kbkjsqcsl) {
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
