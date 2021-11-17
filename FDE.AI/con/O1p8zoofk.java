package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class O1p8zoofk extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ xOpkxuRlw Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ PmanMZxiM RG6kpfv3v;
    public final /* synthetic */ NzvP5Rex8 dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1p8zoofk(eP3ZpMpES ep3zpmpes, xOpkxuRlw xopkxurlw, NzvP5Rex8 nzvP5Rex8, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = xopkxurlw;
        this.dXrmkklc8 = nzvP5Rex8;
        this.RG6kpfv3v = pmanMZxiM;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        O1p8zoofk o1p8zoofk = new O1p8zoofk(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        o1p8zoofk.ilHKhw3Yw = (oQkvjGXIr) obj;
        return o1p8zoofk.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        O1p8zoofk o1p8zoofk = new O1p8zoofk(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        o1p8zoofk.ilHKhw3Yw = obj;
        return o1p8zoofk;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            this.qVUwofr5s.kCA6Zs9sL();
            xOpkxuRlw xopkxurlw = this.Eeka1udhb;
            Jq0ha9rVu jq0ha9rVu = new Jq0ha9rVu(this.dXrmkklc8, oqkvjgxir, this.qVUwofr5s, this.RG6kpfv3v, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) xopkxurlw).cAwN510t2(jq0ha9rVu, this) == kbkjsqcsl) {
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
