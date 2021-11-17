package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class eziQ0VHch extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ UBY2Inzw8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ DpXbxvzXm RG6kpfv3v;
    public final /* synthetic */ njjwS3RZT dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ boolean ixWaw2akD;
    public final /* synthetic */ UBY2Inzw8 qVUwofr5s;
    public final /* synthetic */ oQkvjGXIr sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eziQ0VHch(UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, njjwS3RZT njjws3rzt, DpXbxvzXm dpXbxvzXm, boolean z, oQkvjGXIr oqkvjgxir, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = uBY2Inzw8;
        this.Eeka1udhb = uBY2Inzw82;
        this.dXrmkklc8 = njjws3rzt;
        this.RG6kpfv3v = dpXbxvzXm;
        this.ixWaw2akD = z;
        this.sk5s77z6Q = oqkvjgxir;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((eziQ0VHch) dIocxURUo((xOpkxuRlw) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        eziQ0VHch eziq0vhch = new eziQ0VHch(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, way959ade);
        eziq0vhch.ilHKhw3Yw = obj;
        return eziq0vhch;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YESWyft9s yESWyft9s = new YESWyft9s(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) ((xOpkxuRlw) this.ilHKhw3Yw)).cAwN510t2(yESWyft9s, this) == kbkjsqcsl) {
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
