package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {415}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Ro9etXXkM extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ ss6mC2y0y ilHKhw3Yw;
    public final /* synthetic */ s1x258HRp qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ro9etXXkM(ss6mC2y0y ss6mc2y0y, s1x258HRp s1x258hrp, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ss6mc2y0y;
        this.qVUwofr5s = s1x258hrp;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Ro9etXXkM(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Ro9etXXkM(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ss6mC2y0y ss6mc2y0y = this.ilHKhw3Yw;
            YbqT9SvuP ybqT9SvuP = ss6mc2y0y.tGV7Q6urW;
            uldsWYbnP uldswybnp = ss6mc2y0y.J4Ux7ym32;
            s1x258HRp s1x258hrp = this.qVUwofr5s;
            kkcQgCx5G kkcqgcx5g = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            if (ybqT9SvuP.q3BipwRCk(uldswybnp, s1x258hrp, kkcqgcx5g, this) == kbkjsqcsl) {
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
