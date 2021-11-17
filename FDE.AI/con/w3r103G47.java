package con;
@jHNqfwCVd(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w3r103G47 extends dnd1L2J2K implements NzvP5Rex8 {
    public final /* synthetic */ boolean Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ RNEcgN6dQ RG6kpfv3v;
    public final /* synthetic */ RqP4RtdHY dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public /* synthetic */ long qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3r103G47(boolean z, RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, UBY2Inzw8 uBY2Inzw8, Way959ade way959ade) {
        super(3, way959ade);
        this.Eeka1udhb = z;
        this.dXrmkklc8 = rqP4RtdHY;
        this.RG6kpfv3v = rNEcgN6dQ;
        this.ixWaw2akD = uBY2Inzw8;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        long j = ((bRgfgYIQX) obj2).q3BipwRCk;
        w3r103G47 w3r103g47 = new w3r103G47(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj3);
        w3r103g47.ilHKhw3Yw = (eP3ZpMpES) obj;
        w3r103g47.qVUwofr5s = j;
        return w3r103g47.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            eP3ZpMpES ep3zpmpes = (eP3ZpMpES) this.ilHKhw3Yw;
            long j = this.qVUwofr5s;
            if (this.Eeka1udhb) {
                RqP4RtdHY rqP4RtdHY = this.dXrmkklc8;
                RNEcgN6dQ rNEcgN6dQ = this.RG6kpfv3v;
                UBY2Inzw8 uBY2Inzw8 = this.ixWaw2akD;
                this.MzoOEjc4X = 1;
                if (syekKyXqd.Bhmn1KIah(ep3zpmpes, j, rqP4RtdHY, rNEcgN6dQ, uBY2Inzw8, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
