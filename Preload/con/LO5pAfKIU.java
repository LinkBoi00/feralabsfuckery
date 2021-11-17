package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LO5pAfKIU extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ NzvP5Rex8 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ PmanMZxiM dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LO5pAfKIU(eP3ZpMpES ep3zpmpes, NzvP5Rex8 nzvP5Rex8, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = nzvP5Rex8;
        this.dXrmkklc8 = pmanMZxiM;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        LO5pAfKIU lO5pAfKIU = new LO5pAfKIU(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        lO5pAfKIU.ilHKhw3Yw = (xOpkxuRlw) obj;
        return lO5pAfKIU.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        LO5pAfKIU lO5pAfKIU = new LO5pAfKIU(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
        lO5pAfKIU.ilHKhw3Yw = obj;
        return lO5pAfKIU;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            O1p8zoofk o1p8zoofk = new O1p8zoofk(this.qVUwofr5s, (xOpkxuRlw) this.ilHKhw3Yw, this.Eeka1udhb, this.dXrmkklc8, null);
            this.MzoOEjc4X = 1;
            if (D3DEikrvb.yWvV4ePLl(o1p8zoofk, this) == kbkjsqcsl) {
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
