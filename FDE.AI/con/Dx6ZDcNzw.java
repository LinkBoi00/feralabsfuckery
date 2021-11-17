package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {262}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Dx6ZDcNzw extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ UBY2Inzw8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ njjwS3RZT RG6kpfv3v;
    public final /* synthetic */ UBY2Inzw8 dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ DpXbxvzXm ixWaw2akD;
    public final /* synthetic */ xOpkxuRlw qVUwofr5s;
    public final /* synthetic */ boolean sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dx6ZDcNzw(xOpkxuRlw xopkxurlw, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, njjwS3RZT njjws3rzt, DpXbxvzXm dpXbxvzXm, boolean z, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = xopkxurlw;
        this.Eeka1udhb = uBY2Inzw8;
        this.dXrmkklc8 = uBY2Inzw82;
        this.RG6kpfv3v = njjws3rzt;
        this.ixWaw2akD = dpXbxvzXm;
        this.sk5s77z6Q = z;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((Dx6ZDcNzw) dIocxURUo((oQkvjGXIr) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Dx6ZDcNzw dx6ZDcNzw = new Dx6ZDcNzw(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, way959ade);
        dx6ZDcNzw.ilHKhw3Yw = obj;
        return dx6ZDcNzw;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            xOpkxuRlw xopkxurlw = this.qVUwofr5s;
            eziQ0VHch eziq0vhch = new eziQ0VHch(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, oqkvjgxir, null);
            this.MzoOEjc4X = 1;
            if (syekKyXqd.CBQ5d1kRq(xopkxurlw, eziq0vhch, this) == kbkjsqcsl) {
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
