package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Ocs3Sh7UF extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ NzvP5Rex8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ PmanMZxiM RG6kpfv3v;
    public final /* synthetic */ oQkvjGXIr dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM ixWaw2akD;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;
    public final /* synthetic */ PmanMZxiM sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ocs3Sh7UF(eP3ZpMpES ep3zpmpes, NzvP5Rex8 nzvP5Rex8, oQkvjGXIr oqkvjgxir, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, PmanMZxiM pmanMZxiM3, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = nzvP5Rex8;
        this.dXrmkklc8 = oqkvjgxir;
        this.RG6kpfv3v = pmanMZxiM;
        this.ixWaw2akD = pmanMZxiM2;
        this.sk5s77z6Q = pmanMZxiM3;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((Ocs3Sh7UF) dIocxURUo((xOpkxuRlw) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Ocs3Sh7UF ocs3Sh7UF = new Ocs3Sh7UF(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, way959ade);
        ocs3Sh7UF.ilHKhw3Yw = obj;
        return ocs3Sh7UF;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            zMHRE4Q58 zmhre4q58 = new zMHRE4Q58(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) ((xOpkxuRlw) this.ilHKhw3Yw)).cAwN510t2(zmhre4q58, this) == kbkjsqcsl) {
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
