package con;
@jHNqfwCVd(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PV6ucsxpW extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 RG6kpfv3v;
    public final /* synthetic */ RNEcgN6dQ dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public final /* synthetic */ boolean qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PV6ucsxpW(boolean z, RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = z;
        this.Eeka1udhb = rqP4RtdHY;
        this.dXrmkklc8 = rNEcgN6dQ;
        this.RG6kpfv3v = uBY2Inzw8;
        this.ixWaw2akD = uBY2Inzw82;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((PV6ucsxpW) dIocxURUo((xOpkxuRlw) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        PV6ucsxpW pV6ucsxpW = new PV6ucsxpW(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
        pV6ucsxpW.ilHKhw3Yw = obj;
        return pV6ucsxpW;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            w3r103G47 w3r103g47 = new w3r103G47(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, null);
            yqhTRZjLg yqhtrzjlg = new yqhTRZjLg(this.qVUwofr5s, this.ixWaw2akD, 0);
            this.MzoOEjc4X = 1;
            if (fpplAiKys.dIocxURUo((xOpkxuRlw) this.ilHKhw3Yw, w3r103g47, yqhtrzjlg, this) == kbkjsqcsl) {
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
