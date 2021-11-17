package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UM1r9Nyxr extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ NzvP5Rex8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ PmanMZxiM RG6kpfv3v;
    public final /* synthetic */ PmanMZxiM dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM ixWaw2akD;
    public final /* synthetic */ xOpkxuRlw qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM1r9Nyxr(xOpkxuRlw xopkxurlw, NzvP5Rex8 nzvP5Rex8, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, PmanMZxiM pmanMZxiM3, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = xopkxurlw;
        this.Eeka1udhb = nzvP5Rex8;
        this.dXrmkklc8 = pmanMZxiM;
        this.RG6kpfv3v = pmanMZxiM2;
        this.ixWaw2akD = pmanMZxiM3;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((UM1r9Nyxr) dIocxURUo((oQkvjGXIr) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        UM1r9Nyxr uM1r9Nyxr = new UM1r9Nyxr(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
        uM1r9Nyxr.ilHKhw3Yw = obj;
        return uM1r9Nyxr;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            eP3ZpMpES ep3zpmpes = new eP3ZpMpES(this.qVUwofr5s);
            xOpkxuRlw xopkxurlw = this.qVUwofr5s;
            Ocs3Sh7UF ocs3Sh7UF = new Ocs3Sh7UF(ep3zpmpes, this.Eeka1udhb, oqkvjgxir, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, null);
            this.MzoOEjc4X = 1;
            if (syekKyXqd.CBQ5d1kRq(xopkxurlw, ocs3Sh7UF, this) == kbkjsqcsl) {
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
