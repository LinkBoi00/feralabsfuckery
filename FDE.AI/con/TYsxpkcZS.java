package con;
@jHNqfwCVd(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {284, 286}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TYsxpkcZS extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ float Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ float dXrmkklc8;
    public final /* synthetic */ boolean ilHKhw3Yw;
    public final /* synthetic */ yGEA2YLT7 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TYsxpkcZS(boolean z, yGEA2YLT7 ygea2ylt7, float f, float f2, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = z;
        this.qVUwofr5s = ygea2ylt7;
        this.Eeka1udhb = f;
        this.dXrmkklc8 = f2;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new TYsxpkcZS(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new TYsxpkcZS(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            if (this.ilHKhw3Yw) {
                yGEA2YLT7 ygea2ylt7 = this.qVUwofr5s;
                float f = this.Eeka1udhb;
                this.MzoOEjc4X = 1;
                if (xP6F5SR9v.oon79WMrY(ygea2ylt7, f, null, this, 2) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            } else {
                yGEA2YLT7 ygea2ylt72 = this.qVUwofr5s;
                float f2 = this.dXrmkklc8;
                this.MzoOEjc4X = 2;
                if (xP6F5SR9v.oon79WMrY(ygea2ylt72, f2, null, this, 2) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
        } else if (i == 1 || i == 2) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
